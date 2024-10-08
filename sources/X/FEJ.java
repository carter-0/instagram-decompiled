package X;

import android.content.Context;

public abstract class FEJ {
    public static boolean A00;

    public static final void A00(Context context, int i, long j) {
        String str;
        if (context != null) {
            str = DbW.A0h(context, 1G0.A03(context, (double) AnonymousClass7TE.A0P(j)), i);
        } else {
            str = null;
        }
        C59689JTv.A09(context, str);
    }

    public static final void A01(Context context, long j) {
        if (!A00) {
            A00(context, 2131973877, j);
            A00 = true;
            return;
        }
        A00(context, 2131964654, j);
    }

    public static final void A02(Context context, long j) {
        if (!A00) {
            A00(context, 2131973878, j);
            A00 = true;
            return;
        }
        A00(context, 2131964654, j);
    }
}
