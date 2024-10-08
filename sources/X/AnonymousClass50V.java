package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.50V  reason: invalid class name */
public final class AnonymousClass50V extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C242813Wa A02;
    public final /* synthetic */ AnonymousClass3ZT A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ boolean A05;

    public final void updateDrawState(TextPaint textPaint) {
        int i;
        0qQ.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        if (this.A05 || this.A04 == AnonymousClass05K.A0C) {
            i = this.A00;
        } else {
            i = this.A01;
        }
        textPaint.setColor(i);
    }

    public AnonymousClass50V(C242813Wa r1, AnonymousClass3ZT r2, Integer num, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A05 = z;
        this.A04 = num;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void onClick(View view) {
        C242813Wa r2 = this.A02;
        if (r2 == null) {
            return;
        }
        if (this.A05 || this.A04 == AnonymousClass05K.A0C) {
            r2.D2k(this.A03.A00());
        }
    }
}
