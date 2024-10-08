package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.JdQ  reason: case insensitive filesystem */
public final class C60017JdQ extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final String A02;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public C60017JdQ(C60155Jga jga, String str, int i) {
        this.A00 = i;
        this.A01 = jga;
        this.A02 = str;
    }

    public final void onClick(View view) {
        Object lwU;
        int i = this.A00;
        0V2 r2 = ((C60155Jga) this.A01).A02;
        String str = this.A02;
        if (i != 0) {
            lwU = new C65595LwV(str);
        } else {
            lwU = new C65594LwU(str);
        }
        r2.FIA(lwU);
    }
}
