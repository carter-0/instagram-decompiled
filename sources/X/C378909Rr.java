package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Rr  reason: invalid class name and case insensitive filesystem */
public abstract class C378909Rr {
    public static final List A00(ImageUrl imageUrl, ImageUrl imageUrl2, List list) {
        Iterator it = list.iterator();
        User user = null;
        User user2 = null;
        while (it.hasNext()) {
            AnonymousClass170 r1 = (AnonymousClass170) it.next();
            if (r1 instanceof User) {
                User user3 = (User) r1;
                if (0qQ.A0K(user3.Bh3(), imageUrl)) {
                    user = user3;
                }
                if (0qQ.A0K(user3.Bh3(), imageUrl2)) {
                    user2 = user3;
                }
            }
            if (user != null && (imageUrl2 == null || user2 != null)) {
                break;
            }
        }
        return 0sr.A1P(new User[]{user, user2});
    }
}
