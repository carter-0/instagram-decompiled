package X;

import android.hardware.camera2.CameraExtensionSession;
import java.util.concurrent.Executor;

/* renamed from: X.9XT  reason: invalid class name */
public final class AnonymousClass9XT extends CameraExtensionSession.StateCallback {
    public C40176AUq A00;
    public final /* synthetic */ C340887lz A01;
    public final /* synthetic */ Executor A02;

    public AnonymousClass9XT(C340887lz r1, Executor executor) {
        this.A01 = r1;
        this.A02 = executor;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) {
        C340887lz r3 = this.A01;
        Executor executor = this.A02;
        C40176AUq aUq = this.A00;
        if (aUq == null || aUq.A00 != cameraExtensionSession) {
            aUq = new C40176AUq(cameraExtensionSession, executor);
            this.A00 = aUq;
        }
        if (r3.A03 == 2) {
            r3.A03 = 0;
            r3.A05 = AnonymousClass7TE.A0v();
            r3.A04 = aUq;
            r3.A01.A01();
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        C340887lz r2 = this.A01;
        Executor executor = this.A02;
        C40176AUq aUq = this.A00;
        if (aUq == null || aUq.A00 != cameraExtensionSession) {
            this.A00 = new C40176AUq(cameraExtensionSession, executor);
        }
        if (r2.A03 == 1) {
            r2.A03 = 0;
            r2.A05 = false;
            r2.A01.A01();
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        C340887lz r3 = this.A01;
        Executor executor = this.A02;
        C40176AUq aUq = this.A00;
        if (aUq == null || aUq.A00 != cameraExtensionSession) {
            aUq = new C40176AUq(cameraExtensionSession, executor);
            this.A00 = aUq;
        }
        if (r3.A03 == 1) {
            r3.A03 = 0;
            r3.A05 = true;
            r3.A04 = aUq;
            r3.A01.A01();
        }
    }
}
