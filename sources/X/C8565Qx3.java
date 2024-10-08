package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Qx3  reason: case insensitive filesystem */
public final class C8565Qx3 extends C13252TRs implements C13978TnU, RandomAccess {
    @Deprecated
    public static final C13978TnU A01;
    public static final C8565Qx3 A02;
    public final List A00;

    static {
        C8565Qx3 qx3 = new C8565Qx3(false);
        A02 = qx3;
        A01 = qx3;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof TAQ) {
            return ((TAQ) obj).A08(SS6.A03);
        }
        return SS6.A02((byte[]) obj);
    }

    /* renamed from: A04 */
    public final String get(int i) {
        String A022;
        boolean A03;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof TAQ) {
            TAQ taq = (TAQ) obj;
            A022 = taq.A08(SS6.A03);
            A03 = taq.A0B();
        } else {
            byte[] bArr = (byte[]) obj;
            A022 = SS6.A02(bArr);
            A03 = C11412SSk.A03(bArr);
        }
        if (!A03) {
            return A022;
        }
        list.set(i, A022);
        return A022;
    }

    public final Object FPj(int i) {
        return this.A00.get(i);
    }

    public final List FPv() {
        return Collections.unmodifiableList(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8565Qx3(int i) {
        super(true);
        ArrayList A0v = DbS.A0v(i);
        this.A00 = A0v;
    }

    public final /* bridge */ /* synthetic */ C13984Tna FPW(int i) {
        if (i >= size()) {
            ArrayList A0v = DbS.A0v(i);
            A0v.addAll(this.A00);
            return new C8565Qx3(A0v);
        }
        throw Pxe.A0g();
    }

    public final C13978TnU FPc() {
        if (FPP()) {
            return new C13253TRt(this);
        }
        return this;
    }

    public final void FQ2(TAQ taq) {
        A03();
        this.A00.add(taq);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A03();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A03();
        if (collection instanceof C13978TnU) {
            collection = ((C13978TnU) collection).FPv();
        }
        boolean addAll = this.A00.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        A03();
        this.A00.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A03();
        Object remove = this.A00.remove(i);
        this.modCount++;
        return A00(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A03();
        return A00(this.A00.set(i, obj));
    }

    public C8565Qx3(boolean z) {
        super(false);
        this.A00 = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public C8565Qx3(ArrayList arrayList) {
        super(true);
        this.A00 = arrayList;
    }

    public C8565Qx3() {
        this(10);
    }
}
