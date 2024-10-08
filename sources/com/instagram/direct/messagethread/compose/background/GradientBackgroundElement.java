package com.instagram.direct.messagethread.compose.background;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5ZQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C52903Ged;
import X.C52921Gev;
import X.C55475HiJ;
import java.util.List;

public final class GradientBackgroundElement extends AnonymousClass5QP {
    public final float A00;
    public final AnonymousClass5ZQ A01;
    public final C55475HiJ A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GradientBackgroundElement) {
                GradientBackgroundElement gradientBackgroundElement = (GradientBackgroundElement) obj;
                if (!0qQ.A0K(this.A03, gradientBackgroundElement.A03) || !0qQ.A0K(this.A01, gradientBackgroundElement.A01) || Float.compare(this.A00, gradientBackgroundElement.A00) != 0 || !0qQ.A0K(this.A02, gradientBackgroundElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4cD, X.Ged] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        List list = this.A03;
        AnonymousClass5ZQ r3 = this.A01;
        float f = this.A00;
        C55475HiJ hiJ = this.A02;
        AnonymousClass7TG.A1O(list, r3);
        ? r1 = new C267794cD();
        r1.A08 = list;
        r1.A01 = r3;
        r1.A00 = f;
        r1.A06 = hiJ;
        r1.A07 = new C52921Gev(list, f);
        return r1;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r7) {
        C52903Ged ged = (C52903Ged) r7;
        0qQ.A0B(ged, 0);
        List list = this.A03;
        AnonymousClass5ZQ r4 = this.A01;
        float f = this.A00;
        C55475HiJ hiJ = this.A02;
        AnonymousClass7TF.A1H(list, r4);
        boolean z = false;
        if (!0qQ.A0K(ged.A08, list) || ged.A00 != f) {
            z = true;
        }
        ged.A08 = list;
        ged.A01 = r4;
        ged.A00 = f;
        ged.A06 = hiJ;
        if (z) {
            ged.A07 = new C52921Gev(list, f);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A03)), this.A00) + AnonymousClass7TG.A0C(this.A02);
    }

    public GradientBackgroundElement(AnonymousClass5ZQ r1, C55475HiJ hiJ, List list, float f) {
        this.A03 = list;
        this.A01 = r1;
        this.A00 = f;
        this.A02 = hiJ;
    }
}
