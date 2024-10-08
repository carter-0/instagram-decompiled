package X;

import android.graphics.Bitmap;

/* renamed from: X.89v  reason: invalid class name */
public final class AnonymousClass89v extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Bitmap.Config A03;
    public final 0sP A04;
    public final 0sP A05;
    public final 0sP A06;
    public final 0sL A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass89v) {
                AnonymousClass89v r5 = (AnonymousClass89v) obj;
                if (this.A02 != r5.A02 || this.A01 != r5.A01 || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A04, r5.A04) || this.A03 != r5.A03 || this.A00 != r5.A00 || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((this.A02 * 31) + this.A01) * 31) + this.A05.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A06.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitmapGeneratorParams(targetWidth=");
        sb.append(this.A02);
        sb.append(Pxd.A00(122));
        sb.append(this.A01);
        sb.append(", calculateThumbnailCount=");
        sb.append(this.A05);
        sb.append(", calculateFrameTimeMs=");
        sb.append(this.A07);
        sb.append(", _segmentBitmapId=");
        sb.append(this.A04);
        sb.append(", bitmapConfig=");
        sb.append(this.A03);
        sb.append(", maxBytesPerBitmap=");
        sb.append(this.A00);
        sb.append(", generateSize=");
        sb.append(this.A06);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass89v(Bitmap.Config config, 0sP r2, 0sP r3, 0sP r4, 0sL r5, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A05 = r2;
        this.A07 = r5;
        this.A04 = r3;
        this.A03 = config;
        this.A00 = i3;
        this.A06 = r4;
    }
}
