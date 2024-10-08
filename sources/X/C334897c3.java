package X;

import java.util.List;

/* renamed from: X.7c3  reason: invalid class name and case insensitive filesystem */
public final class C334897c3 extends AnonymousClass0T0 implements C334127ai {
    public final float A00;
    public final C335907dj A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334897c3) {
                C334897c3 r5 = (C334897c3) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || Float.compare(this.A00, r5.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + Float.floatToIntBits(this.A00);
    }

    public C334897c3(C335907dj r1, List list, float f) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = f;
    }
}
