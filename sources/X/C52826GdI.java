package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.GdI  reason: case insensitive filesystem */
public final class C52826GdI extends ClickableSpan {
    public final /* synthetic */ C238833Dp A00;
    public final /* synthetic */ C243323Yh A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;

    public final void onClick(View view) {
        0qQ.A0B(view, 0);
        this.A00.A0B(view, new String[0]);
        C243313Yg r3 = this.A01.A01;
        1Xj r2 = this.A02;
        AnonymousClass3W1 r1 = this.A03;
        r3.D2J(r2, r1, r1.getPosition());
    }

    public C52826GdI(C238833Dp r1, C243323Yh r2, 1Xj r3, AnonymousClass3W1 r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setFakeBoldText(true);
    }
}
