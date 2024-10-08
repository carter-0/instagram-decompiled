package X;

import android.os.CountDownTimer;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Gcy  reason: case insensitive filesystem */
public final class C52806Gcy extends CountDownTimer {
    public final C267324bN A00;
    public final long A01;
    public final /* synthetic */ C52018GBp A02;

    public final void onTick(long j) {
        long j2 = j;
        Long valueOf = Long.valueOf(j2);
        C52018GBp gBp = this.A02;
        ConcurrentHashMap concurrentHashMap = gBp.A0B;
        C267324bN r6 = this.A00;
        concurrentHashMap.put(r6.getId(), valueOf);
        1Xj r1 = r6.A02;
        if (r1 != null) {
            AnonymousClass3W1 BQr = gBp.A07.BQr(r1);
            long A03 = AnonymousClass30M.A03(AnonymousClass30K.A04(AnonymousClass30J.SECONDS, gBp.A08(r6).A03));
            BQr.A3Y.A00(BQr, valueOf);
            if (j <= this.A01) {
                if (!AnonymousClass7TE.A1a(BQr.A3Z.A00)) {
                    gBp.A08.A00(r6, 0, A03, j2, false);
                }
                BQr.A0i(true);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52806Gcy(C267324bN r5, C52018GBp gBp, long j) {
        super(AnonymousClass30M.A03(AnonymousClass30K.A04(AnonymousClass30J.SECONDS, gBp.A08(r5).A03)), 250);
        this.A02 = gBp;
        this.A00 = r5;
        this.A01 = j;
    }

    public final void onFinish() {
        C52018GBp.A04(this.A00, this.A02);
    }
}
