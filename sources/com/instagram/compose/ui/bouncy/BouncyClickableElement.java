package com.instagram.compose.ui.bouncy;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C287605aT;
import X.C287625aV;
import X.C62320sa;

public final class BouncyClickableElement extends AnonymousClass5QP {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final C287605aT A04;
    public final C287625aV A05;
    public final String A06;
    public final C62320sa A07;
    public final C62320sa A08;
    public final boolean A09;

    public BouncyClickableElement(C287605aT r2, C287625aV r3, String str, C62320sa r5, C62320sa r6, float f, float f2, float f3, float f4, boolean z) {
        0qQ.A0B(r2, 6);
        this.A09 = z;
        this.A02 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A00 = f4;
        this.A04 = r2;
        this.A06 = str;
        this.A05 = r3;
        this.A08 = r5;
        this.A07 = r6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BouncyClickableElement) {
                BouncyClickableElement bouncyClickableElement = (BouncyClickableElement) obj;
                if (this.A09 != bouncyClickableElement.A09 || Float.compare(this.A02, bouncyClickableElement.A02) != 0 || Float.compare(this.A01, bouncyClickableElement.A01) != 0 || Float.compare(this.A03, bouncyClickableElement.A03) != 0 || Float.compare(this.A00, bouncyClickableElement.A00) != 0 || !0qQ.A0K(this.A04, bouncyClickableElement.A04) || !0qQ.A0K(this.A06, bouncyClickableElement.A06) || !0qQ.A0K(this.A05, bouncyClickableElement.A05) || !0qQ.A0K(this.A08, bouncyClickableElement.A08) || !0qQ.A0K(this.A07, bouncyClickableElement.A07)) {
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
        int i2 = 1237;
        if (this.A09) {
            i2 = 1231;
        }
        int floatToIntBits = ((((((((((i2 * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A04.hashCode()) * 31;
        String str = this.A06;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (floatToIntBits + hashCode) * 31;
        C287625aV r0 = this.A05;
        if (r0 == null) {
            i = 0;
        } else {
            i = r0.A00;
        }
        int i5 = (i4 + i) * 31;
        C62320sa r02 = this.A08;
        if (r02 != null) {
            i3 = r02.hashCode();
        }
        return ((i5 + i3) * 31) + this.A07.hashCode();
    }
}
