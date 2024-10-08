package X;

import java.util.List;

public final class TQq extends RuntimeException {
    public final Integer A00;
    public final Integer A01;
    public final List A02;

    public TQq(Integer num, Integer num2, List list) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = list;
    }

    public TQq() {
        this((Integer) null, (Integer) null, (List) null);
    }
}
