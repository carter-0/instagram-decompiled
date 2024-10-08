package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.5Dj  reason: invalid class name and case insensitive filesystem */
public final class C282515Dj extends ClickableSpan {
    public final /* synthetic */ C244023aW A00;
    public final /* synthetic */ C243683Zu A01;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        this.A00.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.A01.A07);
    }

    public C282515Dj(C244023aW r1, C243683Zu r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
