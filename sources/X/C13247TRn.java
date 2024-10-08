package X;

import java.util.AbstractList;

/* renamed from: X.TRn  reason: case insensitive filesystem */
public final class C13247TRn extends AbstractList<Object> {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object[] A02;

    public C13247TRn(Object obj, Object obj2, Object[] objArr) {
        this.A02 = objArr;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object get(int i) {
        if (i == 0) {
            return this.A00;
        }
        if (i != 1) {
            return this.A02[i - 2];
        }
        return this.A01;
    }

    public final int size() {
        return 2;
    }
}
