package X;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.SIh  reason: case insensitive filesystem */
public final class C11270SIh {
    @Deprecated
    public static final C11270SIh A0G;
    public static final String A0H = Integer.toString(18, 36);
    public static final String A0I = Integer.toString(12, 36);
    public static final String A0J = Integer.toString(17, 36);
    public static final String A0K = Integer.toString(4, 36);
    public static final String A0L = Integer.toString(6, 36);
    public static final String A0M = Integer.toString(5, 36);
    public static final String A0N = Integer.toString(2, 36);
    public static final String A0O = Integer.toString(7, 36);
    public static final String A0P = Integer.toString(8, 36);
    public static final String A0Q = Integer.toString(16, 36);
    public static final String A0R = Integer.toString(11, 36);
    public static final String A0S = Integer.toString(0, 36);
    public static final String A0T = Integer.toString(1, 36);
    public static final String A0U = Integer.toString(10, 36);
    public static final String A0V = Integer.toString(9, 36);
    public static final String A0W = Integer.toString(15, 36);
    public static final String A0X = Integer.toString(13, 36);
    public static final String A0Y = Integer.toString(14, 36);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Bitmap A0C;
    public final Layout.Alignment A0D;
    public final Layout.Alignment A0E;
    public final CharSequence A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C11270SIh sIh = (C11270SIh) obj;
            if (!TextUtils.equals(this.A0F, sIh.A0F) || this.A0E != sIh.A0E || this.A0D != sIh.A0D) {
                return false;
            }
            Bitmap bitmap = this.A0C;
            Bitmap bitmap2 = sIh.A0C;
            if (bitmap == null) {
                if (bitmap2 != null) {
                    return false;
                }
            } else if (bitmap2 == null || !bitmap.sameAs(bitmap2)) {
                return false;
            }
            if (!(this.A01 == sIh.A01 && this.A07 == sIh.A07 && this.A06 == sIh.A06 && this.A02 == sIh.A02 && this.A08 == sIh.A08 && this.A04 == sIh.A04 && this.A00 == sIh.A00 && this.A0B == sIh.A0B && this.A09 == sIh.A09 && this.A05 == sIh.A05 && this.A0A == sIh.A0A && this.A03 == sIh.A03)) {
                return false;
            }
        }
        return true;
    }

    static {
        S3W s3w = new S3W();
        s3w.A0E = "";
        A0G = s3w.A00();
    }

    public C11270SIh(Bitmap bitmap, Layout.Alignment alignment, Layout.Alignment alignment2, CharSequence charSequence, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, int i4, int i5) {
        CharSequence charSequence2;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            C11366SPh.A01(DbW.A1a(bitmap));
        }
        if (charSequence instanceof Spanned) {
            charSequence2 = SpannedString.valueOf(charSequence);
        } else {
            charSequence2 = charSequence != null ? charSequence.toString() : charSequence2;
            this.A0E = alignment;
            this.A0D = alignment2;
            this.A0C = bitmap;
            this.A01 = f;
            this.A07 = i;
            this.A06 = i2;
            this.A02 = f2;
            this.A08 = i3;
            this.A04 = f4;
            this.A00 = f5;
            this.A0B = -16777216;
            this.A09 = i4;
            this.A05 = f3;
            this.A0A = i5;
            this.A03 = f6;
        }
        this.A0F = charSequence2;
        this.A0E = alignment;
        this.A0D = alignment2;
        this.A0C = bitmap;
        this.A01 = f;
        this.A07 = i;
        this.A06 = i2;
        this.A02 = f2;
        this.A08 = i3;
        this.A04 = f4;
        this.A00 = f5;
        this.A0B = -16777216;
        this.A09 = i4;
        this.A05 = f3;
        this.A0A = i5;
        this.A03 = f6;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0F, this.A0E, this.A0D, this.A0C, Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Float.valueOf(this.A02), Integer.valueOf(this.A08), Float.valueOf(this.A04), Float.valueOf(this.A00), false, Integer.valueOf(this.A0B), Integer.valueOf(this.A09), Float.valueOf(this.A05), Integer.valueOf(this.A0A), Float.valueOf(this.A03)});
    }
}
