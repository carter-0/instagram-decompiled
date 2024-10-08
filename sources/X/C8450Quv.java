package X;

import java.util.Iterator;

/* renamed from: X.Quv  reason: case insensitive filesystem */
public final class C8450Quv extends C8443Quo {
    public final transient Object A00;

    public final int size() {
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Iterator, X.Qv3, java.lang.Object] */
    public final /* synthetic */ Iterator iterator() {
        Object obj = this.A00;
        ? obj2 = new Object();
        obj2.A00 = obj;
        return obj2;
    }

    public final String toString() {
        return 002.A0g("[", this.A00.toString(), "]");
    }

    public C8450Quv(Object obj) {
        this.A00 = obj;
    }
}
