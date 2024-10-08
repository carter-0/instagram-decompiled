package X;

import android.content.res.Resources;
import android.widget.TextView;
import com.instagram.android.R;

public final class PW4 implements Runnable {
    public final /* synthetic */ TextView A00;

    public PW4(TextView textView) {
        this.A00 = textView;
    }

    public final void run() {
        TextView textView = this.A00;
        Resources resources = textView.getResources();
        0mq.A05(textView, textView.getMaxLines(), resources.getDimensionPixelSize(R.dimen.afi_margin_top), AnonymousClass7TE.A0F(resources));
    }
}
