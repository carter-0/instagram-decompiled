package X;

import com.instagram.user.model.User;

public final class WSZ implements C232262tL {
    public Integer A00;
    public final User A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public WSZ(User user, Integer num, String str, boolean z, boolean z2) {
        0qQ.A0B(user, 1);
        this.A01 = user;
        this.A00 = num;
        this.A02 = str;
        this.A03 = z;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0R(this.A01.getId(), C49201Er6.A00(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        WSZ wsz = (WSZ) obj;
        User user2 = this.A01;
        Integer num = null;
        if (wsz != null) {
            user = wsz.A01;
        } else {
            user = null;
        }
        if (!0qQ.A0K(user2, user)) {
            return false;
        }
        Integer num2 = this.A00;
        if (wsz != null) {
            num = wsz.A00;
        }
        if (num2 == num && wsz != null && this.A03 == wsz.A03) {
            return true;
        }
        return false;
    }
}
