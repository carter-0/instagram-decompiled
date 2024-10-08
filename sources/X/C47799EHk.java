package X;

import android.content.Context;

/* renamed from: X.EHk  reason: case insensitive filesystem */
public final class C47799EHk extends 0ng {
    public final /* synthetic */ Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47799EHk(Context context) {
        super(188, 5, false, false);
        this.A00 = context;
    }

    public final void run() {
        SFJ A002;
        C62880wX r5 = C61170le.A00;
        if (DbT.A0g(r5).getString("google_ad_id", (String) null) == null && (A002 = SFJ.A00(this.A00)) != null) {
            if (A002.A02 != null) {
                0xm A003 = AnonymousClass0xl.A00(r5);
                String str = A002.A02;
                0xY A0d = DbS.A0d(A003);
                A0d.E5g("fb_attribution_id", str);
                A0d.apply();
            }
            if (A002.A01 != null) {
                0xm A004 = AnonymousClass0xl.A00(r5);
                DbX.A1U(A004.A00, "google_ad_id", A002.A01);
            }
            0xm A005 = AnonymousClass0xl.A00(r5);
            boolean z = A002.A03;
            0xY A0d2 = DbS.A0d(A005);
            A0d2.E5T("opt_out_ads", z);
            A0d2.apply();
        }
    }
}
