package X;

import com.facebook.react.bridge.ReactMarker;

/* renamed from: X.Rzc  reason: case insensitive filesystem */
public abstract class C10876Rzc {
    public final String A00(C13566Tcm tcm) {
        boolean containsKey;
        if (this instanceof QZB) {
            String str = ((QZB) this).A00;
            tcm.loadScriptFromFile(str, "Ig4aBundle.js.hbc", false);
            return str;
        }
        QZC qzc = (QZC) this;
        synchronized (qzc) {
            if (qzc.A00 != null) {
                ReactMarker.logMarker(RH1.A1p);
                0Dc r0 = qzc.A00;
                0E7 r2 = 0Dc.A06;
                String str2 = r0.A03;
                synchronized (r2) {
                    containsKey = r2.A00.containsKey(str2);
                }
                if (containsKey) {
                    ReactMarker.logMarker(RH1.A1n);
                }
                if (qzc.A00.A03()) {
                    ReactMarker.logMarker(RH1.A1q);
                }
                ReactMarker.logMarker(RH1.A1o);
                qzc.A00 = null;
            }
        }
        return qzc.A01.A00(tcm);
    }
}
