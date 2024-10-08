package X;

import com.facebook.smartcapture.view.IdCaptureActivity;

/* renamed from: X.TCt  reason: case insensitive filesystem */
public final class C12905TCt implements Runnable {
    public final /* synthetic */ IdCaptureActivity A00;

    public C12905TCt(IdCaptureActivity idCaptureActivity) {
        this.A00 = idCaptureActivity;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.smartcapture.view.IdCaptureActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    public final void run() {
        ? r0 = this.A00;
        r0.finish();
        r0.A02().logFlowEnd();
    }
}
