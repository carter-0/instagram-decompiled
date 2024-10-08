package X;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.QuC  reason: case insensitive filesystem */
public final class C8421QuC extends C13250TRq implements C13975TnR, RandomAccess {
    @Deprecated
    public static final C13975TnR A01;
    public static final C8421QuC A02;
    public final List A00;

    static {
        C8421QuC quC = new C8421QuC(false);
        A02 = quC;
        A01 = quC;
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof TAN)) {
            return new String((byte[]) obj, C10132Rn9.A03);
        }
        TAN tan = (TAN) obj;
        Charset charset = C10132Rn9.A03;
        if (tan.A01() == 0) {
            return "";
        }
        C8426QuH quH = (C8426QuH) tan;
        return Pxe.A11(charset, quH.A00, 0, quH.A01());
    }

    /* renamed from: A02 */
    public final String get(int i) {
        String str;
        boolean A002;
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof TAN) {
            TAN tan = (TAN) obj;
            Charset charset = C10132Rn9.A03;
            if (tan.A01() == 0) {
                str = "";
            } else {
                C8426QuH quH = (C8426QuH) tan;
                str = Pxe.A11(charset, quH.A00, 0, quH.A01());
            }
            C8426QuH quH2 = (C8426QuH) tan;
            int A012 = quH2.A01();
            A002 = C9991Rkl.A00.A00(quH2.A00, 0, A012);
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C10132Rn9.A03);
            A002 = C9991Rkl.A00.A00(bArr, 0, bArr.length);
        }
        if (!A002) {
            return str;
        }
        list.set(i, str);
        return str;
    }

    public final C13975TnR FPa() {
        if (this.A00) {
            return new C13251TRr(this);
        }
        return this;
    }

    public final List FPq() {
        return Collections.unmodifiableList(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8421QuC(int i) {
        super(true);
        ArrayList A0v = DbS.A0v(i);
        this.A00 = A0v;
    }

    public final /* bridge */ /* synthetic */ C13981TnX FPV(int i) {
        if (i >= size()) {
            ArrayList A0v = DbS.A0v(i);
            A0v.addAll(this.A00);
            return new C8421QuC(A0v);
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
        if (collection instanceof C13975TnR) {
            collection = ((C13975TnR) collection).FPq();
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

    public C8421QuC(boolean z) {
        super(false);
        this.A00 = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public C8421QuC(ArrayList arrayList) {
        super(true);
        this.A00 = arrayList;
    }

    public C8421QuC() {
        this(10);
    }
}
