package X;

import java.util.Collections;
import java.util.Map;

public enum RFZ {
    CONNECT(1),
    CONNACK(2),
    PUBLISH(3),
    PUBACK(4),
    PUBREC(5),
    PUBREL(6),
    PUBCOMP(7),
    SUBSCRIBE(8),
    SUBACK(9),
    UNSUBSCRIBE(10),
    UNSUBACK(11),
    PINGREQ(12),
    PINGRESP(13);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        A01 = Collections.unmodifiableMap(new TSR(1));
    }

    /* access modifiers changed from: public */
    RFZ(int i) {
        this.A00 = i;
    }
}
