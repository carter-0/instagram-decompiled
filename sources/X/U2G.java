package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class U2G extends ClickableSpan {
    public final /* synthetic */ C14176TrF A00;
    public final /* synthetic */ boolean A01;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public U2G(C14176TrF trF, boolean z) {
        this.A00 = trF;
        this.A01 = z;
    }

    public final void onClick(View view) {
        C14176TrF.A03(this.A00, this.A01);
    }
}
