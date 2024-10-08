package X;

import com.instagram.user.model.User;

/* renamed from: X.Vj0  reason: case insensitive filesystem */
public final class C17966Vj0 {
    public boolean A00;
    public final User A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C17966Vj0 vj0 = (C17966Vj0) obj;
            if (this.A00 != vj0.A00 || !2PP.A00(this.A01, vj0.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A01, Boolean.valueOf(this.A00));
    }

    public C17966Vj0(User user, boolean z) {
        this.A01 = user;
        this.A00 = z;
    }
}
