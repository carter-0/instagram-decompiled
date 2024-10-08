package X;

import java.util.Iterator;

/* renamed from: X.Qw0  reason: case insensitive filesystem */
public final class C8504Qw0 extends C8501Qvx {
    public final transient C8499Qvv A00;
    public final transient C13137TMv A01;

    public final boolean contains(Object obj) {
        return AnonymousClass7TF.A1V(this.A01.get(obj));
    }

    public final /* synthetic */ Iterator iterator() {
        return this.A00.listIterator(0);
    }

    public final int size() {
        return this.A01.size();
    }

    public C8504Qw0(C8499Qvv qvv, C13137TMv tMv) {
        this.A01 = tMv;
        this.A00 = qvv;
    }
}
