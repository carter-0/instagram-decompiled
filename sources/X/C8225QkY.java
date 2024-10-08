package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.QkY  reason: case insensitive filesystem */
public abstract class C8225QkY extends C11287SJg implements Serializable {
    public JsonDeserializer A00;
    public final C13901TjO A01;
    public final C268894eF A02;
    public final C268894eF A03;
    public final C13805ThU A04;
    public final String A05;
    public final Map A06;
    public final boolean A07;

    public final JsonDeserializer A07(C269674fV r3) {
        JsonDeserializer jsonDeserializer;
        C268894eF r1 = this.A03;
        if (r1 == null) {
            if (r3.A0j(C269464fA.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
        } else if (!C269574fL.A0I(r1.A00)) {
            synchronized (r1) {
                jsonDeserializer = this.A00;
                if (jsonDeserializer == null) {
                    jsonDeserializer = r3.A0B(this.A01, r1);
                    this.A00 = jsonDeserializer;
                }
            }
            return jsonDeserializer;
        }
        return NullifyingDeserializer.A00;
    }

    public final JsonDeserializer A08(C269674fV r6, String str) {
        JsonDeserializer jsonDeserializer;
        String A0R;
        Map map = this.A06;
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) map.get(str);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        C13805ThU thU = this.A04;
        C268894eF FIK = thU.FIK(r6, str);
        if (FIK == null) {
            jsonDeserializer = A07(r6);
            if (jsonDeserializer == null) {
                String AwR = thU.AwR();
                if (AwR == null) {
                    A0R = "type ids are not statically known";
                } else {
                    A0R = 002.A0R("known type ids = ", AwR);
                }
                C13901TjO tjO = this.A01;
                if (tjO != null) {
                    A0R = String.format("%s (for POJO property '%s')", new Object[]{A0R, tjO.getName()});
                }
                C268894eF r1 = this.A02;
                if (r6.A02.A08 != null) {
                    throw AnonymousClass7TE.A11("handleUnknownTypeId");
                } else if (!r6.A0j(C269464fA.FAIL_ON_INVALID_SUBTYPE)) {
                    return NullifyingDeserializer.A00;
                } else {
                    throw r6.A04(r1, str, A0R);
                }
            }
        } else {
            C268894eF r3 = this.A02;
            if (r3 != null && r3.getClass() == FIK.getClass() && !FIK.A0J()) {
                try {
                    Class cls = FIK.A00;
                    if (r3.A00 != cls) {
                        r3 = r6.A02.A01.A07.A05(r3, cls, false);
                    }
                    FIK = r3;
                } catch (IllegalArgumentException e) {
                    throw r6.A04(r3, str, e.getMessage());
                }
            }
            jsonDeserializer = r6.A0B(this.A01, FIK);
        }
        map.put(str, jsonDeserializer);
        return jsonDeserializer;
    }

    public C8225QkY(C13901TjO tjO, C8225QkY qkY) {
        this.A02 = qkY.A02;
        this.A04 = qkY.A04;
        this.A05 = qkY.A05;
        this.A07 = qkY.A07;
        this.A06 = qkY.A06;
        this.A03 = qkY.A03;
        this.A00 = qkY.A00;
        this.A01 = tjO;
    }

    public static 16F A00(16F r2, 16L r3, C269674fV r4, C8225QkY qkY, String str) {
        if (!r2.A19(r3)) {
            return r2;
        }
        C267574bm r1 = new C267574bm(r2, r4);
        r1.A0c();
        r1.A0q(qkY.A05);
        r1.A0t(str);
        r2.A13();
        C8155Qho A002 = C8155Qho.A00(r1.A10(r2), r2);
        A002.A1J();
        return A002;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('[');
        A1A.append(C66581MXm.A0y(this));
        A1A.append("; base-type:");
        A1A.append(this.A02);
        A1A.append("; id-resolver: ");
        A1A.append(this.A04);
        return Pxg.A0w(A1A);
    }

    public C8225QkY(C268894eF r5, C268894eF r6, C13805ThU thU, String str, boolean z) {
        this.A02 = r5;
        this.A04 = thU;
        Iterator it = C269574fL.A00;
        this.A05 = str == null ? "" : str;
        this.A07 = z;
        this.A06 = new ConcurrentHashMap(16, 0.75f, 2);
        this.A03 = r6;
        this.A01 = null;
    }
}
