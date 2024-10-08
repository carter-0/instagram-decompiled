package X;

import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Tqo  reason: case insensitive filesystem */
public final class C14152Tqo extends AnonymousClass369 {
    public final C320216s0 A00;
    public final C14031ToX A01;
    public final Set A02 = new HashSet();

    public final Class C9I() {
        return User.class;
    }

    public final void FN9(AnonymousClass345 r4, int i) {
        Object A012 = this.A01.A01(i);
        if (A012 instanceof User) {
            User user = (User) A012;
            if (this.A02.add(user.getId())) {
                this.A00.A0A(user, i);
            }
        }
    }

    public C14152Tqo(C320216s0 r2, C14031ToX toX) {
        this.A01 = toX;
        this.A00 = r2;
    }
}
