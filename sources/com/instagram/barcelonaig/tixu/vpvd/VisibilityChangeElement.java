package com.instagram.barcelonaig.tixu.vpvd;

import X.0qQ;
import X.0sL;
import X.AnonymousClass5QP;
import X.AnonymousClass6CO;

public final class VisibilityChangeElement extends AnonymousClass5QP {
    public AnonymousClass6CO A00;
    public String A01;
    public 0sL A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisibilityChangeElement) {
                VisibilityChangeElement visibilityChangeElement = (VisibilityChangeElement) obj;
                if (!0qQ.A0K(this.A01, visibilityChangeElement.A01) || !0qQ.A0K(this.A00, visibilityChangeElement.A00) || !0qQ.A0K(this.A02, visibilityChangeElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }
}
