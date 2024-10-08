package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.9gc  reason: invalid class name and case insensitive filesystem */
public final class C384009gc extends AnonymousClass977<String> implements C41844B3l, RandomAccess {
    @Deprecated
    public static final C41844B3l A01;
    public static final C384009gc A02;
    public final List A00;

    static {
        C384009gc r0 = new C384009gc(false);
        A02 = r0;
        A01 = r0;
    }

    public C384009gc(boolean z) {
        super(false);
        this.A00 = Collections.emptyList();
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AnonymousClass97R)) {
            return new String((byte[]) obj, AnonymousClass97S.A04);
        }
        AnonymousClass97R r4 = (AnonymousClass97R) obj;
        Charset charset = AnonymousClass97S.A04;
        if (r4.A02() == 0) {
            return "";
        }
        AnonymousClass97V r42 = (AnonymousClass97V) r4;
        return new String(r42.A00, r42.A05(), r42.A02(), charset);
    }

    public final Object Bjc(int i) {
        return this.A00.get(i);
    }

    public final List CBK() {
        return Collections.unmodifiableList(this.A00);
    }

    public final C41844B3l CBh() {
        if (this.A00) {
            return new C13254TRu(this);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        int A012;
        List list = this.A00;
        Object obj = list.get(i);
        if (!(obj instanceof String)) {
            if (obj instanceof AnonymousClass97R) {
                AnonymousClass97R r6 = (AnonymousClass97R) obj;
                Charset charset = AnonymousClass97S.A04;
                if (r6.A02() == 0) {
                    obj = "";
                } else {
                    AnonymousClass97V r0 = (AnonymousClass97V) r6;
                    obj = new String(r0.A00, r0.A05(), r0.A02(), charset);
                }
                AnonymousClass97V r62 = (AnonymousClass97V) r6;
                int A05 = r62.A05();
                A012 = AnonymousClass9CG.A00.A01(r62.A00, A05, r62.A02() + A05);
            } else {
                byte[] bArr = (byte[]) obj;
                obj = new String(bArr, AnonymousClass97S.A04);
                A012 = AnonymousClass9CG.A00.A01(bArr, 0, bArr.length);
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

    public final void A7Z(AnonymousClass97R r2) {
        A01();
        this.A00.add(r2);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass978 Coo(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.A00);
            return new C384009gc(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        A01();
        if (collection instanceof C41844B3l) {
            collection = ((C41844B3l) collection).CBK();
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

    public C384009gc(ArrayList arrayList) {
        super(true);
        this.A00 = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public C384009gc() {
        this(new ArrayList(10));
    }
}
