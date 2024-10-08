package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class EIM extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIM(Context context, AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        super(300);
        this.A00 = context;
        this.A01 = r3;
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A02 = userSession;
    }

    public final void run() {
        Context context = this.A00;
        AnonymousClass0vF r0 = C71332ca.A01;
        C62880wX r6 = C61170le.A00;
        String string = DbT.A0g(r6).getString("fb_attribution_id", (String) null);
        String string2 = DbT.A0g(r6).getString("google_ad_id", (String) null);
        if (string == null || string2 == null) {
            SFJ A002 = SFJ.A00(context);
            if (A002 == null) {
                0wb.A03("family-bridges", "failed to fetch AttributionIdentifiers");
            } else {
                if (A002.A02 != null) {
                    0xm A003 = AnonymousClass0xl.A00(r6);
                    DbX.A1U(A003.A00, "fb_attribution_id", A002.A02);
                }
                if (A002.A01 != null) {
                    0xm A004 = AnonymousClass0xl.A00(r6);
                    DbX.A1U(A004.A00, "google_ad_id", A002.A01);
                }
                0xm A005 = AnonymousClass0xl.A00(r6);
                boolean z = A002.A03;
                0xY A0d = DbS.A0d(A005);
                A0d.E5T("opt_out_ads", z);
                A0d.apply();
            }
        }
        0xI A006 = 0xI.A00(this.A01, "open_family_app");
        A006.A0C("source_surface", this.A07);
        A006.A0C("dest_intended_surface", "fb_homepage");
        A006.A0C("dest_type", this.A03);
        A006.A0C(AnonymousClass000.A00(3176), this.A04);
        A006.A0C("fb_attribution_id", DbT.A0g(r6).getString("fb_attribution_id", (String) null));
        A006.A0C("google_ad_id", DbT.A0g(r6).getString("google_ad_id", (String) null));
        A006.A09("opt_out_ads", Boolean.valueOf(DbT.A1a(DbT.A0g(r6), "opt_out_ads")));
        String str = this.A05;
        if (str != null) {
            A006.A0C("netego_id", str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            A006.A0C("netego_tracking_token", str2);
        }
        DbU.A1R(A006, this.A02);
    }
}
