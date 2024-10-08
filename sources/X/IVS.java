package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class IVS implements MVB {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ AnonymousClass3KM A02;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVS(1Xj r1, User user, AnonymousClass3KM r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onButtonClick(View view) {
        AnonymousClass3KM r3 = this.A02;
        UserSession userSession = r3.A01;
        AnonymousClass4DH r6 = r3.A00;
        1Xj r8 = this.A00;
        String id = r8.getId();
        if (id != null) {
            String id2 = this.A01.getId();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "external_share_screenshot_prompt_reshare_cta_click");
            if (A0e.isSampled()) {
                C51965G9l.A1J(A0e, id);
                A0e.A9F("media_owner_id", AnonymousClass7TE.A10(id2));
                DbW.A15(A0e, r6);
                A0e.Cgf();
            }
            if (182.A06(0Tu.A05, userSession, 36314859021863759L)) {
                C46395DeI.A0U(r6, userSession, r8, r3.A02, (AnonymousClass3W1) null, AnonymousClass000.A00(604));
                return;
            }
            AnonymousClass364 r2 = r3.A03;
            String A002 = AnonymousClass000.A00(604);
            C227802jw r1 = r2.A03;
            if (r1.A0I != null) {
                AnonymousClass3W1 BQr = r2.A02.BQr(r8);
                C2357130x r0 = r1.A0I;
                if (r0 != null) {
                    r0.BRE().Djj(r8, BQr, A002, BQr.getPosition());
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onShow() {
        AnonymousClass3KM r0 = this.A02;
        UserSession userSession = r0.A01;
        AnonymousClass4DH r5 = r0.A00;
        String id = this.A00.getId();
        if (id != null) {
            String id2 = this.A01.getId();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "external_share_screenshot_prompt_reshare_toast_impression");
            if (A0e.isSampled()) {
                C51965G9l.A1J(A0e, id);
                A0e.A9F("media_owner_id", AnonymousClass7TE.A10(id2));
                DbW.A15(A0e, r5);
                A0e.Cgf();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
