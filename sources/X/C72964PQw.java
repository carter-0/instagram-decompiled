package X;

/* renamed from: X.PQw  reason: case insensitive filesystem */
public final class C72964PQw implements C332277Ui {
    public final int A00;
    public final Object A01;

    public C72964PQw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Object obj, int i, Object obj2) {
        ((AnonymousClass37F) obj2).A0H = new C72964PQw(obj, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9V() {
        /*
            r32 = this;
            r1 = r32
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x015f;
                case 2: goto L_0x0169;
                case 3: goto L_0x0080;
                case 4: goto L_0x0058;
                case 5: goto L_0x0171;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r1.A01
            X.OcF r5 = (X.C71093OcF) r5
            X.Pvj r1 = r5.A03
            boolean r0 = r5.A0E
            r1.Cyb(r0)
            com.instagram.common.session.UserSession r4 = r5.A0K
            boolean r0 = r5.A0F
            X.ORV.A00(r4, r0)
            com.instagram.user.model.User r0 = r5.A01
            if (r0 == 0) goto L_0x0020
            r0.getId()
        L_0x0020:
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x0031
            X.1Wj r3 = X.DcL.A00()
            android.app.Activity r2 = r5.A0I
            java.util.Map r1 = r5.A0C
            java.lang.String r0 = "726601934859973"
            r3.A00(r2, r4, r0, r1)
        L_0x0031:
            java.util.Map r1 = r5.A0C
            if (r1 == 0) goto L_0x0059
            r0 = 274(0x112, float:3.84E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Object r1 = r1.get(r0)
        L_0x003f:
            java.lang.String r0 = "1"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0058
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x0058
            X.1Wj r3 = X.DcL.A00()
            android.app.Activity r2 = r5.A0I
            java.util.Map r1 = r5.A0C
            java.lang.String r0 = "1028000218060789"
            r3.A00(r2, r4, r0, r1)
        L_0x0058:
            return
        L_0x0059:
            r1 = 0
            goto L_0x003f
        L_0x005b:
            java.lang.Object r3 = r1.A01
            X.NKC r3 = (X.NKC) r3
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0058
            X.0eM r0 = r3.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.3gp r1 = r3.A01
            java.lang.String r0 = "comment_hidden_nux_dismiss"
            X.AAQ.A00(r2, r1, r0)
            X.ODM r1 = r3.A00
            if (r1 == 0) goto L_0x0058
            X.GgO r0 = r1.A00
            java.lang.String r2 = r1.A01
            java.lang.String r1 = r1.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r0.A0A
            r0.A0L(r2, r1)
            return
        L_0x0080:
            java.lang.Object r3 = r1.A01
            X.OdL r3 = (X.C71126OdL) r3
            com.instagram.common.session.UserSession r8 = r3.A0Q
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321245637256386(0x8109fb000224c2, double:3.033040222693408E-306)
            boolean r2 = X.182.A06(r4, r8, r0)
            r0 = 36321245637321923(0x8109fb000324c3, double:3.033040222734854E-306)
            boolean r1 = X.182.A06(r4, r8, r0)
            boolean r0 = r3.A0J
            java.lang.String r7 = "stickers"
            java.lang.String r6 = "avatar_stickers"
            if (r0 == 0) goto L_0x0111
            if (r2 != 0) goto L_0x00ef
            if (r1 != 0) goto L_0x00f4
            X.1Av r4 = X.1Au.A00(r8)
            X.0s0 r2 = r4.A6C
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 402(0x192, float:5.63E-43)
            r0 = r1[r0]
            java.lang.Object r2 = r2.CDM(r4, r0)
            java.lang.String r1 = "gifs"
            boolean r0 = X.0qQ.A0K(r2, r1)
            if (r0 == 0) goto L_0x00d5
            r3.A0F = r1
            X.1Av r0 = X.1Au.A00(r8)
            r0.A0w(r1)
        L_0x00c7:
            X.Pw6 r9 = r3.A0A
            if (r9 != 0) goto L_0x0114
            java.lang.String r0 = "directStickerTrayDelegate"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d5:
            boolean r0 = X.0qQ.A0K(r2, r6)
            if (r0 == 0) goto L_0x00e5
            r3.A0F = r6
            X.1Av r0 = X.1Au.A00(r8)
            r0.A0w(r6)
            goto L_0x00c7
        L_0x00e5:
            r3.A0F = r7
            X.1Av r0 = X.1Au.A00(r8)
            r0.A0w(r7)
            goto L_0x00c7
        L_0x00ef:
            if (r1 != 0) goto L_0x00f4
            r3.A0F = r6
            goto L_0x00c7
        L_0x00f4:
            X.1Av r1 = X.1Au.A00(r8)
            X.0s0 r0 = r1.A4D
            X.0YZ[] r5 = X.1Av.A8a
            r4 = 401(0x191, float:5.62E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r1, r0, r5, r4)
            if (r0 != 0) goto L_0x0111
            r3.A0F = r6
            X.1Av r2 = X.1Au.A00(r8)
            r1 = 1
            X.0s0 r0 = r2.A4D
            X.AnonymousClass7TF.A1J(r2, r0, r5, r4, r1)
            goto L_0x00c7
        L_0x0111:
            r3.A0F = r7
            goto L_0x00c7
        L_0x0114:
            java.lang.String r13 = r3.A0F
            X.NjK r10 = X.C69319NjK.NOTES_QUICK_REPLY_STICKER_BUTTON
            boolean r2 = r3.A0L
            boolean r1 = r3.A0J
            X.0sn r14 = X.0sn.A00
            r11 = 0
            java.lang.String r12 = ""
            boolean r15 = X.C66581MXm.A1Z(r13)
            r0 = 23
            X.0qQ.A0B(r14, r0)
            r16 = r15
            r17 = r2
            r18 = r2
            r19 = r15
            r20 = r1
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r25 = r15
            r26 = r15
            r27 = r15
            r28 = r15
            r29 = r15
            r30 = r15
            r31 = r15
            X.NJc r1 = X.OPG.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            com.instagram.base.activity.BaseFragmentActivity r0 = r3.A0O
            if (r0 == 0) goto L_0x0058
            X.37D r0 = r0.getBottomSheetNavigator()
            if (r0 == 0) goto L_0x0058
            X.0qQ.A0A(r1)
            r0.A0J(r1)
            return
        L_0x015f:
            java.lang.Object r0 = r1.A01
            X.OLt r0 = (X.C70798OLt) r0
            X.7SM r0 = r0.A06
            r0.A00()
            return
        L_0x0169:
            java.lang.Object r0 = r1.A01
            X.NJT r0 = (X.NJT) r0
            r0.A0E()
            return
        L_0x0171:
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72964PQw.D9V():void");
    }

    public final void D9a() {
        if (4 - this.A00 == 0) {
            ((C72505P8o) this.A01).A04.Cyg();
        }
    }
}
