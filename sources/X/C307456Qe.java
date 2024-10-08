package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Qe  reason: invalid class name and case insensitive filesystem */
public final class C307456Qe {
    public final C3034268t A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;

    public final C307456Qe A07(Map map, Map map2) {
        Map map3 = map2;
        Map map4 = map;
        if (map == null) {
            if (map2 == null) {
                return this;
            }
            map4 = this.A07;
        } else if (map2 == null) {
            map3 = this.A08;
        }
        return new C307456Qe(this.A00, map4, this.A04, map3, this.A03, this.A02, this.A05, this.A06, this.A01);
    }

    public final C307456Qe A00(C3034268t r11) {
        if (r11 != null) {
            Map map = r11.A00;
            if (!map.isEmpty()) {
                C3034268t r1 = this.A00;
                0qQ.A0B(r1, 0);
                return new C307456Qe(new C3034268t(0Yt.A04(r1.A00, map)), this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, this.A06, this.A01);
            }
        }
        return this;
    }

    public final C307456Qe A02(List list) {
        if (list == null || list.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap(this.A06);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10631RvP rvP = (C10631RvP) it.next();
            hashMap.put(rvP.A02, rvP);
        }
        return new C307456Qe(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, hashMap, this.A01);
    }

    public final C307456Qe A05(Map map) {
        if (map == null || map.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap(this.A05);
        hashMap.putAll(map);
        return new C307456Qe(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, hashMap, this.A06, this.A01);
    }

    public final C307456Qe A06(Map map) {
        HashMap hashMap = new HashMap(this.A08);
        hashMap.putAll(map);
        return new C307456Qe(this.A00, this.A07, this.A04, hashMap, this.A03, this.A02, this.A05, this.A06, this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C307456Qe)) {
            return false;
        }
        C307456Qe r4 = (C307456Qe) obj;
        if (this.A04 == r4.A04 && this.A03 == r4.A03 && this.A07 == r4.A07 && this.A08.equals(r4.A08) && this.A02.equals(r4.A02) && this.A00.equals(r4.A00) && this.A05 == r4.A05 && this.A06 == r4.A06 && this.A01 == r4.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A04, this.A08, this.A03, this.A02, this.A00, this.A05, this.A06, this.A01});
    }

    public C307456Qe(C3034268t r1, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8) {
        this.A07 = map;
        this.A04 = map2;
        this.A08 = map3;
        this.A03 = map4;
        this.A02 = map5;
        this.A00 = r1;
        this.A05 = map6;
        this.A06 = map7;
        this.A01 = map8;
    }

    public final C307456Qe A01(List list) {
        if (list.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap(this.A02);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10485Rt0 rt0 = (C10485Rt0) it.next();
            hashMap.put(rt0.A01, rt0);
        }
        return new C307456Qe(this.A00, this.A07, this.A04, this.A08, this.A03, hashMap, this.A05, this.A06, this.A01);
    }

    public final C307456Qe A03(Map map) {
        if (map.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap(this.A01);
        hashMap.putAll(map);
        return new C307456Qe(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, this.A06, hashMap);
    }

    public final C307456Qe A04(Map map) {
        if (map.isEmpty()) {
            return this;
        }
        HashMap hashMap = new HashMap(this.A04);
        hashMap.putAll(map);
        return new C307456Qe(this.A00, this.A07, hashMap, this.A08, this.A03, this.A02, this.A05, this.A06, this.A01);
    }

    public C307456Qe() {
        this.A07 = Collections.emptyMap();
        this.A04 = Collections.emptyMap();
        this.A08 = Collections.emptyMap();
        this.A03 = Collections.emptyMap();
        this.A02 = Collections.emptyMap();
        this.A00 = C306456Mf.A00(Collections.emptyMap());
        this.A05 = Collections.emptyMap();
        this.A06 = Collections.emptyMap();
        this.A01 = Collections.emptyMap();
    }
}
