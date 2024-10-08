package androidx.compose.animation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5WY;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C55959HqQ;
import X.C56151Htd;
import X.C56152Hte;
import X.C56606I4f;
import X.C62320sa;
import X.JL2;

public final class EnterExitTransitionElement extends AnonymousClass5QP {
    public C56151Htd A00;
    public C56152Hte A01;
    public JL2 A02;
    public C55959HqQ A03;
    public C55959HqQ A04;
    public C55959HqQ A05;
    public C62320sa A06;
    public final C56606I4f A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EnterExitTransitionElement) {
                EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
                if (!0qQ.A0K(this.A07, enterExitTransitionElement.A07) || !0qQ.A0K(this.A04, enterExitTransitionElement.A04) || !0qQ.A0K(this.A03, enterExitTransitionElement.A03) || !0qQ.A0K(this.A05, enterExitTransitionElement.A05) || !0qQ.A0K(this.A00, enterExitTransitionElement.A00) || !0qQ.A0K(this.A01, enterExitTransitionElement.A01) || !0qQ.A0K(this.A06, enterExitTransitionElement.A06) || !0qQ.A0K(this.A02, enterExitTransitionElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        C56606I4f i4f = this.A07;
        C55959HqQ hqQ = this.A04;
        C55959HqQ hqQ2 = this.A03;
        C55959HqQ hqQ3 = this.A05;
        return new AnonymousClass5WY(this.A00, this.A01, this.A02, hqQ, hqQ2, hqQ3, i4f, this.A06);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        AnonymousClass5WY r22 = (AnonymousClass5WY) r2;
        r22.A06 = this.A07;
        r22.A04 = this.A04;
        r22.A03 = this.A03;
        r22.A05 = this.A05;
        r22.A00 = this.A00;
        r22.A01 = this.A01;
        r22.A08 = this.A06;
        r22.A02 = this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, (((((AnonymousClass7TE.A0K(this.A07) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31))));
    }

    public EnterExitTransitionElement(C56151Htd htd, C56152Hte hte, JL2 jl2, C55959HqQ hqQ, C55959HqQ hqQ2, C55959HqQ hqQ3, C56606I4f i4f, C62320sa r8) {
        this.A07 = i4f;
        this.A04 = hqQ;
        this.A03 = hqQ2;
        this.A05 = hqQ3;
        this.A00 = htd;
        this.A01 = hte;
        this.A06 = r8;
        this.A02 = jl2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EnterExitTransitionElement(transition=");
        A1A.append(this.A07);
        A1A.append(", sizeAnimation=");
        A1A.append(this.A04);
        A1A.append(", offsetAnimation=");
        A1A.append(this.A03);
        A1A.append(", slideAnimation=");
        A1A.append(this.A05);
        A1A.append(", enter=");
        A1A.append(this.A00);
        A1A.append(", exit=");
        A1A.append(this.A01);
        A1A.append(", isEnabled=");
        A1A.append(this.A06);
        A1A.append(", graphicsLayerBlock=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
