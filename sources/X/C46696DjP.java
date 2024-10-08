package X;

import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.DjP  reason: case insensitive filesystem */
public final class C46696DjP extends ClickableSpan {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ 1Ns A02;
    public final /* synthetic */ C316006kx A03;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        boolean z = false;
        textPaint.setUnderlineText(false);
        textPaint.setColor(-1);
        if (this.A02.CAm() == AnonymousClass05K.A1F) {
            z = true;
        }
        textPaint.setFakeBoldText(z);
    }

    public C46696DjP(C255773uh r1, C250973mM r2, 1Ns r3, C316006kx r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        C317116mk r0 = this.A03.A0E;
        if (r0 != null) {
            r0.DcP((RectF) null, this.A00, this.A01, AnonymousClass05K.A00, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
