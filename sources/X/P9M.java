package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class P9M implements AnonymousClass7Y9 {
    public final AnonymousClass0eM A00;
    public final FragmentActivity A01;
    public final UserSession A02;

    public P9M(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass0eK r4) {
        0qQ.A0B(r4, 3);
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A00 = C73920Pm0.A00(r4, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r3.CXj(r1) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFs() {
        /*
            r4 = this;
            com.instagram.common.session.UserSession r1 = r4.A02
            X.0eM r0 = r4.A00
            java.lang.Object r0 = r0.getValue()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r3 = r0.C6l()
            java.lang.String r1 = r1.A06
            boolean r0 = r3.COR(r1)
            if (r0 != 0) goto L_0x001d
            boolean r0 = r3.CXj(r1)
            r2 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r2 = 1
        L_0x001e:
            int r1 = X.C66580MXl.A05(r3)
            r0 = 29
            if (r1 != r0) goto L_0x0029
            r0 = 1
            if (r2 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9M.AFs():boolean");
    }

    public final void Cpo(String str) {
        C254793t3 CBU = ((C333517Zg) this.A00.getValue()).C6l().CBU();
        if (CBU != null) {
            UserSession userSession = this.A02;
            C66583MXo.A1G(DbV.A0M(C69939Nuf.A00(userSession, CBU, "hidden_reaction_nux"), this.A01, userSession), "DirectMultipleReactionMessagePillsViewHolder");
        }
    }
}
