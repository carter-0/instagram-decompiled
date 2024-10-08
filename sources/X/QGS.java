package X;

import java.util.List;

public final class QGS extends QGW {
    public final S5S A00;

    public QGS(List list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            S5S s5s = (S5S) ((ST4) list.get(i2)).A0E;
            if (s5s != null) {
                i = Math.max(i, s5s.A01.length);
            }
        }
        this.A00 = new S5S(new float[i], new int[i]);
    }
}
