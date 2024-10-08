package X;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.DjC  reason: case insensitive filesystem */
public final class C46683DjC extends ClickableSpan {
    public final int A00;
    public final Uri A01;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        0kR.A0F(view.getContext(), this.A01);
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A00);
        textPaint.setUnderlineText(true);
    }

    public C46683DjC(Uri uri, int i) {
        this.A01 = uri;
        this.A00 = i;
    }
}
