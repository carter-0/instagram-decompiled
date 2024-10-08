package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.concurrent.CountDownLatch;

public final class AUI implements C41827B2i {
    public final /* synthetic */ C345407tR A00;
    public final /* synthetic */ AUM A01;
    public final /* synthetic */ C21986Xoh A02;

    public AUI(C345407tR r1, AUM aum, C21986Xoh xoh) {
        this.A00 = r1;
        this.A02 = xoh;
        this.A01 = aum;
    }

    public final void D0z(C382309dU r13) {
        C345407tR r2 = this.A00;
        r2.A0B.append("rcCF,");
        C382309dU r4 = r13;
        if (r2.A0D != null) {
            r2.A09.Cjw(r4, "recording_controller_error", "ArVideoCaptureCoordinator", "", "low", "duplicated onCaptureFailed", AnonymousClass7TE.A0Q(r2));
        }
        r2.A0D = r13;
        CountDownLatch countDownLatch = r2.A05;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void D11() {
        C345407tR r2 = this.A00;
        r2.A0B.append("rcCE,");
        CountDownLatch countDownLatch = r2.A05;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void D17(long j) {
        String str;
        C345407tR r2 = this.A00;
        r2.A0B.append("rcCS,");
        try {
            C21986Xoh xoh = this.A02;
            xoh.A02(C21986Xoh.A0W, Long.valueOf(j));
            AUM aum = this.A01;
            C344037rD r4 = r2.A09;
            r4.CvU(19, TraceFieldType.Bitrate, Float.toString((float) aum.A01.A00));
            r4.CvU(19, "encoder_profile", aum.A01.A06);
            r4.CvU(19, "encoder_width", Integer.toString(aum.A01.A05));
            r4.CvU(19, "encoder_height", Integer.toString(aum.A01.A04));
            Integer num = (Integer) xoh.A01(C21986Xoh.A0Z);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    str = "DEFAULT";
                } else if (intValue == 1) {
                    str = "H263";
                } else if (intValue == 2) {
                    str = "H264";
                } else if (intValue == 3) {
                    str = "HEVC";
                } else if (intValue == 4) {
                    str = "MPEG_4_SP";
                } else if (intValue == 5) {
                    str = "VP8";
                } else {
                    return;
                }
                r4.CvU(19, "encoder", str);
            }
        } catch (RuntimeException e) {
            r2.A09.Cjw(new C382309dU(e), "recording_controller_error", "ArVideoCaptureCoordinator", "", "high", "onCaptureStarted", AnonymousClass7TE.A0Q(r2));
        }
    }

    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
