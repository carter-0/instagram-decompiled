package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6vX  reason: invalid class name and case insensitive filesystem */
public abstract class C322276vX {
    public static final List A00(UserSession userSession, 1Xj r2, User user, int i) {
        List Alu;
        1Xj r0;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        if (!(!r2.A5D() || r2.A0C.Alu() == null || (Alu = r2.A0C.Alu()) == null || (r0 = (1Xj) 00k.A0O(Alu, i)) == null)) {
            r2 = r0;
        }
        if (user == null) {
            return 0sn.A00;
        }
        if (!A03(userSession, r2, user, i)) {
            return A02(user, r2.A3B());
        }
        List<BG0> A01 = A01(user, r2.A3n(userSession));
        ArrayList arrayList = new ArrayList();
        for (BG0 bg0 : A01) {
            ProductDetailsProductItemDict productDetailsProductItemDict = bg0.A00;
            if (productDetailsProductItemDict != null) {
                arrayList.add(new Product((TaggingFeedSessionInformation) null, productDetailsProductItemDict));
            }
        }
        return arrayList;
    }

    public static final boolean A03(UserSession userSession, 1Xj r3, User user, int i) {
        List Alu;
        1Xj r0;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        if (!(!r3.A5D() || r3.A0C.Alu() == null || (Alu = r3.A0C.Alu()) == null || (r0 = (1Xj) 00k.A0O(Alu, i)) == null)) {
            r3 = r0;
        }
        if (r3.CcK()) {
            return false;
        }
        if ((r3.A5T() || r3.A5E()) && A02(user, r3.A3B()).isEmpty() && (!A01(user, r3.A3n(userSession)).isEmpty())) {
            return true;
        }
        return false;
    }

    public static final List A01(User user, List list) {
        String str;
        User user2;
        if (user == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            ProductDetailsProductItemDict productDetailsProductItemDict = ((BG0) next).A00;
            if (productDetailsProductItemDict == null || (user2 = productDetailsProductItemDict.A0G) == null) {
                str = null;
            } else {
                str = AnonymousClass3ZA.A00(user2);
            }
            if (0qQ.A0K(str, user.getId())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final List A02(User user, List list) {
        String str;
        if (user == null || list == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            User user2 = ((Product) next).A0B;
            if (user2 != null) {
                str = AnonymousClass3ZA.A00(user2);
            } else {
                str = null;
            }
            if (0qQ.A0K(str, user.getId())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
