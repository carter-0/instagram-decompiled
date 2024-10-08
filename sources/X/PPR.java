package X;

import android.content.Intent;
import android.graphics.Point;

public final class PPR implements C74582PxV {
    public final Intent A00;
    public final Point A01;

    public PPR(Intent intent, Point point) {
        this.A00 = intent;
        this.A01 = point;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcScreenShareCaptureResultAction(captureIntent=");
        A1A.append(this.A00);
        A1A.append(", displaySize=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
