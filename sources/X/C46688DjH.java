package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.DjH  reason: case insensitive filesystem */
public final class C46688DjH extends ClickableSpan {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ C316006kx A02;

    public C46688DjH(C255773uh r1, C250973mM r2, C316006kx r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C317116mk r3 = this.A02.A0E;
        if (r3 != null) {
            r3.Dw4(this.A00, this.A01, AnonymousClass05K.A00);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setColor(-1);
    }
}
