package X;

import com.instagram.user.model.User;

/* renamed from: X.MmA  reason: case insensitive filesystem */
public final class C67334MmA implements C232262tL {
    public final int A00;
    public final User A01;
    public final String A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        C67334MmA mmA = (C67334MmA) obj;
        User user2 = this.A01;
        if (mmA != null) {
            user = mmA.A01;
        } else {
            user = null;
        }
        return 0qQ.A0K(user2, user);
    }

    public C67334MmA(User user, String str, int i, boolean z) {
        this.A01 = user;
        this.A02 = str;
        this.A00 = i;
        this.A03 = z;
    }
}
