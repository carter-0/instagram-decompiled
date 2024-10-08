package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;

/* renamed from: X.Tq7  reason: case insensitive filesystem */
public final class C14113Tq7 implements C253183qL {
    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager, com.bloks.stdlib.components.bkcomponentscollection.BloksStaggeredGridLayoutManager] */
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView recyclerView = (RecyclerView) obj;
        C14536Txw txw = ((C14100Tpt) obj2).A0C;
        if (txw instanceof C14542Ty2) {
            C14542Ty2 ty2 = (C14542Ty2) txw;
            0qQ.A0B(context, 0);
            boolean z = ty2.A00;
            int i = ty2.A00;
            if (z) {
                linearLayoutManager2 = new StickyHeadersLinearLayoutManager(context, i);
            } else {
                linearLayoutManager2 = new LinearLayoutManager(context, i, false);
            }
            linearLayoutManager2.A1t(ty2.A01);
            linearLayoutManager = linearLayoutManager2;
        } else if (txw instanceof C15171UTw) {
            C15171UTw uTw = (C15171UTw) txw;
            0qQ.A0B(context, 0);
            linearLayoutManager = new GridLayoutManager(context, uTw.A00, uTw.A00, false);
        } else {
            C15170UTv uTv = (C15170UTv) txw;
            ? staggeredGridLayoutManager = new StaggeredGridLayoutManager(uTv.A00, uTv.A00);
            staggeredGridLayoutManager.A00 = true;
            linearLayoutManager = staggeredGridLayoutManager;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r2 != r1) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean Ete(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            X.Tpt r5 = (X.C14100Tpt) r5
            X.Tpt r6 = (X.C14100Tpt) r6
            X.Txw r2 = r5.A0C
            X.Txw r3 = r6.A0C
            boolean r0 = r2 instanceof X.C14542Ty2
            if (r0 == 0) goto L_0x002f
            X.Ty2 r2 = (X.C14542Ty2) r2
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C14542Ty2
            if (r0 == 0) goto L_0x002b
            int r1 = r2.A00
            X.Ty2 r3 = (X.C14542Ty2) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002b
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x002b
            boolean r2 = r2.A00
            boolean r1 = r3.A00
        L_0x0028:
            r0 = 1
            if (r2 == r1) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r0 = r0 ^ 1
            return r0
        L_0x002f:
            boolean r0 = r2 instanceof X.C15170UTv
            if (r0 == 0) goto L_0x004a
            X.UTv r2 = (X.C15170UTv) r2
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C15170UTv
            if (r0 == 0) goto L_0x002b
            int r1 = r2.A00
            X.UTv r3 = (X.C15170UTv) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002b
            int r2 = r2.A00
            int r1 = r3.A00
            goto L_0x0028
        L_0x004a:
            X.UTw r2 = (X.C15171UTw) r2
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C15171UTw
            if (r0 == 0) goto L_0x002b
            int r1 = r2.A00
            X.UTw r3 = (X.C15171UTw) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x002b
            int r2 = r2.A00
            int r1 = r3.A00
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14113Tq7.Ete(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((RecyclerView) obj).setLayoutManager((C252553pI) null);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}
