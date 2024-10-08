package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.9l2  reason: invalid class name and case insensitive filesystem */
public final class C386709l2 extends 0ng {
    public final /* synthetic */ C385459iy A00;
    public final /* synthetic */ C39964ALg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386709l2(C385459iy r4, C39964ALg aLg) {
        super(602, 3, false, false);
        this.A01 = aLg;
        this.A00 = r4;
    }

    public final void run() {
        long j;
        C39964ALg aLg = this.A01;
        UserSession userSession = aLg.A0K;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(aLg.A0J, userSession), "instagram_smb_partner_flow_producer");
        Long A0n = 00y.A0n(10, userSession.A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        A0e.A9F("igid", Long.valueOf(j));
        A0e.AAJ("step", "share_business_sticker_fetch_ranked_media");
        A0e.AAJ("action", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        A0e.AAJ(C39829ABa.A00(0, 10, 18), AnonymousClass7TG.A0j());
        A0e.A7p("is_support_partner_enabled", false);
        A0e.AAJ("sticker_type", C317876nz.A1Y.A0Z);
        A0e.Cgf();
        this.A00.onFail(AnonymousClass7BQ.A00());
    }
}
