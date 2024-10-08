package X;

import java.util.Arrays;
import java.util.List;

public final class QEL extends C11340SNw {
    public final long A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final List A02 = AnonymousClass7TE.A1C();

    public final QEL A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            QEL qel = (QEL) list.get(i2);
            if (qel.A00 == i) {
                return qel;
            }
        }
        return null;
    }

    public final QEK A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            QEK qek = (QEK) list.get(i2);
            if (qek.A00 == i) {
                return qek;
            }
        }
        return null;
    }

    public final String toString() {
        return 002.A11(C11340SNw.A00(this.A00), " leaves: ", Arrays.toString(this.A02.toArray()), " containers: ", Arrays.toString(this.A01.toArray()));
    }

    public QEL(int i, long j) {
        super(i);
        this.A00 = j;
    }
}
