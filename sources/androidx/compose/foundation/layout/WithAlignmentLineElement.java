package androidx.compose.foundation.layout;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C267794cD;
import X.C292215ia;
import X.C52913Gen;

public final class WithAlignmentLineElement extends AnonymousClass5QP {
    public final C292215ia A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.Gen] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        C292215ia r1 = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = r1;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        ((C52913Gen) r2).A00 = this.A00;
    }

    public final boolean equals(Object obj) {
        WithAlignmentLineElement withAlignmentLineElement;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithAlignmentLineElement) || (withAlignmentLineElement = (WithAlignmentLineElement) obj) == null) {
            return false;
        }
        return 0qQ.A0K(this.A00, withAlignmentLineElement.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public WithAlignmentLineElement(C292215ia r1) {
        this.A00 = r1;
    }
}
