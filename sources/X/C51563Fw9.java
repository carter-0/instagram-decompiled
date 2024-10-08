package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.Fw9  reason: case insensitive filesystem */
public final class C51563Fw9 implements Comparator {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51563Fw9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        double d;
        double d2;
        double d3;
        if (this.A00 != 0) {
            ArrayList arrayList = FF0.A05;
            arrayList.contains(obj);
            if (!arrayList.contains(obj2)) {
                AbstractMap abstractMap = (AbstractMap) this.A01;
                Number number = (Number) abstractMap.get(obj);
                double d4 = 0.0d;
                if (number != null) {
                    d = number.doubleValue();
                } else {
                    d = 0.0d;
                }
                Number number2 = (Number) abstractMap.get(obj2);
                if (number2 != null) {
                    d2 = number2.doubleValue();
                } else {
                    d2 = 0.0d;
                }
                if (d > d2) {
                    return -1;
                }
                if (d >= d2) {
                    AbstractMap abstractMap2 = (AbstractMap) this.A02;
                    Number number3 = (Number) abstractMap2.get(obj);
                    if (number3 != null) {
                        d3 = number3.doubleValue();
                    } else {
                        d3 = 0.0d;
                    }
                    Number number4 = (Number) abstractMap2.get(obj2);
                    if (number4 != null) {
                        d4 = number4.doubleValue();
                    }
                    if (d3 > d4) {
                        return -1;
                    }
                    if (d3 < d4) {
                        return 1;
                    }
                    return 0;
                }
            }
            return 1;
        }
        List list = (List) this.A02;
        return list.indexOf(((1Xj) obj).A2n()) - list.indexOf(((1Xj) obj2).A2n());
    }
}
