package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.DjI  reason: case insensitive filesystem */
public final class C46689DjI extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C309786Zp A02;

    public C46689DjI(C255773uh r1, C309786Zp r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(View view) {
        this.A02.Ctw(this.A01);
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setColor(this.A00);
    }
}
