package X;

import android.content.res.Resources;
import com.instagram.user.model.User;

/* renamed from: X.91O  reason: invalid class name */
public final class AnonymousClass91O extends AnonymousClass91P implements AnonymousClass6MR {
    public final User A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass91O(Resources resources, User user) {
        super(resources);
        0qQ.A0B(resources, 1);
        0qQ.A0B(user, 2);
        this.A00 = user;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.WUg, X.X6W] */
    public final X6W By4() {
        int i = this.A01;
        User user = this.A00;
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = user;
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass91O(User user, int i) {
        super(i);
        0qQ.A0B(user, 2);
        this.A00 = user;
    }
}
