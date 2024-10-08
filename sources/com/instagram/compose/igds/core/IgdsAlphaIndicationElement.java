package com.instagram.compose.igds.core;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C287605aT;

public final class IgdsAlphaIndicationElement extends AnonymousClass5QP {
    public final float A00;
    public final C287605aT A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgdsAlphaIndicationElement) {
                IgdsAlphaIndicationElement igdsAlphaIndicationElement = (IgdsAlphaIndicationElement) obj;
                if (!(0qQ.A0K(this.A01, igdsAlphaIndicationElement.A01) && this.A02 == igdsAlphaIndicationElement.A02 && Float.compare(this.A00, igdsAlphaIndicationElement.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + Float.floatToIntBits(this.A00);
    }

    public IgdsAlphaIndicationElement(C287605aT r1, float f, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = f;
    }
}
