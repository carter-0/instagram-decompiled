package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.Gd7  reason: case insensitive filesystem */
public final class C52815Gd7 extends CharacterStyle implements UpdateAppearance {
    public final C289645dx A00;

    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        PathEffect pathEffect;
        if (textPaint != null) {
            C289645dx r3 = this.A00;
            if (0qQ.A0K(r3, C289635dw.A00)) {
                AnonymousClass7TE.A1Q(textPaint);
            } else if (r3 instanceof C298575tg) {
                textPaint.setStyle(Paint.Style.STROKE);
                C298575tg r32 = (C298575tg) r3;
                textPaint.setStrokeWidth(r32.A01);
                textPaint.setStrokeMiter(r32.A00);
                if (r32.A03 == 0) {
                    join = Paint.Join.MITER;
                } else {
                    join = Paint.Join.ROUND;
                }
                textPaint.setStrokeJoin(join);
                int i = r32.A02;
                if (i == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = Paint.Cap.SQUARE;
                }
                textPaint.setStrokeCap(cap);
                C13866Tin tin = r32.A04;
                if (tin != null) {
                    pathEffect = ((C56878IFz) tin).A00;
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }

    public C52815Gd7(C289645dx r1) {
        this.A00 = r1;
    }
}
