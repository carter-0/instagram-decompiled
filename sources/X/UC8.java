package X;

import android.graphics.Typeface;
import android.widget.TextView;

public final class UC8 extends C249703kE {
    public final /* synthetic */ UAP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UC8(TextView textView, UAP uap, String str) {
        super(textView);
        0qQ.A0B(textView, 2);
        this.A00 = uap;
        textView.setText(str);
        if (UAP.A02(uap, 0)) {
            textView.setTypeface((Typeface) null, 1);
            textView.setTextSize(2, 16.0f);
        }
    }
}
