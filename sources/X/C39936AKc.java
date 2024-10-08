package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.AKc  reason: case insensitive filesystem */
public final class C39936AKc implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C365748nc A01;
    public final /* synthetic */ C365738nb A02;

    public C39936AKc(AnonymousClass0iw r1, C365748nc r2, C365738nb r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A02.A07;
        AnonymousClass0iw r1 = this.A00;
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "instagram_smb_partner_flow_producer");
        A0e.A9F("igid", Long.valueOf(C49959FGr.A00(userSession)));
        A0e.AAJ("step", AnonymousClass000.A00(1852));
        A0e.AAJ("action", "tap");
        A0e.AAJ(Dd6.A01(), AnonymousClass7TG.A0j());
        A0e.A7p("is_support_partner_enabled", Boolean.valueOf(C49959FGr.A08(userSession)));
        A0e.Cgf();
        this.A01.A00.A0y.A02();
    }
}
