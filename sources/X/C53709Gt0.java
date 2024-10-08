package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Gt0  reason: case insensitive filesystem */
public final class C53709Gt0 extends C251343mx {
    public final FoaUserSession A00;
    public final C53036GhS A01;
    public final C56564I1s A02;

    public C53709Gt0(FoaUserSession foaUserSession, C56564I1s i1s, C53036GhS ghS) {
        0qQ.A0B(i1s, 3);
        this.A00 = foaUserSession;
        this.A01 = ghS;
        this.A02 = i1s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        if (r1 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r33) {
        /*
            r32 = this;
            r2 = 0
            r13 = r33
            X.JNh r0 = X.I3I.A00(r13)
            X.JSK r4 = X.I41.A00(r0)
            r19 = 1
            r12 = r32
            X.GhS r3 = r12.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            r0 = 25
            X.IwH r0 = X.C58708IwH.A01(r12, r0)
            java.lang.Object r9 = X.AnonymousClass3Zw.A00(r13, r0, r1)
            X.Hsg r9 = (X.C56093Hsg) r9
            X.HLw r1 = r3.A07
            X.HLw r0 = X.C54639HLw.WRITE_WITH_AI
            if (r1 == r0) goto L_0x002b
            X.HLw r0 = X.C54639HLw.WRITE_WITH_AI_MMLLM
            if (r1 != r0) goto L_0x0041
        L_0x002b:
            java.lang.String r0 = r3.A08
            java.lang.Integer r0 = X.I3J.A00(r0)
            X.0qQ.A0B(r0, r2)
            java.lang.String r1 = X.I3J.A01(r0)
            java.lang.String r0 = "ig_"
            boolean r1 = X.00l.A0d(r1, r0, r2)
            r0 = 1
            if (r1 != 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r6 = 0
            if (r0 == 0) goto L_0x012a
            X.HNN r1 = X.HNN.A0b
            X.HNO r0 = X.HNO.A0g
            int r0 = X.I61.A00(r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.graphics.drawable.Drawable r7 = X.I61.A04(r13, r1, r6, r0)
        L_0x0055:
            X.3XV r0 = X.2WX.A02
            long r16 = X.C51970G9q.A0D()
            java.lang.Integer r3 = X.AnonymousClass05K.A0G
            r0 = r16
            X.2WX r18 = X.AnonymousClass9JR.A00(r6, r3, r2, r0)
            X.2Wb r3 = X.C51972G9s.A0Q(r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A0U
            long r0 = X.G9w.A07(r4, r0)
            java.lang.Integer r10 = X.AnonymousClass05K.A0E
            X.2WX r11 = X.AnonymousClass9JR.A00(r6, r10, r2, r0)
            X.2V1 r0 = r3.A00
            r31 = r0
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r31)
            if (r7 == 0) goto L_0x00d5
            r0 = 4639270566145032192(0x4062000000000000, double:144.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.2WX r14 = X.AnonymousClass9JR.A00(r6, r8, r2, r0)
            r0 = 4636455816377925632(0x4058000000000000, double:96.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.9JR r0 = X.C51965G9l.A0c(r5, r2, r0)
            X.2WX r8 = X.C51974G9v.A0J(r14, r0, r8)
            long r0 = X.C51970G9q.A0I()
            java.lang.Integer r5 = X.AnonymousClass05K.A08
            X.2WX r15 = X.AnonymousClass9JR.A00(r8, r5, r2, r0)
            android.widget.ImageView$ScaleType r14 = android.widget.ImageView.ScaleType.CENTER_CROP
            X.2V1 r8 = r4.A00
            X.C51974G9v.A0g(r7, r14, r8, r4, r15)
            r7 = 2131966437(0x7f1339e5, float:1.9569712E38)
            java.lang.String r24 = X.C244013aV.A0E(r4, r7)
            java.lang.Integer r25 = X.AnonymousClass05K.A03
            X.HNO r23 = X.HNO.A0Y
            long r27 = X.C51970G9q.A0H()
            X.90N r22 = X.AnonymousClass90N.CENTER
            long r7 = X.C51970G9q.A0F()
            X.9JR r0 = X.C51965G9l.A0c(r5, r2, r0)
            X.2WX r21 = X.C51974G9v.A0F(r6, r0, r2, r7)
            X.GwD r0 = new X.GwD
            r20 = r0
            r26 = r2
            r29 = r16
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r29)
            r4.A00(r0)
        L_0x00d5:
            java.util.List r0 = r9.A00
            java.util.Iterator r15 = r0.iterator()
        L_0x00db:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r14 = r15.next()
            X.Hsx r14 = (X.C56110Hsx) r14
            X.HNN r8 = r14.A00
            java.lang.String r7 = r14.A02
            X.Hsh r1 = r14.A01
            X.0eP r0 = r1.A01
            java.lang.String r5 = r1.A00
            if (r0 == 0) goto L_0x011e
            android.content.Context r21 = X.C243803a8.A00(r4)
            java.lang.Object r1 = r0.A01
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x012d
            X.J6f r23 = X.C59097J6f.A01(r14, r2)
            X.IxJ r0 = new X.IxJ
            r20 = r0
            r22 = r12
            r24 = r1
            r25 = r2
            r20.<init>(r21, r22, r23, r24, r25)
            X.Gd5 r1 = new X.Gd5
            r1.<init>(r4)
            r0.invoke(r1)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r1}
            java.lang.CharSequence r5 = android.text.TextUtils.expandTemplate(r5, r0)
        L_0x011e:
            X.0qQ.A0A(r5)
            X.Gsz r0 = new X.Gsz
            r0.<init>(r8, r7, r5)
            r4.A00(r0)
            goto L_0x00db
        L_0x012a:
            r7 = r6
            goto L_0x0055
        L_0x012d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0132:
            X.C51967G9n.A1F(r4, r3, r11)
            long r4 = X.C51969G9p.A0F()
            r0 = 4624633867356078080(0x402e000000000000, double:15.0)
            X.2WX r1 = X.C51973G9u.A0X(r6, r10, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            X.2WX r4 = X.AnonymousClass9JR.A00(r1, r0, r2, r4)
            X.3Zh r1 = X.C243573Zh.CENTER
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2WX r1 = X.G9t.A0z(r4, r0, r1)
            r7 = 2
            X.2Wb r0 = X.AnonymousClass7TG.A0S(r31)
            r4 = 2131966371(0x7f1339a3, float:1.9569578E38)
            java.lang.String r5 = X.C244013aV.A0E(r0, r4)
            android.content.Context r20 = X.C243803a8.A00(r0)
            X.I1s r10 = r12.A02
            java.lang.String r8 = r10.A02
            r4 = r19
            X.J6f r22 = X.C59097J6f.A01(r0, r4)
            X.IxJ r4 = new X.IxJ
            r19 = r4
            r21 = r12
            r23 = r8
            r24 = r2
            r19.<init>(r20, r21, r22, r23, r24)
            X.Gd5 r8 = new X.Gd5
            r8.<init>(r0)
            r4.invoke(r8)
            android.content.Context r20 = X.C243803a8.A00(r0)
            java.lang.String r4 = r10.A00
            X.J6f r22 = X.C59097J6f.A01(r0, r7)
            X.IxJ r7 = new X.IxJ
            r19 = r7
            r23 = r4
            r19.<init>(r20, r21, r22, r23, r24)
            X.Gd5 r4 = new X.Gd5
            r4.<init>(r0)
            r7.invoke(r4)
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[]{r8, r4}
            java.lang.CharSequence r24 = android.text.TextUtils.expandTemplate(r5, r4)
            X.0qQ.A07(r24)
            java.lang.Integer r25 = X.AnonymousClass05K.A01
            X.HNO r23 = X.HNO.A0h
            long r27 = X.C51970G9q.A0H()
            X.90N r22 = X.AnonymousClass90N.CENTER
            X.GwD r4 = new X.GwD
            r20 = r4
            r21 = r6
            r26 = r2
            r29 = r27
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r29)
            X.C51971G9r.A1D(r4, r0, r3, r1)
            long r0 = X.C51970G9q.A0I()
            boolean r10 = r9.A01
            if (r10 == 0) goto L_0x0235
            long r4 = X.C51969G9p.A0D()
        L_0x01c8:
            java.lang.Integer r9 = X.AnonymousClass05K.A07
            X.2WX r7 = X.AnonymousClass9JR.A00(r6, r9, r2, r0)
            java.lang.Integer r11 = X.AnonymousClass05K.A08
            X.2WX r7 = X.AnonymousClass9JR.A00(r7, r11, r2, r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A09
            X.2WX r14 = X.AnonymousClass9JR.A00(r7, r8, r2, r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0A
            X.2WX r20 = X.AnonymousClass9JR.A00(r14, r7, r2, r4)
            r4 = 2131966357(0x7f133995, float:1.956955E38)
            java.lang.String r24 = X.C244013aV.A0E(r3, r4)
            java.lang.Integer r26 = X.AnonymousClass05K.A0Y
            r4 = 23
            X.IwH r29 = X.C58708IwH.A01(r12, r4)
            X.GvS r4 = new X.GvS
            r22 = r6
            r23 = r6
            r27 = r25
            r28 = r6
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.A00(r4)
            if (r10 == 0) goto L_0x022e
            X.2WX r9 = X.AnonymousClass9JR.A00(r6, r9, r2, r0)
            r4 = r16
            X.2WX r4 = X.AnonymousClass9JR.A00(r9, r11, r2, r4)
            X.2WX r4 = X.AnonymousClass9JR.A00(r4, r8, r2, r0)
            X.2WX r20 = X.AnonymousClass9JR.A00(r4, r7, r2, r0)
            r0 = 2131966356(0x7f133994, float:1.9569548E38)
            java.lang.String r24 = X.C244013aV.A0E(r3, r0)
            java.lang.Integer r26 = X.AnonymousClass05K.A0N
            r0 = 24
            X.IwH r29 = X.C58708IwH.A01(r12, r0)
            X.GvS r0 = new X.GvS
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.A00(r0)
        L_0x022e:
            r0 = r18
            X.2Tl r0 = X.C243563Zg.A03(r3, r13, r0)
            return r0
        L_0x0235:
            r4 = r0
            goto L_0x01c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53709Gt0.A0X(X.3Y5):X.3mp");
    }
}
