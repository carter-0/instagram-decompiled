package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class K9J extends 2Ru implements C231272rL {
    public boolean A00;
    public boolean A01;
    public final E9R A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final List A04 = AnonymousClass7TE.A1C();
    public final K9Z A05;
    public final E9R A06;
    public final E9R A07;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.E9R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.E9R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.E9R, java.lang.Object] */
    public K9J(K5H k5h, G6X g6x, G6X g6x2, G6X g6x3, boolean z) {
        super(false);
        E9R e9r;
        E9R e9r2;
        E9R e9r3;
        K9Z k9z = new K9Z(k5h, z);
        this.A05 = k9z;
        ArrayList A14 = DbV.A14(k9z);
        if (g6x != null) {
            ? obj = new Object();
            obj.A00 = g6x;
            A14.add(obj);
            e9r = obj;
        } else {
            e9r = null;
        }
        this.A07 = e9r;
        if (g6x2 != null) {
            ? obj2 = new Object();
            obj2.A00 = g6x2;
            A14.add(obj2);
            e9r2 = obj2;
        } else {
            e9r2 = null;
        }
        this.A02 = e9r2;
        if (g6x3 != null) {
            ? obj3 = new Object();
            obj3.A00 = g6x3;
            A14.add(obj3);
            e9r3 = obj3;
        } else {
            e9r3 = null;
        }
        this.A06 = e9r3;
        init(A14);
        A00(this);
    }

    public final void A02(boolean z) {
        if (z != this.A00 && this.A06 != null) {
            this.A00 = z;
            if (z) {
                this.A01 = false;
            }
            A00(this);
        }
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public static final void A00(K9J k9j) {
        k9j.clear();
        E9R e9r = k9j.A07;
        if (e9r != null) {
            k9j.addModel((Object) null, e9r);
        }
        E9R e9r2 = k9j.A02;
        if (e9r2 != null && k9j.A01) {
            k9j.addModel((Object) null, e9r2);
        }
        E9R e9r3 = k9j.A06;
        if (e9r3 != null && k9j.A00) {
            k9j.addModel((Object) null, e9r3);
        }
        for (Object addModel : k9j.A03) {
            k9j.addModel(addModel, k9j.A05);
        }
        for (Object addModel2 : k9j.A04) {
            k9j.addModel(addModel2, k9j.A05);
        }
        k9j.updateListView();
    }

    public final void A01(List list) {
        Iterator A0x = JTP.A0x(list);
        while (A0x.hasNext()) {
            JTR.A1T(A0x.next(), this.A03);
        }
        A00(this);
    }
}
