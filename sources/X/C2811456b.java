package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.56b  reason: invalid class name and case insensitive filesystem */
public abstract class C2811456b {
    public Object A00;
    public CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public final void A02() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass4FG) copyOnWriteArrayList.get(size)).D0d(this);
            } else {
                return;
            }
        }
    }

    public final void A03() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass4FG) copyOnWriteArrayList.get(size)).DFb(this);
            } else {
                return;
            }
        }
    }

    public final void A04() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass4FG) copyOnWriteArrayList.get(size)).Dgv(this);
            } else {
                return;
            }
        }
    }

    public final void A05() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass4FG) copyOnWriteArrayList.get(size)).E0R(this);
            } else {
                return;
            }
        }
    }

    public final boolean A06() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
            if (!((AnonymousClass4FG) copyOnWriteArrayList.get(size)).EtU(this)) {
                return false;
            }
        }
        return true;
    }

    public void A07() {
        if (this instanceof AnonymousClass56a) {
            A04();
            return;
        }
        C2812456m r0 = (C2812456m) this;
        r0.A04();
        List list = r0.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C2811456b) list.get(i)).A07();
        }
    }

    public void A08() {
        if (this instanceof AnonymousClass56a) {
            C2811956h r1 = ((AnonymousClass56a) this).A00;
            if (r1.A02) {
                r1.A00();
                return;
            }
            return;
        }
        C2812456m r12 = (C2812456m) this;
        if (r12.A03) {
            r12.A03 = false;
            r12.A01 = null;
            List list = r12.A07;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2811456b r13 = (C2811456b) list.get(i);
                if (r13.A0B()) {
                    r13.A08();
                }
            }
        }
    }

    public void A09(AnonymousClass4FJ r10) {
        C2812356l r0;
        C2811956h r2;
        String str;
        if (this instanceof AnonymousClass56a) {
            AnonymousClass56a r6 = (AnonymousClass56a) this;
            if (!r6.A06()) {
                r6.A02();
                return;
            }
            r6.A05();
            if (r6 instanceof AnonymousClass56Z) {
                AnonymousClass56Z r22 = (AnonymousClass56Z) r6;
                C2812556o r8 = new C2812556o(r22.A00);
                AnonymousClass56Y r1 = r22.A02;
                AnonymousClass56X r7 = r1.A01;
                C2812756q r5 = new C2812756q(r10.AuS(r7));
                C2812756q r4 = new C2812756q(r1.A00);
                C2812356l r3 = new C2812356l();
                Interpolator interpolator = r22.A01;
                if (interpolator != null) {
                    C2812956s r02 = new C2812956s(interpolator);
                    r2 = r22.A00;
                    str = "default_input";
                    r2.A01(r8, r02, str);
                    r2.A01(r02, r3, str);
                } else {
                    r2 = r22.A00;
                    str = "default_input";
                    r2.A01(r8, r3, str);
                }
                r2.A01(r5, r3, "initial");
                r2.A01(r4, r3, "end");
                r2.A01(r3, r10.Abf(r7), str);
            } else {
                C293355ka r23 = (C293355ka) r6;
                AnonymousClass5BS r52 = new AnonymousClass5BS(r23.A01);
                AnonymousClass56Y r12 = r23.A00;
                AnonymousClass56X r42 = r12.A01;
                C2812756q r32 = new C2812756q(r10.AuS(r42));
                C2812756q r13 = new C2812756q(r12.A00);
                C2811956h r24 = r23.A00;
                r24.A01(r32, r52, "initial");
                r24.A01(r13, r52, "end");
                r24.A01(r52, r10.Abf(r42), "default_input");
            }
            C2811956h r53 = r6.A00;
            C2812056i r62 = r53.A04;
            int i = 0;
            while (true) {
                ArrayList arrayList = r62.A00;
                if (i < arrayList.size()) {
                    C2812356l r33 = (C2812356l) arrayList.get(i);
                    C2812356l r25 = (C2812356l) r62.A02.get(i);
                    String str2 = (String) r62.A01.get(i);
                    Map map = r25.A03;
                    if (!(map == null || (r0 = (C2812356l) map.get(str2)) == null)) {
                        C2812056i.A00(r0, r25, str2);
                    }
                    ArrayList arrayList2 = r33.A02;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        r33.A02 = arrayList2;
                    }
                    arrayList2.add(r25);
                    Map map2 = r25.A03;
                    if (map2 == null) {
                        map2 = new LinkedHashMap();
                        r25.A03 = map2;
                    }
                    map2.put(str2, r33);
                    i++;
                } else {
                    r53.A01 = true;
                    r53.A02 = true;
                    r53.A03.A00(r53);
                    return;
                }
            }
        } else {
            C2812456m r43 = (C2812456m) this;
            if (!r43.A02) {
                r43.A02 = true;
                r43.A01 = r10;
                if (!r43.A06()) {
                    r43.A02();
                    return;
                }
                r43.A05();
                r43.A03 = true;
                List<C2811456b> list = r43.A07;
                for (C2811456b r03 : list) {
                    r03.A01.add(r43.A06);
                }
                if (r43.A05 == 0) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C2811456b) list.get(i2)).A09(r43.A01);
                    }
                    r43.A00 = list.size();
                    return;
                }
                int size2 = list.size();
                for (int i3 = 1; i3 < size2; i3++) {
                    ((C2811456b) list.get(i3)).A07();
                }
                C2812456m.A01(r43);
                return;
            }
            throw new RuntimeException("Starting binding multiple times");
        }
    }

    public void A0A(ArrayList arrayList) {
        AnonymousClass56Y r0;
        if (this instanceof AnonymousClass56Z) {
            r0 = ((AnonymousClass56Z) this).A02;
        } else if (this instanceof C293355ka) {
            r0 = ((C293355ka) this).A00;
        } else {
            List list = ((C2812456m) this).A07;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C2811456b) list.get(i)).A0A(arrayList);
            }
            return;
        }
        arrayList.add(r0);
    }

    public boolean A0B() {
        if (this instanceof AnonymousClass56a) {
            return ((AnonymousClass56a) this).A00.A02;
        }
        return ((C2812456m) this).A03;
    }
}
