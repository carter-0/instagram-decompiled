package androidx.compose.ui.draw;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass6FS;
import X.AnonymousClass6GH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C267794cD;

public final class DrawWithCacheElement extends AnonymousClass5QP {
    public final 0sP A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DrawWithCacheElement) && 0qQ.A0K(this.A00, ((DrawWithCacheElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new AnonymousClass6FS(new AnonymousClass6GH(), this.A00);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        AnonymousClass6FS r22 = (AnonymousClass6FS) r2;
        r22.A01 = this.A00;
        r22.CNm();
    }

    public DrawWithCacheElement(0sP r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DrawWithCacheElement(onBuildDrawCache=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
