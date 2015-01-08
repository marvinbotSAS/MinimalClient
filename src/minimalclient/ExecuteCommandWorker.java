/*
 * Copyright (C) 2015 Marvinbot S.A.S
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package minimalclient;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mARC.Connector.Connector;
/**
 *
 * @author patrice
 */
public class ExecuteCommandWorker extends javax.swing.SwingWorker<Void,Void> {
    
    MainFrame _frame;
    Connector connector;
    String logMsg;

    String Action;
    String[] params;

    String script;
    ArrayList<String[]> names;
    ArrayList<String[][]> columns;
    public ExecuteCommandWorker()
    {
        this.names = new ArrayList<>();
        this.columns = new ArrayList<>();
        Action = "none";
        logMsg = "";
    }
    @Override
    protected Void doInBackground() throws Exception
    {

        
        switch (Action) 
        {
            case "ExecuteCommand":
                connector.directExecute = true;
                connector.openScript(null);
                for (String s:params)
                {
                    if ( s!=null && !s.isEmpty())
                    {
                        connector.push(s);
                    }
                }   
                connector.addFunction();
                connector.executeScript();
                break;
            case "ExecuteScript":
                connector.executeCommand(script);
                break;
        }
        return null;
    }
    
    @Override
    protected void done() 
    {
        try {
            Void result = get();
            _frame.updateLog(connector.getReceived());
            _frame.updateCommandSentLog(connector.RawScript);
            
            // on recupere la reponse serveur sous forme de tableau
            int m = 0;
            for (Object _line : connector.result._lines) 
            {
                ArrayList<String> l = (ArrayList<String> ) connector.result._names.get(m);
                String[] tmp = new String[l.size()];
                tmp = l.toArray(tmp);
                names.add(tmp);
                String[][] cols = new String[tmp.length][(int) connector.result._columns.get(m) ];
                int k = 0;
                if ( tmp.length != 0 )
                {
                    for (String s : tmp )
                    {
                        cols[k++] = connector.getDataByName(s, 0);
                    }
                }
                columns.add(cols);
            }
            _frame.GetResult(names,columns);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecuteCommandWorker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(ExecuteCommandWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
