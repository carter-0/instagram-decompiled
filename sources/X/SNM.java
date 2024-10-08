package X;

import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;
import java.util.Map;

public final class SNM {
    public static final Map A02;
    public int A00 = -1;
    public final C7372Q9d A01;

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(23, "select");
        Pxh.A1I("select", A1E, 66);
        Pxh.A1I("select", A1E, 62);
        A1E.put(85, "playPause");
        A1E.put(89, "rewind");
        A1E.put(90, "fastForward");
        A1E.put(86, "stop");
        A1E.put(87, "next");
        A1E.put(88, "previous");
        A1E.put(19, "up");
        A1E.put(22, "right");
        A1E.put(20, "down");
        A1E.put(21, "left");
        A1E.put(165, "info");
        A1E.put(82, "menu");
        A02 = A1E;
    }

    public SNM(C7372Q9d q9d) {
        this.A01 = q9d;
    }

    public static void A00(SNM snm, String str, int i, int i2) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString("eventType", str);
        A0U.putInt("eventKeyAction", i2);
        if (i != -1) {
            A0U.putInt("tag", i);
        }
        C7372Q9d q9d = snm.A01;
        if (q9d.A05 != null) {
            q9d.getCurrentReactContext().A0E("onHWKeyEvent", A0U);
        }
    }
}
