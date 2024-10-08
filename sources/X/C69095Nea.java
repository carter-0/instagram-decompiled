package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Nea  reason: case insensitive filesystem */
public final class C69095Nea extends C71135OdY {
    public int A00;
    public N4D A01;
    public final Activity A02;
    public final Activity A03;
    public final UserSession A04;
    public final PMM A05 = PMM.A00;
    public final C71111Ocu A06;
    public final OLF A07;
    public final OZx A08;

    public final void onClosedCaptionsOptionClicked$fbandroid_java_com_instagram_rtc_presentation_cowatch_options_options() {
        N4D n4d = this.A01;
        if (n4d != null && AnonymousClass7TE.A1b((List) n4d.A01)) {
            C331157Pu A002 = this.A07.A00(C73861Pky.A00, 0.5f, 1.0f, false, false, true).A00();
            C71111Ocu ocu = this.A06;
            C73594PgU A14 = C66580MXl.A14(this, 38);
            ocu.A05(new C72866PNc(new E7H(this.A04, (List) n4d.A01, A14, this.A00), A002, false, false));
        }
    }

    public final void onReportClicked$fbandroid_java_com_instagram_rtc_presentation_cowatch_options_options() {
        String str;
        N4D n4d = this.A01;
        if (!(n4d == null || !n4d.A05 || (str = n4d.A03) == null)) {
            this.A06.A05(new PNU(n4d.A02, str));
        }
        N4D n4d2 = this.A01;
        if (n4d2 != null) {
            OZx oZx = this.A08;
            String str2 = n4d2.A02;
            0qQ.A0B(str2, 0);
            oZx.A04.A00(new C72777PJr(str2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69095Nea(Activity activity, UserSession userSession, C71111Ocu ocu, OLF olf, OZx oZx) {
        super(DbS.A0z(C72831PLt.class));
        AnonymousClass7TG.A1Q(ocu, olf);
        0qQ.A0B(oZx, 5);
        this.A02 = activity;
        this.A06 = ocu;
        this.A07 = olf;
        this.A04 = userSession;
        this.A08 = oZx;
        this.A03 = activity;
    }
}
