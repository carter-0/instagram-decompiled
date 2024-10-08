package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spannable;

/* renamed from: X.9qS  reason: invalid class name and case insensitive filesystem */
public final class C389929qS extends C379489Uc {
    public int A00;
    public int A01;
    public final float[] A02;
    public final int[] A03;
    public final int[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C389929qS(float[] fArr, int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super(i, i2, i3, false, i3, i3);
        0qQ.A0B(iArr2, 6);
        this.A03 = iArr;
        this.A02 = fArr;
        this.A04 = iArr2;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        boolean A1U = AnonymousClass7TF.A1U(0, canvas2, paint2);
        CharSequence charSequence2 = charSequence;
        0qQ.A0B(charSequence2, 7);
        int i9 = i7;
        CharSequence charSequence3 = charSequence2;
        super.drawBackground(canvas2, paint2, i, i2, i3, i4, i5, charSequence3, i6, i9, i8);
        if (charSequence2 instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence2;
            CharSequence subSequence = charSequence2.subSequence(0, A1U ? 1 : 0);
            String obj = charSequence2.toString();
            int length = charSequence2.length();
            Rect rect = this.A0B;
            paint2.getTextBounds(obj, 0, length, rect);
            int width = rect.width();
            int i10 = ((i + i2) - width) / 2;
            int height = ((i3 + i5) - rect.height()) / 2;
            if (i10 != this.A00 || width != this.A01) {
                this.A00 = i10;
                this.A01 = width;
                Rect A0W = AnonymousClass7TE.A0W();
                paint2.getTextBounds(subSequence.toString(), 0, A1U, A0W);
                spannable.setSpan(new C380229Xd(charSequence2, (float[]) null, this.A04), A1U, i9, 18);
                int[] iArr = this.A03;
                float[] fArr = this.A02;
                spannable.setSpan(new C380219Xc(AnonymousClass05K.A01, fArr, iArr, i10, A0W.width() + i10, height, A0W.height() + height), 0, A1U, 18);
            }
        }
    }
}
