package X;

import android.graphics.Bitmap;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

/* renamed from: X.Aqg  reason: case insensitive filesystem */
public final class C41244Aqg implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ AnonymousClass8L1 A02;
    public final /* synthetic */ C39651A3r A03;
    public final /* synthetic */ LD4 A04;
    public final /* synthetic */ Integer A05;

    public C41244Aqg(Bitmap bitmap, AnonymousClass0iw r2, AnonymousClass8L1 r3, C39651A3r a3r, LD4 ld4, Integer num) {
        this.A02 = r3;
        this.A03 = a3r;
        this.A04 = ld4;
        this.A01 = r2;
        this.A05 = num;
        this.A00 = bitmap;
    }

    public final void run() {
        AnonymousClass8L1 r1 = this.A02;
        C39651A3r a3r = this.A03;
        C39892ADt A002 = C39892ADt.A00(this.A04);
        r1.A05(this.A00, this.A01, (IngestSessionShim) null, a3r, A002, this.A05, true);
    }
}
