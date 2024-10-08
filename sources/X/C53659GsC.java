package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.GsC  reason: case insensitive filesystem */
public final class C53659GsC extends C251343mx {
    public final FoaUserSession A00;
    public final String A01;

    /* JADX WARNING: type inference failed for: r31v5, types: [X.Ita] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r35) {
        /*
            r34 = this;
            r4 = 0
            r12 = r35
            X.0qQ.A0B(r12, r4)
            X.2V1 r9 = r12.A05
            java.lang.Class<X.F3q> r0 = X.C49726F3q.class
            java.lang.Object r26 = r9.A06(r0)
            if (r26 == 0) goto L_0x012a
            X.3XV r0 = X.2WX.A02
            long r5 = X.C51969G9p.A0F()
            long r1 = X.C51970G9q.A0K()
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            r0 = 0
            X.2WX r8 = X.AnonymousClass9JR.A00(r0, r3, r4, r5)
            java.lang.Integer r7 = X.AnonymousClass05K.A08
            X.9JR r3 = X.C51965G9l.A0c(r7, r4, r5)
            X.2WX r15 = X.C51974G9v.A0F(r8, r3, r4, r1)
            X.2Wb r3 = X.AnonymousClass7TG.A0S(r9)
            r1 = 2131976934(0x7f1362e6, float:1.9591003E38)
            java.lang.String r20 = X.C244013aV.A0E(r3, r1)
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            android.content.Context r1 = X.C243803a8.A00(r3)
            android.app.Activity r27 = X.C70782Va.A00(r1)
            r1 = r34
            com.meta.foa.session.FoaUserSession r13 = r1.A00
            java.lang.String r14 = r1.A01
            r11 = 1
            X.AnonymousClass7TF.A1B(r13, r11, r14)
            if (r27 != 0) goto L_0x00c3
            X.Itb r24 = X.C58542Itb.A00
        L_0x0050:
            X.HOw r17 = X.C54691HOw.FILLED
            X.Hyw r19 = X.C56464Hyw.A00
            X.Gv8 r1 = new X.Gv8
            r23 = r22
            r25 = r11
            r18 = r0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3.A00(r1)
            r1 = 2131976932(0x7f1362e4, float:1.9590998E38)
            java.lang.String r27 = X.C244013aV.A0E(r3, r1)
            long r1 = X.C51970G9q.A0I()
            X.2WX r5 = new X.2WX
            r5.<init>(r0, r0)
            X.2WX r1 = X.AnonymousClass9JR.A00(r0, r7, r4, r1)
            X.2WX r25 = r5.A00(r1)
            android.content.Context r1 = X.C243803a8.A00(r3)
            android.app.Activity r8 = X.C70782Va.A00(r1)
            if (r8 != 0) goto L_0x00a0
            X.Ita r31 = X.C58541Ita.A00
        L_0x0088:
            X.Gv8 r0 = new X.Gv8
            r23 = r0
            r24 = r17
            r26 = r19
            r28 = r21
            r29 = r21
            r30 = r22
            r32 = r11
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.2Tl r0 = X.C51967G9n.A0N(r0, r3, r12, r15)
            return r0
        L_0x00a0:
            com.instagram.common.session.UserSession r7 = X.C56316HwT.A00(r13)
            X.0BQ r5 = X.AnonymousClass0BO.A00(r7)
            r28 = r5
            r29 = r8
            r30 = r0
            r31 = r7
            r32 = r14
            r33 = r11
            r28.AEO(r29, r30, r31, r32, r33)
            r10 = 5
            X.IoO r31 = new X.IoO
            r4 = r31
            r6 = r26
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0088
        L_0x00c3:
            com.instagram.common.session.UserSession r6 = X.C56316HwT.A00(r13)
            X.0BQ r28 = X.AnonymousClass0BO.A00(r6)
            android.app.Activity r9 = X.C70782Va.A00(r27)
            boolean r1 = r9 instanceof androidx.activity.ComponentActivity
            if (r1 == 0) goto L_0x0128
            androidx.activity.ComponentActivity r9 = (androidx.activity.ComponentActivity) r9
        L_0x00d5:
            r29 = r27
            r30 = r0
            r31 = r6
            r32 = r14
            r33 = r4
            X.0B7 r1 = r28.AEO(r29, r30, r31, r32, r33)
            android.os.Bundle r8 = r1.A00
            if (r9 == 0) goto L_0x0113
            X.FBZ r10 = new X.FBZ
            r10.<init>(r9, r6, r11)
            boolean r1 = r10.A02()
            if (r1 == 0) goto L_0x0113
            X.2YN r2 = new X.2YN
            r2.<init>(r9)
            java.lang.Class<com.instagram.fx.access.sso.FxSsoViewModel> r1 = com.instagram.fx.access.sso.FxSsoViewModel.class
            X.2YL r1 = r2.A00(r1)
            com.instagram.fx.access.sso.FxSsoViewModel r1 = (com.instagram.fx.access.sso.FxSsoViewModel) r1
            r1.A03(r9, r8, r6)
            X.0eM r1 = r1.A03
            java.lang.Object r5 = r1.getValue()
            X.2Fk r5 = (X.2Fk) r5
            r2 = 4
            X.WEC r1 = new X.WEC
            r1.<init>(r2, r8, r10)
            r5.A06(r9, r1)
        L_0x0113:
            r1 = 1199(0x4af, float:1.68E-42)
            java.lang.String r30 = X.AnonymousClass000.A00(r1)
            X.IoT r24 = new X.IoT
            r25 = r6
            r28 = r8
            r29 = r14
            r31 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0050
        L_0x0128:
            r9 = 0
            goto L_0x00d5
        L_0x012a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53659GsC.A0X(X.3Y5):X.3mp");
    }

    public C53659GsC(FoaUserSession foaUserSession, String str) {
        this.A00 = foaUserSession;
        this.A01 = str;
    }
}
