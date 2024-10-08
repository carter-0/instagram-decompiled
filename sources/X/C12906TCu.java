package X;

import android.app.AlertDialog;
import android.view.ContextThemeWrapper;
import com.facebook.smartcapture.view.IdCaptureActivity;

/* renamed from: X.TCu  reason: case insensitive filesystem */
public final class C12906TCu implements Runnable {
    public final /* synthetic */ IdCaptureActivity A00;

    public C12906TCu(IdCaptureActivity idCaptureActivity) {
        this.A00 = idCaptureActivity;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, java.lang.Object, com.facebook.smartcapture.view.IdCaptureActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    public final void run() {
        ? r3 = this.A00;
        if (!r3.isFinishing()) {
            new AlertDialog.Builder(new ContextThemeWrapper(r3, r3.A01().A00)).setTitle(2131972728).setCancelable(false).setPositiveButton(2131972729, SVE.A00(r3, 7)).show();
        }
    }
}
