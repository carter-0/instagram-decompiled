package X;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;
import com.instagram.android.R;
import com.instagram.ui.widget.drawing.EffectSlider;

/* renamed from: X.8FU  reason: invalid class name */
public final class AnonymousClass8FU implements AnonymousClass8FV, AnonymousClass8FW {
    public SliderConfiguration A00;
    public boolean A01;
    public AnonymousClass8FR A02;
    public final ConstraintLayout A03;
    public final Guideline A04;
    public final AnonymousClass88R A05;
    public final EffectSlider A06;

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public final void Dwy(float f) {
        AnonymousClass88R r1 = this.A05;
        B11 b11 = r1.A01;
        if (b11 != null) {
            b11.onAdjustableValueChanged(f);
        }
        r1.A07.Epw(Float.valueOf(f));
    }

    public final void ECG() {
        AnonymousClass8FR r9 = this.A02;
        AnonymousClass8FX r8 = new AnonymousClass8FX(this);
        AnonymousClass8FY r7 = new AnonymousClass8FY(this);
        AnonymousClass8FZ r6 = new AnonymousClass8FZ(this);
        C352788Fa r4 = new C352788Fa(this);
        AnonymousClass88R r5 = r9.A01;
        AnonymousClass80W r0 = r9.A02;
        0qQ.A0B(r0, 0);
        AnonymousClass0r6 A012 = AnonymousClass11E.A01(AnonymousClass10H.A00(new C376859Jp(0, (AnonymousClass4D7) null), AnonymousClass11E.A01(new C352798Fb(AnonymousClass8DX.A00(r0))), AnonymousClass11E.A01(C226292g8.A01(r5.A03.A04)), r5.A05));
        19B r3 = 19B.A00;
        CoroutineLiveData A002 = C226292g8.A00(r3, A012);
        AnonymousClass07Z r2 = r9.A00;
        A002.A06(r2, r8);
        C226292g8.A00(r3, AnonymousClass11E.A01(new C352808Fc(r5.A07))).A06(r2, r7);
        C226292g8.A00(r3, r5.A06).A06(r2, r6);
        C226292g8.A00(r3, r5.A04).A06(r2, r4);
    }

    public AnonymousClass8FU(ViewGroup viewGroup, AnonymousClass8FR r4, AnonymousClass88R r5) {
        this.A06 = (EffectSlider) viewGroup.requireViewById(R.id.effect_slider);
        this.A05 = r5;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.requireViewById(R.id.effect_slider_container);
        this.A03 = constraintLayout;
        this.A04 = constraintLayout.requireViewById(R.id.effect_slider_container_guideline);
        this.A06.A0F = this;
        this.A02 = r4;
    }
}
