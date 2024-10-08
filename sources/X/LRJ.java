package X;

import android.content.Context;

public final class LRJ {
    public static int A00;
    public static Dc2 A01;
    public static final LRJ A02 = new Object();
    public static final MVB A03 = new C65357Lrx(0);

    public static final void A00() {
        Dc2 dc2 = A01;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        A01 = null;
    }

    public final void A01(Context context, int i) {
        A02(AnonymousClass7TE.A16(context, i));
    }

    public final void A02(String str) {
        A00();
        C310336ap A0X = DbV.A0X();
        A0X.A0D = str;
        A0X.A02 = A00 + 8;
        A0X.A0R = true;
        A0X.A0A(A03);
        Dc2 A002 = A0X.A00();
        DbX.A1S(A002);
        A01 = A002;
    }
}
