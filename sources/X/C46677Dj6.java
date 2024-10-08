package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Dj6  reason: case insensitive filesystem */
public final class C46677Dj6 extends ClickableSpan {
    public final /* synthetic */ View.OnClickListener A00;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        this.A00.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setColor(-1);
        textPaint.setUnderlineText(false);
    }

    public C46677Dj6(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
