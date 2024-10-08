package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Lzu  reason: case insensitive filesystem */
public final class C65802Lzu implements AnonymousClass8JA {
    public final /* synthetic */ C65074Lmu A00;

    public C65802Lzu(C65074Lmu lmu) {
        this.A00 = lmu;
    }

    public final void onFinish() {
        C301665zl r1;
        C65074Lmu lmu = this.A00;
        lmu.A04.getWindow().addFlags(128);
        AnonymousClass8JB r0 = lmu.A02;
        if (r0 != null) {
            r0.A02.removeCallbacksAndMessages((Object) null);
        }
        ShutterButton shutterButton = lmu.A01;
        if (shutterButton != null && (r1 = shutterButton.A0i) != null) {
            r1.A01("start_audio_mixing_voiceover_stacked_timeline");
        }
    }
}
