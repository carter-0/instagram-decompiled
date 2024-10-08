package X;

/* renamed from: X.9LS  reason: invalid class name */
public final class AnonymousClass9LS extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LS(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.6jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.6iO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.6jl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.6hr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.6iM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.6jn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: X.6jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: X.6jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: X.6jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: X.6jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: X.6jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: X.6jr} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
        return java.lang.Integer.valueOf(r1.getDimensionPixelSize(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0147, code lost:
        return r1.requireViewById(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e4, code lost:
        return java.lang.Boolean.valueOf(X.182.A06(r2, r3, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x027e, code lost:
        return r2.A04(r1, r3.getClass());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x02dd;
                case 1: goto L_0x02be;
                case 2: goto L_0x02b2;
                case 3: goto L_0x02a6;
                case 4: goto L_0x027f;
                case 5: goto L_0x026a;
                case 6: goto L_0x025d;
                case 7: goto L_0x0250;
                case 8: goto L_0x0244;
                case 9: goto L_0x022f;
                case 10: goto L_0x021a;
                case 11: goto L_0x020b;
                case 12: goto L_0x01fc;
                case 13: goto L_0x01f1;
                case 14: goto L_0x01e5;
                case 15: goto L_0x01cf;
                case 16: goto L_0x01c1;
                case 17: goto L_0x01b3;
                case 18: goto L_0x01a5;
                case 19: goto L_0x0197;
                case 20: goto L_0x0189;
                case 21: goto L_0x017b;
                case 22: goto L_0x016d;
                case 23: goto L_0x02ef;
                case 24: goto L_0x0164;
                case 25: goto L_0x0005;
                case 26: goto L_0x02ef;
                case 27: goto L_0x0164;
                case 28: goto L_0x0005;
                case 29: goto L_0x0156;
                case 30: goto L_0x0148;
                case 31: goto L_0x0136;
                case 32: goto L_0x0128;
                case 33: goto L_0x0116;
                case 34: goto L_0x0108;
                case 35: goto L_0x00fa;
                case 36: goto L_0x00ec;
                case 37: goto L_0x00da;
                case 38: goto L_0x00cc;
                case 39: goto L_0x00be;
                case 40: goto L_0x00a8;
                case 41: goto L_0x009a;
                case 42: goto L_0x008c;
                case 43: goto L_0x007e;
                case 44: goto L_0x006f;
                case 45: goto L_0x0065;
                case 46: goto L_0x0059;
                case 47: goto L_0x002e;
                case 48: goto L_0x0024;
                case 49: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r4 = r0.getViewModelStore()
            return r4
        L_0x0014:
            java.lang.Object r0 = r10.A01
            X.6mP r0 = (X.C316906mP) r0
            android.view.ViewStub r0 = r0.A03
            android.view.View r4 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r4, r0)
            return r4
        L_0x0024:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3PP r4 = new X.3PP
            r4.<init>(r0)
            return r4
        L_0x002e:
            X.3PY r0 = X.AnonymousClass3PX.A02
            java.lang.Object r5 = r10.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.0Tu r2 = X.0Tu.A05
            r0 = 36592103454998811(0x8200530005011b, double:3.204331797290607E-306)
            long r0 = X.182.A01(r2, r5, r0)
            int r6 = (int) r0
            r0 = 36592103455064348(0x8200530006011c, double:3.204331797332053E-306)
            long r8 = X.182.A01(r2, r5, r0)
            r0 = 36592103454736665(0x82005300010119, double:3.204331797124825E-306)
            long r0 = X.182.A01(r2, r5, r0)
            int r7 = (int) r0
            X.3PX r4 = new X.3PX
            r4.<init>(r5, r6, r7, r8)
            return r4
        L_0x0059:
            java.lang.Object r1 = r10.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = r1.A06
            X.2LK r4 = new X.2LK
            r4.<init>(r1, r0)
            return r4
        L_0x0065:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2kn r4 = new X.2kn
            r4.<init>(r0)
            return r4
        L_0x006f:
            java.lang.Object r0 = r10.A01
            X.6mB r0 = (X.C316766mB) r0
            android.content.Context r0 = r0.A0H
            int r0 = X.AnonymousClass0nB.A01(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x007e:
            java.lang.Object r0 = r10.A01
            X.6mB r0 = (X.C316766mB) r0
            android.content.Context r0 = r0.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            goto L_0x00b5
        L_0x008c:
            java.lang.Object r0 = r10.A01
            X.6mB r0 = (X.C316766mB) r0
            android.content.Context r0 = r0.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            goto L_0x00b5
        L_0x009a:
            java.lang.Object r0 = r10.A01
            X.6mB r0 = (X.C316766mB) r0
            android.content.Context r0 = r0.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            goto L_0x00b5
        L_0x00a8:
            java.lang.Object r0 = r10.A01
            X.6mB r0 = (X.C316766mB) r0
            android.content.Context r0 = r0.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
        L_0x00b5:
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x00be:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439461(0x7f0b2f65, float:1.8500878E38)
            goto L_0x0143
        L_0x00cc:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439455(0x7f0b2f5f, float:1.8500866E38)
            goto L_0x0143
        L_0x00da:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439454(0x7f0b2f5e, float:1.8500864E38)
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x00ec:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439453(0x7f0b2f5d, float:1.8500862E38)
            goto L_0x0143
        L_0x00fa:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439458(0x7f0b2f62, float:1.8500872E38)
            goto L_0x0143
        L_0x0108:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439460(0x7f0b2f64, float:1.8500876E38)
            goto L_0x0143
        L_0x0116:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439452(0x7f0b2f5c, float:1.850086E38)
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x0128:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439451(0x7f0b2f5b, float:1.8500858E38)
            goto L_0x0143
        L_0x0136:
            java.lang.Object r0 = r10.A01
            X.6mY r0 = (X.C316996mY) r0
            X.3oV r0 = r0.A02
            android.view.View r1 = r0.getView()
            r0 = 2131439449(0x7f0b2f59, float:1.8500853E38)
        L_0x0143:
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x0148:
            java.lang.Object r3 = r10.A01
            X.6jn r3 = (X.C315376jn) r3
            com.instagram.common.session.UserSession r0 = r3.A03
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A38
            goto L_0x0276
        L_0x0156:
            java.lang.Object r3 = r10.A01
            X.6iM r3 = (X.C314496iM) r3
            com.instagram.common.session.UserSession r0 = r3.A04
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A37
            goto L_0x0276
        L_0x0164:
            java.lang.Object r0 = r10.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x016d:
            java.lang.Object r3 = r10.A01
            X.6hr r3 = (X.C314226hr) r3
            com.instagram.common.session.UserSession r0 = r3.A0F
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A35
            goto L_0x0276
        L_0x017b:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r3 = r0.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            goto L_0x01dc
        L_0x0189:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r3 = r0.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320764600787792(0x81098b00002350, double:3.032736013293691E-306)
            goto L_0x01dc
        L_0x0197:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r3 = r0.A0F
            X.0Tu r2 = X.0Tu.A06
            r0 = 36318290699819081(0x81074b00031849, double:3.0311715083594784E-306)
            goto L_0x01dc
        L_0x01a5:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r3 = r0.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318496858052757(0x81077b00001895, double:3.0313018836565877E-306)
            goto L_0x01dc
        L_0x01b3:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r3 = r0.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322465407838403(0x810b17000028c3, double:3.0338116105210975E-306)
            goto L_0x01dc
        L_0x01c1:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r3 = r0.A0F
            X.0Tu r2 = X.0Tu.A06
            r0 = 36314927740357534(0x81043c00020b9e, double:3.029044759254445E-306)
            goto L_0x01dc
        L_0x01cf:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r3 = r0.A0F
            X.0Tu r2 = X.0Tu.A06
            r0 = 36318290699688008(0x81074b00011848, double:3.031171508276587E-306)
        L_0x01dc:
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x01e5:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r0 = r0.A0F
            X.KBR r4 = new X.KBR
            r4.<init>(r0)
            return r4
        L_0x01f1:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r0 = r0.A0F
            com.instagram.avatars.store.AvatarStore r4 = X.25x.A00(r0)
            return r4
        L_0x01fc:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r2 = r0.A0F
            r1 = 0
            r0 = 126(0x7e, float:1.77E-43)
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r4 = new com.instagram.stickersearch.AvatarStickerPreRenderInteractor
            r4.<init>(r1, r2, r0)
            return r4
        L_0x020b:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r2 = r0.A0F
            r1 = 0
            r0 = 30
            com.instagram.stickersearch.AvatarStickerInteractor r4 = new com.instagram.stickersearch.AvatarStickerInteractor
            r4.<init>(r1, r2, r0)
            return r4
        L_0x021a:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            X.3oV r0 = r0.A0H
            android.view.View r1 = r0.getView()
            r0 = 2131439390(0x7f0b2f1e, float:1.8500734E38)
            android.view.View r4 = r1.requireViewById(r0)
            X.0qQ.A07(r4)
            return r4
        L_0x022f:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            X.3oV r0 = r0.A0H
            android.view.View r1 = r0.getView()
            r0 = 2131439389(0x7f0b2f1d, float:1.8500732E38)
            android.view.View r4 = r1.requireViewById(r0)
            X.0qQ.A07(r4)
            return r4
        L_0x0244:
            java.lang.Object r0 = r10.A01
            X.6hr r0 = (X.C314226hr) r0
            com.instagram.common.session.UserSession r0 = r0.A0F
            X.6iw r4 = new X.6iw
            r4.<init>(r0)
            return r4
        L_0x0250:
            java.lang.Object r3 = r10.A01
            X.6jl r3 = (X.C315356jl) r3
            com.instagram.common.session.UserSession r0 = r3.A03
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A2B
            goto L_0x0276
        L_0x025d:
            java.lang.Object r3 = r10.A01
            X.6iO r3 = (X.C314516iO) r3
            com.instagram.common.session.UserSession r0 = r3.A01
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A31
            goto L_0x0276
        L_0x026a:
            java.lang.Object r3 = r10.A01
            X.6jr r3 = (X.C315416jr) r3
            com.instagram.common.session.UserSession r0 = r3.A03
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A1e
        L_0x0276:
            java.lang.Class r0 = r3.getClass()
            X.0xa r4 = r2.A04(r1, r0)
            return r4
        L_0x027f:
            java.lang.Object r0 = r10.A01
            X.6iG r0 = (X.C314436iG) r0
            android.content.Context r1 = r0.A0W
            r0 = 2131237415(0x7f081a27, float:1.809108E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            if (r4 == 0) goto L_0x029e
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 0
            r4.setBounds(r0, r0, r1, r1)
            return r4
        L_0x029e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02a6:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x02b2:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131433944(0x7f0b19d8, float:1.8489688E38)
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x02be:
            java.lang.Object r4 = r10.A01
            X.6iS r4 = (X.C314556iS) r4
            X.0eM r0 = r4.A0B
            java.lang.Object r3 = r0.getValue()
            X.4Cq r3 = (X.C262224Cq) r3
            r0 = 13
            X.MIX r2 = new X.MIX
            r2.<init>(r4, r0)
            r1 = 5
            X.MIp r0 = new X.MIp
            r0.<init>(r4, r1)
            X.6Ym r4 = new X.6Ym
            r4.<init>(r2, r0, r3)
            return r4
        L_0x02dd:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.Object r0 = r10.A01
            X.6kx r0 = (X.C316006kx) r0
            X.3oV r0 = r0.A0z
            android.view.View r0 = r0.getView()
            X.9Yo r4 = new X.9Yo
            r4.<init>(r0)
            return r4
        L_0x02ef:
            java.lang.Object r4 = r10.A01
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9LS.invoke():java.lang.Object");
    }
}
