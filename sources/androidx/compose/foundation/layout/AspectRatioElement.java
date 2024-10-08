package androidx.compose.foundation.layout;

import X.002;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.C267794cD;
import X.C52912Gem;
import X.DbS;
import X.G9w;

public final class AspectRatioElement extends AnonymousClass5QP {
    public final float A00;
    public final boolean A01;
    public final 0sP A02;

    public final boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        return aspectRatioElement != null && this.A00 == aspectRatioElement.A00 && this.A01 == ((AspectRatioElement) obj).A01;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.Gem] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        float f = this.A00;
        boolean z = this.A01;
        ? r0 = new C267794cD();
        r0.A00 = f;
        r0.A01 = z;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        C52912Gem gem = (C52912Gem) r2;
        gem.A00 = this.A00;
        gem.A01 = this.A01;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, G9w.A00(this.A00));
    }

    public AspectRatioElement(0sP r3, float f, boolean z) {
        this.A00 = f;
        this.A01 = z;
        this.A02 = r3;
        if (f <= 0.0f) {
            throw AnonymousClass7TE.A0w(002.A0Z("aspectRatio ", " must be > 0", f));
        }
    }
}
