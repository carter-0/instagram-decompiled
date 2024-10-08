package androidx.compose.foundation.lazy.layout;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5b8;
import X.AnonymousClass6JN;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.G9w;

public final class LazyLayoutAnimateItemElement extends AnonymousClass5QP {
    public final AnonymousClass5b8 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LazyLayoutAnimateItemElement) && 0qQ.A0K(this.A00, ((LazyLayoutAnimateItemElement) obj).A00));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.6JN] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        AnonymousClass5b8 r1 = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = r1;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        ((AnonymousClass6JN) r2).A00 = this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00) * 31;
    }

    public LazyLayoutAnimateItemElement(AnonymousClass5b8 r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        G9w.A1X(A1A, "LazyLayoutAnimateItemElement(fadeInSpec=");
        A1A.append(", placementSpec=");
        A1A.append(this.A00);
        A1A.append(", fadeOutSpec=");
        return AnonymousClass7TG.A0n((Object) null, A1A);
    }
}
