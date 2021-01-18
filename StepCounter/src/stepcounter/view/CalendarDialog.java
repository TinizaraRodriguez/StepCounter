
package stepcounter.view;

import java.time.LocalDateTime;
import stepcounter.model.Scale;

public interface CalendarDialog {
    
    void execute();
    LocalDateTime dateTime();
    Scale scale();
    
}
