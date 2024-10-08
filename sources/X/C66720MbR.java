package X;

import android.text.SpannableString;

/* renamed from: X.MbR  reason: case insensitive filesystem */
public final class C66720MbR extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C66720MbR(SpannableString spannableString, String str, int i, int i2) {
        this.A04 = 1;
        this.A02 = spannableString;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        C66720MbR mbR;
        Class<?> cls;
        switch (this.A04) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C66720MbR)) {
                    return false;
                }
                mbR = (C66720MbR) obj;
                if (!(mbR.A04 == 0 && 0qQ.A0K(this.A03, mbR.A03) && this.A00 == mbR.A00 && this.A01 == mbR.A01)) {
                    return false;
                }
            case 1:
                if (this != obj) {
                    Class<?> cls2 = getClass();
                    if (obj != null) {
                        cls = obj.getClass();
                    } else {
                        cls = null;
                    }
                    if (0qQ.A0K(cls2, cls) && (obj instanceof C66720MbR)) {
                        C66720MbR mbR2 = (C66720MbR) obj;
                        if (mbR2.A04 == 1 && 0qQ.A0K(this.A02.toString(), mbR2.A02.toString()) && this.A00 == mbR2.A00 && this.A01 == mbR2.A01) {
                            obj2 = this.A03;
                            obj3 = mbR2.A03;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C66720MbR)) {
                    return false;
                }
                mbR = (C66720MbR) obj;
                if (!(mbR.A04 == 2 && this.A01 == mbR.A01 && this.A00 == mbR.A00 && 0qQ.A0K(this.A03, mbR.A03))) {
                    return false;
                }
        }
        obj2 = this.A02;
        obj3 = mbR.A02;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x002f;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r2.A01
            int r1 = r0 * 31
            int r0 = r2.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
        L_0x0014:
            java.lang.Object r0 = r2.A02
            if (r0 == 0) goto L_0x004c
            int r0 = r0.hashCode()
        L_0x001c:
            int r1 = r1 + r0
            return r1
        L_0x001e:
            java.lang.String r0 = r2.A03
            int r1 = X.AnonymousClass7TE.A0O(r0)
            int r0 = r2.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            goto L_0x0014
        L_0x002f:
            java.lang.Object r0 = r2.A02
            java.lang.String r0 = r0.toString()
            int r1 = X.AnonymousClass7TE.A0O(r0)
            int r0 = r2.A00
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x004c
            int r0 = r0.hashCode()
            goto L_0x001c
        L_0x004c:
            r0 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66720MbR.hashCode():int");
    }

    public final String toString() {
        if (1 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Text(text=");
        A1A.append(this.A02);
        A1A.append(", color=");
        A1A.append(this.A00);
        A1A.append(", style=");
        A1A.append(this.A01);
        A1A.append(", contentDescription=");
        return C51975G9x.A0i(this.A03, A1A);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C66720MbR(String str, int i, int i2) {
        this((Integer) null, str, i, i2);
        this.A04 = 0;
    }

    public C66720MbR(Integer num, String str, int i, int i2) {
        this.A04 = 0;
        0qQ.A0B(str, 1);
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = num;
    }

    public C66720MbR() {
        this.A04 = 2;
        this.A04 = 2;
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = "";
        this.A02 = null;
    }
}
