package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4lO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C272784lO implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass3OV A01;

    public /* synthetic */ C272784lO(AnonymousClass3OV r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        AnonymousClass3OV r0 = this.A01;
        long j = this.A00;
        r0.A0R.markerPoint(23399201, r0.A0M, "IMAGE_VIEW_ENTER_VIEWPORT", j, TimeUnit.NANOSECONDS);
        AnonymousClass3OV.A01(r0, 23399201, j);
        AnonymousClass3OV.A00(r0, 23399201);
    }
}
