package X;

/* renamed from: X.Ivn  reason: case insensitive filesystem */
public final class C58678Ivn extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58678Ivn(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C58678Ivn A00(C286575Wy r1, Object obj, int i) {
        C58678Ivn ivn = new C58678Ivn(obj, i);
        r1.FLL(ivn);
        return ivn;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0061: MOVE  (r1v19 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v18 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x000d;
                case 5: goto L_0x0085;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x00c9;
                case 10: goto L_0x00e0;
                case 11: goto L_0x00e7;
                case 12: goto L_0x0013;
                case 13: goto L_0x003f;
                case 14: goto L_0x0005;
                case 15: goto L_0x0085;
                case 16: goto L_0x00ee;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x00f3;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x008f;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x00fa;
                case 31: goto L_0x0104;
                case 32: goto L_0x0110;
                case 33: goto L_0x011a;
                case 34: goto L_0x0123;
                case 35: goto L_0x0134;
                case 36: goto L_0x0148;
                case 37: goto L_0x014f;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x011a;
                case 41: goto L_0x011a;
                case 42: goto L_0x011a;
                case 43: goto L_0x0005;
                case 44: goto L_0x00b7;
                case 45: goto L_0x0163;
                case 46: goto L_0x011a;
                case 47: goto L_0x011a;
                case 48: goto L_0x011a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.DbS.A1U(r0)
        L_0x000a:
            X.0gF r3 = X.C60340gF.A00
        L_0x000c:
            return r3
        L_0x000d:
            java.lang.Object r1 = r10.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            goto L_0x008a
        L_0x0013:
            X.LNN r2 = X.LNN.A00
            java.lang.Object r1 = r10.A01
            X.H1n r1 = (X.C54168H1n) r1
            X.0eM r0 = r1.A04
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.28D r4 = X.28D.A4g
            X.8hK r0 = r1.A01
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "tool"
            goto L_0x004f
        L_0x002c:
            com.instagram.api.schemas.CameraTool r5 = r0.A05
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = r1.A00
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "genAIToolInfo"
            goto L_0x004f
        L_0x0035:
            java.lang.String r8 = r0.Aqe()
            r7 = 0
            r9 = r7
            r2.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x000a
        L_0x003f:
            java.lang.Object r5 = r10.A01
            X.H1n r5 = (X.C54168H1n) r5
            X.0eM r2 = r5.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = r5.A02
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "mediaId"
        L_0x004f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0057:
            X.H1m r4 = X.C54909HXr.A00(r1, r0)
            androidx.fragment.app.Fragment r1 = r5.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x000a
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x000a
            X.7Pu r3 = r1.A02
            if (r3 == 0) goto L_0x000a
            X.7Pr r2 = X.DbX.A0f(r2)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131956901(0x7f1314a5, float:1.955037E38)
            X.DbZ.A0z(r1, r2, r0)
            r0 = 7
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r4, r0)
            r2.A0T = r4
            r3.A0F(r4, r2)
            goto L_0x000a
        L_0x0085:
            java.lang.Object r1 = r10.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 0
        L_0x008a:
            X.C51967G9n.A16(r1, r0)
            goto L_0x000a
        L_0x008f:
            java.lang.Object r0 = r10.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.6Gl r0 = r0.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            java.util.List r0 = r0.A0D
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.next()
            X.6JM r0 = (X.AnonymousClass6JM) r0
            X.6JK r0 = (X.AnonymousClass6JK) r0
            int r0 = r0.A07
            X.AnonymousClass7TF.A1M(r3, r0)
            goto L_0x00a3
        L_0x00b7:
            java.lang.Object r1 = r10.A01
            X.Gg9 r1 = (X.C52956Gg9) r1
            X.4Co r0 = r1.A00
            X.C51970G9q.A1S(r0)
            X.05G r1 = r1.A01
            X.H99 r0 = X.H99.A00
            r1.Epw(r0)
            goto L_0x000a
        L_0x00c9:
            java.lang.Object r3 = r10.A01
            return r3
        L_0x00cc:
            java.lang.Object r2 = r10.A01
            X.H0n r2 = (X.C54143H0n) r2
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.app.Application r0 = X.DbY.A05(r2)
            X.KCe r3 = new X.KCe
            r3.<init>(r0, r1)
            return r3
        L_0x00e0:
            java.lang.Object r0 = r10.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x00e7:
            java.lang.Object r0 = r10.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x00ee:
            java.lang.Object r1 = r10.A01
            X.HLB r0 = X.HLB.FEEDBACK
            goto L_0x00f7
        L_0x00f3:
            java.lang.Object r1 = r10.A01
            X.HLB r0 = X.HLB.EDIT_PROMPT
        L_0x00f7:
            if (r1 != r0) goto L_0x0177
            goto L_0x0171
        L_0x00fa:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hzh r3 = new X.Hzh
            r3.<init>(r0)
            return r3
        L_0x0104:
            java.lang.Object r1 = r10.A01
            X.MTt r1 = (X.C66490MTt) r1
            X.12T r0 = X.AnonymousClass12T.A00
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r3 = new com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource
            r3.<init>(r0, r1)
            return r3
        L_0x0110:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HDl r3 = new X.HDl
            r3.<init>(r0)
            return r3
        L_0x011a:
            java.lang.Object r0 = r10.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r3 = r0.A00()
            return r3
        L_0x0123:
            java.lang.Object r2 = r10.A01
            X.0lg r2 = (X.0lg) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Class<X.HDW> r1 = X.HDW.class
            X.IqX r0 = X.C58352IqX.A00
            java.lang.Object r3 = r2.A01(r1, r0)
            return r3
        L_0x0134:
            java.lang.Object r0 = r10.A01
            X.H11 r0 = (X.H11) r0
            android.app.Application r1 = X.DbY.A05(r0)
            X.0eM r0 = r0.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.8Am r3 = new X.8Am
            r3.<init>(r1, r0)
            return r3
        L_0x0148:
            java.lang.Object r0 = r10.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
            return r3
        L_0x014f:
            java.lang.Object r3 = r10.A01
            X.I4e r3 = (X.C56605I4e) r3
            X.GnY r0 = r3.A00
            java.lang.String r2 = r0.A03
            java.lang.Object r1 = r0.A01
            X.8hK r1 = (X.C362088hK) r1
            com.instagram.common.session.UserSession r0 = r3.A01
            X.Hn7 r3 = new X.Hn7
            r3.<init>(r0, r1, r2)
            return r3
        L_0x0163:
            java.lang.Object r0 = r10.A01
            X.5Tl r0 = (X.C285975Tl) r0
            X.5Tq r0 = r0.A01
            java.lang.String r0 = r0.A00
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0177
        L_0x0171:
            r0 = 1
        L_0x0172:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0177:
            r0 = 0
            goto L_0x0172
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58678Ivn.invoke():java.lang.Object");
    }
}
