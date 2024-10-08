package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class KOX extends LSR {
    public final KO3 A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final boolean A03;
    public final UserSession A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOX(UserSession userSession, KO3 ko3, boolean z) {
        super(ko3);
        AnonymousClass7TG.A1O(ko3, userSession);
        this.A00 = ko3;
        this.A04 = userSession;
        this.A03 = z;
        02z A10 = DbS.A10(new C61082JwK((AnonymousClass3QO) null, (DefaultConstructorMarker) null, 3, 15, false));
        this.A01 = A10;
        this.A02 = A10;
    }

    public final GAX A0A(boolean z) {
        int i;
        C63815L7w l7w;
        if (C64187LSu.A02(A06())) {
            i = 2131969866;
        } else if (z) {
            i = 2131962856;
        } else {
            C61075JwD A06 = A06();
            0qQ.A0B(A06, 0);
            C59721JVf jVf = A06.A03;
            if (jVf != null && (l7w = (C63815L7w) jVf.A01) != null && AnonymousClass7TE.A1b(l7w.A02)) {
                i = 2131969133;
            } else if (!this.A03) {
                return null;
            } else {
                i = 2131961789;
            }
        }
        return new GAX(i, 2131955227);
    }
}
