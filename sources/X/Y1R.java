package X;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Y1R implements Serializable {
    public static Map A01 = new ConcurrentHashMap();
    public final Y1O A00;

    public Y1R(Y1O y1o) {
        this.A00 = y1o;
    }
}
