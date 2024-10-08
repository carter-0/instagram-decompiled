package X;

import com.instagram.user.model.User;

public final class FYI implements C232262tL {
    public boolean A00;
    public final User A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FYI fyi = (FYI) obj;
        0qQ.A0B(fyi, 0);
        if (DbV.A1Z(fyi.A01, this.A01.getId()) && this.A00 == fyi.A00 && this.A03 == fyi.A03) {
            return true;
        }
        return false;
    }

    public FYI(User user, String str, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1O(user, str);
        this.A01 = user;
        this.A02 = str;
        this.A04 = z;
        this.A00 = z2;
        this.A03 = z3;
    }
}
