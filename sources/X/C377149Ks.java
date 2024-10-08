package X;

/* renamed from: X.9Ks  reason: invalid class name and case insensitive filesystem */
public final class C377149Ks extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377149Ks(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: X.Lzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: X.Lzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v596, resolved type: X.Lzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: X.Lzo} */
    /* JADX WARNING: type inference failed for: r0v443, types: [X.8SL, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03c5, code lost:
        if ((((X.C347017w8) r1).A04() instanceof X.C369908vW) == false) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03d2, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36319939969556308L) != false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0755, code lost:
        if (r15 != X.C351968Bd.SMART_TRACKING_FIT) goto L_0x0757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r5.A03().A0a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0a0b, code lost:
        if (r0 != false) goto L_0x0e0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x104b, code lost:
        if (r0 != false) goto L_0x104d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0903  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x090f  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0912  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x094e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31) {
        /*
            r30 = this;
            r3 = r30
            r15 = r31
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0062;
                case 2: goto L_0x009a;
                case 3: goto L_0x0157;
                case 4: goto L_0x016e;
                case 5: goto L_0x0179;
                case 6: goto L_0x0187;
                case 7: goto L_0x0281;
                case 8: goto L_0x0298;
                case 9: goto L_0x02e6;
                case 10: goto L_0x0009;
                case 11: goto L_0x030b;
                case 12: goto L_0x031a;
                case 13: goto L_0x0331;
                case 14: goto L_0x035c;
                case 15: goto L_0x042d;
                case 16: goto L_0x0009;
                case 17: goto L_0x067d;
                case 18: goto L_0x068c;
                case 19: goto L_0x06a5;
                case 20: goto L_0x06b6;
                case 21: goto L_0x075a;
                case 22: goto L_0x07a5;
                case 23: goto L_0x07b8;
                case 24: goto L_0x1060;
                case 25: goto L_0x07c5;
                case 26: goto L_0x07d6;
                case 27: goto L_0x086f;
                case 28: goto L_0x0863;
                case 29: goto L_0x09b0;
                case 30: goto L_0x09be;
                case 31: goto L_0x09e8;
                case 32: goto L_0x0a2a;
                case 33: goto L_0x0a3b;
                case 34: goto L_0x0b7b;
                case 35: goto L_0x0b8a;
                case 36: goto L_0x0c9d;
                case 37: goto L_0x0cb5;
                case 38: goto L_0x0cbe;
                case 39: goto L_0x0d71;
                case 40: goto L_0x0e2b;
                case 41: goto L_0x0e58;
                case 42: goto L_0x0e87;
                case 43: goto L_0x0ee3;
                case 44: goto L_0x0f3c;
                case 45: goto L_0x0fb1;
                case 46: goto L_0x0fc8;
                case 47: goto L_0x0ff9;
                case 48: goto L_0x1006;
                case 49: goto L_0x1031;
                default: goto L_0x0009;
            }
        L_0x0009:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r3.A01
            X.7vS r0 = (X.C346607vS) r0
            android.content.Context r3 = r0.A09
            android.graphics.Bitmap r2 = X.1MF.A05(r15)
            if (r2 == 0) goto L_0x0029
            android.content.res.Resources r1 = r3.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r2)
            android.graphics.drawable.LayerDrawable r0 = X.C346697vb.A04(r3, r0)
            return r0
        L_0x0029:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0031:
            X.8gX r15 = (X.C361628gX) r15
            r4 = 0
            X.0qQ.A0B(r15, r4)
            java.lang.Object r5 = r3.A01
            X.8hT r5 = (X.C362178hT) r5
            X.0eM r0 = r5.A0Q
            java.lang.Object r0 = r0.getValue()
            X.8iK r0 = (X.C362688iK) r0
            X.8XW r0 = r0.A03
            com.instagram.ui.widget.mediapicker.Folder r0 = r0.A02
            int r1 = r0.A02
            r0 = -1
            if (r1 != r0) goto L_0x1060
            boolean r0 = r5.A06()
            if (r0 != 0) goto L_0x1060
            java.util.Set r0 = r15.A02
            java.util.List r2 = X.00k.A0a(r0)
            X.8hG r1 = r5.A03()
            X.8ie r0 = X.C362888ie.A00
            r1.A0f(r2, r0, r4)
            goto L_0x008e
        L_0x0062:
            X.8gX r15 = (X.C361628gX) r15
            if (r15 == 0) goto L_0x0097
            java.lang.Object r1 = r3.A01
            X.8hT r1 = (X.C362178hT) r1
            r0 = 0
            r1.A0B = r0
            java.util.Set r0 = r15.A02
            if (r0 == 0) goto L_0x0097
            java.util.List r0 = X.00k.A0a(r0)
        L_0x0075:
            java.lang.Object r5 = r3.A01
            X.8hT r5 = (X.C362178hT) r5
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x1060
            X.8hG r4 = r5.A03()
            r3 = 1
            r2 = 14
            X.MMs r1 = new X.MMs
            r1.<init>(r5, r2)
            r4.A0f(r0, r1, r3)
        L_0x008e:
            X.8hG r0 = r5.A03()
            r0.A0a()
            goto L_0x1060
        L_0x0097:
            X.0sn r0 = X.0sn.A00
            goto L_0x0075
        L_0x009a:
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r5 = r3.A01
            X.8hT r5 = (X.C362178hT) r5
            X.8hG r0 = r5.A03()
            X.6ST r0 = r0.A1D
            boolean r0 = r0.isShowing()
            r4 = 0
            if (r0 == 0) goto L_0x0122
            X.4DH r8 = r5.A0H
            android.os.Bundle r0 = r8.requireArguments()
            java.lang.String r7 = "META_GALLERY_ALBUM_TYPE"
            java.lang.String r0 = r0.getString(r7)
            if (r0 == 0) goto L_0x0122
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0122
            r6 = 0
            if (r15 == 0) goto L_0x0122
            r0 = 10
            int r0 = X.0Yv.A1E(r15, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r15.iterator()
        L_0x00d3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r0 = r1.next()
            X.9JL r0 = (X.AnonymousClass9JL) r0
            X.Lzo r0 = X.AnonymousClass9Q0.A00(r0)
            r2.add(r0)
            goto L_0x00d3
        L_0x00e7:
            java.util.Iterator r3 = r2.iterator()
        L_0x00eb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Lzo r0 = (X.C65796Lzo) r0
            java.lang.String r1 = r0.A01
            android.os.Bundle r0 = r8.requireArguments()
            java.lang.String r0 = r0.getString(r7)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00eb
            r6 = r2
        L_0x0109:
            X.Lzo r6 = (X.C65796Lzo) r6
            if (r6 == 0) goto L_0x0122
            X.C362178hT.A01(r5)
            X.8hG r0 = r5.A03()
            r0.DSA(r6)
            r5.A0C = r4
            X.8hG r0 = r5.A03()
            X.6ST r0 = r0.A1D
            r0.dismiss()
        L_0x0122:
            X.8hG r0 = r5.A03()
            X.8iL r0 = r0.A0p
            r0.A01()
            X.8hG r0 = r5.A03()
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x1060
            X.8gT r0 = r5.A0L
            X.0qQ.A0B(r0, r4)
            X.0Ud r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x1060
            X.8hG r0 = r5.A03()
            android.view.View r1 = r0.A01
            if (r1 == 0) goto L_0x1060
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x1060
        L_0x0157:
            X.0sa r15 = (X.C62320sa) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r3.A01
            X.8iX r0 = (X.C362818iX) r0
            X.0eM r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.9SS r0 = (X.AnonymousClass9SS) r0
            r0.A00(r15)
            goto L_0x1060
        L_0x016e:
            java.lang.Object r0 = r3.A01
            X.8XA r0 = (X.AnonymousClass8XA) r0
            X.72N r0 = r0.A0D
            r0.A0F()
            goto L_0x1060
        L_0x0179:
            java.lang.Object r2 = r3.A01
            X.5g0 r2 = (X.C290815g0) r2
            r1 = 1
            X.H7T r0 = new X.H7T
            r0.<init>(r1)
            r2.A00 = r0
            goto L_0x1060
        L_0x0187:
            java.lang.Object r3 = r3.A01
            X.7jY r3 = (X.C339407jY) r3
            X.7jZ r2 = r3.A01
            int[] r1 = X.A2I.A00
            int r0 = r2.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x0209
            r0 = 2
            if (r1 == r0) goto L_0x0253
            X.7jZ r6 = X.C339417jZ.A02
            r0 = 0
            X.MMU r1 = new X.MMU
            r1.<init>(r3, r0)
        L_0x01a3:
            android.content.Context r5 = r3.A0F
            r0 = 28
            X.MJ9 r4 = new X.MJ9
            r4.<init>(r0, r1, r3)
            boolean r0 = r2 instanceof X.C339457jd
            if (r0 == 0) goto L_0x01d5
            r2 = 2
            r0 = 3
            X.0qQ.A0B(r4, r0)
            int[] r1 = X.A2H.A00
            int r0 = r6.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x01d1
            r3 = 2131963982(0x7f13304e, float:1.9564733E38)
            if (r1 == r2) goto L_0x01c8
            r3 = 2131963983(0x7f13304f, float:1.9564735E38)
        L_0x01c8:
            r1 = 2131963980(0x7f13304c, float:1.9564729E38)
        L_0x01cb:
            r0 = 0
            X.C339417jZ.A00(r5, r0, r4, r3, r1)
            goto L_0x1060
        L_0x01d1:
            r3 = 2131963981(0x7f13304d, float:1.956473E38)
            goto L_0x01c8
        L_0x01d5:
            boolean r0 = r2 instanceof X.C339497jh
            if (r0 != 0) goto L_0x1060
            boolean r0 = r2 instanceof X.C339437jb
            if (r0 != 0) goto L_0x024a
            boolean r0 = r2 instanceof X.C339507ji
            if (r0 != 0) goto L_0x1060
            boolean r0 = r2 instanceof X.C339467je
            if (r0 != 0) goto L_0x1060
            boolean r0 = r2 instanceof X.C339487jg
            if (r0 == 0) goto L_0x0213
            r2 = 2
            r0 = 3
            X.0qQ.A0B(r4, r0)
            int[] r1 = X.A2G.A00
            int r0 = r6.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x0205
            r3 = 2131963955(0x7f133033, float:1.9564678E38)
            if (r1 == r2) goto L_0x0201
            r3 = 2131963956(0x7f133034, float:1.956468E38)
        L_0x0201:
            r1 = 2131963953(0x7f133031, float:1.9564674E38)
            goto L_0x01cb
        L_0x0205:
            r3 = 2131963954(0x7f133032, float:1.9564676E38)
            goto L_0x0201
        L_0x0209:
            X.7jZ r6 = X.C339417jZ.A03
            r0 = 49
            X.MM9 r1 = new X.MM9
            r1.<init>(r3, r0)
            goto L_0x01a3
        L_0x0213:
            boolean r0 = r2 instanceof X.C339477jf
            if (r0 != 0) goto L_0x1060
            boolean r0 = r2 instanceof X.C339427ja
            if (r0 != 0) goto L_0x024a
            boolean r0 = r2 instanceof X.C339447jc
            if (r0 == 0) goto L_0x1060
            r3 = 2
            r0 = 3
            X.0qQ.A0B(r4, r0)
            int[] r1 = X.A2F.A00
            int r0 = r6.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x0246
            r2 = 2131963897(0x7f132ff9, float:1.956456E38)
            if (r1 == r3) goto L_0x0237
            r2 = 2131963896(0x7f132ff8, float:1.9564558E38)
        L_0x0237:
            r0 = 2131963895(0x7f132ff7, float:1.9564556E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131963894(0x7f132ff6, float:1.9564554E38)
            X.C339417jZ.A00(r5, r1, r4, r2, r0)
            goto L_0x1060
        L_0x0246:
            r2 = 2131963898(0x7f132ffa, float:1.9564562E38)
            goto L_0x0237
        L_0x024a:
            r0 = 3
            X.0qQ.A0B(r4, r0)
            r4.invoke()
            goto L_0x1060
        L_0x0253:
            android.content.Context r1 = r3.A0F
            X.AxK r3 = X.C41606AxK.A00
            r0 = 2131963946(0x7f13302a, float:1.956466E38)
            X.8ab r2 = new X.8ab
            r2.<init>((android.content.Context) r1)
            r2.A09(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A07(r1)
            X.AJw r0 = new X.AJw
            r0.<init>(r3)
            r2.A0d(r0, r1)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)
            goto L_0x1060
        L_0x0281:
            X.1pS r4 = X.C2601144i.A00()
            java.lang.Object r0 = r3.A01
            X.7jY r0 = (X.C339407jY) r0
            X.4DH r2 = r0.A0G
            com.instagram.common.session.UserSession r1 = r0.A0K
            X.0iw r0 = r0.A0H
            java.lang.String r0 = r0.getModuleName()
            r4.A03(r2, r1, r0)
            goto L_0x1060
        L_0x0298:
            java.lang.Object r4 = r3.A01
            X.7jY r4 = (X.C339407jY) r4
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x02b6
            r2 = 0
            r4.A0B = r2
            android.content.Context r1 = r4.A0F
            r0 = 2131963958(0x7f133036, float:1.9564684E38)
            java.lang.String r0 = r1.getString(r0)
            X.C59689JTv.A09(r1, r0)
            X.8aL r0 = X.C358088aL.A0c
            X.C339407jY.A00(r0, r4, r2)
            goto L_0x1060
        L_0x02b6:
            com.instagram.common.session.UserSession r3 = r4.A0K
            X.7Pr r1 = new X.7Pr
            r1.<init>(r3)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0a = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03 = r0
            X.7Pu r2 = r1.A00()
            X.4DH r0 = r4.A0G
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.7jt r0 = r4.A0Q
            r2.A02(r1, r0)
            X.4lm r1 = X.C272994ll.A00(r3)
            X.0iw r0 = r4.A0H
            java.lang.String r0 = r0.getModuleName()
            r1.A02(r0)
            goto L_0x1060
        L_0x02e6:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r2 = r15.booleanValue()
            java.lang.Object r0 = r3.A01
            X.85r r0 = (X.C3506685r) r0
            X.85u r1 = r0.A01
            if (r2 == 0) goto L_0x02fa
            r0 = 0
        L_0x02f5:
            r1.Eqq(r0)
            goto L_0x1060
        L_0x02fa:
            X.85x r0 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A01
            X.0Ud r0 = r0.A0W
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L_0x02f5
        L_0x030b:
            android.graphics.drawable.Drawable r15 = (android.graphics.drawable.Drawable) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r3.A01
            X.7vS r0 = (X.C346607vS) r0
            X.C346607vS.A03(r15, r0)
            goto L_0x1060
        L_0x031a:
            java.lang.Object r0 = r3.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r0 = r0.A0F
            X.8BA r0 = r0.A00
            X.0eK r0 = r0.A1x
            java.lang.Object r0 = r0.get()
            X.8Wk r0 = (X.C357088Wk) r0
            if (r0 == 0) goto L_0x1060
            r0.A0E()
            goto L_0x1060
        L_0x0331:
            java.lang.Object r0 = r3.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r0 = r0.A0F
            X.8BA r0 = r0.A00
            com.instagram.common.session.UserSession r5 = r0.A0v
            java.lang.Class<com.instagram.modal.ModalActivity> r6 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            X.4DH r1 = r0.A0s
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            r0 = 282(0x11a, float:3.95E-43)
            java.lang.String r7 = X.C273654mx.A00(r0)
            X.6W8 r2 = new X.6W8
            r2.<init>(r3, r4, r5, r6, r7)
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            r2.A0C(r0)
            goto L_0x1060
        L_0x035c:
            java.lang.Object r0 = r3.A01
            X.7vS r0 = (X.C346607vS) r0
            X.8Be r4 = r0.A0F
            X.8BA r2 = r4.A00
            X.6if r6 = r2.A1g
            java.lang.Object r0 = r6.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            boolean r0 = r0.A1V()
            if (r0 == 0) goto L_0x03f2
            com.instagram.common.session.UserSession r5 = r2.A0v
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r0 = r0.A01
            java.lang.String r3 = "has_seen_template_disclosure_for_close_friend"
            r7 = 0
            boolean r0 = r0.getBoolean(r3, r7)
            if (r0 == 0) goto L_0x03d4
            X.8Bz r8 = r2.A1O
            boolean r0 = r8.A07()
            if (r0 != 0) goto L_0x03c7
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r2.A1s
            java.util.Set r0 = r8.A00
            java.util.Set r0 = X.00k.A0k(r0)
            java.util.HashMap r0 = r1.A0Z(r0)
            java.util.Collection r1 = r0.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03f2
            java.lang.Object r1 = r1.next()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.0qQ.A0B(r1, r7)
            boolean r0 = X.AnonymousClass9Sv.A01(r1)
            if (r0 != 0) goto L_0x03c7
            boolean r0 = r1 instanceof X.C347017w8
            if (r0 == 0) goto L_0x03f2
            X.7w8 r1 = (X.C347017w8) r1
            android.graphics.drawable.Drawable r0 = r1.A04()
            boolean r0 = r0 instanceof X.C369908vW
            if (r0 == 0) goto L_0x03f2
        L_0x03c7:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319939969556308(0x8108cb00261f54, double:3.032214513182377E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            if (r0 == 0) goto L_0x03f2
        L_0x03d4:
            android.app.Activity r2 = r2.A0n
            r1 = 3
            X.AOX r0 = new X.AOX
            r0.<init>((X.C351978Be) r4, (int) r1)
            X.AEF.A02(r2, r0, r5)
            X.1Av r0 = X.1Au.A00(r5)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            r2.E5T(r3, r1)
        L_0x03ed:
            r2.apply()
            goto L_0x1060
        L_0x03f2:
            java.lang.Object r1 = r6.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            java.lang.Class<X.7w6> r0 = X.C346997w6.class
            android.graphics.drawable.Drawable r0 = X.AnonymousClass8ME.A03(r1, r0)
            if (r0 == 0) goto L_0x041e
            com.instagram.common.session.UserSession r3 = r2.A0v
            android.app.Activity r2 = r2.A0n
            r1 = 4
            X.AOX r0 = new X.AOX
            r0.<init>((X.C351978Be) r4, (int) r1)
            X.A14.A00(r2, r0, r3)
            X.1Av r0 = X.1Au.A00(r3)
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_music_pick_disclosure"
            r2.E5T(r0, r1)
            goto L_0x03ed
        L_0x041e:
            X.0eK r0 = r2.A1x
            java.lang.Object r0 = r0.get()
            X.8Wk r0 = (X.C357088Wk) r0
            if (r0 == 0) goto L_0x1060
            r0.A0D()
            goto L_0x1060
        L_0x042d:
            java.lang.Object r8 = r3.A01
            X.7vS r8 = (X.C346607vS) r8
            X.82o r0 = r8.A0H
            X.82Y r3 = r0.A01
            X.8Yz r1 = r3.A0X
            if (r1 == 0) goto L_0x0675
            r6 = 1
            r12 = 0
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x04a4
            X.8Be r1 = r8.A0F
            java.lang.Integer r4 = r8.A02
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            java.lang.String r10 = r0.toString()
            X.0qQ.A07(r10)
            X.8BA r3 = r1.A00
            X.0eK r0 = r3.A1x
            java.lang.Object r7 = r0.get()
            X.8Wk r7 = (X.C357088Wk) r7
            if (r7 == 0) goto L_0x0483
            X.ADp r2 = X.C39891ADp.A00
            java.lang.String r1 = "sink"
            java.lang.String r0 = "roll_call"
            r2.A01(r1, r0)
            r2.A00()
            X.8QA r0 = r7.A07
            r0.A0D(r12)
            X.8BA r0 = r7.A0A
            r0.A0a()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r4 != r0) goto L_0x04a1
            com.instagram.pendingmedia.model.UserStoryTarget r9 = com.instagram.pendingmedia.model.UserStoryTarget.A0A
        L_0x047e:
            r8 = 0
            r11 = r8
            X.C357088Wk.A05(r7, r8, r9, r10, r11, r12)
        L_0x0483:
            X.8CV r0 = r3.A1I
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.Jc3 r0 = (X.C59939Jc3) r0
            X.0eM r0 = r0.A06
            java.lang.Object r2 = r0.getValue()
            X.JYE r2 = (X.JYE) r2
            X.4Co r1 = r2.A00
            r0 = 0
            if (r1 == 0) goto L_0x049d
            r1.AG7(r0)
        L_0x049d:
            r2.A00 = r0
            goto L_0x1060
        L_0x04a1:
            com.instagram.pendingmedia.model.UserStoryTarget r9 = com.instagram.pendingmedia.model.UserStoryTarget.A0B
            goto L_0x047e
        L_0x04a4:
            X.8Oh r0 = r8.A0E
            X.4yO r1 = r0.A00()
            X.80M r0 = X.AnonymousClass80M.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x04ca
            X.8Be r0 = r8.A0F
            X.8BA r0 = r0.A00
            X.80U r0 = r0.A1M
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r2 = r0.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.8SL r0 = new X.8SL
            r0.<init>()
            r0.A00 = r1
            r2.A04(r0)
            goto L_0x1060
        L_0x04ca:
            X.80E r1 = r8.A0I
            X.80E r0 = X.AnonymousClass80E.CAMPFIRE_ONLY
            if (r1 != r0) goto L_0x0662
            X.82k r7 = r3.A0W
            if (r7 == 0) goto L_0x1060
            com.instagram.common.session.UserSession r9 = r8.A0C
            boolean r0 = X.AnonymousClass37B.A00(r9)
            if (r0 == 0) goto L_0x0651
            X.1Av r0 = X.1Au.A00(r9)
            X.0xa r1 = r0.A01
            r0 = 3230(0xc9e, float:4.526E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r2, r12)
            if (r0 != 0) goto L_0x0651
            X.0t1 r0 = X.0eE.A00(r9)
            com.instagram.user.model.User r0 = r0.A00()
            java.lang.Boolean r1 = r0.A0K()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r4 = X.0qQ.A0K(r1, r0)
            X.1Av r0 = X.1Au.A00(r9)
            X.0xa r0 = r0.A01
            X.0xY r0 = r0.AR4()
            r0.E5T(r2, r6)
            r0.apply()
            X.0iw r2 = r8.A0B
            X.34q r3 = new X.34q
            r3.<init>(r2, r9)
            X.EZX r1 = X.EZX.STORY_VIEWER
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r11 = 0
            r3.A01(r1, r0)
            android.app.Activity r5 = r8.A08
            if (r4 == 0) goto L_0x05c6
            r0 = 6
            X.AOW r3 = new X.AOW
            r3.<init>(r0, r7, r8)
            java.lang.String r7 = r2.getModuleName()
            r0 = 3
            X.0qQ.A0B(r7, r0)
            r0 = 2131954701(0x7f130c0d, float:1.9545909E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131954698(0x7f130c0a, float:1.9545903E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238514(0x7f081e72, float:1.8093309E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r10 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r10.<init>(r2, r1, r0, r11)
            r0 = 2131954694(0x7f130c06, float:1.9545894E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131954693(0x7f130c05, float:1.9545892E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238943(0x7f08201f, float:1.8094179E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r8 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r8.<init>(r2, r1, r0, r11)
            r0 = 2131954696(0x7f130c08, float:1.9545899E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 2131954695(0x7f130c07, float:1.9545896E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131238274(0x7f081d82, float:1.8092822E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r0.<init>(r4, r2, r1, r11)
            com.instagram.nux.common.HowItWorksNuxFragment$Row[] r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row[]{r10, r8, r0}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            X.E1X r1 = X.C49781F6o.A01(r9, r7, r0)
            X.7Pr r2 = new X.7Pr
            r2.<init>(r9)
            r0 = 2131954699(0x7f130c0b, float:1.9545905E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0d = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r2.A0a = r0
            r2.A1J = r6
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0g = r0
            r2.A0K = r3
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0h = r0
            r2.A0w = r6
        L_0x05bd:
            X.7Pu r0 = r2.A00()
            r0.A02(r5, r1)
            goto L_0x1060
        L_0x05c6:
            r0 = 7
            X.AOW r4 = new X.AOW
            r4.<init>(r0, r7, r8)
            java.lang.String r8 = r2.getModuleName()
            r0 = 3
            X.0qQ.A0B(r8, r0)
            r0 = 2131954701(0x7f130c0d, float:1.9545909E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131954697(0x7f130c09, float:1.95459E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238514(0x7f081e72, float:1.8093309E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r10 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r10.<init>(r2, r1, r0, r11)
            r0 = 2131954694(0x7f130c06, float:1.9545894E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131954693(0x7f130c05, float:1.9545892E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238943(0x7f08201f, float:1.8094179E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r7 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r7.<init>(r2, r1, r0, r11)
            r0 = 2131954696(0x7f130c08, float:1.9545899E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 2131954695(0x7f130c07, float:1.9545896E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131238274(0x7f081d82, float:1.8092822E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r0.<init>(r3, r2, r1, r11)
            com.instagram.nux.common.HowItWorksNuxFragment$Row[] r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row[]{r10, r7, r0}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            X.E1X r1 = X.C49781F6o.A01(r9, r8, r0)
            X.7Pr r2 = new X.7Pr
            r2.<init>(r9)
            r0 = 2131954702(0x7f130c0e, float:1.954591E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0d = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r2.A0a = r0
            r2.A1J = r6
            r0 = 2131954115(0x7f1309c3, float:1.954472E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0g = r0
            r2.A0K = r4
            goto L_0x05bd
        L_0x0651:
            X.8Be r2 = r8.A0F
            java.lang.String r1 = r7.BAL()
            java.lang.Boolean r0 = r3.A0k
            boolean r0 = r0.booleanValue()
            r2.A0G(r1, r0)
            goto L_0x1060
        L_0x0662:
            X.8Be r0 = r8.A0F
            X.8BA r0 = r0.A00
            X.0eK r0 = r0.A1v
            java.lang.Object r0 = r0.get()
            X.8Wi r0 = (X.C357068Wi) r0
            if (r0 == 0) goto L_0x1060
            r0.A07()
            goto L_0x1060
        L_0x0675:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x067d:
            android.graphics.drawable.Drawable r15 = (android.graphics.drawable.Drawable) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r3.A01
            X.7vS r0 = (X.C346607vS) r0
            X.C346607vS.A04(r15, r0)
            goto L_0x1060
        L_0x068c:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            X.0qQ.A0A(r15)
            boolean r2 = r15.booleanValue()
            java.lang.Object r0 = r3.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.widget.ProgressBar r0 = r0.A0b
            r1 = 0
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C355098Oo.A06(r0, r2, r1)
            goto L_0x1060
        L_0x06a5:
            java.lang.Number r15 = (java.lang.Number) r15
            java.lang.Object r0 = r3.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.widget.ProgressBar r1 = r0.A0b
            int r0 = r15.intValue()
            r1.setProgress(r0)
            goto L_0x1060
        L_0x06b6:
            X.8Bd r15 = (X.C351968Bd) r15
            r4 = 0
            X.0qQ.A0B(r15, r4)
            java.lang.Object r2 = r3.A01
            X.8Oj r2 = (X.C355048Oj) r2
            r2.A04 = r15
            X.8Bd r3 = X.C351968Bd.SMART_TRACKING_PROCESSING_TOOLTIP
            if (r15 != r3) goto L_0x0705
            java.lang.ref.WeakReference r0 = r2.A0w
            java.lang.Object r5 = r0.get()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L_0x0705
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x0705
            android.content.Context r1 = r2.A0F
            r0 = 2131974027(0x7f13578b, float:1.9585106E38)
            java.lang.CharSequence r1 = r1.getText(r0)
            X.0qQ.A07(r1)
            X.6jx r0 = new X.6jx
            r0.<init>((java.lang.CharSequence) r1)
            X.5Gt r1 = new X.5Gt
            r1.<init>(r5, r0)
            r1.A01()
            android.view.View r0 = r2.A0K
            r1.A03(r0)
            r0 = 1
            r1.A0A = r0
            X.5Gu r0 = X.C283255Gu.A07
            r1.A07(r0)
            X.5Gv r1 = r1.A00()
            com.instagram.common.session.UserSession r0 = r2.A0d
            r1.A07(r0)
        L_0x0705:
            X.8Bd r5 = X.C351968Bd.SMART_TRACKING_PROCESSING
            if (r15 == r5) goto L_0x074c
            if (r15 == r3) goto L_0x074c
            X.8Bd r0 = X.C351968Bd.SMART_TRACKING_PROCESSING_INVALID
            r1 = 8
            if (r15 != r0) goto L_0x0753
            android.view.View r0 = r2.A0L
        L_0x0713:
            r0.setVisibility(r1)
        L_0x0716:
            android.view.View r4 = r2.A0K
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            boolean r1 = r2.A07
            r0 = 2131238300(0x7f081d9c, float:1.8092875E38)
            if (r1 == 0) goto L_0x0729
            r0 = 2131238302(0x7f081d9e, float:1.8092879E38)
        L_0x0729:
            r4.setImageResource(r0)
            android.content.Context r1 = r2.A0F
            if (r15 == r5) goto L_0x0744
            if (r15 == r3) goto L_0x0744
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
        L_0x0735:
            int r0 = r1.getColor(r0)
            r4.setColorFilter(r0)
            X.9YE r0 = r2.A03
            if (r0 == 0) goto L_0x1060
            r0.A04 = r15
            goto L_0x1060
        L_0x0744:
            r0 = 2130970184(0x7f040648, float:1.754907E38)
            int r0 = X.2Yu.A0H(r1, r0)
            goto L_0x0735
        L_0x074c:
            android.view.View r0 = r2.A0L
            r1 = 0
            r0.setVisibility(r4)
            goto L_0x0757
        L_0x0753:
            X.8Bd r0 = X.C351968Bd.SMART_TRACKING_FIT
            if (r15 == r0) goto L_0x0716
        L_0x0757:
            android.widget.ProgressBar r0 = r2.A0c
            goto L_0x0713
        L_0x075a:
            java.lang.Number r15 = (java.lang.Number) r15
            int r6 = r15.intValue()
            java.lang.Object r1 = r3.A01
            X.8Oj r1 = (X.C355048Oj) r1
            r5 = 1
            android.widget.ProgressBar r4 = r1.A0c
            r3 = 0
            android.view.View[] r0 = new android.view.View[]{r4}
            X.C355098Oo.A06(r0, r5, r3)
            r4.setProgress(r6)
            android.graphics.drawable.Drawable r2 = r4.getProgressDrawable()
            if (r2 == 0) goto L_0x1060
            r0 = 100
            android.content.Context r1 = r1.A0F
            if (r6 != r0) goto L_0x0795
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            r2.setTint(r0)
            android.view.View[] r0 = new android.view.View[]{r4}
            X.C355098Oo.A06(r0, r3, r5)
            goto L_0x1060
        L_0x0795:
            r0 = 2130970184(0x7f040648, float:1.754907E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            r2.setTint(r0)
            goto L_0x1060
        L_0x07a5:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r2 = r3.A01
            X.88Y r2 = (X.AnonymousClass88Y) r2
            X.89W r1 = r2.A04
            X.8qD r0 = X.C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_DESTINATION_QUERY_UPDATED_RECEIVED_WITHOUT_SKIPCACHE
            r1.A00(r0)
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r0 = r2.A01
            r0.A05 = r15
            goto L_0x1060
        L_0x07b8:
            java.lang.Object r0 = r3.A01
            X.88Y r0 = (X.AnonymousClass88Y) r0
            X.89W r1 = r0.A04
            X.8qD r0 = X.C367118qD.CROSSPOSTING_IG_TO_FB_STORIES_DESTINATION_QUERY_ERROR
            r1.A00(r0)
            goto L_0x1060
        L_0x07c5:
            X.831 r15 = (X.AnonymousClass831) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r3.A01
            X.8Hw r0 = (X.C353498Hw) r0
            r0.A0J = r15
            X.C353498Hw.A0p(r0)
            goto L_0x1060
        L_0x07d6:
            X.804 r15 = (X.AnonymousClass804) r15
            if (r15 == 0) goto L_0x1060
            java.lang.Object r4 = r3.A01
            X.8Hw r4 = (X.C353498Hw) r4
            X.88F r3 = r4.A1w
            if (r3 == 0) goto L_0x1060
            X.88E r0 = r4.A1i
            if (r0 == 0) goto L_0x1060
            X.81C r2 = r0.A00
            X.81E r0 = r2.A00()
            if (r0 == 0) goto L_0x1060
            X.88B r0 = r4.A1x
            X.82i r0 = r0.A00
            if (r0 == 0) goto L_0x1060
            X.8JI r1 = r0.A00
            X.8JI r0 = X.AnonymousClass8JI.REMIX
            if (r1 != r0) goto L_0x1060
            X.8va r0 = r3.A03
            if (r0 != 0) goto L_0x084d
            r3.A05 = r15
        L_0x0800:
            X.87i r0 = r3.A0G
            r0.A07()
            X.81E r0 = r2.A00()
            X.Ab8 r0 = (X.C40375Ab8) r0
            r0.A01(r15)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A1n
            X.83H r3 = r0.A0L
            boolean r0 = r15 instanceof X.C365058mS
            if (r0 != 0) goto L_0x084a
            boolean r0 = r15 instanceof X.AnonymousClass803
            r2 = 0
            if (r0 == 0) goto L_0x0832
            X.803 r15 = (X.AnonymousClass803) r15
            X.7kU r0 = r15.A00
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x084a
            r0 = 1
            if (r1 != r0) goto L_0x0851
            X.9sK r1 = X.C391089sK.TOP_AND_BOTTOM
        L_0x082a:
            X.8J0 r0 = r3.A00
            if (r0 == 0) goto L_0x1060
            r0.A02 = r1
            goto L_0x1060
        L_0x0832:
            boolean r0 = r15 instanceof X.C339987kV
            if (r0 == 0) goto L_0x0839
            X.9sK r1 = X.C391089sK.PICTURE_IN_PICTURE
            goto L_0x082a
        L_0x0839:
            boolean r0 = r15 instanceof X.C340007kX
            if (r0 == 0) goto L_0x085d
            X.7kX r15 = (X.C340007kX) r15
            X.7kW r0 = r15.A00
            int r0 = r0.ordinal()
            if (r0 != r2) goto L_0x0857
            X.9sK r1 = X.C391089sK.GREEN_SCREEN
            goto L_0x082a
        L_0x084a:
            X.9sK r1 = X.C391089sK.SIDE_BY_SIDE
            goto L_0x082a
        L_0x084d:
            X.AnonymousClass88F.A03(r3, r15)
            goto L_0x0800
        L_0x0851:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0857:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x085d:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0863:
            if (r31 != 0) goto L_0x086f
            java.lang.String r2 = "ClipsCaptureControllerImpl"
            java.lang.String r1 = "draftEvent is null"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            goto L_0x1060
        L_0x086f:
            java.lang.Object r4 = r3.A01
            X.8Hw r4 = (X.C353498Hw) r4
            boolean r0 = r4.A0h
            if (r0 != 0) goto L_0x1060
            X.9QR r0 = r4.A0E
            if (r0 == 0) goto L_0x1060
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r6 = r4.A1s
            X.2gB r0 = r6.A06
            java.lang.Object r0 = r0.A02()
            X.7zG r0 = (X.C348917zG) r0
            if (r0 == 0) goto L_0x1060
            X.5kq r5 = r0.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x1060
            r4.A0H = r5
            X.JXu r0 = r5.A0G
            int[] r1 = X.C59776JXv.A00
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x0981
            r0 = 2
            if (r1 != r0) goto L_0x08ca
            java.util.List r0 = r5.A0v
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x08ca
            X.C353498Hw.A0x(r4, r5)
            boolean r0 = r4.A1h()
            if (r0 != 0) goto L_0x08c0
            X.0eM r0 = r4.A26
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x08ca
        L_0x08c0:
            android.graphics.Bitmap r0 = r4.A06
            X.8qF r1 = new X.8qF
            r1.<init>(r0)
        L_0x08c7:
            X.C353498Hw.A0O(r1, r4)
        L_0x08ca:
            androidx.fragment.app.FragmentActivity r5 = r4.A15
            boolean r0 = X.C353498Hw.A1c(r4)
            r3 = 1
            if (r0 == 0) goto L_0x08d7
            java.lang.String r0 = r4.A0R
            if (r0 != 0) goto L_0x08e3
        L_0x08d7:
            java.util.List r0 = r4.A0U
            if (r0 == 0) goto L_0x093e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r3) goto L_0x093e
        L_0x08e3:
            X.8cd r6 = r4.A0A
            if (r6 == 0) goto L_0x093e
            X.A3g r2 = r4.A09
            if (r2 == 0) goto L_0x093e
            r0 = 2131955501(0x7f130f2d, float:1.9547531E38)
            java.lang.String r1 = r5.getString(r0)
            X.0qQ.A07(r1)
            X.6ST r0 = new X.6ST
            r0.<init>(r5, r3)
            r2.A00 = r0
            r0.A00(r1)
            X.6ST r0 = r2.A00
            if (r0 == 0) goto L_0x0906
            X.AnonymousClass0fN.A00(r0)
        L_0x0906:
            boolean r2 = X.C353498Hw.A1c(r4)
            java.util.List r1 = r4.A0U
            r0 = 0
            if (r1 == 0) goto L_0x0910
            r0 = 1
        L_0x0910:
            if (r2 == 0) goto L_0x094e
            java.lang.String r9 = r4.A0R
            java.lang.String r10 = r4.A0S
            X.28D r8 = r4.A16
            X.AZm r7 = new X.AZm
            r7.<init>(r4)
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x093e
            r1 = 0
            if (r9 == 0) goto L_0x093e
            int r0 = r9.length()
            if (r0 == 0) goto L_0x093e
            r6.A01 = r1
            X.6oS r2 = X.C318116oQ.A00(r6)
            r11 = 0
            r12 = 2
            X.9Kd r5 = new X.9Kd
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r5, r2)
        L_0x093e:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A1n
            java.lang.String r1 = r4.Ao9()
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.83A r0 = r0.A0A
            X.839 r0 = r0.A01
            r0.A00 = r1
            goto L_0x1060
        L_0x094e:
            if (r0 == 0) goto L_0x093e
            X.AZn r5 = new X.AZn
            r5.<init>(r4)
            if (r1 == 0) goto L_0x097c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0960:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x097d
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.common.session.UserSession r0 = r6.A06
            X.1E8 r0 = X.1E7.A00(r0)
            X.1Xj r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0960
            r3.add(r0)
            goto L_0x0960
        L_0x097c:
            r3 = 0
        L_0x097d:
            r6.A0E(r5, r3)
            goto L_0x093e
        L_0x0981:
            java.util.List r0 = r5.A0v
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x099d
            com.instagram.common.session.UserSession r3 = r4.A1D
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329461909569670(0x81117400004086, double:3.038236226388602E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x099d
            r6.A0C()
            goto L_0x08ca
        L_0x099d:
            X.C353498Hw.A0x(r4, r5)
            X.4ys r0 = r5.A08
            if (r0 == 0) goto L_0x09a8
            X.9mp r1 = X.C387819mp.A00
            goto L_0x08c7
        L_0x09a8:
            r0 = 0
            X.8qE r1 = new X.8qE
            r1.<init>(r0)
            goto L_0x08c7
        L_0x09b0:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r1 = r15.booleanValue()
            java.lang.Object r0 = r3.A01
            X.8Hw r0 = (X.C353498Hw) r0
            r0.A0g = r1
            goto L_0x1060
        L_0x09be:
            X.80y r15 = (X.C3495880y) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r2 = r3.A01
            X.8Hw r2 = (X.C353498Hw) r2
            r2.A0I = r15
            int r0 = X.C353498Hw.A00(r2)
            int r0 = r0 / 1000
            X.C353498Hw.A0v(r2, r0)
            int r1 = r2.A02
            int r0 = r15.A01
            if (r1 <= r0) goto L_0x09da
            r1 = r0
        L_0x09da:
            r2.A02 = r1
            boolean r0 = r2.A0l
            if (r0 == 0) goto L_0x09e3
            X.C353498Hw.A0U(r2)
        L_0x09e3:
            X.C353498Hw.A0y(r2, r15)
            goto L_0x1060
        L_0x09e8:
            java.lang.Number r15 = (java.lang.Number) r15
            int r4 = r15.intValue()
            java.lang.Object r6 = r3.A01
            X.8Hw r6 = (X.C353498Hw) r6
            X.8Yz r1 = r6.A1F
            X.8aL r0 = X.C358088aL.A0y
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 != 0) goto L_0x1060
            X.9QR r0 = r6.A0E
            if (r0 == 0) goto L_0x1060
            r0 = -1
            if (r4 != r0) goto L_0x0a0f
            boolean r0 = X.C353498Hw.A1b(r6)
        L_0x0a0b:
            if (r0 == 0) goto L_0x1060
            goto L_0x0e0c
        L_0x0a0f:
            int r2 = X.C353498Hw.A02(r6)
            float r1 = (float) r4
            X.885 r0 = r6.A1m
            X.886 r0 = r0.A00()
            float r0 = r0.A00
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r2 <= r0) goto L_0x0a21
            r2 = r0
        L_0x0a21:
            boolean r0 = X.C353498Hw.A1Y(r6)
            r0 = r0 ^ 1
            r6.A03 = r2
            goto L_0x0a0b
        L_0x0a2a:
            java.lang.Object r0 = r3.A01
            X.8Hw r0 = (X.C353498Hw) r0
            X.C353498Hw.A0r(r0)
            android.content.Context r1 = r0.A11
            r0 = 2131955480(0x7f130f18, float:1.9547489E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x1060
        L_0x0a3b:
            java.util.List r15 = (java.util.List) r15
            java.lang.String r5 = "Unable to create output file for layout video1"
            r8 = 0
            X.0qQ.A0B(r15, r8)
            java.lang.Object r14 = r3.A01
            X.8Hw r14 = (X.C353498Hw) r14
            X.8Yz r0 = r14.A1F
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0a62
            X.8A2 r2 = r14.A1h
            com.instagram.common.session.UserSession r0 = r14.A1D
            X.27r r0 = X.27p.A01(r0)
            X.283 r0 = r0.A04
            java.lang.String r1 = r0.A0L
            java.lang.String r0 = "video_layout"
            r2.A0L(r1, r0)
        L_0x0a62:
            X.885 r0 = r14.A1m
            X.886 r0 = r0.A00()
            float r1 = r0.A00
            int r0 = X.C353498Hw.A01(r14)
            float r0 = (float) r0
            float r1 = r1 * r0
            double r0 = (double) r1
            double r1 = java.lang.Math.floor(r0)
            int r0 = (int) r1
            long r1 = (long) r0
            java.util.Iterator r6 = r15.iterator()
            r7 = 0
            r9 = r7
        L_0x0a7d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0a96
            java.lang.Object r0 = r6.next()
            X.Rva r0 = (X.C10641Rva) r0
            X.7zv r0 = r0.A02
            com.instagram.camera.effect.models.CameraAREffect r9 = r0.A0P
            int r0 = r0.A07
            long r3 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a7d
            r1 = r3
            goto L_0x0a7d
        L_0x0a96:
            X.2Nn r6 = r14.A20     // Catch:{ IOException | IllegalStateException -> 0x0b6c }
            java.lang.String r4 = r14.Ao9()     // Catch:{ IOException | IllegalStateException -> 0x0b6c }
            java.lang.String r3 = ".mp4"
            java.lang.String r0 = "layout"
            java.io.File r18 = X.C39907AIy.A03(r6, r4, r3, r0)     // Catch:{ IOException | IllegalStateException -> 0x0b6c }
            java.lang.String r0 = r18.getAbsolutePath()
            X.0qQ.A07(r0)
            r14.A0T = r0
            X.C353498Hw.A0m(r14)
            r10 = 1
            X.C353498Hw.A1B(r14, r10)
            X.85M r4 = r14.A1d
            X.9QS r0 = r4.A03
            if (r0 == 0) goto L_0x0ad2
            java.lang.String r3 = "loadingViewsHolder"
            X.3oV r0 = r0.A03
            r0.setVisibility(r8)
            X.9QS r0 = r4.A03
            if (r0 != 0) goto L_0x0acd
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0acd:
            android.view.ViewGroup r0 = r0.A00
            r0.setVisibility(r8)
        L_0x0ad2:
            X.80x r0 = r14.A1v
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r6 = r0.A00()
            java.lang.String r0 = r6.A04
            X.SJA r0 = X.SJA.A00(r0)
            java.lang.String r20 = r18.getAbsolutePath()
            X.0qQ.A07(r20)
            int r13 = r6.A03
            int r12 = r6.A02
            if (r0 == 0) goto L_0x0b69
            int r11 = r0.A03
            int r5 = r0.A02
        L_0x0aef:
            int r4 = r6.A00
            int r3 = r6.A01
            X.RyY r0 = new X.RyY
            r22 = r12
            r23 = r11
            r24 = r5
            r25 = r4
            r26 = r3
            r27 = r1
            r19 = r0
            r21 = r13
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r2 = "multiple_video_merger_thread"
            android.os.HandlerThread r1 = new android.os.HandlerThread
            r1.<init>(r2)
            X.AnonymousClass0fe.A00(r1)
            r1.start()
            android.os.Looper r1 = r1.getLooper()
            X.0qQ.A07(r1)
            X.1NW r3 = new X.1NW
            r3.<init>(r1)
            if (r9 == 0) goto L_0x0b65
            java.lang.String r11 = r9.A0K
            java.lang.String r2 = r9.A0M
            java.lang.String r1 = r9.A0Q
        L_0x0b29:
            X.8Gz r4 = r14.A0C
            if (r4 == 0) goto L_0x1060
            com.instagram.common.session.UserSession r5 = r14.A1D
            X.TWX r13 = new X.TWX
            r22 = r11
            r23 = r10
            r20 = r2
            r21 = r1
            r17 = r6
            r16 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.A01 = r10
            X.05G r1 = r4.A05
            r1.Epw(r7)
            X.9cL r2 = X.C381799cL.A04
            X.0qQ.A0B(r2, r8)
            X.2Fj r1 = r4.A03
            r1.A0A(r2)
            X.S3Z r1 = new X.S3Z
            r1.<init>(r3, r5, r0, r15)
            r4.A00 = r1
            X.THX r1 = new X.THX
            r1.<init>(r4, r13)
            r0 = 366771426(0x15dc7ce2, float:8.905432E-26)
            r3.A01(r0, r1)
            goto L_0x1060
        L_0x0b65:
            r11 = r7
            r2 = r7
            r1 = r7
            goto L_0x0b29
        L_0x0b69:
            r11 = -1
            r5 = -1
            goto L_0x0aef
        L_0x0b6c:
            r2 = move-exception
            X.8A2 r0 = r14.A1h
            r0.A0A(r5)
            android.content.Context r1 = r14.A11
            java.lang.String r0 = "send to @haydenkai unable to create output file for layout video1"
            X.C64169LRs.A01(r1, r2, r0, r8)
            goto L_0x1060
        L_0x0b7b:
            java.lang.Object r3 = r3.A01
            X.8Hw r3 = (X.C353498Hw) r3
            X.9QR r0 = r3.A0E
            if (r0 == 0) goto L_0x1060
            boolean r0 = r3.A0l
            if (r0 == 0) goto L_0x1060
            r0 = 0
            goto L_0x0e4a
        L_0x0b8a:
            X.831 r15 = (X.AnonymousClass831) r15
            r4 = 0
            X.0qQ.A0B(r15, r4)
            java.lang.Object r3 = r3.A01
            X.8Hw r3 = (X.C353498Hw) r3
            r3.A0K = r15
            X.C353498Hw.A0p(r3)
            X.831 r0 = r3.A0K
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0be4
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A1n
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r5 = r0.A0K
            r0.A0E()
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r0)
            int r2 = r0.A00
            X.05G r0 = r5.A0G
            java.lang.Object r6 = r0.getValue()
            java.util.List r6 = (java.util.List) r6
            r13 = 1
            if (r6 == 0) goto L_0x0be4
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0be4
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x0c07
            java.lang.Object r0 = X.00k.A0J(r6)
            X.8fx r0 = (X.C361278fx) r0
            if (r0 == 0) goto L_0x0be4
            java.lang.Object r1 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r1 = (com.instagram.music.common.model.AudioOverlayTrack) r1
            if (r1 == 0) goto L_0x0be4
            int r0 = r1.A01
            if (r0 < r2) goto L_0x0bdb
            r1.A01 = r4
        L_0x0bdb:
            java.lang.Object r0 = X.00k.A0I(r6)
            X.8fx r0 = (X.C361278fx) r0
            r5.A08(r0)
        L_0x0be4:
            X.80U r1 = r3.A1W
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x1060
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r3.A1n
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r1.A0K
            X.05G r0 = r0.A0S
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x1060
            r1.A0Q()
            goto L_0x1060
        L_0x0c07:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r6.iterator()
            r11 = 0
        L_0x0c11:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0c96
            java.lang.Object r0 = r12.next()
            X.8fx r0 = (X.C361278fx) r0
            java.lang.Object r10 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r10 = (com.instagram.music.common.model.AudioOverlayTrack) r10
            if (r10 == 0) goto L_0x0c11
            int r0 = r10.A04
            if (r0 < r2) goto L_0x0c4c
            com.instagram.common.session.UserSession r0 = r5.A08
            boolean r0 = X.AnonymousClass8IK.A00(r0)
            if (r0 == 0) goto L_0x0c4c
            java.lang.String r6 = r10.A0D
            r16 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r13)
            r19 = 7
            X.9Ig r14 = new X.9Ig
            r17 = r16
            r18 = r16
            r14.<init>((java.lang.Boolean) r15, (java.lang.Integer) r16, (java.lang.Integer) r17, (java.lang.Integer) r18, (int) r19)
            X.0eP r0 = new X.0eP
            r0.<init>(r6, r14)
            r1.add(r0)
            r11 = 1
            goto L_0x0c11
        L_0x0c4c:
            int r9 = r2 + -100
            if (r9 >= r4) goto L_0x0c51
            r9 = 0
        L_0x0c51:
            int r8 = r10.A04
            if (r9 <= r8) goto L_0x0c56
            r9 = r8
        L_0x0c56:
            int r7 = r10.A02
            int r7 = r7 + r9
            int r6 = r10.A01
            r0 = r6
            if (r6 != r2) goto L_0x0c8f
            r0 = 0
        L_0x0c5f:
            int r0 = java.lang.Math.min(r7, r0)
            if (r0 != 0) goto L_0x0c8d
            if (r2 <= r7) goto L_0x0c8d
        L_0x0c67:
            if (r9 != r8) goto L_0x0c6b
            if (r7 == r6) goto L_0x0c6c
        L_0x0c6b:
            r11 = 1
        L_0x0c6c:
            java.lang.String r6 = r10.A0D
            int r0 = r10.A03
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
            r15 = 0
            r19 = 8
            X.9Ig r14 = new X.9Ig
            r14.<init>((java.lang.Boolean) r15, (java.lang.Integer) r16, (java.lang.Integer) r17, (java.lang.Integer) r18, (int) r19)
            X.0eP r0 = new X.0eP
            r0.<init>(r6, r14)
            r1.add(r0)
            goto L_0x0c11
        L_0x0c8d:
            r7 = r0
            goto L_0x0c67
        L_0x0c8f:
            if (r6 == 0) goto L_0x0c5f
            int r0 = java.lang.Math.min(r2, r6)
            goto L_0x0c5f
        L_0x0c96:
            if (r11 == 0) goto L_0x0be4
            r5.A0D(r1)
            goto L_0x0be4
        L_0x0c9d:
            java.lang.Object r1 = r3.A01
            X.8Hw r1 = (X.C353498Hw) r1
            boolean r0 = X.C353498Hw.A1Q(r1)
            if (r0 != 0) goto L_0x1060
            boolean r0 = r1.A0e
            r0 = r0 ^ 1
            r1.A0e = r0
            X.C353498Hw.A0V(r1)
            X.C353498Hw.A0W(r1)
            goto L_0x1060
        L_0x0cb5:
            java.lang.Object r0 = r3.A01
            X.8Hw r0 = (X.C353498Hw) r0
            X.C353498Hw.A0f(r0)
            goto L_0x1060
        L_0x0cbe:
            java.lang.Object r0 = r3.A01
            X.8Hw r0 = (X.C353498Hw) r0
            com.instagram.common.session.UserSession r0 = r0.A1D
            X.27r r0 = X.27p.A01(r0)
            X.29Z r4 = r0.A0F
            X.0wc r2 = r4.A01
            java.lang.String r1 = "ig_camera_ui_tool_click"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x1060
            java.lang.String r0 = "logSpeedSelectionButtonTap()"
            boolean r0 = r4.A0Q(r0)
            if (r0 == 0) goto L_0x1060
            X.80P r1 = X.AnonymousClass80P.SPEED_SELECTOR
            java.lang.String r0 = "tool_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_SPEED_SELECTION_BUTTON_TAP"
            java.lang.String r0 = "legacy_falco_event_name"
            r2.AAJ(r0, r1)
            X.283 r3 = r4.A04
            java.lang.String r1 = r3.A0L
            if (r1 != 0) goto L_0x0cf8
            java.lang.String r1 = ""
        L_0x0cf8:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            int r1 = r3.A01
            r0 = 2
            if (r1 == r0) goto L_0x0d03
            r0 = 1
        L_0x0d03:
            java.lang.String r1 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A8k(r1, r0)
            X.8fP r1 = r4.A0I()
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            X.28D r1 = r3.A09
            java.lang.String r0 = "entry_point"
            r2.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A8k(r1, r0)
            X.28t r1 = X.28t.A06
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r2.AAJ(r0, r1)
            X.JVj r1 = r3.A0C
            java.lang.String r0 = "surface"
            r2.A8M(r1, r0)
            X.4yP r1 = r4.A0J()
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            r0 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "capture_format_index"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A0O
            java.lang.String r0 = "discovery_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0P
            java.lang.String r0 = "search_session_id"
            r2.AAJ(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            r2.Cgf()
            goto L_0x1060
        L_0x0d71:
            java.lang.Object r6 = r3.A01
            X.8Hw r6 = (X.C353498Hw) r6
            X.8Yz r2 = r6.A1F
            X.8aL r1 = X.C358088aL.A0J
            r2.A0L(r1)
            X.80m r0 = r2.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0e0c
            r5 = 0
            X.8aL[] r0 = new X.C358088aL[]{r1}
            boolean r0 = r2.A0V(r0)
            if (r0 == 0) goto L_0x0e0c
            X.84j r4 = r6.A1R
            android.content.Context r1 = r6.A11
            r0 = 2131955767(0x7f131037, float:1.954807E38)
            java.lang.String r3 = r1.getString(r0)
            android.widget.ImageView r0 = r4.A04
            if (r0 != 0) goto L_0x0dbc
            android.view.ViewStub r0 = r4.A0C
            android.view.View r2 = r0.inflate()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r4.A04 = r2
            android.view.View r0 = r4.A0A
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165232(0x7f070030, float:1.7944675E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0T(r2, r0)
        L_0x0dbc:
            r1 = 2131886180(0x7f120064, float:1.9406932E38)
            android.view.View r8 = r4.A0A
            android.content.Context r0 = r8.getContext()
            X.61R r2 = X.C303756Aq.A00(r0, r1)
            if (r2 == 0) goto L_0x0e0c
            android.widget.ImageView r0 = r4.A04
            if (r0 == 0) goto L_0x0e0c
            r0.setImageDrawable(r2)
            android.widget.ImageView r0 = r4.A04
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r4.A04
            float r0 = r0.getScaleX()
            float r1 = r4.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0e01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            android.widget.ImageView r7 = r4.A04
            if (r0 == 0) goto L_0x0e18
            X.Ajc r0 = new X.Ajc
            r0.<init>(r4)
            X.0nA.A0p(r7, r0)
        L_0x0df3:
            android.widget.ImageView r1 = r4.A04
            float r0 = r4.A00
            r1.setScaleX(r0)
            android.widget.ImageView r1 = r4.A04
            float r0 = r4.A00
            r1.setScaleY(r0)
        L_0x0e01:
            r2.E2p()
            X.OeX r0 = new X.OeX
            r0.<init>(r4, r2, r3, r5)
            r2.A8s(r0)
        L_0x0e0c:
            X.8JE r1 = r6.A1X
            com.instagram.music.common.model.AudioOverlayTrack r0 = r1.A03
            if (r0 == 0) goto L_0x1060
            r0 = 0
            X.AnonymousClass8JE.A03(r1, r0)
            goto L_0x1060
        L_0x0e18:
            int r1 = r8.getHeight()
            android.widget.ImageView r0 = r4.A04
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            float r1 = (float) r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            r7.setY(r1)
            goto L_0x0df3
        L_0x0e2b:
            java.lang.Object r3 = r3.A01
            X.8Hw r3 = (X.C353498Hw) r3
            X.88B r0 = r3.A1x
            java.io.File r1 = r0.A01
            r2 = 0
            if (r1 == 0) goto L_0x0e4f
            r0 = 3
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A03(r1, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.C353498Hw.A0L(r1, r3, r0, r2)
        L_0x0e40:
            X.8aL r1 = X.C358088aL.A0F
            boolean r0 = X.C353498Hw.A1S(r3)
            X.C353498Hw.A0N(r1, r3, r0)
            r0 = 1
        L_0x0e4a:
            X.C353498Hw.A1B(r3, r0)
            goto L_0x1060
        L_0x0e4f:
            android.content.Context r1 = r3.A11
            r0 = 2131955615(0x7f130f9f, float:1.9547762E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x0e40
        L_0x0e58:
            X.831 r15 = (X.AnonymousClass831) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r2 = r3.A01
            X.8Hw r2 = (X.C353498Hw) r2
            X.80U r1 = r2.A1W
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x1060
            boolean r0 = r2.A0g
            if (r0 != 0) goto L_0x1060
            X.89w r0 = r2.A21
            X.2Fj r2 = r0.A05
            X.89v r0 = r0.A00()
            X.8YO r1 = new X.8YO
            r1.<init>(r0, r15)
            X.88W r0 = new X.88W
            r0.<init>(r1)
            r2.A0B(r0)
            goto L_0x1060
        L_0x0e87:
            X.88C r15 = (X.AnonymousClass88C) r15
            if (r15 == 0) goto L_0x1060
            int r1 = r15.ordinal()
            r5 = 0
            if (r1 == r5) goto L_0x0ed8
            r0 = 1
            r4 = 2
            if (r1 != r0) goto L_0x1060
            java.lang.Object r2 = r3.A01
            X.8Hw r2 = (X.C353498Hw) r2
            X.88B r1 = r2.A1x
            X.82i r0 = r1.A00
            if (r0 == 0) goto L_0x0ecd
            X.8JI r0 = r0.A00
            if (r0 == 0) goto L_0x0ecd
            int r0 = r0.ordinal()
            if (r0 == r5) goto L_0x0ed4
            if (r0 != r4) goto L_0x0ecd
            boolean r0 = r2.A0g
            if (r0 != 0) goto L_0x0ebe
            java.io.File r1 = r1.A01
            if (r1 == 0) goto L_0x0ebe
            r0 = 3
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A03(r1, r0, r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.C353498Hw.A0L(r1, r2, r0, r5)
        L_0x0ebe:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r2.A1n
            X.9sK r1 = X.C391089sK.SEQUENTIAL
            X.83H r0 = r0.A0L
            X.0qQ.A0B(r1, r5)
            X.8J0 r0 = r0.A00
            if (r0 == 0) goto L_0x0ecd
            r0.A02 = r1
        L_0x0ecd:
            X.85M r0 = r2.A1d
            r0.A00()
            goto L_0x1060
        L_0x0ed4:
            X.C353498Hw.A1E(r2, r5)
            goto L_0x0ecd
        L_0x0ed8:
            java.lang.Object r0 = r3.A01
            X.8Hw r0 = (X.C353498Hw) r0
            X.85M r0 = r0.A1d
            r0.A01()
            goto L_0x1060
        L_0x0ee3:
            X.886 r15 = (X.AnonymousClass886) r15
            r5 = 0
            X.0qQ.A0B(r15, r5)
            java.lang.Object r4 = r3.A01
            X.8Hw r4 = (X.C353498Hw) r4
            X.9QR r0 = r4.A0E
            if (r0 == 0) goto L_0x1060
            X.8JE r3 = r4.A1X
            r3.A02 = r15
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A03
            if (r0 == 0) goto L_0x0f0f
            X.7zI r2 = X.AnonymousClass8JE.A01(r3)
            X.886 r0 = r3.A02
            float r0 = r0.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            boolean r0 = r2.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0f34
            X.4MM r0 = r2.A05
            r0.A06(r1)
        L_0x0f0f:
            X.7zI r1 = X.AnonymousClass8JE.A01(r3)
            boolean r0 = r1.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0f2c
            X.4MM r0 = r1.A05
            r0.seekTo(r5)
            X.9QI r0 = r1.A04
            r0.A00()
            r0 = 1
            X.AnonymousClass8JE.A03(r3, r0)
            X.C353498Hw.A0Y(r4)
            goto L_0x1060
        L_0x0f2c:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0f34:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0f3c:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r0 = r15.booleanValue()
            java.lang.Object r13 = r3.A01
            X.8Hw r13 = (X.C353498Hw) r13
            X.JVf r1 = r13.A07
            if (r1 == 0) goto L_0x1060
            if (r0 == 0) goto L_0x1060
            java.lang.Object r0 = r1.A00
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            java.lang.Object r6 = r1.A01
            X.7zv r6 = (X.C349307zv) r6
            r11 = 0
            r13.A07 = r11
            int r0 = r0.A05
            java.lang.String r18 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r6.A0k
            java.io.File r14 = new java.io.File
            r14.<init>(r0)
            int r9 = r6.A07
            int r8 = r6.A0K
            int r5 = r6.A08
            int r4 = r6.A09
            java.lang.String r19 = r6.A06()
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r10)
            int r3 = X.C353498Hw.A02(r13)
            int r0 = r6.A07
            if (r3 <= r0) goto L_0x0f80
            r3 = r0
        L_0x0f80:
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            boolean r2 = r6.A1L
            java.lang.String r1 = r6.A0r
            com.instagram.common.gallery.metadata.MediaUploadMetadata r12 = r6.A02()
            java.util.List r0 = r6.A0w
            int r7 = r6.A0F
            r6 = 54
            if (r7 == r6) goto L_0x0f93
            r6 = 1
        L_0x0f93:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            r28 = 1
            r26 = 0
            r15 = r11
            r24 = r5
            r25 = r4
            r27 = r3
            r29 = r2
            r20 = r1
            r21 = r0
            r22 = r9
            r23 = r8
            X.C353498Hw.A0I(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x1060
        L_0x0fb1:
            java.lang.String r15 = (java.lang.String) r15
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r3.A01
            X.8Hw r0 = (X.C353498Hw) r0
            X.9QR r0 = r0.A0E
            if (r0 == 0) goto L_0x1060
            android.widget.TextView r0 = r0.A04
            if (r0 == 0) goto L_0x1060
            r0.setText(r15)
            goto L_0x1060
        L_0x0fc8:
            java.lang.Object r3 = r3.A01
            X.8cb r3 = (X.C359318cb) r3
            X.80U r1 = r3.A0l
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x1060
            X.80V r0 = X.AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x1060
            if (r31 == 0) goto L_0x1060
            X.0eM r0 = r3.A1B
            java.lang.Object r0 = r0.getValue()
            X.Hrl r0 = (X.C56038Hrl) r0
            r2 = 0
            if (r0 == 0) goto L_0x0ff7
            X.9rn r1 = r0.A00()
        L_0x0fef:
            X.9rn r0 = X.C390759rn.AssetHubCutoutTextSticker
            if (r1 == r0) goto L_0x1060
            X.C359318cb.A0D(r3, r2)
            goto L_0x1060
        L_0x0ff7:
            r1 = r2
            goto L_0x0fef
        L_0x0ff9:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r1 = r15.booleanValue()
            java.lang.Object r0 = r3.A01
            X.8cb r0 = (X.C359318cb) r0
            r0.A0O = r1
            goto L_0x1060
        L_0x1006:
            X.8fx r15 = (X.C361278fx) r15
            r2 = 0
            X.0qQ.A0B(r15, r2)
            int r1 = r15.A00
            r0 = 4
            if (r1 != r0) goto L_0x1060
            java.lang.Object r1 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r1 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r1
            X.WMw r0 = r1.A0C
            if (r0 == 0) goto L_0x1060
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A08(r1)
            r0 = 1
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0G(r1, r2, r0)
            android.content.Context r3 = r1.A0W
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r0 = 936(0x3a8, float:1.312E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2131955553(0x7f130f61, float:1.9547637E38)
            X.C64169LRs.A02(r3, r2, r1, r0)
            goto L_0x1060
        L_0x1031:
            X.8YK r0 = X.AnonymousClass8YK.EMPTY_TIMELINE
            if (r15 == r0) goto L_0x1063
            X.8YK r0 = X.AnonymousClass8YK.LANDING_PAGE
            if (r15 == r0) goto L_0x1063
            X.8YK r0 = X.AnonymousClass8YK.GALLERY
            if (r15 == r0) goto L_0x104d
            if (r31 != 0) goto L_0x1060
            java.lang.Object r0 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r0
            X.87s r0 = r0.A0m
            X.4gw r1 = r0.A04
            r0 = 0
            if (r1 == 0) goto L_0x104b
            r0 = 1
        L_0x104b:
            if (r0 == 0) goto L_0x1060
        L_0x104d:
            java.lang.Object r2 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r2 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r2
            X.WMw r1 = r2.A0C
            if (r1 == 0) goto L_0x1059
            r0 = 0
            r1.A05(r0)
        L_0x1059:
            X.WMw r0 = r2.A0C
            if (r0 == 0) goto L_0x1060
            r0.A01()
        L_0x1060:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x1063:
            java.lang.Object r0 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r0
            X.9rv r1 = X.C390839rv.PRE_CAPTURE
            r2 = 0
            r7 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r4 = r3
            r5 = r2
            r6 = r2
            r8 = r7
            r0.A0J(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x1060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377149Ks.invoke(java.lang.Object):java.lang.Object");
    }
}
