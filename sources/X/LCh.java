package X;

import android.content.Context;
import android.widget.TextView;
import java.util.Arrays;

public final class LCh {
    public int A00 = -1;
    public final TextView A01;

    public LCh(TextView textView) {
        0qQ.A0B(textView, 1);
        this.A01 = textView;
    }

    public final void A00(float f) {
        int A04 = JTO.A04(f, 100.0f);
        if (A04 != this.A00) {
            this.A00 = A04;
            TextView textView = this.A01;
            Context context = textView.getContext();
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) A04) / 10.0f)}, 1));
            0qQ.A07(format);
            DbX.A13(context, textView, format, 2131955428);
        }
    }
}
