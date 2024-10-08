package X;

import java.util.Iterator;

/* renamed from: X.Wr8  reason: case insensitive filesystem */
public final class C20423Wr8 implements AnonymousClass2U7, C66577MXi {
    public final int A00;
    public final AnonymousClass2U7 A01;

    public final AnonymousClass2U7 EzV(int i) {
        if (i >= this.A00) {
            return this;
        }
        return new C20423Wr8(this.A01, i);
    }

    public final Iterator iterator() {
        return new C20387WqT(this);
    }

    public C20423Wr8(AnonymousClass2U7 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
