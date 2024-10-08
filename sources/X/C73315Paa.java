package X;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Paa  reason: case insensitive filesystem */
public final class C73315Paa implements Runnable {
    public final /* synthetic */ C72550PAh A00;
    public final /* synthetic */ C72575PBg A01;
    public final /* synthetic */ C68818NYc A02;

    public C73315Paa(C72550PAh pAh, C72575PBg pBg, C68818NYc nYc) {
        this.A00 = pAh;
        this.A02 = nYc;
        this.A01 = pBg;
    }

    public final void run() {
        C68818NYc nYc = this.A02;
        C72575PBg pBg = this.A01;
        boolean z = nYc.A08;
        TextView textView = pBg.A04;
        if (z) {
            String str = nYc.A07;
            LinearLayout linearLayout = pBg.A02;
            textView.setText(W2t.A06(textView, str, R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding, linearLayout.getWidth() - (linearLayout.getPaddingStart() + linearLayout.getPaddingEnd())));
        } else {
            textView.setText(nYc.A07);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        textView.setTypeface(textView.getTypeface(), 1);
    }
}
