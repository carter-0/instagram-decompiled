package X;

import java.util.List;

public final class QFZ extends C60140do {
    public final /* synthetic */ C7923Qcu A00;

    public QFZ(C7923Qcu qcu) {
        this.A00 = qcu;
    }

    public final void onPageSelected(int i) {
        C7923Qcu qcu = this.A00;
        List list = qcu.A05;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                List list2 = qcu.A05;
                0qQ.A0A(list2);
                list2.get(i2);
            }
        }
    }
}
