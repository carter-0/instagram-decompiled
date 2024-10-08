package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.Pa8  reason: case insensitive filesystem */
public final class C73290Pa8 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass61R A01;
    public final /* synthetic */ C67010Mgi A02;

    public C73290Pa8(View view, AnonymousClass61R r2, C67010Mgi mgi) {
        this.A02 = mgi;
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        AnonymousClass61R r2;
        CountDownTimer countDownTimer = this.A02.A02;
        if (countDownTimer != null && (r2 = this.A01) != null) {
            countDownTimer.start();
            ImageView imageView = (ImageView) this.A00;
            imageView.setVisibility(0);
            imageView.setImageDrawable(r2);
            r2.E2p();
        }
    }
}
