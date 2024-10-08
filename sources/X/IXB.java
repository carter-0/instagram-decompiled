package X;

public final class IXB implements JPW {
    public final int A00;
    public final Object A01;

    public IXB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.H26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.H1q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.H26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.H26} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DFE(boolean r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 2: goto L_0x0042;
                case 3: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            if (r5 == 0) goto L_0x0005
            java.lang.Object r2 = r4.A01
            X.H1q r2 = (X.C54171H1q) r2
            X.IXC r0 = r2.A07
            if (r0 != 0) goto L_0x001a
            java.lang.String r3 = "savedCollectionsFetcher"
        L_0x0012:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001a:
            X.6z9 r0 = r0.A02
            X.6zA r0 = r0.A03
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0005
            androidx.recyclerview.widget.RecyclerView r1 = r2.A04
            if (r1 != 0) goto L_0x002b
            java.lang.String r3 = "recyclerView"
            goto L_0x0012
        L_0x002b:
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A09
            java.lang.String r3 = "loadingSpinner"
            if (r1 == 0) goto L_0x0012
            X.3uy r0 = X.C255943uy.FAILED
            r1.setLoadingStatus(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A09
            if (r1 == 0) goto L_0x0012
            r0 = 48
            goto L_0x0066
        L_0x0042:
            if (r5 == 0) goto L_0x0005
            java.lang.Object r2 = r4.A01
            X.H26 r2 = (X.H26) r2
            X.IXC r0 = r2.A05
            X.6z9 r0 = r0.A02
            X.6zA r0 = r0.A03
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0005
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A08
            X.3uy r0 = X.C255943uy.FAILED
            r1.setLoadingStatus(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A08
            r0 = 46
        L_0x0066:
            X.C56802ICz.A01(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IXB.DFE(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c8, code lost:
        if (X.AnonymousClass4k9.A00(r0).A00.getInt("direct_collab_collection_feed_creation_nux_impression_count", 0) < 1) goto L_0x01ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x026a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DFO(java.util.List r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0123;
                case 1: goto L_0x002e;
                case 2: goto L_0x003d;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 1
            X.0qQ.A0B(r13, r3)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1D(r13)
            java.lang.Object r4 = r12.A01
            X.H1q r4 = (X.C54171H1q) r4
            X.1Xj r8 = r4.A05
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r4.A09
            r10 = 0
            if (r1 != 0) goto L_0x0022
            java.lang.String r9 = "loadingSpinner"
        L_0x001a:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0022:
            X.3uy r0 = X.C255943uy.SUCCESS
            r1.setLoadingStatus(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A04
            if (r0 != 0) goto L_0x020f
            java.lang.String r9 = "recyclerView"
            goto L_0x001a
        L_0x002e:
            r0 = 1
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r12.A01
            X.H14 r0 = (X.H14) r0
            X.Gi3 r1 = r0.A00
            if (r1 != 0) goto L_0x029f
            java.lang.String r9 = "adapter"
            goto L_0x001a
        L_0x003d:
            java.lang.Object r3 = r12.A01
            X.H26 r3 = (X.H26) r3
            com.instagram.common.session.UserSession r0 = r3.getSession()
            boolean r8 = X.I7Q.A08(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r13.iterator()
        L_0x0051:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r1.next()
            r4.add(r0)
            goto L_0x0051
        L_0x005f:
            android.os.Bundle r0 = r3.requireArguments()
            java.lang.String r6 = X.C228022kf.A00(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A08
            X.3uy r0 = X.C255943uy.SUCCESS
            r1.setLoadingStatus(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A01
            r7 = 0
            r0.setVisibility(r7)
            if (r8 == 0) goto L_0x0115
            X.1Xj r2 = r3.A02
            int r1 = r3.A00
            com.instagram.common.session.UserSession r0 = r3.getSession()
            boolean r0 = X.I7Q.A0B(r0, r2, r13, r1)
            if (r0 == 0) goto L_0x0115
            X.HMw r5 = X.C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION
            java.lang.String r2 = r5.A01
            r0 = 2131972557(0x7f1351cd, float:1.9582125E38)
            java.lang.String r1 = r3.getString(r0)
            com.instagram.save.model.SavedCollection r0 = new com.instagram.save.model.SavedCollection
            r0.<init>(r5, r2, r1)
            r4.add(r7, r0)
        L_0x0097:
            X.JT0 r1 = r3.A06
            if (r1 == 0) goto L_0x00a4
            X.GiB r0 = r3.A04
            int r0 = r0.getItemCount()
            r1.ARd(r0)
        L_0x00a4:
            X.1Xj r5 = r3.A02
            if (r8 == 0) goto L_0x00c4
            if (r5 == 0) goto L_0x00c4
            int r0 = r3.A00
            java.util.List r0 = X.I7Q.A01(r5, r0)
            r1 = 1
            if (r0 == 0) goto L_0x00c4
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r1) goto L_0x00c4
            com.instagram.common.session.UserSession r2 = r3.getSession()
            X.4DU r1 = r3.A03
            int r0 = r3.A00
            X.I7Q.A04(r2, r5, r1, r6, r0)
        L_0x00c4:
            X.GiB r1 = r3.A04
            if (r14 == 0) goto L_0x00cd
            java.util.List r0 = r1.A06
            r0.clear()
        L_0x00cd:
            java.util.List r0 = r1.A06
            r0.addAll(r4)
            r1.notifyDataSetChanged()
            X.4DU r6 = r3.A03
            com.instagram.common.session.UserSession r4 = r3.getSession()
            X.1Xj r5 = r3.A02
            java.lang.String r8 = r3.A09
            java.lang.String r9 = r3.A0A
            X.GiB r0 = r3.A04
            int r0 = r0.getItemCount()
            X.AnonymousClass7TF.A1H(r6, r4)
            java.lang.String r7 = "instagram_save_collections_view_init"
            X.0xI r2 = X.I6U.A00(r4, r5, r6, r7, r8, r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "num_collections"
            r2.A08(r1, r0)
            X.DbU.A1R(r2, r4)
            android.content.Context r1 = r3.requireContext()
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r2 = r0.A02(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r3.A01
            if (r2 == 0) goto L_0x020e
            if (r1 == 0) goto L_0x020e
            X.Ifp r0 = new X.Ifp
            r0.<init>(r2)
            r1.post(r0)
            return
        L_0x0115:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0097
            X.JT0 r0 = r3.A06
            if (r0 == 0) goto L_0x020e
            r0.EzN()
            return
        L_0x0123:
            r5 = 1
            X.0qQ.A0B(r13, r5)
            java.lang.Object r2 = r12.A01
            X.H1P r2 = (X.H1P) r2
            r2.A08 = r13
            X.0eM r8 = r2.A0K
            X.1Xj r4 = X.C51966G9m.A0v(r8)
            android.os.Bundle r3 = r2.requireArguments()
            r0 = 225(0xe1, float:3.15E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            int r3 = r3.getInt(r1)
            X.0eM r6 = r2.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            boolean r0 = X.I7Q.A08(r0)
            if (r0 == 0) goto L_0x0189
            java.util.List r9 = r2.A08
            X.1Xj r7 = X.C51966G9m.A0v(r8)
            android.os.Bundle r0 = r2.requireArguments()
            int r1 = r0.getInt(r1)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            boolean r0 = X.I7Q.A0B(r0, r7, r9, r1)
            if (r0 == 0) goto L_0x0189
            android.content.Context r1 = r2.requireContext()
            java.util.List r0 = r2.A08
            java.util.ArrayList r11 = X.00k.A0U(r0)
            r10 = 0
            X.HMw r9 = X.C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION
            java.lang.String r7 = r9.A01
            r0 = 2131956264(0x7f131228, float:1.9549079E38)
            java.lang.String r1 = r1.getString(r0)
            com.instagram.save.model.SavedCollection r0 = new com.instagram.save.model.SavedCollection
            r0.<init>(r9, r7, r1)
            r11.add(r10, r0)
            java.util.List r0 = X.00k.A0a(r11)
            r2.A08 = r0
        L_0x0189:
            java.util.List r0 = r2.A08
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x02cf
            X.0eM r0 = r2.A0F
            java.lang.Object r7 = r0.getValue()
            X.HrA r7 = (X.C56004HrA) r7
            java.util.List r1 = r2.A08
            X.1Xj r0 = X.C51966G9m.A0v(r8)
            r7.A00(r0, r1)
            X.0eM r0 = r2.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r0)
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x01f7
            boolean r0 = X.H1P.A08(r2)
            if (r0 != 0) goto L_0x01ca
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            r7 = 0
            X.0qQ.A0B(r0, r7)
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "direct_collab_collection_feed_creation_nux_impression_count"
            int r0 = r1.getInt(r0, r7)
            if (r0 >= r5) goto L_0x01f7
        L_0x01ca:
            boolean r0 = X.H1P.A08(r2)
            X.H1P.A06(r2, r5, r0)
        L_0x01d1:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            boolean r0 = X.I7Q.A08(r0)
            if (r0 == 0) goto L_0x020e
            if (r4 == 0) goto L_0x020e
            java.util.List r0 = X.I7Q.A01(r4, r3)
            if (r0 == 0) goto L_0x020e
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r5) goto L_0x020e
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.0eM r0 = r2.A0N
            java.lang.String r0 = X.DbS.A0t(r0)
            X.I7Q.A04(r1, r4, r2, r0, r3)
            return
        L_0x01f7:
            r0 = 0
            X.H1P.A05(r2, r0)
            goto L_0x01d1
        L_0x01fc:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x023e
            X.C54171H1q.A02(r4)
            X.0eM r0 = r4.A0Q
            java.lang.Object r0 = r0.getValue()
            X.C51969G9p.A1M(r0)
        L_0x020e:
            return
        L_0x020f:
            r9 = 0
            r0.setVisibility(r9)
            X.0eM r5 = r4.A0P
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.I7Q.A08(r0)
            if (r0 == 0) goto L_0x01fc
            int r1 = r4.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.I7Q.A0B(r0, r8, r13, r1)
            if (r0 == 0) goto L_0x01fc
            X.HMw r7 = X.C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION
            java.lang.String r2 = r7.A01
            r0 = 2131972557(0x7f1351cd, float:1.9582125E38)
            java.lang.String r1 = r4.getString(r0)
            com.instagram.save.model.SavedCollection r0 = new com.instagram.save.model.SavedCollection
            r0.<init>(r7, r2, r1)
            r6.add(r9, r0)
        L_0x023e:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.I7Q.A08(r0)
            java.lang.String r9 = "parentInsightsHost"
            if (r0 == 0) goto L_0x026f
            if (r8 == 0) goto L_0x026f
            int r0 = r4.A00
            java.util.List r0 = X.I7Q.A01(r8, r0)
            if (r0 == 0) goto L_0x026f
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r3) goto L_0x026f
            android.os.Bundle r0 = r4.requireArguments()
            java.lang.String r7 = X.C228022kf.A00(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.4DU r1 = r4.A06
            if (r1 == 0) goto L_0x001a
            int r0 = r4.A00
            X.I7Q.A04(r2, r8, r1, r7, r0)
        L_0x026f:
            X.C54171H1q.A00(r4)
            X.0eM r2 = r4.A0J
            java.lang.Object r1 = r2.getValue()
            X.GiB r1 = (X.C53078GiB) r1
            if (r14 == 0) goto L_0x0281
            java.util.List r0 = r1.A06
            r0.clear()
        L_0x0281:
            java.util.List r0 = r1.A06
            r0.addAll(r6)
            r1.notifyDataSetChanged()
            X.1Xj r0 = r4.A05
            if (r0 == 0) goto L_0x020e
            X.4DU r8 = r4.A06
            if (r8 == 0) goto L_0x001a
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r5)
            X.1Xj r7 = r4.A05
            java.lang.String r11 = r4.A0B
            if (r11 != 0) goto L_0x02af
            java.lang.String r9 = "navigationType"
            goto L_0x001a
        L_0x029f:
            if (r14 == 0) goto L_0x02a6
            java.util.List r0 = r1.A01
            r0.clear()
        L_0x02a6:
            java.util.List r0 = r1.A01
            r0.addAll(r13)
            r1.notifyDataSetChanged()
            return
        L_0x02af:
            java.lang.Object r0 = r2.getValue()
            X.2Rw r0 = (X.2Rw) r0
            int r0 = r0.getItemCount()
            X.0qQ.A0B(r6, r3)
            java.lang.String r9 = "instagram_save_collections_view_init"
            X.0xI r2 = X.I6U.A00(r6, r7, r8, r9, r10, r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "num_collections"
            r2.A08(r1, r0)
            X.DbU.A1R(r2, r6)
            return
        L_0x02cf:
            r0 = 0
            X.H1P.A06(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IXB.DFO(java.util.List, boolean):void");
    }
}
