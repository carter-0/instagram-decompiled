package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.GdJ  reason: case insensitive filesystem */
public final class C52827GdJ extends ClickableSpan {
    public final /* synthetic */ C243683Zu A00;
    public final /* synthetic */ C244003aU A01;
    public final /* synthetic */ AnonymousClass3ZU A02;
    public final /* synthetic */ AnonymousClass3W1 A03;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(this.A00.A04);
    }

    public C52827GdJ(C243683Zu r1, C244003aU r2, AnonymousClass3ZU r3, AnonymousClass3W1 r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C244003aU r1 = this.A01;
        AnonymousClass3ZU r4 = this.A02;
        r1.A00.A03(r4.A02.A01, r4.A04, this.A03.getPosition());
    }
}
