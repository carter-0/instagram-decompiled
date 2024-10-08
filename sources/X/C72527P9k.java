package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P9k  reason: case insensitive filesystem */
public final class C72527P9k implements AnonymousClass7YH, AnonymousClass7YI {
    public final AnonymousClass7SM A00;
    public final UserSession A01;
    public final AnonymousClass7TI A02;
    public final OT9 A03;

    public final void EJK() {
        if (this.A02.A0V()) {
            C329067Hl A06 = AnonymousClass9H7.A06(this.A00.A00);
            A06.A07.setVisibility(0);
            C294975nL A0c = JTP.A0c(A06.A07, 0);
            A0c.A0T((float) A06.A07.getHeight(), 0.0f);
            A0c.A0A().A0H();
            A06.A1G = false;
        }
    }

    public final void EJu(MessageIdentifier messageIdentifier) {
        String str;
        String C1n;
        OT9 ot9 = this.A03;
        UserSession userSession = this.A01;
        if (messageIdentifier != null) {
            str = messageIdentifier.A01;
        } else {
            str = null;
        }
        C254703su A002 = OT9.A00(ot9, str, "DirectThreadFragment.saveAsQuickReply", true);
        if (A002 != null && (C1n = C66582MXn.A0e(A002).C1n(userSession, A002)) != null) {
            AnonymousClass9H7 r7 = this.A00.A00;
            AnonymousClass7Q0 r0 = AnonymousClass9H7.A06(r7).A0n;
            if (r0 != null) {
                C69670Nps nps = r0.A02;
                UserSession userSession2 = r7.A10;
                AnonymousClass4DU r3 = r7.A1Q;
                String str2 = nps.A01;
                0qQ.A07(str2);
                String str3 = nps.A02;
                0qQ.A07(str3);
                0qQ.A0B(r3, 1);
                DbU.A1R(C3265677h.A01(r3, "thread_save_tap", str2, str3), userSession2);
                Bundle A0a = AnonymousClass7TE.A0a();
                nps.A00(A0a);
                A0a.putString("DirectEditQuickReplyFragment.quick_reply_message", C1n);
                AnonymousClass4DH r2 = r7.A0u;
                DbT.A1L(r2, DbS.A0b(r2.requireActivity(), A0a, userSession2, ModalActivity.class, "direct_edit_quick_reply"));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public C72527P9k(UserSession userSession, AnonymousClass7TI r2, AnonymousClass7SM r3, OT9 ot9) {
        AnonymousClass7TG.A1U(ot9, r3, r2);
        this.A03 = ot9;
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = userSession;
    }
}
