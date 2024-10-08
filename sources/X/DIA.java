package X;

import java.util.Comparator;

public final class DIA implements Comparator {
    public final int A00;

    public DIA(int i) {
        this.A00 = i;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable valueOf;
        Comparable valueOf2;
        int i;
        switch (this.A00) {
            case 0:
                valueOf = Integer.valueOf(((DQY) obj2).getIndex());
                valueOf2 = Integer.valueOf(((DQY) obj).getIndex());
                break;
            case 1:
                valueOf = Double.valueOf(((C250663lr) obj2).getCoercedDoubleField(2, "rank"));
                valueOf2 = Double.valueOf(((C250663lr) obj).getCoercedDoubleField(2, "rank"));
                break;
            case 2:
                valueOf = Double.valueOf(((BBO) obj2).A00);
                valueOf2 = Double.valueOf(((BBO) obj).A00);
                break;
            default:
                C233472vm r0 = (C233472vm) ((C376489Ie) obj).A04;
                int i2 = -1;
                if (r0 != null) {
                    i = r0.A09();
                } else {
                    i = -1;
                }
                valueOf = Integer.valueOf(i);
                C233472vm r02 = (C233472vm) ((C376489Ie) obj2).A04;
                if (r02 != null) {
                    i2 = r02.A09();
                }
                valueOf2 = Integer.valueOf(i2);
                break;
        }
        return 29b.A00(valueOf, valueOf2);
    }
}
