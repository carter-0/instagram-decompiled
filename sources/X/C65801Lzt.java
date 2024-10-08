package X;

import android.os.Message;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Lzt  reason: case insensitive filesystem */
public final class C65801Lzt implements AnonymousClass8GR {
    public final int A00;
    public final Object A01;

    public C65801Lzt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dkw() {
        if (this.A00 != 0) {
            C65074Lmu lmu = (C65074Lmu) this.A01;
            27r.A0C(27p.A01(lmu.A06), "AUDIO_CONTROLS_VOICEOVER_RECORD");
            if (!1DL.A07(lmu.A05, "android.permission.RECORD_AUDIO")) {
                JTP.A11(lmu.A04, lmu, "android.permission.RECORD_AUDIO");
                return;
            }
            lmu.A09.A01();
            ShutterButton shutterButton = lmu.A01;
            if (shutterButton != null) {
                shutterButton.setMode(C301685zn.INNER_TEXT);
            }
            AnonymousClass8JB r0 = lmu.A02;
            if (r0 != null) {
                r0.A02.sendMessage(Message.obtain());
                return;
            }
            return;
        }
        JTR.A0l(this.A01).A01(C65039LmI.A00);
    }
}
