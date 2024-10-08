package com.instagram.feed.tifu.ui;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.C62320sa;

public final class VisibilityUpdateModifier extends AnonymousClass5QP {
    public final Integer A00;
    public final C62320sa A01;
    public final C62320sa A02;
    public final 0sP A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisibilityUpdateModifier) {
                VisibilityUpdateModifier visibilityUpdateModifier = (VisibilityUpdateModifier) obj;
                if (this.A00 != visibilityUpdateModifier.A00 || !0qQ.A0K(this.A03, visibilityUpdateModifier.A03) || !0qQ.A0K(this.A01, visibilityUpdateModifier.A01) || !0qQ.A0K(this.A02, visibilityUpdateModifier.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "BOUNDS_IN_WINDOW";
        } else {
            str = "LOCAL_TO_WINDOW";
        }
        return ((((((str.hashCode() + intValue) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public VisibilityUpdateModifier(Integer num, C62320sa r2, C62320sa r3, 0sP r4) {
        this.A00 = num;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
