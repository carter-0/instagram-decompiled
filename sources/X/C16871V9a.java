package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.V9a  reason: case insensitive filesystem */
public abstract class C16871V9a {
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        C14068TpH tpH;
        C16666Uz2 uz2;
        AnonymousClass0iw r13;
        Map map;
        String str;
        String str2;
        C276544tV A0P = DbY.A0P(r17, 0);
        String str3 = "";
        String A0F = A0P.A0F();
        if (A0F != null) {
            str3 = A0F;
        }
        C16677UzD A00 = C17125VIv.A00(C308206Td.A0G(C13988Tno.A0S(A0P, 40)));
        0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXObjectType");
        String A0G = C308206Td.A0G(C13988Tno.A0S(A0P, 38));
        C14068TpH[] values = C14068TpH.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                tpH = null;
                break;
            }
            tpH = values[i];
            if (0qQ.A0K(tpH.A00, A0G)) {
                break;
            }
            i++;
        }
        0qQ.A0C(tpH, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXLocation");
        String A0G2 = C308206Td.A0G(C13988Tno.A0S(A0P, 35));
        C16666Uz2[] values2 = C16666Uz2.values();
        int length2 = values2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                uz2 = null;
                break;
            }
            uz2 = values2[i2];
            if (0qQ.A0K(uz2.A00, A0G2)) {
                break;
            }
            i2++;
        }
        0qQ.A0C(uz2, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXEntryPoint");
        boolean A0R = A0P.A0R(44, false);
        C277014uI A0A = A0P.A0A(41);
        String A0G3 = A0P.A0G();
        C307896Rx r6 = r16;
        if (A0G3 == null) {
            r13 = C308206Td.A08(r6);
        } else {
            r13 = new 0xG(A0G3);
        }
        Object A002 = C276544tV.A00(A0P, 43);
        if (A002 instanceof Map) {
            map = (Map) A002;
        } else {
            map = null;
        }
        C71093OcF A01 = ORV.A01(C308206Td.A04(r6), r13, DbT.A0Z(r6), tpH, A00, str3);
        0qQ.A0B(uz2, 0);
        A01.A02 = uz2;
        if (map != null) {
            ArrayList A0f = JTQ.A0f(map);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Object key = A1J.getKey();
                Object value = A1J.getValue();
                if (key == null || (str = key.toString()) == null) {
                    str = "";
                }
                if (value == null || (str2 = value.toString()) == null) {
                    str2 = "";
                }
                A01.A08(str, str2);
                A0f.add(A01);
            }
        }
        if (A0A != null) {
            A01.A07(new C62429Kfe(0, A0A, r6));
        }
        if (A0R) {
            A01.A0H = true;
            C71093OcF.A00((C331157Pu) null, A01);
            return null;
        }
        C71093OcF.A00((C331157Pu) null, A01);
        return null;
    }
}
