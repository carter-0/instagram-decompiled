package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.F9y  reason: case insensitive filesystem */
public final class C49858F9y {
    public final 0wc A00;

    public static void A00(C49858F9y f9y, C46634DiE diE, String str, String str2, String str3, boolean z) {
        1Q9 A01 = 1Q9.A01("log_in");
        String A0t = DbV.A0t();
        long currentTimeMillis = System.currentTimeMillis();
        0Aj A0e = AnonymousClass7TE.A0e(f9y.A00, "reactivate_account_attempt");
        A0e.AAJ("waterfall_id", A01.A05());
        A0e.AAJ("app_device_id", A0t);
        DbY.A1D(A0e, (double) currentTimeMillis, (double) A01.A03());
        DbW.A12(A0e, (double) A01.A03());
        A0e.A7p(AnonymousClass000.A00(4977), Boolean.valueOf(z));
        A0e.AAJ("reactivation_source", str);
        DbS.A1H(A0e, diE.A01);
        DbY.A1B(A0e);
        A0e.AAJ("release_channel", DbX.A0s(0la.A00()));
        A0e.AAJ(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        A0e.AAJ(Dbj.A03(), str3);
        A0e.Cgf();
    }

    public C49858F9y(AnonymousClass0iw r2, 0lg r3) {
        this.A00 = AnonymousClass0kN.A01(r2, r3);
    }
}
