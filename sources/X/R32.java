package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class R32 extends C13255TRv<String> implements C13979TnV, RandomAccess {
    public static final C13979TnV A01;
    public static final R32 A02;
    public final List A00;

    static {
        R32 r32 = new R32();
        A02 = r32;
        r32.A00 = false;
        A01 = r32;
    }

    public final Object Bjc(int i) {
        return this.A00.get(i);
    }

    public final List CBK() {
        return Collections.unmodifiableList(this.A00);
    }

    public final C13979TnV CBi() {
        if (this.A00) {
            return new C13256TRw(this);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        int A03;
        List list = this.A00;
        Object obj = list.get(i);
        if (!(obj instanceof String)) {
            if (obj instanceof TAP) {
                TAP tap = (TAP) obj;
                obj = tap.A04();
                R36 r36 = (R36) tap;
                int A06 = r36.A06();
                A03 = SC5.A00.A03(r36.A00, A06, r36.A02() + A06);
            } else {
                byte[] bArr = (byte[]) obj;
                obj = new String(bArr, SD9.A04);
                A03 = SC5.A00.A03(bArr, 0, bArr.length);
            }
            if (A03 == 0) {
                list.set(i, obj);
            }
        }
        return obj;
    }

    public final int size() {
        return this.A00.size();
    }

    public R32(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final void A7a(TAP tap) {
        A01();
        this.A00.add(tap);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ C13982TnY Cop(int i) {
        if (i >= size()) {
            ArrayList A0v = DbS.A0v(i);
            A0v.addAll(this.A00);
            return new R32(A0v);
        }
        throw Pxe.A0g();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof C13979TnV) {
            collection = ((C13979TnV) collection).CBK();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        A01();
        this.A00.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        Object remove = this.A00.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return remove;
        }
        if (remove instanceof TAP) {
            return ((TAP) remove).A04();
        }
        return new String((byte[]) remove, SD9.A04);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        Object obj2 = this.A00.set(i, obj);
        if (obj2 instanceof String) {
            return obj2;
        }
        if (obj2 instanceof TAP) {
            return ((TAP) obj2).A04();
        }
        return new String((byte[]) obj2, SD9.A04);
    }

    public R32() {
        this(DbS.A0v(10));
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
