package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hello {
    private String data;

    public Hello(String data) {
        this.data = data;
    }

    public static Hello make(String data) {
        return new Hello(data);
    }
}
