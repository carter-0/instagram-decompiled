package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;

public final class FdQ implements C358618bC {
    public final /* synthetic */ IgdsSwitch A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ AnonymousClass3FW A02;
    public final /* synthetic */ E3D A03;

    public FdQ(IgdsSwitch igdsSwitch, User user, AnonymousClass3FW r3, E3D e3d) {
        this.A03 = e3d;
        this.A02 = r3;
        this.A00 = igdsSwitch;
        this.A01 = user;
    }

    public final boolean onToggle(boolean z) {
        Boolean A0u;
        E3D e3d = this.A03;
        AnonymousClass0eM r8 = e3d.A0W;
        UserSession A0l = AnonymousClass7TE.A0l(r8);
        AnonymousClass0iw r7 = e3d.A0U;
        AnonymousClass7TG.A1N(A0l, r7);
        DcM dcM = new DcM(r7, A0l);
        AnonymousClass3FW r6 = this.A02;
        F10 A0Q = Dbb.A0Q(r6, e3d);
        String str = e3d.A0N;
        0qQ.A0B(str, 1);
        DcM.A03(dcM, A0Q, "ig_quiet_mode_toggle_tapped", str);
        boolean z2 = z;
        if (!z && !C46359DdX.A08(AnonymousClass7TE.A0l(r8))) {
            if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r8), 36316001483296613L)) {
                C46359DdX.A05(AnonymousClass7TE.A0S(this.A00), e3d.requireActivity(), AnonymousClass7TE.A0l(r8), e3d.A0N);
                return true;
            }
        }
        UserSession A0l2 = AnonymousClass7TE.A0l(r8);
        AnonymousClass7TG.A1N(A0l2, r7);
        DcM dcM2 = new DcM(r7, A0l2);
        F10 A0Q2 = Dbb.A0Q(r6, e3d);
        User user = this.A01;
        boolean A1Z = user.A1Z();
        String str2 = e3d.A0N;
        long j = null;
        if (z) {
            A0u = null;
        } else {
            A0u = AnonymousClass7TE.A0u();
            j = 0L;
        }
        dcM2.A04(A0Q2, A0u, j, j, j, str2, z2, A1Z);
        user.A1D(z);
        E3D.A0G(e3d, z);
        return true;
    }
}
