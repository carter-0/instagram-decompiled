package X;

import com.instagram.user.model.User;

public final class FYK implements C232262tL {
    public final User A00;
    public final K8D A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;

    public FYK(User user, K8D k8d, Integer num, boolean z, boolean z2) {
        0qQ.A0B(user, 1);
        this.A00 = user;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = num;
        this.A01 = k8d;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        FYK fyk = (FYK) obj;
        User user2 = this.A00;
        if (fyk != null) {
            user = fyk.A00;
        } else {
            user = null;
        }
        if (!0qQ.A0K(user2, user) || this.A04 != fyk.A04) {
            return false;
        }
        return true;
    }
}
