package X;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.5iS  reason: invalid class name and case insensitive filesystem */
public final class C292135iS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Layout.Alignment A09;
    public final TextDirectionHeuristic A0A;
    public final TextPaint A0B;
    public final TextUtils.TruncateAt A0C;
    public final CharSequence A0D;

    public C292135iS(Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A0D = charSequence;
        this.A02 = i;
        this.A0B = textPaint;
        this.A08 = i2;
        this.A0A = textDirectionHeuristic;
        this.A09 = alignment;
        this.A07 = i3;
        this.A0C = truncateAt;
        this.A01 = i4;
        this.A04 = i5;
        this.A00 = i6;
        this.A05 = i7;
        this.A06 = i8;
        this.A03 = i9;
        if (0 > i) {
            throw new IllegalArgumentException("invalid start value");
        } else if (i > charSequence.length()) {
            throw new IllegalArgumentException("invalid end value");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("invalid width value");
        } else if (i4 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
    }
}
