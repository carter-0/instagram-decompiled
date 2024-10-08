package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Ms0  reason: case insensitive filesystem */
public final class C67669Ms0 extends ClickableSpan {
    public final int A00;
    public final View.OnClickListener A01;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        this.A01.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setColor(this.A00);
    }

    public C67669Ms0(View.OnClickListener onClickListener, int i) {
        this.A01 = onClickListener;
        this.A00 = i;
    }
}
