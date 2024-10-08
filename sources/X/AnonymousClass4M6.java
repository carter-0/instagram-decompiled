package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.EnumSet;

/* renamed from: X.4M6  reason: invalid class name */
public final class AnonymousClass4M6 extends Handler {
    public final /* synthetic */ AnonymousClass4M1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4M6(AnonymousClass4M1 r2) {
        super(Looper.getMainLooper());
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            AnonymousClass4M1 r1 = this.A00;
            EnumSet enumSet = AnonymousClass4M1.A1M;
            C263814Nl r0 = r1.A0O;
            if (r0 != null) {
                r1.A0N.onVideoDownloading(r0.A0B);
            }
        } else if (i == 2) {
            AnonymousClass4M1 r8 = this.A00;
            EnumSet enumSet2 = AnonymousClass4M1.A1M;
            if (r8.A0M == AnonymousClass3OB.PLAYING && r8.A0K != null) {
                if (r8.A0O != null) {
                    int currentPositionMs = r8.getCurrentPositionMs();
                    int AzN = r8.AzN();
                    float f = (float) AzN;
                    float f2 = ((float) currentPositionMs) / f;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (r8.A13 && r8.A0S) {
                        r8.A0l.A01(1827799077, new C20313Wp2(this, currentPositionMs, r8.A05));
                    }
                    C263814Nl r10 = r8.A0O;
                    int i2 = r8.A04;
                    if (elapsedRealtime - r10.A02 >= ((long) i2)) {
                        r10.A02 = elapsedRealtime;
                        float f3 = f2 - r10.A00;
                        r10.A00 = f2;
                        float f4 = (((float) i2) / 100.0f) / f;
                        if (f3 < 0.0f || f3 > f4) {
                            z = false;
                        }
                        r10.A06 = z;
                        r8.A0N.onProgressStateChanged(z);
                    }
                    r8.A0N.onProgressUpdate(currentPositionMs, AzN, r8.A0O.A06);
                }
                sendEmptyMessageDelayed(2, (long) r8.A06);
            }
        }
    }
}
