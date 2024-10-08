package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.6Ng  reason: invalid class name and case insensitive filesystem */
public final class C306726Ng extends ClickableSpan {
    public final /* synthetic */ C306736Nh A00;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setFakeBoldText(false);
    }

    public C306726Ng(C306736Nh r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        this.A00.DDb();
    }
}
