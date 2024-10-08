package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6hZ  reason: invalid class name and case insensitive filesystem */
public final class C314046hZ implements Choreographer.FrameCallback {
    public final /* synthetic */ C314036hY A00;

    public C314046hZ(C314036hY r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        C314036hY r8 = this.A00;
        C309426Yf r0 = r8.A05;
        if (r0 != null) {
            Integer num = r0.A0V;
            boolean z = false;
            if (num == AnonymousClass05K.A0N) {
                z = true;
            }
            if (z) {
                r8.A04();
                C250973mM r1 = ((ReelViewerFragment) r8.A0B).A0a;
                if (r1 != null) {
                    C255773uh r02 = r8.A04;
                    if (r02 == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (C297785sK.A0i(r02, r1)) {
                        C313426gQ r12 = r8.A0E;
                        r12.EIy("resume", false);
                        Handler handler = ((C313416gP) r12).A0s;
                        handler.removeMessages(0);
                        handler.sendEmptyMessage(0);
                    }
                }
            }
            if (r8.A07()) {
                C309426Yf r9 = r8.A05;
                if (r9 != null) {
                    long j2 = r8.A02;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    r8.A02 = elapsedRealtime;
                    long j3 = r8.A03 + (elapsedRealtime - j2);
                    r8.A03 = j3;
                    float f = r8.A00;
                    r9.A02(((f + ((float) j3)) - 250.0f) / (f + ((float) r8.A01)));
                    if (r8.A03 > ((long) (r8.A01 + C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION))) {
                        r9.A05(AnonymousClass05K.A0C);
                        C273404mW r13 = r8.A0D;
                        C255773uh r03 = r8.A04;
                        if (r03 != null) {
                            r13.DaM(r03);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    Choreographer.getInstance().postFrameCallback(this);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
