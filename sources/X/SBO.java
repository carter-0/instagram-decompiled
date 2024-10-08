package X;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactMarker;

public final class SBO {
    public static volatile boolean A00;

    public static synchronized void A00() {
        synchronized (SBO.class) {
            if (!A00) {
                SystemClock.uptimeMillis();
                0fc.A01(8192, "ReactBridge.staticInit::load:reactnativejni", 458066061);
                ReactMarker.logMarker(RH1.A16);
                0dV.A0C("reactnativejni");
                ReactMarker.logMarker(RH1.A15);
                0fc.A00(8192, -990212833);
                SystemClock.uptimeMillis();
                A00 = true;
            }
        }
    }
}
