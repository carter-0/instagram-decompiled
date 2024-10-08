package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.GdA  reason: case insensitive filesystem */
public final class C52818GdA extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C244003aU A01;

    public C52818GdA(C244003aU r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(View view) {
        this.A01.A00.A01.D2r();
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setColor(this.A00);
    }
}
