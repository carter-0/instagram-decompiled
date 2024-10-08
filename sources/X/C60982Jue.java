package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jue  reason: case insensitive filesystem */
public final class C60982Jue extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C266444Yx A03;
    public final ImageUrl A04;
    public final ImageUrl A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final AnonymousClass3NV A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60982Jue) {
                C60982Jue jue = (C60982Jue) obj;
                if (!(this.A0E == jue.A0E && 0qQ.A0K(this.A04, jue.A04) && this.A0A == jue.A0A && 0qQ.A0K(this.A08, jue.A08) && 0qQ.A0K(this.A03, jue.A03) && this.A09 == jue.A09 && 0qQ.A0K(this.A06, jue.A06) && this.A00 == jue.A00 && this.A01 == jue.A01 && this.A0F == jue.A0F && this.A02 == jue.A02 && 0qQ.A0K(this.A05, jue.A05) && this.A0D == jue.A0D && 0qQ.A0K(this.A07, jue.A07) && this.A0B == jue.A0B && this.A0C == jue.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, (C51965G9l.A05(this.A0E) + AnonymousClass7TG.A0C(this.A04)) * 31);
        boolean z = this.A09;
        AnonymousClass3NV r0 = this.A0F;
        boolean z2 = this.A0D;
        return DbS.A06(this.A0C, AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A09(z2, (((AnonymousClass7TF.A07(r0, (((((AnonymousClass7TF.A09(z, (AnonymousClass7TF.A08(this.A08, A092) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A07)) * 31));
    }

    public C60982Jue(C266444Yx r2, ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass3NV r5, Integer num, Integer num2, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0E = z;
        this.A04 = imageUrl;
        this.A0A = z2;
        this.A08 = str;
        this.A03 = r2;
        this.A09 = z3;
        this.A06 = num;
        this.A00 = i;
        this.A01 = i2;
        this.A0F = r5;
        this.A02 = i3;
        this.A05 = imageUrl2;
        this.A0D = z4;
        this.A07 = num2;
        this.A0B = z5;
        this.A0C = z6;
    }
}
