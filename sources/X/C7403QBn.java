package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.QBn  reason: case insensitive filesystem */
public final class C7403QBn extends C13248TRo<String> implements C13977TnT, RandomAccess {
    public static final C13977TnT A01;
    public static final C7403QBn A02;
    public final List A00;

    static {
        C7403QBn qBn = new C7403QBn();
        A02 = qBn;
        qBn.A00 = false;
        A01 = qBn;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AnonymousClass5L9)) {
            return new String((byte[]) obj, C284045Ks.A03);
        }
        AnonymousClass5L9 r4 = (AnonymousClass5L9) obj;
        Charset charset = C284045Ks.A03;
        if (r4.A03() == 0) {
            return "";
        }
        AnonymousClass5LA r42 = (AnonymousClass5LA) r4;
        return Pxe.A11(charset, r42.A00, r42.A04(), r42.A03());
    }

    public final Object Bjc(int i) {
        return this.A00.get(i);
    }

    public final List CBK() {
        return Collections.unmodifiableList(this.A00);
    }

    public final C13977TnT CBg() {
        if (this.A00) {
            return new C13249TRp(this);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        int A012;
        List list = this.A00;
        Object obj = list.get(i);
        if (!(obj instanceof String)) {
            if (obj instanceof AnonymousClass5L9) {
                AnonymousClass5L9 r6 = (AnonymousClass5L9) obj;
                Charset charset = C284045Ks.A03;
                if (r6.A03() == 0) {
                    obj = "";
                } else {
                    AnonymousClass5LA r0 = (AnonymousClass5LA) r6;
                    obj = Pxe.A11(charset, r0.A00, r0.A04(), r0.A03());
                }
                AnonymousClass5LA r62 = (AnonymousClass5LA) r6;
                int A04 = r62.A04();
                A012 = C284185Lh.A00.A01(r62.A00, 0, A04, r62.A03() + A04);
            } else {
                byte[] bArr = (byte[]) obj;
                obj = new String(bArr, C284045Ks.A03);
                A012 = C284185Lh.A00.A01(bArr, 0, 0, bArr.length);
            }
            if (A012 == 0) {
                list.set(i, obj);
            }
        }
        return obj;
    }

    public final int size() {
        return this.A00.size();
    }

    public C7403QBn(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public final void A7X(AnonymousClass5L9 r2) {
        A01();
        this.A00.add(r2);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ C13980TnW Con(int i) {
        if (i >= size()) {
            ArrayList A0v = DbS.A0v(i);
            A0v.addAll(this.A00);
            return new C7403QBn(A0v);
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
        if (collection instanceof C13977TnT) {
            collection = ((C13977TnT) collection).CBK();
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

    public C7403QBn() {
        this(DbS.A0v(10));
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
