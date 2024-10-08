package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9IW  reason: invalid class name */
public final class AnonymousClass9IW extends AnonymousClass0T0 implements C334127ai {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    public AnonymousClass9IW(C333797aA r2, Integer num) {
        0qQ.A0B(num, 1);
        0qQ.A0B(r2, 2);
        this.A02 = num;
        this.A01 = r2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IW) || ((AnonymousClass9IW) obj).A00 != i) {
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
                if (this == obj) {
                    return true;
                }
                if (!A00(1, obj)) {
                    return false;
                }
                AnonymousClass9IW r3 = (AnonymousClass9IW) obj;
                if (this.A02 == r3.A02 && this.A01 == r3.A01) {
                    return true;
                }
                return false;
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj)) {
            return false;
        }
        AnonymousClass9IW r32 = (AnonymousClass9IW) obj;
        if (!0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A01, r32.A01)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        return r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        r1 = r1 * 31;
        r0 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A02
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x0030
            r0 = 0
        L_0x0012:
            int r1 = r1 + r0
            return r1
        L_0x0014:
            java.lang.Object r2 = r3.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r0 = X.C333837aE.A01(r2)
            int r1 = r0.hashCode()
            int r0 = r2.intValue()
            int r1 = r1 + r0
            goto L_0x002c
        L_0x0026:
            java.lang.Object r0 = r3.A02
            int r1 = r0.hashCode()
        L_0x002c:
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
        L_0x0030:
            int r0 = r0.hashCode()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IW.hashCode():int");
    }

    public AnonymousClass9IW(List list) {
        this.A02 = list;
        this.A01 = null;
    }

    public AnonymousClass9IW(C247733gp r2, User user) {
        0qQ.A0B(user, 1);
        this.A02 = user;
        this.A01 = r2;
    }
}
