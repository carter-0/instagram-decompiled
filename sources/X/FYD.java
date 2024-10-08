package X;

import java.util.List;

public final class FYD implements C232262tL {
    public final int A00;
    public final List A01;
    public final C62320sa A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FYD fyd = (FYD) obj;
        if (fyd == null || this.A00 != fyd.A00) {
            return false;
        }
        return true;
    }

    public FYD(int i, List list, C62320sa r3) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = r3;
    }
}
