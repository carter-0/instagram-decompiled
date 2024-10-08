package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Pb9  reason: case insensitive filesystem */
public final class C73350Pb9 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ NHY A02;
    public final /* synthetic */ C2367935c A03;

    public C73350Pb9(Context context, ImageView imageView, NHY nhy, C2367935c r4) {
        this.A03 = r4;
        this.A02 = nhy;
        this.A01 = imageView;
        this.A00 = context;
    }

    public final void run() {
        NHY nhy = this.A02;
        ImageView imageView = this.A01;
        0qQ.A0A(imageView);
        Context context = this.A00;
        if (nhy.A02 == C69321NjM.SPARKLE) {
            AnonymousClass61R A002 = C303756Aq.A00(context, R.raw.ig_reels_celebrations_sparkle_gradient_fill);
            imageView.setImageDrawable(A002);
            if (A002 != null) {
                A002.EFK();
                A002.E2p();
            }
        }
    }
}
