package X;

import kotlinx.serialization.PolymorphicSerializer;

/* renamed from: X.8dz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C360098dz implements 0sP {
    public final Object invoke(Object obj) {
        C62230ry r3 = (C62230ry) obj;
        C360128e2 r0 = C360048du.A00;
        0qQ.A0B(r3, 0);
        C255463uA A01 = C360168e6.A01(r3, new C255463uA[0]);
        if (A01 == null) {
            A01 = (C255463uA) C360178eA.A00.get(r3);
        }
        if (A01 == null) {
            if (!AnonymousClass2YU.A00(r3).isInterface()) {
                return null;
            }
            A01 = new PolymorphicSerializer(r3);
        }
        return C360578eo.A00(A01);
    }
}
