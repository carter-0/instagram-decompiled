package X;

import android.os.Looper;
import android.os.MessageQueue;

/* renamed from: X.4pN  reason: invalid class name and case insensitive filesystem */
public final class C274964pN implements C274924pJ {
    public final MessageQueue A00 = Looper.getMainLooper().getQueue();
    public final C274974pO A01 = C274974pO.A04;

    public final String getName() {
        return "queue_size";
    }

    public final void update() {
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        C274974pO r1 = this.A01;
        if (r1 != null) {
            s3x.A00 = r1.A01(this.A00);
        }
    }
}
