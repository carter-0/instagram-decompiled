package X;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Dj7  reason: case insensitive filesystem */
public final class C46678Dj7 extends ClickableSpan {
    public final Uri A00;

    public C46678Dj7(Uri uri) {
        0qQ.A0B(uri, 1);
        this.A00 = uri;
    }

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        0kR.A0F(view.getContext(), this.A00);
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(false);
    }
}
