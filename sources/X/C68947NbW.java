package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.NbW  reason: case insensitive filesystem */
public final class C68947NbW extends 1ih {
    public final O76 A00;

    public final void EGE(1OS r6, boolean z) {
        0qQ.A0B(r6, 0);
        AnonymousClass1j7 r62 = (AnonymousClass1j7) r6;
        O76 o76 = this.A00;
        DirectThreadKey C6K = r62.C6K();
        0qQ.A07(C6K);
        boolean z2 = r62.A03;
        0Aj A0e = AnonymousClass7TE.A0e(o76.A00, "new_poll_submit_success");
        0bb r1 = new 0bb();
        String A0B = C66647MaG.A0B(C6K);
        if (A0B != null) {
            C66584MXp.A0z(r1, A0B, z2);
            C66583MXo.A13(A0e, r1);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void EGF(0xF r7, 1OS r8, C270214gN r9, boolean z, boolean z2) {
        AnonymousClass7TG.A0w(0, r8, r9, r7);
        if (!z) {
            AnonymousClass1j7 r82 = (AnonymousClass1j7) r8;
            O76 o76 = this.A00;
            DirectThreadKey C6K = r82.C6K();
            0qQ.A07(C6K);
            boolean z3 = r82.A03;
            String str = r9.A04;
            if (str == null) {
                str = "";
            }
            0Aj A0e = AnonymousClass7TE.A0e(o76.A00, "new_poll_submit_error");
            0bb r1 = new 0bb();
            String A0B = C66647MaG.A0B(C6K);
            if (A0B != null) {
                C66584MXp.A0z(r1, A0B, z3);
                r1.A06("exception_message", str);
                C66583MXo.A13(A0e, r1);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68947NbW(AnonymousClass0iw r3, UserSession userSession) {
        super(C60510iO.A00(userSession), r3, "direct_mutation_waterfall");
        0qQ.A0B(userSession, 1);
        this.A00 = new O76(r3, userSession);
    }
}
