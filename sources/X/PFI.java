package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class PFI implements C331527Ri {
    public final C331507Rg A00;
    public final AnonymousClass7SD A01;

    public PFI(C331507Rg r2, AnonymousClass7SD r3) {
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final String CDr() {
        return null;
    }

    public final boolean CKo() {
        return true;
    }

    public final boolean CdI(Context context, UserSession userSession) {
        return false;
    }

    public final boolean CdJ(Context context, UserSession userSession) {
        return false;
    }

    private final AnonymousClass7SD A00() {
        AnonymousClass7SD C6Q;
        C331507Rg r0 = this.A00;
        if (r0 == null || (C6Q = r0.C6Q()) == null) {
            return this.A01;
        }
        return C6Q;
    }

    public final List Aaq() {
        List list = A00().A0b;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(DbT.A0k(it).Bh3());
        }
        return 00k.A0a(A1C);
    }

    public final C69277Nid Azh() {
        boolean z = A00().A0r;
        if (z) {
            return C69277Nid.GVC_E2EE;
        }
        if (!z) {
            return C69277Nid.P2P_E2EE;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final Map BJ5() {
        return A00().A0e;
    }

    public final List BRV() {
        String obj;
        List list = A00().A0b;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long BST = DbT.A0k(it).BST();
            if (!(BST == null || (obj = BST.toString()) == null)) {
                A1C.add(obj);
            }
        }
        return A1C;
    }

    public final List BRX() {
        String obj;
        List list = A00().A0b;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long BST = DbT.A0k(it).BST();
            if (!(BST == null || (obj = BST.toString()) == null)) {
                A1C.add(obj);
            }
        }
        return A1C;
    }

    public final List BRZ() {
        return DbU.A0K(A00().A0b);
    }

    public final User BZK() {
        return (User) 00k.A0J(A00().A0b);
    }

    public final List Bk9() {
        String obj;
        List list = A00().A0b;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long BST = DbT.A0k(it).BST();
            if (!(BST == null || (obj = BST.toString()) == null)) {
                A1C.add(obj);
            }
        }
        return A1C;
    }

    public final String C6C() {
        return A00().A0Y;
    }

    public final String C6R() {
        Long l;
        C254793t3 r0 = A00().A0P;
        if (r0 == null || (l = C300965yF.A03(r0).A02) == null) {
            return null;
        }
        return l.toString();
    }

    public final int C6a() {
        return A00().A08;
    }

    public final String C6g(Context context, UserSession userSession) {
        String str;
        String str2 = A00().A0W;
        if (str2 != null) {
            return str2;
        }
        C254793t3 r0 = A00().A0P;
        if (r0 != null) {
            str = String.valueOf(C66580MXl.A07(r0));
        } else {
            str = null;
        }
        return 002.A0R("Thread: ", str);
    }

    public final String C6k() {
        C254793t3 r0 = A00().A0P;
        if (r0 != null) {
            return String.valueOf(C66580MXl.A07(r0));
        }
        return null;
    }

    public final String CDs() {
        return A00().A0X;
    }

    public final boolean CJW() {
        Integer num;
        Integer num2 = A00().A0R;
        if ((num2 == null || num2.intValue() != 4) && ((num = A00().A0R) == null || num.intValue() != 1)) {
            return false;
        }
        return true;
    }

    public final boolean CJY() {
        Integer num = A00().A0R;
        if (num != null && num.intValue() == 3) {
            return true;
        }
        Integer num2 = A00().A0R;
        if (num2 == null || num2.intValue() != 2) {
            return false;
        }
        return true;
    }

    public final boolean CUG() {
        return A00().A0r;
    }

    public final boolean CVE() {
        return A00().A0x;
    }

    public final boolean CVV() {
        return A00().A1A;
    }

    public final boolean CVr() {
        return A00().A0y;
    }

    public final boolean Ca9() {
        return A00().A16;
    }

    public final boolean CdH(Context context, UserSession userSession) {
        if (A00().A03 <= 1) {
            return false;
        }
        if (!C66640Ma9.A05(A00().A0b, A00().A0r)) {
            return true;
        }
        return false;
    }

    public final boolean CeM(Context context, UserSession userSession) {
        List BRZ = BRZ();
        if (BRZ.size() != 1) {
            return false;
        }
        User A0g = DbS.A0g(BRZ, 0);
        if (A0g.A0J() != 16V.A05 || !A0g.isVerified()) {
            return false;
        }
        return true;
    }
}
