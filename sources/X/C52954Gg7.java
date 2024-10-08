package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.Gg7  reason: case insensitive filesystem */
public final class C52954Gg7 extends 0ho {
    public final SparseArray A00 = new SparseArray();
    public final List A01 = AnonymousClass7TE.A1C();

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Object instantiateItem = C52954Gg7.super.instantiateItem(viewGroup, i);
        if (instantiateItem instanceof Fragment) {
            if (instantiateItem instanceof C59622JQq) {
                this.A00.put(i, instantiateItem);
            }
            return instantiateItem;
        }
        throw AnonymousClass7TE.A0z("Fragment must be a child of a Fragment");
    }

    public final Fragment A00(int i) {
        JQK jqk = (JQK) 00k.A0O(this.A01, i);
        if (jqk != null) {
            return jqk.AN6();
        }
        throw AnonymousClass7TE.A0z(C66579MXk.A00(611));
    }

    public final int getCount() {
        return this.A01.size();
    }

    public C52954Gg7(0hq r2, int i) {
        super(r2, i);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        DbY.A1S(viewGroup, obj);
        this.A00.remove(i);
        C52954Gg7.super.destroyItem(viewGroup, i, obj);
    }
}
