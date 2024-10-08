package X;

public abstract class SIE {
    public final C10693RwX A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.RwX, X.QgY] */
    public static C8080QgY A02(C8078QgW qgW, C8092Qgk qgk) {
        qgW.A03 = false;
        qgk.A04 = new C8082Qga(qgW);
        qgk.A01 = 0;
        qgk.A00 = 1.0f;
        return new C10693RwX();
    }

    public boolean A04(SIE sie) {
        if (sie == null) {
            return false;
        }
        C10693RwX rwX = this.A00;
        boolean z = rwX.A03;
        C10693RwX rwX2 = sie.A00;
        return z == rwX2.A03 && AnonymousClass7TF.A1V(rwX.A00) == AnonymousClass7TF.A1V(rwX2.A00) && 0qQ.A0K(rwX.A02, rwX2.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0223, code lost:
        if (r1 == 0) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0247, code lost:
        if (r1 == 0) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x026b, code lost:
        if (r1 == 0) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0472, code lost:
        r0 = "button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if (r0 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        if (r0 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        if (r0 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        if (r0 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0156, code lost:
        if (r0.length() != 0) goto L_0x015a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.S4V r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00db
            android.view.ViewStub r2 = r9.A02
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x004a
            int r1 = r9.A01
            if (r1 == 0) goto L_0x0019
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = X.Pxi.A0F(r0, r1)
            r2.setLayoutInflater(r0)
        L_0x0019:
            android.view.View r0 = r2.inflate()
            r3 = 0
            X.0qQ.A0B(r0, r3)
            r9.A00 = r0
            boolean r0 = r9 instanceof X.C8102Qgu
            if (r0 == 0) goto L_0x032a
            r2 = r9
            X.Qgu r2 = (X.C8102Qgu) r2
            android.view.View r1 = r2.A00()
            r0 = 2131441756(0x7f0b385c, float:1.8505533E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A01 = r0
            android.view.View r1 = r2.A00()
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A0B(r0, r3)
            r2.A00 = r0
        L_0x004a:
            r2 = r8
            boolean r0 = r8 instanceof X.C8085Qgd
            if (r0 == 0) goto L_0x0116
            X.Qgd r2 = (X.C8085Qgd) r2
            boolean r0 = r9 instanceof X.C8102Qgu
            if (r0 == 0) goto L_0x0416
            r5 = r9
            X.Qgu r5 = (X.C8102Qgu) r5
            android.view.View r4 = r5.A00
            if (r4 == 0) goto L_0x0413
            X.QgX r3 = r2.A00
            boolean r0 = r3.A02
            int r0 = X.DbW.A01(r0)
            r4.setVisibility(r0)
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x007e
            int r2 = r0.intValue()
            X.Rzw r1 = X.C11426STk.A03()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r4)
            int r0 = r1.A00(r0, r2)
            X.Pxf.A1B(r4, r0)
        L_0x007e:
            X.TjC r1 = r3.A00
            if (r1 == 0) goto L_0x0089
            android.widget.ImageView r0 = r5.A01
            if (r0 == 0) goto L_0x040f
            r1.CgH(r0)
        L_0x0089:
            android.view.View r1 = r9.A00()
            X.RwX r4 = r8.A00
            boolean r0 = r4.A03
            r1.setFocusable(r0)
            android.view.View r2 = r9.A00()
            boolean r1 = r4.A03
            r0 = 4
            if (r1 == 0) goto L_0x009e
            r0 = 0
        L_0x009e:
            r2.setImportantForAccessibility(r0)
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x00b0
            int r1 = r0.intValue()
            android.view.View r0 = r9.A00()
            r0.setId(r1)
        L_0x00b0:
            r3 = r8
            boolean r2 = r8 instanceof X.C8083Qgb
            if (r2 == 0) goto L_0x00f8
            r0 = r3
            X.Qgb r0 = (X.C8083Qgb) r0
            X.QgT r0 = r0.A00
            X.SO0 r1 = r0.A01
            if (r1 == 0) goto L_0x00c8
            r0 = r9
            X.Qgv r0 = (X.C8103Qgv) r0
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0464
        L_0x00c5:
            r1.A02(r0)
        L_0x00c8:
            if (r2 == 0) goto L_0x00dc
            X.Qgb r3 = (X.C8083Qgb) r3
            X.QgT r0 = r3.A00
            android.view.View$OnClickListener r1 = r0.A00
            if (r1 == 0) goto L_0x00db
            X.Qgv r9 = (X.C8103Qgv) r9
            android.view.View r0 = r9.A00
            if (r0 == 0) goto L_0x0464
        L_0x00d8:
            X.AnonymousClass0fU.A00(r1, r0)
        L_0x00db:
            return
        L_0x00dc:
            boolean r0 = r8 instanceof X.C8081QgZ
            if (r0 == 0) goto L_0x00ef
            X.QgZ r3 = (X.C8081QgZ) r3
            X.QgU r0 = r3.A00
            android.view.View$OnClickListener r1 = r0.A00
            if (r1 == 0) goto L_0x00db
            X.Qgr r9 = (X.C8099Qgr) r9
            android.widget.Button r0 = r9.A00
            if (r0 == 0) goto L_0x0472
            goto L_0x00d8
        L_0x00ef:
            android.view.View$OnClickListener r1 = r4.A00
            if (r1 == 0) goto L_0x00db
            android.view.View r0 = r9.A00()
            goto L_0x00d8
        L_0x00f8:
            boolean r0 = r8 instanceof X.C8081QgZ
            if (r0 == 0) goto L_0x010d
            r0 = r3
            X.QgZ r0 = (X.C8081QgZ) r0
            X.QgU r0 = r0.A00
            X.SO0 r1 = r0.A01
            if (r1 == 0) goto L_0x00c8
            r0 = r9
            X.Qgr r0 = (X.C8099Qgr) r0
            android.widget.Button r0 = r0.A00
            if (r0 == 0) goto L_0x0472
            goto L_0x00c5
        L_0x010d:
            X.SO0 r1 = r4.A01
            if (r1 == 0) goto L_0x00c8
            android.view.View r0 = r9.A00()
            goto L_0x00c5
        L_0x0116:
            boolean r0 = r8 instanceof X.C8084Qgc
            if (r0 == 0) goto L_0x015f
            X.Qgc r2 = (X.C8084Qgc) r2
            boolean r0 = r9 instanceof X.C8101Qgt
            if (r0 == 0) goto L_0x041e
            r3 = r9
            X.Qgt r3 = (X.C8101Qgt) r3
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x041b
            X.QgV r2 = r2.A00
            X.SST r0 = r2.A01
            X.C9622Re0.A00(r1, r0)
            android.widget.ImageView r1 = r3.A00
            if (r1 == 0) goto L_0x046f
            X.TjC r0 = r2.A00
            if (r0 == 0) goto L_0x0139
            r0.CgH(r1)
        L_0x0139:
            android.widget.TextView r3 = r3.A01
            if (r3 == 0) goto L_0x041b
            X.SST r0 = r2.A01
            if (r0 == 0) goto L_0x0158
            X.Tj6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            java.lang.CharSequence r0 = r1.C1h(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0158
            int r0 = r0.length()
            if (r0 != 0) goto L_0x015a
        L_0x0158:
            r1 = 8
        L_0x015a:
            r3.setVisibility(r1)
            goto L_0x0089
        L_0x015f:
            boolean r0 = r8 instanceof X.C8086Qge
            if (r0 == 0) goto L_0x0297
            X.Qge r2 = (X.C8086Qge) r2
            boolean r0 = r9 instanceof X.C8104Qgw
            if (r0 == 0) goto L_0x042f
            X.QgY r4 = r2.A00
            X.SO0 r0 = r4.A01
            r3 = 0
            boolean r7 = X.AnonymousClass7TF.A1V(r0)
            r5 = r9
            X.Qgw r5 = (X.C8104Qgw) r5
            android.widget.TextView r0 = r5.A03
            if (r0 == 0) goto L_0x0460
            r6 = r7 ^ 1
            r0.setFocusable(r6)
            android.widget.TextView r1 = r5.A03
            if (r1 == 0) goto L_0x0460
            r2 = 4
            r0 = 4
            if (r7 != 0) goto L_0x0187
            r0 = 0
        L_0x0187:
            r1.setImportantForAccessibility(r0)
            X.SO0 r1 = r4.A06
            if (r1 == 0) goto L_0x0197
            if (r7 != 0) goto L_0x0197
            android.widget.TextView r0 = r5.A03
            if (r0 == 0) goto L_0x0460
            r1.A02(r0)
        L_0x0197:
            X.SO0 r1 = r4.A05
            if (r1 == 0) goto L_0x01a4
            if (r7 != 0) goto L_0x01a4
            android.widget.TextView r0 = r5.A02
            if (r0 == 0) goto L_0x042b
            r1.A02(r0)
        L_0x01a4:
            android.widget.TextView r0 = r5.A01
            if (r0 == 0) goto L_0x0427
            r0.setFocusable(r6)
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x0427
            r0 = 4
            if (r7 != 0) goto L_0x01b3
            r0 = 0
        L_0x01b3:
            r1.setImportantForAccessibility(r0)
            android.widget.TextView r0 = r5.A02
            if (r0 == 0) goto L_0x042b
            r0.setFocusable(r6)
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x042b
            r0 = 4
            if (r7 != 0) goto L_0x01c5
            r0 = 0
        L_0x01c5:
            r1.setImportantForAccessibility(r0)
            android.widget.TextView r0 = r5.A00
            if (r0 == 0) goto L_0x0423
            r0.setFocusable(r6)
            android.widget.TextView r0 = r5.A00
            if (r0 == 0) goto L_0x0423
            if (r7 != 0) goto L_0x01d6
            r2 = 0
        L_0x01d6:
            r0.setImportantForAccessibility(r2)
            android.widget.TextView r1 = r5.A03
            if (r1 == 0) goto L_0x0460
            X.SST r0 = r4.A04
            X.C9622Re0.A00(r1, r0)
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x0427
            X.SST r0 = r4.A02
            X.C9622Re0.A00(r1, r0)
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x042b
            X.SST r0 = r4.A03
            X.C9622Re0.A00(r1, r0)
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x042b
            android.view.View$OnClickListener r0 = r4.A00
            X.AnonymousClass0fU.A00(r0, r1)
            android.widget.TextView r1 = r5.A00
            if (r1 == 0) goto L_0x0423
            X.SST r0 = r4.A01
            X.C9622Re0.A00(r1, r0)
            android.widget.TextView r2 = r5.A03
            if (r2 == 0) goto L_0x0460
            X.SST r0 = r4.A04
            if (r0 == 0) goto L_0x0225
            X.Tj6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            java.lang.CharSequence r0 = r1.C1h(r0)
            if (r0 == 0) goto L_0x0225
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0227
        L_0x0225:
            r0 = 8
        L_0x0227:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r5.A01
            if (r2 == 0) goto L_0x0427
            X.SST r0 = r4.A02
            if (r0 == 0) goto L_0x0249
            X.Tj6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            java.lang.CharSequence r0 = r1.C1h(r0)
            if (r0 == 0) goto L_0x0249
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x024b
        L_0x0249:
            r0 = 8
        L_0x024b:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r5.A02
            if (r2 == 0) goto L_0x042b
            X.SST r0 = r4.A03
            if (r0 == 0) goto L_0x026d
            X.Tj6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            java.lang.CharSequence r0 = r1.C1h(r0)
            if (r0 == 0) goto L_0x026d
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x026f
        L_0x026d:
            r0 = 8
        L_0x026f:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r5.A00
            if (r2 == 0) goto L_0x0423
            X.SST r0 = r4.A01
            if (r0 == 0) goto L_0x0290
            X.Tj6 r1 = r0.A01
            android.view.View r0 = r9.A00()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            java.lang.CharSequence r0 = r1.C1h(r0)
            if (r0 == 0) goto L_0x0290
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0292
        L_0x0290:
            r3 = 8
        L_0x0292:
            r2.setVisibility(r3)
            goto L_0x0089
        L_0x0297:
            boolean r0 = r8 instanceof X.C8083Qgb
            if (r0 == 0) goto L_0x02cc
            X.Qgb r2 = (X.C8083Qgb) r2
            boolean r0 = r9 instanceof X.C8103Qgv
            if (r0 == 0) goto L_0x0467
            r4 = r9
            X.Qgv r4 = (X.C8103Qgv) r4
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L_0x0464
            X.C11426STk.A03()
            android.view.View r0 = r9.A00()
            X.AnonymousClass7TE.A0S(r0)
            android.view.View r0 = r9.A00()
            android.content.Context r1 = r0.getContext()
            r0 = 2131231223(0x7f0801f7, float:1.807852E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x0434
            r1 = 13
            java.lang.String r0 = "Invalid color type: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        L_0x02cc:
            boolean r0 = r8 instanceof X.C8082Qga
            if (r0 == 0) goto L_0x0309
            X.Qga r2 = (X.C8082Qga) r2
            boolean r0 = r9 instanceof X.C8100Qgs
            if (r0 == 0) goto L_0x047c
            r3 = r9
            X.Qgs r3 = (X.C8100Qgs) r3
            android.widget.ImageView r1 = r3.A01
            if (r1 == 0) goto L_0x046f
            X.QgW r2 = r2.A00
            X.TjC r0 = r2.A02
            if (r0 == 0) goto L_0x02e6
            r0.CgH(r1)
        L_0x02e6:
            android.widget.ImageView r1 = r3.A01
            if (r1 == 0) goto L_0x046f
            X.TjC r0 = r2.A00
            if (r0 == 0) goto L_0x02f1
            r0.EOw(r1)
        L_0x02f1:
            android.widget.ImageView r1 = r3.A00
            if (r1 == 0) goto L_0x046c
            X.TjC r0 = r2.A01
            if (r0 == 0) goto L_0x02fc
            r0.CgH(r1)
        L_0x02fc:
            android.widget.ImageView r3 = r3.A00
            if (r3 == 0) goto L_0x046c
            X.TjC r0 = r2.A01
            r1 = 8
            if (r0 == 0) goto L_0x015a
            r1 = 0
            goto L_0x015a
        L_0x0309:
            X.QgZ r2 = (X.C8081QgZ) r2
            boolean r0 = r9 instanceof X.C8099Qgr
            if (r0 == 0) goto L_0x048b
            r3 = r9
            X.Qgr r3 = (X.C8099Qgr) r3
            android.widget.Button r1 = r3.A00
            if (r1 == 0) goto L_0x0481
            X.QgU r2 = r2.A00
            X.SST r0 = r2.A01
            X.C9622Re0.A00(r1, r0)
            android.widget.Button r1 = r3.A00
            if (r1 == 0) goto L_0x0481
            X.TjC r0 = r2.A00
            if (r0 == 0) goto L_0x0089
            r0.EOw(r1)
            goto L_0x0089
        L_0x032a:
            boolean r0 = r9 instanceof X.C8101Qgt
            if (r0 == 0) goto L_0x0353
            r2 = r9
            X.Qgt r2 = (X.C8101Qgt) r2
            android.view.View r1 = r2.A00()
            r0 = 2131434527(0x7f0b1c1f, float:1.849087E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A01 = r0
            android.view.View r1 = r2.A00()
            r0 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A00 = r0
            goto L_0x004a
        L_0x0353:
            boolean r0 = r9 instanceof X.C8104Qgw
            if (r0 == 0) goto L_0x0396
            r2 = r9
            X.Qgw r2 = (X.C8104Qgw) r2
            android.view.View r0 = r2.A00()
            android.widget.TextView r0 = X.Dba.A06(r0)
            X.0qQ.A0B(r0, r3)
            r2.A03 = r0
            android.view.View r0 = r2.A00()
            android.widget.TextView r0 = X.Dba.A05(r0)
            X.0qQ.A0B(r0, r3)
            r2.A01 = r0
            android.view.View r1 = r2.A00()
            r0 = 2131442551(0x7f0b3b77, float:1.8507145E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A02 = r0
            android.view.View r1 = r2.A00()
            r0 = 2131438933(0x7f0b2d55, float:1.8499807E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A00 = r0
            goto L_0x004a
        L_0x0396:
            boolean r0 = r9 instanceof X.C8103Qgv
            if (r0 == 0) goto L_0x03cf
            r2 = r9
            X.Qgv r2 = (X.C8103Qgv) r2
            android.view.View r1 = r2.A00()
            r0 = 2131441062(0x7f0b35a6, float:1.8504125E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A0B(r0, r3)
            r2.A00 = r0
            android.view.View r1 = r2.A00()
            r0 = 2131441065(0x7f0b35a9, float:1.8504131E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A02 = r0
            android.view.View r1 = r2.A00()
            r0 = 2131441063(0x7f0b35a7, float:1.8504127E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A01 = r0
            goto L_0x004a
        L_0x03cf:
            boolean r0 = r9 instanceof X.C8100Qgs
            if (r0 == 0) goto L_0x03f8
            r2 = r9
            X.Qgs r2 = (X.C8100Qgs) r2
            android.view.View r1 = r2.A00()
            r0 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A01 = r0
            android.view.View r1 = r2.A00()
            r0 = 2131428570(0x7f0b04da, float:1.8478788E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            X.0qQ.A0B(r0, r3)
            r2.A00 = r0
            goto L_0x004a
        L_0x03f8:
            r2 = r9
            X.Qgr r2 = (X.C8099Qgr) r2
            android.view.View r1 = r2.A00()
            r0 = 2131429136(0x7f0b0710, float:1.8479936E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            X.0qQ.A0B(r0, r3)
            r2.A00 = r0
            goto L_0x004a
        L_0x040f:
            java.lang.String r0 = "statusIcon"
            goto L_0x0474
        L_0x0413:
            java.lang.String r0 = "divider"
            goto L_0x0474
        L_0x0416:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r2)
            throw r0
        L_0x041b:
            java.lang.String r0 = "imageTitle"
            goto L_0x0474
        L_0x041e:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r2)
            throw r0
        L_0x0423:
            java.lang.String r0 = "quaternaryTitle"
            goto L_0x0474
        L_0x0427:
            java.lang.String r0 = "subtitle"
            goto L_0x0474
        L_0x042b:
            java.lang.String r0 = "tertiaryTitle"
            goto L_0x0474
        L_0x042f:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r2)
            throw r0
        L_0x0434:
            r3.setBackground(r0)
            android.widget.TextView r1 = r4.A02
            if (r1 == 0) goto L_0x0460
            X.QgT r0 = r2.A00
            X.SST r0 = r0.A00
            X.C9622Re0.A00(r1, r0)
            android.widget.ImageView r0 = r4.A01
            if (r0 == 0) goto L_0x045d
            X.C11426STk.A05()
            android.view.View r0 = r9.A00()
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            java.lang.String r1 = "Invalid icon type: "
            r0 = 8
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r1, r0)
            throw r0
        L_0x045d:
            java.lang.String r0 = "icon"
            goto L_0x0474
        L_0x0460:
            java.lang.String r0 = "title"
            goto L_0x0474
        L_0x0464:
            java.lang.String r0 = "container"
            goto L_0x0474
        L_0x0467:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r2)
            throw r0
        L_0x046c:
            java.lang.String r0 = "badgeImage"
            goto L_0x0474
        L_0x046f:
            java.lang.String r0 = "image"
            goto L_0x0474
        L_0x0472:
            java.lang.String r0 = "button"
        L_0x0474:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x047c:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r2)
            throw r0
        L_0x0481:
            java.lang.String r0 = "button"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x048b:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SIE.A03(X.S4V):void");
    }

    public SIE(C10693RwX rwX) {
        this.A00 = rwX;
    }
}
