package X;

import android.view.View;

/* renamed from: X.IBl  reason: case insensitive filesystem */
public final class C56762IBl implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C56762IBl(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x003d: MOVE  (r1v8 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v7 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x00b8;
                case 2: goto L_0x007a;
                case 3: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -1164659412(0xffffffffba94b52c, float:-0.0011345497)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r10.A02
            X.GBN r3 = (X.GBN) r3
            com.instagram.common.session.UserSession r1 = r3.A00
            java.lang.Object r0 = r10.A01
            java.lang.String r0 = X.C51966G9m.A1E(r0)
            if (r0 == 0) goto L_0x010e
            X.E0c r2 = X.C49190Eqv.A00(r1, r0)
            X.Hrp r1 = r3.A02
            java.lang.String r0 = r10.A03
            r1.A01(r2, r0)
            r0 = 1887128400(0x707b4b50, float:3.1108714E29)
        L_0x0028:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x002c:
            r0 = 515558907(0x1ebacdfb, float:1.9778708E-20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r10.A02
            X.H03 r9 = (X.H03) r9
            androidx.fragment.app.Fragment r1 = r9.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0076
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0076
            X.7Pu r8 = r1.A02
            if (r8 == 0) goto L_0x0076
            java.lang.Object r7 = r10.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r6 = r10.A03
            X.0eM r5 = r9.A06
            X.Dg1 r3 = X.C46498Dg1.A00(r7, r5)
            r2 = 2131955263(0x7f130e3f, float:1.9547049E38)
            r1 = 2
            X.IBl r0 = new X.IBl
            r0.<init>(r7, r9, r6, r1)
            r3.A04(r0, r2)
            r2 = 2131972217(0x7f135079, float:1.9581435E38)
            r1 = 44
            X.FP7 r0 = new X.FP7
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r7)
            r3.A02(r0, r2)
            X.FFy r1 = new X.FFy
            r1.<init>(r3, r8)
            X.7Pr r0 = X.DbX.A0f(r5)
            r1.A06(r0)
        L_0x0076:
            r0 = 1123455439(0x42f691cf, float:123.28478)
            goto L_0x0028
        L_0x007a:
            r0 = 67625995(0x407e40b, float:1.5973886E-36)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r10.A02
            X.H03 r7 = (X.H03) r7
            java.lang.String r6 = r10.A03
            X.0eM r1 = r7.A07
            java.lang.Object r0 = r1.getValue()
            X.GIY r0 = (X.GIY) r0
            X.0Ud r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            int r0 = X.DbS.A05(r0)
            r5 = 1
            if (r0 == r5) goto L_0x009d
            r5 = 0
        L_0x009d:
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            if (r3 == 0) goto L_0x00b3
            java.lang.Object r2 = r1.getValue()
            X.GIY r2 = (X.GIY) r2
            r1 = 32
            X.Iw3 r0 = new X.Iw3
            r0.<init>(r6, r7, r1)
            X.C55254Hej.A00(r3, r2, r6, r0, r5)
        L_0x00b3:
            r0 = -1639360937(0xffffffff9e495657, float:-1.0658706E-20)
            goto L_0x0028
        L_0x00b8:
            r0 = -2018826039(0xffffffff87ab28c9, float:-2.5753192E-34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r10.A01
            X.Ge9 r3 = (X.C52875Ge9) r3
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x00e4
            java.lang.Object r2 = r10.A02
            X.H03 r2 = (X.H03) r2
            X.Ge9 r1 = r2.A00
            if (r1 == 0) goto L_0x00d3
            r0 = 0
            r1.setIsPlaying(r0)
        L_0x00d3:
            r0 = 1
            r3.setIsPlaying(r0)
            r2.A00 = r3
            java.lang.String r1 = r10.A03
            r2.A03 = r1
            X.JOl r0 = r2.A01
            if (r0 == 0) goto L_0x00e4
            r0.Cwh(r1)
        L_0x00e4:
            r0 = 1293995683(0x4d20cea3, float:1.68618544E8)
            goto L_0x0028
        L_0x00e9:
            r0 = 914033874(0x367b0cd2, float:3.7409377E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r10.A01
            X.0sL r3 = (X.0sL) r3
            r2 = 1
            if (r3 == 0) goto L_0x0100
            java.lang.String r1 = r10.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.invoke(r1, r0)
        L_0x0100:
            java.lang.Object r1 = r10.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.String r0 = r10.A03
            X.C56242Hv9.A01(r1, r0, r2)
            r0 = 37392563(0x23a90b3, float:1.3706648E-37)
            goto L_0x0028
        L_0x010e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -932326304(0xffffffffc86dd460, float:-243537.5)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56762IBl.onClick(android.view.View):void");
    }
}
