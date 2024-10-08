package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;

/* renamed from: X.9qR  reason: invalid class name and case insensitive filesystem */
public final class C389919qR extends C379489Uc {
    public int A00;
    public int A01;
    public final int[] A02;

    public C389919qR(int[] iArr, int i, int i2, int i3, int i4) {
        super(-1, i, i2, false, i3, i4);
        this.A02 = iArr;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C380229Xd r1;
        AnonymousClass7TF.A1H(canvas, paint);
        CharSequence charSequence2 = charSequence;
        0qQ.A0B(charSequence2, 7);
        int i9 = i7;
        int i10 = i6;
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        if (charSequence2 instanceof Spannable) {
            int i11 = (i + i2) / 2;
            if (i11 != this.A00 || this.A0B.width() != this.A01) {
                this.A00 = i11;
                this.A01 = this.A0B.width();
                Spannable spannable = (Spannable) charSequence2;
                C380229Xd[] r12 = (C380229Xd[]) spannable.getSpans(i10, i9, C380229Xd.class);
                CharSequence subSequence = charSequence2.subSequence(i10, i9);
                if (r12.length > 0) {
                    r1 = r12[0];
                } else {
                    r1 = new C380229Xd(subSequence, (float[]) null, this.A02);
                    spannable.setSpan(r1, i10, i9, 18);
                }
                r1.A03 = subSequence.toString();
                r1.A00 = (float) i11;
            }
        }
    }
}
