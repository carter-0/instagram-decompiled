package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jvo  reason: case insensitive filesystem */
public final class C61050Jvo extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C61050Jvo(ImageUrl imageUrl, ImageUrl imageUrl2, C60965JuN juN, C62320sa r6, C62320sa r7) {
        this.A00 = 0;
        String str = juN.A04;
        this.A00 = 0;
        this.A02 = juN;
        this.A06 = str;
        this.A05 = imageUrl;
        this.A03 = imageUrl2;
        this.A01 = r6;
        this.A04 = r7;
    }

    public final boolean equals(Object obj) {
        C61050Jvo jvo;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61050Jvo) {
                    jvo = (C61050Jvo) obj;
                    if (jvo.A00 == 0 && 0qQ.A0K(this.A02, jvo.A02) && 0qQ.A0K(this.A06, jvo.A06) && 0qQ.A0K(this.A05, jvo.A05)) {
                        obj2 = this.A03;
                        obj3 = jvo.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61050Jvo) {
                    C61050Jvo jvo2 = (C61050Jvo) obj;
                    if (jvo2.A00 == 1 && 0qQ.A0K(this.A06, jvo2.A06) && 0qQ.A0K(this.A04, jvo2.A04) && 0qQ.A0K(this.A03, jvo2.A03) && this.A05 == jvo2.A05 && 0qQ.A0K(this.A01, jvo2.A01)) {
                        obj4 = this.A02;
                        obj5 = jvo2.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61050Jvo) {
                    jvo = (C61050Jvo) obj;
                    if (jvo.A00 == 2 && this.A02 == jvo.A02 && 0qQ.A0K(this.A03, jvo.A03) && 0qQ.A0K(this.A06, jvo.A06)) {
                        obj2 = this.A05;
                        obj3 = jvo.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61050Jvo) {
                    C61050Jvo jvo3 = (C61050Jvo) obj;
                    if (jvo3.A00 == 3 && 0qQ.A0K(this.A04, jvo3.A04) && 0qQ.A0K(this.A06, jvo3.A06) && 0qQ.A0K(this.A05, jvo3.A05) && 0qQ.A0K(this.A02, jvo3.A02) && 0qQ.A0K(this.A03, jvo3.A03)) {
                        obj4 = this.A01;
                        obj5 = jvo3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!0qQ.A0K(obj2, obj3) || !0qQ.A0K(this.A01, jvo.A01)) {
            return false;
        }
        obj4 = this.A04;
        obj5 = jvo.A04;
        if (!0qQ.A0K(obj4, obj5)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x00a0;
                case 2: goto L_0x0039;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A04
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A06
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A01
        L_0x0033:
            int r1 = r0.hashCode()
        L_0x0037:
            int r2 = r2 + r1
            return r2
        L_0x0039:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x0070;
                case 2: goto L_0x0073;
                default: goto L_0x0042;
            }
        L_0x0042:
            java.lang.String r0 = "LOADING"
        L_0x0044:
            int r1 = X.C51968G9o.A0F(r0, r1)
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A06
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A04
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0037
        L_0x0070:
            java.lang.String r0 = "SOME_LOADED"
            goto L_0x0044
        L_0x0073:
            java.lang.String r0 = "FAILED"
            goto L_0x0044
        L_0x0076:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A06
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A05
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A03
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A04
            goto L_0x0033
        L_0x00a0:
            java.lang.String r0 = r3.A06
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A05
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            if (r0 != 0) goto L_0x0033
            r1 = 0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61050Jvo.hashCode():int");
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Cta(id=");
        A1A.append(this.A06);
        A1A.append(", title=");
        A1A.append(this.A04);
        A1A.append(AnonymousClass000.A00(853));
        A1A.append(this.A03);
        A1A.append(", type=");
        A1A.append(this.A05);
        A1A.append(C66579MXk.A00(45));
        A1A.append(this.A01);
        A1A.append(", icon=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }

    public C61050Jvo(C266444Yx r3, C266444Yx r4, C266444Yx r5, C62555Khl khl, String str) {
        this.A00 = 1;
        this.A00 = 1;
        0qQ.A0B(str, 1);
        this.A06 = str;
        this.A04 = r3;
        this.A03 = r4;
        this.A05 = khl;
        this.A01 = r5;
        this.A02 = null;
    }

    public C61050Jvo(C61078JwG jwG, ImageUrl imageUrl, User user, Integer num, Integer num2, String str) {
        this.A00 = 3;
        this.A04 = imageUrl;
        this.A06 = str;
        this.A05 = user;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = jwG;
    }

    public C61050Jvo(Bitmap bitmap, Bitmap bitmap2, IQK iqk, Integer num, String str, List list) {
        this.A00 = 2;
        this.A02 = num;
        this.A03 = bitmap;
        this.A06 = str;
        this.A05 = iqk;
        this.A01 = list;
        this.A04 = bitmap2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61050Jvo() {
        this((Bitmap) null, (Bitmap) null, (IQK) null, AnonymousClass05K.A00, (String) null, (List) 0sn.A00);
        this.A00 = 2;
    }
}
