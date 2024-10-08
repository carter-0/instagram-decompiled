package X;

import com.google.common.collect.ImmutableList;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public abstract class PzX implements Iterable {
    public final C257443xP A00;

    public static PzX A00(Iterable iterable) {
        if (iterable instanceof PzX) {
            return (PzX) iterable;
        }
        return new PzY(iterable, iterable);
    }

    public static ImmutableList A01(PzX pzX, int i) {
        PzX A02 = pzX.A02(new SzZ(i));
        return ImmutableList.copyOf((Iterable) A02.A00.A05(A02));
    }

    public final PzX A02(AnonymousClass2hV r4) {
        Object A05 = this.A00.A05(this);
        A05.getClass();
        return A00(new C8675Qzh(1, r4, A05));
    }

    public final Object[] A03() {
        Collection A1C;
        Iterable iterable = (Iterable) this.A00.A05(this);
        Object[] objArr = (Object[]) Array.newInstance(String.class, 0);
        if (iterable instanceof Collection) {
            A1C = (Collection) iterable;
        } else {
            Iterator it = iterable.iterator();
            A1C = AnonymousClass7TE.A1C();
            C11307SKv.A02(A1C, it);
        }
        return A1C.toArray(objArr);
    }

    public String toString() {
        return SA7.A01((Iterable) this.A00.A05(this));
    }

    public PzX(Iterable iterable) {
        this.A00 = C257443xP.A01(iterable);
    }

    public PzX() {
        this.A00 = C2612848z.A00;
    }
}
