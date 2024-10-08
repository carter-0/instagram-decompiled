package X;

import com.instagram.user.model.User;
import java.util.Set;

public final class PRX implements G82 {
    public final /* synthetic */ NJ6 A00;

    public final boolean CZf(User user) {
        return false;
    }

    public final boolean CbR(User user) {
        return true;
    }

    public PRX(NJ6 nj6) {
        this.A00 = nj6;
    }

    public final void CtI(User user) {
        NJ6 nj6 = this.A00;
        C358248ab A0U = DbW.A0U(nj6);
        A0U.A05 = user.getUsername();
        A0U.A08(2131972094);
        A0U.A0s(true);
        A0U.A0Y(new C71183Of1(4, this, user), C358278ae.RED, nj6.getString(2131972039), true);
        DbX.A16(new C71175Oep(2), A0U);
    }

    public final boolean Dw3(User user, boolean z) {
        NJ6 nj6 = this.A00;
        if (z) {
            Set set = nj6.A0C;
            int size = set.size();
            OLT olt = nj6.A02;
            olt.getClass();
            if (size + olt.A01 >= 250) {
                C358248ab A0U = DbW.A0U(nj6);
                int i = 2131960294;
                if (nj6.A07) {
                    i = 2131960295;
                }
                A0U.A05 = DbV.A0z(nj6, Integer.valueOf(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), i);
                int i2 = 2131960292;
                if (nj6.A07) {
                    i2 = 2131960293;
                }
                A0U.A0q(nj6.getString(i2));
                A0U.A0s(true);
                A0U.A0E(new C71175Oep(1));
                DbT.A1V(A0U);
                String str = nj6.A03;
                if (str == null) {
                    return false;
                }
                O14.A00(nj6.A00).A00(nj6.A04, str);
                return false;
            }
            if (nj6.A03 != null) {
                Oy7 A002 = O14.A00(nj6.A00);
                String str2 = nj6.A04;
                String str3 = nj6.A03;
                AnonymousClass7TG.A1N(str2, str3);
                1Ln A0F = 1Ln.A0F(A002.A00);
                if (DbT.A1Y(A0F)) {
                    Dbb.A1G(A0F, A002.A01);
                    DbV.A1M(A0F, "jcs_select_recipient");
                    A0F.A0p("jcs_recipient_selection");
                    Dba.A1E(A0F, "story");
                    A0F.A0s(str2);
                    A0F.A0v(str3);
                    A0F.Cgf();
                }
            }
            set.add(user);
        } else {
            nj6.A0C.remove(user);
        }
        if (nj6.getActivity() != null) {
            Dbb.A0u(nj6);
        }
        NJ6.A00(nj6);
        return true;
    }
}
