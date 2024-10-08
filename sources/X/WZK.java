package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

public final class WZK implements 0xa {
    public final 0xa A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;

    public final /* synthetic */ Set C1t(String str) {
        0qQ.A0B(str, 1);
        Set stringSet = this.A00.getStringSet(str, (Set) null);
        if (stringSet == null) {
            return 0sl.A00;
        }
        return stringSet;
    }

    public final void EBr(0xZ r2) {
        0qQ.A0B(r2, 0);
        this.A00.EBr(r2);
    }

    public final void FJ1(0xZ r2) {
        0qQ.A0B(r2, 0);
        this.A00.FJ1(r2);
    }

    public final 0xY AR4() {
        return this.A00.AR4();
    }

    public final /* synthetic */ String C1q(String str) {
        String string = this.A00.getString(str, "");
        return string != null ? string : "";
    }

    public final boolean contains(String str) {
        return this.A00.contains(str);
    }

    public final Map getAll() {
        return this.A00.getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        boolean z2;
        StringBuilder sb;
        if (str != null) {
            Map map = this.A01;
            if (map.containsKey(str)) {
                z2 = AnonymousClass7TE.A1a(0Yt.A01(str, map));
                sb = new StringBuilder();
                Pxg.A1P("Nux associated with boolean SharedPreference Key ", str, " returns ", sb);
                sb.append(z2);
                0KC.A0D("EndToEnd-Test", sb.toString());
                return z2;
            }
        }
        z2 = this.A00.getBoolean(str, z);
        sb = new StringBuilder();
        Pxg.A1P("SharedPreference ", str, " returns ", sb);
        sb.append(z2);
        sb.append(" without override");
        0KC.A0D("EndToEnd-Test", sb.toString());
        return z2;
    }

    public final float getFloat(String str, float f) {
        return this.A00.getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        int i2;
        StringBuilder sb;
        if (str != null) {
            Map map = this.A02;
            if (map.containsKey(str)) {
                i2 = AnonymousClass7TE.A0M(0Yt.A01(str, map));
                sb = new StringBuilder();
                Pxg.A1P("Nux associated with int SharedPreference Key ", str, " returns ", sb);
                sb.append(i2);
                0KC.A0D("EndToEnd-Test", sb.toString());
                return i2;
            }
        }
        i2 = this.A00.getInt(str, i);
        sb = new StringBuilder();
        Pxg.A1P("SharedPreference ", str, " returns ", sb);
        sb.append(i2);
        sb.append(" without override");
        0KC.A0D("EndToEnd-Test", sb.toString());
        return i2;
    }

    public final long getLong(String str, long j) {
        long j2;
        StringBuilder sb;
        if (str != null) {
            Map map = this.A03;
            if (map.containsKey(str)) {
                j2 = AnonymousClass7TE.A0R(0Yt.A01(str, map));
                sb = new StringBuilder();
                Pxg.A1P("Nux associated with long SharedPreference Key ", str, " returns ", sb);
                sb.append(j2);
                0KC.A0D("EndToEnd-Test", sb.toString());
                return j2;
            }
        }
        j2 = this.A00.getLong(str, j);
        sb = new StringBuilder();
        Pxg.A1P("SharedPreference ", str, " returns ", sb);
        sb.append(j2);
        sb.append(" without override");
        0KC.A0D("EndToEnd-Test", sb.toString());
        return j2;
    }

    public final String getString(String str, String str2) {
        return this.A00.getString(str, str2);
    }

    public final Set getStringSet(String str, Set set) {
        return this.A00.getStringSet(str, set);
    }

    public /* synthetic */ WZK(0xa r2, Map map, Map map2) {
        this(r2, map, map2, 0Yt.A0E());
    }

    public WZK(0xa r10, Map map, Map map2, Map map3) {
        this.A00 = r10;
        String property = System.getProperty("allowNux");
        if (property == null || !property.equals("true")) {
            0KC.A0D("EndToEnd-Test", "Nux disabled in E2E mode");
            LinkedHashMap linkedHashMap = null;
            try {
                JsonElement jsonElement = (JsonElement) C271114hv.A03((JsonElement) C250863mB.A03.A00(property == null ? "{}" : property, JsonElementSerializer.A00)).get("IGNux");
                if (jsonElement != null) {
                    Map A0B = 0Yt.A0B(C271114hv.A03(jsonElement));
                    LinkedHashMap A0o = C51975G9x.A0o(A0B);
                    Iterator A0u = AnonymousClass7TF.A0u(A0B);
                    while (A0u.hasNext()) {
                        Map.Entry entry = (Map.Entry) A0u.next();
                        Object key = entry.getKey();
                        Object A012 = C271114hv.A01(C271114hv.A06((JsonElement) entry.getValue()));
                        if (A012 == null) {
                            A012 = Integer.valueOf(C271114hv.A00(C271114hv.A06((JsonElement) entry.getValue())));
                        }
                        A0o.put(key, A012);
                    }
                    linkedHashMap = A0o;
                }
            } catch (C66601pa unused) {
            }
            0xY AR4 = this.A00.AR4();
            if (linkedHashMap != null) {
                Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    if (A1J.getValue() instanceof Integer) {
                        AR4.E5Z(DbT.A13(A1J), DbW.A04(A1J.getValue(), "null cannot be cast to non-null type kotlin.Int"));
                    } else if (A1J.getValue() instanceof Boolean) {
                        String A13 = DbT.A13(A1J);
                        Object value = A1J.getValue();
                        0qQ.A0C(value, AnonymousClass000.A00(39));
                        AR4.E5T(A13, AnonymousClass7TE.A1a(value));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Nux Override: ");
                    sb.append(DbT.A13(A1J));
                    sb.append(": ");
                    0KC.A0D("EndToEnd-Test", AnonymousClass7TF.A0i(A1J.getValue(), sb));
                }
            }
            AR4.apply();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator A0u2 = AnonymousClass7TF.A0u(map);
            while (A0u2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                if (linkedHashMap == null || !linkedHashMap.containsKey(A1J2.getKey())) {
                    Dbb.A1V(A1J2, linkedHashMap2);
                }
            }
            this.A01 = linkedHashMap2;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Iterator A0u3 = AnonymousClass7TF.A0u(map2);
            while (A0u3.hasNext()) {
                Map.Entry A1J3 = AnonymousClass7TE.A1J(A0u3);
                if (linkedHashMap == null || !linkedHashMap.containsKey(A1J3.getKey())) {
                    Dbb.A1V(A1J3, linkedHashMap3);
                }
            }
            this.A02 = linkedHashMap3;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            Iterator A0u4 = AnonymousClass7TF.A0u(map3);
            while (A0u4.hasNext()) {
                Map.Entry A1J4 = AnonymousClass7TE.A1J(A0u4);
                if (linkedHashMap == null || !linkedHashMap.containsKey(A1J4.getKey())) {
                    Dbb.A1V(A1J4, linkedHashMap4);
                }
            }
            this.A03 = linkedHashMap4;
            return;
        }
        this.A01 = 0Yt.A0E();
        this.A02 = 0Yt.A0E();
        this.A03 = 0Yt.A0E();
        0KC.A0D("EndToEnd-Test", "Nux is not disabled in E2E mode");
    }
}
