package X;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.LinearLayout;
import net.trustly.android.sdk.views.TrustlyView;

public final /* synthetic */ class TJM implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ S43 A02;

    public /* synthetic */ TJM(S43 s43, float f, float f2) {
        this.A02 = s43;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void run() {
        S43 s43 = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        TrustlyView trustlyView = s43.A00;
        DisplayMetrics A0E = AnonymousClass7TF.A0E(trustlyView.getContext());
        trustlyView.setLayoutParams(new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, f, A0E), (int) TypedValue.applyDimension(1, f2, A0E)));
    }
}
