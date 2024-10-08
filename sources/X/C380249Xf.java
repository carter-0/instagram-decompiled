package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.9Xf  reason: invalid class name and case insensitive filesystem */
public final class C380249Xf extends ClickableSpan {
    public final /* synthetic */ C391629tO A00;
    public final /* synthetic */ AnonymousClass7SZ A01;
    public final /* synthetic */ boolean A02;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public C380249Xf(C391629tO r1, AnonymousClass7SZ r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void onClick(View view) {
        this.A01.A01(this.A00, (String) null, (String) null, this.A02);
    }
}
