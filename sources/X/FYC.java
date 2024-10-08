package X;

import com.instagram.user.model.User;

public final class FYC implements C232262tL {
    public final User A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FYC fyc = (FYC) obj;
        0qQ.A0B(fyc, 0);
        if (!0qQ.A0K(this.A00, fyc.A00) || !0qQ.A0K(this.A01, fyc.A01)) {
            return false;
        }
        return true;
    }

    public FYC(User user, String str) {
        AnonymousClass7TG.A1O(user, str);
        this.A00 = user;
        this.A01 = str;
    }
}
