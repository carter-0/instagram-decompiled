package androidx.compose.ui.layout;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C52898GeY;

public final class LayoutIdElement extends AnonymousClass5QP {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LayoutIdElement) && 0qQ.A0K(this.A00, ((LayoutIdElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.GeY] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        Object obj = this.A00;
        ? r0 = new C267794cD();
        r0.A00 = obj;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        ((C52898GeY) r2).A00 = this.A00;
    }

    public LayoutIdElement(Object obj) {
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LayoutIdElement(layoutId=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
