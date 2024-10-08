package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.uimanager.UIManagerHelper;

public final class U2K extends ClickableSpan implements C20838X0n {
    public final int A00;

    public final void onClick(View view) {
        Context A0C = JTP.A0C(view, 0);
        0qQ.A0C(A0C, Pxd.A00(248));
        Q6H q6h = (Q6H) A0C;
        int i = this.A00;
        C20877X2e A05 = UIManagerHelper.A05(q6h, i);
        if (A05 != null) {
            A05.APe(new W0S(UIManagerHelper.A00(q6h), i));
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
    }

    public U2K(int i) {
        this.A00 = i;
    }
}
