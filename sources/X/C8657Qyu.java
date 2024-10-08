package X;

import java.util.Iterator;

/* renamed from: X.Qyu  reason: case insensitive filesystem */
public final class C8657Qyu extends C367698rQ<K, V>.AbstractCacheSet<K> {
    public final /* synthetic */ C367698rQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8657Qyu(C367698rQ r1) {
        super(r1);
        this.A00 = r1;
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        return new C41291ArX(this.A00);
    }

    public final boolean remove(Object obj) {
        return AnonymousClass7TF.A1V(this.A00.remove(obj));
    }
}
