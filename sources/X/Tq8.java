package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public abstract class Tq8 extends 2Rw {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public List A03 = new ArrayList();
    public final Ty6 A04;

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public void A00(C14539Txz txz) {
        C252553pI r1;
        int i = this.A00;
        int i2 = txz.A00;
        boolean z = true;
        boolean z2 = false;
        boolean A1O = JTQ.A1O(i, i2);
        int i3 = this.A01;
        int i4 = txz.A01;
        boolean A1O2 = JTQ.A1O(i3, i4);
        RecyclerView recyclerView = this.A02;
        if (!(recyclerView == null || (r1 = recyclerView.A0D) == null)) {
            if ((!r1.A1X() || !A1O) && (!r1.A1Y() || !A1O2)) {
                z = false;
            }
            z2 = z;
        }
        this.A01 = i4;
        this.A00 = i2;
        List list = this.A03;
        this.A03 = txz.A02;
        if (z2) {
            notifyDataSetChanged();
        } else {
            C232332tX.A00(new U9O(0, this, list)).A03(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        if (r4 != null) goto L_0x00f2;
     */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(X.C299215ul r18, int r19) {
        /*
            r17 = this;
            r8 = r17
            androidx.recyclerview.widget.RecyclerView r0 = r8.A02
            r6 = r19
            r7 = r18
            if (r0 == 0) goto L_0x00c9
            X.3pI r5 = r0.A0D
            r4 = 0
            if (r5 == 0) goto L_0x00c9
            X.Ty6 r2 = r8.A04
            if (r2 == 0) goto L_0x00b8
            int r0 = r8.A01
            r1 = -1
            if (r0 == r1) goto L_0x00b8
            java.util.List r0 = r8.A03
            java.lang.Object r0 = r0.get(r6)
            X.Txy r0 = (X.C14538Txy) r0
            X.4tV r9 = r0.A01
            int r13 = r8.A01
            int r10 = r8.A00
            int r12 = r2.A00
            r0 = -2
            r11 = 1
            r2 = 0
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            if (r12 != r11) goto L_0x0055
            r4.<init>(r1, r0)
        L_0x0032:
            r3 = 132(0x84, float:1.85E-43)
            X.4tV r0 = r9.A07(r3)
            if (r0 == 0) goto L_0x00b3
            X.4tV r0 = r9.A07(r3)
            int r1 = r0.A04
            r0 = 13366(0x3436, float:1.873E-41)
            if (r1 != r0) goto L_0x00b3
            X.4tV r16 = r9.A07(r3)
            java.lang.String r9 = r16.A0I()
            r14 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r3 = "CollectionBinderUtils"
            if (r12 != 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            goto L_0x0059
        L_0x0055:
            r4.<init>(r0, r1)
            goto L_0x0032
        L_0x0059:
            X.TxT r1 = X.AnonymousClass6Su.A0B(r9)     // Catch:{ 3yO -> 0x0075 }
            java.lang.Integer r0 = r1.A01     // Catch:{ 3yO -> 0x0075 }
            int r0 = r0.intValue()     // Catch:{ 3yO -> 0x0075 }
            if (r0 == r2) goto L_0x006f
            if (r0 != r11) goto L_0x0082
            float r1 = r1.A00     // Catch:{ 3yO -> 0x0075 }
            float r0 = (float) r13     // Catch:{ 3yO -> 0x0075 }
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ 3yO -> 0x0075 }
            double r0 = r0 / r14
            int r13 = (int) r0     // Catch:{ 3yO -> 0x0075 }
            goto L_0x0072
        L_0x006f:
            float r0 = r1.A00     // Catch:{ 3yO -> 0x0075 }
            int r13 = (int) r0     // Catch:{ 3yO -> 0x0075 }
        L_0x0072:
            r4.width = r13     // Catch:{ 3yO -> 0x0075 }
            goto L_0x0082
        L_0x0075:
            r0 = 1250(0x4e2, float:1.752E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r9)
            X.1Kn.A02(r3, r0)
        L_0x0082:
            java.lang.String r9 = r16.A0D()
            if (r12 != r11) goto L_0x00b3
            if (r9 == 0) goto L_0x00b3
            X.TxT r1 = X.AnonymousClass6Su.A0B(r9)     // Catch:{ 3yO -> 0x00a6 }
            java.lang.Integer r0 = r1.A01     // Catch:{ 3yO -> 0x00a6 }
            int r0 = r0.intValue()     // Catch:{ 3yO -> 0x00a6 }
            if (r0 == r2) goto L_0x00a0
            if (r0 != r11) goto L_0x00b3
            float r1 = r1.A00     // Catch:{ 3yO -> 0x00a6 }
            float r0 = (float) r10     // Catch:{ 3yO -> 0x00a6 }
            float r1 = r1 * r0
            double r1 = (double) r1     // Catch:{ 3yO -> 0x00a6 }
            double r1 = r1 / r14
            int r0 = (int) r1     // Catch:{ 3yO -> 0x00a6 }
            goto L_0x00a3
        L_0x00a0:
            float r0 = r1.A00     // Catch:{ 3yO -> 0x00a6 }
            int r0 = (int) r0     // Catch:{ 3yO -> 0x00a6 }
        L_0x00a3:
            r4.height = r0     // Catch:{ 3yO -> 0x00a6 }
            goto L_0x00b3
        L_0x00a6:
            r0 = 1249(0x4e1, float:1.75E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r9)
            X.1Kn.A02(r3, r0)
        L_0x00b3:
            android.view.View r0 = r7.itemView
            r0.setLayoutParams(r4)
        L_0x00b8:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x00f0
            if (r4 != 0) goto L_0x00f2
            android.view.View r1 = r7.itemView
            X.3MX r0 = r5.A0Z()
            r1.setLayoutParams(r0)
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r7.A01 = r1
            java.util.List r0 = r8.A03
            java.lang.Object r0 = r0.get(r6)
            X.Txy r0 = (X.C14538Txy) r0
            X.6SI r0 = r0.A00
            android.view.View r1 = r7.itemView
            X.5uT r1 = (X.C299035uT) r1
            java.lang.Object r0 = r0.A00()
            X.6Sh r0 = (X.C307996Sh) r0
            X.3dH r0 = r0.A01
            r1.setRenderTree(r0)
            java.util.List r0 = r8.A03
            java.lang.Object r0 = r0.get(r6)
            r7.A00 = r0
            return
        L_0x00f0:
            if (r4 == 0) goto L_0x00c9
        L_0x00f2:
            r1 = 1
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Tq8.onBindViewHolder(X.5ul, int):void");
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r3) {
        C299215ul r32 = (C299215ul) r3;
        ((C299035uT) r32.itemView).setRenderTree((C245663dH) null);
        r32.A00 = null;
    }

    public Tq8(Ty6 ty6) {
        this.A04 = ty6;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1617054002);
        int size = this.A03.size();
        AnonymousClass0fD.A0A(1509134364, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(-718755108);
        long j = (long) ((C14538Txy) this.A03.get(i)).A01.A03;
        AnonymousClass0fD.A0A(-1269378423, A032);
        return j;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.3kE, X.5ul] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C299025uS r3;
        Context context = viewGroup.getContext();
        if (this instanceof C14114Tq9) {
            0qQ.A0B(context, 1);
            r3 = new C299025uS(context);
        } else {
            0qQ.A0B(context, 0);
            r3 = new C299025uS(context);
            r3.setLayoutParams(new AnonymousClass3MX(-1, -2));
        }
        ? r1 = new C249703kE(r3);
        r1.A01 = false;
        return r1;
    }
}
