package X;

import java.util.Arrays;

/* renamed from: X.8fs  reason: invalid class name and case insensitive filesystem */
public final class C361228fs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C361238ft A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public float[] A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C361228fs) {
                C361228fs r5 = (C361228fs) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A06 == r5.A06 && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A09 == r5.A09 && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A02 == r5.A02 && 0qQ.A0K(this.A0D, r5.A0D) && 0qQ.A0K(this.A0B, r5.A0B) && 0qQ.A0K(this.A0C, r5.A0C) && 0qQ.A0K(this.A0A, r5.A0A) && 0qQ.A0K(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RenderParameters(colorTransfer=");
        sb.append(this.A00);
        sb.append(", outputColorTransfer=");
        sb.append(this.A01);
        sb.append(", isClearEnabled=");
        sb.append(this.A06);
        sb.append(", isDisplayEnabled=");
        sb.append(this.A07);
        sb.append(", isOpaque=");
        sb.append(this.A08);
        sb.append(", isTransparent=");
        sb.append(this.A09);
        sb.append(", isBlendEnabled=");
        sb.append(this.A05);
        sb.append(", outputViewportWidth=");
        sb.append(this.A03);
        sb.append(", outputViewportHeight=");
        sb.append(this.A02);
        sb.append(", textureTransformMatrix=");
        sb.append(Arrays.toString(this.A0D));
        sb.append(", cropTransformMatrix=");
        sb.append(Arrays.toString(this.A0B));
        sb.append(", inContentTransformMatrix=");
        sb.append(Arrays.toString(this.A0C));
        sb.append(", contentTransformMatrix=");
        sb.append(Arrays.toString(this.A0A));
        sb.append(", hdrMetadata=");
        sb.append(this.A04);
        sb.append(", backgroundRenderer=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = ((this.A00 * 31) + this.A01) * 31;
        int i2 = 1237;
        if (this.A06) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        int i4 = 1237;
        if (this.A07) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A08) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A09) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A05) {
            i10 = 1231;
        }
        int i11 = (((((i9 + i10) * 31) + this.A03) * 31) + this.A02) * 31;
        float[] fArr = this.A0D;
        if (fArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(fArr);
        }
        int i12 = (i11 + hashCode) * 31;
        float[] fArr2 = this.A0B;
        if (fArr2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Arrays.hashCode(fArr2);
        }
        int i13 = (i12 + hashCode2) * 31;
        float[] fArr3 = this.A0C;
        if (fArr3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = Arrays.hashCode(fArr3);
        }
        int i14 = (i13 + hashCode3) * 31;
        float[] fArr4 = this.A0A;
        if (fArr4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = Arrays.hashCode(fArr4);
        }
        int i15 = (i14 + hashCode4) * 31;
        C361238ft r0 = this.A04;
        if (r0 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r0.hashCode();
        }
        return (i15 + hashCode5) * 31;
    }
}
