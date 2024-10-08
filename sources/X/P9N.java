package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class P9N implements AnonymousClass7YB {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass7H6 A02;
    public final C332917Wy A03;
    public final C68988NcJ A04;
    public final AnonymousClass0eK A05;
    public final C62320sa A06;
    public final 2Dm A07;

    public P9N(FragmentActivity fragmentActivity, AnonymousClass4DH r9, UserSession userSession, C332917Wy r11, 2Dm r12, AnonymousClass0eK r13, C62320sa r14) {
        DbW.A1N(r9, 2, r12);
        0qQ.A0B(r11, 7);
        this.A00 = r9;
        this.A01 = userSession;
        this.A06 = r14;
        this.A07 = r12;
        this.A05 = r13;
        this.A03 = r11;
        this.A02 = new AnonymousClass7H6(fragmentActivity, userSession, (AnonymousClass3E6) null, 120, true, false);
        this.A04 = C68988NcJ.A00.A00(userSession);
    }

    public final void Cpw(View view, AnonymousClass77B r13) {
        C254743sy r0;
        View view2 = view;
        0qQ.A0B(view, 0);
        C254743sy r10 = (C254743sy) this.A06.invoke();
        if (r10 != null) {
            if (C69874Ntc.A00(this.A00.requireActivity(), this.A01, r10)) {
                C254763t0 BN3 = ((AnonymousClass7S7) this.A05.get()).BN3();
                if (BN3 != null) {
                    r0 = C300965yF.A05(BN3);
                } else {
                    r0 = null;
                }
                1a8 r9 = new 1a8((C269794fh) null);
                C68988NcJ ncJ = this.A04;
                r9.A02(C66789Mca.A00(ncJ.A0A(r10, r0), C74060PoP.A00, 8).A0H().A0L(C72097OwA.A00).A0L(C72098OwB.A00).A0P(C318146oT.A01), new C72993PSc(3, view2, r13, this, r9, r10));
                ncJ.A0B(r10, (Integer) null);
            }
        }
    }
}
