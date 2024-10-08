package X;

import android.graphics.Paint;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.OhJ  reason: case insensitive filesystem */
public abstract class C71278OhJ implements LeadingMarginSpan {
    public float A00;
    public int A01;
    public Paint A02;

    public final void A00(Paint paint) {
        if (this.A02 == null) {
            Paint paint2 = new Paint(paint);
            this.A02 = paint2;
            paint2.setColor(this.A01);
            this.A02.setStyle(Paint.Style.FILL);
        }
    }

    public final int getLeadingMargin(boolean z) {
        return (int) this.A00;
    }
}
