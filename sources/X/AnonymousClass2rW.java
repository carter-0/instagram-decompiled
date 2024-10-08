package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2rW  reason: invalid class name */
public abstract class AnonymousClass2rW implements AnonymousClass2rX {
    public C229742nx A00;
    public List A01;
    public final LinkedList A02 = new LinkedList();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Set A05;

    public abstract String A03(Object obj);

    public void A05() {
    }

    public final void A08(C231802sQ r6) {
        0qQ.A0B(r6, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.A02.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            if (r6.Esp(next)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            A0C(it2.next());
        }
        this.A01 = Collections.unmodifiableList(arrayList2);
        A00(this);
    }

    public void A09(Object obj) {
    }

    public final void A0A(List list) {
        0qQ.A0B(list, 0);
        for (Object A012 : list) {
            A01(this, A012, this.A02.size(), true);
        }
    }

    public static final void A00(AnonymousClass2rW r5) {
        Map map = r5.A03;
        map.clear();
        int size = r5.A01.size();
        for (int i = 0; i < size; i++) {
            map.put(r5.A03(r5.A01.get(i)), Integer.valueOf(i));
        }
    }

    public int A02() {
        return this.A01.size();
    }

    public void A04() {
        this.A04.clear();
        this.A02.clear();
        this.A01 = Collections.unmodifiableList(new ArrayList());
        this.A03.clear();
        A05();
        for (C228382la r0 : this.A05) {
            if (r0 != null) {
                r0.DMW();
            }
        }
    }

    public final void A06() {
        this.A01 = Collections.unmodifiableList(new ArrayList(this.A02));
        A00(this);
    }

    public final void A07(int i) {
        Set<C228382la> set = this.A05;
        if (!set.isEmpty()) {
            LinkedList linkedList = this.A02;
            int size = linkedList.size();
            while (i < size) {
                Object obj = linkedList.get(i);
                if (obj != null) {
                    for (C228382la r0 : set) {
                        if (r0 != null) {
                            r0.DLo(obj, i);
                        }
                    }
                }
                i++;
            }
        }
    }

    public final boolean A0C(Object obj) {
        boolean remove = this.A02.remove(obj);
        this.A04.remove(A03(obj));
        if (remove) {
            if (this instanceof AnonymousClass2rV) {
                AnonymousClass2rV r1 = (AnonymousClass2rV) this;
                1Xl r2 = ((1Xg) obj).A05;
                if (r2 instanceof 1Xl) {
                    Set set = r1.A01;
                    0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
                    set.remove(r2.BPf());
                }
            }
        }
        for (C228382la r0 : this.A05) {
            if (r0 != null) {
                r0.DMI();
            }
        }
        return remove;
    }

    public final boolean A0D(String str) {
        Number number = (Number) this.A03.get(str);
        if (number != null) {
            if (!A0C(this.A01.get(number.intValue()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator Eaa(C228382la r2) {
        this.A05.add(r2);
        Iterator it = this.A02.iterator();
        0qQ.A07(it);
        return it;
    }

    public AnonymousClass2rW() {
        List unmodifiableList = Collections.unmodifiableList(new ArrayList());
        0qQ.A07(unmodifiableList);
        this.A01 = unmodifiableList;
        this.A05 = new HashSet();
    }

    public static final void A01(AnonymousClass2rW r3, Object obj, int i, boolean z) {
        String A032 = r3.A03(obj);
        Map map = r3.A04;
        Object obj2 = map.get(A032);
        if (obj2 == null) {
            map.put(A032, obj);
            r3.A02.add(i, obj);
            if (z) {
                for (C228382la r0 : r3.A05) {
                    if (r0 != null) {
                        r0.DLo(obj, i);
                    }
                }
            }
            r3.A09(obj);
            return;
        }
        C229742nx r1 = r3.A00;
        if (r1 != null) {
            r1.DM1(obj, r3.A02.indexOf(obj2), i);
        }
    }

    public final boolean A0B(Object obj) {
        String A032 = A03(obj);
        0qQ.A0B(A032, 0);
        return this.A04.containsKey(A032);
    }
}
