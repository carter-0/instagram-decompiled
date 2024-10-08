package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.Asi  reason: case insensitive filesystem */
public final class C41361Asi implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CaptureRequest.Builder A01;
    public final /* synthetic */ C340817ls A02;
    public final /* synthetic */ C343187po A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C41361Asi(CaptureRequest.Builder builder, C340817ls r2, C343187po r3, long j, boolean z, boolean z2) {
        this.A02 = r2;
        this.A01 = builder;
        this.A05 = z;
        this.A03 = r3;
        this.A04 = z2;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Key key;
        int i;
        CaptureRequest.Builder builder;
        C340167ko r1;
        C340817ls r6 = this.A02;
        if (!r6.A0D) {
            throw AnonymousClass7TE.A0z("Not recording video.");
        } else if (r6.A0B == null || r6.A05 == null || r6.A03 == null || r6.A02 == null || r6.A01 == null) {
            throw AnonymousClass7TE.A0z("Cannot stop recording video, camera is closed");
        } else if (r6.A06 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - r6.A00;
            if (elapsedRealtime < 500) {
                SystemClock.sleep(500 - elapsedRealtime);
            }
            C21986Xoh xoh = r6.A06;
            boolean z = r6.A0C;
            xoh.A02(C21986Xoh.A0Y, Long.valueOf(SystemClock.elapsedRealtime()));
            Exception A002 = r6.A00();
            C342707p2 r0 = r6.A03;
            C342727p4 r8 = C342717p3.A0B;
            if (!(AnonymousClass7TG.A08(r8, r0) == 0 || (builder = this.A01) == null || ((r1 = r6.A04) != null && AnonymousClass7TE.A1a(r1.AXG(C340167ko.A03))))) {
                C342757p7 r12 = new C342757p7();
                r12.A01(r8, 0);
                r6.A03.A04(r12.A00());
                C343587qS.A01(builder, r6.A03, r6.A05, 0);
                r6.A02.A05();
            }
            if (this.A05) {
                boolean A0C = r6.A02.A0C();
                CaptureRequest.Builder builder2 = this.A01;
                if (A0C) {
                    builder2.getClass();
                    key = CaptureRequest.CONTROL_CAPTURE_INTENT;
                    i = 3;
                } else {
                    builder2.getClass();
                    key = CaptureRequest.CONTROL_CAPTURE_INTENT;
                    i = 1;
                }
                builder2.set(key, i);
                r6.A01.A01(builder2, this.A03);
                if (z) {
                    r6.A02.A0B(this.A04, true);
                }
            }
            if (A002 == null) {
                xoh.A02(C21986Xoh.A0X, Long.valueOf(this.A00));
                return xoh;
            }
            throw A002;
        } else {
            throw AnonymousClass7TE.A0z("Cannot stop recording video, VideoCaptureInfo is null");
        }
    }
}
