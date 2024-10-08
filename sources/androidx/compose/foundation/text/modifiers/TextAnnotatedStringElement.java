package androidx.compose.foundation.text.modifiers;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass5Z4;
import X.C286025Tq;
import X.C286305Uu;
import java.util.List;

public final class TextAnnotatedStringElement extends AnonymousClass5QP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C286025Tq A03;
    public final AnonymousClass5Z4 A04;
    public final C286305Uu A05;
    public final List A06;
    public final 0sP A07;
    public final 0sP A08;
    public final 0sP A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAnnotatedStringElement) {
                TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
                if (!(0qQ.A0K(this.A03, textAnnotatedStringElement.A03) && 0qQ.A0K(this.A04, textAnnotatedStringElement.A04) && 0qQ.A0K(this.A06, textAnnotatedStringElement.A06) && 0qQ.A0K(this.A05, textAnnotatedStringElement.A05) && this.A09 == textAnnotatedStringElement.A09 && this.A08 == textAnnotatedStringElement.A08 && this.A02 == textAnnotatedStringElement.A02 && this.A0A == textAnnotatedStringElement.A0A && this.A00 == textAnnotatedStringElement.A00 && this.A01 == textAnnotatedStringElement.A01 && this.A07 == textAnnotatedStringElement.A07)) {
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
        int hashCode = ((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31;
        0sP r0 = this.A09;
        int i4 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((hashCode + i) * 31) + this.A02) * 31;
        int i6 = 1237;
        if (this.A0A) {
            i6 = 1231;
        }
        int i7 = (((((i5 + i6) * 31) + this.A00) * 31) + this.A01) * 31;
        List list = this.A06;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        0sP r02 = this.A07;
        if (r02 != null) {
            i3 = r02.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31 * 31 * 31;
        0sP r03 = this.A08;
        if (r03 != null) {
            i4 = r03.hashCode();
        }
        return i9 + i4;
    }

    public TextAnnotatedStringElement(C286025Tq r1, AnonymousClass5Z4 r2, C286305Uu r3, List list, 0sP r5, 0sP r6, 0sP r7, int i, int i2, int i3, boolean z) {
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = r3;
        this.A09 = r5;
        this.A02 = i;
        this.A0A = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = list;
        this.A07 = r6;
        this.A08 = r7;
    }
}
