/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    String[] names;
    String[][]  columns;
    public ExecuteCommandWorker()
    {
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
            ArrayList<String> l = (ArrayList<String> ) connector.result._names.get(0);
            names = new String[l.size()];
            names = l.toArray(names);

            columns = new String[names.length][(int) connector.result._columns.get(0) ];
            int i = 0;
            if ( names != null )
            {
                for (String s : names )
                {
                    columns[i++] = connector.getDataByName(s, 0);
                }
            }
            _frame.GetResult(names,columns);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecuteCommandWorker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(ExecuteCommandWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
