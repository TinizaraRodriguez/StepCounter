
package stepcounter.view;

import stepcounter.model.Step;


public interface StepLogger {
    
void on(StepDetection stepDetection);
    
    public interface StepDetection{
        void detected (Step step);
        
    }
}
