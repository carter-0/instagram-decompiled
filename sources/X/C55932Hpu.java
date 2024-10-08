package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.Hpu  reason: case insensitive filesystem */
public final class C55932Hpu {
    public final AnonymousClass6HD A00 = new AnonymousClass6HD();
    public final AnonymousClass6HD A01 = new AnonymousClass6HD();

    public final Object A00(Integer num, Integer num2, String str, String str2, AnonymousClass4D7 r11) {
        AnonymousClass6HD r5;
        Object obj;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r4 = new 1IW(1, 1Ey.A02(r11));
        r4.A0I();
        C55765Hn0 hn0 = new C55765Hn0(num, str, str2, r4);
        if (num2.intValue() != 0) {
            r5 = this.A00;
        } else {
            r5 = this.A01;
        }
        if (str2 != null) {
            Iterator it = r5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C55765Hn0) obj).A02, str2)) {
                    break;
                }
            }
            C55765Hn0 hn02 = (C55765Hn0) obj;
            if (hn02 != null) {
                C62473KgO kgO = C62473KgO.Replaced;
                this.A01.remove((Object) hn02);
                this.A00.remove((Object) hn02);
                1IX r1 = hn02.A03;
                if (r1.isActive()) {
                    r1.resumeWith(kgO);
                }
            }
        }
        r5.add(hn0);
        return r4.A0E();
    }
}
