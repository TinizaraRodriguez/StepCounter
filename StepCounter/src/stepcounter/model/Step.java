
package stepcounter.model;

import java.time.LocalDateTime;

public class Step {
    private final LocalDateTime dateTime;
    private final Scale scale;
    private final int count;
    
    public Step(LocalDateTime dateTime, Scale scale, int count){
        this.dateTime = dateTime;
        this.scale = scale;
        this.count = count;
        
    }
    
    public LocalDateTime getDateTime(){
        return dateTime;
    }
    
    public Scale getScale(){
        return scale;
    }
    
    public int getCount(){
        return count;
    }
    
}
