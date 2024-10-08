package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.Fo5  reason: case insensitive filesystem */
public final class C51075Fo5 implements G7S {
    public final int A00;
    public final Object A01;

    public C51075Fo5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DCw(Long l, Long l2, long j, long j2, boolean z) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                E3D e3d = (E3D) this.A01;
                C59689JTv.A0B(e3d.getActivity(), "something_went_wrong");
                IgdsSwitch igdsSwitch = e3d.A0L;
                if (igdsSwitch == null) {
                    0qQ.A0F("quietModeToggle");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    igdsSwitch.setChecked(!z);
                    return;
                }
            default:
                C59689JTv.A0B(DbZ.A0E(this.A01), "something_went_wrong");
                return;
        }
    }

    public final void Dov(Long l, Long l2, long j, long j2, boolean z) {
        String str;
        boolean z2 = z;
        switch (this.A00) {
            case 0:
                C50402FbA fbA = (C50402FbA) this.A01;
                UserSession userSession = fbA.A01;
                C46359DdX.A06(userSession);
                Dba.A1J(AnonymousClass1Nd.A00(userSession), true);
                ((C333517Zg) fbA.A02.get()).BSN().FLJ();
                AnonymousClass4DH r0 = fbA.A00;
                C49848F9n.A00(r0.requireContext(), r0.requireActivity(), userSession, AnonymousClass000.A00(1276));
                return;
            case 1:
                E3D e3d = (E3D) this.A01;
                E3D.A0F(e3d, z2);
                User A0P = Dba.A0P(e3d);
                if (!z) {
                    A0P.A0x(0sn.A00);
                } else if (!(l == null || l2 == null)) {
                    Dba.A0R(e3d).A05(l.longValue(), l2.longValue());
                }
                E3D.A0E(e3d, z2);
                return;
            default:
                long A08 = DbZ.A08(Calendar.getInstance()) / 1000;
                long j3 = j;
                long j4 = A08 + j;
                long j5 = j2;
                long j6 = A08 + j2;
                E3D e3d2 = (E3D) this.A01;
                IgTextView igTextView = e3d2.A05;
                if (igTextView == null) {
                    str = "fromRowValue";
                } else {
                    igTextView.setText(FGR.A01(e3d2.requireContext(), j4));
                    IgTextView igTextView2 = e3d2.A0J;
                    if (igTextView2 == null) {
                        str = "toRowValue";
                    } else {
                        igTextView2.setText(FGR.A01(e3d2.requireContext(), j6));
                        User A0P2 = Dba.A0P(e3d2);
                        AnonymousClass0eM r6 = e3d2.A0W;
                        C46359DdX.A07(AnonymousClass7TE.A0l(r6), A0P2, (List) null, j3, j5);
                        C46359DdX.A06(AnonymousClass7TE.A0l(r6));
                        if (!z) {
                            A0P2.A0x(0sn.A00);
                        } else if (!(l == null || l2 == null)) {
                            Dba.A0R(e3d2).A05(l.longValue(), l2.longValue());
                        }
                        E3D.A0E(e3d2, z2);
                        Dba.A1J(AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r6)), z2);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
        }
    }
}
