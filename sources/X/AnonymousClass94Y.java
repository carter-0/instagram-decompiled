package X;

import com.facebook.odin.model.Example;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.94Y  reason: invalid class name */
public final class AnonymousClass94Y {
    public final AnonymousClass0JP A00;
    public final C258913zq A01;
    public final AnonymousClass94X A02;

    public AnonymousClass94Y(AnonymousClass0JP r2, C258913zq r3, AnonymousClass94X r4) {
        0qQ.A0B(r3, 2);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C258743zZ r7 = (C258743zZ) it.next();
            if (r7.CZg()) {
                C258913zq r4 = this.A01;
                if (!r4.CL1(r7.CCP(), r7.Bsd()).A02) {
                    AnonymousClass40G A002 = this.A02.A00(AAG.A00(r7));
                    if (A002.A02) {
                        Object obj = A002.A00;
                        if (!((Collection) obj).isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            List<Example> list2 = (List) obj;
                            if (0qQ.A0K(r7.CCP(), "FB_CP")) {
                                for (Example example : list2) {
                                    String CCP = r7.CCP();
                                    0qQ.A0B(CCP, 0);
                                    0qQ.A0B(example, 1);
                                    Map map = example.A00.A04;
                                    r4.Eya(example, 002.A0T(CCP, (String) map.get("2476"), '_'), this.A00.now());
                                    Object obj2 = map.get("2476");
                                    if (obj2 == null) {
                                        obj2 = "";
                                    }
                                    arrayList2.add(obj2);
                                }
                            } else {
                                r4.Eya((Example) list2.get(0), r7.CCP(), this.A00.now());
                            }
                            arrayList.add(arrayList2);
                            r4.EyZ(r7.CCP(), arrayList2);
                        }
                    }
                } else {
                    arrayList.add(r4.E6O(r7.CCP()));
                }
            }
        }
    }
}
