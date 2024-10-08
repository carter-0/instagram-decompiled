package X;

import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class Hd1 {
    public static final boolean A00(1Xj r2, User user) {
        List list;
        String str;
        ClipsShoppingInfoIntf Btl;
        List A0a = 00k.A0a(r2.A3B());
        C67231sQ A0n = C51966G9m.A0n(r2);
        if (A0n == null || (Btl = A0n.Btl()) == null) {
            list = 0sn.A00;
        } else {
            list = C17023VEx.A00(Btl);
        }
        ArrayList A0S = 00k.A0S(list, A0a);
        if (!(A0S instanceof Collection) || !A0S.isEmpty()) {
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                User user2 = ((Product) it.next()).A0B;
                if (user2 != null) {
                    str = AnonymousClass3ZA.A00(user2);
                } else {
                    str = null;
                }
                if (DbV.A1Z(user, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
