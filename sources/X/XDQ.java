package X;

import java.util.List;

public final class XDQ extends XDN {
    public final int A00;
    public final List A01;

    public XDQ(int i, List list) {
        super(2);
        this.A00 = i;
        this.A01 = list;
    }
}
