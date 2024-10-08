package X;

import android.view.View;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.M7u  reason: case insensitive filesystem */
public final class C66009M7u implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C315456jv A01;

    public C66009M7u(View view, C315456jv r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        C315456jv r2 = this.A01;
        AnonymousClass5Gt A0V = DbZ.A0V(r2.A03, 2131963423);
        A0V.A0G = true;
        A0V.A03(this.A00);
        A0V.A01();
        A0V.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        A0V.A04 = r2;
        AnonymousClass5Gv A002 = A0V.A00();
        r2.A00 = A002;
        A002.A07(r2.A04);
    }
}
