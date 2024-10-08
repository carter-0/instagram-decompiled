package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FnD  reason: case insensitive filesystem */
public final class C51021FnD implements C330317Mh {
    public final int A00;
    public final int A01;
    public final Object A02;

    public final void onFail(C268654dm r1) {
    }

    public C51021FnD(UserSession userSession, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.FW3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.FW4, java.lang.Object] */
    public final void onSuccess(User user) {
        1Ng A002;
        AnonymousClass1qK r0;
        int i = this.A00;
        0qQ.A0B(user, 0);
        if (i != 0) {
            int i2 = this.A01;
            0lg r1 = (0lg) this.A02;
            0qQ.A0B(r1, 2);
            A002 = AnonymousClass1Nd.A00(r1);
            ? obj = new Object();
            obj.A01 = user;
            obj.A00 = i2;
            r0 = obj;
        } else {
            int i3 = this.A01;
            0lg r12 = (0lg) this.A02;
            0qQ.A0B(r12, 2);
            A002 = AnonymousClass1Nd.A00(r12);
            ? obj2 = new Object();
            obj2.A01 = user;
            obj2.A00 = i3;
            r0 = obj2;
        }
        A002.A00(r0);
    }
}
