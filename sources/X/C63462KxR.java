package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.KxR  reason: case insensitive filesystem */
public abstract class C63462KxR {
    public static final boolean A00(UserSession userSession, Product product, User user) {
        String str;
        String str2;
        AnonymousClass7TG.A1N(userSession, product);
        User user2 = product.A0B;
        if (user != null) {
            str = user.getId();
        } else {
            str = userSession.A06;
        }
        if (user2 != null) {
            str2 = AnonymousClass3ZA.A00(user2);
        } else {
            str2 = null;
        }
        return C51966G9m.A1a(str2, str);
    }
}
