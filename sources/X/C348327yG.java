package X;

import android.graphics.Bitmap;
import android.os.CancellationSignal;
import com.instagram.common.gallery.Medium;

/* renamed from: X.7yG  reason: invalid class name and case insensitive filesystem */
public final class C348327yG implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ CancellationSignal A01;
    public final /* synthetic */ Medium A02;
    public final /* synthetic */ C348257y9 A03;

    public C348327yG(Bitmap bitmap, CancellationSignal cancellationSignal, Medium medium, C348257y9 r4) {
        this.A01 = cancellationSignal;
        this.A03 = r4;
        this.A02 = medium;
        this.A00 = bitmap;
    }

    public final void run() {
        CancellationSignal cancellationSignal = this.A01;
        if (cancellationSignal == null || !cancellationSignal.isCanceled()) {
            this.A03.DrQ(this.A00, this.A02, false);
        }
    }
}
