package X;

import java.util.Iterator;

/* renamed from: X.GVs  reason: case insensitive filesystem */
public final class C52515GVs implements AnonymousClass2U7 {
    public final 0sP A00;
    public final AnonymousClass2U7 A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Iterator, X.XFE] */
    public final Iterator iterator() {
        return new XFE(this.A01.iterator(), this.A00);
    }

    public C52515GVs(0sP r1, AnonymousClass2U7 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
