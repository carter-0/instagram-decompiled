package X;

import android.os.Handler;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9Qw  reason: invalid class name and case insensitive filesystem */
public final class C378699Qw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ B16 A01;
    public final /* synthetic */ C341657nJ A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ CountDownLatch A05;

    public final void run() {
        C341627nG r15;
        C40083AQo aQo;
        List list;
        String str = this.A04;
        String.format((Locale) null, "[Executing] %s", new Object[]{str});
        this.A05.countDown();
        try {
            int i = this.A00;
            if (i == 4 || !this.A02.A02.A06.get()) {
                C341647nI r4 = this.A02.A02;
                B16 b16 = this.A01;
                Object obj = this.A03;
                if (i == 1) {
                    Object[] objArr = (Object[]) obj;
                    r15 = r4.A04;
                    list = (List) objArr[0];
                    aQo = new C40083AQo((Handler) objArr[2], (C341737nR) objArr[1], b16, r15, list);
                } else if (i == 2) {
                    Object[] objArr2 = (Object[]) obj;
                    r4.A04.A05((AD9) objArr2[0], (C41827B2i) objArr2[1], b16);
                    return;
                } else if (i == 3) {
                    Object[] objArr3 = (Object[]) obj;
                    r15 = r4.A04;
                    list = (List) objArr3[0];
                    aQo = new C40083AQo(r15.A02, new C40082AQm((AD9) objArr3[1], (C41827B2i) objArr3[2], b16, r15), (B16) null, r15, list);
                } else if (i == 4) {
                    r4.A04.A07(b16);
                    r4.A06.set(false);
                    return;
                } else if (i == 5) {
                    r4.A04.A06(b16);
                    return;
                } else {
                    throw AnonymousClass7TE.A15(002.A0O("Unknown Recording Operation: ", i));
                }
                C341627nG.A00(aQo, r15, list);
                return;
            }
            this.A01.onFinished();
        } catch (Exception e) {
            0KC.A0F("RecordingControllerImpl", String.format((Locale) null, "Exception during operation %s", new Object[]{str}), e);
            C341657nJ r2 = this.A02;
            C341567nA r42 = r2.A00;
            C341647nI r22 = r2.A02;
            long A0Q = AnonymousClass7TE.A0Q(r22);
            C341627nG r23 = r22.A04;
            r42.Cjw(new C382309dU(e), "recording_controller_error", "RecordingControllerImpl", r23.A02(), "high", str, A0Q);
            if (this.A00 == 4) {
                r23.A03.A02();
            }
            throw e;
        }
    }

    public C378699Qw(B16 b16, C341657nJ r2, Object obj, String str, CountDownLatch countDownLatch, int i) {
        this.A02 = r2;
        this.A04 = str;
        this.A05 = countDownLatch;
        this.A00 = i;
        this.A01 = b16;
        this.A03 = obj;
    }
}
