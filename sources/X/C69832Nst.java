package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Nst  reason: case insensitive filesystem */
public abstract class C69832Nst {
    public static final C61073JwB A00(User user) {
        String id = user.getId();
        ImageUrl Bh3 = user.Bh3();
        String A08 = AnonymousClass50n.A08(user);
        0qQ.A07(A08);
        return new C61073JwB(Bh3, id, A08, user.getUsername(), 9);
    }
}
