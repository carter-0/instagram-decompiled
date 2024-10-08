package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFe  reason: case insensitive filesystem */
public final class C54476HFe extends C232502tp {
    public final FragmentActivity A00;
    public final UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54476HFe(FragmentActivity fragmentActivity, AnonymousClass07Z r10, UserSession userSession) {
        super(fragmentActivity, r10, userSession, (String) null, (0sP) null, (0sP) null, 248);
        AnonymousClass7TG.A1U(fragmentActivity, userSession, r10);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final C251263mp A02(C62320sa r4, C62320sa r5) {
        0qQ.A0B(r4, 0);
        return new C53690Gsh(this.A00, this.A01, r4);
    }

    public final int A01() {
        return C51967G9n.A01(AnonymousClass0nB.A01(this.A00));
    }

    public final String A04() {
        return "TifuNetegoLithoViewBinder";
    }
}
