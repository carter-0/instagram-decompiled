package X;

import android.widget.FrameLayout;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.AnY  reason: case insensitive filesystem */
public final class C41050AnY implements Runnable {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public C41050AnY(C353498Hw r1, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = r1;
        this.A01 = audioOverlayTrack;
    }

    public final void run() {
        C353498Hw r2 = this.A00;
        AnonymousClass85M r1 = r2.A1d;
        FrameLayout frameLayout = r1.A00;
        if (frameLayout != null) {
            AnonymousClass7TG.A19(frameLayout, r1);
            r1.A00 = null;
            C353498Hw.A0m(r2);
        }
        r2.Dt2(this.A01);
    }
}
