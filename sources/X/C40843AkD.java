package X;

import android.widget.FrameLayout;

/* renamed from: X.AkD  reason: case insensitive filesystem */
public final class C40843AkD implements Runnable {
    public final /* synthetic */ C353498Hw A00;

    public C40843AkD(C353498Hw r1) {
        this.A00 = r1;
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
        C59689JTv.A0C(r2.A11, "extract_audio_failed");
    }
}
