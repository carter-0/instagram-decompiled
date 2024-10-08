package X;

import java.util.List;

public final class QEU extends C232322tW {
    public final QEV A00;
    public final List A01;
    public final List A02;
    public final /* synthetic */ QEe A03;

    public QEU(QEV qev, QEe qEe, List list, List list2) {
        this.A03 = qEe;
        this.A00 = qev;
        this.A02 = list;
        this.A01 = list2;
    }

    public final int A02() {
        return this.A01.size();
    }

    public final int A03() {
        return this.A02.size();
    }

    public final boolean A04(int i, int i2) {
        return this.A00.areContentsTheSame((SUj) this.A02.get(i), (SUj) this.A01.get(i2));
    }

    public final boolean A05(int i, int i2) {
        return this.A00.areItemsTheSame((SUj) this.A02.get(i), (SUj) this.A01.get(i2));
    }
}
