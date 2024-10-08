package X;

import java.util.HashMap;

public final class WLD implements X2v {
    /* JADX WARNING: type inference failed for: r11v2, types: [X.Vk4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v4, types: [X.Vk4, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object EB6(Object obj, Object obj2) {
        boolean z;
        String str;
        C16811V6s v6s;
        WM1 wm1;
        WM2 wm2;
        WM2 wm22;
        C18026Vk4 vk4;
        C18499Vsu vsu = (C18499Vsu) obj;
        V33 v33 = (V33) obj2;
        if (v33 instanceof C15215UVs) {
            C15215UVs uVs = (C15215UVs) v33;
            C18026Vk4 vk42 = vsu.A03;
            z = vsu.A06;
            str = vsu.A05;
            v6s = vsu.A00;
            wm1 = vsu.A04;
            wm2 = vsu.A02;
            wm22 = vsu.A01;
            long j = uVs.A00 + uVs.A00;
            ? obj3 = new Object();
            HashMap hashMap = new HashMap(vk42.A00);
            obj3.A00 = hashMap;
            hashMap.put("cs_periodic_ping", new VV2(uVs, vsu, j));
            vk4 = obj3;
        } else if (v33 instanceof UVQ) {
            C18026Vk4 vk43 = vsu.A03;
            z = vsu.A06;
            str = vsu.A05;
            v6s = vsu.A00;
            wm1 = vsu.A04;
            wm2 = vsu.A02;
            wm22 = vsu.A01;
            String str2 = ((UVQ) v33).A00;
            ? obj4 = new Object();
            HashMap hashMap2 = new HashMap(vk43.A00);
            obj4.A00 = hashMap2;
            hashMap2.remove(str2);
            vk4 = obj4;
        } else if (v33 instanceof UVH) {
            if (vsu.A06) {
                return vsu;
            }
            C18026Vk4 vk44 = vsu.A03;
            str = vsu.A05;
            v6s = vsu.A00;
            wm1 = vsu.A04;
            wm2 = vsu.A02;
            wm22 = vsu.A01;
            z = true;
            vk4 = vk44;
        } else if (!(v33 instanceof UVX)) {
            return vsu;
        } else {
            UVX uvx = (UVX) v33;
            C18026Vk4 vk45 = vsu.A03;
            z = vsu.A06;
            str = vsu.A05;
            v6s = vsu.A00;
            wm1 = uvx.A02;
            wm2 = uvx.A01;
            wm22 = uvx.A00;
            vk4 = vk45;
        }
        return new C18499Vsu(v6s, wm2, wm22, vk4, wm1, str, z);
    }
}
