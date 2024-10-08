package com.instagram.barcelonaig.tixu.vpvd;

import X.0qQ;
import X.0sL;
import X.AnonymousClass5QP;

public final class VPVDElement extends AnonymousClass5QP {
    public String A00;
    public 0sL A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VPVDElement) {
                VPVDElement vPVDElement = (VPVDElement) obj;
                if (!0qQ.A0K(this.A00, vPVDElement.A00) || !0qQ.A0K(this.A01, vPVDElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}
