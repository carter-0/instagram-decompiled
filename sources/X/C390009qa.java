package X;

import android.content.res.Resources;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.EditText;
import com.instagram.android.R;

/* renamed from: X.9qa  reason: invalid class name and case insensitive filesystem */
public final class C390009qa extends W7f {
    public Spannable A00;
    public final int A01;
    public final DynamicLayout A02;
    public final SpannableStringBuilder A03;
    public final TextPaint A04;
    public final EditText A05;
    public final /* synthetic */ AOZ A06;

    public final void afterTextChanged(Editable editable) {
        int i;
        CharSequence charSequence = editable;
        if (TextUtils.isEmpty(editable)) {
            charSequence = this.A05.getHint();
        }
        charSequence.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        SpannableStringBuilder spannableStringBuilder2 = this.A03;
        spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), spannableStringBuilder);
        AOZ aoz = this.A06;
        float f = aoz.A05;
        float f2 = f * 0.05f;
        DynamicLayout dynamicLayout = this.A02;
        if (dynamicLayout != null) {
            i = dynamicLayout.getHeight();
        } else {
            i = 0;
        }
        int i2 = this.A01;
        if (i > i2 || dynamicLayout.getLineCount() > 2) {
            TextPaint textPaint = this.A04;
            float textSize = textPaint.getTextSize();
            while (true) {
                textSize -= f2;
                if (textSize < aoz.A06) {
                    EditText editText = this.A05;
                    Spannable spannable = this.A00;
                    spannable.getClass();
                    AOZ.A01(editText, spannable);
                    break;
                }
                textPaint.setTextSize(textSize);
                int i3 = 0;
                spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), spannableStringBuilder);
                if (dynamicLayout != null) {
                    i3 = dynamicLayout.getHeight();
                }
                if (i3 <= i2 && dynamicLayout.getLineCount() <= 2) {
                    this.A05.setTextSize(0, textSize);
                    break;
                }
            }
        } else {
            TextPaint textPaint2 = this.A04;
            float textSize2 = textPaint2.getTextSize();
            while (true) {
                textSize2 += f2;
                if (textSize2 > f) {
                    break;
                }
                textPaint2.setTextSize(textSize2);
                spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), spannableStringBuilder);
                if (dynamicLayout.getHeight() > i2 || dynamicLayout.getLineCount() > 2) {
                    textPaint2.setTextSize(this.A05.getTextSize());
                } else {
                    this.A05.setTextSize(0, textSize2);
                }
            }
            textPaint2.setTextSize(this.A05.getTextSize());
        }
        this.A00 = new SpannableStringBuilder(editable);
    }

    public C390009qa(EditText editText, AOZ aoz) {
        this.A06 = aoz;
        this.A05 = editText;
        TextPaint textPaint = new TextPaint(editText.getPaint());
        this.A04 = textPaint;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.A03 = spannableStringBuilder;
        Resources resources = editText.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.avatar_sticker_max_height) - (AnonymousClass7TE.A0E(resources) * 2);
        textPaint.density = resources.getDisplayMetrics().density;
        this.A02 = new DynamicLayout(spannableStringBuilder, textPaint, dimensionPixelSize, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        this.A01 = resources.getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size) - (resources.getDimensionPixelSize(R.dimen.accent_edge_thickness) * 2);
    }
}
