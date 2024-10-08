package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TXq  reason: case insensitive filesystem */
public final class C13381TXq extends 0Yg implements 0sP {
    public static final C13381TXq A00 = new C13381TXq();

    public C13381TXq() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        long j;
        List list;
        List list2;
        int i;
        double d;
        List list3 = (List) obj;
        0qQ.A0B(list3, 0);
        List A0f = Dbb.A0f(-1.0d);
        if ((!list3.isEmpty()) && list3.size() == 1) {
            int i2 = 0;
            if (list3.size() > 0) {
                obj2 = list3.get(0);
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
            FeatureData featureData3 = (FeatureData) hashMap.get("555");
            if (featureData3 == null || (list2 = featureData3.A07) == null) {
                list2 = 0sn.A00;
            }
            if (j > 0 && A04 != -1.0d && ((long) (list.size() + list2.size())) >= j) {
                List A0h = 00k.A0h(list, 20);
                List A0h2 = 00k.A0h(list2, 20);
                if (!(A0h instanceof Collection) || !A0h.isEmpty()) {
                    Iterator it = A0h.iterator();
                    i = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (Pxg.A0H(it) == 1 && (i = i + 1) < 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    i = 0;
                }
                if (!(A0h2 instanceof Collection) || !A0h2.isEmpty()) {
                    Iterator it2 = A0h2.iterator();
                    while (it2.hasNext()) {
                        if (Pxg.A0H(it2) == 1 && (i2 = i2 + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
                if (((double) (i + i2)) / ((double) (A0h.size() + A0h2.size())) >= A04) {
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
