package X;

import com.instagram.user.model.User;

public final class FY5 implements C232262tL {
    public final F06 A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A01.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        FY5 fy5 = (FY5) obj;
        User user2 = this.A00.A01;
        if (fy5 != null) {
            user = fy5.A00.A01;
        } else {
            user = null;
        }
        return 2PP.A00(user2, user);
    }

    public FY5(F06 f06) {
        this.A00 = f06;
    }
}
