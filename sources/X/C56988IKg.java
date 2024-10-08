package X;

import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.IKg  reason: case insensitive filesystem */
public final class C56988IKg implements AnonymousClass6NN {
    public final /* synthetic */ AnonymousClass6NN A00;
    public final /* synthetic */ IgShowreelCompositionView A01;

    public C56988IKg(AnonymousClass6NN r1, IgShowreelCompositionView igShowreelCompositionView) {
        this.A01 = igShowreelCompositionView;
        this.A00 = r1;
    }

    public final void onFailure(Throwable th) {
        this.A01.A05();
        AnonymousClass6NN r0 = this.A00;
        if (r0 != null) {
            r0.onFailure(th);
        }
    }

    public final void onSuccess() {
        this.A01.A04();
        AnonymousClass6NN r0 = this.A00;
        if (r0 != null) {
            r0.onSuccess();
        }
    }
}
