
package stepcounter.view;

import java.time.LocalDateTime;
import stepcounter.model.Scale;
import stepcounter.model.Step;

public interface StepLoader {
    
    Step load (LocalDateTime dateTime, Scale scale);
    
}
