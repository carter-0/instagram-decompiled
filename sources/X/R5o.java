package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class R5o extends C13257TRx<String> implements C13976TnS, RandomAccess {
    public static final C13976TnS A01;
    public static final R5o A02;
    public final List A00;

    static {
        R5o r5o = new R5o();
        A02 = r5o;
        r5o.A00 = false;
        A01 = r5o;
    }

    public static String A00(Object obj) {
        int i;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof TAM)) {
            return new String((byte[]) obj, SDA.A04);
        }
        TAM tam = (TAM) obj;
        Charset charset = SDA.A04;
        if (tam.A00() == 0) {
            return "";
        }
        R5r r5r = (R5r) tam;
        byte[] bArr = r5r.A00;
        if (r5r instanceof R5q) {
            i = ((R5q) r5r).A01;
        } else {
            i = 0;
        }
        return Pxe.A11(charset, bArr, i, r5r.A00());
    }

    public final List CBK() {
        return Collections.unmodifiableList(this.A00);
    }

    public final C13976TnS CBj() {
        if (this.A00) {
            return new C13258TRy(this);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        int A002;
        int i2;
        int i3;
        List list = this.A00;
        Object obj = list.get(i);
        if (!(obj instanceof String)) {
            if (obj instanceof TAM) {
                TAM tam = (TAM) obj;
                Charset charset = SDA.A04;
                if (tam.A00() == 0) {
                    obj = "";
                } else {
                    R5r r5r = (R5r) tam;
                    byte[] bArr = r5r.A00;
                    if (r5r instanceof R5q) {
                        i2 = ((R5q) r5r).A01;
                    } else {
                        i2 = 0;
                    }
                    obj = Pxe.A11(charset, bArr, i2, r5r.A00());
                }
                R5r r5r2 = (R5r) tam;
                if (r5r2 instanceof R5q) {
                    i3 = ((R5q) r5r2).A01;
                } else {
                    i3 = 0;
                }
                A002 = C10021RlG.A00.A00(r5r2.A00, i3, r5r2.A00() + i3);
            } else {
                byte[] bArr2 = (byte[]) obj;
                obj = new String(bArr2, SDA.A04);
                A002 = C10021RlG.A00.A00(bArr2, 0, bArr2.length);
            }
            if (A002 == 0) {
                list.set(i, obj);
            }
        }
        return obj;
    }

    public final int size() {
        return this.A00.size();
    }

    public R5o(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final /* bridge */ /* synthetic */ C13983TnZ Coq(int i) {
        if (i >= size()) {
            ArrayList A0v = DbS.A0v(i);
            A0v.addAll(this.A00);
            return new R5o(A0v);
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
        if (collection instanceof C13976TnS) {
            collection = ((C13976TnS) collection).CBK();
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
        return A00(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        return A00(this.A00.set(i, obj));
    }

    public R5o() {
        this(DbS.A0v(10));
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
