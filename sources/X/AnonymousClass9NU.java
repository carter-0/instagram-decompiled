package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9NU  reason: invalid class name */
public final class AnonymousClass9NU {
    public static int A07;
    public ArrayList A00;
    public final int A01;
    public final Integer A02;
    public final List A03;
    public final Set A04 = AnonymousClass7TE.A1F();
    public final Set A05;
    public final Set A06;

    public AnonymousClass9NU(Integer num, List list, Set set, Set set2) {
        int i;
        this.A02 = num;
        synchronized (AnonymousClass9NU.class) {
            i = A07;
            A07 = i + 1;
        }
        this.A01 = i;
        this.A05 = set;
        this.A06 = set2;
        this.A03 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9NV r2 = (AnonymousClass9NV) it.next();
            Integer num2 = r2.A00;
            if (num2 == AnonymousClass05K.A00 || num2 == AnonymousClass05K.A0C) {
                this.A04.addAll(r2.A01);
            }
        }
    }
}
