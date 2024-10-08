package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TXo  reason: case insensitive filesystem */
public final class C13379TXo extends 0Yg implements 0sP {
    public static final C13379TXo A00 = new C13379TXo();

    public C13379TXo() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        long j;
        List list;
        double d;
        List list2 = (List) obj;
        0qQ.A0B(list2, 0);
        List A0f = Dbb.A0f(-1.0d);
        if ((!list2.isEmpty()) && list2.size() == 1) {
            int i = 0;
            if (list2.size() > 0) {
                obj2 = list2.get(0);
            } else {
                obj2 = Example.A03;
            }
            HashMap hashMap = ((Example) obj2).A02;
            FeatureData featureData = (FeatureData) hashMap.get("111");
            if (featureData != null) {
                j = featureData.A01;
            } else {
                j = 0;
            }
            double A04 = Pxj.A04(hashMap);
            FeatureData featureData2 = (FeatureData) hashMap.get("444");
            if (featureData2 == null || (list = featureData2.A07) == null) {
                list = 0sn.A00;
            }
            if (j > 0 && A04 != -1.0d && ((long) list.size()) >= j) {
                List A0h = 00k.A0h(list, 20);
                if (!(A0h instanceof Collection) || !A0h.isEmpty()) {
                    Iterator it = A0h.iterator();
                    while (it.hasNext()) {
                        if (Pxg.A0H(it) == 1 && (i = i + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
                if (((double) i) / ((double) A0h.size()) >= A04) {
                    d = 1.0d;
                } else {
                    d = 0.0d;
                }
                A0f = Dbb.A0f(d);
            }
        }
        A0f.toString();
        return A0f;
    }
}
