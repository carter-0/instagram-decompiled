package X;

import com.google.protobuf.CodedOutputStream;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SKx  reason: case insensitive filesystem */
public final class C11309SKx {
    public static int A00(int i, Object obj, Object obj2) {
        AbstractMap abstractMap = (AbstractMap) obj;
        C10616RvA rvA = (C10616RvA) obj2;
        int i2 = 0;
        if (!abstractMap.isEmpty()) {
            Iterator A0s = AnonymousClass7TF.A0s(abstractMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                Object key = A1J.getKey();
                Object value = A1J.getValue();
                int A05 = SQE.A05(i);
                C10703Rwh rwh = rvA.A00;
                int A00 = SSU.A00(rwh.A00, key, 1) + SSU.A00(rwh.A01, value, 2);
                i2 += A05 + CodedOutputStream.A00(A00) + A00;
            }
        }
        return i2;
    }

    public static TSY A01(Object obj, Object obj2) {
        TSY tsy = (TSY) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!tsy.A00) {
                tsy = tsy.A01();
            }
            if (!tsy.A00) {
                throw C66580MXl.A11();
            } else if (!abstractMap.isEmpty()) {
                tsy.putAll(abstractMap);
            }
        }
        return tsy;
    }
}
