package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.unifiedfeedback.disclosure.UnifiedFeedbackDisclosureApi;
import com.instagram.user.model.User;

/* renamed from: X.3YL  reason: invalid class name */
public final class AnonymousClass3YL {
    public final UserSession A00;
    public final UnifiedFeedbackDisclosureApi A01;
    public final AnonymousClass3YM A02;
    public final AnonymousClass07Z A03;

    public AnonymousClass3YL(Context context, UserSession userSession) {
        AnonymousClass07Z r6;
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = userSession;
        AnonymousClass3YM r1 = (AnonymousClass3YM) userSession.A01(AnonymousClass3YM.class, new C20698WxU((Object) userSession, 22));
        this.A02 = r1;
        if (context instanceof AnonymousClass07Z) {
            r6 = (AnonymousClass07Z) context;
        } else {
            r6 = null;
        }
        this.A03 = r6;
        this.A01 = new UnifiedFeedbackDisclosureApi(userSession);
        if (!r1.A00.getBoolean("has_seen_unified_feedback_disclosure_nux_dialog", false)) {
            0Tu r2 = 0Tu.A06;
            if (182.A06(r2, userSession, 36314274905197054L) && 182.A06(r2, userSession, 2342157284119284223L) && r6 != null) {
                AnonymousClass0xx A002 = C71772f0.A00(r6.getLifecycle());
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C376909Ju(this, (AnonymousClass4D7) null, 37), A002);
            }
        }
    }

    public final void A01(Context context) {
        UserSession userSession = this.A00;
        Context context2 = context;
        SUL sul = new SUL(context2, userSession, 2EG.A45, 182.A04(0Tu.A06, userSession, 36877224858681472L), false);
        sul.A0S = "unified_feedback_disclosure";
        sul.A0A();
    }

    public final boolean A02(1Xj r6) {
        String str;
        if (r6 == null) {
            return false;
        }
        UserSession userSession = this.A00;
        User A2A = r6.A2A(userSession);
        if (A2A != null) {
            str = A2A.getId();
        } else {
            str = null;
        }
        return !0qQ.A0K(str, userSession.A06) && AnonymousClass3YO.A02(r6, false) && 182.A06(0Tu.A05, userSession, 36314274905197054L) && !this.A02.A00.getBoolean("has_seen_unified_feedback_disclosure_nux_dialog", false);
    }

    public final void A00() {
        AnonymousClass07Z r0;
        0xY AR4 = this.A02.A00.AR4();
        AR4.E5T("has_seen_unified_feedback_disclosure_nux_dialog", true);
        AR4.apply();
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36314274905197054L) && 182.A06(r2, userSession, 2342157284119284223L) && (r0 = this.A03) != null) {
            AnonymousClass0xx A002 = C71772f0.A00(r0.getLifecycle());
            C376909Ju r22 = new C376909Ju(this, (AnonymousClass4D7) null, 38);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r22, A002);
        }
    }
}
