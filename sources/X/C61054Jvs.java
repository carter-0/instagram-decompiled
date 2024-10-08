package X;

import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jvs  reason: case insensitive filesystem */
public final class C61054Jvs extends AnonymousClass0T0 {
    public Object A00;
    public final int A01;

    public C61054Jvs(User user) {
        this.A01 = 7;
        0qQ.A0B(user, 1);
        this.A00 = user;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61054Jvs) || ((C61054Jvs) obj).A01 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
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
            case 5:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
            case 6:
                if (this != obj) {
                    i = 6;
                    break;
                } else {
                    return true;
                }
            case 7:
                if (this != obj) {
                    i = 7;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 8;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A00, ((C61054Jvs) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C61054Jvs(List list, int i) {
        this.A01 = i;
        switch (i) {
            case 0:
            case 6:
            case 8:
                0qQ.A0B(list, 1);
                break;
        }
        this.A00 = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61054Jvs(AnonymousClass5GP r2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((AnonymousClass5GP) AnonymousClass5GO.A00);
        this.A01 = 5;
    }

    public C61054Jvs(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C61054Jvs(AnonymousClass5GP r2) {
        this.A01 = 5;
        this.A00 = r2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61054Jvs() {
        this((List) 0sn.A00, 0);
        this.A01 = 0;
        this.A01 = 0;
    }
}
