package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class IVH implements C367608rH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C267324bN A01;
    public final /* synthetic */ GDB A02;
    public final /* synthetic */ GJY A03;

    public IVH(C267324bN r1, GDB gdb, GJY gjy, int i) {
        this.A02 = gdb;
        this.A03 = gjy;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick() {
        1Xj r8;
        User user;
        AnonymousClass37E r4 = AnonymousClass37D.A00;
        GDB gdb = this.A02;
        FragmentActivity fragmentActivity = gdb.A0D;
        AnonymousClass37D A012 = r4.A01(fragmentActivity);
        if (A012 != null && ((AnonymousClass37F) A012).A0g) {
            DbX.A10(fragmentActivity, r4);
        }
        UserSession userSession = gdb.A0G;
        GJY gjy = this.A03;
        C270634h3 A0i = C51965G9l.A0i(gjy.A02, userSession);
        A0i.A07 = AnonymousClass5OC.TAB_DROPDOWN_MENU;
        DbU.A1M(fragmentActivity, A0i, userSession);
        GBE gbe = gdb.A0J;
        C51979GAc gAc = gbe.A19;
        C267324bN r0 = this.A01;
        if (r0 != null) {
            r8 = r0.A02;
        } else {
            r8 = null;
        }
        AnonymousClass93T r7 = gbe.A1D;
        int i = this.A00;
        C52209GJa gJa = gjy.A01;
        AnonymousClass7TF.A1C(gAc, 0, r7);
        if (r8 != null) {
            user = C51966G9m.A11(r8);
        } else {
            user = null;
        }
        if (!(gJa == null || r8 == null || user == null)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc, userSession), "instagram_clips_viewer_lane_button_tap");
            if (A0e.isSampled()) {
                C51979GAc.A01(A0e, gAc);
                String A2n = r8.A2n();
                if (A2n != null) {
                    G9t.A1J(A0e, A2n);
                    G9t.A1K(A0e, user.getId());
                    C51969G9p.A16(A0e, i);
                    C51970G9q.A1G(A0e, r7);
                    A0e.A8M(gJa, "lane_type");
                    C51972G9s.A14(A0e, r8);
                    C51965G9l.A1R(A0e, r7.AmZ());
                    AnonymousClass7TH.A0V(A0e);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        if (gjy == GJY.A0C) {
            C247383gF A002 = C247323g9.A00(userSession);
            C247353gC r02 = A002.A06;
            int i2 = A002.A00;
            0xY A0p = AnonymousClass7TE.A0p((1Av) r02.A07.getValue());
            A0p.E5Z("content_note_content_lane_nux_shown_count", i2);
            A0p.apply();
        }
    }
}
