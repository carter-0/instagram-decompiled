package X;

import kotlinx.serialization.PolymorphicSerializer;

/* renamed from: X.8dv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C360058dv implements 0sP {
    public final Object invoke(Object obj) {
        C62230ry r2 = (C62230ry) obj;
        C360128e2 r0 = C360048du.A00;
        0qQ.A0B(r2, 0);
        Object A01 = C360168e6.A01(r2, new C255463uA[0]);
        if (A01 == null) {
            A01 = C360178eA.A00.get(r2);
        }
        if (A01 != null) {
            return A01;
        }
        if (AnonymousClass2YU.A00(r2).isInterface()) {
            return new PolymorphicSerializer(r2);
        }
        return null;
    }
}
