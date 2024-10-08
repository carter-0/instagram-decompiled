package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jjs  reason: case insensitive filesystem */
public final class C60347Jjs extends C62693Kkt implements Iterable, C62650uo {
    public static final C60347Jjs A05 = new C60347Jjs((Object) null, (Object) null, 0sn.A00, 0, 0);
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60347Jjs) {
                C60347Jjs jjs = (C60347Jjs) obj;
                if (!0qQ.A0K(this.A04, jjs.A04) || !0qQ.A0K(this.A03, jjs.A03) || !0qQ.A0K(this.A02, jjs.A02) || this.A01 != jjs.A01 || this.A00 != jjs.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0K(this.A04) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A01) * 31) + this.A00;
    }

    public final Iterator iterator() {
        return this.A04.listIterator();
    }

    public C60347Jjs(Object obj, Object obj2, List list, int i, int i2) {
        this.A04 = list;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A00 = i2;
        if (i != Integer.MIN_VALUE && i < 0) {
            throw AnonymousClass7TE.A0w("itemsBefore cannot be negative");
        } else if (i2 != Integer.MIN_VALUE && i2 < 0) {
            throw AnonymousClass7TE.A0w("itemsAfter cannot be negative");
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoadResult.Page(\n                    |   data size: ");
        List list = this.A04;
        A1A.append(list.size());
        A1A.append("\n                    |   first Item: ");
        A1A.append(00k.A0J(list));
        A1A.append("\n                    |   last Item: ");
        A1A.append(00k.A0L(list));
        A1A.append("\n                    |   nextKey: ");
        A1A.append(this.A02);
        A1A.append("\n                    |   prevKey: ");
        A1A.append(this.A03);
        A1A.append("\n                    |   itemsBefore: ");
        A1A.append(this.A01);
        A1A.append("\n                    |   itemsAfter: ");
        A1A.append(this.A00);
        return 0rw.A0u(AnonymousClass7TF.A0l("\n                    |) ", A1A), "|");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C60347Jjs(Object obj, List list) {
        this((Object) null, obj, list, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK);
        0qQ.A0B(list, 1);
    }
}
