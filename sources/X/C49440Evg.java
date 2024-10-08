package X;

import android.content.Context;

/* renamed from: X.Evg  reason: case insensitive filesystem */
public final class C49440Evg {
    public static C49440Evg A01;
    public 0xa A00;

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.Evg] */
    public static synchronized C49440Evg A00() {
        C49440Evg evg;
        synchronized (C49440Evg.class) {
            C49440Evg evg2 = A01;
            evg = evg2;
            if (evg2 == null) {
                Context context = C60960kU.A00;
                ? obj = new Object();
                obj.A00 = 0xn.A00(context, "autobackupprefs");
                A01 = obj;
                evg = obj;
            }
        }
        return evg;
    }
}
