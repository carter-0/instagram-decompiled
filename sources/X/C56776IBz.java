package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IBz  reason: case insensitive filesystem */
public final class C56776IBz implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass5Gv A03;

    public C56776IBz(AnonymousClass0iw r1, UserSession userSession, 1Xj r3, AnonymousClass5Gv r4) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1717220300);
        I6E i6e = I6E.A00;
        UserSession userSession = this.A01;
        i6e.A03(this.A00, userSession, this.A02, AnonymousClass05K.A0C);
        AnonymousClass5Gv r0 = this.A03;
        if (r0 != null) {
            r0.A07(userSession);
        }
        AnonymousClass0fD.A0C(901245063, A05);
    }
}
