package androidx.compose.foundation.text.modifiers;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5Z4;
import X.C286305Uu;

public final class TextStringSimpleElement extends AnonymousClass5QP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass5Z4 A03;
    public final C286305Uu A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextStringSimpleElement) {
                TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
                if (!(0qQ.A0K(this.A05, textStringSimpleElement.A05) && 0qQ.A0K(this.A03, textStringSimpleElement.A03) && 0qQ.A0K(this.A04, textStringSimpleElement.A04) && this.A02 == textStringSimpleElement.A02 && this.A06 == textStringSimpleElement.A06 && this.A00 == textStringSimpleElement.A00 && this.A01 == textStringSimpleElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A05.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return (((((hashCode + i) * 31) + this.A00) * 31) + this.A01) * 31;
    }

    public TextStringSimpleElement(AnonymousClass5Z4 r1, C286305Uu r2, String str, int i, int i2, int i3, boolean z) {
        this.A05 = str;
        this.A03 = r1;
        this.A04 = r2;
        this.A02 = i;
        this.A06 = z;
        this.A00 = i2;
        this.A01 = i3;
    }
}
