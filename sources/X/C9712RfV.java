package X;

import android.util.Log;

@Deprecated
/* renamed from: X.RfV  reason: case insensitive filesystem */
public abstract class C9712RfV {
    public static void A00(String str, Object obj) {
        C8485QvX qvX = C8485QvX.A00;
        if (qvX != null) {
            qvX.A0H(str, obj);
            return;
        }
        if (obj != null) {
            String valueOf = String.valueOf(obj);
            StringBuilder A0q = Pxh.A0q(valueOf, Pxf.A09(str) + 1);
            A0q.append(str);
            str = Pxg.A0s(":", valueOf, A0q);
        }
        Log.e((String) SDN.A0D.A00, str);
    }
}
