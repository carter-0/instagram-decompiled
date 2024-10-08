package X;

import android.content.res.Resources;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Wng  reason: case insensitive filesystem */
public final /* synthetic */ class C20241Wng implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextView A01;

    public /* synthetic */ C20241Wng(TextView textView, int i) {
        this.A01 = textView;
        this.A00 = i;
    }

    public final void run() {
        TextView textView = this.A01;
        int i = this.A00;
        Resources resources = textView.getResources();
        0mq.A05(textView, textView.getMaxLines(), resources.getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size_smaller), resources.getDimensionPixelSize(R.dimen.question_response_card_response_text_max_size));
        CharSequence A012 = C252993q2.A01(new 0rN(Layout.Alignment.ALIGN_NORMAL, textView.getPaint(), (String) null, 0.0f, 1.0f, textView.getMeasuredWidth(), false), "", textView.getText(), "…", textView.getMaxLines(), false);
        if (A012.length() != textView.getText().length()) {
            A012 = TextUtils.concat(new CharSequence[]{A012, "…"});
        }
        textView.setText(A012, TextView.BufferType.SPANNABLE);
        textView.setTextColor(i);
    }
}
