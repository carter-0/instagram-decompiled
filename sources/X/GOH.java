package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

public final class GOH extends C267894cP implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GOH(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A03 = 0;
        this.A02 = androidEdgeEffectOverscrollEffect;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.GOH, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.GOH, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        0sP r2;
        int i;
        switch (this.A03) {
            case 0:
                ? goh = new GOH((AndroidEdgeEffectOverscrollEffect) this.A02, r5);
                goh.A01 = obj;
                return goh;
            case 1:
                r2 = (0sP) this.A01;
                i = 1;
                break;
            case 2:
                r2 = (0sP) this.A01;
                i = 2;
                break;
            default:
                r2 = (0sP) this.A01;
                i = 3;
                break;
        }
        ? goh2 = new GOH(r5, r2, i);
        goh2.A02 = obj;
        return goh2;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.GOH, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0137 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d0 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A03
            X.1Hj r6 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x002d;
                case 2: goto L_0x0144;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r0 = r14.A00
            r4 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 != r4) goto L_0x0138
            X.0eS.A00(r15)
        L_0x0011:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0014:
            X.0eS.A00(r15)
            java.lang.Object r3 = r14.A02
            X.6GK r3 = (X.AnonymousClass6GK) r3
            java.lang.Object r2 = r14.A01
            r1 = 19
            X.J6h r0 = new X.J6h
            r0.<init>(r2, r1)
            r14.A00 = r4
            java.lang.Object r0 = com.instagram.barcelona.common.ui.feed.FeedCarouselPinchModifierKt.A00(r3, r14, r0)
            if (r0 != r6) goto L_0x0011
            return r6
        L_0x002d:
            int r1 = r14.A00
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r0) goto L_0x0052
            X.0eS.A00(r15)
        L_0x0038:
            X.GPU r15 = (X.GPU) r15
            if (r15 == 0) goto L_0x0011
            r15.A01()
            goto L_0x0011
        L_0x0040:
            X.0eS.A00(r15)
            java.lang.Object r4 = r14.A02
            X.6GK r4 = (X.AnonymousClass6GK) r4
            r14.A02 = r4
            r14.A00 = r0
            java.lang.Object r15 = androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.A00(r4, r14)
            if (r15 != r6) goto L_0x0059
            return r6
        L_0x0052:
            java.lang.Object r4 = r14.A02
            X.6GK r4 = (X.AnonymousClass6GK) r4
            X.0eS.A00(r15)
        L_0x0059:
            X.GPU r15 = (X.GPU) r15
            r15.A01()
            java.lang.Object r3 = r14.A01
            X.0sP r3 = (X.0sP) r3
            long r1 = r15.A06
            X.5dM r0 = new X.5dM
            r0.<init>(r1)
            r3.invoke(r0)
            r0 = 0
            r14.A02 = r0
            r14.A00 = r5
            X.GWN r0 = X.GWN.Main
            java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r4, r0, r14)
            if (r15 != r6) goto L_0x0038
            return r6
        L_0x007a:
            int r1 = r14.A00
            r7 = 2
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r2 = r14.A01
            X.6GK r2 = (X.AnonymousClass6GK) r2
            if (r1 == r0) goto L_0x0110
            X.0eS.A00(r15)
        L_0x008a:
            X.6Ft r15 = (X.C304926Ft) r15
            java.util.List r8 = r15.A03
            int r0 = r8.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            int r4 = r8.size()
            r13 = 0
            r3 = 0
        L_0x009d:
            if (r3 >= r4) goto L_0x00b0
            java.lang.Object r1 = r8.get(r3)
            r0 = r1
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x00ad
            r9.add(r1)
        L_0x00ad:
            int r3 = r3 + 1
            goto L_0x009d
        L_0x00b0:
            java.lang.Object r8 = r14.A02
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r8 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r8
            int r12 = r9.size()
        L_0x00b8:
            if (r13 >= r12) goto L_0x00d0
            java.lang.Object r10 = r9.get(r13)
            r0 = r10
            X.GPU r0 = (X.GPU) r0
            long r3 = r0.A05
            X.GQM r0 = r8.A01
            if (r0 == 0) goto L_0x00cd
            long r0 = r0.A00
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x00d1
        L_0x00cd:
            int r13 = r13 + 1
            goto L_0x00b8
        L_0x00d0:
            r10 = r5
        L_0x00d1:
            X.GPU r10 = (X.GPU) r10
            if (r10 != 0) goto L_0x00dd
            java.lang.Object r10 = X.00k.A0J(r9)
            X.GPU r10 = (X.GPU) r10
            if (r10 == 0) goto L_0x00ef
        L_0x00dd:
            long r0 = r10.A05
            X.GQM r3 = new X.GQM
            r3.<init>(r0)
            r8.A01 = r3
            long r0 = r10.A06
            X.5dM r3 = new X.5dM
            r3.<init>(r0)
            r8.A00 = r3
        L_0x00ef:
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x012b
            r8.A01 = r5
            goto L_0x0011
        L_0x00fb:
            X.0eS.A00(r15)
            java.lang.Object r2 = r14.A01
            X.6GK r2 = (X.AnonymousClass6GK) r2
            r14.A01 = r2
            r14.A00 = r0
            r1 = 0
            X.GWN r0 = X.GWN.Main
            java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r2, r0, r14, r1)
            if (r15 != r6) goto L_0x0113
            return r6
        L_0x0110:
            X.0eS.A00(r15)
        L_0x0113:
            X.GPU r15 = (X.GPU) r15
            java.lang.Object r4 = r14.A02
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r4 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r4
            long r0 = r15.A05
            X.GQM r3 = new X.GQM
            r3.<init>(r0)
            r4.A01 = r3
            long r0 = r15.A06
            X.5dM r3 = new X.5dM
            r3.<init>(r0)
            r4.A00 = r3
        L_0x012b:
            r14.A01 = r2
            r14.A00 = r7
            X.GWN r0 = X.GWN.Main
            java.lang.Object r15 = r2.AD0(r0, r14)
            if (r15 != r6) goto L_0x008a
            return r6
        L_0x0138:
            r0 = 1152(0x480, float:1.614E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0144:
            int r0 = r14.A00
            r3 = 1
            if (r0 == 0) goto L_0x0172
            if (r0 != r3) goto L_0x017a
            java.lang.Object r2 = r14.A02
            X.6GK r2 = (X.AnonymousClass6GK) r2
            X.0eS.A00(r15)
        L_0x0152:
            X.6Ft r15 = (X.C304926Ft) r15
            java.lang.Object r1 = r14.A01
            X.0sP r1 = (X.0sP) r1
            boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A03(r15)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
        L_0x0165:
            X.GWN r0 = X.GWN.Initial
            r14.A02 = r2
            r14.A00 = r3
            java.lang.Object r15 = r2.AD0(r0, r14)
            if (r15 != r6) goto L_0x0152
            return r6
        L_0x0172:
            X.0eS.A00(r15)
            java.lang.Object r2 = r14.A02
            X.6GK r2 = (X.AnonymousClass6GK) r2
            goto L_0x0165
        L_0x017a:
            r0 = 1152(0x480, float:1.614E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GOH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GOH) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GOH(AnonymousClass4D7 r2, 0sP r3, int i) {
        super(2, r2);
        this.A03 = i;
        this.A01 = r3;
    }
}
