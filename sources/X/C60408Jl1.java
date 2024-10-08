package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Jl1  reason: case insensitive filesystem */
public final class C60408Jl1 extends 2Rw {
    public List A00 = 0sn.A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.KMB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.KMA} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r6.A01 == true) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            boolean r0 = r8 instanceof X.C60589Jny
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0058
            java.util.List r0 = r7.A00
            java.lang.Object r1 = X.00k.A0O(r0, r9)
            boolean r0 = r1 instanceof X.KMA
            if (r0 == 0) goto L_0x0017
            r6 = r1
            X.KMA r6 = (X.KMA) r6
        L_0x0017:
            r5 = r8
            X.Jny r5 = (X.C60589Jny) r5
            android.content.Context r1 = X.JTQ.A06(r8)
            if (r6 == 0) goto L_0x0056
            int r0 = r6.A00
        L_0x0022:
            int r4 = X.C63117Krl.A00(r1, r0)
            if (r6 == 0) goto L_0x0054
            boolean r0 = r6.A01
            if (r0 != r3) goto L_0x0054
        L_0x002c:
            android.view.View r1 = r5.A01
            r0 = 2131429959(0x7f0b0a47, float:1.8481605E38)
            android.view.View r2 = r1.findViewById(r0)
            X.0qQ.A0A(r2)
            X.0nA.A0f(r2, r4)
            boolean r0 = r5.A00
            if (r0 == r3) goto L_0x0051
            android.content.res.Resources r1 = X.DbU.A05(r1)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            if (r3 == 0) goto L_0x004a
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x004a:
            float r0 = r1.getDimension(r0)
            X.C63167Ksa.A00(r2, r0)
        L_0x0051:
            r5.A00 = r3
        L_0x0053:
            return
        L_0x0054:
            r3 = 0
            goto L_0x002c
        L_0x0056:
            r0 = 0
            goto L_0x0022
        L_0x0058:
            boolean r0 = r8 instanceof X.C60542JnD
            if (r0 == 0) goto L_0x0053
            java.util.List r0 = r7.A00
            java.lang.Object r1 = X.00k.A0O(r0, r9)
            boolean r0 = r1 instanceof X.KMB
            if (r0 == 0) goto L_0x0069
            r6 = r1
            X.KMB r6 = (X.KMB) r6
        L_0x0069:
            X.JnD r8 = (X.C60542JnD) r8
            if (r6 == 0) goto L_0x0092
            int r2 = r6.A00
            boolean r0 = r6.A01
            if (r0 != r3) goto L_0x0093
        L_0x0073:
            android.view.View r1 = r8.A00
            X.0nA.A0f(r1, r2)
            r0 = 2131432363(0x7f0b13ab, float:1.8486481E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r1, r0)
            android.content.res.Resources r1 = X.DbU.A05(r1)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            if (r3 == 0) goto L_0x008a
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x008a:
            int r0 = X.DbS.A03(r1, r0)
            X.0nA.A0V(r2, r0)
            return
        L_0x0092:
            r2 = 0
        L_0x0093:
            r3 = 0
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60408Jl1.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        LayoutInflater A0G = JTP.A0G(viewGroup);
        if (i == 1) {
            return new C60589Jny(DbT.A0D(A0G, viewGroup, R.layout.layout_mini_timeline_clip_bar, false));
        }
        return new C60542JnD(DbT.A0D(A0G, viewGroup, R.layout.layout_mini_timeline_empty_space, false));
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1206189491);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1924599859, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        Integer num;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1500914072);
        L0U l0u = (L0U) 00k.A0O(this.A00, i);
        if (l0u != null) {
            num = l0u.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        if (num.intValue() != 0) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        AnonymousClass0fD.A0A(-590494310, A03);
        return i2;
    }
}
