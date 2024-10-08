package X;

public final class UsT extends C2806552w {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0101, code lost:
        r1.A0S = r0;
        r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0106, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0017;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00de;
                case 4: goto L_0x00ba;
                case 5: goto L_0x009c;
                case 6: goto L_0x000e;
                case 7: goto L_0x0084;
                case 8: goto L_0x0009;
                case 9: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onClick(r9)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r0 = r8.A01
            X.0sa r0 = (X.C62320sa) r0
            goto L_0x002a
        L_0x000e:
            java.lang.Object r0 = r8.A01
            X.WSK r0 = (X.WSK) r0
            X.VWs r0 = r0.A01
            X.0sa r0 = r0.A02
            goto L_0x002a
        L_0x0017:
            java.lang.Object r0 = r8.A01
            X.UNu r0 = (X.C15077UNu) r0
            X.VrL r0 = r0.A01
            X.0sa r0 = r0.A00
            goto L_0x0028
        L_0x0020:
            java.lang.Object r0 = r8.A01
            X.UNt r0 = (X.C15076UNt) r0
            X.VrK r0 = r0.A01
            X.0sa r0 = r0.A00
        L_0x0028:
            if (r0 == 0) goto L_0x0008
        L_0x002a:
            r0.invoke()
            return
        L_0x002e:
            java.lang.Object r1 = r8.A01
            X.UbQ r1 = (X.C15372UbQ) r1
            X.0eM r5 = r1.A0A
            X.0lg r4 = X.DbT.A0X(r5)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36324526992339079(0x810cf700033087, double:3.0351153648606595E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x0072
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r0 = 2131976113(0x7f135fb1, float:1.9589337E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "title"
            r4.putString(r0, r2)
            X.0lg r5 = X.DbT.A0X(r5)
            java.lang.Class<com.instagram.modal.ModalActivity> r6 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            r0 = 2100(0x834, float:2.943E-42)
        L_0x0062:
            java.lang.String r7 = X.C273654mx.A00(r0)
            X.6W8 r2 = new X.6W8
            r2.<init>(r3, r4, r5, r6, r7)
            r2.A08()
            X.DbT.A1M(r1, r2)
            return
        L_0x0072:
            X.0lg r5 = X.DbT.A0X(r5)
            java.lang.Class<com.instagram.modal.ModalActivity> r6 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            r0 = 2998(0xbb6, float:4.201E-42)
            goto L_0x0062
        L_0x0084:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r0 = r8.A01
            X.VPC r0 = (X.VPC) r0
            X.Uai r0 = r0.A00
            android.content.Context r1 = r0.requireContext()
            java.lang.String r0 = "https://www.facebook.com/help/instagram/518659859068596"
            android.net.Uri r0 = X.0cp.A03(r0)
            X.0kR.A0F(r1, r0)
            return
        L_0x009c:
            java.lang.Object r0 = r8.A01
            X.U4E r0 = (X.U4E) r0
            X.VMz r0 = r0.A01
            X.Uaf r0 = r0.A00
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A2B
            r0 = 78
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.Dbb.A0k(r3, r2, r1, r0)
            return
        L_0x00ba:
            java.lang.Object r4 = r8.A01
            X.UaU r4 = (X.C15322UaU) r4
            X.WGU r2 = r4.A03
            if (r2 == 0) goto L_0x00c9
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "fb_placement_learn_more"
            r2.A0F(r1, r0)
        L_0x00c9:
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0eM r0 = r4.A0N
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/help/instagram/663506574978989"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote_audience"
            goto L_0x0101
        L_0x00de:
            java.lang.Object r0 = r8.A01
            X.X95 r0 = (X.X95) r0
            r0.Dng()
            return
        L_0x00e6:
            r6 = 0
            X.0qQ.A0B(r9, r6)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r9)
            java.lang.Object r0 = r8.A01
            X.UaQ r0 = (X.C15318UaQ) r0
            com.instagram.common.session.UserSession r3 = r0.A03
            if (r3 == 0) goto L_0x0107
            X.2EG r4 = X.2EG.A34
            java.lang.String r5 = "https://www.facebook.com/business/help/605021638170961/"
            X.SUL r1 = new X.SUL
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r0 = "promote_beneficiary_and_payer_view"
        L_0x0101:
            r1.A0S = r0
            r1.A0A()
            return
        L_0x0107:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UsT.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(C15077UNu uNu, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = uNu;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(C15318UaQ uaQ, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = uaQ;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(C15322UaU uaU, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A01 = uaU;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(WSK wsk, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A01 = wsk;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(X95 x95, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = x95;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(U4E u4e, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = u4e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(C15076UNt uNt, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = uNt;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(C62320sa r2, int i) {
        super(Integer.valueOf(i));
        this.A00 = 8;
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(C15372UbQ ubQ, int i) {
        super(Integer.valueOf(i));
        this.A00 = 9;
        this.A01 = ubQ;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsT(VPC vpc, int i) {
        super(Integer.valueOf(i));
        this.A00 = 7;
        this.A01 = vpc;
    }
}
