package X;

import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.IKf  reason: case insensitive filesystem */
public final class C56987IKf implements AnonymousClass6NN {
    public final int A00;
    public final Object A01;

    public C56987IKf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
        if (this.A00 == 0) {
            ((IgShowreelCompositionView) this.A01).A05();
        }
    }

    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                ((IgShowreelCompositionView) this.A01).A04();
                return;
            case 1:
                JQM jqm = (JQM) this.A01;
                if (jqm != null) {
                    jqm.DO2();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
