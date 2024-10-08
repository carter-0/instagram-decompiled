package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.JdL  reason: case insensitive filesystem */
public final class C60012JdL extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60012JdL(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00c5: MOVE  (r1v17 X.2t9) = (r1v16 X.2t9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void handleMessage(android.os.Message r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01b1;
                case 2: goto L_0x019d;
                case 3: goto L_0x0170;
                case 4: goto L_0x013f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r12 = 0
            X.0qQ.A0B(r15, r12)
            int r0 = r15.what
            if (r0 != 0) goto L_0x00ac
            java.lang.Object r2 = r14.A01
            X.LS8 r2 = (X.LS8) r2
            X.Ttm r3 = r2.A03
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0135
            androidx.fragment.app.Fragment r0 = r2.A02
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x0135
            java.util.Map r0 = r2.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ac
            X.LS8.A01(r2)
            java.util.List r0 = r2.A05
            java.util.Iterator r11 = r0.iterator()
        L_0x0032:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r11)
            java.lang.Object r4 = r0.getKey()
            X.L9E r4 = (X.L9E) r4
            java.lang.Object r0 = r0.getValue()
            X.L8J r0 = (X.L8J) r0
            float r1 = r0.A00
            r0 = 1048576000(0x3e800000, float:0.25)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
            X.L4o r6 = r2.A04
            X.0qQ.A0B(r4, r12)
            java.lang.String r5 = r4.A02
            java.lang.String r7 = "header_media_section"
            boolean r0 = X.0qQ.A0K(r5, r7)
            if (r0 == 0) goto L_0x00b0
            X.X7p r9 = r6.A01
        L_0x0061:
            if (r9 == 0) goto L_0x0032
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0032
            X.1Xj r10 = r4.A01
            r11 = -1
            boolean r0 = r5.equals(r7)
            if (r0 != 0) goto L_0x0083
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            r1 = 0
            if (r0 == 0) goto L_0x0077
            X.2Rw r1 = r0.A0A
        L_0x0077:
            boolean r0 = r1 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0083
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            if (r1 == 0) goto L_0x0083
            int r11 = r1.A02(r5)
        L_0x0083:
            r8 = 0
            r13 = 1
            X.0qQ.A0B(r10, r13)
            X.TuM r7 = new X.TuM
            r7.<init>(r8, r9, r10, r11, r12, r13)
            boolean r0 = r4 instanceof X.KUU
            if (r0 == 0) goto L_0x00ad
            X.KUU r4 = (X.KUU) r4
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x00ad
            r3.A06 = r12
        L_0x0099:
            r3.A0B(r7)
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00aa
            X.TuM r1 = r3.A04
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x00aa
            if (r1 == 0) goto L_0x00aa
            r1.A00 = r13
        L_0x00aa:
            r2.A00 = r12
        L_0x00ac:
            return
        L_0x00ad:
            r3.A06 = r13
            goto L_0x0099
        L_0x00b0:
            androidx.recyclerview.widget.RecyclerView r9 = r6.A00
            if (r9 == 0) goto L_0x0032
            X.3pI r10 = r9.A0D
            if (r10 == 0) goto L_0x0032
            r8 = -1
            boolean r0 = r5.equals(r7)
            if (r0 != 0) goto L_0x00cd
            X.2Rw r1 = r9.A0A
            boolean r0 = r1 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x00cd
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            if (r1 == 0) goto L_0x00cd
            int r8 = r1.A02(r5)
        L_0x00cd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1 = -1
            if (r8 == r1) goto L_0x0032
            if (r0 == 0) goto L_0x0032
            int r0 = X.C240113Jq.A03(r10, r9, r8)
            if (r0 == r1) goto L_0x0032
            android.view.View r1 = r9.getChildAt(r0)
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r0 instanceof X.KUN
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r1.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mediakit.ui.holder.MediaKitPostsSectionHolder"
            X.0qQ.A0C(r1, r0)
            X.KUN r1 = (X.KUN) r1
            X.0eM r0 = r1.A01
            java.lang.Object r9 = X.AnonymousClass7TE.A14(r0)
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            X.3pI r8 = r9.A0D
            if (r8 == 0) goto L_0x0032
            X.2Rw r1 = r9.A0A
            r0 = 23
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            java.lang.String r0 = r4.A03
            int r0 = r1.A02(r0)
            int r0 = X.C240113Jq.A03(r8, r9, r0)
            android.view.View r1 = r9.getChildAt(r0)
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r0 instanceof X.X1S
            if (r0 == 0) goto L_0x0032
            java.lang.Object r9 = r1.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.video.binder.HasDiscoveryVideoViewHolder"
            X.0qQ.A0C(r9, r0)
            X.X1S r9 = (X.X1S) r9
            X.X7p r9 = (X.C20976X7p) r9
            goto L_0x0061
        L_0x0135:
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x00ac
            X.LS8.A00(r2)
            return
        L_0x013f:
            java.lang.Object r2 = r14.A01
            X.K5H r2 = (X.K5H) r2
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x00ac
            int r0 = r15.what
            if (r0 != 0) goto L_0x0158
            X.K5H.A06(r2)
            android.location.Location r0 = r2.A02
            if (r0 == 0) goto L_0x00ac
        L_0x0154:
            X.K5H.A04(r2)
            return
        L_0x0158:
            r1 = 1
            if (r0 != r1) goto L_0x00ac
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x016c
            r0 = 0
            r2.A0Q = r0
            r14.removeMessages(r1)
            r14.removeMessages(r0)
            X.K5H.A05(r2)
            return
        L_0x016c:
            X.K5H.A0B(r2, r1)
            goto L_0x0154
        L_0x0170:
            int r0 = r15.what
            r3 = 1
            if (r0 != r3) goto L_0x00ac
            java.lang.Object r2 = r14.A01
            X.Jat r2 = (X.C59870Jat) r2
            X.Jav r1 = r2.A06
            X.JYp r0 = r1.A00
            r0.getClass()
            r0.A03()
            X.Jaw r0 = r1.A01
            int r1 = r0.A00()
            r0 = 60000(0xea60, float:8.4078E-41)
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x00ac
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00ac
            android.os.Handler r2 = r2.A03
            r0 = 40
            r2.sendEmptyMessageDelayed(r3, r0)
            return
        L_0x019d:
            r0 = 0
            X.0qQ.A0B(r15, r0)
            int r0 = r15.what
            if (r0 != 0) goto L_0x00ac
            java.lang.Object r1 = r14.A01
            com.instagram.creation.base.ui.filterview.FilterViewContainer r1 = (com.instagram.creation.base.ui.filterview.FilterViewContainer) r1
            X.MQ6 r0 = r1.A03
            if (r0 == 0) goto L_0x00ac
            r0 = 1
            r1.A06 = r0
            return
        L_0x01b1:
            int r0 = r15.what
            r1 = 1
            if (r0 != r1) goto L_0x00ac
            java.lang.Object r0 = r14.A01
            com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager r0 = (com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager) r0
            r0.A01 = r1
            com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager.A04(r0)
            return
        L_0x01c0:
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r6 = r14.A01
            X.JWG r6 = (X.JWG) r6
            int r5 = r15.what
            r0 = 26
            java.lang.Integer[] r4 = X.AnonymousClass05K.A00(r0)
            int r3 = r4.length
            r2 = 0
        L_0x01d2:
            if (r2 >= r3) goto L_0x01e4
            r1 = r4[r2]
            int r0 = X.LPN.A00(r1)
            if (r0 != r5) goto L_0x01e1
            r0 = 0
            r6.A0A(r0, r1)
            return
        L_0x01e1:
            int r2 = r2 + 1
            goto L_0x01d2
        L_0x01e4:
            java.lang.String r0 = "Unknown type id "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60012JdL.handleMessage(android.os.Message):void");
    }

    public C60012JdL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
