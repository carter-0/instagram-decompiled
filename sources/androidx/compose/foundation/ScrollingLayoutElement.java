package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.C267794cD;
import X.C52907Geh;
import X.C56838IEj;
import X.DbS;
import X.G9w;

public final class ScrollingLayoutElement extends AnonymousClass5QP {
    public final C56838IEj A00;
    public final boolean A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.Geh] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        C56838IEj iEj = this.A00;
        boolean z = this.A01;
        ? r0 = new C267794cD();
        r0.A00 = iEj;
        r0.A01 = z;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        C52907Geh geh = (C52907Geh) r2;
        geh.A00 = this.A00;
        geh.A01 = this.A01;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!0qQ.A0K(this.A00, scrollingLayoutElement.A00) || this.A01 != scrollingLayoutElement.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, G9w.A01(AnonymousClass7TE.A0K(this.A00)));
    }

    public ScrollingLayoutElement(C56838IEj iEj, boolean z) {
        this.A00 = iEj;
        this.A01 = z;
    }
}
