package X;

import com.instagram.user.model.User;

/* renamed from: X.Gqq  reason: case insensitive filesystem */
public final class C53575Gqq extends AnonymousClass0T0 implements C59506JMe {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;

    public C53575Gqq(28D r2, String str) {
        AnonymousClass7TG.A1O(r2, str);
        this.A01 = r2;
        this.A02 = str;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53575Gqq) || ((C53575Gqq) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A00(1, obj)) {
                return false;
            }
            C53575Gqq gqq = (C53575Gqq) obj;
            if (!0qQ.A0K(this.A02, gqq.A02)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = gqq.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!A00(0, obj)) {
                return false;
            }
            C53575Gqq gqq2 = (C53575Gqq) obj;
            if (this.A01 != gqq2.A01) {
                return false;
            }
            obj2 = this.A02;
            obj3 = gqq2.A02;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        int hashCode;
        if (this.A00 != 0) {
            A0K = AnonymousClass7TE.A0O(this.A02);
            hashCode = AnonymousClass7TG.A0C(this.A01);
        } else {
            A0K = AnonymousClass7TE.A0K(this.A01);
            hashCode = this.A02.hashCode();
        }
        return A0K + hashCode;
    }

    public C53575Gqq(User user, String str) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = user;
    }
}
