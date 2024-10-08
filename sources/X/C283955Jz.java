package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Jz  reason: invalid class name and case insensitive filesystem */
public final class C283955Jz {
    public static final AnonymousClass5K0 A02 = new Object();
    public List A00 = new ArrayList();
    public final Map A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4VB, java.lang.Object] */
    public C283955Jz(C283955Jz r6) {
        0qQ.A0B(r6, 1);
        synchronized (r6) {
            List<AnonymousClass4VB> list = r6.A00;
            0qQ.A0A(list);
            for (AnonymousClass4VB r1 : list) {
                0qQ.A0B(r1, 1);
                ? obj = new Object();
                obj.A05 = new ArrayList();
                obj.A06 = new ArrayList();
                obj.A04 = new ArrayList();
                obj.A03 = new ArrayList();
                obj.A07 = new ArrayList();
                synchronized (r1) {
                    obj.A01 = r1.A01;
                    obj.A02 = r1.A02;
                    obj.A05 = r1.A05;
                    obj.A06 = r1.A06;
                    obj.A04 = r1.A04;
                    obj.A00 = r1.A00;
                    obj.A03 = r1.A03;
                }
                synchronized (this) {
                    A00(obj, this, AnonymousClass5K0.A00(obj));
                }
            }
        }
    }

    public static final synchronized void A00(AnonymousClass4VB r2, C283955Jz r3, String str) {
        synchronized (r3) {
            AnonymousClass4VB r1 = (AnonymousClass4VB) r3.A01.put(str, r2);
            if (r1 != null) {
                List list = r3.A00;
                0qQ.A0A(list);
                list.remove(r1);
            }
            List list2 = r3.A00;
            0qQ.A0A(list2);
            list2.add(r2);
        }
    }

    public C283955Jz() {
    }
}
