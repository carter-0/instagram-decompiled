package X;

import android.text.TextPaint;

/* renamed from: X.ONi  reason: case insensitive filesystem */
public final class C70836ONi {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final TextPaint A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70836ONi) {
                C70836ONi oNi = (C70836ONi) obj;
                if (!(0qQ.A0K(this.A07, oNi.A07) && this.A05 == oNi.A05 && this.A02 == oNi.A02 && this.A03 == oNi.A03 && Float.compare(this.A00, oNi.A00) == 0 && Float.compare(this.A01, oNi.A01) == 0 && this.A08 == oNi.A08 && this.A04 == oNi.A04 && this.A06 == oNi.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A00(AnonymousClass7TF.A00((((((AnonymousClass7TE.A0K(this.A07) + this.A05) * 31) + this.A02) * 31) + this.A03) * 31, this.A00), this.A01)) + this.A04) * 31) + C51968G9o.A03(this.A06);
    }

    public C70836ONi(TextPaint textPaint, float f, float f2, int i, int i2, int i3, int i4, long j, boolean z) {
        this.A07 = textPaint;
        this.A05 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A08 = z;
        this.A04 = i4;
        this.A06 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextDisplayParams(textPaint=");
        A1A.append(this.A07);
        A1A.append(", viewWidth=");
        A1A.append(this.A05);
        A1A.append(", compoundPaddingLeft=");
        A1A.append(this.A02);
        A1A.append(", compoundPaddingRight=");
        A1A.append(this.A03);
        A1A.append(", lineSpacingExtra=");
        A1A.append(this.A00);
        A1A.append(", lineSpacingMultiplier=");
        A1A.append(this.A01);
        A1A.append(", includeFontPadding=");
        A1A.append(this.A08);
        A1A.append(C273654mx.A00(448));
        A1A.append(this.A04);
        A1A.append(", wordIntervalMs=");
        A1A.append(this.A06);
        return AnonymousClass7TG.A0p(A1A);
    }
}
