package X;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.WTk  reason: case insensitive filesystem */
public final class C19302WTk implements 0mK {
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        int i;
        Map map;
        int i2;
        int i3;
        C18740VzL vzL = (C18740VzL) ((C17281VPi) obj).A00.get();
        if (vzL != null) {
            Map map2 = vzL.A09;
            Iterator A0u = AnonymousClass7TF.A0u(map2);
            int i4 = 0;
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                C63667L2d l2d = (C63667L2d) A1J.getValue();
                Object key = A1J.getKey();
                Map map3 = vzL.A08;
                C63667L2d l2d2 = (C63667L2d) map3.get(key);
                if (l2d2 != null) {
                    View view = l2d2.A00;
                    if (view.equals(key)) {
                        i3 = 0;
                        i4 += i3;
                    } else if (!l2d.A00.equals(view)) {
                        vzL.A03.removeView(view);
                    }
                }
                View view2 = l2d.A00;
                view2.setOutlineProvider(new U3s(vzL, 2));
                view2.setClipToOutline(vzL.A00.A04);
                vzL.A03.addView(view2, 0);
                map3.put(key, l2d);
                i3 = 1;
                i4 += i3;
            }
            map2.clear();
            Set set = vzL.A0A;
            int i5 = 0;
            for (Object next : set) {
                Map map4 = vzL.A08;
                C63667L2d l2d3 = (C63667L2d) map4.get(next);
                if (l2d3 != null) {
                    map4.remove(next);
                    vzL.A03.removeView(l2d3.A00);
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i5 += i2;
            }
            set.clear();
            int i6 = i4 + i5;
            C18002Vje vje = vzL.A01;
            boolean z = false;
            if (vje == null || vje.equals(vzL.A00)) {
                i = 0;
            } else {
                C18002Vje vje2 = vzL.A01;
                if (vje2.A00 != vzL.A00.A00) {
                    z = true;
                }
                vzL.A00 = vje2;
                vzL.A01 = null;
                vzL.A07.A00 = vje2.A03;
                if (z) {
                    Iterator A0v = AnonymousClass7TF.A0v(vzL.A08);
                    while (A0v.hasNext()) {
                        ((C63667L2d) A0v.next()).A00.setOutlineProvider(new U3s(vzL, 2));
                    }
                }
                i = 1;
            }
            int i7 = i6 + i;
            boolean z2 = true;
            if (i7 != 1) {
                z2 = false;
                if (i7 <= 0) {
                    return;
                }
            }
            if (vzL.A00.A04) {
                map = vzL.A08;
                Iterator A0v2 = AnonymousClass7TF.A0v(map);
                while (A0v2.hasNext()) {
                    ((C63667L2d) A0v2.next()).A00.setClipToOutline(true);
                }
            } else {
                map = vzL.A08;
                Iterator A0v3 = AnonymousClass7TF.A0v(map);
                while (A0v3.hasNext()) {
                    ((C63667L2d) A0v3.next()).A00.setClipToOutline(false);
                }
            }
            C18740VzL.A00(vzL, z2);
            if (map.containsKey(0)) {
                map.size();
                ((C63667L2d) map.get(0)).A00.setOnTouchListener((View.OnTouchListener) null);
            }
        }
    }
}
