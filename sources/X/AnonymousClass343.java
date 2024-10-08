package X;

import android.widget.Adapter;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.343  reason: invalid class name */
public final class AnonymousClass343 {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final Set A03;
    public final AnonymousClass340 A04;
    public final AnonymousClass342 A05;
    public final AnonymousClass345 A06;
    public final AnonymousClass345 A07;

    public static C2355130d A00(AnonymousClass343 r2, Object obj) {
        return (C2355130d) r2.A00.get(r2.A04.C9H(obj));
    }

    public final void A01() {
        AnonymousClass342 r3 = this.A05;
        r3.FND(this.A07, this);
        Map map = this.A01;
        if (!map.isEmpty()) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    C2355130d A002 = A00(this, next);
                    if (A002 != null) {
                        A002.Cry(next);
                    }
                    it.remove();
                }
            }
        }
        Map map2 = this.A02;
        if (!map2.isEmpty()) {
            Iterator it2 = map2.values().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (next2 != null) {
                    C2355130d A003 = A00(this, next2);
                    if (A003 != null) {
                        A003.Crz(next2);
                    }
                    it2.remove();
                }
            }
        }
        r3.FND(this.A06, this);
    }

    public final void A02(AnonymousClass345 r5, int i) {
        String obj;
        Object C9G = this.A04.C9G(i);
        if (C9G != null) {
            C2355130d A002 = A00(this, C9G);
            if (A002 != null) {
                A002.FN9(r5, i);
                return;
            }
            if (C9G instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) C9G;
                C252553pI r3 = recyclerView.A0D;
                2Rw r0 = recyclerView.A0A;
                r0.getClass();
                String name = r0.getClass().getName();
                r3.getClass();
                obj = 002.A0g(name, "/", r3.getClass().getName());
            } else if (C9G instanceof ListView) {
                obj = C9G.getClass().toString();
            } else {
                return;
            }
            if (obj != null) {
                Set set = this.A03;
                if (!set.contains(obj)) {
                    set.add(obj);
                    0wb.A03("Missing VisibleItemTracker", 002.A0R("Please ensure all the items are being tracked with VisibleItemTracker from ", obj));
                }
            }
        }
    }

    public AnonymousClass343(AnonymousClass340 r6, AnonymousClass342 r7, List list) {
        this.A07 = new AnonymousClass344(this);
        this.A06 = new AnonymousClass346(this);
        this.A02 = new HashMap();
        this.A01 = new HashMap();
        this.A03 = new HashSet();
        this.A00 = new HashMap();
        this.A04 = r6;
        this.A05 = r7;
        for (int i = 0; i < list.size(); i++) {
            C2355130d r3 = (C2355130d) list.get(i);
            Class C9I = r3.C9I();
            17k.A0G(!this.A00.containsKey(C9I), "VisibleItemTracker cannot register two Tracked with the same class");
            this.A00.put(C9I, r3);
        }
    }

    public AnonymousClass343(Adapter adapter, AnonymousClass4DV r5, C2355130d... r6) {
        this((AnonymousClass340) new C2365033z(adapter), (AnonymousClass342) new AnonymousClass341(r5), Arrays.asList(r6));
    }

    public AnonymousClass343(RecyclerView recyclerView, AnonymousClass340 r4, C2355130d... r5) {
        this(r4, (AnonymousClass342) new C52439GSr(recyclerView), Arrays.asList(r5));
    }
}
