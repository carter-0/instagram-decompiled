package androidx.compose.foundation.text.input.internal;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C52693Gb5;
import X.C52697Gb9;
import X.C52698GbA;
import X.C52754Gc7;

public final class LegacyAdaptingPlatformTextInputModifier extends AnonymousClass5QP {
    public final C52754Gc7 A00;
    public final C52697Gb9 A01;
    public final C52693Gb5 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegacyAdaptingPlatformTextInputModifier) {
                LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
                if (!0qQ.A0K(this.A01, legacyAdaptingPlatformTextInputModifier.A01) || !0qQ.A0K(this.A00, legacyAdaptingPlatformTextInputModifier.A00) || !0qQ.A0K(this.A02, legacyAdaptingPlatformTextInputModifier.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new C52698GbA(this.A00, this.A01, this.A02);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r3) {
        C52698GbA gbA = (C52698GbA) r3;
        C52697Gb9 gb9 = this.A01;
        if (gbA.A08) {
            gbA.A01.EyE();
            gbA.A01.A02(gbA);
        }
        gbA.A01 = gb9;
        if (gbA.A08) {
            if (gb9.A00 == null) {
                gb9.A00 = gbA;
            } else {
                throw AnonymousClass7TE.A0z("Expected textInputModifierNode to be null");
            }
        }
        gbA.A00 = this.A00;
        gbA.A02 = this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public LegacyAdaptingPlatformTextInputModifier(C52754Gc7 gc7, C52697Gb9 gb9, C52693Gb5 gb5) {
        this.A01 = gb9;
        this.A00 = gc7;
        this.A02 = gb5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LegacyAdaptingPlatformTextInputModifier(serviceAdapter=");
        A1A.append(this.A01);
        A1A.append(", legacyTextFieldState=");
        A1A.append(this.A00);
        A1A.append(", textFieldSelectionManager=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
