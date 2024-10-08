package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;

/* renamed from: X.ALi  reason: case insensitive filesystem */
public final class C39966ALi implements LineBackgroundSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final Rect A04 = AnonymousClass7TE.A0W();
    public final RectF A05 = AnonymousClass7TE.A0Y();
    public final int[] A06;

    public C39966ALi(int[] iArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = iArr;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A03 = A0V;
        A0V.setColor(-1);
        AnonymousClass7TE.A1Q(A0V);
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        CharSequence charSequence2 = charSequence;
        AnonymousClass7TG.A1N(canvas2, paint2);
        0qQ.A0B(charSequence2, 7);
        String A032 = 0mp.A03(charSequence2.toString());
        Rect rect = this.A04;
        int i9 = i6;
        int i10 = i7;
        paint2.getTextBounds(A032, i9, i10, rect);
        int i11 = 0;
        if (charSequence2 instanceof Spannable) {
            0sC A002 = 0pe.A00(((Spanned) charSequence2).getSpans(i9, i10, ImageSpan.class));
            while (A002.hasNext()) {
                i11 += AnonymousClass7TF.A06(((DynamicDrawableSpan) A002.next()).getDrawable());
            }
        }
        int width = rect.width() + i11;
        int i12 = (i + i2) / 2;
        RectF rectF = this.A05;
        int i13 = width / 2;
        int i14 = this.A00;
        float f = (float) ((i12 - i13) - i14);
        int i15 = this.A01;
        float f2 = (float) (i14 + i12 + i13);
        rectF.set(f, (float) ((i4 + rect.top) - i15), f2, (float) (i4 + rect.bottom + i15));
        paint2.setShader(new LinearGradient(f, 0.0f, f2, 0.0f, this.A06, (float[]) null, Shader.TileMode.CLAMP));
        float f3 = (float) this.A02;
        canvas2.drawRoundRect(rectF, f3, f3, paint2);
        paint2.setShader((Shader) null);
    }
}
