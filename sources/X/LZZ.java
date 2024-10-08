package X;

import android.app.Activity;
import java.lang.ref.WeakReference;

public final class LZZ implements C13907Tl7 {
    public final AnonymousClass3E6 A00 = AnonymousClass3E4.A01(this, false, true);
    public final AnonymousClass0r6 A01;
    public final WeakReference A02;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.109, java.lang.Object] */
    public LZZ(Activity activity, AnonymousClass07V r6) {
        0qQ.A0B(r6, 2);
        this.A02 = C51965G9l.A0v(activity);
        this.A01 = 10b.A01(C71772f0.A00(r6), AnonymousClass0Zq.A00(new MGD(this, (AnonymousClass4D7) null, 0)), new Object(), 0);
        r6.A09(this);
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final void onResume(AnonymousClass07Z r3) {
        this.A00.DmJ((Activity) this.A02.get());
    }

    public final void onStop(AnonymousClass07Z r2) {
        this.A00.onStop();
    }
}
