package com.instagram.settings2.core.model;

import X.002;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C62230ry;
import X.C64185LSs;

public final class ServerValue extends C64185LSs {
    public final String A00;
    public final C62230ry A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ServerValue) {
                ServerValue serverValue = (ServerValue) obj;
                if (!0qQ.A0K(this.A00, serverValue.A00) || !0qQ.A0K(this.A01, serverValue.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + this.A01.hashCode();
    }

    public ServerValue(String str, C62230ry r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public final String toString() {
        return 002.A0u(super.toString(), ": { ", this.A00, " }");
    }
}
