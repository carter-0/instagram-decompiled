package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.56h  reason: invalid class name and case insensitive filesystem */
public final class C2811956h {
    public C2812156j A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final C2811556c A03;
    public final C2812056i A04 = new C2812056i();
    public final ArrayList A05 = new ArrayList();

    public final void A00() {
        Object obj;
        if (this.A02) {
            this.A02 = false;
            this.A03.A01(this);
            C2812056i r5 = this.A04;
            int i = 0;
            while (true) {
                ArrayList arrayList = r5.A00;
                if (i < arrayList.size()) {
                    C2812356l r3 = (C2812356l) arrayList.get(i);
                    C2812356l r2 = (C2812356l) r5.A02.get(i);
                    String str = (String) r5.A01.get(i);
                    Map map = r2.A03;
                    if (map == null) {
                        obj = null;
                    } else {
                        obj = map.get(str);
                    }
                    if (obj == r3) {
                        C2812056i.A00(r3, r2, str);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A01(C2812356l r3, C2812356l r4, String str) {
        if (!this.A01) {
            C2812056i r1 = this.A04;
            r1.A00.add(r3);
            r1.A02.add(r4);
            r1.A01.add(str);
            ArrayList arrayList = this.A05;
            arrayList.add(r3);
            arrayList.add(r4);
            return;
        }
        throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
    }

    public C2811956h(C2811556c r2) {
        this.A03 = r2;
    }
}
