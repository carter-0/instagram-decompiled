package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.40g  reason: invalid class name and case insensitive filesystem */
public abstract class C2590640g {
    public static final SerialDescriptor A00(SerialDescriptor serialDescriptor, AnonymousClass40R r4) {
        0qQ.A0B(serialDescriptor, 0);
        if (0qQ.A0K(serialDescriptor.BKK(), C2591640q.A00)) {
            C62230ry A00 = VJ4.A00(serialDescriptor);
            if (A00 != null) {
                r4.A00.get(A00);
            }
        } else if (serialDescriptor.isInline()) {
            return A00(serialDescriptor.B0R(0), r4);
        }
        return serialDescriptor;
    }

    public static final AnonymousClass40Y A01(SerialDescriptor serialDescriptor, C250863mB r4) {
        0qQ.A0B(r4, 0);
        C255513uF BKK = serialDescriptor.BKK();
        if (BKK instanceof C2591040k) {
            return AnonymousClass40Y.POLY_OBJ;
        }
        if (!0qQ.A0K(BKK, C2591140l.A00)) {
            if (!0qQ.A0K(BKK, C2591240m.A00)) {
                return AnonymousClass40Y.OBJ;
            }
            SerialDescriptor A00 = A00(serialDescriptor.B0R(0), r4.A02);
            C255513uF BKK2 = A00.BKK();
            if ((BKK2 instanceof C255503uE) || 0qQ.A0K(BKK2, AnonymousClass48A.A00)) {
                return AnonymousClass40Y.MAP;
            }
            if (!r4.A00.A05) {
                throw C18804W2u.A04(A00);
            }
        }
        return AnonymousClass40Y.LIST;
    }
}
