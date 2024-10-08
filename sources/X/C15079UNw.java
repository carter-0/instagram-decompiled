package X;

import com.instagram.user.model.User;

/* renamed from: X.UNw  reason: case insensitive filesystem */
public final class C15079UNw extends AnonymousClass0T0 implements C232262tL {
    public final C18622VvF A00;
    public final User A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15079UNw) {
                C15079UNw uNw = (C15079UNw) obj;
                if (!0qQ.A0K(this.A01, uNw.A01) || !0qQ.A0K(this.A02, uNw.A02) || !0qQ.A0K(this.A00, uNw.A00) || this.A03 != uNw.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String A0r = C13989Tnp.A0r(this.A01);
        0qQ.A0A(A0r);
        return A0r;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A01))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        C15079UNw uNw = (C15079UNw) obj;
        User user2 = this.A01;
        if (uNw != null) {
            user = uNw.A01;
        } else {
            user = null;
        }
        if (!0qQ.A0K(user2, user) || !0qQ.A0K(this.A02, uNw.A02) || !0qQ.A0K(this.A00, uNw.A00) || this.A03 != uNw.A03) {
            return false;
        }
        return true;
    }

    public C15079UNw(C18622VvF vvF, User user, String str, boolean z) {
        this.A01 = user;
        this.A02 = str;
        this.A00 = vvF;
        this.A03 = z;
    }
}
