package com.instagram.compose.core.ui;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C287605aT;
import X.C287625aV;
import X.C62320sa;

public final class NoIndicationClickableElement extends AnonymousClass5QP {
    public final C287605aT A00;
    public final C287625aV A01;
    public final String A02;
    public final C62320sa A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoIndicationClickableElement) {
                NoIndicationClickableElement noIndicationClickableElement = (NoIndicationClickableElement) obj;
                if (!0qQ.A0K(this.A00, noIndicationClickableElement.A00) || this.A06 != noIndicationClickableElement.A06 || !0qQ.A0K(this.A02, noIndicationClickableElement.A02) || !0qQ.A0K(this.A01, noIndicationClickableElement.A01) || !0qQ.A0K(this.A05, noIndicationClickableElement.A05) || !0qQ.A0K(this.A04, noIndicationClickableElement.A04) || !0qQ.A0K(this.A03, noIndicationClickableElement.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3 = this.A00.hashCode() * 31;
        int i2 = 1237;
        if (this.A06) {
            i2 = 1231;
        }
        int i3 = (hashCode3 + i2) * 31;
        String str = this.A02;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        C287625aV r0 = this.A01;
        if (r0 == null) {
            i = 0;
        } else {
            i = r0.A00;
        }
        int i6 = (i5 + i) * 31 * 31;
        C62320sa r02 = this.A05;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        C62320sa r03 = this.A04;
        if (r03 != null) {
            i4 = r03.hashCode();
        }
        return ((i7 + i4) * 31) + this.A03.hashCode();
    }

    public NoIndicationClickableElement(C287605aT r1, C287625aV r2, String str, C62320sa r4, C62320sa r5, C62320sa r6, boolean z) {
        this.A00 = r1;
        this.A06 = z;
        this.A02 = str;
        this.A01 = r2;
        this.A05 = r4;
        this.A04 = r5;
        this.A03 = r6;
    }
}
