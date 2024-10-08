package X;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8AY  reason: invalid class name */
public final class AnonymousClass8AY extends 2Rw implements AnonymousClass8AZ {
    public int[] A00 = new int[0];
    public int A01;
    public final List A02 = new ArrayList();
    public final Map A03 = new HashMap();
    public final List A04 = new ArrayList();

    public static void A00(AnonymousClass8AY r8) {
        List list = r8.A02;
        int size = list.size();
        int[] iArr = r8.A00;
        if (size != iArr.length) {
            iArr = new int[size];
            r8.A00 = iArr;
        }
        if (size == 0) {
            r8.A01 = 0;
            return;
        }
        iArr[0] = ((2Rw) list.get(0)).getItemCount();
        for (int i = 1; i < size; i++) {
            int[] iArr2 = r8.A00;
            iArr2[i] = iArr2[i - 1] + ((2Rw) list.get(i)).getItemCount();
        }
        r8.A01 = r8.A00[size - 1];
    }

    public final int A01(2Rw r4) {
        2Rw r0;
        Iterator it = this.A02.iterator();
        int i = 0;
        while (it.hasNext() && r4 != (r0 = (2Rw) it.next())) {
            i += r0.getItemCount();
        }
        return i;
    }

    public final void A02(2Rw r4) {
        List list = this.A02;
        int indexOf = list.indexOf(r4);
        if (indexOf != -1 && r4 != null) {
            C231402rc r0 = (C231402rc) this.A04.remove(indexOf);
            if (r0 != null) {
                r4.unregisterAdapterDataObserver(r0);
            }
            list.remove(r4);
            this.A03.clear();
            A00(this);
            notifyDataSetChanged();
        }
    }

    public final void A03(2Rw r4, int i) {
        List list = this.A02;
        if (!list.contains(r4) && i >= 0 && i <= list.size()) {
            C3728592v r1 = new C3728592v(r4, this);
            r4.registerAdapterDataObserver(r1);
            if (i == list.size()) {
                list.add(r4);
                this.A04.add(r1);
            } else {
                list.add(i, r4);
                this.A04.add(i, r1);
            }
            this.A03.clear();
            A00(this);
            notifyDataSetChanged();
        }
    }

    public final int AZP() {
        return this.A02.size();
    }

    public final int[] Ath() {
        return this.A00;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        for (2Rw onAttachedToRecyclerView : this.A02) {
            onAttachedToRecyclerView.onAttachedToRecyclerView(recyclerView);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Pair pair = (Pair) this.A03.get(Integer.valueOf(i));
        if (pair != null) {
            int intValue = ((Number) pair.first).intValue();
            return ((2Rw) this.A02.get(intValue)).onCreateViewHolder(viewGroup, ((Number) pair.second).intValue());
        }
        throw new IllegalStateException(002.A0O("cannot find subadapter for view type: ", i));
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        for (2Rw onDetachedFromRecyclerView : this.A02) {
            onDetachedFromRecyclerView.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final void setHasStableIds(boolean z) {
        for (2Rw hasStableIds : this.A02) {
            hasStableIds.setHasStableIds(z);
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1260411039);
        int i = this.A01;
        AnonymousClass0fD.A0A(-443039973, A032);
        return i;
    }

    public final long getItemId(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(-834681050);
        int A002 = C378349Pl.A00(this, i);
        2Rw r2 = (2Rw) this.A02.get(A002);
        if (A002 == 0) {
            i2 = 0;
        } else {
            i2 = this.A00[A002 - 1];
        }
        long itemId = r2.getItemId(i - i2);
        AnonymousClass0fD.A0A(-1714403457, A032);
        return itemId;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(836788717);
        int i2 = 0;
        int i3 = i;
        while (true) {
            List list = this.A02;
            if (i2 < list.size()) {
                2Rw r2 = (2Rw) list.get(i2);
                if (i3 < r2.getItemCount()) {
                    int itemViewType = r2.getItemViewType(i3);
                    int hashCode = r2.getClass().hashCode() + itemViewType;
                    Map map = this.A03;
                    Integer valueOf = Integer.valueOf(hashCode);
                    if (!map.containsKey(valueOf)) {
                        map.put(valueOf, new Pair(Integer.valueOf(i2), Integer.valueOf(itemViewType)));
                    }
                    AnonymousClass0fD.A0A(1075427456, A032);
                    return hashCode;
                }
                i3 -= r2.getItemCount();
                i2++;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(002.A0O("Sub-adapter position is out of range: ", i));
                AnonymousClass0fD.A0A(-910342266, A032);
                throw illegalArgumentException;
            }
        }
    }

    public final void onBindViewHolder(C249703kE r5, int i) {
        int i2;
        int A002 = C378349Pl.A00(this, i);
        2Rw r2 = (2Rw) this.A02.get(A002);
        if (A002 == 0) {
            i2 = 0;
        } else {
            i2 = this.A00[A002 - 1];
        }
        r2.onBindViewHolder(r5, i - i2);
    }
}
