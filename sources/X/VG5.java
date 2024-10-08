package X;

import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class VG5 {
    public static final void A00(LinearLayout.LayoutParams layoutParams, LinearLayout linearLayout, String str) {
        TextView textView = new TextView(linearLayout.getContext());
        textView.setTextSize(15.0f);
        textView.setTextColor(-16711936);
        textView.setText(str);
        linearLayout.addView(textView, layoutParams);
    }
}
