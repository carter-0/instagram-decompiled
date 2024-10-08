package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9IM  reason: invalid class name */
public final class AnonymousClass9IM extends AnonymousClass0T0 {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass9IM(AnonymousClass51O r2, int i) {
        this.A02 = 4;
        0qQ.A0B(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A02) {
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
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass9IM)) {
                    return false;
                }
                AnonymousClass9IM r3 = (AnonymousClass9IM) obj;
                if (r3.A02 == 6 && 0qQ.A0K(this.A01, r3.A01) && this.A00 == r3.A00) {
                    return true;
                }
                return false;
            case 7:
                if (this != obj) {
                    i = 7;
                    break;
                } else {
                    return true;
                }
            case 8:
                if (this != obj) {
                    i = 8;
                    break;
                } else {
                    return true;
                }
            case 9:
                if (this != obj) {
                    i = 9;
                    break;
                } else {
                    return true;
                }
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof AnonymousClass9IM)) {
            return false;
        }
        AnonymousClass9IM r32 = (AnonymousClass9IM) obj;
        if (r32.A02 == i && this.A00 == r32.A00 && 0qQ.A0K(this.A01, r32.A01)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto L_0x0015;
                case 2: goto L_0x0020;
                case 3: goto L_0x0020;
                case 4: goto L_0x0020;
                case 5: goto L_0x0020;
                case 6: goto L_0x000a;
                case 7: goto L_0x0015;
                case 8: goto L_0x0020;
                case 9: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.Object r0 = r2.A01
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            int r0 = r2.A00
            goto L_0x001e
        L_0x0015:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.Object r0 = r2.A01
            if (r0 != 0) goto L_0x0026
            r0 = 0
        L_0x001e:
            int r1 = r1 + r0
            return r1
        L_0x0020:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.Object r0 = r2.A01
        L_0x0026:
            int r0 = r0.hashCode()
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IM.hashCode():int");
    }

    public AnonymousClass9IM(List list, int i, int i2) {
        this.A02 = i2;
        0qQ.A0B(list, 2);
        this.A00 = i;
        this.A01 = list;
    }

    public AnonymousClass9IM(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9IM(int i) {
        this((Object) null, 0, 7);
        this.A02 = i;
        if (2 - i != 0) {
            this.A02 = 7;
            return;
        }
        this.A02 = 2;
        this((List) 0sn.A00, 0, 2);
    }

    public AnonymousClass9IM(User user, int i) {
        this.A02 = 6;
        0qQ.A0B(user, 1);
        this.A01 = user;
        this.A00 = i;
    }

    public AnonymousClass9IM(int i, Object obj) {
        this.A02 = 5;
        0qQ.A0B(obj, 2);
        this.A00 = i;
        this.A01 = obj;
    }
}
