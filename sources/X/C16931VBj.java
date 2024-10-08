package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VBj  reason: case insensitive filesystem */
public abstract class C16931VBj {
    public static ArrayList A00(C322186vO r6, List list) {
        1Xj r1;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C297005r0) {
                List list2 = ((C297005r0) next).A02;
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : list2) {
                    if ((next2 instanceof C296985qy) && (r1 = ((C296985qy) next2).A01) != null && r6.Esp(r1)) {
                        arrayList2.add(r1);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }
}
