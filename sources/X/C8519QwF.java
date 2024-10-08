package X;

import java.util.Iterator;

/* renamed from: X.QwF  reason: case insensitive filesystem */
public final class C8519QwF extends C8513Qw9 {
    public final transient C8518QwE A00;
    public final transient C13138TMw A01;

    public final boolean contains(Object obj) {
        return AnonymousClass7TF.A1V(this.A01.get(obj));
    }

    public final /* synthetic */ Iterator iterator() {
        return this.A00.listIterator(0);
    }

    public final int size() {
        return this.A01.size();
    }

    public C8519QwF(C8518QwE qwE, C13138TMw tMw) {
        this.A01 = tMw;
        this.A00 = qwE;
    }
}
