package X;

import com.instagram.user.model.User;

/* renamed from: X.N5n  reason: case insensitive filesystem */
public final class C68198N5n extends AnonymousClass0T0 implements C232262tL {
    public final User A00;
    public final Integer A01;
    public final String A02;

    public C68198N5n(User user, Integer num, String str) {
        0qQ.A0B(user, 2);
        this.A02 = str;
        this.A00 = user;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68198N5n) {
                C68198N5n n5n = (C68198N5n) obj;
                if (!0qQ.A0K(this.A02, n5n.A02) || !0qQ.A0K(this.A00, n5n.A00) || this.A01 != n5n.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        String username = this.A00.getUsername();
        Integer num = this.A01;
        if (num != null) {
            str = C69981NvL.A00(num);
        } else {
            str = "null";
        }
        return 002.A0R(username, str);
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02));
        Integer num = this.A01;
        return A07 + C51971G9r.A0D(num, C69981NvL.A00(num));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C68198N5n n5n = (C68198N5n) obj;
        String str2 = this.A02;
        if (n5n != null) {
            str = n5n.A02;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str2, str) || !0qQ.A0K(this.A00, n5n.A00) || this.A01 != n5n.A01) {
            return false;
        }
        return true;
    }
}
