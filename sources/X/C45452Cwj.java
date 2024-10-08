package X;

import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Cwj  reason: case insensitive filesystem */
public final class C45452Cwj {
    public User A00;
    public String A01;
    public List A02;

    public final User A00() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        0qQ.A0F("business");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List A01() {
        List list = this.A02;
        if (list != null) {
            List unmodifiableList = Collections.unmodifiableList(list);
            0qQ.A07(unmodifiableList);
            return unmodifiableList;
        }
        0qQ.A0F("imageUrlList");
        throw AnonymousClass00P.createAndThrow();
    }
}
