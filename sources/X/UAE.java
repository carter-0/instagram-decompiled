package X;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public final class UAE extends 2Rw {
    public final WEU A00 = new WEU(this);

    public final int findRelativeAdapterPositionIn(2Rw r4, C249703kE r5, int i) {
        WEU weu = this.A00;
        C17549Va2 va2 = (C17549Va2) weu.A06.get(r5);
        if (va2 == null) {
            return -1;
        }
        int A002 = i - WEU.A00(weu, va2);
        2Rw r0 = va2.A03;
        int itemCount = r0.getItemCount();
        if (A002 >= 0 && A002 < itemCount) {
            return r0.findRelativeAdapterPositionIn(r4, r5, A002);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Detected inconsistent adapter updates. The local position of the view holder maps to ");
        sb.append(A002);
        sb.append(" which is out of bounds for the adapter with size ");
        sb.append(itemCount);
        sb.append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sb.append(r5);
        throw C66582MXn.A0k(r4, "adapter:", sb);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        WEU weu = this.A00;
        List list = weu.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (JTR.A10(it) == recyclerView) {
                return;
            }
        }
        list.add(new WeakReference(recyclerView));
        for (C17549Va2 va2 : weu.A02) {
            va2.A03.onAttachedToRecyclerView(recyclerView);
        }
    }

    public final void onBindViewHolder(C249703kE r5, int i) {
        WEU weu = this.A00;
        VUK A01 = WEU.A01(weu, i);
        weu.A06.put(r5, A01.A01);
        C17549Va2 va2 = A01.A01;
        va2.A03.bindViewHolder(r5, A01.A00);
        A01.A02 = false;
        A01.A01 = null;
        A01.A00 = -1;
        weu.A00 = A01;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C17549Va2 va2 = (C17549Va2) ((WEZ) this.A00.A05).A01.get(i);
        if (va2 != null) {
            WEY wey = (WEY) va2.A05;
            SparseIntArray sparseIntArray = wey.A00;
            int indexOfKey = sparseIntArray.indexOfKey(i);
            if (indexOfKey >= 0) {
                return va2.A03.onCreateViewHolder(viewGroup, sparseIntArray.valueAt(indexOfKey));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("requested global type ");
            sb.append(i);
            sb.append(" does not belong to the adapter:");
            throw new IllegalStateException(AnonymousClass7TF.A0i(wey.A02.A03, sb));
        }
        throw DbW.A0a("Cannot find the wrapper for global view type ", i);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        WEU weu = this.A00;
        List list = weu.A01;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Reference reference = (Reference) list.get(size);
            if (reference.get() == null) {
                list.remove(size);
            } else if (reference.get() == recyclerView) {
                list.remove(size);
                break;
            }
        }
        for (C17549Va2 va2 : weu.A02) {
            va2.A03.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final boolean onFailedToRecycleView(C249703kE r4) {
        WEU weu = this.A00;
        IdentityHashMap identityHashMap = weu.A06;
        C17549Va2 va2 = (C17549Va2) identityHashMap.get(r4);
        if (va2 != null) {
            boolean onFailedToRecycleView = va2.A03.onFailedToRecycleView(r4);
            identityHashMap.remove(r4);
            return onFailedToRecycleView;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(r4);
        throw C66582MXn.A0k(weu, ", seems like it is not bound by this adapter: ", sb);
    }

    public final void onViewAttachedToWindow(C249703kE r4) {
        WEU weu = this.A00;
        C17549Va2 va2 = (C17549Va2) weu.A06.get(r4);
        if (va2 != null) {
            va2.A03.onViewAttachedToWindow(r4);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(r4);
        throw C66582MXn.A0k(weu, ", seems like it is not bound by this adapter: ", sb);
    }

    public final void onViewDetachedFromWindow(C249703kE r4) {
        WEU weu = this.A00;
        C17549Va2 va2 = (C17549Va2) weu.A06.get(r4);
        if (va2 != null) {
            va2.A03.onViewDetachedFromWindow(r4);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(r4);
        throw C66582MXn.A0k(weu, ", seems like it is not bound by this adapter: ", sb);
    }

    public final void onViewRecycled(C249703kE r4) {
        WEU weu = this.A00;
        IdentityHashMap identityHashMap = weu.A06;
        C17549Va2 va2 = (C17549Va2) identityHashMap.get(r4);
        if (va2 != null) {
            va2.A03.onViewRecycled(r4);
            identityHashMap.remove(r4);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(r4);
        throw C66582MXn.A0k(weu, ", seems like it is not bound by this adapter: ", sb);
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    public final void setStateRestorationPolicy(C231372rZ r3) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r3 = new X.C17549Va2(r4, r2, ((X.WEX) r4.A04).A00, r4.A05);
        r6.add(r5, r3);
        r1 = r4.A01.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r1.hasNext() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r0 = (androidx.recyclerview.widget.RecyclerView) X.JTR.A10(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r2.onAttachedToRecyclerView(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r3.A00 <= 0) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r4.A03.notifyItemRangeInserted(X.WEU.A00(r4, r3), r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        X.WEU.A02(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UAE(X.2Rw... r9) {
        /*
            r8 = this;
            java.util.List r1 = java.util.Arrays.asList(r9)
            r8.<init>()
            X.WEU r0 = new X.WEU
            r0.<init>(r8)
            r8.A00 = r0
            java.util.Iterator r7 = r1.iterator()
        L_0x0012:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r2 = r7.next()
            X.2Rw r2 = (X.2Rw) r2
            X.WEU r4 = r8.A00
            java.util.List r0 = r4.A02
            int r5 = r0.size()
            if (r5 < 0) goto L_0x0097
            java.util.List r6 = r4.A02
            int r0 = r6.size()
            if (r5 > r0) goto L_0x0097
            boolean r0 = r2.hasStableIds()
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = "ConcatAdapter"
            java.lang.String r0 = "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids"
            android.util.Log.w(r1, r0)
        L_0x003d:
            int r3 = r6.size()
            r1 = 0
        L_0x0042:
            if (r1 >= r3) goto L_0x005b
            java.lang.Object r0 = r6.get(r1)
            X.Va2 r0 = (X.C17549Va2) r0
            X.2Rw r0 = r0.A03
            if (r0 != r2) goto L_0x0058
            r0 = -1
            if (r1 == r0) goto L_0x005b
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x005b
            goto L_0x0012
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x005b:
            X.X0D r1 = r4.A05
            X.X0C r0 = r4.A04
            X.WEX r0 = (X.WEX) r0
            X.X0B r0 = r0.A00
            X.Va2 r3 = new X.Va2
            r3.<init>(r4, r2, r0, r1)
            r6.add(r5, r3)
            java.util.List r0 = r4.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0071:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = X.JTR.A10(r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            if (r0 == 0) goto L_0x0071
            r2.onAttachedToRecyclerView(r0)
            goto L_0x0071
        L_0x0083:
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x0092
            X.UAE r2 = r4.A03
            int r1 = X.WEU.A00(r4, r3)
            int r0 = r3.A00
            r2.notifyItemRangeInserted(r1, r0)
        L_0x0092:
            X.WEU.A02(r4)
            goto L_0x0012
        L_0x0097:
            java.lang.String r2 = "Index must be between 0 and "
            java.util.List r0 = r4.A02
            int r1 = r0.size()
            java.lang.String r0 = ". Given:"
            java.lang.IndexOutOfBoundsException r0 = X.C51969G9p.A0p(r2, r0, r1, r5)
            throw r0
        L_0x00a6:
            r0 = 0
            X.UAE.super.setHasStableIds(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAE.<init>(X.2Rw[]):void");
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1542977745);
        int i = 0;
        for (C17549Va2 va2 : this.A00.A02) {
            i += va2.A00;
        }
        AnonymousClass0fD.A0A(-146234918, A03);
        return i;
    }

    public final long getItemId(int i) {
        int A03 = AnonymousClass0fD.A03(-2111248951);
        WEU weu = this.A00;
        VUK A01 = WEU.A01(weu, i);
        C17549Va2 va2 = A01.A01;
        va2.A03.getItemId(A01.A00);
        A01.A02 = false;
        A01.A01 = null;
        A01.A00 = -1;
        weu.A00 = A01;
        AnonymousClass0fD.A0A(-985884101, A03);
        return -1;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A03 = AnonymousClass0fD.A03(-624507158);
        WEU weu = this.A00;
        VUK A01 = WEU.A01(weu, i);
        C17549Va2 va2 = A01.A01;
        int i3 = A01.A00;
        C59532JNe jNe = va2.A05;
        int itemViewType = va2.A03.getItemViewType(i3);
        WEY wey = (WEY) jNe;
        SparseIntArray sparseIntArray = wey.A01;
        int indexOfKey = sparseIntArray.indexOfKey(itemViewType);
        if (indexOfKey > -1) {
            i2 = sparseIntArray.valueAt(indexOfKey);
        } else {
            WEZ wez = wey.A03;
            C17549Va2 va22 = wey.A02;
            i2 = wez.A00;
            wez.A00 = i2 + 1;
            wez.A01.put(i2, va22);
            sparseIntArray.put(itemViewType, i2);
            wey.A00.put(i2, itemViewType);
        }
        A01.A02 = false;
        A01.A01 = null;
        A01.A00 = -1;
        weu.A00 = A01;
        AnonymousClass0fD.A0A(-1111780517, A03);
        return i2;
    }

    public final void A00(C231372rZ r1) {
        UAE.super.setStateRestorationPolicy(r1);
    }
}
