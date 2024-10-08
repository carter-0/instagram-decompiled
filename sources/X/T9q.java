package X;

import java.io.Serializable;
import java.util.List;

public final class T9q implements Serializable, Cloneable {
    public final int A00;
    public final List A01 = AnonymousClass7TE.A1C();

    public T9q(List list, int i) {
        0qQ.A0B(list, 1);
        this.A00 = i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = this.A01;
            Object obj = list.get(i2);
            0qQ.A0A(obj);
            TA1 ta1 = (TA1) obj;
            list2.add(new TA1(ta1.A00, ta1.A03, ta1.A01, ta1.A02));
        }
    }

    public final TA1 A00(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.A01;
        if (i < list.size()) {
            return (TA1) list.get(i);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new T9q(this.A01, this.A00);
    }
}
