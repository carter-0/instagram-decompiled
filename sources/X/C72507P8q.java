package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.HashMap;

/* renamed from: X.P8q  reason: case insensitive filesystem */
public final class C72507P8q implements C332867Wr {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final OT9 A02;
    public final AnonymousClass7SN A03;
    public final AnonymousClass0eK A04;

    public C72507P8q(AnonymousClass4DH r2, UserSession userSession, OT9 ot9, AnonymousClass7SN r5, AnonymousClass0eK r6) {
        0qQ.A0B(r2, 1);
        C51973G9u.A0r(3, ot9, r6, r5);
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = ot9;
        this.A04 = r6;
        this.A03 = r5;
    }

    public final boolean AFj(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        AnonymousClass7ZY A0W = C66582MXn.A0W(this.A04);
        String str = directMessageIdentifier.A02;
        if (str == null) {
            str = directMessageIdentifier.A00;
        }
        AnonymousClass7LQ BSO = A0W.BSO(str);
        if (BSO != null && BSO.A06()) {
            UserSession userSession = BSO.A0d;
            AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
            String str2 = BSO.A0e.A0V().A02;
            0xa r2 = A002.A00;
            boolean A0K = 0qQ.A0K(r2.getString("preference_direct_last_regenerated_ai_direct_message_identifier_id", (String) null), str2);
            int i = 0;
            if (A0K) {
                i = r2.getInt("preference_direct_regenerate_ai_message_request_count", 0);
            }
            if (i >= DbS.A04(0Tu.A05, userSession, 36608514525042386L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean CHm(DirectMessageIdentifier directMessageIdentifier, C62320sa r8) {
        0qQ.A0B(directMessageIdentifier, 0);
        this.A03.CLU();
        HashMap A002 = A00(directMessageIdentifier);
        if (A002 == null) {
            return false;
        }
        HashMap A0m = DbY.A0m("on_complete", new Q3B(new C74185PqR(28, (Object) r8, (Object) this)));
        C49940FFt fFt = new C49940FFt();
        fFt.A03 = C46626Di6.HALF_SHEET;
        fFt.A02 = C46627Di7.DISABLED;
        C46471DfZ A032 = fFt.A03();
        C46649DiU A06 = C46649DiU.A06("com.bloks.www.messenger.aibot.feedback_controller", A002, A0m);
        Context requireContext = this.A00.requireContext();
        C49672F1e f1e = new C49672F1e(this.A01);
        f1e.A00(A032);
        A06.A0F(requireContext, f1e.A00);
        return true;
    }

    public final boolean CHn(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        HashMap A002 = A00(directMessageIdentifier);
        if (A002 == null) {
            return false;
        }
        Q3B q3b = new Q3B(new C74181PqN(this, 39));
        UserSession userSession = this.A01;
        AnonymousClass4DH r3 = this.A00;
        C229382nI A003 = C229382nI.A00(new SparseArray(), r3, r3, userSession, (2el) null);
        FBO fbo = new FBO("com.bloks.www.messenger.aibot.good_feedback_submit_controller");
        fbo.A04 = A002;
        fbo.A01 = q3b;
        fbo.A01(r3.requireContext(), A003);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r0 == null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.HashMap A00(com.instagram.model.direct.messageid.DirectMessageIdentifier r8) {
        /*
            r7 = this;
            X.0eK r6 = r7.A04
            X.7SD r0 = X.C66582MXn.A0X(r6)
            int r5 = r0.A08
            X.OT9 r3 = r7.A02
            java.lang.String r2 = r8.A01
            java.lang.String r1 = "DirectThreadFragment.giveFeedback"
            r0 = 0
            X.3su r4 = X.OT9.A00(r3, r2, r1, r0)
            r3 = 0
            if (r4 != 0) goto L_0x0017
            return r3
        L_0x0017:
            X.7S7 r0 = X.C66582MXn.A0d(r6)
            X.2Ep r1 = r0.Cms()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0039
            java.lang.String r0 = r4.A1u
            com.instagram.user.model.User r0 = r1.CCf(r0)
            if (r0 == 0) goto L_0x0061
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r0.AaX()
        L_0x0031:
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A04
            if (r1 != r0) goto L_0x005e
            java.lang.String r0 = r4.A1u
            if (r0 != 0) goto L_0x005f
        L_0x0039:
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r5 != r0) goto L_0x003f
            java.lang.String r2 = r4.A1u
        L_0x003f:
            X.7AG r0 = r4.A0Q
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = r0.A05
            if (r1 == 0) goto L_0x0063
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "bot_response_id"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            r0 = 3735(0xe97, float:5.234E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.HashMap r0 = X.Dbb.A0e(r0, r2, r1)
            return r0
        L_0x005e:
            r0 = r2
        L_0x005f:
            r2 = r0
            goto L_0x0039
        L_0x0061:
            r1 = r3
            goto L_0x0031
        L_0x0063:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72507P8q.A00(com.instagram.model.direct.messageid.DirectMessageIdentifier):java.util.HashMap");
    }

    public static final void A01(C72507P8q p8q) {
        Context requireContext = p8q.A00.requireContext();
        C310336ap A0W = DbV.A0W();
        DbS.A19(requireContext, A0W, 2131959749);
        A0W.A02();
        A0W.A07(R.drawable.instagram_check_pano_outline_24);
        A0W.A0O = true;
        DbY.A1N(A0W);
    }
}
