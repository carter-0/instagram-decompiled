package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.W2y  reason: case insensitive filesystem */
public final class C18806W2y {
    public final Map A00 = new HashMap();

    public static final void A01(C18806W2y w2y, int i, boolean z) {
        if (i != -1) {
            Map map = w2y.A00;
            synchronized (map) {
                C17830Vgj vgj = (C17830Vgj) C51968G9o.A10(map, i);
                if (vgj != null) {
                    Set set = vgj.A02;
                    if (!set.contains("is_success")) {
                        02m.A0p.markerAnnotate(vgj.A00, "is_success", z);
                        set.add("is_success");
                    }
                }
            }
        }
    }

    public static final void A04(C18806W2y w2y, String str, int i) {
        if (i != -1) {
            Map map = w2y.A00;
            synchronized (map) {
                C17830Vgj vgj = (C17830Vgj) C51968G9o.A10(map, i);
                if (vgj != null) {
                    02m.A0p.markerPoint(vgj.A00, str);
                }
            }
        }
    }

    public static final void A00(C18806W2y w2y, int i) {
        Map map = w2y.A00;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C17830Vgj vgj = (C17830Vgj) map.remove(valueOf);
            0qQ.A0A(vgj);
            02m.A0p.markerPoint(vgj.A00, "NEW_START_FOUND");
            vgj.A00();
        }
        C17830Vgj vgj2 = new C17830Vgj(i);
        map.put(valueOf, vgj2);
        02m r0 = 02m.A0p;
        int i2 = vgj2.A00;
        r0.markerStart(i2);
        02m.A0p.markerAnnotate(i2, "hashtag_version", "v3");
    }

    public static final void A02(C18806W2y w2y, String str) {
        Map map = w2y.A00;
        synchronized (map) {
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                C17830Vgj vgj = (C17830Vgj) A0v.next();
                Set set = vgj.A02;
                if (!set.contains("is_success")) {
                    02m.A0p.markerAnnotate(vgj.A00, "is_success", false);
                    set.add("is_success");
                }
                String str2 = str;
                02m r1 = 02m.A0p;
                int i = vgj.A00;
                if (str == null) {
                    str2 = "Unknown";
                }
                r1.markerPoint(i, "EXIT_NAVIGATION", str2);
                vgj.A00();
            }
            map.clear();
        }
    }

    public static final void A03(C18806W2y w2y, String str, int i) {
        Map map = w2y.A00;
        synchronized (map) {
            A00(w2y, i);
            Object A10 = C51968G9o.A10(map, i);
            0qQ.A0A(A10);
            ((C17830Vgj) A10).A01.put("tab", str);
        }
    }

    public static final void A05(C18806W2y w2y, String str, int i) {
        Map map = w2y.A00;
        synchronized (map) {
            C17830Vgj vgj = (C17830Vgj) C51968G9o.A10(map, i);
            if (vgj != null) {
                02m r1 = 02m.A0p;
                int i2 = vgj.A00;
                r1.markerPoint(i2, str);
                vgj.A00();
                map.remove(Integer.valueOf(i2));
            }
        }
    }
}
