package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OxI  reason: case insensitive filesystem */
public final class C72158OxI implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass7Z9 A01;
    public final /* synthetic */ C254793t3 A02;
    public final /* synthetic */ C67350MmR A03;
    public final /* synthetic */ List A04;

    public C72158OxI(AnonymousClass7Z9 r1, C254793t3 r2, C67350MmR mmR, List list, int i) {
        this.A00 = i;
        this.A03 = mmR;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = list;
    }

    public final void Eyr(AnonymousClass67Z r10) {
        15p r8;
        1NY r7;
        UserSession userSession;
        String str;
        String str2;
        0qQ.A0B(r10, 0);
        PE6 pe6 = new PE6(r10, 2);
        if (this.A00 == 29) {
            C67350MmR mmR = this.A03;
            C67350MmR mmR2 = C67350MmR.ADMINS_AND_MODERATORS;
            userSession = this.A01.A00;
            String A0x = C66580MXl.A0x(this.A02);
            List list = this.A04;
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            if (mmR == mmR2) {
                while (it.hasNext()) {
                    DbY.A1W(A0p, it);
                }
                0qQ.A0B(A0x, 1);
                if (DbT.A1b(A0p)) {
                    r8 = null;
                    r7 = AnonymousClass7TG.A0a(userSession);
                    C66583MXo.A1F(r7, "direct_v2/invite_moderators_to_channel/", A0x);
                    str = OXI.A00(A0p);
                    str2 = "invited_moderator_igids";
                } else {
                    return;
                }
            } else {
                while (it.hasNext()) {
                    DbY.A1W(A0p, it);
                }
                0qQ.A0B(A0x, 1);
                if (DbT.A1b(A0p)) {
                    r8 = null;
                    r7 = AnonymousClass7TG.A0a(userSession);
                    C66583MXo.A1F(r7, "direct_v2/invite_collaborators_to_broadcast_chat/", A0x);
                    str = OXI.A00(A0p);
                    str2 = "invited_collaborator_igids";
                } else {
                    return;
                }
            }
        } else {
            userSession = this.A01.A00;
            String A0x2 = C66580MXl.A0x(this.A02);
            List list2 = this.A04;
            ArrayList A0p2 = AnonymousClass7TF.A0p(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                DbY.A1W(A0p2, it2);
            }
            0qQ.A0B(A0x2, 1);
            if (DbT.A1b(A0p2)) {
                r8 = null;
                r7 = AnonymousClass7TG.A0a(userSession);
                r7.A0K("direct_v2/threads/%s/add_user/", new Object[]{A0x2});
                str = OXI.A00(A0p2);
                str2 = "user_ids";
            } else {
                return;
            }
        }
        r7.A9m(str2, str);
        1OC A0R = DbT.A0R(r8, r7, AnonymousClass74W.class, AnonymousClass74X.class, false);
        A0R.A00 = new C47371Dwh(userSession, pe6, 4);
        1ES.A03(A0R);
    }
}
