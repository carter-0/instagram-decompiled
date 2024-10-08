package X;

import android.graphics.Typeface;
import android.text.Spannable;
import com.instagram.android.R;

/* renamed from: X.Mcr  reason: case insensitive filesystem */
public final class C66805Mcr extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C66805Mcr(Typeface typeface, Spannable spannable, int i, int i2) {
        this.A03 = spannable;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = typeface;
    }

    public final boolean equals(Object obj) {
        C66805Mcr mcr;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C66805Mcr)) {
                    return false;
                }
                mcr = (C66805Mcr) obj;
                if (!(mcr.A00 == 0 && this.A02 == mcr.A02 && this.A01 == mcr.A01 && this.A04 == mcr.A04)) {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C66805Mcr)) {
                    return false;
                }
                mcr = (C66805Mcr) obj;
                if (!(mcr.A00 == 1 && this.A04 == mcr.A04 && this.A02 == mcr.A02 && this.A01 == mcr.A01)) {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C66805Mcr) {
                    C66805Mcr mcr2 = (C66805Mcr) obj;
                    if (mcr2.A00 == 2 && 0qQ.A0K(this.A03, mcr2.A03) && this.A02 == mcr2.A02 && this.A01 == mcr2.A01) {
                        obj2 = this.A04;
                        obj3 = mcr2.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        obj2 = this.A03;
        obj3 = mcr.A03;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r1 = r3.A00
            switch(r1) {
                case 0: goto L_0x003f;
                case 1: goto L_0x001d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r3.A03
            int r2 = X.AnonymousClass7TE.A0K(r1)
            int r1 = r3.A02
            int r2 = r2 + r1
            int r2 = r2 * 31
            int r1 = r3.A01
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r3.A04
        L_0x0017:
            int r1 = r1.hashCode()
        L_0x001b:
            int r2 = r2 + r1
            return r2
        L_0x001d:
            java.lang.Object r1 = r3.A04
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x003c
            java.lang.String r1 = "SETTINGS"
        L_0x0028:
            int r2 = X.C51968G9o.A0F(r1, r2)
            int r1 = r3.A02
            int r2 = r2 + r1
            int r2 = r2 * 31
            int r1 = r3.A01
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r3.A03
            if (r1 != 0) goto L_0x0017
            r1 = 0
            goto L_0x001b
        L_0x003c:
            java.lang.String r1 = "SHARE"
            goto L_0x0028
        L_0x003f:
            int r1 = r3.A02
            int r2 = r1 * 31
            int r1 = r3.A01
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r3.A04
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r3.A03
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66805Mcr.hashCode():int");
    }

    public final String toString() {
        String str;
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ConsiderationActionButton(type=");
        Number number = (Number) this.A04;
        if (number == null) {
            str = "null";
        } else if (1 - number.intValue() != 0) {
            str = "SETTINGS";
        } else {
            str = "SHARE";
        }
        A1A.append(str);
        A1A.append(", drawableRes=");
        A1A.append(this.A02);
        A1A.append(Pxd.A00(45));
        A1A.append(this.A01);
        A1A.append(", tooltipText=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }

    public C66805Mcr(C266444Yx r2, Integer num, int i, int i2) {
        this.A04 = num;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = r2;
    }

    public C66805Mcr(C66802Mco mco, C62320sa r3, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A04 = mco;
        this.A03 = r3;
    }

    public C66805Mcr(Integer num) {
        this((C266444Yx) null, num, (int) R.drawable.instagram_settings_pano_outline_24, 2131961996);
    }
}
