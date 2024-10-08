package X;

import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.6wF  reason: invalid class name and case insensitive filesystem */
public final class C322686wF extends 0ho {
    public List A00 = 0sn.A00;
    public boolean A01;
    public final SparseArray A02 = new SparseArray();
    public final SparseArray A03 = new SparseArray();
    public final SparseIntArray A04 = new SparseIntArray();
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C322686wF(0hq r2, boolean z) {
        super(r2, 0);
        0qQ.A0B(r2, 1);
        this.A05 = z;
    }

    public final void A03(ViewGroup viewGroup, List list) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(list, 1);
        this.A00 = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass723 A022 = A02(i);
            if (A022 != null && !0qQ.A0K(A022.BhI(), ((C322826wT) this.A00.get(i)).C3j())) {
                destroyItem(viewGroup, i, A022);
            }
        }
        finishUpdate(viewGroup);
        if (!this.A05) {
            this.A02.clear();
            this.A03.clear();
        }
        notifyDataSetChanged();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(obj, 2);
        this.A04.delete(obj.hashCode());
        this.A02.remove(i);
        this.A03.remove(i);
        C322686wF.super.destroyItem(viewGroup, i, obj);
    }

    public final int getItemPosition(Object obj) {
        0qQ.A0B(obj, 0);
        String BhI = ((AnonymousClass723) obj).BhI();
        int i = this.A04.get(obj.hashCode());
        if (i >= this.A00.size() || !0qQ.A0K(((C322826wT) this.A00.get(i)).C3j(), BhI)) {
            return -2;
        }
        return -1;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Object instantiateItem = C322686wF.super.instantiateItem(viewGroup, i);
        0qQ.A0C(instantiateItem, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        if (instantiateItem instanceof AnonymousClass723) {
            this.A03.put(i, new WeakReference(instantiateItem));
            this.A04.put(instantiateItem.hashCode(), i);
            return instantiateItem;
        }
        throw new IllegalArgumentException("Fragment in ViewPager does not implement ProfileTabFragment");
    }

    @Deprecated(message = "")
    public final Fragment A00(int i) {
        return ((C322826wT) this.A00.get(i)).AMg(this.A01).ACU();
    }

    public final int A01(String str) {
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            if (0qQ.A0K(((C322826wT) this.A00.get(i)).C3j(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final AnonymousClass723 A02(int i) {
        Reference reference = (Reference) this.A03.get(i);
        if (reference != null) {
            return (AnonymousClass723) reference.get();
        }
        return null;
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        try {
            C322686wF.super.restoreState(parcelable, classLoader);
        } catch (Exception e) {
            0KC.A0F("ProfileTabPagerAdapter", "Error restoring state of fragment", e);
        }
    }
}
