package context.event;

import java.util.EventListener;

/**
 * 需要实现的方法
 *
 * @param <E>
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}