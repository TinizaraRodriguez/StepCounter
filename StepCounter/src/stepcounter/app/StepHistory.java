
package stepcounter.app;

import java.time.LocalDateTime;
import stepcounter.model.Scale;
import stepcounter.model.Step;
import stepcounter.view.StepLoader;
import stepcounter.view.StepStore;


public class StepHistory implements StepStore, StepLoader{

    @Override
    public void store(Step step) {
        
    }

    @Override
    public Step load(LocalDateTime dateTime, Scale scale) {
        
    }
    
}
