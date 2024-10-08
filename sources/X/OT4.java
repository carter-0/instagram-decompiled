package X;

import java.util.List;

public final class OT4 {
    public final Number A00;
    public final List A01;

    public OT4(Number number, List list) {
        this.A01 = list;
        this.A00 = number;
    }

    public OT4() {
        this((Number) null, (List) null);
    }
}
