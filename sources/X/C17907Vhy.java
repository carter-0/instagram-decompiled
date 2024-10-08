package X;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;

/* renamed from: X.Vhy  reason: case insensitive filesystem */
public final class C17907Vhy {
    public float A00 = 1.0f;
    public final DynamicLayout A01;
    public final SpannableStringBuilder A02;
    public final TextPaint A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final float A06;

    public final void A00(float f) {
        if (this.A00 != f) {
            this.A03.setTextSize(this.A06 * f);
            SpannableStringBuilder spannableStringBuilder = this.A02;
            spannableStringBuilder.replace(0, 0, spannableStringBuilder.subSequence(0, 0));
            this.A00 = f;
        }
    }

    public C17907Vhy(Layout.Alignment alignment, SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, 0rN r13) {
        this.A02 = spannableStringBuilder;
        this.A03 = textPaint;
        this.A01 = new DynamicLayout(spannableStringBuilder, textPaint, r13.A00, alignment, r13.A02, r13.A01, false);
        0eO r2 = 0eO.A02;
        this.A05 = AnonymousClass0eN.A00(r2, new MMR(this, 49));
        this.A06 = textPaint.getTextSize();
        this.A04 = AnonymousClass0eN.A00(r2, C20647Wwf.A00);
    }
}
