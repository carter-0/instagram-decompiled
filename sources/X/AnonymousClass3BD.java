package X;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3BD  reason: invalid class name */
public final class AnonymousClass3BD {
    public int A00 = 0;
    public SparseArray A01 = new SparseArray();
    public Set A02 = Collections.newSetFromMap(new IdentityHashMap());

    public final void A01() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i < sparseArray.size()) {
                ArrayList arrayList = ((AnonymousClass3MW) sparseArray.valueAt(i)).A03;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C275604qc.A01(((C249703kE) it.next()).itemView);
                }
                arrayList.clear();
                i++;
            } else {
                return;
            }
        }
    }

    public static AnonymousClass3MW A00(AnonymousClass3BD r1, int i) {
        SparseArray sparseArray = r1.A01;
        AnonymousClass3MW r0 = (AnonymousClass3MW) sparseArray.get(i);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW r02 = new AnonymousClass3MW();
        sparseArray.put(i, r02);
        return r02;
    }

    public final void A03(C249703kE r4) {
        int i = r4.mItemViewType;
        ArrayList arrayList = A00(this, i).A03;
        if (((AnonymousClass3MW) this.A01.get(i)).A00 <= arrayList.size()) {
            C275604qc.A01(r4.itemView);
        } else if (!RecyclerView.A1C || !arrayList.contains(r4)) {
            r4.resetInternal();
            arrayList.add(r4);
        } else {
            throw new IllegalArgumentException("this scrap item already exists");
        }
    }

    public final void A02(int i, int i2) {
        AnonymousClass3MW A002 = A00(this, i);
        A002.A00 = i2;
        ArrayList arrayList = A002.A03;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
