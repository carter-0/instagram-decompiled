package X;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;

/* renamed from: X.Skw  reason: case insensitive filesystem */
public final class C12035Skw implements C274924pJ, AnonymousClass0Hc {
    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
    }

    public final String getName() {
        return "touch";
    }

    public final void update() {
    }

    public final void DMl(KeyEvent keyEvent, Window window) {
        C274844pB r6 = C274844pB.A0F;
        if (r6 != null) {
            r6.A00++;
            r6.A03 = Math.max(r6.A03, SystemClock.uptimeMillis() - keyEvent.getEventTime());
        }
    }

    public final void DsX(MotionEvent motionEvent, Window window) {
        C274844pB r6 = C274844pB.A0F;
        if (r6 != null) {
            r6.A02++;
            r6.A04 = Math.max(r6.A04, SystemClock.uptimeMillis() - motionEvent.getEventTime());
        }
    }

    public C12035Skw() {
        AnonymousClass0Hb r1 = AnonymousClass0Hb.A03;
        if (r1.A02) {
            r1.A00 = this;
        }
    }
}
