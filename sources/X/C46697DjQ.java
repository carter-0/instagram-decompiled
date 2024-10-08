package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.DjQ  reason: case insensitive filesystem */
public final class C46697DjQ extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C309426Yf A02;
    public final /* synthetic */ C309786Zp A03;

    public C46697DjQ(C255773uh r1, C309426Yf r2, C309786Zp r3, int i) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void onClick(View view) {
        C307366Pv.A04(this.A01, this.A02, this.A03);
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setColor(this.A00);
    }
}
