package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class VV9 {
    public final LinearLayout A00;
    public final TextView A01;
    public final TextView A02;

    public VV9(Context context, LinearLayout linearLayout) {
        TextView textView = new TextView(context);
        this.A01 = textView;
        textView.setTextSize(16.0f);
        textView.setPadding(50, 30, 50, 0);
        TextView textView2 = new TextView(context);
        this.A02 = textView2;
        textView2.setTextSize(12.0f);
        textView2.setPadding(50, 0, 50, 10);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        this.A00 = linearLayout;
    }
}
