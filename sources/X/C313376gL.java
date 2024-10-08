package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6gL  reason: invalid class name and case insensitive filesystem */
public final class C313376gL extends C252233om {
    public static final HashMap A06 = new HashMap();
    public boolean A00;
    public final C229382nI A01;
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final LinkedList A04 = new LinkedList();
    public final HashMap A05 = new HashMap();

    public final C305866Jw A00(String str) {
        C377589Mk r5 = new C377589Mk(str, 4);
        HashMap hashMap = this.A03;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Boolean) r5.invoke(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C305866Jw r0 = (C305866Jw) 00k.A0A(linkedHashMap.keySet());
        if (r0 == null) {
            return (C305866Jw) this.A05.get(str);
        }
        return r0;
    }

    public final void A01(C305866Jw r20) {
        String str;
        C305866Jw r3 = r20;
        C242423Ua r9 = r3.A01;
        HashMap hashMap = this.A03;
        if (!hashMap.containsKey(r3) && r9 != null) {
            LinkedList linkedList = this.A04;
            Object obj = null;
            if (!linkedList.isEmpty()) {
                obj = linkedList.poll();
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (hashMap.size() < 3) {
                C229382nI r1 = this.A01;
                UserSession userSession = r1.A06;
                0qQ.A07(userSession);
                if (!(userSession instanceof UserSession)) {
                    str = "Expected logged-in session to dequeue reusable player, but received logged-out session";
                } else {
                    C19370WWl wWl = new C19370WWl(this);
                    Fragment fragment = r1.A02;
                    fragment.getClass();
                    if (!fragment.isResumed() || fragment.getContext() == null) {
                        str = "Cannot create video player while fragment is not at least resumed";
                    } else {
                        obj = new C16386Uu3(fragment.requireContext(), userSession, wWl);
                    }
                }
                1Kn.A02("BKPlayerManager", str);
                return;
            }
            C16386Uu3 uu3 = (C16386Uu3) obj;
            if (uu3 != null) {
                hashMap.put(r3, obj);
                if (uu3.A00 == null) {
                    uu3.A00 = r3;
                }
                OI0 oi0 = r3.A02;
                C245983dn.A02((String) null);
                AnonymousClass4M3 r7 = uu3.A02;
                if ((r7 == null || ((AnonymousClass4M1) r7).A0M != AnonymousClass3OB.STOPPING) && uu3.A01 != oi0) {
                    uu3.A01 = oi0;
                    if (r7 == null) {
                        AnonymousClass4M1 A002 = AnonymousClass4M0.A00(uu3.A05, uu3.A07, uu3.A09, uu3, uu3.A08.getModuleName());
                        uu3.A02 = A002;
                        A002.EjF(uu3.A01.A04);
                        uu3.A02.Ech(uu3.A01.A02);
                        r7 = uu3.A02;
                        AnonymousClass4M1 r12 = (AnonymousClass4M1) r7;
                        r12.A0N = uu3;
                        r12.A0X = true;
                    }
                    r7.getClass();
                    AnonymousClass4M3 r2 = uu3.A02;
                    if (((AnonymousClass4M1) r2).A0M == AnonymousClass3OB.IDLE) {
                        AnonymousClass3WR r11 = oi0.A05;
                        C263754Nf r122 = new C263754Nf((Object) oi0, 0);
                        float f = 1.0f;
                        if (oi0.A09) {
                            f = 0.0f;
                        }
                        boolean z = oi0.A01;
                        r2.E4H(new C263794Nj(r9, new C263414Lx(false, false, false, false), r11, r122, (String) null, oi0.A06, f, -1, oi0.A00, z));
                    }
                }
                if (oi0.A01) {
                    this.A05.remove(r3.A00());
                }
            }
        }
    }

    public final void A03(String str) {
        String str2;
        C305866Jw r1;
        LinkedList linkedList = this.A04;
        if (linkedList.isEmpty()) {
            HashMap hashMap = this.A03;
            if (hashMap.size() == 3) {
                HashMap hashMap2 = this.A02;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    if (hashMap.containsKey(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                Object obj = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        float floatValue = ((Number) ((Map.Entry) obj).getValue()).floatValue();
                        do {
                            Object next = it.next();
                            float floatValue2 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                            if (Float.compare(floatValue, floatValue2) > 0) {
                                obj = next;
                                floatValue = floatValue2;
                            }
                        } while (it.hasNext());
                    }
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!(entry2 == null || (r1 = (C305866Jw) entry2.getKey()) == null)) {
                    A02(r1, "context_switch", false);
                }
            }
        }
        C305866Jw A002 = A00(str);
        if (A002 != null) {
            HashMap hashMap3 = this.A05;
            if (hashMap3.containsKey(str)) {
                hashMap3.remove(str);
                A01(A002);
            }
            HashMap hashMap4 = this.A03;
            C16386Uu3 uu3 = (C16386Uu3) hashMap4.get(A002);
            if (uu3 == null) {
                int size = linkedList.size();
                int size2 = hashMap4.size();
                if (hashMap3.containsKey(str)) {
                    str2 = "stopped";
                } else {
                    str2 = "idle";
                }
                1Kn.A02("BKPlayerManager", 002.A0x("Expected video to have been registered to manager | Available: ", ", In-use: ", ", Controller State: ", str2, size, size2));
                return;
            }
            uu3.A01(true);
        }
    }

    public final void onPause() {
        this.A00 = true;
        Collection<C16386Uu3> values = this.A03.values();
        0qQ.A07(values);
        for (C16386Uu3 A002 : values) {
            A002.A00(false);
        }
    }

    public final void onResume() {
        this.A00 = false;
        HashMap hashMap = this.A03;
        Set<C305866Jw> keySet = hashMap.keySet();
        0qQ.A07(keySet);
        for (C305866Jw r0 : keySet) {
            Object obj = hashMap.get(r0);
            if (obj != null) {
                ((C16386Uu3) obj).A01(r0.A02.A01);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void A02(C305866Jw r6, String str, boolean z) {
        int i;
        AnonymousClass3OB r1;
        C16386Uu3 uu3 = (C16386Uu3) this.A03.remove(r6);
        if (uu3 != null) {
            AnonymousClass4M3 r4 = uu3.A02;
            if (r4 == null || (r1 = ((AnonymousClass4M1) r4).A0M) == AnonymousClass3OB.IDLE || r1 == AnonymousClass3OB.STOPPING) {
                i = 0;
            } else {
                i = r4.getCurrentPositionMs();
                uu3.A02.EyP(str, false);
                uu3.A06.A03(uu3);
            }
            uu3.A00 = null;
            LinkedList linkedList = this.A04;
            if (!linkedList.contains(uu3)) {
                linkedList.add(uu3);
            }
            OI0 oi0 = r6.A02;
            if (z) {
                i = 0;
            }
            oi0.A00 = i;
            this.A05.put(r6.A00(), r6);
        }
    }

    public final void onDestroy() {
        C229382nI r1 = this.A01;
        r1.A06(this);
        this.A03.clear();
        this.A04.clear();
        this.A05.clear();
        this.A02.clear();
        A06.remove(r1);
    }

    public final void onDestroyView() {
        Collection values = this.A03.values();
        0qQ.A07(values);
        for (Object next : values) {
            0qQ.A07(next);
            C16386Uu3 uu3 = (C16386Uu3) next;
            AnonymousClass4M3 r0 = uu3.A02;
            if (r0 != null) {
                r0.ECP("fragment_paused");
                uu3.A03 = false;
                uu3.A02 = null;
            }
        }
        this.A04.addAll(values);
    }

    public C313376gL(C229382nI r2) {
        this.A01 = r2;
        r2.A05(this);
    }
}
