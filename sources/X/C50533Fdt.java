package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fdt  reason: case insensitive filesystem */
public final class C50533Fdt implements G78 {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ E57 A01;

    public final void Dez(C51880G5s g5s) {
        g5s.EIU(new C50520Fdg(this, 1));
    }

    public C50533Fdt(AnonymousClass0iw r1, E57 e57) {
        this.A01 = e57;
        this.A00 = r1;
    }

    public final void D5C(boolean z, String str) {
        E57 e57 = this.A01;
        AnonymousClass0iw r4 = this.A00;
        FragmentActivity activity = e57.getActivity();
        UserSession userSession = e57.A01;
        AnonymousClass0fN.A00(C49133Epw.A00(activity, new C50036FJv(e57, 1), r4, userSession, AnonymousClass05K.A1F, DbX.A0q(userSession), e57.A01.A06));
    }
}
