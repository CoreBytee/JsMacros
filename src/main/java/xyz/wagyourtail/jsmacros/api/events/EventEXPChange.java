package xyz.wagyourtail.jsmacros.api.events;

import xyz.wagyourtail.jsmacros.api.sharedinterfaces.IEvent;

/**
 * @author Wagyourtail
 * @since 1.2.7
 */
public class EventEXPChange implements IEvent {
    public final float progress;
    public final int total;
    public final int level;
    
    public EventEXPChange(float progress, int total, int level) {
        this.progress = progress;
        this.total = total;
        this.level = level;
        
        profile.triggerMacro(this);
    }
    
    public String toString() {
        return String.format("%s:{\"total\": %d}", this.getEventName(), total);
    }
}