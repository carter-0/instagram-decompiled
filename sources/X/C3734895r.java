package X;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.95r  reason: invalid class name and case insensitive filesystem */
public final class C3734895r extends C3734995s {
    public static final C3734495k A06 = C3735095t.A00;
    public final List A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final AtomicReference A04 = new AtomicReference();
    public final C3735195u A05;

    public final void A05(boolean z) {
        HashMap hashMap;
        if (1FH.A00((Object) null, Boolean.valueOf(z), this.A04)) {
            synchronized (this) {
                hashMap = new HashMap(this.A01);
            }
            A00(hashMap);
        }
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [X.AXA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.96M, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v17, types: [X.96M, java.lang.Object] */
    public C3734895r(Iterable iterable, Collection collection, Executor executor) {
        Map map;
        C3735195u r3 = new C3735195u(executor);
        this.A05 = r3;
        ArrayList arrayList = new ArrayList();
        Class<C3735195u> cls = C3735195u.class;
        arrayList.add(AnonymousClass95n.A00(cls, r3, cls, C3735295v.class));
        arrayList.add(AnonymousClass95n.A00(C3734895r.class, this, new Class[0]));
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.A00 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((C3734495k) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(componentRegistrar.getComponents());
                        it.remove();
                    }
                } catch (AnonymousClass9G3 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            map = this.A01;
            if (map.isEmpty()) {
                AnonymousClass96I.A00(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(map.keySet());
                arrayList4.addAll(arrayList);
                AnonymousClass96I.A00(arrayList4);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AnonymousClass95n r2 = (AnonymousClass95n) it2.next();
                map.put(r2, new AnonymousClass96L(new AX9(r2, this)));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                AnonymousClass95n r1 = (AnonymousClass95n) it3.next();
                if (r1.A01 == 0) {
                    C3734495k r4 = (C3734495k) map.get(r1);
                    for (Object next2 : r1.A04) {
                        Map map2 = this.A02;
                        if (!map2.containsKey(next2)) {
                            map2.put(next2, r4);
                        } else {
                            arrayList5.add(new C40981AmR((AXA) ((C3734495k) map2.get(next2)), r4));
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                AnonymousClass95n r12 = (AnonymousClass95n) entry.getKey();
                if (r12.A01 != 0) {
                    Object value = entry.getValue();
                    for (Object next3 : r12.A04) {
                        if (!hashMap.containsKey(next3)) {
                            hashMap.put(next3, new HashSet());
                        }
                        ((Set) hashMap.get(next3)).add(value);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                Map map3 = this.A03;
                boolean containsKey = map3.containsKey(entry2.getKey());
                Object key = entry2.getKey();
                if (!containsKey) {
                    ? obj = new Object();
                    obj.A00 = null;
                    obj.A01 = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.A01.addAll((Collection) entry2.getValue());
                    map3.put(key, obj);
                } else {
                    AnonymousClass96M r32 = (AnonymousClass96M) map3.get(key);
                    for (C3734495k amS : (Set) entry2.getValue()) {
                        arrayList6.add(new C40982AmS(r32, amS));
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            for (AnonymousClass95n r6 : map.keySet()) {
                Iterator it4 = r6.A03.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        C3735395y r10 = (C3735395y) it4.next();
                        int i = r10.A01;
                        boolean z = false;
                        if (i == 2) {
                            z = true;
                            Map map4 = this.A03;
                            Class cls2 = r10.A02;
                            if (!map4.containsKey(cls2)) {
                                Set emptySet = Collections.emptySet();
                                ? obj2 = new Object();
                                obj2.A00 = null;
                                obj2.A01 = Collections.newSetFromMap(new ConcurrentHashMap());
                                obj2.A01.addAll(emptySet);
                                map4.put(cls2, obj2);
                            }
                        }
                        Map map5 = this.A02;
                        Class cls3 = r10.A02;
                        if (map5.containsKey(cls3)) {
                            continue;
                        } else if (i == 1) {
                            throw new RuntimeException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{r6, cls3}));
                        } else if (!z) {
                            C39843ABp aBp = AXA.A02;
                            C3734495k r13 = AXA.A03;
                            ? obj3 = new Object();
                            obj3.A00 = aBp;
                            obj3.A01 = r13;
                            map5.put(cls3, obj3);
                        }
                    }
                }
            }
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        if (this.A04.get() != null) {
            A00(map);
        }
    }

    private void A00(Map map) {
        Queue queue;
        Queue queue2;
        for (Map.Entry entry : map.entrySet()) {
            C3734495k r2 = (C3734495k) entry.getValue();
            if (((AnonymousClass95n) entry.getKey()).A00 == 1) {
                r2.get();
            }
        }
        C3735195u r1 = this.A05;
        synchronized (r1) {
            queue = r1.A00;
            queue2 = null;
            if (queue != null) {
                r1.A00 = queue2;
            } else {
                queue = queue2;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            if (it.hasNext()) {
                it.next();
                queue2.getClass();
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
