package X;

import android.content.Context;

/* renamed from: X.Rfp  reason: case insensitive filesystem */
public abstract class C9731Rfp {
    public static C13652TeJ A00(Context context) {
        C10759Rxd rxd;
        synchronized (RQ2.class) {
            rxd = RQ2.A00;
            if (rxd == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                rxd = new C10759Rxd(context);
                RQ2.A00 = rxd;
            }
        }
        return (C13652TeJ) rxd.A00.A6t();
    }
}
