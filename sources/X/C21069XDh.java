package X;

import android.view.Display;

/* renamed from: X.XDh  reason: case insensitive filesystem */
public final /* synthetic */ class C21069XDh implements X31 {
    public final /* synthetic */ C264264Pf A00;

    public /* synthetic */ C21069XDh(C264264Pf r1) {
        this.A00 = r1;
    }

    public final void D83(Display display) {
        long j;
        C264264Pf r4 = this.A00;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            r4.A07 = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            2AG.A04("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            r4.A07 = -9223372036854775807L;
        }
        r4.A08 = j;
    }
}
