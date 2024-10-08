package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Mb1  reason: case insensitive filesystem */
public final class C66694Mb1 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Drawable A05;
    public final Drawable A06;
    public final Drawable A07;
    public final C66720MbR A08;
    public final C66720MbR A09;
    public final C74541Pwa A0A;
    public final Integer A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66694Mb1) {
                C66694Mb1 mb1 = (C66694Mb1) obj;
                if (!(0qQ.A0K(this.A08, mb1.A08) && this.A04 == mb1.A04 && this.A03 == mb1.A03 && 0qQ.A0K(this.A09, mb1.A09) && 0qQ.A0K(this.A05, mb1.A05) && 0qQ.A0K(this.A07, mb1.A07) && 0qQ.A0K(this.A06, mb1.A06) && this.A00 == mb1.A00 && this.A0D == mb1.A0D && 0qQ.A0K(this.A0A, mb1.A0A) && this.A02 == mb1.A02 && this.A01 == mb1.A01 && this.A0C == mb1.A0C && this.A0B == mb1.A0B && this.A0E == mb1.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A0D;
        int A092 = AnonymousClass7TF.A09(this.A0C, (((((AnonymousClass7TF.A09(z, ((((((((((((((AnonymousClass7TG.A0C(this.A08) * 31) + this.A04) * 31) + this.A03) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A0A)) * 31) + this.A02) * 31) + this.A01) * 31);
        Integer num = this.A0B;
        return DbS.A06(this.A0E, AnonymousClass7TG.A0B(num, C48844El6.A00(num), A092));
    }

    public C66694Mb1(Drawable drawable, Drawable drawable2, Drawable drawable3, C66720MbR mbR, C66720MbR mbR2, C74541Pwa pwa, Integer num, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.A08 = mbR;
        this.A04 = i;
        this.A03 = i2;
        this.A09 = mbR2;
        this.A05 = drawable;
        this.A07 = drawable2;
        this.A06 = drawable3;
        this.A00 = i3;
        this.A0D = z;
        this.A0A = pwa;
        this.A02 = i4;
        this.A01 = i5;
        this.A0C = z2;
        this.A0B = num;
        this.A0E = z3;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("InboxThreadDigestViewModel(digest=");
        A1A.append(this.A08);
        A1A.append(", prefixRes=");
        A1A.append(this.A04);
        A1A.append(", prefixColor=");
        A1A.append(this.A03);
        A1A.append(", timestamp=");
        A1A.append(this.A09);
        A1A.append(", leftDrawable=");
        A1A.append(this.A05);
        A1A.append(", rightDrawable=");
        A1A.append(this.A07);
        A1A.append(", lockDrawable=");
        A1A.append(this.A06);
        A1A.append(", drawablePadding=");
        A1A.append(this.A00);
        A1A.append(", isDrawablesRelativeWithIntrinsicBounds=");
        A1A.append(this.A0D);
        A1A.append(", vaultContext=");
        A1A.append(this.A0A);
        A1A.append(", numUnreadMessages=");
        A1A.append(this.A02);
        A1A.append(", maxUnreadMessageCount=");
        A1A.append(this.A01);
        A1A.append(", digestIsUnreadMessages=");
        A1A.append(this.A0C);
        A1A.append(", threadDigestType=");
        Integer num = this.A0B;
        if (num != null) {
            str = C48844El6.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", isUnwatchedClipsOnly=");
        return G9t.A1C(A1A, this.A0E);
    }
}
