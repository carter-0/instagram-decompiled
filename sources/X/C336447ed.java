package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.7ed  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C336447ed implements Comparator {
    public final /* synthetic */ AnonymousClass2hV A00;
    public final /* synthetic */ Comparator A01;
    public final /* synthetic */ Map A02;

    public /* synthetic */ C336447ed(AnonymousClass2hV r1, Comparator comparator, Map map) {
        this.A02 = map;
        this.A00 = r1;
        this.A01 = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        Map map = this.A02;
        AnonymousClass2hV r3 = this.A00;
        Comparator comparator = this.A01;
        Number number = (Number) map.get(r3.apply(obj));
        Number number2 = (Number) map.get(r3.apply(obj2));
        if (comparator != null) {
            i = comparator.compare(obj, obj2);
        } else {
            i = -1;
        }
        if (number == null) {
            if (number2 == null) {
                return i;
            }
            return 1;
        } else if (number2 == null) {
            return -1;
        } else {
            double doubleValue = number.doubleValue();
            double doubleValue2 = number2.doubleValue();
            if (doubleValue < doubleValue2) {
                return 1;
            }
            if (doubleValue > doubleValue2) {
                return -1;
            }
        }
        return i;
    }
}
