package X;

/* renamed from: X.ESv  reason: case insensitive filesystem */
public final class C48052ESv extends C2806552w {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48052ESv(E6H e6h, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = e6h;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b6, code lost:
        r1.A0S = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b8, code lost:
        r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        r4.A02(r3, r2, new com.instagram.simplewebview.SimpleWebViewConfig((java.lang.String) null, (java.lang.String) null, r8, r8, r8, r8, r8, true, r8, r8, true, r8, r8, r8, r1.A02, r21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.A00
            r2 = r23
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x007f;
                case 2: goto L_0x0037;
                case 3: goto L_0x0068;
                case 4: goto L_0x005e;
                case 5: goto L_0x0052;
                default: goto L_0x0009;
            }
        L_0x0009:
            r8 = 0
            X.0qQ.A0B(r2, r8)
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r0 = r1.A01
            X.Hms r0 = (X.C55757Hms) r0
            android.content.Context r3 = r0.A00
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.String r21 = "https://help.instagram.com/1146896693058557?ref=learn_more"
        L_0x0019:
            r6 = 0
            java.lang.String r0 = r1.A02
            r13 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r7 = r6
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r15 = r8
            r16 = r13
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r0
            r5.<init>((java.lang.String) r6, (java.lang.String) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (java.lang.String) r20, (java.lang.String) r21)
            r4.A02(r3, r2, r5)
            return
        L_0x0037:
            r8 = 0
            X.0qQ.A0B(r2, r8)
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r2)
            java.lang.Object r0 = r1.A01
            X.E6H r0 = (X.E6H) r0
            X.0eM r0 = r0.A04
            X.0lg r2 = X.DbT.A0X(r0)
            r0 = 633(0x279, float:8.87E-43)
            java.lang.String r21 = X.AnonymousClass000.A00(r0)
            goto L_0x0019
        L_0x0052:
            java.lang.Object r0 = r1.A01
            android.content.Context r2 = X.DbT.A08(r0)
            java.lang.String r0 = r1.A02
            X.FH7.A03(r2, r0)
            return
        L_0x005e:
            java.lang.Object r2 = r1.A01
            X.G5w r2 = (X.C51884G5w) r2
            java.lang.String r0 = r1.A02
            r2.CNw(r0)
            return
        L_0x0068:
            java.lang.Object r0 = r1.A01
            X.E4b r0 = (X.C47477E4b) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A0O
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r1.A02
            X.2EG r0 = X.2EG.A1m
            X.SUL r1 = X.Dba.A0J(r3, r2, r0, r1)
            goto L_0x00b8
        L_0x007f:
            java.lang.Object r0 = r1.A01
            X.E2w r0 = (X.C47450E2w) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r0.A00
            if (r2 == 0) goto L_0x0096
            java.lang.String r1 = r1.A02
            X.2EG r0 = X.2EG.A34
            X.SUL r1 = X.Dba.A0J(r3, r2, r0, r1)
            java.lang.String r0 = "promote"
            goto L_0x00b6
        L_0x0096:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009e:
            java.lang.Object r0 = r1.A01
            X.E0g r0 = (X.E0g) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r1.A02
            X.2EG r0 = X.2EG.A34
            X.SUL r1 = X.Dba.A0J(r3, r2, r0, r1)
            java.lang.String r0 = "media_picker_info_bottom_sheet"
        L_0x00b6:
            r1.A0S = r0
        L_0x00b8:
            r1.A0A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48052ESv.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48052ESv(C55757Hms hms, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = hms;
        this.A02 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48052ESv(E0g e0g, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = e0g;
        this.A02 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48052ESv(C47450E2w e2w, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = e2w;
        this.A02 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48052ESv(C47477E4b e4b, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = e4b;
        this.A02 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48052ESv(C47510E5t e5t, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = e5t;
        this.A02 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48052ESv(C51884G5w g5w, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = g5w;
        this.A02 = str;
    }
}
