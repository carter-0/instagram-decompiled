package X;

import android.app.Application;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.85x  reason: invalid class name and case insensitive filesystem */
public final class C3507185x extends C361478gI {
    public final AnonymousClass2Fj A00 = new AnonymousClass2Fj();
    public final ClipsAudioStore A01;
    public final ClipsCreationViewModel A02;
    public final AnonymousClass0r6 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3507185x(Application application, C3500482z r8, ClipsCreationViewModel clipsCreationViewModel) {
        super(application);
        0qQ.A0B(clipsCreationViewModel, 2);
        0qQ.A0B(r8, 3);
        this.A02 = clipsCreationViewModel;
        ClipsAudioStore clipsAudioStore = r8.A00(clipsCreationViewModel.A0S).A01;
        this.A01 = clipsAudioStore;
        this.A03 = AnonymousClass10H.A02(C3507285y.A00, clipsAudioStore.A0k, clipsAudioStore.A0W, clipsAudioStore.A0n, clipsAudioStore.A0g, clipsAudioStore.A0i);
        C318136oS A002 = C318116oQ.A00(this);
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 47);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }

    public final float A0E() {
        return ((Number) this.A01.A0k.getValue()).floatValue();
    }

    public final void A0F(float f) {
        this.A01.A0H.Epw(Float.valueOf(C229632nm.A02(f, 0.0f, 1.0f)));
    }

    public final void A0G(float f) {
        this.A01.A0O.Epw(Float.valueOf(C229632nm.A02(f, 0.0f, 1.0f)));
    }

    public final void A0H(float f) {
        this.A01.A0Q.Epw(Float.valueOf(C229632nm.A02(f, 0.0f, 1.0f)));
    }

    public final void A0I(float f) {
        this.A01.A0U.Epw(Float.valueOf(C229632nm.A02(f, 0.0f, 1.0f)));
    }
}
