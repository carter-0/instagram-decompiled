package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6IF  reason: invalid class name */
public final class AnonymousClass6IF {
    public final List A00 = new ArrayList();

    public /* synthetic */ AnonymousClass6IF(List list, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public final int A00() {
        int intValue;
        List list = this.A00;
        if (list.size() > 0) {
            int intValue2 = ((Number) list.get(0)).intValue();
            while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
                list.set(0, 00k.A0K(list));
                list.remove(list.size() - 1);
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = ((Number) list.get(i)).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = ((Number) list.get(i3)).intValue();
                    if (i2 < size && (intValue = ((Number) list.get(i2)).intValue()) > intValue4) {
                        if (intValue <= intValue3) {
                            break;
                        }
                        list.set(i, Integer.valueOf(intValue));
                        list.set(i2, Integer.valueOf(intValue3));
                        i = i2;
                    } else if (intValue4 <= intValue3) {
                        break;
                    } else {
                        list.set(i, Integer.valueOf(intValue4));
                        list.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        AnonymousClass5XN.A03("Set is empty");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(int i) {
        List list = this.A00;
        if (!(!list.isEmpty()) || !(((Number) list.get(0)).intValue() == i || ((Number) list.get(list.size() - 1)).intValue() == i)) {
            int size = list.size();
            Integer valueOf = Integer.valueOf(i);
            list.add(valueOf);
            while (size > 0) {
                int i2 = ((size + 1) >>> 1) - 1;
                int intValue = ((Number) list.get(i2)).intValue();
                if (i <= intValue) {
                    break;
                }
                list.set(size, Integer.valueOf(intValue));
                size = i2;
            }
            list.set(size, valueOf);
        }
    }

    public AnonymousClass6IF() {
    }
}
