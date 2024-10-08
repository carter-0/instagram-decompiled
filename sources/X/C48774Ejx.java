package X;

import android.content.Context;

/* renamed from: X.Ejx  reason: case insensitive filesystem */
public abstract class C48774Ejx {
    public static final void A00(Context context, C268654dm r4, String str) {
        C47336Dv3 dv3;
        if (!(r4 == null || (dv3 = (C47336Dv3) r4.A00()) == null)) {
            String str2 = dv3.A00;
            String errorMessage = dv3.getErrorMessage();
            if (errorMessage != null && !00l.A0W(errorMessage)) {
                C310336ap A0X = DbV.A0X();
                A0X.A0H = str;
                A0X.A0D = str2;
                A0X.A0I = errorMessage;
                DbY.A1N(A0X);
                return;
            }
        }
        if (context != null) {
            C59689JTv.A07(context, 2131961740);
        }
    }
}
