package X;

import android.content.Context;

/* renamed from: X.ErD  reason: case insensitive filesystem */
public abstract class C49208ErD {
    public static final void A00(Context context, AnonymousClass0iw r8, 0lg r9, String str, boolean z) {
        String str2;
        AnonymousClass7TF.A1C(r9, 0, context);
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, r9), "connect_with_friends");
        if (z) {
            str2 = "waterfall_log_in";
        } else if (r8 != null) {
            str2 = r8.getModuleName();
        } else {
            str2 = null;
        }
        A0e.AAJ("containermodule", str2);
        FH8.A0D(A0e, r9, "release_channel", FH8.A01());
        DbY.A1D(A0e, A01, A00);
        Dbc.A0c(A0e, "step", str, A00);
        DbW.A13(A0e, A01);
        FH8.A06(A0e);
        FH8.A05(A0e);
        A0e.AAJ("app_device_id", DbT.A0s(context));
        A0e.Cgf();
    }
}
