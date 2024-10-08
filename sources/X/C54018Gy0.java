package X;

import android.text.TextPaint;
import android.view.View;

/* renamed from: X.Gy0  reason: case insensitive filesystem */
public final class C54018Gy0 extends AnonymousClass6TY {
    public final C62320sa A00;

    public C54018Gy0(C62320sa r2) {
        this.A00 = null;
        this.A01 = null;
        this.A00 = r2;
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public final void onClick(View view) {
        this.A00.invoke();
    }
}
