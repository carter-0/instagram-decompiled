package X;

import android.graphics.Typeface;
import java.util.List;

/* renamed from: X.8ik  reason: invalid class name and case insensitive filesystem */
public final class C362938ik extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final Typeface A06;
    public final C306396Lz A07;
    public final C381609c2 A08;
    public final List A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C362938ik) {
                C362938ik r5 = (C362938ik) obj;
                if (!(this.A07 == r5.A07 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && this.A05 == r5.A05 && this.A0A == r5.A0A && 0qQ.A0K(this.A09, r5.A09) && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A08, r5.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextEffectParams(effectId=");
        sb.append(this.A07);
        sb.append(", intensity=");
        sb.append(this.A02);
        sb.append(", scale=");
        sb.append(this.A04);
        sb.append(", rotation=");
        sb.append(this.A03);
        sb.append(C273654mx.A00(444));
        sb.append(this.A00);
        sb.append(", fontThickness=");
        sb.append(this.A01);
        sb.append(", fontColor=");
        sb.append(this.A05);
        sb.append(", hasOutline=");
        sb.append(this.A0A);
        sb.append(", timeOffsets=");
        sb.append(this.A09);
        sb.append(", typeFace=");
        sb.append(this.A06);
        sb.append(", sparkleMetadata=");
        sb.append(this.A08);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((((((this.A07.hashCode() * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A05) * 31;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        List list = this.A09;
        int i3 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        Typeface typeface = this.A06;
        if (typeface == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = typeface.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        C381609c2 r0 = this.A08;
        if (r0 != null) {
            i3 = r0.hashCode();
        }
        return i5 + i3;
    }

    public C362938ik(Typeface typeface, C306396Lz r2, C381609c2 r3, List list, float f, float f2, float f3, float f4, float f5, int i, boolean z) {
        this.A07 = r2;
        this.A02 = f;
        this.A04 = f2;
        this.A03 = f3;
        this.A00 = f4;
        this.A01 = f5;
        this.A05 = i;
        this.A0A = z;
        this.A09 = list;
        this.A06 = typeface;
        this.A08 = r3;
    }
}
