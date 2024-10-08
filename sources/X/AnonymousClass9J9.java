package X;

import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.user.model.User;

/* renamed from: X.9J9  reason: invalid class name */
public final class AnonymousClass9J9 extends AnonymousClass0T0 implements C334127ai {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;
    public final String A03;

    public AnonymousClass9J9(User user, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = user;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9J9) || ((AnonymousClass9J9) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        Object obj2;
        Object obj3;
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
            default:
                if (this == obj) {
                    return true;
                }
                if (A00(2, obj)) {
                    AnonymousClass9J9 r3 = (AnonymousClass9J9) obj;
                    if (0qQ.A0K(this.A01, r3.A01) && 0qQ.A0K(this.A02, r3.A02)) {
                        obj2 = this.A03;
                        obj3 = r3.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!A00(i, obj)) {
            return false;
        }
        AnonymousClass9J9 r32 = (AnonymousClass9J9) obj;
        if (!0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A03, r32.A03)) {
            return false;
        }
        obj2 = this.A01;
        obj3 = r32.A01;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int i2;
        int hashCode2;
        switch (this.A00) {
            case 0:
                i = ((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31;
                Object obj = this.A01;
                if (obj != null) {
                    i2 = obj.hashCode();
                    break;
                } else {
                    i2 = 0;
                    break;
                }
            case 1:
                int hashCode3 = this.A02.hashCode() * 31;
                String str = this.A03;
                i = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                i2 = (hashCode3 + hashCode) * 31;
                Object obj2 = this.A01;
                if (obj2 != null) {
                    i = obj2.hashCode();
                    break;
                }
                break;
            default:
                Object obj3 = this.A01;
                i = 0;
                if (obj3 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj3.hashCode();
                }
                i2 = ((hashCode2 * 31) + this.A02.hashCode()) * 31;
                String str2 = this.A03;
                if (str2 != null) {
                    i = str2.hashCode();
                    break;
                }
                break;
        }
        return i + i2;
    }

    public AnonymousClass9J9(1bK r2, String str, String str2) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
    }

    public AnonymousClass9J9(UserPayFanclubUpsellParams userPayFanclubUpsellParams, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = userPayFanclubUpsellParams;
    }
}
