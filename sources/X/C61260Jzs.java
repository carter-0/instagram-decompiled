package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jzs  reason: case insensitive filesystem */
public final class C61260Jzs extends AnonymousClass0T0 implements MRK {
    public final int A00;
    public final Object A01;

    public C61260Jzs(DwR dwR) {
        this.A00 = 4;
        this.A01 = dwR;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61260Jzs) || ((C61260Jzs) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((C61260Jzs) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C61260Jzs(User user, int i) {
        this.A00 = i;
        0qQ.A0B(user, 1);
        this.A01 = user;
    }

    public C61260Jzs(List list) {
        this.A00 = 0;
        this.A01 = list;
    }
}
