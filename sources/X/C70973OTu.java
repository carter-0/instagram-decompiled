package X;

import android.view.Choreographer;
import com.meta.metaai.components.voice.animation.transrcipt.widget.DisabledHorizontalScrollView;
import com.meta.metaai.components.voice.animation.transrcipt.widget.UserInputTextView;

/* renamed from: X.OTu  reason: case insensitive filesystem */
public final class C70973OTu {
    public float A00 = -1.0f;
    public float A01;
    public float A02;
    public long A03;
    public boolean A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final C71280OhL A09 = new C71280OhL(this);
    public final DisabledHorizontalScrollView A0A;
    public final UserInputTextView A0B;

    public static final void A00(C70973OTu oTu) {
        if (!oTu.A04) {
            UserInputTextView userInputTextView = oTu.A0B;
            if (userInputTextView.getVisibility() == 0 && AnonymousClass7TE.A00(userInputTextView.getTranslationX(), oTu.A02) >= 0.5f) {
                oTu.A04 = true;
                oTu.A03 = 0;
                oTu.A00 = -1.0f;
                Choreographer.getInstance().postFrameCallback(oTu.A09);
            }
        }
    }

    public C70973OTu(DisabledHorizontalScrollView disabledHorizontalScrollView, UserInputTextView userInputTextView, float f, float f2, float f3, float f4, float f5) {
        this.A0A = disabledHorizontalScrollView;
        this.A0B = userInputTextView;
        this.A06 = f2;
        this.A07 = f3;
        this.A08 = f4;
        this.A05 = f5;
        disabledHorizontalScrollView.A01 = f;
        disabledHorizontalScrollView.A00 = f2;
        disabledHorizontalScrollView.addOnLayoutChangeListener(new C71413OkC(this, 4));
        userInputTextView.addOnLayoutChangeListener(new C71413OkC(this, 5));
        userInputTextView.A00 = new PS1(this);
    }
}
