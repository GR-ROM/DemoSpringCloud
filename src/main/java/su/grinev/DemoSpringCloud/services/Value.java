package su.grinev.DemoSpringCloud.services;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Value {

    private AtomicInteger value;

    public void addValue(int value) {
        System.out.println(""+this.value.addAndGet(value));
    }

    public int getValue(){
        return this.value.intValue();
    }

    public Value() {
        this.value=new AtomicInteger(0);

    }
}
