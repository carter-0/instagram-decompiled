package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4fU  reason: invalid class name and case insensitive filesystem */
public final class C269664fU extends C269674fV implements Serializable {
    public List A00;
    public transient LinkedHashMap A01;

    public final Object A0k(16F r6, C268894eF r7, JsonDeserializer jsonDeserializer, Object obj) {
        boolean A0D;
        Object A0C;
        Object[] objArr;
        String str;
        String A08;
        String A082;
        Throwable th;
        String A083;
        C269454f9 r2 = this.A02;
        C269434f7 r1 = r2.A00;
        if (r1 != null) {
            A0D = !r1.A02();
        } else {
            A0D = r2.A0D(C269464fA.UNWRAP_ROOT_VALUE);
        }
        if (A0D) {
            if (r1 == null) {
                r1 = r2.A04.A00(r2, r7.A00);
            }
            String str2 = r1.A02;
            16L A10 = r6.A10();
            16L r22 = 16L.A0D;
            if (A10 != r22) {
                C269584fM[] r0 = C269574fL.A01;
                if (str2 == null) {
                    A083 = "[null]";
                } else {
                    A083 = C269574fL.A08(str2);
                }
                objArr = new Object[]{A083, A10};
                str = "Current token not START_OBJECT (needed to unwrap root name %s), but %s";
            } else {
                16L A1J = r6.A1J();
                r22 = 16L.A0A;
                if (A1J != r22) {
                    C269584fM[] r02 = C269574fL.A01;
                    if (str2 == null) {
                        A082 = "[null]";
                    } else {
                        A082 = C269574fL.A08(str2);
                    }
                    objArr = new Object[]{A082, r6.A10()};
                    str = "Current token not FIELD_NAME (to contain expected root name %s), but %s";
                } else {
                    String A0Y = r6.A0Y();
                    if (!str2.equals(A0Y)) {
                        if (A0Y == null) {
                            A08 = "[null]";
                        } else {
                            A08 = C269574fL.A08(A0Y);
                        }
                        Object[] objArr2 = {A08, C269574fL.A08(str2), C269574fL.A04(r7)};
                        Class cls = r7.A00;
                        AnonymousClass4iD r4 = new AnonymousClass4iD(this.A07, String.format("Root name (%s) does not match expected (%s) for type %s", objArr2));
                        th = r4;
                        if (A0Y != null) {
                            r4.A08(cls, A0Y);
                            throw r4;
                        }
                        throw th;
                    }
                    r6.A1J();
                    if (obj == null) {
                        A0C = jsonDeserializer.A0D(r6, this);
                    } else {
                        A0C = jsonDeserializer.A0C(r6, this, obj);
                    }
                    16L A1J2 = r6.A1J();
                    r22 = 16L.A09;
                    if (A1J2 == r22) {
                        return A0C;
                    }
                    objArr = new Object[]{C269574fL.A08(str2), r6.A10()};
                    str = "Current token not END_OBJECT (to match wrapper object with root name %s), but %s";
                }
            }
            A0U(r22, str, objArr);
            th = AnonymousClass00P.createAndThrow();
            throw th;
        } else if (obj == null) {
            return jsonDeserializer.A0D(r6, this);
        } else {
            return jsonDeserializer.A0C(r6, this, obj);
        }
    }
}
