package X;

import android.os.SystemClock;
import android.view.Surface;

/* renamed from: X.4Yn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C266344Yn implements Runnable {
    public final /* synthetic */ C264324Pl A00;
    public final /* synthetic */ Object A01;

    public /* synthetic */ C266344Yn(C264324Pl r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final void run() {
        Surface surface;
        C264324Pl r0 = this.A00;
        Object obj = this.A01;
        AnonymousClass4P8 r1 = (AnonymousClass4P8) r0.A01;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        AnonymousClass4OS r6 = r1.A05;
        r6.A0K = surface;
        boolean isValid = surface.isValid();
        long j = r6.A0D;
        if (j != -1 && isValid) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            r6.A08 = elapsedRealtime;
            28J.A02(r6, "blackscreen detected for %d ms", new Object[]{Long.valueOf(elapsedRealtime)});
            r6.A0D = -1;
        }
        r6.A0v.onDrawnToSurface();
    }
}
