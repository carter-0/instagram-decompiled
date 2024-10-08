package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.QkW  reason: case insensitive filesystem */
public class C8223QkW extends C8225QkY implements Serializable {
    public final Object A09(16F r6, C269674fV r7) {
        16L r2;
        Object[] objArr;
        String str;
        String A1P;
        Object A0X;
        String valueOf;
        if (!r6.A0b() || (A0X = r6.A0X()) == null) {
            boolean A16 = r6.A16();
            if (A16) {
                16L A1J = r6.A1J();
                r2 = 16L.A0J;
                if (A1J == r2) {
                    A1P = r6.A1P();
                    r6.A1J();
                } else {
                    objArr = new Object[]{this.A02.A00.getName()};
                    str = "need JSON String that contains type id (for subtype of %s)";
                    r7.A0U(r2, str, objArr);
                    throw AnonymousClass00P.createAndThrow();
                }
            } else if (this.A03 != null) {
                C12444Sua sua = (C12444Sua) this.A04;
                A1P = sua.CLy(sua.A00.A00, (Object) null);
            } else {
                r7.A0U(16L.A0C, Pxf.A0e(this.A02.A00, "need JSON Array to contain As.WRAPPER_ARRAY type information for class "), new Object[0]);
                throw AnonymousClass00P.createAndThrow();
            }
            JsonDeserializer A08 = A08(r7, A1P);
            if (this.A07 && !(this instanceof C8220QkT)) {
                r6 = C8225QkY.A00(r6, 16L.A0D, r7, this, A1P);
            }
            if (A16 && r6.A10() == 16L.A08) {
                return A08.BWm(r7);
            }
            Object A0D = A08.A0D(r6, r7);
            if (!A16 || r6.A1J() == (r2 = 16L.A08)) {
                return A0D;
            }
            objArr = new Object[0];
            str = "expected closing END_ARRAY after type information and deserialized value";
            r7.A0U(r2, str, objArr);
            throw AnonymousClass00P.createAndThrow();
        }
        if (A0X instanceof String) {
            valueOf = (String) A0X;
        } else {
            valueOf = String.valueOf(A0X);
        }
        return A08(r7, valueOf).A0D(r6, r7);
    }
}
