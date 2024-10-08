package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OjJ  reason: case insensitive filesystem */
public final class C71364OjJ implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C68036Mz3 A02;
    public final /* synthetic */ C292975jp A03;
    public final /* synthetic */ C266904aX A04;
    public final /* synthetic */ AnonymousClass3UH A05;

    public C71364OjJ(C68036Mz3 mz3, C292975jp r2, C266904aX r3, AnonymousClass3UH r4, int i, long j) {
        this.A02 = mz3;
        this.A03 = r2;
        this.A04 = r3;
        this.A00 = i;
        this.A05 = r4;
        this.A01 = j;
    }

    public final void onClick(View view) {
        long j;
        String A012;
        0xa r3;
        String str;
        int A052 = AnonymousClass0fD.A05(-1243132049);
        C68036Mz3 mz3 = this.A02;
        int bindingAdapterPosition = mz3.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            C292975jp r6 = this.A03;
            C292975jp.A01(r6, bindingAdapterPosition);
            C266904aX r5 = this.A04;
            int i = this.A00;
            int ordinal = r5.C2m().ordinal();
            if (ordinal == 6) {
                OFR ofr = r6.A02;
                if (ofr == null) {
                    ofr = new OFR(r6.A0B, r6.A0C);
                    r6.A02 = ofr;
                }
                String A002 = C292975jp.A00(r6);
                Integer valueOf = Integer.valueOf(i);
                0Aj A0e = AnonymousClass7TE.A0e(ofr.A00, "discover_people_upsell_dismissed");
                A0e.AAJ("module", ofr.A01);
                A0e.AAJ("view_module", A002);
                A0e.A8k("position", valueOf);
                A0e.Cgf();
            } else if (ordinal == 2) {
                C311496cm r32 = r6.A01;
                if (r32 == null) {
                    r32 = new C311496cm(r6.A0B, r6.A0C);
                    r6.A01 = r32;
                }
                r32.A03(Integer.valueOf(i), C292975jp.A00(r6), false);
            }
            if (r5.C2m() == AnonymousClass3UO.CI_UPSELL && r6.A07) {
                1Av A003 = 1Au.A00(r6.A0C);
                1UQ B5J = this.A05.B5J();
                j = this.A01;
                A012 = 1Av.A01(B5J);
                if (A012 != null) {
                    String A0R = 002.A0R(C273654mx.A00(3095), A012);
                    r3 = A003.A01;
                    AnonymousClass7TG.A0g(r3, A0R).apply();
                    str = C273654mx.A00(2968);
                }
            } else if (r5.C2m() == AnonymousClass3UO.INVITE_UPSELL && r6.A06) {
                UserSession userSession = r6.A0C;
                C49947FGb.A04(C48145EZn.FEED_SUGGESTED_USERS, userSession, C267044ar.A01(AnonymousClass7TE.A0S(mz3.A00), userSession));
                1Av A004 = 1Au.A00(userSession);
                1UQ B5J2 = this.A05.B5J();
                j = this.A01;
                A012 = 1Av.A01(B5J2);
                if (A012 != null) {
                    String A0R2 = 002.A0R("num_times_dismissed_invite_upsell_feed", A012);
                    r3 = A004.A01;
                    AnonymousClass7TG.A0g(r3, A0R2).apply();
                    str = "last_time_dismissed_invite_upsell_feed";
                }
            }
            String A0R3 = 002.A0R(str, A012);
            0xY AR4 = r3.AR4();
            AR4.E5c(A0R3, j);
            AR4.apply();
        }
        AnonymousClass0fD.A0C(207259257, A052);
    }
}
