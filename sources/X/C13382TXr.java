package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TXr  reason: case insensitive filesystem */
public final class C13382TXr extends 0Yg implements 0sP {
    public static final C13382TXr A00 = new C13382TXr();

    public C13382TXr() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        int i;
        List list;
        List list2;
        int i2;
        double d;
        Double valueOf;
        List list3 = (List) obj;
        0qQ.A0B(list3, 0);
        List A0f = Dbb.A0f(-1.0d);
        if ((!list3.isEmpty()) && list3.size() == 1) {
            int i3 = 0;
            if (list3.size() > 0) {
                obj2 = list3.get(0);
            } else {
                obj2 = Example.A03;
            }
            HashMap hashMap = ((Example) obj2).A02;
            FeatureData featureData = (FeatureData) hashMap.get("222");
            if (featureData != null) {
                i = (int) featureData.A01;
            } else {
                i = 0;
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
            if (i > 0 && A04 != -1.0d) {
                if (list.size() >= i) {
                    List A0h = 00k.A0h(list, i);
                    if (!(A0h instanceof Collection) || !A0h.isEmpty()) {
                        Iterator it = A0h.iterator();
                        while (it.hasNext()) {
                            if (Pxg.A0H(it) == 1 && (i3 = i3 + 1) < 0) {
                                0sr.A1S();
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                    d = (double) i3;
                } else if (list.size() + list2.size() >= i) {
                    List A0h2 = 00k.A0h(list2, i - list.size());
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        i2 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                if (Pxg.A0H(it2) == 1 && (i2 = i2 + 1) < 0) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        0sr.A1S();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    i2 = 0;
                    if (!(A0h2 instanceof Collection) || !A0h2.isEmpty()) {
                        Iterator it3 = A0h2.iterator();
                        while (it3.hasNext()) {
                            if (Pxg.A0H(it3) == 1 && (i3 = i3 + 1) < 0) {
                                0sr.A1S();
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                    d = (double) (i2 + i3);
                }
                if (d / ((double) i) >= A04) {
                    valueOf = Double.valueOf(1.0d);
                } else {
                    valueOf = Double.valueOf(0.0d);
                }
                A0f = AnonymousClass7TE.A1I(valueOf);
            }
        }
        A0f.toString();
        return A0f;
    }
}
