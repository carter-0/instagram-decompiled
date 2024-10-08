package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fmb  reason: case insensitive filesystem */
public final class C50988Fmb implements C322776wO {
    public final /* synthetic */ C47528E6o A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ List A02;

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public C50988Fmb(C47528E6o e6o, User user, List list) {
        this.A00 = e6o;
        this.A01 = user;
        this.A02 = list;
    }

    public final void DBy() {
        String str;
        C47528E6o e6o = this.A00;
        E9N e9n = e6o.A03;
        if (e9n == null) {
            str = "userListAdapter";
        } else {
            e9n.A04 = null;
            e9n.A0A = false;
            User user = this.A01;
            if (user != null) {
                List list = this.A02;
                if (list != null) {
                    1OC A03 = C320126ro.A03(AnonymousClass7TE.A0l(e6o.A0C), list);
                    A03.A00 = new C47692EDb(7, (Object) user, (Object) e6o, (Object) list);
                    e6o.schedule(A03);
                    return;
                }
                C47528E6o.A01(e6o, user);
                return;
            }
            C51916G7k g7k = e6o.A0A;
            C50915Fku fku = e6o.A01;
            if (fku == null) {
                str = "searchBarController";
            } else {
                g7k.Dhk(fku.A01);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
