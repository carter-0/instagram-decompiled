package X;

import android.text.Layout;

/* renamed from: X.S3a  reason: case insensitive filesystem */
public final class C10968S3a {
    public float A00;
    public float A01 = Float.MAX_VALUE;
    public int A02;
    public int A03 = -1;
    public int A04;
    public int A05 = -1;
    public int A06 = -1;
    public int A07 = -1;
    public int A08 = -1;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B = -1;
    public Layout.Alignment A0C;
    public Layout.Alignment A0D;
    public SF0 A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;

    public final void A00(C10968S3a s3a) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (s3a != null) {
            if (!this.A0I && s3a.A0I) {
                this.A04 = s3a.A04;
                this.A0I = true;
            }
            if (this.A03 == -1) {
                this.A03 = s3a.A03;
            }
            if (this.A06 == -1) {
                this.A06 = s3a.A06;
            }
            if (this.A0F == null && (str = s3a.A0F) != null) {
                this.A0F = str;
            }
            if (this.A07 == -1) {
                this.A07 = s3a.A07;
            }
            if (this.A0B == -1) {
                this.A0B = s3a.A0B;
            }
            if (this.A08 == -1) {
                this.A08 = s3a.A08;
            }
            if (this.A0D == null && (alignment2 = s3a.A0D) != null) {
                this.A0D = alignment2;
            }
            if (this.A0C == null && (alignment = s3a.A0C) != null) {
                this.A0C = alignment;
            }
            if (this.A0A == -1) {
                this.A0A = s3a.A0A;
            }
            if (this.A05 == -1) {
                this.A05 = s3a.A05;
                this.A00 = s3a.A00;
            }
            if (this.A0E == null) {
                this.A0E = s3a.A0E;
            }
            if (this.A01 == Float.MAX_VALUE) {
                this.A01 = s3a.A01;
            }
            if (!this.A0H && s3a.A0H) {
                this.A02 = s3a.A02;
                this.A0H = true;
            }
            if (this.A09 == -1 && (i = s3a.A09) != -1) {
                this.A09 = i;
            }
        }
    }
}
