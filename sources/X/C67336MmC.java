package X;

import android.app.Activity;
import com.facebook.fixie.fixes.common.MediaSessionANRFixer$1;

/* renamed from: X.MmC  reason: case insensitive filesystem */
public final /* synthetic */ class C67336MmC implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ MediaSessionANRFixer$1 A01;

    public /* synthetic */ C67336MmC(Activity activity, MediaSessionANRFixer$1 mediaSessionANRFixer$1) {
        this.A01 = mediaSessionANRFixer$1;
        this.A00 = activity;
    }

    public final void run() {
        MediaSessionANRFixer$1 mediaSessionANRFixer$1 = this.A01;
        Activity activity = this.A00;
        0HX r2 = mediaSessionANRFixer$1.A00.A03;
        if (r2 != null) {
            r2.A01(activity, 0HC.A00(), false);
        }
    }
}
