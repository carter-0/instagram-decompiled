package X;

import java.util.List;

public final class S4O {
    public final Object A00;
    public final List A01 = AnonymousClass7TE.A1C();

    public final String toString() {
        StringBuilder A14 = Pxe.A14(100);
        A14.append(C51968G9o.A16(this.A00));
        A14.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A14.append(AnonymousClass7TE.A19(list, i));
            if (i < size - 1) {
                Pxe.A1Y(A14);
            }
        }
        return Pxg.A0x(A14);
    }

    public /* synthetic */ S4O(Object obj) {
        this.A00 = obj;
    }

    public final void A00(Object obj, String str) {
        this.A01.add(002.A0g(str, "=", String.valueOf(obj)));
    }
}
