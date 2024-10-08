package X;

import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.4yM  reason: invalid class name and case insensitive filesystem */
public final class C279274yM implements Runnable {
    public final /* synthetic */ C279254yK A00;

    public C279274yM(C279254yK r1) {
        this.A00 = r1;
    }

    public final void run() {
        boolean z;
        C279254yK r8 = this.A00;
        Iterator it = r8.A07.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            it.remove();
            1NH r1 = r8.A04;
            Object obj = r8.A05.get(str);
            obj.getClass();
            r1.A05(str, obj);
        }
        int i = r8.A00;
        if (i > 0) {
            while (true) {
                TreeSet treeSet = r8.A08;
                if (treeSet.size() > i) {
                    C17731Vd0 vd0 = (C17731Vd0) treeSet.pollFirst();
                    vd0.getClass();
                    Object remove = r8.A05.remove(C279254yK.A00(vd0.A0B, vd0.A06, vd0.A01));
                    if (remove != null) {
                        z = true;
                        if (remove == vd0) {
                            02V.A05(z);
                        }
                    }
                    z = false;
                    02V.A05(z);
                } else {
                    return;
                }
            }
        }
    }
}
