package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.WqF  reason: case insensitive filesystem */
public final /* synthetic */ class C20374WqF implements Comparator {
    public final /* synthetic */ AnonymousClass6T2 A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ C20374WqF(AnonymousClass6T2 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        List list = this.A01;
        Number number = (Number) obj2;
        C276544tV A02 = AnonymousClass6T2.A02((AnonymousClass2TS) list.get(((Number) obj).intValue()));
        if (A02 != null) {
            i = A02.A03(81, 0);
        } else {
            i = 0;
        }
        C276544tV A022 = AnonymousClass6T2.A02((AnonymousClass2TS) list.get(number.intValue()));
        if (A022 != null) {
            i2 = A022.A03(81, 0);
        } else {
            i2 = 0;
        }
        if (i == i2) {
            return 0;
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }
}
