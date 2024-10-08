package X;

import com.instagram.android.R;

/* renamed from: X.GmG  reason: case insensitive filesystem */
public final class C53330GmG extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03 = R.drawable.iglive_comment_composer_outline;
    public final C266444Yx A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53330GmG) {
                C53330GmG gmG = (C53330GmG) obj;
                if (!(this.A08 == gmG.A08 && this.A07 == gmG.A07 && this.A0E == gmG.A0E && this.A0G == gmG.A0G && 0qQ.A0K(this.A04, gmG.A04) && this.A0A == gmG.A0A && this.A09 == gmG.A09 && this.A0D == gmG.A0D && this.A0F == gmG.A0F && this.A0B == gmG.A0B && this.A0H == gmG.A0H && this.A0C == gmG.A0C && this.A03 == gmG.A03 && this.A02 == gmG.A02 && 0qQ.A0K(this.A05, gmG.A05) && this.A01 == gmG.A01 && Float.compare(this.A00, gmG.A00) == 0 && 0qQ.A0K(this.A06, gmG.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A06, AnonymousClass7TF.A00((((((((AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A07, C51965G9l.A05(this.A08)))))))))))) + this.A03) * 31) + this.A02) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + this.A01) * 31, this.A00));
    }

    public C53330GmG(C266444Yx r3, String str, String str2, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        0qQ.A0B(str2, 18);
        this.A08 = z;
        this.A07 = z2;
        this.A0E = z3;
        this.A0G = z4;
        this.A04 = r3;
        this.A0A = z5;
        this.A09 = z6;
        this.A0D = z7;
        this.A0F = z8;
        this.A0B = z9;
        this.A0H = z10;
        this.A0C = z11;
        this.A02 = i;
        this.A05 = str;
        this.A01 = i2;
        this.A00 = f;
        this.A06 = str2;
    }
}
