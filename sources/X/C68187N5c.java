package X;

import com.instagram.user.model.User;

/* renamed from: X.N5c  reason: case insensitive filesystem */
public final class C68187N5c extends AnonymousClass0T0 implements C232262tL {
    public final User A00;
    public final int A01;

    public C68187N5c(User user, int i) {
        0qQ.A0B(user, 1);
        this.A00 = user;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68187N5c) {
                C68187N5c n5c = (C68187N5c) obj;
                if (!0qQ.A0K(this.A00, n5c.A00) || this.A01 != n5c.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        User user;
        C68187N5c n5c = (C68187N5c) obj;
        String id = this.A00.getId();
        if (n5c == null || (user = n5c.A00) == null) {
            str = null;
        } else {
            str = user.getId();
        }
        return 0qQ.A0K(id, str);
    }
}
