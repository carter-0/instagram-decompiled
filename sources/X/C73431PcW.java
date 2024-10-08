package X;

import java.util.Iterator;

/* renamed from: X.PcW  reason: case insensitive filesystem */
public final class C73431PcW implements Iterator, C62650uo {
    public int A00;
    public final int A01 = 1;
    public final Object A02;
    public final Object A03;

    public C73431PcW(Object[] objArr, String[] strArr) {
        this.A02 = strArr;
        this.A03 = objArr;
    }

    public final boolean hasNext() {
        if (this.A01 != 0) {
            return ((Iterator) this.A02).hasNext();
        }
        return AnonymousClass7TF.A1T(this.A00, ((String[]) this.A02).length);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A01 != 0) {
            0sL r2 = ((C73519Pe2) this.A03).A00;
            int i = this.A00;
            this.A00 = i + 1;
            if (i >= 0) {
                return r2.invoke(Integer.valueOf(i), ((Iterator) this.A02).next());
            }
            0sr.A1T();
            throw AnonymousClass00P.createAndThrow();
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        return new C73434PcZ((Object[]) this.A03, (String[]) this.A02, i2);
    }

    public final void remove() {
        int i = this.A01;
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(462));
    }

    public C73431PcW(C73519Pe2 pe2) {
        this.A03 = pe2;
        this.A02 = pe2.A01.iterator();
    }
}
