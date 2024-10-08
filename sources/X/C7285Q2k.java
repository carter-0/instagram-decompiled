package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Q2k  reason: case insensitive filesystem */
public final class C7285Q2k {
    public static final String A00(Integer num, String str, List list, int i) {
        String str2;
        0qQ.A0B(str, 1);
        if (list != null) {
            str2 = C7283Q2i.A00(num, list.subList(0, i));
        } else {
            str2 = null;
        }
        String A01 = C7283Q2i.A01(str, str2);
        0qQ.A07(A01);
        return A01;
    }

    public final Object A02(C307896Rx r3, String str, int i) {
        0qQ.A0B(str, 1);
        List list = r3.A0D;
        if (list == null) {
            throw new IllegalArgumentException("Keypath must be set on environment if trying to getVariableWithScope on a depth larger than 0.");
        } else if (i <= list.size()) {
            Object A03 = Q05.A03(r3, A00(AnonymousClass05K.A00, str, list, i));
            if (A03 == null) {
                return Q05.A03(r3, str);
            }
            return A03;
        } else {
            throw new IllegalArgumentException("Depth supplied should never exceed the size of the key path.");
        }
    }

    public static final Map A01(C307896Rx r2) {
        0sm r0 = r2.A0E;
        if (r0 == null) {
            C307786Rm r02 = r2.A03;
            if (r02 != null) {
                C307446Qd A02 = C307476Qg.A02(r02);
                0qQ.A07(A02);
                if (C245983dn.A03()) {
                    C276694tk r03 = A02.A07;
                    if (r03 != null) {
                        Map map = r03.A01.A07;
                        int size = map.size();
                        if (size == 0) {
                            r0 = 0Yt.A0E();
                        } else if (size != 1) {
                            r0 = new HashMap(map);
                        } else {
                            Map.Entry entry = (Map.Entry) 00k.A09(map.entrySet());
                            r0 = 0Yt.A02(new 0eP[]{new 0eP(entry.getKey(), entry.getValue())});
                        }
                    } else {
                        AnonymousClass6SE r04 = A02.A05;
                        if (r04 != null) {
                            r0 = r04.A07;
                        } else {
                            r0 = Collections.emptyMap();
                        }
                    }
                    0qQ.A07(r0);
                } else {
                    throw new RuntimeException("Expanded Variables can only be read from the UI Thread");
                }
            } else {
                throw new IllegalStateException("no BloksContext or variables override");
            }
        }
        return r0;
    }
}
