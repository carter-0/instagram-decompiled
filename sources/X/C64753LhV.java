package X;

import java.util.List;

/* renamed from: X.LhV  reason: case insensitive filesystem */
public final class C64753LhV implements C232262tL {
    public final List A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00.hashCode());
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64753LhV lhV = (C64753LhV) obj;
        0qQ.A0B(lhV, 0);
        return 0qQ.A0K(this.A00, lhV.A00);
    }

    public C64753LhV(List list) {
        this.A00 = list;
    }
}
