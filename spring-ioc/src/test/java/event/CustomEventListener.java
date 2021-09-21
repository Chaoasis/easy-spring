package event;

import context.event.ApplicationListener;

import java.time.LocalTime;

public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + LocalTime.now());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }

}
