package com.instagram.barcelona.feed.viewpoint;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5WW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C267794cD;
import X.C299575vQ;
import X.C55049HbK;

public final class FeedRowMerlinModifierElement extends AnonymousClass5QP {
    public final int A00;
    public final C299575vQ A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedRowMerlinModifierElement) {
                FeedRowMerlinModifierElement feedRowMerlinModifierElement = (FeedRowMerlinModifierElement) obj;
                if (!(0qQ.A0K(this.A01, feedRowMerlinModifierElement.A01) && this.A00 == feedRowMerlinModifierElement.A00 && this.A02 == feedRowMerlinModifierElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new AnonymousClass5WW(this.A01, this.A02, this.A00);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r6) {
        AnonymousClass5WW r62 = (AnonymousClass5WW) r6;
        0qQ.A0B(r62, 0);
        C299575vQ r4 = this.A01;
        int i = this.A00;
        Integer num = this.A02;
        AnonymousClass7TF.A1B(r4, 0, num);
        r62.A01 = r4;
        r62.A00 = i;
        r62.A04.A0H(r4.BK1(), num, r4.Be5().A03);
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + this.A00) * 31) + C55049HbK.A00(this.A02);
    }

    public FeedRowMerlinModifierElement(C299575vQ r1, Integer num, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = num;
    }
}
