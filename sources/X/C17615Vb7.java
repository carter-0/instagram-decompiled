package X;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* renamed from: X.Vb7  reason: case insensitive filesystem */
public final class C17615Vb7 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final SpannableStringBuilder A05;
    public final CharSequence A06;

    public C17615Vb7(EditText editText) {
        this.A05 = new SpannableStringBuilder(editText.getText());
        this.A00 = editText.getTextSize();
        this.A02 = editText.getInputType();
        this.A06 = editText.getHint();
        this.A04 = editText.getMinLines();
        this.A03 = editText.getMaxLines();
        this.A01 = editText.getBreakStrategy();
    }
}
