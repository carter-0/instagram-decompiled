package X;

import java.util.List;

public final class GPV {
    public boolean A00;
    public final 01c A01;
    public final GQK A02;

    public final boolean A00(long j) {
        Object obj;
        List list = this.A02.A01;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((GQJ) obj).A02 == j) {
                break;
            }
            i++;
        }
        GQJ gqj = (GQJ) obj;
        if (gqj != null) {
            return gqj.A09;
        }
        return false;
    }

    public GPV(01c r1, GQK gqk) {
        this.A01 = r1;
        this.A02 = gqk;
    }
}
