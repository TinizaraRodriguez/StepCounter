
package stepcounter.control;

import stepcounter.model.Step;
import stepcounter.view.StepLogger;
import stepcounter.view.StepStore;


public class MonitorStepCommand implements Command{
    private final StepLogger logger;
    private final StepStore store;
    
    public MonitorStepCommand (StepLogger logger, StepStore store){
        this.logger = logger;
        this.logger.on (stepDetection());
        this.store = store;
    }

    @Override
    public void execute() {
        
    }
    
    private StepLogger.StepDetection stepDetection() {
        return new StepLogger.StepDetection(){
            @Override
            public void detected(Step step){
                store.store(step);
            }
        };
        
    }
    
}
