package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.40h  reason: invalid class name and case insensitive filesystem */
public final class C2590740h extends C255543uJ {
    public final AnonymousClass0eM A00;
    public final C255513uF A01 = AnonymousClass48A.A00;

    public C2590740h(String str, int i) {
        super(str, (C255533uI) null, i);
        this.A00 = AnonymousClass0eN.A01(new AnonymousClass48B(str, this, i));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof SerialDescriptor)) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (serialDescriptor.BKK() != AnonymousClass48A.A00 || !0qQ.A0K(this.A03, serialDescriptor.BsV()) || !0qQ.A0K(C360608er.A00(this), C360608er.A00(serialDescriptor))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A03.hashCode();
        C20385WqR wqR = new C20385WqR(this);
        int i2 = 1;
        while (wqR.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) wqR.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    public final String toString() {
        return 00k.A0P(", ", 002.A0C(this.A03, '('), ")", new C19880Wh9(this), (0sP) null);
    }
}
