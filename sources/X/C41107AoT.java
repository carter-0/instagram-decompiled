package X;

import android.graphics.Bitmap;
import android.os.Looper;
import java.io.File;

/* renamed from: X.AoT  reason: case insensitive filesystem */
public final class C41107AoT implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C39669A4j A01;
    public final /* synthetic */ C40091AQw A02;

    public C41107AoT(Bitmap bitmap, C39669A4j a4j, C40091AQw aQw) {
        this.A02 = aQw;
        this.A00 = bitmap;
        this.A01 = a4j;
    }

    public final void run() {
        C40091AQw aQw = this.A02;
        C345667tt r6 = aQw.A02;
        Bitmap bitmap = this.A00;
        int i = r6.A00;
        C39669A4j a4j = this.A01;
        File file = aQw.A04;
        C41807B1m b1m = aQw.A01;
        A3F a3f = aQw.A03;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw AnonymousClass7TE.A15("Method handlePreviewPhotoTaken must be invoked on a background thread");
        }
        boolean z = true;
        if (((C345597tm) r6.A01).A00 != 1 || !Boolean.TRUE.equals((Object) null)) {
            z = false;
        }
        if (i != 0 || z) {
            Bitmap A002 = AHH.A00(bitmap, (C343047pa) null, i, z);
            if (A002 != null) {
                C345667tt.A00(A002, b1m, a4j, r6, a3f, file);
                return;
            }
            C345667tt.A01(r6);
            ALI.A03(b1m, AnonymousClass7TE.A0w("Failed to process photo."));
            return;
        }
        C345667tt.A00(bitmap, b1m, a4j, r6, a3f, file);
    }
}
