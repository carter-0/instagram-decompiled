package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass5QP;
import X.AnonymousClass5WU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C273654mx;
import X.C289095d0;
import X.C51966G9m;
import X.JRQ;
import X.Pxd;

public final class MarqueeModifierElement extends AnonymousClass5QP {
    public final float A00;
    public final int A01 = 1200;
    public final int A02 = 1200;
    public final int A03 = 3;
    public final JRQ A04;

    public MarqueeModifierElement(JRQ jrq) {
        this.A04 = jrq;
        this.A00 = 30.0f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarqueeModifierElement) {
                MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
                if (!(this.A03 == marqueeModifierElement.A03 && this.A01 == marqueeModifierElement.A01 && this.A02 == marqueeModifierElement.A02 && 0qQ.A0K(this.A04, marqueeModifierElement.A04) && C289095d0.A01(this.A00, marqueeModifierElement.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new AnonymousClass5WU(this.A04, this.A00, this.A03, this.A01, this.A02);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r7) {
        AnonymousClass5WU r72 = (AnonymousClass5WU) r7;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        JRQ jrq = this.A04;
        float f = this.A00;
        r72.A0A.Epw(jrq);
        r72.A08.Epw(new Object());
        if (r72.A03 != i || r72.A01 != i2 || r72.A02 != i3 || !C289095d0.A01(r72.A00, f)) {
            r72.A03 = i;
            r72.A01 = i2;
            r72.A02 = i3;
            r72.A00 = f;
            AnonymousClass5WU.A01(r72);
        }
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A07(this.A04, ((((this.A03 * 31 * 31) + this.A01) * 31) + this.A02) * 31), this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MarqueeModifierElement(iterations=");
        A1A.append(this.A03);
        A1A.append(", animationMode=");
        A1A.append("Immediately");
        A1A.append(AnonymousClass000.A00(2010));
        A1A.append(this.A01);
        A1A.append(Pxd.A00(322));
        A1A.append(this.A02);
        A1A.append(", spacing=");
        A1A.append(this.A04);
        A1A.append(C273654mx.A00(456));
        return AnonymousClass7TG.A0n(C289095d0.A00(this.A00), A1A);
    }
}
