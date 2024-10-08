package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.GdE  reason: case insensitive filesystem */
public final class C52822GdE extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C244003aU A01;
    public final /* synthetic */ AnonymousClass3ZU A02;

    public C52822GdE(C244003aU r1, AnonymousClass3ZU r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void onClick(View view) {
        C244003aU r1 = this.A01;
        AnonymousClass3ZU r0 = this.A02;
        AnonymousClass3ZP r2 = r1.A00;
        r2.A01.D3N(r0.A02.A01);
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setColor(this.A00);
    }
}
