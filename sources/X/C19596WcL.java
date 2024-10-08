package X;

/* renamed from: X.WcL  reason: case insensitive filesystem */
public final class C19596WcL implements X6y {
    public final int A00;
    public final Object A01;

    public C19596WcL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMY(java.lang.String r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            r14 = r19
            r4 = r20
            r7 = r21
            r6 = r22
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0042;
                case 2: goto L_0x0030;
                case 3: goto L_0x001e;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Object r3 = r1.A01
            X.U8r r3 = (X.C14781U8r) r3
            r5 = 8
            X.Tth r2 = new X.Tth
            r2.<init>(r3, r4, r5, r6, r7)
            X.C14781U8r.A00(r3, r2)
            return
        L_0x001e:
            java.lang.Object r3 = r1.A01
            X.U8g r3 = (X.C14770U8g) r3
            r5 = 7
            X.Tth r2 = new X.Tth
            r2.<init>(r3, r4, r5, r6, r7)
            X.2Fj r1 = r3.A02
            X.2Fk r0 = r3.A01
            X.C13991Tnr.A0y(r0, r1, r2)
            return
        L_0x0030:
            java.lang.Object r3 = r1.A01
            X.U8q r3 = (X.C14780U8q) r3
            r5 = 6
            X.Tth r2 = new X.Tth
            r2.<init>(r3, r4, r5, r6, r7)
            X.2Fj r1 = r3.A02
            X.2Fk r0 = r3.A01
            X.C13991Tnr.A0y(r0, r1, r2)
            return
        L_0x0042:
            r0 = 3
            X.0qQ.A0B(r14, r0)
            java.lang.Object r3 = r1.A01
            X.U8e r3 = (X.C14768U8e) r3
            X.VgG r12 = r3.A02
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)
            r16 = 1
            r15 = r4
            r17 = r7
            r12.A00(r13, r14, r15, r16, r17)
            r5 = 5
            X.Tth r2 = new X.Tth
            r2.<init>(r3, r4, r5, r6, r7)
            X.2Fj r1 = r3.A01
            X.2Fk r0 = r3.A00
            X.C13991Tnr.A0y(r0, r1, r2)
            return
        L_0x0066:
            boolean r2 = X.C66581MXm.A1Z(r14)
            java.lang.Object r1 = r1.A01
            X.Uan r1 = (X.C15338Uan) r1
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x007a
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x007a
            r1.A0C = r2
        L_0x007a:
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r0 = r1.A0A
            if (r0 == 0) goto L_0x0081
            r0.setRefreshing(r2)
        L_0x0081:
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r0 = r1.A0A
            if (r0 == 0) goto L_0x0088
            r0.setVisibility(r2)
        L_0x0088:
            android.widget.FrameLayout r0 = r1.A00
            X.AnonymousClass7TH.A0R(r0)
            if (r21 == 0) goto L_0x0177
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0169
            X.UAC r3 = r1.A0M
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3.A00 = r0
        L_0x009b:
            r3.notifyDataSetChanged()
            X.W02 r4 = r1.A05
            java.lang.String r2 = "logger"
            if (r4 == 0) goto L_0x00b8
            java.util.List r0 = r3.A01()
            r4.A02 = r0
            boolean r0 = r1.A0B
            X.W02 r9 = r1.A05
            if (r0 == 0) goto L_0x00d8
            if (r9 == 0) goto L_0x00b8
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r0 = r1.A08
            if (r0 != 0) goto L_0x00c0
            java.lang.String r2 = "arguments"
        L_0x00b8:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c0:
            java.lang.Integer r12 = r0.A01
            r15 = 1
            int r0 = r3.A00()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            r9.A03(r10, r11, r12, r13, r14, r15)
            goto L_0x015a
        L_0x00d8:
            if (r9 == 0) goto L_0x00b8
            int r3 = r3.A00()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            X.0wc r2 = r9.A03
            java.lang.String r0 = "instagram_shopping_product_tagging_load_success"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            com.instagram.model.shopping.ProductSource r0 = r9.A01
            if (r0 == 0) goto L_0x0166
            X.Uyv r0 = r0.A00
            java.lang.String r2 = r0.toString()
        L_0x00fc:
            java.lang.String r0 = "selected_source_type"
            r4.AAJ(r0, r2)
            com.instagram.model.shopping.ProductSource r0 = r9.A01
            r7 = 0
            if (r0 == 0) goto L_0x0164
            java.lang.String r2 = r0.A01
        L_0x0108:
            java.lang.String r0 = "selected_source_id"
            java.lang.String r2 = X.W02.A00(r4, r9, r0, r2)
            java.lang.String r0 = "selected_source_name"
            r4.AAJ(r0, r2)
            java.lang.String r0 = r9.A04
            X.C13988Tno.A1C(r4, r0)
            com.instagram.model.shopping.ProductSource r0 = r9.A01
            if (r0 == 0) goto L_0x0162
            X.Uyv r2 = r0.A00
            X.Uyv r0 = X.C16659Uyv.BRAND
            boolean r0 = X.AnonymousClass7TF.A1W(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0128:
            java.lang.String r0 = "is_influencer"
            r4.A7p(r0, r2)
            java.lang.String r2 = r9.A06
            java.lang.String r0 = "waterfall_id"
            r4.AAJ(r0, r2)
            if (r8 == 0) goto L_0x013b
            long r2 = (long) r3
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
        L_0x013b:
            java.lang.String r0 = "result_count"
            r4.A9F(r0, r7)
            java.lang.String r0 = "has_more_results"
            r4.A7p(r0, r6)
            java.lang.String r0 = "is_initial_load"
            r4.A7p(r0, r5)
            java.lang.String r2 = r9.A05
            java.lang.String r0 = "prior_submodule"
            r4.AAJ(r0, r2)
            X.W02.A01(r4, r9)
            r4.Cgf()
            r0 = 1
            r1.A0B = r0
        L_0x015a:
            X.Viu r0 = r1.A06
            if (r0 != 0) goto L_0x018f
            java.lang.String r2 = "perfLogger"
            goto L_0x00b8
        L_0x0162:
            r2 = 0
            goto L_0x0128
        L_0x0164:
            r2 = r7
            goto L_0x0108
        L_0x0166:
            java.lang.String r2 = ""
            goto L_0x00fc
        L_0x0169:
            X.UAC r2 = r1.A0M
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A00 = r0
            java.util.List r0 = r2.A03
            r0.clear()
            r2.notifyDataSetChanged()
        L_0x0177:
            X.UAC r3 = r1.A0M
            if (r22 == 0) goto L_0x018c
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x018c
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x0183:
            r3.A00 = r0
            java.util.List r0 = r3.A03
            r0.addAll(r4)
            goto L_0x009b
        L_0x018c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0183
        L_0x018f:
            java.util.Set r1 = r0.A00
            r0 = 37369682(0x23a3752, float:1.3680998E-37)
            X.C13992Tns.A1C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19596WcL.DMY(java.lang.String, java.util.List, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r0 = (java.util.List) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        return r0.isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        r0 = X.C13989Tnp.A0c(r0).A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isEmpty() {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x001d;
                case 2: goto L_0x002f;
                case 3: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r1.A01
            X.U8r r0 = (X.C14781U8r) r0
            X.2Fk r0 = r0.A01
            java.lang.Object r0 = r0.A02()
            X.0qQ.A0A(r0)
            X.GnE r0 = (X.C53382GnE) r0
            java.lang.Object r0 = r0.A02
        L_0x0016:
            java.util.List r0 = (java.util.List) r0
        L_0x0018:
            boolean r0 = r0.isEmpty()
            return r0
        L_0x001d:
            java.lang.Object r0 = r1.A01
            X.U8e r0 = (X.C14768U8e) r0
            X.2Fk r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            X.0qQ.A0A(r0)
            X.ULi r0 = (X.ULi) r0
            java.lang.Object r0 = r0.A01
            goto L_0x0016
        L_0x002f:
            java.lang.Object r0 = r1.A01
            X.U8q r0 = (X.C14780U8q) r0
            X.2Fk r0 = r0.A01
            goto L_0x003c
        L_0x0036:
            java.lang.Object r0 = r1.A01
            X.U8g r0 = (X.C14770U8g) r0
            X.2Fk r0 = r0.A01
        L_0x003c:
            X.Tpd r0 = X.C13989Tnp.A0c(r0)
            java.util.List r0 = r0.A04
            goto L_0x0018
        L_0x0043:
            java.lang.Object r0 = r1.A01
            X.Uan r0 = (X.C15338Uan) r0
            X.UAC r0 = r0.A0M
            int r0 = r0.getItemCount()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19596WcL.isEmpty():boolean");
    }
}
