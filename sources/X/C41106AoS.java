package X;

import android.graphics.Bitmap;
import android.os.Looper;

/* renamed from: X.AoS  reason: case insensitive filesystem */
public final class C41106AoS implements Runnable {
    public final /* synthetic */ AV3 A00;
    public final /* synthetic */ C39670A4k A01;
    public final /* synthetic */ C363858kS A02;

    public C41106AoS(AV3 av3, C39670A4k a4k, C363858kS r3) {
        this.A00 = av3;
        this.A02 = r3;
        this.A01 = a4k;
    }

    public final void run() {
        AV3 av3 = this.A00;
        C345667tt r8 = av3.A01;
        C363858kS r9 = this.A02;
        byte[] bArr = (byte[]) r9.A04(C363858kS.A0X);
        C343047pa r5 = av3.A03;
        boolean z = av3.A06;
        C41807B1m b1m = av3.A00;
        C39670A4k a4k = this.A01;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw AnonymousClass7TE.A15("Method handleNativePhotoTakenOnBackground must be invoked on a background thread");
        } else if (!AHH.A03()) {
            Bitmap A012 = AHH.A01(r5, r5, bArr, z);
            if (A012 != null) {
                C39669A4j A013 = AEA.A01(r9);
                C345667tt.A01(r8);
                ALI.A01(A012, b1m, A013, a4k);
            } else {
                C345667tt.A01(r8);
                ALI.A03(b1m, AnonymousClass7TE.A15("Failed to generate photo bitmap."));
            }
            C344397rn r1 = r8.A03;
            if (r1 != null && av3.A05 && av3.A07) {
                r1.EgY(true);
            }
        } else {
            throw AnonymousClass7TE.A15("Method processJpegToBitmap must be invoked on a background thread");
        }
    }
}
