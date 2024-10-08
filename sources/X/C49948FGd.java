package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.FGd  reason: case insensitive filesystem */
public final class C49948FGd {
    public static final C49948FGd A00 = new Object();

    private final void A00(SpannableStringBuilder spannableStringBuilder, Spanned spanned, TextView textView, Object[] objArr, int i) {
        for (Object obj : objArr) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            spannableStringBuilder.setSpan(obj, spanStart, spanEnd, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(textView.getContext().getColor(i)), spanStart, spanEnd, 33);
        }
    }

    public static final void A01(ImageView imageView, int i) {
        0qQ.A0B(imageView, 0);
        DbX.A12(imageView.getContext(), imageView, i);
    }

    public static final void A02(TextView textView, int i) {
        Drawable mutate;
        Drawable mutate2;
        0qQ.A0B(textView, 0);
        ColorFilter A06 = DbV.A06(textView.getContext(), i);
        Drawable drawable = textView.getCompoundDrawables()[0];
        if (!(drawable == null || (mutate2 = drawable.mutate()) == null)) {
            mutate2.setColorFilter(A06);
        }
        Drawable drawable2 = textView.getCompoundDrawablesRelative()[0];
        if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
            mutate.setColorFilter(A06);
        }
    }

    public static final void A03(TextView textView, int i) {
        Spanned spanned;
        TextView textView2 = textView;
        0qQ.A0B(textView, 0);
        CharSequence text = textView.getText();
        if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
            SpannableStringBuilder A0C = DbS.A0C(textView.getText());
            Object[] spans = spanned.getSpans(0, textView.getText().length(), StyleSpan.class);
            if (spans == null) {
                spans = new StyleSpan[0];
            }
            C49948FGd fGd = A00;
            fGd.A00(A0C, spanned, textView2, spans, i);
            Object[] spans2 = spanned.getSpans(0, textView2.getText().length(), AnonymousClass7AK.class);
            0qQ.A0A(spans2);
            fGd.A00(A0C, spanned, textView2, spans2, i);
            textView2.setText(A0C);
        }
    }

    public static final void A04(SearchEditText searchEditText) {
        0qQ.A0B(searchEditText, 0);
        searchEditText.setClearButtonColorFilter(DbV.A06(searchEditText.getContext(), R.color.grey_5));
    }
}
