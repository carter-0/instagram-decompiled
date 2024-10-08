package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;

/* renamed from: X.SEu  reason: case insensitive filesystem */
public final class C11194SEu {
    public static C11194SEu A03;
    public Context A00;
    public final int A01;
    public final 1Uk A02;

    public static synchronized C11194SEu A00(Context context) {
        C11194SEu sEu;
        synchronized (C11194SEu.class) {
            sEu = A03;
            if (sEu == null) {
                sEu = new C11194SEu(context);
                A03 = sEu;
            }
        }
        return sEu;
    }

    public C11194SEu(Context context) {
        C10332RqV rqV;
        synchronized (C10332RqV.class) {
            rqV = C10332RqV.A01;
            if (rqV == null) {
                rqV = new C10332RqV(context);
                C10332RqV.A01 = rqV;
            }
        }
        this.A02 = rqV.A00;
        this.A01 = BuildConstants.A01();
        1Uk r3 = this.A02;
        int i = r3.getInt("native_version", -1);
        if (i == -1 || i != this.A01) {
            1W3 AR0 = r3.AR0();
            AR0.A04();
            AR0.A07("native_version", this.A01);
            AR0.A0B();
        }
        this.A00 = context.getApplicationContext();
    }
}
