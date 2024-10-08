package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class I8K implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public I8K(Object obj, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession;
        int i2;
        String str;
        String str2;
        int i3;
        switch (this.A00) {
            case 0:
                userSession = (UserSession) this.A02;
                i2 = this.A01;
                str = this.A03;
                str2 = this.A04;
                i3 = 2;
                break;
            case 1:
                userSession = (UserSession) this.A02;
                i2 = this.A01;
                str = this.A03;
                str2 = this.A04;
                i3 = 3;
                break;
            case 2:
                C313756gx r1 = (C313756gx) this.A02;
                int i4 = this.A01;
                String str3 = this.A03;
                String str4 = this.A04;
                1Ln A0E = 1Ln.A0E(r1.A03);
                if (DbT.A1Y(A0E)) {
                    A0E.A0h(Long.valueOf(r1.A02));
                    A0E.A0l("resign_collaborator_cancel");
                    A0E.A0k("tap");
                    A0E.A0p(C66579MXk.A00(1074));
                    A0E.A0i(DbZ.A0b(A0E, "thread_details", str3, str4, i4));
                    A0E.Cgf();
                    break;
                }
                break;
            case 3:
                int i5 = this.A01;
                C69871NtZ.A00(((AnonymousClass7GX) this.A02).A00, this.A03, this.A04, "resign_moderator_cancel", "tap", C66579MXk.A00(1075), "thread_details", (HashMap) null, i5);
                break;
            default:
                C56516Hzn hzn = ((C55974Hqf) this.A02).A02;
                String str5 = this.A03;
                int i6 = this.A01;
                String str6 = this.A04;
                0Aj A0e = AnonymousClass7TE.A0e(hzn.A00, "instagram_clips_viewer_link_tap");
                Long A002 = C56516Hzn.A00(str5);
                if (A0e.isSampled() && A002 != null) {
                    C51968G9o.A1I(A0e, A002, "containermodule", "add_spin_nux");
                    C51969G9p.A16(A0e, i6);
                    C51965G9l.A1O(A0e, str6);
                    C51965G9l.A19(C52236GKd.A1E, A0e);
                    C51965G9l.A1C(AnonymousClass5OC.CLIPS_SPINS, A0e);
                    AnonymousClass7TH.A0V(A0e);
                    return;
                }
                return;
        }
        C71094OcU.A04(userSession, str, str2, i3, i2);
        dialogInterface.dismiss();
    }
}
