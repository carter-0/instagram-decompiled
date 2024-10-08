package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3mV  reason: invalid class name and case insensitive filesystem */
public final class C251063mV implements Runnable {
    public final /* synthetic */ C250903mF A00;
    public final /* synthetic */ C64471Pa A01;
    public final /* synthetic */ List A02;

    public C251063mV(C250903mF r1, C64471Pa r2, List list) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = r1;
    }

    public final void run() {
        C64471Pa r3 = this.A01;
        List list = this.A02;
        C250903mF r4 = this.A00;
        Integer num = r4.A02;
        0qQ.A07(num);
        Integer num2 = r4.A0A;
        0qQ.A07(num2);
        if (!list.isEmpty()) {
            C249863kU r12 = r3.A02;
            LinkedList linkedList = r12.A02;
            if (linkedList.isEmpty()) {
                1PX r32 = r3.A01;
                if (r32.A01()) {
                    r12.A07(num, num2, list, 0, true);
                    int size = linkedList.size();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        C251373n0 r8 = (C251373n0) it.next();
                        if (System.currentTimeMillis() - r8.AsM() >= TimeUnit.MINUTES.toMillis((long) r12.A01)) {
                            arrayList.add(r8.BTb());
                            it.remove();
                        }
                    }
                    int size2 = linkedList.size();
                    if (size2 < size) {
                        for (C308816Vs DY6 : r12.A00) {
                            DY6.DY6(size, size2);
                        }
                    }
                    if (!linkedList.isEmpty()) {
                        r32.A00(r4);
                    }
                }
            }
        }
    }
}
