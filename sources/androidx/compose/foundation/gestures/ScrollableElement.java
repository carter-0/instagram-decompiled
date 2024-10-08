package androidx.compose.foundation.gestures;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass6Gj;
import X.AnonymousClass6HS;
import X.C287605aT;
import X.C305096Gn;
import X.C305386Hs;
import X.JS2;

public final class ScrollableElement extends AnonymousClass5QP {
    public final C305386Hs A00;
    public final JS2 A01;
    public final AnonymousClass6HS A02;
    public final AnonymousClass6Gj A03;
    public final C305096Gn A04;
    public final C287605aT A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScrollableElement) {
                ScrollableElement scrollableElement = (ScrollableElement) obj;
                if (!0qQ.A0K(this.A04, scrollableElement.A04) || this.A03 != scrollableElement.A03 || !0qQ.A0K(this.A00, scrollableElement.A00) || this.A06 != scrollableElement.A06 || this.A07 != scrollableElement.A07 || !0qQ.A0K(this.A02, scrollableElement.A02) || !0qQ.A0K(this.A05, scrollableElement.A05) || !0qQ.A0K(this.A01, scrollableElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = ((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31;
        C305386Hs r0 = this.A00;
        int i4 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A07) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        AnonymousClass6HS r02 = this.A02;
        if (r02 != null) {
            i2 = r02.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        C287605aT r03 = this.A05;
        if (r03 != null) {
            i3 = r03.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        JS2 js2 = this.A01;
        if (js2 != null) {
            i4 = js2.hashCode();
        }
        return i11 + i4;
    }

    public ScrollableElement(C305386Hs r1, JS2 js2, AnonymousClass6HS r3, AnonymousClass6Gj r4, C305096Gn r5, C287605aT r6, boolean z, boolean z2) {
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A06 = z;
        this.A07 = z2;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = js2;
    }
}
