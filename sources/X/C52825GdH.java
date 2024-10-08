package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.GdH  reason: case insensitive filesystem */
public final class C52825GdH extends ClickableSpan {
    public final /* synthetic */ C2803551k A00;
    public final /* synthetic */ C2803451j A01;
    public final /* synthetic */ AnonymousClass3W1 A02;

    public C52825GdH(C2803551k r1, C2803451j r2, AnonymousClass3W1 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        C2803551k r0 = this.A00;
        C2803451j r3 = this.A01;
        r0.A00.A01.D3C(r3.A00, this.A02);
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
    }
}
