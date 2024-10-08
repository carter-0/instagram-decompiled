package com.instagram.compose.ui.gradientspinner;

import X.0qQ;
import X.0sK;
import X.AnonymousClass5QP;
import X.C289095d0;
import X.C52402GRc;
import X.C52412GRo;

public final class GradientSpinnerModifierElement extends AnonymousClass5QP {
    public final float A00;
    public final C52412GRo A01;
    public final C52402GRc A02;
    public final 0sK A03;

    public GradientSpinnerModifierElement(C52412GRo gRo, C52402GRc gRc, 0sK r4, float f) {
        0qQ.A0B(r4, 4);
        this.A01 = gRo;
        this.A02 = gRc;
        this.A00 = f;
        this.A03 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GradientSpinnerModifierElement) {
                GradientSpinnerModifierElement gradientSpinnerModifierElement = (GradientSpinnerModifierElement) obj;
                if (!0qQ.A0K(this.A01, gradientSpinnerModifierElement.A01) || !0qQ.A0K(this.A02, gradientSpinnerModifierElement.A02) || !C289095d0.A01(this.A00, gradientSpinnerModifierElement.A00) || !0qQ.A0K(this.A03, gradientSpinnerModifierElement.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A03.hashCode();
    }
}
