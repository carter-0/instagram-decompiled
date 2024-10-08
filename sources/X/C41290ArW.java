package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.ArW  reason: case insensitive filesystem */
public final class C41290ArW implements Iterator {
    public int A00 = -1;
    public final /* synthetic */ C229172mx A01;

    public C41290ArW(C229172mx r2) {
        this.A01 = r2;
    }

    public final boolean hasNext() {
        int i = this.A00 + 1;
        C229172mx r2 = this.A01;
        if (i >= r2.A01.size() + r2.A00.A01.size()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.A00++;
        C229172mx r0 = this.A01;
        List list = r0.A01;
        int size = list.size();
        List list2 = r0.A00.A01;
        int size2 = list2.size();
        int i = size + size2;
        int i2 = this.A00;
        if (i <= i2) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("index ");
            A1A.append(i2);
            A1A.append(AnonymousClass000.A00(3406));
            A1A.append(size);
            A1A.append(size2);
            throw new ArrayIndexOutOfBoundsException(A1A.toString());
        } else if (i2 < size) {
            return list.get(i2);
        } else {
            return list2.get(i2 - size);
        }
    }

    public final void remove() {
        throw AnonymousClass7TE.A0z("not implemented");
    }
}
