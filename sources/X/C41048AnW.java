package X;

import android.util.Log;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.AnW  reason: case insensitive filesystem */
public final class C41048AnW implements Runnable {
    public final /* synthetic */ B22 A00;
    public final /* synthetic */ Exception A01;

    public C41048AnW(B22 b22, Exception exc) {
        this.A00 = b22;
        this.A01 = exc;
    }

    public final void run() {
        B22 b22 = this.A00;
        if (b22 != null) {
            String stackTraceString = Log.getStackTraceString(this.A01);
            0qQ.A07(stackTraceString);
            b22.onError(00R.A03(stackTraceString, IgNetworkConsentStorage.MAX_ENTRIES));
        }
    }
}
