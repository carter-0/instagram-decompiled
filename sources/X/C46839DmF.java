package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DmF  reason: case insensitive filesystem */
public final class C46839DmF extends 2Rw {
    public String A00;
    public final E6v A01;
    public final List A02;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r1.length() == 0) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r12, int r13) {
        /*
            r11 = this;
            r8 = 0
            X.0qQ.A0B(r12, r8)
            int r0 = r12.mItemViewType
            if (r0 == 0) goto L_0x016b
            r1 = 1
            if (r0 != r1) goto L_0x0164
            X.DpL r12 = (X.C47029DpL) r12
            java.util.List r0 = r11.A02
            int r13 = r13 - r1
            java.lang.Object r6 = r0.get(r13)
            X.Ey9 r6 = (X.Ey9) r6
            X.0qQ.A0B(r6, r8)
            android.content.Context r5 = X.DbS.A07(r12)
            X.5Ji r4 = r6.A02
            X.5Jm r3 = r4.A02
            X.0qQ.A07(r3)
            java.util.List r0 = r3.A06
            if (r0 == 0) goto L_0x015f
            java.lang.Object r7 = r0.get(r8)
            X.4V7 r7 = (X.AnonymousClass4V7) r7
            android.widget.TextView r2 = r12.A08
            X.4V8 r0 = r7.A09
            java.lang.String r1 = X.DbZ.A0n(r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x003e
            java.lang.String r1 = "[Not set]"
        L_0x003e:
            r2.setText(r1)
            android.widget.TextView r2 = r12.A04
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x004d
            int r0 = r1.length()
            if (r0 != 0) goto L_0x004f
        L_0x004d:
            java.lang.String r1 = "[Not set]"
        L_0x004f:
            r2.setText(r1)
            android.widget.TextView r3 = r12.A06
            X.2ka r10 = r6.A01
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = r10.A00
            java.lang.String r2 = r0.name()
            java.lang.String r1 = " - Priority "
            int r0 = r4.A00
            java.lang.String r0 = X.002.A0b(r2, r1, r0)
            r3.setText(r0)
            X.5Jo r0 = r7.A03
            android.widget.TextView r2 = r12.A01
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = X.DbZ.A0n(r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0079
        L_0x0077:
            java.lang.String r1 = "[Not set]"
        L_0x0079:
            r2.setText(r1)
            android.widget.TextView r3 = r12.A07
            X.5Jm r9 = r4.A02
            X.0qQ.A07(r9)
            java.lang.String r0 = "Surface requires triggers: "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.util.EnumSet r1 = r10.A01
            com.instagram.quickpromotion.intf.Trigger[] r0 = new com.instagram.quickpromotion.intf.Trigger[r8]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            X.0qQ.A07(r0)
            r7.append(r0)
            java.lang.String r0 = "QP contains triggers: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.util.List r1 = r9.A07
            if (r1 == 0) goto L_0x015a
            com.instagram.quickpromotion.intf.Trigger[] r0 = new com.instagram.quickpromotion.intf.Trigger[r8]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            X.0qQ.A07(r0)
            r2.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "\n                "
            r1.append(r0)
            r1.append(r7)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r0 = X.0rw.A0t(r0)
            r3.setText(r0)
            android.widget.TextView r3 = r12.A02
            X.0qQ.A0A(r5)
            X.5Jk r0 = r4.A01
            if (r0 == 0) goto L_0x0157
            java.lang.Long r0 = r0.A01
            if (r0 == 0) goto L_0x0157
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.longValue()
            long r1 = r2.toMillis(r0)
            r0 = 17
            java.lang.String r8 = android.text.format.DateUtils.formatDateTime(r5, r1, r0)
            X.0qQ.A0A(r8)
        L_0x00f4:
            java.lang.String r7 = " - "
            X.5Jk r0 = r4.A01
            if (r0 == 0) goto L_0x0154
            java.lang.Long r0 = r0.A00
            if (r0 == 0) goto L_0x0154
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.longValue()
            long r0 = r2.toMillis(r0)
            r2 = 17
            java.lang.String r0 = android.text.format.DateUtils.formatDateTime(r5, r0, r2)
            X.0qQ.A0A(r0)
        L_0x0111:
            java.lang.String r0 = X.002.A0g(r8, r7, r0)
            r3.setText(r0)
            X.FEW r2 = r6.A00
            boolean r0 = r2.A02
            android.widget.TextView r1 = r12.A05
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = "Quick Promotion is qualified"
            r1.setText(r0)
            r0 = 2131100695(0x7f060417, float:1.7813779E38)
            X.DbT.A17(r5, r1, r0)
            android.widget.TextView r1 = r12.A03
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x013c
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            r0 = 2131100341(0x7f0602b5, float:1.781306E38)
            X.DbT.A17(r5, r1, r0)
        L_0x013c:
            android.view.View r2 = r12.itemView
            r1 = 2
            X.FPV r0 = new X.FPV
            r0.<init>(r1, r5, r4)
            r2.setOnLongClickListener(r0)
            return
        L_0x0148:
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            r0 = 2131100341(0x7f0602b5, float:1.781306E38)
            X.DbT.A17(r5, r1, r0)
            goto L_0x013c
        L_0x0154:
            java.lang.String r0 = "[Not set]"
            goto L_0x0111
        L_0x0157:
            java.lang.String r8 = "[Not set]"
            goto L_0x00f4
        L_0x015a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x015f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0164:
            java.lang.String r0 = "Unsupported ViewHolder type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x016b:
            X.DoN r12 = (X.C46969DoN) r12
            java.lang.String r3 = r11.A00
            if (r3 != 0) goto L_0x0177
            android.widget.TextView r0 = r12.A01
            X.DbS.A1C(r0)
            return
        L_0x0177:
            r2 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0182 }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x0182 }
            r0 = 2
            java.lang.String r2 = r1.toString(r0)     // Catch:{ JSONException -> 0x0182 }
        L_0x0182:
            android.widget.TextView r1 = r12.A01
            if (r2 == 0) goto L_0x018d
            int r0 = r2.length()
            if (r0 == 0) goto L_0x018d
            r3 = r2
        L_0x018d:
            r1.setText(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46839DmF.onBindViewHolder(X.3kE, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.DoN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.DpL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.DoN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.DoN} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE onCreateViewHolder(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            r2 = 0
            android.view.LayoutInflater r1 = X.DbX.A0F(r5, r2)
            if (r6 == 0) goto L_0x0023
            r0 = 1
            if (r6 != r0) goto L_0x003f
            r0 = 2131628625(0x7f0e1251, float:1.8884548E38)
            android.view.View r0 = r1.inflate(r0, r5, r2)
            X.DpL r3 = new X.DpL
            r3.<init>(r0)
            android.view.View r2 = r3.A00
            r1 = 37
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r4)
        L_0x001f:
            X.AnonymousClass0fU.A00(r0, r2)
            return r3
        L_0x0023:
            r0 = 2131628629(0x7f0e1255, float:1.8884556E38)
            android.view.View r0 = r1.inflate(r0, r5, r2)
            X.DoN r3 = new X.DoN
            r3.<init>(r0)
            android.widget.TextView r1 = r3.A02
            r0 = 60
            X.FPC.A01(r1, r0, r3)
            android.widget.TextView r2 = r3.A00
            r0 = 59
            X.FPC r0 = X.FPC.A00(r3, r0)
            goto L_0x001f
        L_0x003f:
            java.lang.String r0 = "Unsupported item type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46839DmF.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    public C46839DmF(E6v e6v, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A02 = A1C;
        A1C.addAll(list);
        this.A01 = e6v;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1510469678);
        int size = this.A02.size() + 1;
        AnonymousClass0fD.A0A(-137882247, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(1896721254);
        int i2 = 1;
        if (i == 0) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(1976336368, A03);
        return i2;
    }
}
