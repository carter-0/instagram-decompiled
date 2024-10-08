package X;

import android.view.Choreographer;
import com.meta.metaai.components.voice.animation.transrcipt.widget.UserInputTextView;

/* renamed from: X.OhL  reason: case insensitive filesystem */
public final class C71280OhL implements Choreographer.FrameCallback {
    public final /* synthetic */ C70973OTu A00;

    public C71280OhL(C70973OTu oTu) {
        this.A00 = oTu;
    }

    public final void doFrame(long j) {
        C70973OTu oTu = this.A00;
        UserInputTextView userInputTextView = oTu.A0B;
        if (userInputTextView.getVisibility() == 0) {
            float translationX = userInputTextView.getTranslationX();
            float f = oTu.A02;
            if (AnonymousClass7TE.A00(translationX, f) >= 0.5f) {
                long j2 = oTu.A03;
                if (j2 != 0) {
                    long j3 = (j - j2) / 1000000;
                    float A002 = AnonymousClass7TE.A00(f, userInputTextView.getTranslationX());
                    int i = -1;
                    if (oTu.A02 > userInputTextView.getTranslationX()) {
                        i = 1;
                    }
                    float f2 = oTu.A00;
                    float f3 = oTu.A08;
                    if (f2 >= f3) {
                        f3 = Math.min(f2 + oTu.A05, oTu.A07);
                    }
                    oTu.A00 = f3;
                    userInputTextView.setTranslationX(userInputTextView.getTranslationX() + (Math.min(oTu.A00 * ((float) j3), A002) * ((float) i)));
                }
                oTu.A03 = j;
                if (oTu.A04) {
                    Choreographer.getInstance().postFrameCallback(this);
                    return;
                }
                return;
            }
        }
        oTu.A04 = false;
    }
}
