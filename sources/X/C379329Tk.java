package X;

import android.os.Looper;

/* renamed from: X.9Tk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C379329Tk implements Runnable {
    public final /* synthetic */ AnonymousClass9SN A00;

    public /* synthetic */ C379329Tk(AnonymousClass9SN r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass9SN r2 = this.A00;
        if (AnonymousClass9SN.A00(r2).getHandler().getLooper() == Looper.myLooper()) {
            C344697sH BQ8 = AnonymousClass9SN.A00(r2).BQ8();
            boolean CVW = BQ8.CVW(0);
            boolean z = !BQ8.B9R(0).isEmpty();
            if (CVW && z) {
                AnonymousClass9SN.A00(r2).EEt((Long) null);
            } else if (!r2.A09) {
                r2.A09 = true;
                ((C344037rD) r2.A00.Apf(C344037rD.A00)).Ew8(002.A1C("BasicVideoProcessorComponent OnFrameAvailableListener IO invalid, isInputSet:", ", isOutputSet: ", CVW, z), new Throwable(), false);
            }
        } else {
            throw AnonymousClass7TE.A0z("handleFrameAvailable must be called at SurfacePipe thread.");
        }
    }
}
