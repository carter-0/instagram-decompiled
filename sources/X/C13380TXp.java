package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TXp  reason: case insensitive filesystem */
public final class C13380TXp extends 0Yg implements 0sP {
    public static final C13380TXp A00 = new C13380TXp();

    public C13380TXp() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        List list;
        double d;
        List list2 = (List) obj;
        int i = 0;
        0qQ.A0B(list2, 0);
        List A0f = Dbb.A0f(-1.0d);
        if ((!list2.isEmpty()) && list2.size() == 1) {
            int i2 = 0;
            if (list2.size() > 0) {
                obj2 = list2.get(0);
            } else {
                obj2 = Example.A03;
            }
            HashMap hashMap = ((Example) obj2).A02;
            FeatureData featureData = (FeatureData) hashMap.get("222");
            if (featureData != null) {
                i = (int) featureData.A01;
            }
            double A04 = Pxj.A04(hashMap);
            FeatureData featureData2 = (FeatureData) hashMap.get("444");
            if (featureData2 == null || (list = featureData2.A07) == null) {
                list = 0sn.A00;
            }
            if (i > 0 && A04 != -1.0d && list.size() >= i) {
                List A0h = 00k.A0h(list, i);
                if (!(A0h instanceof Collection) || !A0h.isEmpty()) {
                    Iterator it = A0h.iterator();
                    while (it.hasNext()) {
                        if (Pxg.A0H(it) == 1 && (i2 = i2 + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
                if (((double) i2) / ((double) A0h.size()) >= A04) {
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
