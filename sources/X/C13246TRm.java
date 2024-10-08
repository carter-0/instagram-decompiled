package X;

import java.lang.reflect.Array;
import java.util.AbstractList;

/* renamed from: X.TRm  reason: case insensitive filesystem */
public final class C13246TRm extends AbstractList {
    public final /* synthetic */ Object A00;

    public C13246TRm(Object obj) {
        this.A00 = obj;
    }

    public final Object get(int i) {
        return Array.get(this.A00, i);
    }

    public final int size() {
        return Array.getLength(this.A00);
    }
}
