package X;

import android.content.Context;

/* renamed from: X.3mx  reason: invalid class name and case insensitive filesystem */
public abstract class C251343mx extends C251263mp {
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0199, code lost:
        if (r12 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a6, code lost:
        if (r2 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b5  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0095=Splitter:B:26:0x0095, B:45:0x012a=Splitter:B:45:0x012a, B:5:0x002e=Splitter:B:5:0x002e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C244533bL A0F(X.B0X r21, X.C243243Xz r22, X.2Vz r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = 0
            r5 = r22
            X.0qQ.A0B(r5, r0)
            r9 = 1
            r0 = r23
            X.0qQ.A0B(r0, r9)
            X.2V1 r2 = r0.A04
            java.util.Set r1 = X.2SN.A00
            boolean r0 = r1.isEmpty()
            java.lang.String r4 = "render:"
            r3 = 0
            r8 = r20
            if (r0 == 0) goto L_0x0049
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r12 = r0.isTracing()
            if (r12 == 0) goto L_0x002e
            java.lang.String r0 = r8.A0J()
            java.lang.String r0 = X.002.A0R(r4, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x002e:
            X.0qQ.A0B(r2, r9)     // Catch:{ all -> 0x0142 }
            X.3Y5 r0 = new X.3Y5     // Catch:{ all -> 0x0142 }
            r0.<init>(r2, r5)     // Catch:{ all -> 0x0142 }
            X.3mp r6 = r8.A0X(r0)     // Catch:{ all -> 0x0142 }
            r0.A02 = r3     // Catch:{ all -> 0x0142 }
            X.3bj r1 = r0.A03     // Catch:{ all -> 0x0142 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0142 }
            X.2VM r4 = new X.2VM     // Catch:{ all -> 0x0142 }
            r4.<init>(r6, r1, r0)     // Catch:{ all -> 0x0142 }
            if (r12 == 0) goto L_0x019e
            goto L_0x019b
        L_0x0049:
            java.util.Iterator r10 = r1.iterator()
            r7 = r3
        L_0x004e:
            boolean r0 = r10.hasNext()
            java.lang.String r13 = "Litho.Resolve.ComponentRendered"
            if (r0 == 0) goto L_0x0078
            java.lang.Object r6 = r10.next()
            r0 = r6
            X.2SM r0 = (X.2SM) r0
            java.lang.String[] r1 = r0.A00
            boolean r0 = X.03t.A0O(r13, r1)
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "*"
            boolean r0 = X.03t.A0O(r0, r1)
            if (r0 == 0) goto L_0x004e
        L_0x006d:
            if (r7 != 0) goto L_0x0074
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0074:
            r7.add(r6)
            goto L_0x004e
        L_0x0078:
            if (r7 != 0) goto L_0x007c
            X.0sn r7 = X.0sn.A00
        L_0x007c:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00ae
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r12 = r0.isTracing()
            if (r12 == 0) goto L_0x0095
            java.lang.String r0 = r8.A0J()
            java.lang.String r0 = X.002.A0R(r4, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0095:
            X.0qQ.A0B(r2, r9)     // Catch:{ all -> 0x0142 }
            X.3Y5 r0 = new X.3Y5     // Catch:{ all -> 0x0142 }
            r0.<init>(r2, r5)     // Catch:{ all -> 0x0142 }
            X.3mp r6 = r8.A0X(r0)     // Catch:{ all -> 0x0142 }
            r0.A02 = r3     // Catch:{ all -> 0x0142 }
            X.3bj r1 = r0.A03     // Catch:{ all -> 0x0142 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0142 }
            X.2VM r4 = new X.2VM     // Catch:{ all -> 0x0142 }
            r4.<init>(r6, r1, r0)     // Catch:{ all -> 0x0142 }
            goto L_0x0199
        L_0x00ae:
            java.util.Iterator r10 = r7.iterator()
            r1 = r3
        L_0x00b3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r6 = r10.next()
            boolean r0 = r6 instanceof X.C7850QbY
            if (r0 == 0) goto L_0x00b3
            if (r1 != 0) goto L_0x00c8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x00c8:
            r1.add(r6)
            goto L_0x00b3
        L_0x00cc:
            if (r1 != 0) goto L_0x00d0
            X.0sn r1 = X.0sn.A00
        L_0x00d0:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.facebook.rendercore.debug.TraceListener<kotlin.Any?>>"
            X.0qQ.A0C(r1, r0)
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            java.lang.String r6 = r8.A0J()
            java.lang.String r0 = "component"
            r15.put(r0, r6)
            java.lang.String r6 = r8.A0J()
            java.lang.String r0 = "name"
            r15.put(r0, r6)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x00fb:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r10.next()
            X.QbY r0 = (X.C7850QbY) r0
            X.S5p r0 = r0.A01(r13)
            r6.add(r0)
            goto L_0x00fb
        L_0x010f:
            long r16 = java.lang.System.currentTimeMillis()
            long r10 = java.lang.System.nanoTime()
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r12 = r0.isTracing()
            if (r12 == 0) goto L_0x012a
            java.lang.String r0 = r8.A0J()
            java.lang.String r0 = X.002.A0R(r4, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x012a:
            X.0qQ.A0B(r2, r9)     // Catch:{ all -> 0x0142 }
            X.3Y5 r0 = new X.3Y5     // Catch:{ all -> 0x0142 }
            r0.<init>(r2, r5)     // Catch:{ all -> 0x0142 }
            X.3mp r9 = r8.A0X(r0)     // Catch:{ all -> 0x0142 }
            r0.A02 = r3     // Catch:{ all -> 0x0142 }
            X.3bj r8 = r0.A03     // Catch:{ all -> 0x0142 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0142 }
            X.2VM r4 = new X.2VM     // Catch:{ all -> 0x0142 }
            r4.<init>(r9, r8, r0)     // Catch:{ all -> 0x0142 }
            goto L_0x0149
        L_0x0142:
            r0 = move-exception
            if (r12 == 0) goto L_0x0179
            com.facebook.litho.ComponentsSystrace.A01()
            throw r0
        L_0x0149:
            if (r12 == 0) goto L_0x014e
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x014e:
            long r18 = java.lang.System.nanoTime()
            int r0 = r5.A06
            java.lang.String r14 = java.lang.String.valueOf(r0)
            long r18 = r18 - r10
            X.QbU r12 = new X.QbU
            r12.<init>(r13, r14, r15, r16, r18)
            java.util.Iterator r10 = r1.iterator()
            r9 = 0
        L_0x0164:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r8 = r10.next()
            int r1 = r9 + 1
            if (r9 >= 0) goto L_0x017a
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
        L_0x0179:
            throw r0
        L_0x017a:
            X.QbY r8 = (X.C7850QbY) r8
            java.lang.Object r0 = r6.get(r9)
            r8.A02(r12, r0)
            r9 = r1
            goto L_0x0164
        L_0x0185:
            java.util.Iterator r1 = r7.iterator()
        L_0x0189:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x019e
            java.lang.Object r0 = r1.next()
            X.2SM r0 = (X.2SM) r0
            r0.A00(r12)
            goto L_0x0189
        L_0x0199:
            if (r12 == 0) goto L_0x019e
        L_0x019b:
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x019e:
            X.3mp r0 = r4.A00
            if (r0 == 0) goto L_0x01b5
            X.2TR r2 = X.AnonymousClass3Y0.A02(r0, r2, r5)
            if (r2 == 0) goto L_0x01af
        L_0x01a8:
            X.3bj r1 = r4.A01
            java.util.List r0 = r4.A02
            X.AnonymousClass3Y0.A0A(r2, r1, r0)
        L_0x01af:
            X.3bL r0 = new X.3bL
            r0.<init>(r3, r2)
            return r0
        L_0x01b5:
            X.3bM r2 = new X.3bM
            r2.<init>()
            goto L_0x01a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251343mx.A0F(X.B0X, X.3Xz, X.2Vz, int, int):X.3bL");
    }

    public final Object A0H(Context context) {
        0qQ.A0B(context, 0);
        super.A0H(context);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0R(C251263mp r5) {
        return this == r5 || (r5 != null && 0qQ.A0K(getClass(), r5.getClass()) && (this.A00 == r5.A00 || C245173cR.A03(this, r5)));
    }

    public final boolean A0T(C251263mp r2, C251263mp r3, 2TB r4, 2TB r5) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 2);
        return super.A0T(r2, r3, r4, r5);
    }

    public final Integer A0G() {
        Integer num = AnonymousClass05K.A00;
        0qQ.A07(num);
        return num;
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r19v28, types: [X.4b9] */
    /* JADX WARNING: type inference failed for: r19v29, types: [X.Gxa] */
    /* JADX WARNING: type inference failed for: r19v30, types: [X.4wq] */
    /* JADX WARNING: type inference failed for: r19v31, types: [X.GxZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x1949, code lost:
        if (X.2Wd.A00(r0.Bnf(), r10.A00) <= 0) goto L_0x194b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0807  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0685  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0706  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x076a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x07c8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x07f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C251263mp A0X(X.AnonymousClass3Y5 r44) {
        /*
            r43 = this;
            r2 = r43
            boolean r1 = r2 instanceof X.C243383Yo
            r0 = r44
            if (r1 == 0) goto L_0x01d2
            r8 = r2
            X.3Yo r8 = (X.C243383Yo) r8
            r7 = 0
            X.0qQ.A0B(r0, r7)
            X.0sa r1 = r8.A03
            java.lang.Object r1 = r1.invoke()
            X.3hT r1 = (X.C248133hT) r1
            X.2V1 r3 = r0.A05
            r4 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r0 = new X.2Wb
            r0.<init>(r3, r2)
            X.9J3 r11 = r1.A07
            r5 = 1
            if (r11 == 0) goto L_0x01cf
            boolean r2 = r11.A04
            if (r2 != r5) goto L_0x01cf
        L_0x002d:
            r2 = 9221401712017801216(0x7ff9000000000000, double:NaN)
            if (r5 == 0) goto L_0x01cc
            java.lang.Object r5 = r11.A00
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            X.1Xj r10 = r5.A01
            android.content.Context r12 = X.C243803a8.A00(r0)
            com.instagram.common.session.UserSession r9 = r8.A00
            X.4DU r5 = r8.A02
            r18 = r5
            java.lang.String r6 = r18.getModuleName()
            java.lang.String r5 = r11.A03
            int r6 = X.C256073vB.A00(r12, r9, r10, r6, r5)
            X.3XV r5 = X.2WX.A02
            long r5 = (long) r6
            long r5 = r5 | r2
            long r5 = X.2Wd.A03(r5)
            java.lang.Integer r12 = X.AnonymousClass05K.A08
            X.9JR r13 = new X.9JR
            r13.<init>(r12, r7, r5)
            X.2WX r12 = new X.2WX
            r12.<init>(r4, r13)
            java.lang.Object r13 = r11.A01
            X.3W1 r13 = (X.AnonymousClass3W1) r13
            X.3Zh r15 = X.C243573Zh.FLEX_END
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            r6 = 3
            X.9JS r5 = new X.9JS
            r5.<init>(r14, r15, r6)
            X.2WX r6 = new X.2WX
            r6.<init>(r4, r5)
            X.3fu r5 = new X.3fu
            r19 = r13
            r15 = r6
            r16 = r9
            r17 = r10
            r13 = r5
            r14 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.A00(r5)
        L_0x0083:
            X.3gM r6 = r1.A0D
            if (r6 == 0) goto L_0x00ae
            r5 = 31
            X.9LW r11 = new X.9LW
            r11.<init>(r6, r5)
            X.4DU r10 = r8.A02
            X.311 r9 = r8.A01
            X.3WV r17 = r9.BRO()
            boolean r6 = r1.A0F
            com.instagram.common.session.UserSession r5 = r8.A00
            X.33B r16 = r9.Aqg()
            X.3hz r13 = new X.3hz
            r18 = r10
            r19 = r11
            r20 = r6
            r15 = r5
            r14 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r0.A00(r13)
        L_0x00ae:
            X.3gj r11 = r1.A0C
            X.311 r9 = r8.A01
            X.3i9 r10 = r9.BQ2()
            com.instagram.common.session.UserSession r12 = r8.A00
            X.4DU r5 = r8.A02
            X.3iC r6 = new X.3iC
            r6.<init>(r12, r10, r11, r5)
            r0.A00(r6)
            X.9Ig r14 = r1.A05
            if (r14 == 0) goto L_0x00e2
            boolean r10 = r1.A0F
            X.0Pk r8 = X.0Pl.A0n
            X.2V1 r6 = r0.A00
            android.content.Context r6 = r6.A0C
            X.0qQ.A07(r6)
            X.0Pl r17 = r8.A00(r6, r12)
            X.Gty r13 = new X.Gty
            r15 = r12
            r16 = r5
            r18 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A00(r13)
        L_0x00e2:
            X.JwM r8 = r1.A09
            X.3iD r6 = new X.3iD
            r6.<init>(r8, r12, r5)
            r0.A00(r6)
            X.3hW r8 = r1.A0B
            X.3iE r6 = new X.3iE
            r6.<init>(r12, r8, r5)
            r0.A00(r6)
            X.JwG r8 = r1.A08
            X.3iF r6 = new X.3iF
            r6.<init>(r8, r5)
            r0.A00(r6)
            boolean r8 = r1.A0G
            if (r8 != 0) goto L_0x01c0
            X.9If r11 = r1.A04
            boolean r6 = r1.A0F
            X.3iH r10 = new X.3iH
            r10.<init>(r11, r6)
            r0.A00(r10)
            X.3DI r10 = X.AnonymousClass3DI.A00
            boolean r10 = r10.A04(r12)
            if (r10 == 0) goto L_0x013f
            X.9Ib r10 = r1.A03
            if (r10 == 0) goto L_0x013f
            java.lang.Object r10 = r10.A01
            if (r10 == 0) goto L_0x013f
            X.33B r13 = r9.Aqg()
            X.3WV r14 = r9.BRO()
            X.416 r15 = r9.B58()
            r10 = 11
            X.Ivt r9 = new X.Ivt
            r9.<init>(r1, r10)
            X.GuL r11 = new X.GuL
            r16 = r5
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.A00(r11)
        L_0x013f:
            r9 = 32
            X.9LW r10 = new X.9LW
            r10.<init>(r1, r9)
            X.3iJ r9 = new X.3iJ
            r9.<init>(r12, r10)
            r0.A00(r9)
            X.9J0 r10 = r1.A06
            if (r10 == 0) goto L_0x017e
            java.lang.Object r9 = r10.A00
            X.9Ig r9 = (X.C376509Ig) r9
            java.lang.Object r9 = r9.A01
            X.0sP r9 = (X.0sP) r9
            java.lang.Object r9 = r9.invoke(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x017e
            X.0eE r9 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r9 = r9.A01(r12)
            com.instagram.common.typedurl.ImageUrl r16 = r9.Bh3()
            X.3iL r13 = new X.3iL
            r14 = r10
            r15 = r12
            r17 = r5
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            r0.A00(r13)
        L_0x017e:
            r5 = 33
            X.9LW r9 = new X.9LW
            r9.<init>(r1, r5)
            X.3iN r5 = new X.3iN
            r5.<init>(r6, r9)
            r0.A00(r5)
            X.3iO r5 = new X.3iO
            r5.<init>(r8)
            r0.A00(r5)
            X.3XV r5 = X.2WX.A02
            int r5 = r1.A00
            long r5 = (long) r5
            long r2 = r2 | r5
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            X.9JR r5 = new X.9JR
            r5.<init>(r6, r7, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r4, r5)
            r8 = r4
            r9 = r0
            r10 = r2
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r7
            X.2Tp r2 = X.C243563Zg.A0H(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A00(r2)
            X.3ha r2 = r1.A0A
            X.3iP r1 = new X.3iP
            r1.<init>(r2)
            r0.A00(r1)
        L_0x01c0:
            java.util.List r0 = r0.A01
            X.2Tl r1 = new X.2Tl
            r2 = r4
            r3 = r4
            r5 = r0
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x01cb:
            return r1
        L_0x01cc:
            r12 = r4
            goto L_0x0083
        L_0x01cf:
            r5 = 0
            goto L_0x002d
        L_0x01d2:
            boolean r1 = r2 instanceof X.C248583iE
            if (r1 == 0) goto L_0x0295
            r9 = r2
            X.3iE r9 = (X.C248583iE) r9
            r7 = 0
            X.0qQ.A0B(r0, r7)
            X.3hW r8 = r9.A01
            r1 = 0
            if (r8 == 0) goto L_0x01cb
            X.4Fh r2 = X.C262634Fh.A00
            X.C243633Zp.A00(r0, r2)
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            r3 = 2131438001(0x7f0b29b1, float:1.8497917E38)
            X.3aa r2 = X.C244063aa.CAPTION
            r13.put(r3, r2)
            X.3W1 r3 = r8.A04
            r12 = 4
            X.4Fi r2 = X.C262644Fi.A00
            X.2Wa r6 = X.C243753a2.A01(r0, r3, r2, r12, r7)
            X.3XV r2 = X.2WX.A02
            r2 = 2131165231(0x7f07002f, float:1.7944673E38)
            r11 = 2131165231(0x7f07002f, float:1.7944673E38)
            long r4 = X.C244013aV.A0C(r0, r2)
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            long r2 = X.C244013aV.A0C(r0, r2)
            java.lang.Integer r14 = X.AnonymousClass05K.A0u
            X.9JR r10 = new X.9JR
            r10.<init>(r14, r7, r4)
            X.2WX r14 = new X.2WX
            r14.<init>(r1, r10)
            java.lang.Integer r5 = X.AnonymousClass05K.A1I
            X.9JR r4 = new X.9JR
            r4.<init>(r5, r7, r2)
            X.2WX r10 = new X.2WX
            r10.<init>(r14, r4)
            X.2V1 r3 = r0.A05
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r5 = new X.2Wb
            r5.<init>(r3, r2)
            android.text.Layout r4 = r8.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            X.9JS r2 = new X.9JS
            r2.<init>(r3, r13, r12)
            X.2WX r13 = new X.2WX
            r13.<init>(r1, r2)
            long r2 = X.C244013aV.A0C(r5, r11)
            java.lang.Integer r12 = X.AnonymousClass05K.A1F
            X.9JR r11 = new X.9JR
            r11.<init>(r12, r7, r2)
            X.2WX r12 = new X.2WX
            r12.<init>(r13, r11)
            r2 = 14
            X.9M5 r11 = new X.9M5
            r11.<init>(r2, r9, r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.3at r2 = new X.3at
            r2.<init>(r3, r11, r1)
            X.2WX r13 = new X.2WX
            r13.<init>(r12, r2)
            X.3ZH r15 = r8.A03
            com.instagram.common.session.UserSession r14 = r9.A00
            X.4DU r3 = r9.A02
            X.9IE r2 = r8.A01
            java.lang.Object r12 = r2.A00
            X.3Ds r12 = (X.C238863Ds) r12
            java.lang.Object r2 = r6.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            r18 = r7
            r19 = r7
            r16 = r3
            r17 = r2
            X.2WX r3 = X.C244223aq.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            X.4Fj r2 = new X.4Fj
            r2.<init>(r4, r3, r1)
            r5.A00(r2)
            r8 = r5
            r9 = r0
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r7
            X.2Tp r1 = X.C243563Zg.A0H(r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x0295:
            boolean r1 = r2 instanceof X.C248563iC
            if (r1 == 0) goto L_0x0663
            r11 = r2
            X.3iC r11 = (X.C248563iC) r11
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.4Ep r1 = X.C262524Ep.A00
            X.C243633Zp.A00(r0, r1)
            X.3gj r6 = r11.A02
            X.9Ij r4 = r6.A00
            java.lang.Object r3 = r4.A02
            X.0sP r3 = (X.0sP) r3
            android.content.Context r1 = X.C243803a8.A00(r0)
            java.lang.Object r3 = r3.invoke(r1)
            X.3um r3 = (X.C255823um) r3
            java.lang.Object r4 = r4.A03
            X.0sP r4 = (X.0sP) r4
            android.content.Context r1 = X.C243803a8.A00(r0)
            java.lang.Object r7 = r4.invoke(r1)
            X.3uo r7 = (X.C255843uo) r7
            X.3gT r9 = r6.A04
            X.3gQ r1 = r6.A03
            r19 = r1
            X.3gd r5 = r6.A02
            X.2V1 r1 = r0.A05
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r10 = new X.2Wb
            r10.<init>(r1, r0)
            boolean r0 = r3 instanceof X.C255853up
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L_0x0377
            X.3up r3 = (X.C255853up) r3
            java.lang.CharSequence r0 = r3.A00
            r26 = r0
            r0 = 2131165308(0x7f07007c, float:1.794483E38)
            long r12 = X.C244013aV.A0C(r10, r0)
            X.2V1 r0 = r10.A00
            android.content.Context r0 = r0.A0C
            int r0 = X.2Yu.A08(r0)
            int r18 = X.C244013aV.A02(r10, r0)
            long r16 = X.C244013aV.A07(r10)
            android.text.method.MovementMethod r21 = android.text.method.LinkMovementMethod.getInstance()
            X.3XV r0 = X.2WX.A02
            long r3 = X.C244013aV.A0B(r10)
            long r0 = X.C244013aV.A05(r10)
            java.lang.Integer r15 = X.AnonymousClass05K.A04
            r14 = 0
            X.9JR r8 = new X.9JR
            r8.<init>(r15, r2, r3)
            X.2WX r3 = new X.2WX
            r3.<init>(r14, r8)
            java.lang.Integer r8 = X.AnonymousClass05K.A1I
            X.9JR r4 = new X.9JR
            r4.<init>(r8, r2, r0)
            X.2WX r8 = new X.2WX
            r8.<init>(r3, r4)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A08
            X.9JR r3 = new X.9JR
            r3.<init>(r4, r2, r0)
            X.2WX r4 = new X.2WX
            r4.<init>(r8, r3)
            java.lang.Integer r8 = X.AnonymousClass05K.A0A
            X.9JR r3 = new X.9JR
            r3.<init>(r8, r2, r0)
            X.2WX r8 = new X.2WX
            r8.<init>(r4, r3)
            r0 = 23
            X.J6H r4 = new X.J6H
            r4.<init>(r11, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            r1 = 4
            X.9JS r0 = new X.9JS
            r0.<init>(r3, r4, r1)
            X.2WX r4 = new X.2WX
            r4.<init>(r8, r0)
            X.2Wd r3 = new X.2Wd
            r3.<init>(r12)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r18)
            X.2Wd r8 = new X.2Wd
            r0 = r16
            r8.<init>(r0)
            X.GxL r0 = new X.GxL
            r20 = r0
            r22 = r4
            r23 = r3
            r24 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r10.A00(r0)
        L_0x0377:
            boolean r0 = r7 instanceof X.C255863uq
            if (r0 == 0) goto L_0x03c3
            X.3uq r7 = (X.C255863uq) r7
            java.lang.CharSequence r15 = r7.A00
            long r7 = X.C244013aV.A07(r10)
            android.text.method.MovementMethod r21 = android.text.method.LinkMovementMethod.getInstance()
            X.3XV r0 = X.2WX.A02
            long r3 = X.C244013aV.A0B(r10)
            long r0 = X.C244013aV.A05(r10)
            java.lang.Integer r14 = X.AnonymousClass05K.A04
            r13 = 0
            X.9JR r12 = new X.9JR
            r12.<init>(r14, r2, r3)
            X.2WX r4 = new X.2WX
            r4.<init>(r13, r12)
            java.lang.Integer r12 = X.AnonymousClass05K.A1I
            X.9JR r3 = new X.9JR
            r3.<init>(r12, r2, r0)
            X.2WX r1 = new X.2WX
            r1.<init>(r4, r3)
            X.2Wd r3 = new X.2Wd
            r3.<init>(r7)
            X.GxL r0 = new X.GxL
            r23 = r13
            r24 = r3
            r26 = r15
            r27 = r13
            r20 = r0
            r22 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r10.A00(r0)
        L_0x03c3:
            X.3gi r4 = r6.A01
            boolean r3 = r6.A09
            boolean r1 = r6.A08
            X.4Eq r0 = new X.4Eq
            r0.<init>(r4, r3, r1)
            r10.A00(r0)
            r15 = 0
            X.2V1 r1 = r10.A00
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r3 = new X.2Wb
            r3.<init>(r1, r0)
            boolean r0 = r5 instanceof X.C255873ur
            if (r0 == 0) goto L_0x0589
            X.3i9 r9 = r11.A01
            com.instagram.common.session.UserSession r8 = r11.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.feedback.domain.MediaFeedbackUiState.ShownAdTransparencyDisclaimerAttribution"
            X.0qQ.A0C(r5, r0)
            X.3ur r5 = (X.C255873ur) r5
            java.lang.CharSequence r0 = r5.A00
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            X.3a9 r1 = new X.3a9
            r1.<init>()
            int r0 = r7.length()
            r7.setSpan(r1, r2, r0, r2)
            X.2V1 r0 = r3.Aqq()
            android.content.Context r0 = r0.A0C
            int r0 = X.2Yu.A07(r0)
            int r17 = X.C244013aV.A02(r3, r0)
            android.text.TextUtils$TruncateAt r21 = android.text.TextUtils.TruncateAt.END
            int r16 = X.C55164HdG.A00(r8)
            X.3XV r0 = X.2WX.A02
            r0 = 2131954409(0x7f130ae9, float:1.9545316E38)
            java.lang.String r4 = X.C244013aV.A0F(r3, r7, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r4, r2)
            X.2WX r12 = new X.2WX
            r12.<init>(r15, r0)
            long r0 = X.C244013aV.A05(r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A0A
            X.9JR r4 = new X.9JR
            r4.<init>(r5, r2, r0)
            X.2WX r14 = new X.2WX
            r14.<init>(r12, r4)
            long r4 = X.C244013aV.A0B(r3)
            long r0 = X.C244013aV.A0B(r3)
            java.lang.Integer r13 = X.AnonymousClass05K.A0u
            X.9JR r12 = new X.9JR
            r12.<init>(r13, r2, r4)
            X.2WX r5 = new X.2WX
            r5.<init>(r14, r12)
            java.lang.Integer r4 = X.AnonymousClass05K.A1F
            X.9JR r13 = new X.9JR
            r13.<init>(r4, r2, r0)
            X.2WX r12 = new X.2WX
            r12.<init>(r5, r13)
            X.3ZH r1 = r6.A05
            X.4DU r0 = r11.A03
            X.3Ds r22 = X.C238863Ds.USER_MESSAGE
            r23 = r12
            r24 = r8
            r25 = r1
            r26 = r0
            r27 = r15
            r28 = r2
            r29 = r2
            X.2WX r13 = X.C244223aq.A00(r22, r23, r24, r25, r26, r27, r28, r29)
            X.3aa r0 = X.C244063aa.DISCLAIMER
            android.util.SparseArray r5 = X.C244083ac.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            r12 = 4
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r5, r12)
            X.2WX r5 = new X.2WX
            r5.<init>(r13, r0)
            r0 = 27
            X.PqU r1 = new X.PqU
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r9, (java.lang.Object) r8)
            X.9JS r0 = new X.9JS
            r0.<init>(r4, r1, r12)
            X.2WX r1 = new X.2WX
            r1.<init>(r5, r0)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r30 = java.lang.Integer.valueOf(r16)
            X.2WU r25 = X.C244473bF.A0C
            X.3bF r0 = new X.3bF
            r22 = r15
            r23 = r1
            r24 = r15
            r26 = r15
            r27 = r7
            r28 = r15
            r31 = r15
            r32 = r15
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x04b6:
            r3.A00(r0)
        L_0x04b9:
            r0 = r19
            boolean r0 = r0 instanceof X.C255893ut
            if (r0 == 0) goto L_0x056d
            X.3i9 r8 = r11.A01
            android.content.Context r4 = X.C243803a8.A00(r3)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.feedback.domain.MediaFeedbackUiState.ShownDisclaimerAttribution"
            r0 = r19
            X.0qQ.A0C(r0, r1)
            r0 = r19
            X.3ut r0 = (X.C255893ut) r0
            java.lang.String r1 = r0.A00
            r0 = 1
            java.lang.String r0 = X.C270804hK.A00(r4, r1, r0)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            X.3a9 r1 = new X.3a9
            r1.<init>()
            int r0 = r7.length()
            r7.setSpan(r1, r2, r0, r2)
            X.3XV r0 = X.2WX.A02
            long r0 = X.C244013aV.A05(r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A0A
            X.9JR r4 = new X.9JR
            r4.<init>(r5, r2, r0)
            X.2WX r12 = new X.2WX
            r12.<init>(r15, r4)
            long r4 = X.C244013aV.A0B(r3)
            long r0 = X.C244013aV.A0B(r3)
            java.lang.Integer r11 = X.AnonymousClass05K.A0u
            X.9JR r9 = new X.9JR
            r9.<init>(r11, r2, r4)
            X.2WX r5 = new X.2WX
            r5.<init>(r12, r9)
            java.lang.Integer r9 = X.AnonymousClass05K.A1F
            X.9JR r4 = new X.9JR
            r4.<init>(r9, r2, r0)
            X.2WX r11 = new X.2WX
            r11.<init>(r5, r4)
            X.3aa r0 = X.C244063aa.DISCLAIMER
            android.util.SparseArray r5 = X.C244083ac.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            r4 = 4
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r5, r4)
            X.2WX r5 = new X.2WX
            r5.<init>(r11, r0)
            r0 = 22
            X.J6S r1 = new X.J6S
            r1.<init>(r0, r8, r6)
            X.9JS r0 = new X.9JS
            r0.<init>(r9, r1, r4)
            X.2WX r4 = new X.2WX
            r4.<init>(r5, r0)
            X.2V1 r0 = r3.Aqq()
            android.content.Context r1 = r0.A0C
            r0 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = X.C244013aV.A02(r3, r0)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.2WU r16 = X.C244473bF.A0C
            X.3bF r0 = new X.3bF
            r13 = r15
            r17 = r15
            r18 = r7
            r19 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r11 = r0
            r12 = r15
            r14 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.A00(r0)
        L_0x056d:
            r9 = r3
            r11 = r15
            r12 = r15
            r13 = r15
            r14 = r15
            r16 = r2
            X.2Tp r0 = X.C243563Zg.A0H(r9, r10, r11, r12, r13, r14, r15, r16)
            r10.A00(r0)
            java.util.List r0 = r10.A01
            X.2Tl r1 = new X.2Tl
            r3 = r1
            r4 = r15
            r5 = r15
            r6 = r15
            r7 = r0
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x0589:
            boolean r0 = r9 instanceof X.C255883us
            if (r0 == 0) goto L_0x04b9
            X.3i9 r12 = r11.A01
            com.instagram.common.session.UserSession r8 = r11.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.feedback.domain.MediaFeedbackUiState.ShownPoliticalContentAttribution"
            X.0qQ.A0C(r9, r0)
            X.3us r9 = (X.C255883us) r9
            java.lang.CharSequence r0 = r9.A00
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            X.3a9 r1 = new X.3a9
            r1.<init>()
            int r0 = r7.length()
            r7.setSpan(r1, r2, r0, r2)
            int r17 = X.C55164HdG.A00(r8)
            android.text.TextUtils$TruncateAt r21 = android.text.TextUtils.TruncateAt.END
            X.2V1 r0 = r3.Aqq()
            android.content.Context r0 = r0.A0C
            int r0 = X.2Yu.A07(r0)
            int r16 = X.C244013aV.A02(r3, r0)
            X.3XV r0 = X.2WX.A02
            r0 = 2131954409(0x7f130ae9, float:1.9545316E38)
            java.lang.String r4 = X.C244013aV.A0F(r3, r7, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r4, r2)
            X.2WX r9 = new X.2WX
            r9.<init>(r15, r0)
            long r0 = X.C244013aV.A05(r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A0A
            X.9JR r4 = new X.9JR
            r4.<init>(r5, r2, r0)
            X.2WX r14 = new X.2WX
            r14.<init>(r9, r4)
            long r4 = X.C244013aV.A0B(r3)
            long r0 = X.C244013aV.A0B(r3)
            java.lang.Integer r13 = X.AnonymousClass05K.A0u
            X.9JR r9 = new X.9JR
            r9.<init>(r13, r2, r4)
            X.2WX r5 = new X.2WX
            r5.<init>(r14, r9)
            java.lang.Integer r4 = X.AnonymousClass05K.A1F
            X.9JR r13 = new X.9JR
            r13.<init>(r4, r2, r0)
            X.2WX r9 = new X.2WX
            r9.<init>(r5, r13)
            X.3ZH r1 = r6.A05
            X.4DU r0 = r11.A03
            X.3Ds r22 = X.C238863Ds.USER_MESSAGE
            r23 = r9
            r24 = r8
            r25 = r1
            r26 = r0
            r27 = r15
            r28 = r2
            r29 = r2
            X.2WX r13 = X.C244223aq.A00(r22, r23, r24, r25, r26, r27, r28, r29)
            X.3aa r0 = X.C244063aa.DISCLAIMER
            android.util.SparseArray r5 = X.C244083ac.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            r9 = 4
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r5, r9)
            X.2WX r5 = new X.2WX
            r5.<init>(r13, r0)
            r0 = 28
            X.PqU r1 = new X.PqU
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r12, (java.lang.Object) r8)
            X.9JS r0 = new X.9JS
            r0.<init>(r4, r1, r9)
            X.2WX r1 = new X.2WX
            r1.<init>(r5, r0)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r30 = java.lang.Integer.valueOf(r17)
            X.2WU r25 = X.C244473bF.A0C
            X.3bF r0 = new X.3bF
            r22 = r15
            r23 = r1
            r24 = r15
            r26 = r15
            r27 = r7
            r28 = r15
            r31 = r15
            r32 = r15
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x04b6
        L_0x0663:
            boolean r1 = r2 instanceof X.C262534Eq
            if (r1 == 0) goto L_0x0825
            r6 = r2
            X.4Eq r6 = (X.C262534Eq) r6
            r5 = 0
            X.0qQ.A0B(r0, r5)
            boolean r3 = r6.A01
            r4 = 0
            if (r3 == 0) goto L_0x0816
            X.3gi r1 = r6.A00
            X.3gh r1 = r1.A00
            X.0sP r2 = r1.A07
        L_0x0679:
            android.content.Context r1 = X.C243803a8.A00(r0)
            java.lang.Object r7 = r2.invoke(r1)
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
        L_0x0683:
            if (r3 == 0) goto L_0x0807
            X.3gi r1 = r6.A00
            X.3gh r1 = r1.A00
            X.0sP r9 = r1.A08
        L_0x068b:
            if (r7 == 0) goto L_0x06e3
            if (r9 == 0) goto L_0x06e3
            X.3XV r1 = X.2WX.A02
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
            long r1 = X.C244013aV.A0C(r0, r1)
            java.lang.Integer r8 = X.AnonymousClass05K.A09
            X.9JR r3 = new X.9JR
            r3.<init>(r8, r5, r1)
            X.2WX r8 = new X.2WX
            r8.<init>(r4, r3)
            r1 = 15
            X.9M5 r4 = new X.9M5
            r4.<init>(r1, r0, r9)
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            r2 = 4
            X.9JS r1 = new X.9JS
            r1.<init>(r3, r4, r2)
            X.2WX r4 = new X.2WX
            r4.<init>(r8, r1)
            r1 = 2131976220(0x7f13601c, float:1.9589554E38)
            java.lang.String r3 = X.C244013aV.A0E(r0, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            X.9JS r1 = new X.9JS
            r1.<init>(r2, r3, r5)
            X.2WX r3 = new X.2WX
            r3.<init>(r4, r1)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER
            X.2V1 r1 = r0.A05
            X.3gG r1 = X.C247373gE.A00(r1)
            r1.A0D(r7)
            r1.A0E(r2)
            r1.A0C()
            X.C244123ag.A00(r1, r3)
            X.3gE r4 = r1.A0A()
        L_0x06e3:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            X.3gi r3 = r6.A00
            android.content.Context r1 = X.C243803a8.A00(r0)
            X.C255903uu.A00(r1, r11, r3)
            boolean r1 = r3.A05
            r12 = 0
            if (r1 == 0) goto L_0x0788
            int r1 = r11.length()
            if (r1 <= 0) goto L_0x0788
            boolean r2 = r3.A09
            if (r2 == 0) goto L_0x07f6
            X.3gh r1 = r3.A00
            X.0sP r6 = r1.A08
        L_0x0704:
            if (r2 != 0) goto L_0x07f3
            boolean r1 = r3.A0A
            if (r1 == 0) goto L_0x07d8
            X.3XV r1 = X.2WX.A02
            X.3aa r1 = X.C244063aa.VIDEO_VIEW_COUNT
            android.util.SparseArray r7 = X.C244083ac.A00(r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            r2 = 4
            X.9JS r1 = new X.9JS
            r1.<init>(r3, r7, r2)
            X.2WX r3 = new X.2WX
            r3.<init>(r12, r1)
        L_0x071f:
            X.3Zv r2 = X.C243683Zu.A0E
            android.content.Context r1 = X.C243803a8.A00(r0)
            X.3Zu r1 = r2.A01(r1)
            int r1 = r1.A06
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
            android.text.method.MovementMethod r13 = android.text.method.LinkMovementMethod.getInstance()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r5)
            r7 = 2131165190(0x7f070006, float:1.794459E38)
            long r1 = X.C244013aV.A0C(r0, r7)
            X.2Wd r15 = new X.2Wd
            r15.<init>(r1)
            X.3XV r1 = X.2WX.A02
            long r1 = X.C244013aV.A0C(r0, r7)
            java.lang.Integer r8 = X.AnonymousClass05K.A1F
            X.9JR r7 = new X.9JR
            r7.<init>(r8, r5, r1)
            X.2WX r10 = new X.2WX
            r10.<init>(r12, r7)
            X.3Zh r9 = X.C243573Zh.CENTER
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r2 = 3
            X.9JS r1 = new X.9JS
            r1.<init>(r7, r9, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r10, r1)
            X.2WX r7 = r2.A00(r3)
            if (r6 == 0) goto L_0x077d
            r1 = 16
            X.9M5 r3 = new X.9M5
            r3.<init>(r1, r0, r6)
            r1 = 4
            X.9JS r2 = new X.9JS
            r2.<init>(r8, r3, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r12, r2)
            r12 = r1
        L_0x077d:
            X.2WX r14 = r7.A00(r12)
            X.4KH r12 = new X.4KH
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0788:
            r1 = 0
            if (r4 != 0) goto L_0x078d
            if (r12 == 0) goto L_0x01cb
        L_0x078d:
            X.3XV r2 = X.2WX.A02
            r2 = 2131165231(0x7f07002f, float:1.7944673E38)
            long r2 = X.C244013aV.A0C(r0, r2)
            java.lang.Integer r7 = X.AnonymousClass05K.A04
            X.9JR r6 = new X.9JR
            r6.<init>(r7, r5, r2)
            X.2WX r8 = new X.2WX
            r8.<init>(r1, r6)
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            long r2 = X.C244013aV.A0C(r0, r2)
            java.lang.Integer r7 = X.AnonymousClass05K.A0A
            X.9JR r6 = new X.9JR
            r6.<init>(r7, r5, r2)
            X.2WX r7 = new X.2WX
            r7.<init>(r8, r6)
            X.2V1 r6 = r0.A05
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.2Wb r2 = new X.2Wb
            r2.<init>(r6, r3)
            if (r4 == 0) goto L_0x07c6
            r2.A00(r4)
        L_0x07c6:
            if (r12 == 0) goto L_0x07cb
            r2.A00(r12)
        L_0x07cb:
            r8 = r2
            r9 = r0
            r10 = r7
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r5
            X.2Tp r1 = X.C243563Zg.A0H(r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x07d8:
            boolean r1 = r3.A07
            if (r1 == 0) goto L_0x07f3
            X.3XV r1 = X.2WX.A02
            X.3aa r1 = X.C244063aa.VIEW_LIKES
            android.util.SparseArray r7 = X.C244083ac.A00(r1)
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            r2 = 4
            X.9JS r1 = new X.9JS
            r1.<init>(r3, r7, r2)
            X.2WX r3 = new X.2WX
            r3.<init>(r12, r1)
            goto L_0x071f
        L_0x07f3:
            r3 = r12
            goto L_0x071f
        L_0x07f6:
            boolean r1 = r3.A0A
            if (r1 != 0) goto L_0x0801
            boolean r1 = r3.A07
            if (r1 != 0) goto L_0x0801
            r6 = r12
            goto L_0x0704
        L_0x0801:
            X.3gh r1 = r3.A00
            X.0sP r6 = r1.A03
            goto L_0x0704
        L_0x0807:
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x0813
            X.3gi r1 = r6.A00
            X.3gh r1 = r1.A00
            X.0sP r9 = r1.A03
            goto L_0x068b
        L_0x0813:
            r9 = r4
            goto L_0x068b
        L_0x0816:
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x0822
            X.3gi r1 = r6.A00
            X.3gh r1 = r1.A00
            X.0sP r2 = r1.A0A
            goto L_0x0679
        L_0x0822:
            r7 = r4
            goto L_0x0683
        L_0x0825:
            boolean r1 = r2 instanceof X.C248573iD
            if (r1 == 0) goto L_0x08ca
            r10 = r2
            X.3iD r10 = (X.C248573iD) r10
            r11 = 0
            X.0qQ.A0B(r0, r11)
            X.4Er r1 = X.AnonymousClass4Er.A00
            X.3Zt r9 = X.C243633Zp.A00(r0, r1)
            X.JwM r12 = r10.A00
            r1 = 0
            if (r12 == 0) goto L_0x01cb
            java.lang.Object r8 = r12.A02
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r2 = X.00l.A0W(r8)
            if (r2 != 0) goto L_0x01cb
            android.text.method.MovementMethod r14 = android.text.method.LinkMovementMethod.getInstance()
            long r2 = X.C244013aV.A04(r0)
            X.3XV r4 = X.2WX.A02
            long r4 = X.C244013aV.A0B(r0)
            long r6 = X.C244013aV.A05(r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A04
            X.9JR r0 = new X.9JR
            r0.<init>(r13, r11, r4)
            X.2WX r5 = new X.2WX
            r5.<init>(r1, r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            X.9JR r0 = new X.9JR
            r0.<init>(r4, r11, r6)
            X.2WX r7 = new X.2WX
            r7.<init>(r5, r0)
            X.3aa r0 = X.C244063aa.DISCLAIMER
            android.util.SparseArray r6 = X.C244083ac.A00(r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0E
            r4 = 4
            X.9JS r0 = new X.9JS
            r0.<init>(r5, r6, r4)
            X.2WX r6 = new X.2WX
            r6.<init>(r7, r0)
            java.lang.Object r5 = r12.A01
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            com.instagram.common.session.UserSession r4 = r10.A01
            X.4DU r0 = r10.A02
            X.3Ds r15 = X.C238863Ds.USER_MESSAGE
            r16 = r6
            r17 = r4
            r18 = r5
            r19 = r0
            r20 = r1
            r21 = r11
            r22 = r11
            X.2WX r5 = X.C244223aq.A00(r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = 9
            X.J6H r4 = new X.J6H
            r4.<init>(r10, r0)
            java.lang.String r0 = "branded-content"
            X.2WX r15 = X.C244243as.A00(r9, r5, r0, r4)
            X.2Wd r4 = new X.2Wd
            r4.<init>(r2)
            r0 = 2
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
            X.2WU r17 = X.C244473bF.A0C
            X.3bF r12 = new X.3bF
            r13 = r1
            r16 = r4
            r18 = r1
            r19 = r8
            r21 = r1
            r23 = r1
            r24 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r12
        L_0x08ca:
            boolean r1 = r2 instanceof X.C248593iF
            if (r1 == 0) goto L_0x0a29
            r5 = r2
            X.3iF r5 = (X.C248593iF) r5
            r9 = 0
            X.0qQ.A0B(r0, r9)
            X.JwG r2 = r5.A00
            r1 = 0
            if (r2 == 0) goto L_0x01cb
            r2 = 2131965828(0x7f133784, float:1.9568477E38)
            java.lang.String r2 = X.C244013aV.A0E(r0, r2)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r2)
            X.2V1 r8 = r0.A05
            android.content.Context r10 = r8.A0C
            r2 = 2130970246(0x7f040686, float:1.7549197E38)
            int r3 = X.2Yu.A0H(r10, r2)
            X.2V4 r2 = r0.Bnf()
            int r2 = r2.A02(r3)
            X.Kat r4 = new X.Kat
            r4.<init>(r5, r2)
            int r3 = r11.length()
            r2 = 18
            r11.setSpan(r4, r9, r3, r2)
            X.3XV r2 = X.2WX.A02
            r2 = 2131165231(0x7f07002f, float:1.7944673E38)
            long r6 = X.C244013aV.A0C(r0, r2)
            long r4 = X.C244013aV.A0C(r0, r2)
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            long r2 = X.C244013aV.A0C(r0, r2)
            java.lang.Integer r12 = X.AnonymousClass05K.A0u
            X.9JR r13 = new X.9JR
            r13.<init>(r12, r9, r6)
            X.2WX r12 = new X.2WX
            r12.<init>(r1, r13)
            java.lang.Integer r6 = X.AnonymousClass05K.A1F
            X.9JR r7 = new X.9JR
            r7.<init>(r6, r9, r4)
            X.2WX r6 = new X.2WX
            r6.<init>(r12, r7)
            java.lang.Integer r5 = X.AnonymousClass05K.A1I
            X.9JR r4 = new X.9JR
            r4.<init>(r5, r9, r2)
            X.2WX r5 = new X.2WX
            r5.<init>(r6, r4)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            java.lang.String r3 = "android.widget.Button"
            X.9JS r2 = new X.9JS
            r2.<init>(r4, r3, r9)
            X.2WX r13 = new X.2WX
            r13.<init>(r5, r2)
            r2 = 2131956423(0x7f1312c7, float:1.9549401E38)
            java.lang.String r2 = r8.A09(r2)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r2)
            java.lang.String r2 = " "
            android.text.SpannableStringBuilder r2 = r3.append(r2)
            android.text.SpannableStringBuilder r15 = r2.append(r11)
            r2 = 2131165216(0x7f070020, float:1.7944643E38)
            long r6 = X.C244013aV.A0C(r0, r2)
            r3 = 2131100175(0x7f06020f, float:1.7812724E38)
            X.2V4 r2 = r0.Bnf()
            int r16 = r2.A02(r3)
            r2 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r3 = X.2Yu.A0H(r10, r2)
            X.2V4 r2 = r0.Bnf()
            int r14 = r2.A02(r3)
            r2 = 2131165200(0x7f070010, float:1.794461E38)
            long r4 = X.C244013aV.A0C(r0, r2)
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
            android.graphics.Typeface r11 = android.graphics.Typeface.DEFAULT
            r2 = 0
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.3ae r8 = X.2WW.A00(r8, r9)
            r8.A0V(r15)
            r8.A0U(r1)
            r8.A0P(r14)
            X.2V4 r14 = r0.Bnf()
            int r6 = X.2Wd.A00(r14, r6)
            r8.A0Q(r6)
            r8.A0R(r9)
            r8.A0S(r11)
            r6 = -7829368(0xffffffffff888888, float:NaN)
            r8.A0O(r6)
            X.2V4 r6 = r0.Bnf()
            int r6 = X.2Wd.A00(r6, r2)
            float r6 = (float) r6
            r8.A0K(r6)
            X.2V4 r6 = r0.Bnf()
            int r6 = X.2Wd.A00(r6, r2)
            float r6 = (float) r6
            r8.A0I(r6)
            X.2V4 r6 = r0.Bnf()
            int r6 = X.2Wd.A00(r6, r2)
            float r6 = (float) r6
            r8.A0J(r6)
            X.2V4 r6 = r0.Bnf()
            int r2 = X.2Wd.A00(r6, r2)
            float r2 = (float) r2
            r8.A0H(r2)
            r8.A0W(r12)
            r8.A0C()
            r8.A0X(r10)
            r2 = 1067702026(0x3fa3d70a, float:1.28)
            r8.A0L(r2)
            r8.A0a(r9)
            r8.A0N(r9)
            r3 = 1
            r8.A0M(r3)
            X.2V4 r0 = r0.Bnf()
            int r0 = X.2Wd.A00(r0, r4)
            float r0 = (float) r0
            X.2WW r2 = r8.A01
            r2.A00 = r0
            r8.A0b(r9)
            r8.A0Y(r9)
            r8.A0Z(r3)
            r8.A05(r1)
            r0 = r16
            r2.A08 = r0
            X.C244123ag.A00(r8, r13)
            X.2WW r1 = r8.A0A()
            return r1
        L_0x0a29:
            boolean r1 = r2 instanceof X.C248613iH
            if (r1 == 0) goto L_0x0be4
            r12 = r2
            X.3iH r12 = (X.C248613iH) r12
            r11 = 0
            X.0qQ.A0B(r0, r11)
            X.9If r6 = r12.A00
            r1 = 0
            if (r6 == 0) goto L_0x01cb
            r3 = 36
            X.9Kt r2 = new X.9Kt
            r2.<init>(r12, r3)
            X.2Wa r14 = X.C243643Zq.A00(r0, r2)
            r3 = 300(0x12c, float:4.2E-43)
            X.4Ew r2 = X.2Vi.A01
            X.4Ex r7 = new X.4Ex
            r7.<init>(r3)
            X.3Zd r4 = X.C243533Zd.LOCAL
            java.lang.String r3 = "VIEW_ALL_COMMENTS_BUTTON_TEXT"
            X.4Ey r5 = X.2Vi.A00(r4, r3)
            X.3du r2 = X.C246033ds.A00
            r5.A03(r2)
            r2 = 0
            r5.A01(r2)
            X.3du r2 = X.C246033ds.A05
            r5.A03(r2)
            X.2V1 r10 = r0.A05
            android.content.Context r8 = r10.A0C
            r2 = 10
            X.4F6 r2 = X.AnonymousClass4F6.A00(r8, r2)
            r5.A04(r2)
            r5.A02 = r7
            X.AnonymousClass4F7.A00(r0, r5)
            X.4LM r13 = new X.4LM
            r13.<init>(r14)
            r9 = 1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            java.lang.Object[] r7 = new java.lang.Object[]{r2}
            r5 = 15
            X.9Ls r2 = new X.9Ls
            r2.<init>(r5, r13, r12)
            X.C243773a4.A00(r0, r2, r7)
            java.lang.Object r2 = r14.A03
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01cb
            boolean r2 = r6.A04
            if (r2 == 0) goto L_0x0be1
            X.3XV r2 = X.2WX.A02
            X.3Ze r2 = new X.3Ze
            r2.<init>(r10, r4, r3)
            X.2WX r14 = new X.2WX
            r14.<init>(r1, r2)
        L_0x0aa8:
            X.3XV r7 = X.2WX.A02
            r2 = 2131165231(0x7f07002f, float:1.7944673E38)
            long r4 = X.C244013aV.A0C(r0, r2)
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            long r2 = X.C244013aV.A0C(r0, r2)
            java.lang.Integer r15 = X.AnonymousClass05K.A0u
            X.9JR r13 = new X.9JR
            r13.<init>(r15, r11, r4)
            X.2WX r15 = new X.2WX
            r15.<init>(r1, r13)
            java.lang.Integer r5 = X.AnonymousClass05K.A1I
            X.9JR r4 = new X.9JR
            r4.<init>(r5, r11, r2)
            X.2WX r13 = new X.2WX
            r13.<init>(r15, r4)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            java.lang.String r3 = "android.widget.Button"
            X.9JS r2 = new X.9JS
            r2.<init>(r4, r3, r11)
            X.2WX r5 = new X.2WX
            r5.<init>(r13, r2)
            X.3aa r2 = X.C244063aa.VIEW_ALL_COMMENTS
            android.util.SparseArray r4 = X.C244083ac.A00(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0E
            r13 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r2, r4, r13)
            X.2WX r2 = new X.2WX
            r2.<init>(r5, r3)
            X.2WX r5 = r2.A00(r14)
            boolean r2 = r12.A01
            if (r2 == 0) goto L_0x0bde
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            X.9JS r3 = new X.9JS
            r3.<init>(r4, r2, r11)
            X.2WX r2 = new X.2WX
            r2.<init>(r1, r3)
        L_0x0b09:
            X.2WX r5 = r5.A00(r2)
            r2 = 22
            X.9Ld r4 = new X.9Ld
            r4.<init>(r12, r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            X.9JS r2 = new X.9JS
            r2.<init>(r3, r4, r13)
            if (r5 != r7) goto L_0x0b1e
            r5 = r1
        L_0x0b1e:
            X.2WX r15 = new X.2WX
            r15.<init>(r5, r2)
            java.lang.Object r14 = r6.A03
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r2 = 2131165216(0x7f070020, float:1.7944643E38)
            long r6 = X.C244013aV.A0C(r0, r2)
            r2 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r3 = X.2Yu.A0H(r8, r2)
            X.2V4 r2 = r0.Bnf()
            int r16 = r2.A02(r3)
            r2 = 2131165200(0x7f070010, float:1.794461E38)
            long r4 = X.C244013aV.A0C(r0, r2)
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            android.graphics.Typeface r12 = android.graphics.Typeface.DEFAULT
            r2 = 0
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.3ae r10 = X.2WW.A00(r10, r11)
            r10.A0V(r14)
            r10.A0U(r1)
            r14 = r16
            r10.A0P(r14)
            X.2V4 r14 = r0.Bnf()
            int r6 = X.2Wd.A00(r14, r6)
            r10.A0Q(r6)
            r10.A0R(r11)
            r10.A0S(r12)
            r6 = -7829368(0xffffffffff888888, float:NaN)
            r10.A0O(r6)
            X.2V4 r6 = r0.Bnf()
            int r6 = X.2Wd.A00(r6, r2)
            float r6 = (float) r6
            r10.A0K(r6)
            X.2V4 r6 = r0.Bnf()
            int r6 = X.2Wd.A00(r6, r2)
            float r6 = (float) r6
            r10.A0I(r6)
            X.2V4 r6 = r0.Bnf()
            int r6 = X.2Wd.A00(r6, r2)
            float r6 = (float) r6
            r10.A0J(r6)
            X.2V4 r6 = r0.Bnf()
            int r2 = X.2Wd.A00(r6, r2)
            float r2 = (float) r2
            r10.A0H(r2)
            r10.A0W(r13)
            r10.A0C()
            r10.A0X(r8)
            r2 = 1065353216(0x3f800000, float:1.0)
            r10.A0L(r2)
            r10.A0a(r11)
            r10.A0N(r11)
            r10.A0M(r9)
            X.2V4 r0 = r0.Bnf()
            int r0 = X.2Wd.A00(r0, r4)
            float r2 = (float) r0
            X.2WW r0 = r10.A01
            r0.A00 = r2
            r10.A0b(r11)
            r10.A0Y(r11)
            r10.A0Z(r9)
            r10.A05(r1)
            X.C244123ag.A00(r10, r15)
            X.2WW r1 = r10.A0A()
            return r1
        L_0x0bde:
            r2 = r1
            goto L_0x0b09
        L_0x0be1:
            r14 = r1
            goto L_0x0aa8
        L_0x0be4:
            boolean r1 = r2 instanceof X.C248633iJ
            if (r1 == 0) goto L_0x0d64
            r3 = r2
            X.3iJ r3 = (X.C248633iJ) r3
            r8 = 0
            X.0qQ.A0B(r0, r8)
            X.0sa r1 = r3.A01
            java.lang.Object r6 = r1.invoke()
            X.9IV r6 = (X.AnonymousClass9IV) r6
            r1 = 0
            if (r6 == 0) goto L_0x01cb
            java.lang.Object r2 = r6.A01
            com.instagram.api.schemas.TestimonialDict r2 = (com.instagram.api.schemas.TestimonialDict) r2
            if (r2 == 0) goto L_0x01cb
            com.instagram.user.model.User r13 = r2.Adx()
            if (r13 == 0) goto L_0x01cb
            java.lang.String r14 = r2.getText()
            if (r14 == 0) goto L_0x01cb
            com.instagram.common.session.UserSession r5 = r3.A00
            X.0Tu r4 = X.0Tu.A05
            r2 = 36330634435773135(0x811285000242cf, double:3.038977736681057E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x01cb
            java.lang.Object r2 = r6.A00
            X.9IE r2 = (X.AnonymousClass9IE) r2
            java.lang.Object r2 = r2.A00
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r4 = r2.invoke()
            X.3fL r4 = (X.C246853fL) r4
            X.7fL r10 = X.C336887fL.A00
            X.2V1 r9 = r0.A05
            android.content.Context r2 = r9.A0C
            r22 = r2
            X.0qQ.A07(r22)
            r2 = 38
            X.J6H r6 = new X.J6H
            r6.<init>(r4, r2)
            r3 = 39
            X.J6H r2 = new X.J6H
            r2.<init>(r4, r3)
            r19 = 2130970246(0x7f040686, float:1.7549197E38)
            r20 = 2130971404(0x7f040b0c, float:1.7551545E38)
            X.0sn r15 = X.0sn.A00
            X.DPo r18 = X.C46187DPo.A00
            r11 = r22
            r12 = r5
            r16 = r6
            r17 = r2
            r21 = r8
            android.text.SpannableStringBuilder r18 = r10.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.3XV r2 = X.2WX.A02
            X.3Zh r5 = X.C243573Zh.FLEX_START
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r3 = 3
            X.9JS r2 = new X.9JS
            r2.<init>(r11, r5, r3)
            X.2WX r12 = new X.2WX
            r12.<init>(r1, r2)
            long r2 = X.C244013aV.A0B(r0)
            r5 = 0
            long r6 = java.lang.Double.doubleToRawLongBits(r5)
            java.lang.Integer r5 = X.AnonymousClass05K.A04
            X.9JR r10 = new X.9JR
            r10.<init>(r5, r8, r2)
            X.2WX r5 = new X.2WX
            r5.<init>(r12, r10)
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            X.9JR r2 = new X.9JR
            r2.<init>(r3, r8, r6)
            X.2WX r3 = new X.2WX
            r3.<init>(r5, r2)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            r12 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            X.9JQ r2 = new X.9JQ
            r2.<init>(r13, r12, r10)
            X.2WX r14 = new X.2WX
            r14.<init>(r3, r2)
            r2 = 37
            X.J6H r15 = new X.J6H
            r15.<init>(r4, r2)
            java.lang.Integer r5 = X.AnonymousClass05K.A1F
            r3 = 4
            X.9JS r2 = new X.9JS
            r2.<init>(r5, r15, r3)
            X.2WX r3 = new X.2WX
            r3.<init>(r14, r2)
            X.2WX r2 = r4.B57()
            X.2WX r17 = r3.A00(r2)
            int r3 = X.2Yu.A07(r22)
            X.2V4 r2 = r0.Bnf()
            int r16 = r2.A02(r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            r2 = r22
            android.graphics.Typeface r14 = X.0oh.A03(r2, r3, r11)
            long r4 = X.C244013aV.A04(r0)
            long r2 = X.C244013aV.A07(r0)
            X.3ae r15 = X.2WW.A00(r9, r8)
            r9 = r18
            r15.A0V(r9)
            r15.A0U(r1)
            r9 = r16
            r15.A0P(r9)
            X.2V4 r9 = r0.Bnf()
            int r4 = X.2Wd.A00(r9, r4)
            r15.A0Q(r4)
            r15.A0R(r8)
            r15.A0S(r14)
            r15.A0F()
            X.2V4 r4 = r0.Bnf()
            int r4 = X.2Wd.A00(r4, r6)
            float r4 = (float) r4
            r15.A0K(r4)
            X.2V4 r4 = r0.Bnf()
            int r4 = X.2Wd.A00(r4, r6)
            float r4 = (float) r4
            r15.A0I(r4)
            X.2V4 r4 = r0.Bnf()
            int r4 = X.2Wd.A00(r4, r6)
            float r4 = (float) r4
            r15.A0J(r4)
            X.2V4 r4 = r0.Bnf()
            int r4 = X.2Wd.A00(r4, r6)
            float r4 = (float) r4
            r15.A0H(r4)
            r15.A0W(r11)
            r15.A0C()
            r15.A0X(r13)
            r15.A0L(r12)
            r15.A0a(r8)
            r15.A0N(r8)
            r4 = 5
            r15.A0M(r4)
            X.2V4 r0 = r0.Bnf()
            int r0 = X.2Wd.A00(r0, r2)
            float r2 = (float) r0
            X.2WW r0 = r15.A01
            r0.A00 = r2
            r15.A0b(r10)
            r15.A0Y(r8)
            r15.A0Z(r8)
            r15.A0D()
            r15.A05(r1)
            r0 = r17
            X.C244123ag.A00(r15, r0)
            X.2WW r1 = r15.A0A()
            return r1
        L_0x0d64:
            boolean r1 = r2 instanceof X.C248663iN
            if (r1 == 0) goto L_0x0e14
            r10 = r2
            X.3iN r10 = (X.C248663iN) r10
            r7 = 0
            X.0qQ.A0B(r0, r7)
            X.0sa r1 = r10.A00
            java.lang.Object r3 = r1.invoke()
            X.9IP r3 = (X.AnonymousClass9IP) r3
            r1 = 0
            if (r3 == 0) goto L_0x01cb
            java.lang.Object r4 = r3.A01
            android.text.SpannableStringBuilder r4 = (android.text.SpannableStringBuilder) r4
            int r2 = r4.length()
            if (r2 == 0) goto L_0x01cb
            X.3XV r2 = X.2WX.A02
            r2 = 2131165231(0x7f07002f, float:1.7944673E38)
            long r5 = X.C244013aV.A0C(r0, r2)
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x0e0d
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            long r2 = X.C244013aV.A0C(r0, r2)
        L_0x0d98:
            java.lang.Integer r8 = X.AnonymousClass05K.A04
            r11 = r1
            X.9JR r9 = new X.9JR
            r9.<init>(r8, r7, r5)
            X.2WX r8 = new X.2WX
            r8.<init>(r1, r9)
            java.lang.Integer r6 = X.AnonymousClass05K.A1I
            X.9JR r5 = new X.9JR
            r5.<init>(r6, r7, r2)
            X.2WX r6 = new X.2WX
            r6.<init>(r8, r5)
            boolean r2 = r10.A01
            if (r2 == 0) goto L_0x0dc7
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.9JS r3 = new X.9JS
            r3.<init>(r5, r2, r7)
            X.2WX r2 = new X.2WX
            r2.<init>(r1, r3)
            r1 = r2
        L_0x0dc7:
            X.2WX r13 = r6.A00(r1)
            X.2V1 r1 = r0.A05
            android.content.Context r2 = r1.A0C
            r1 = 2130970310(0x7f0406c6, float:1.7549327E38)
            int r2 = X.2Yu.A0H(r2, r1)
            X.2V4 r1 = r0.Bnf()
            int r2 = r1.A02(r2)
            r1 = 2131165249(0x7f070041, float:1.794471E38)
            long r0 = X.C244013aV.A0C(r0, r1)
            android.text.method.MovementMethod r12 = android.text.method.LinkMovementMethod.getInstance()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            X.2Wd r2 = new X.2Wd
            r2.<init>(r0)
            r0 = 1068121457(0x3faa3d71, float:1.33)
            java.lang.Float r18 = java.lang.Float.valueOf(r0)
            X.2WU r15 = X.C244473bF.A0C
            X.3bF r1 = new X.3bF
            r10 = r1
            r14 = r2
            r16 = r11
            r17 = r4
            r20 = r11
            r21 = r11
            r22 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
        L_0x0e0d:
            r2 = 0
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            goto L_0x0d98
        L_0x0e14:
            boolean r1 = r2 instanceof X.C248673iO
            if (r1 == 0) goto L_0x0e6e
            r1 = r2
            X.3iO r1 = (X.C248673iO) r1
            r6 = 0
            X.0qQ.A0B(r0, r6)
            boolean r2 = r1.A00
            r1 = 0
            if (r2 == 0) goto L_0x01cb
            X.3Zi r10 = X.C243583Zi.CENTER
            X.2V1 r2 = r0.A05
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r7 = new X.2Wb
            r7.<init>(r2, r0)
            X.3XV r0 = X.2WX.A02
            r8 = 2131165266(0x7f070052, float:1.7944744E38)
            long r2 = X.C244013aV.A0C(r7, r8)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.9JR r0 = new X.9JR
            r0.<init>(r4, r6, r2)
            X.2WX r5 = new X.2WX
            r5.<init>(r1, r0)
            long r3 = X.C244013aV.A0C(r7, r8)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.9JR r0 = new X.9JR
            r0.<init>(r2, r6, r3)
            X.2WX r3 = new X.2WX
            r3.<init>(r5, r0)
            X.3uy r2 = X.C255943uy.LOADING
            X.Gwf r0 = new X.Gwf
            r0.<init>(r3, r2)
            r7.A00(r0)
            java.util.List r0 = r7.A01
            X.2Tp r7 = new X.2Tp
            r8 = r1
            r9 = r1
            r11 = r1
            r12 = r0
            r13 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0e6e:
            boolean r1 = r2 instanceof X.C248683iP
            if (r1 == 0) goto L_0x0efc
            r10 = r2
            X.3iP r10 = (X.C248683iP) r10
            r8 = 0
            X.0qQ.A0B(r0, r8)
            X.3ha r9 = r10.A00
            r1 = 0
            if (r9 == 0) goto L_0x01cb
            X.3XV r2 = X.2WX.A02
            X.2V1 r2 = r0.A05
            android.content.Context r2 = r2.A0C
            int r3 = X.2Yu.A04(r2)
            X.2V4 r2 = r0.Bnf()
            int r2 = r2.A02(r3)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.7gD r3 = new X.7gD
            r3.<init>(r2)
            r6 = 4
            X.9JS r2 = new X.9JS
            r2.<init>(r4, r3, r6)
            X.2WX r4 = new X.2WX
            r4.<init>(r1, r2)
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            java.lang.String r3 = "android.widget.Button"
            X.9JS r2 = new X.9JS
            r2.<init>(r7, r3, r8)
            X.2WX r11 = new X.2WX
            r11.<init>(r4, r2)
            java.lang.String r3 = r9.A03
            r2 = 2131952047(0x7f1301af, float:1.9540526E38)
            if (r3 == 0) goto L_0x0ef7
            java.lang.String r4 = X.C244013aV.A0F(r0, r3, r2)
        L_0x0ebb:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            X.9JS r2 = new X.9JS
            r2.<init>(r3, r4, r8)
            X.2WX r5 = new X.2WX
            r5.<init>(r11, r2)
            r2 = 8
            X.J6H r4 = new X.J6H
            r4.<init>(r10, r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            X.9JS r2 = new X.9JS
            r2.<init>(r3, r4, r6)
            X.2WX r6 = new X.2WX
            r6.<init>(r5, r2)
            boolean r2 = r9.A04
            if (r2 == 0) goto L_0x0eee
            r4 = 9221401712017801264(0x7ff9000000000030, double:NaN)
            X.9JR r3 = new X.9JR
            r3.<init>(r7, r8, r4)
            X.2WX r2 = new X.2WX
            r2.<init>(r1, r3)
            r1 = r2
        L_0x0eee:
            X.2WX r1 = r6.A00(r1)
            X.2Tp r1 = X.C243563Zg.A0L(r0, r1)
            return r1
        L_0x0ef7:
            java.lang.String r4 = X.C244013aV.A0E(r0, r2)
            goto L_0x0ebb
        L_0x0efc:
            boolean r1 = r2 instanceof X.C249263jP
            if (r1 == 0) goto L_0x0f53
            r4 = r2
            X.3jP r4 = (X.C249263jP) r4
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Integer r8 = r4.A04
            if (r8 == 0) goto L_0x0f4f
            int r2 = r8.intValue()
            int r1 = r8.intValue()
        L_0x0f13:
            int r10 = r4.A00
            int[] r2 = new int[]{r2, r1, r10, r10}
            int r9 = r4.A01
            X.2V1 r3 = r0.A05
            X.2V4 r7 = r3.A0D
            X.0qQ.A07(r7)
            android.content.Context r6 = r3.A0C
            X.0qQ.A07(r6)
            X.4Dn r5 = new X.4Dn
            r5.<init>(r6, r7, r8, r9, r10)
            int[][] r1 = X.C249263jP.A05
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r1, r2)
            r5.setTintList(r0)
            android.widget.ImageView$ScaleType r2 = r4.A02
            X.2WX r1 = r4.A03
            X.3gG r0 = X.C247373gE.A00(r3)
            r0.A0D(r5)
            r0.A0E(r2)
            r0.A0C()
            X.C244123ag.A00(r0, r1)
            X.3gE r1 = r0.A0A()
            return r1
        L_0x0f4f:
            int r2 = r4.A00
            r1 = r2
            goto L_0x0f13
        L_0x0f53:
            boolean r1 = r2 instanceof X.C249273jQ
            if (r1 == 0) goto L_0x114f
            r10 = r2
            X.3jQ r10 = (X.C249273jQ) r10
            r7 = 0
            X.0qQ.A0B(r0, r7)
            java.lang.String r1 = r10.A05
            r21 = r1
            r20 = 1
            if (r1 == 0) goto L_0x114b
            int r1 = r21.length()
            if (r1 == 0) goto L_0x114b
            boolean r1 = r10.A0A
            if (r1 == 0) goto L_0x114b
        L_0x0f70:
            X.2WX r4 = r10.A03
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r3 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r2 = new X.9JQ
            r2.<init>(r11, r3, r7)
            X.3XV r19 = X.2WX.A02
            r9 = 0
            r1 = r19
            if (r4 != r1) goto L_0x0f83
            r4 = r9
        L_0x0f83:
            X.2WX r18 = new X.2WX
            r1 = r18
            r1.<init>(r4, r2)
            X.3Zi r34 = X.C243583Zi.CENTER
            X.3Zh r39 = X.C243573Zh.CENTER
            X.2V1 r2 = r0.A05
            r17 = 2
            r22 = r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r6 = new X.2Wb
            r6.<init>(r2, r1)
            X.9JQ r1 = new X.9JQ
            r1.<init>(r11, r3, r7)
            X.2WX r3 = new X.2WX
            r3.<init>(r9, r1)
            r1 = 11
            X.9Ld r2 = new X.9Ld
            r2.<init>(r10, r1)
            java.lang.Integer r8 = X.AnonymousClass05K.A1F
            r5 = 4
            X.9JS r1 = new X.9JS
            r1.<init>(r8, r2, r5)
            X.2WX r13 = new X.2WX
            r13.<init>(r3, r1)
            r4 = 0
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r2 = 1
            X.9JQ r1 = new X.9JQ
            r1.<init>(r3, r4, r2)
            X.2WX r12 = new X.2WX
            r12.<init>(r13, r1)
            X.0sP r4 = r10.A07
            if (r4 == 0) goto L_0x1148
            r1 = 12
            X.9Ld r3 = new X.9Ld
            r3.<init>(r4, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            X.9JS r2 = new X.9JS
            r2.<init>(r1, r3, r5)
            X.2WX r1 = new X.2WX
            r1.<init>(r9, r2)
        L_0x0fe1:
            X.2WX r12 = r12.A00(r1)
            X.0sP r3 = r10.A09
            if (r3 == 0) goto L_0x1145
            r1 = 13
            X.9Ld r13 = new X.9Ld
            r13.<init>(r3, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            X.9JS r2 = new X.9JS
            r2.<init>(r1, r13, r5)
            X.2WX r1 = new X.2WX
            r1.<init>(r9, r2)
        L_0x0ffc:
            X.2WX r15 = r12.A00(r1)
            boolean r12 = r10.A0A
            if (r12 == 0) goto L_0x1130
            r1 = r9
        L_0x1005:
            X.2WX r16 = r15.A00(r1)
            if (r12 == 0) goto L_0x112d
            java.lang.Integer r1 = r10.A04
            if (r1 == 0) goto L_0x112d
            int r1 = r1.intValue()
            long r13 = X.C244013aV.A0C(r6, r1)
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.9JR r2 = new X.9JR
            r1 = r17
            r2.<init>(r15, r1, r13)
            X.2WX r13 = new X.2WX
            r13.<init>(r9, r2)
        L_0x1025:
            r1 = r16
            X.2WX r14 = r1.A00(r13)
            if (r12 == 0) goto L_0x1124
            int r1 = r10.A01
            long r1 = X.C244013aV.A0C(r6, r1)
            int r12 = r10.A00
            long r15 = X.C244013aV.A0C(r6, r12)
        L_0x1039:
            java.lang.Integer r12 = X.AnonymousClass05K.A0u
            X.9JR r13 = new X.9JR
            r13.<init>(r12, r7, r1)
            r1 = r19
            if (r14 != r1) goto L_0x1045
            r14 = r9
        L_0x1045:
            X.2WX r12 = new X.2WX
            r12.<init>(r14, r13)
            X.9JR r13 = new X.9JR
            r1 = r15
            r13.<init>(r8, r7, r1)
            X.2WX r2 = new X.2WX
            r2.<init>(r12, r13)
            X.2V1 r13 = r6.A00
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r12 = new X.2Wb
            r12.<init>(r13, r1)
            X.3mp r1 = r10.A02
            r12.A00(r1)
            r29 = r12
            r30 = r6
            r31 = r2
            r32 = r9
            r33 = r9
            r35 = r9
            r36 = r7
            X.2Tp r1 = X.C243563Zg.A0H(r29, r30, r31, r32, r33, r34, r35, r36)
            r6.A00(r1)
            if (r20 == 0) goto L_0x110f
            if (r21 != 0) goto L_0x1081
            java.lang.String r21 = ""
        L_0x1081:
            android.content.Context r2 = X.C243803a8.A00(r6)
            r1 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r1 = X.2Yu.A0H(r2, r1)
            int r1 = r2.getColor(r1)
            java.lang.Integer r30 = java.lang.Integer.valueOf(r1)
            r1 = 14
            X.9Ld r2 = new X.9Ld
            r2.<init>(r10, r1)
            X.9JS r1 = new X.9JS
            r1.<init>(r8, r2, r5)
            X.2WX r12 = new X.2WX
            r12.<init>(r9, r1)
            r2 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r1 = new X.9JQ
            r1.<init>(r11, r2, r7)
            X.2WX r8 = new X.2WX
            r8.<init>(r12, r1)
            if (r4 == 0) goto L_0x1122
            r1 = 15
            X.9Ld r4 = new X.9Ld
            r4.<init>(r10, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            X.9JS r2 = new X.9JS
            r2.<init>(r1, r4, r5)
            X.2WX r1 = new X.2WX
            r1.<init>(r9, r2)
        L_0x10c6:
            X.2WX r4 = r8.A00(r1)
            if (r3 == 0) goto L_0x10e0
            r1 = 16
            X.9Ld r3 = new X.9Ld
            r3.<init>(r10, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            X.9JS r2 = new X.9JS
            r2.<init>(r1, r3, r5)
            X.2WX r1 = new X.2WX
            r1.<init>(r9, r2)
            r9 = r1
        L_0x10e0:
            X.2WX r24 = r4.A00(r9)
            X.50T r5 = X.AnonymousClass50T.A00
            r4 = 1
            r3 = 3
            X.3aS r1 = X.C243983aS.A00
            X.2WU r2 = new X.2WU
            r2.<init>(r1, r5, r3, r4)
            java.lang.Integer r31 = java.lang.Integer.valueOf(r4)
            r1 = 17
            java.lang.Integer r33 = java.lang.Integer.valueOf(r1)
            X.3bF r1 = new X.3bF
            r23 = r22
            r25 = r22
            r26 = r2
            r27 = r22
            r28 = r21
            r29 = r22
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r6.A00(r1)
        L_0x110f:
            r35 = r6
            r36 = r0
            r37 = r18
            r38 = r22
            r40 = r34
            r41 = r22
            r42 = r7
            X.2Tp r1 = X.C243563Zg.A0H(r35, r36, r37, r38, r39, r40, r41, r42)
            return r1
        L_0x1122:
            r1 = r9
            goto L_0x10c6
        L_0x1124:
            r1 = 0
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r15 = r1
            goto L_0x1039
        L_0x112d:
            r13 = r9
            goto L_0x1025
        L_0x1130:
            r1 = 2131165250(0x7f070042, float:1.7944712E38)
            long r1 = X.C244013aV.A0C(r6, r1)
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            X.9JR r13 = new X.9JR
            r13.<init>(r14, r7, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r9, r13)
            goto L_0x1005
        L_0x1145:
            r1 = r9
            goto L_0x0ffc
        L_0x1148:
            r1 = r9
            goto L_0x0fe1
        L_0x114b:
            r20 = 0
            goto L_0x0f70
        L_0x114f:
            boolean r1 = r2 instanceof X.AnonymousClass3XW
            if (r1 == 0) goto L_0x1174
            r14 = r2
            X.3XW r14 = (X.AnonymousClass3XW) r14
            r13 = 0
            X.0qQ.A0B(r0, r13)
            X.0sa r1 = r14.A0A
            java.lang.Object r1 = r1.invoke()
            X.9Ib r1 = (X.C376459Ib) r1
            java.lang.Object r4 = r1.A01
            java.lang.Object r5 = r1.A02
            java.lang.Object r12 = r1.A00
            X.3Zc r12 = (X.C243523Zc) r12
            if (r4 != 0) goto L_0x1ded
            if (r5 != 0) goto L_0x1ded
            X.3XA r1 = new X.3XA
            r1.<init>()
            return r1
        L_0x1174:
            boolean r1 = r2 instanceof X.C249243jM
            if (r1 == 0) goto L_0x12b9
            r3 = r2
            X.3jM r3 = (X.C249243jM) r3
            r7 = 0
            X.0qQ.A0B(r0, r7)
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.2V5 r6 = X.C247343gB.A00(r0, r1)
            X.2V5 r8 = X.C247343gB.A00(r0, r1)
            X.2V5 r11 = X.C247343gB.A00(r0, r1)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r13 = 14
            X.9MR r1 = new X.9MR
            r12 = r1
            r14 = r8
            r15 = r3
            r16 = r6
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Object r9 = X.AnonymousClass3Zw.A00(r0, r1, r2)
            r1 = 1
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            r4 = 43
            X.9Lz r2 = new X.9Lz
            r2.<init>(r4, r9, r3)
            X.C243773a4.A00(r0, r2, r5)
            r2 = 0
            r5 = 2130970004(0x7f040594, float:1.7548706E38)
            X.2V4 r4 = r0.Bnf()
            int r24 = r4.A01(r5)
            r5 = 2130969921(0x7f040541, float:1.7548538E38)
            X.2V4 r4 = r0.Bnf()
            int r4 = r4.A01(r5)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r4)
            X.3XV r13 = X.2WX.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A1F
            X.9JS r4 = new X.9JS
            r4.<init>(r6, r5)
            X.2WX r6 = new X.2WX
            r6.<init>(r2, r4)
            java.lang.Integer r5 = X.AnonymousClass05K.A1I
            X.9JS r4 = new X.9JS
            r4.<init>(r8, r5)
            X.2WX r8 = new X.2WX
            r8.<init>(r6, r4)
            X.3gM r4 = r3.A01
            boolean r10 = r4.A0G
            java.lang.Integer r12 = X.AnonymousClass05K.A06
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            r9 = 4
            X.9JS r5 = new X.9JS
            r5.<init>(r12, r6, r9)
            X.2WX r6 = new X.2WX
            r6.<init>(r8, r5)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.9JS r5 = new X.9JS
            r5.<init>(r11, r8)
            X.2WX r12 = new X.2WX
            r12.<init>(r6, r5)
            X.3Zh r11 = X.C243573Zh.STRETCH
            r6 = 3
            X.9JS r5 = new X.9JS
            r5.<init>(r8, r11, r6)
            X.2WX r11 = new X.2WX
            r11.<init>(r12, r5)
            r5 = 2131964931(0x7f133403, float:1.9566658E38)
            if (r10 == 0) goto L_0x1224
            r5 = 2131964944(0x7f133410, float:1.9566684E38)
        L_0x1224:
            java.lang.String r10 = X.C244013aV.A0E(r0, r5)
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            X.9JS r5 = new X.9JS
            r5.<init>(r6, r10, r7)
            X.2WX r6 = new X.2WX
            r6.<init>(r11, r5)
            X.9IT r5 = r4.A00
            java.lang.Object r10 = r5.A01
            X.0sL r10 = (X.0sL) r10
            X.2V1 r0 = r0.A05
            android.content.Context r5 = r0.A0C
            X.0qQ.A07(r5)
            X.3fv r0 = r4.A06
            java.lang.Object r5 = r10.invoke(r5, r0)
            X.9JS r0 = new X.9JS
            r0.<init>(r8, r5, r9)
            X.2WX r8 = new X.2WX
            r8.<init>(r6, r0)
            r0 = 2131440147(0x7f0b3213, float:1.850227E38)
            java.lang.Integer r6 = X.AnonymousClass05K.A0B
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            X.9JS r0 = new X.9JS
            r0.<init>(r6, r5, r9)
            X.2WX r15 = new X.2WX
            r15.<init>(r8, r0)
            X.3ZH r6 = r4.A07
            com.instagram.common.session.UserSession r5 = r3.A00
            X.4DU r0 = r3.A02
            X.3Ds r14 = X.C238863Ds.LIKE_LINK
            r21 = r7
            r18 = r0
            r19 = r2
            r20 = r7
            r16 = r5
            r17 = r6
            X.2WX r21 = X.C244223aq.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            r23 = 2131240237(0x7f08252d, float:1.8096804E38)
            android.widget.ImageView$ScaleType r20 = android.widget.ImageView.ScaleType.CENTER
            X.3jP r12 = new X.3jP
            r19 = r12
            r19.<init>(r20, r21, r22, r23, r24)
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x12b7
            java.lang.String r6 = r4.A0C
        L_0x128e:
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            boolean r5 = r3.A04
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            X.9Ld r4 = new X.9Ld
            r4.<init>(r3, r1)
            r1 = 2
            X.9Ld r0 = new X.9Ld
            r0.<init>(r3, r1)
            r20 = 2131165190(0x7f070006, float:1.794459E38)
            X.3jQ r1 = new X.3jQ
            r11 = r1
            r15 = r6
            r16 = r4
            r17 = r2
            r18 = r2
            r19 = r0
            r21 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x12b7:
            r6 = r2
            goto L_0x128e
        L_0x12b9:
            boolean r1 = r2 instanceof X.C253193qM
            if (r1 == 0) goto L_0x145a
            r5 = r2
            X.3qM r5 = (X.C253193qM) r5
            r9 = 0
            X.0qQ.A0B(r0, r9)
            X.3qJ r4 = r5.A04
            java.lang.CharSequence r10 = r4.A04
            int r1 = r4.A00
            r22 = r1
            X.0sP r1 = r4.A07
            r20 = r1
            X.0sL r1 = r4.A08
            r19 = r1
            X.0sa r1 = r4.A06
            r18 = r1
            android.text.TextUtils$TruncateAt r8 = r4.A01
            X.3aa r1 = r4.A02
            r17 = r1
            X.0sa r1 = r4.A05
            r16 = r1
            com.instagram.common.session.UserSession r1 = r5.A03
            r21 = r1
            X.0Tu r6 = X.0Tu.A05
            r1 = 36324475452534894(0x810ceb0000306e, double:3.035082770880959E-306)
            r3 = r21
            boolean r1 = X.182.A06(r6, r3, r1)
            if (r1 == 0) goto L_0x1457
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            long r1 = X.C244013aV.A0C(r0, r1)
            X.2Wd r6 = new X.2Wd
            r6.<init>(r1)
        L_0x1301:
            X.2WX r13 = r4.A03
            if (r10 == 0) goto L_0x1317
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.9JS r2 = new X.9JS
            r2.<init>(r1, r10, r9)
            X.3XV r1 = X.2WX.A02
            if (r13 != r1) goto L_0x1311
            r13 = 0
        L_0x1311:
            X.2WX r1 = new X.2WX
            r1.<init>(r13, r2)
            r13 = r1
        L_0x1317:
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            long r3 = X.C244013aV.A0C(r0, r1)
            long r1 = r5.A01
            java.lang.Integer r11 = X.AnonymousClass05K.A04
            r7 = 0
            X.9JR r12 = new X.9JR
            r12.<init>(r11, r9, r1)
            X.3XV r1 = X.2WX.A02
            if (r13 != r1) goto L_0x132d
            r13 = 0
        L_0x132d:
            X.2WX r11 = new X.2WX
            r11.<init>(r13, r12)
            if (r6 == 0) goto L_0x1343
            long r1 = r6.A00
            java.lang.Integer r12 = X.AnonymousClass05K.A15
            X.9JR r6 = new X.9JR
            r6.<init>(r12, r9, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r11, r6)
            r11 = r1
        L_0x1343:
            java.lang.Integer r2 = X.AnonymousClass05K.A1I
            X.9JR r1 = new X.9JR
            r1.<init>(r2, r9, r3)
            X.2WX r3 = new X.2WX
            r3.<init>(r11, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r14 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            X.9JQ r1 = new X.9JQ
            r1.<init>(r2, r14, r6)
            X.2WX r11 = new X.2WX
            r11.<init>(r3, r1)
            r1 = 2131440862(0x7f0b34de, float:1.850372E38)
            java.lang.Integer r2 = X.AnonymousClass05K.A0B
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3 = 4
            X.9JS r1 = new X.9JS
            r1.<init>(r2, r4, r3)
            X.2WX r2 = new X.2WX
            r2.<init>(r11, r1)
            java.lang.Integer r15 = X.AnonymousClass05K.A0D
            X.9JS r1 = new X.9JS
            r1.<init>(r15, r4, r3)
            X.2WX r11 = new X.2WX
            r11.<init>(r2, r1)
            X.2V1 r13 = r0.A05
            java.lang.String r4 = r5.A05
            X.3Zd r2 = X.C243533Zd.GLOBAL
            X.3Ze r1 = new X.3Ze
            r1.<init>(r13, r2, r4)
            X.2WX r4 = new X.2WX
            r4.<init>(r11, r1)
            X.3Zh r12 = X.C243573Zh.STRETCH
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r2 = 3
            X.9JS r1 = new X.9JS
            r1.<init>(r11, r12, r2)
            X.2WX r12 = new X.2WX
            r12.<init>(r4, r1)
            if (r17 == 0) goto L_0x1454
            android.util.SparseArray r4 = X.C244083ac.A00(r17)
            java.lang.Integer r2 = X.AnonymousClass05K.A0E
            X.9JS r1 = new X.9JS
            r1.<init>(r2, r4, r3)
            X.2WX r4 = new X.2WX
            r4.<init>(r7, r1)
            X.3aZ r1 = X.C244053aZ.A04
            X.9JS r2 = new X.9JS
            r2.<init>(r15, r1, r3)
            X.2WX r1 = new X.2WX
            r1.<init>(r4, r2)
        L_0x13bb:
            X.2WX r4 = r12.A00(r1)
            if (r18 != 0) goto L_0x143b
            if (r16 != 0) goto L_0x143b
            r1 = 0
        L_0x13c4:
            X.2WX r5 = r4.A00(r1)
            if (r19 == 0) goto L_0x1439
            r2 = 39
            X.9Ld r4 = new X.9Ld
            r1 = r19
            r4.<init>(r1, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            X.9JS r2 = new X.9JS
            r2.<init>(r1, r4, r3)
            X.2WX r1 = new X.2WX
            r1.<init>(r7, r2)
        L_0x13df:
            X.2WX r5 = r5.A00(r1)
            if (r20 == 0) goto L_0x1437
            r2 = 40
            X.9Ld r4 = new X.9Ld
            r1 = r20
            r4.<init>(r1, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            X.9JS r2 = new X.9JS
            r2.<init>(r1, r4, r3)
            X.2WX r1 = new X.2WX
            r1.<init>(r7, r2)
        L_0x13fa:
            X.2WX r5 = r5.A00(r1)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MARQUEE
            if (r8 != r1) goto L_0x1e81
            android.content.Context r9 = r13.A0C
            X.0qQ.A07(r9)
            android.text.SpannableString r12 = android.text.SpannableString.valueOf(r10)
            r14 = 2131165249(0x7f070041, float:1.794471E38)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            X.0qQ.A08(r0)
            android.graphics.Typeface r10 = X.0oh.A03(r9, r0, r11)
            X.GAM r8 = new X.GAM
            r11 = r7
            r13 = r21
            r15 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0 = 1132068864(0x437a0000, float:250.0)
            float r0 = X.0nA.A00(r9, r0)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A02(r0, r7)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            X.GH5 r1 = new X.GH5
            r1.<init>(r8, r0, r5, r6)
            return r1
        L_0x1437:
            r1 = 0
            goto L_0x13fa
        L_0x1439:
            r1 = 0
            goto L_0x13df
        L_0x143b:
            r15 = 30
            X.9MC r12 = new X.9MC
            r2 = r16
            r1 = r18
            r12.<init>(r15, r5, r2, r1)
            java.lang.String r1 = "subtitle"
            X.3at r2 = new X.3at
            r2.<init>(r11, r12, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r7, r2)
            goto L_0x13c4
        L_0x1454:
            r1 = 0
            goto L_0x13bb
        L_0x1457:
            r6 = 0
            goto L_0x1301
        L_0x145a:
            boolean r1 = r2 instanceof X.AnonymousClass4Li
            if (r1 == 0) goto L_0x155f
            r3 = r2
            X.4Li r3 = (X.AnonymousClass4Li) r3
            r5 = 0
            X.0qQ.A0B(r0, r5)
            X.0sa r1 = r3.A07
            java.lang.Object r11 = r1.invoke()
            X.3Zb r11 = (X.C243513Zb) r11
            X.0sa r1 = r3.A06
            java.lang.Object r9 = r1.invoke()
            boolean r1 = r11 instanceof X.C243503Za
            if (r1 == 0) goto L_0x1f1f
            r1 = r11
            X.3Za r1 = (X.C243503Za) r1
            boolean r1 = r1.A0L
            if (r1 == 0) goto L_0x1f1f
            X.3XV r1 = X.2WX.A02
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r6 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r1 = new X.9JQ
            r1.<init>(r7, r6, r5)
            r4 = 0
            X.2WX r12 = new X.2WX
            r12.<init>(r4, r1)
            r1 = 2131165482(0x7f07012a, float:1.7945182E38)
            long r1 = X.C244013aV.A0C(r0, r1)
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            X.9JR r8 = new X.9JR
            r8.<init>(r10, r5, r1)
            X.2WX r16 = new X.2WX
            r1 = r16
            r1.<init>(r12, r8)
            X.2V1 r2 = r0.A05
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r8 = new X.2Wb
            r8.<init>(r2, r1)
            X.9JQ r1 = new X.9JQ
            r1.<init>(r7, r6, r5)
            X.2WX r2 = new X.2WX
            r2.<init>(r4, r1)
            X.9JQ r1 = new X.9JQ
            r1.<init>(r10, r6, r5)
            X.2WX r14 = new X.2WX
            r14.<init>(r2, r1)
            r1 = 9221401712017801216(0x7ff9000000000000, double:NaN)
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            r10 = 1
            X.9JR r12 = new X.9JR
            r12.<init>(r13, r10, r1)
            X.2WX r10 = new X.2WX
            r10.<init>(r14, r12)
            X.3b9 r13 = X.C244413b9.ABSOLUTE
            java.lang.Integer r12 = X.AnonymousClass05K.A0Y
            r2 = 3
            X.9JS r1 = new X.9JS
            r1.<init>(r12, r13, r2)
            X.2WX r15 = new X.2WX
            r15.<init>(r10, r1)
            r1 = 2131231103(0x7f08017f, float:1.8078278E38)
            android.graphics.drawable.Drawable r14 = X.C244013aV.A0D(r8, r1)
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.FIT_CENTER
            X.2V1 r1 = r8.A00
            X.3gG r1 = X.C247373gE.A00(r1)
            r1.A0D(r14)
            r1.A0E(r10)
            r1.A0C()
            X.C244123ag.A00(r1, r15)
            X.3gE r1 = r1.A0A()
            r8.A00(r1)
            com.instagram.common.session.UserSession r1 = r3.A00
            r19 = r1
            X.4DU r1 = r3.A02
            r21 = r1
            X.3Wa r1 = r3.A03
            r15 = r1
            boolean r14 = r3.A08
            java.lang.String r10 = r3.A04
            java.lang.String r3 = r3.A05
            X.9JQ r1 = new X.9JQ
            r1.<init>(r7, r6, r5)
            X.2WX r6 = new X.2WX
            r6.<init>(r4, r1)
            X.9JS r1 = new X.9JS
            r1.<init>(r12, r13, r2)
            X.2WX r7 = new X.2WX
            r7.<init>(r6, r1)
            r1 = 27
            X.9LN r6 = new X.9LN
            r6.<init>(r11, r1)
            r1 = 28
            X.9LN r2 = new X.9LN
            r2.<init>(r9, r1)
            X.3Zf r1 = new X.3Zf
            r22 = r15
            r23 = r10
            r24 = r3
            r25 = r6
            r26 = r2
            r27 = r14
            r17 = r1
            r18 = r7
            r20 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r8.A00(r1)
            r6 = r8
            r7 = r0
            r8 = r16
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r5
            X.2Tp r1 = X.C243563Zg.A0H(r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        L_0x155f:
            boolean r1 = r2 instanceof X.C247183fu
            if (r1 == 0) goto L_0x15cc
            r9 = r2
            X.3fu r9 = (X.C247183fu) r9
            r7 = 0
            X.0qQ.A0B(r0, r7)
            X.9J3 r8 = r9.A00
            boolean r2 = r8.A04
            r1 = 0
            if (r2 == 0) goto L_0x01cb
            android.content.Context r6 = X.C243803a8.A00(r0)
            com.instagram.common.session.UserSession r5 = r9.A02
            X.4DU r2 = r9.A04
            java.lang.String r4 = r2.getModuleName()
            X.1Xj r3 = r9.A03
            java.lang.String r2 = r8.A03
            int r6 = X.C256073vB.A00(r6, r5, r3, r4, r2)
            if (r6 <= 0) goto L_0x01cb
            X.2WX r5 = r9.A01
            r4 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.9JQ r3 = new X.9JQ
            r3.<init>(r2, r4, r7)
            X.3XV r2 = X.2WX.A02
            if (r5 != r2) goto L_0x1597
            r5 = r1
        L_0x1597:
            X.2WX r8 = new X.2WX
            r8.<init>(r5, r3)
            long r4 = (long) r6
            r2 = 9221401712017801216(0x7ff9000000000000, double:NaN)
            long r4 = r4 | r2
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.9JR r2 = new X.9JR
            r2.<init>(r3, r7, r4)
            X.2WX r6 = new X.2WX
            r6.<init>(r8, r2)
            r2 = 30
            X.9Ld r5 = new X.9Ld
            r5.<init>(r9, r2)
            java.lang.Integer r4 = X.AnonymousClass05K.A04
            r2 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r4, r5, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r6, r3)
            r8 = r1
            r9 = r0
            r10 = r2
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r7
            X.2Tl r1 = X.C243563Zg.A06(r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x15cc:
            boolean r1 = r2 instanceof X.C247283g5
            if (r1 == 0) goto L_0x16d0
            r3 = r2
            X.3g5 r3 = (X.C247283g5) r3
            r9 = 0
            X.0qQ.A0B(r0, r9)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r2 = 8
            X.9Kp r1 = new X.9Kp
            r1.<init>(r3, r2)
            java.lang.Object r2 = X.AnonymousClass3Zw.A00(r0, r1, r4)
            X.9IE r1 = r3.A00
            java.lang.Object r4 = r1.A00
            X.9Ig r4 = (X.C376509Ig) r4
            java.lang.Object r1 = r4.A04
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            r1 = 0
            if (r2 == 0) goto L_0x01cb
            java.lang.Object r2 = r4.A01
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r6 = X.C244013aV.A0E(r0, r2)
            java.lang.Object r2 = r4.A03
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r5 = X.C244013aV.A0F(r0, r6, r2)
            java.lang.Object r4 = r4.A02
            X.0sJ r4 = (X.0sJ) r4
            X.3fP r3 = r3.A01
            android.content.Context r2 = X.C243803a8.A00(r0)
            java.lang.Object r8 = r4.invoke(r3, r6, r5, r2)
            android.text.SpannableStringBuilder r8 = (android.text.SpannableStringBuilder) r8
            X.3XV r2 = X.2WX.A02
            r3 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.9JQ r2 = new X.9JQ
            r2.<init>(r7, r3, r9)
            X.2WX r4 = new X.2WX
            r4.<init>(r1, r2)
            X.3Zh r3 = X.C243573Zh.FLEX_END
            r6 = 3
            X.9JS r2 = new X.9JS
            r2.<init>(r7, r3, r6)
            X.2WX r5 = new X.2WX
            r5.<init>(r4, r2)
            X.3b9 r4 = X.C244413b9.ABSOLUTE
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            X.9JS r2 = new X.9JS
            r2.<init>(r3, r4, r6)
            X.2WX r10 = new X.2WX
            r10.<init>(r5, r2)
            r2 = 2131165222(0x7f070026, float:1.7944655E38)
            long r2 = X.C244013aV.A0C(r0, r2)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.9JR r4 = new X.9JR
            r4.<init>(r5, r9, r2)
            X.2WX r6 = new X.2WX
            r6.<init>(r10, r4)
            X.2V1 r5 = r0.A05
            android.content.Context r2 = r5.A0C
            int r3 = X.2Yu.A03(r2)
            X.2V4 r2 = r0.Bnf()
            int r2 = r2.A02(r3)
            X.7gD r4 = new X.7gD
            r4.<init>(r2)
            r3 = 4
            X.9JS r2 = new X.9JS
            r2.<init>(r7, r4, r3)
            X.2WX r7 = new X.2WX
            r7.<init>(r6, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r6 = new X.2Wb
            r6.<init>(r5, r2)
            r2 = 4624070917402656768(0x402c000000000000, double:14.0)
            long r4 = java.lang.Double.doubleToRawLongBits(r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A04
            X.9JR r2 = new X.9JR
            r2.<init>(r3, r9, r4)
            X.2WX r3 = new X.2WX
            r3.<init>(r1, r2)
            android.text.method.MovementMethod r11 = android.text.method.LinkMovementMethod.getInstance()
            r2 = -1
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            X.2WU r14 = X.C244473bF.A0C
            X.3bF r2 = new X.3bF
            r9 = r2
            r10 = r1
            r12 = r3
            r13 = r1
            r15 = r1
            r16 = r8
            r17 = r1
            r19 = r1
            r20 = r1
            r21 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6.A00(r2)
            X.2Tp r1 = X.C243563Zg.A0G(r6, r0, r7)
            return r1
        L_0x16d0:
            boolean r1 = r2 instanceof X.C248653iL
            if (r1 == 0) goto L_0x1925
            r4 = r2
            X.3iL r4 = (X.C248653iL) r4
            r8 = 0
            X.0qQ.A0B(r0, r8)
            X.4Et r1 = X.C262544Et.A00
            X.2Wa r11 = X.C243643Zq.A00(r0, r1)
            r2 = 100
            X.4Ew r1 = X.2Vi.A01
            X.4Ex r14 = new X.4Ex
            r14.<init>(r2)
            r18 = 2
            X.3Zd r3 = X.C243533Zd.LOCAL
            java.lang.String r10 = "COMPOSER_BUTTON_AVATAR"
            X.4Ey r13 = X.2Vi.A00(r3, r10)
            X.3du r15 = X.C246033ds.A00
            r13.A03(r15)
            r9 = 0
            r13.A01(r9)
            X.3du r12 = X.C246033ds.A05
            r13.A03(r12)
            X.2V1 r5 = r0.A05
            android.content.Context r7 = r5.A0C
            r6 = 10
            X.4F6 r1 = X.AnonymousClass4F6.A00(r7, r6)
            r13.A04(r1)
            r13.A02 = r14
            java.lang.String r17 = "COMPOSER_BUTTON_TEXT"
            r1 = r17
            X.4Ey r2 = X.2Vi.A00(r3, r1)
            r2.A03(r15)
            r2.A01(r9)
            r2.A03(r12)
            X.4F6 r1 = X.AnonymousClass4F6.A00(r7, r6)
            r2.A04(r1)
            r2.A02 = r14
            r15 = 1
            X.4Ey[] r2 = new X.AnonymousClass4Ey[]{r13, r2}
            X.2Vm r1 = new X.2Vm
            r1.<init>(r2)
            X.AnonymousClass4F7.A00(r0, r1)
            X.4F9 r7 = new X.4F9
            r7.<init>(r11)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            java.lang.Object[] r6 = new java.lang.Object[]{r1}
            r2 = 14
            X.9Ls r1 = new X.9Ls
            r1.<init>(r2, r7, r4)
            X.C243773a4.A00(r0, r1, r6)
            X.3XV r1 = X.2WX.A02
            r1 = 2131165231(0x7f07002f, float:1.7944673E38)
            long r1 = X.C244013aV.A0C(r0, r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A04
            r7 = 0
            X.9JR r6 = new X.9JR
            r6.<init>(r12, r8, r1)
            X.2WX r13 = new X.2WX
            r13.<init>(r7, r6)
            r1 = 21
            X.9Ld r12 = new X.9Ld
            r12.<init>(r4, r1)
            java.lang.Integer r6 = X.AnonymousClass05K.A1F
            r2 = 4
            X.9JS r1 = new X.9JS
            r1.<init>(r6, r12, r2)
            X.2WX r12 = new X.2WX
            r12.<init>(r13, r1)
            boolean r1 = r4.A04
            if (r1 == 0) goto L_0x1922
            java.lang.Integer r6 = X.AnonymousClass05K.A0j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.9JS r2 = new X.9JS
            r2.<init>(r6, r1, r8)
            X.2WX r1 = new X.2WX
            r1.<init>(r7, r2)
        L_0x178e:
            X.2WX r30 = r12.A00(r1)
            X.3Zh r32 = X.C243573Zh.CENTER
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r6 = new X.2Wb
            r6.<init>(r5, r1)
            java.lang.Object r1 = r11.A03
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x1908
            X.3DI r2 = X.AnonymousClass3DI.A00
            com.instagram.common.session.UserSession r1 = r4.A01
            boolean r1 = r2.A04(r1)
            if (r1 == 0) goto L_0x1919
            r1 = 2131165204(0x7f070014, float:1.7944619E38)
            long r1 = X.C244013aV.A0C(r6, r1)
        L_0x17b9:
            X.2V1 r5 = r6.A00
            android.content.Context r11 = r5.A0C
            r31 = r11
            r12 = 2130970237(0x7f04067d, float:1.7549178E38)
            int r11 = X.2Yu.A0H(r11, r12)
            int r24 = X.C244013aV.A02(r6, r11)
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            X.9JR r11 = new X.9JR
            r12 = r16
            r11.<init>(r12, r8, r1)
            X.2WX r12 = new X.2WX
            r12.<init>(r7, r11)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.9JR r11 = new X.9JR
            r11.<init>(r13, r8, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r12, r11)
            X.3Ze r2 = new X.3Ze
            r2.<init>(r5, r3, r10)
            X.2WX r11 = new X.2WX
            r11.<init>(r1, r2)
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            long r12 = X.C244013aV.A0C(r6, r1)
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
            long r1 = X.C244013aV.A0C(r6, r1)
            java.lang.Integer r14 = X.AnonymousClass05K.A0F
            X.9JR r10 = new X.9JR
            r10.<init>(r14, r8, r12)
            X.2WX r12 = new X.2WX
            r12.<init>(r11, r10)
            java.lang.Integer r11 = X.AnonymousClass05K.A09
            X.9JR r10 = new X.9JR
            r10.<init>(r11, r8, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r12, r10)
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            X.9JQ r2 = new X.9JQ
            r2.<init>(r10, r9, r15)
            X.2WX r9 = new X.2WX
            r9.<init>(r1, r2)
            com.instagram.common.typedurl.ImageUrl r11 = r4.A02
            r1 = 2130968697(0x7f040079, float:1.7546055E38)
            int r26 = X.C244013aV.A01(r6, r1)
            r1 = 2131165448(0x7f070108, float:1.7945113E38)
            long r1 = X.C244013aV.A0C(r6, r1)
            X.2V4 r10 = r6.Bnf()
            int r25 = X.2Wd.A00(r10, r1)
            X.4DU r2 = r4.A03
            X.3bC r1 = new X.3bC
            r20 = r9
            r21 = r2
            r22 = r11
            r23 = r7
            r27 = r15
            r28 = r15
            r29 = r8
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6.A00(r1)
            X.3Ze r2 = new X.3Ze
            r1 = r17
            r2.<init>(r5, r3, r1)
            X.2WX r13 = new X.2WX
            r13.<init>(r7, r2)
            r1 = 2131956369(0x7f131291, float:1.9549292E38)
            java.lang.String r12 = X.C244013aV.A0E(r6, r1)
            r2 = 2130970310(0x7f0406c6, float:1.7549327E38)
            r1 = r31
            int r1 = X.2Yu.A0H(r1, r2)
            int r11 = X.C244013aV.A02(r6, r1)
            r1 = 2131165231(0x7f07002f, float:1.7944673E38)
            long r3 = X.C244013aV.A0C(r6, r1)
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            android.graphics.Typeface r9 = android.graphics.Typeface.DEFAULT
            r1 = 0
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            X.3ae r5 = X.2WW.A00(r5, r8)
            r5.A0V(r12)
            r5.A0U(r7)
            r5.A0P(r11)
            X.2V4 r11 = r6.Bnf()
            int r3 = X.2Wd.A00(r11, r3)
            r5.A0Q(r3)
            r5.A0R(r8)
            r5.A0S(r9)
            r3 = -7829368(0xffffffffff888888, float:NaN)
            r5.A0O(r3)
            X.2V4 r3 = r6.Bnf()
            int r3 = X.2Wd.A00(r3, r1)
            float r3 = (float) r3
            r5.A0K(r3)
            X.2V4 r3 = r6.Bnf()
            int r3 = X.2Wd.A00(r3, r1)
            float r3 = (float) r3
            r5.A0I(r3)
            X.2V4 r3 = r6.Bnf()
            int r3 = X.2Wd.A00(r3, r1)
            float r3 = (float) r3
            r5.A0J(r3)
            X.2V4 r3 = r6.Bnf()
            int r1 = X.2Wd.A00(r3, r1)
            float r1 = (float) r1
            r5.A0H(r1)
            r5.A0W(r10)
            r5.A0C()
            r1 = r16
            r5.A0X(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.A0L(r1)
            r5.A0a(r8)
            r5.A0N(r8)
            r1 = r18
            r5.A0M(r1)
            r5.A0b(r15)
            r5.A0Y(r8)
            r5.A0Z(r15)
            r5.A05(r7)
            X.C244123ag.A00(r5, r13)
            X.2WW r1 = r5.A0A()
            r6.A00(r1)
        L_0x1908:
            r28 = r6
            r29 = r0
            r31 = r7
            r33 = r7
            r34 = r7
            r35 = r8
            X.2Tp r1 = X.C243563Zg.A0H(r28, r29, r30, r31, r32, r33, r34, r35)
            return r1
        L_0x1919:
            r1 = 2131165248(0x7f070040, float:1.7944708E38)
            long r1 = X.C244013aV.A0C(r6, r1)
            goto L_0x17b9
        L_0x1922:
            r1 = r7
            goto L_0x178e
        L_0x1925:
            boolean r1 = r2 instanceof X.AnonymousClass3Y2
            if (r1 == 0) goto L_0x1bf0
            r1 = r2
            X.3Y2 r1 = (X.AnonymousClass3Y2) r1
            r7 = 0
            X.0qQ.A0B(r0, r7)
            X.0sa r2 = r1.A0B
            java.lang.Object r2 = r2.invoke()
            X.3et r2 = (X.C246613et) r2
            X.2Wd r10 = r1.A01
            r11 = 1
            if (r10 == 0) goto L_0x194b
            long r3 = r10.A00
            X.2V4 r5 = r0.Bnf()
            int r3 = X.2Wd.A00(r5, r3)
            r19 = 1
            if (r3 > 0) goto L_0x194d
        L_0x194b:
            r19 = 0
        L_0x194d:
            X.3XV r9 = X.2WX.A02
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            r4 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r3 = new X.9JQ
            r3.<init>(r13, r4, r7)
            r8 = 0
            X.2WX r14 = new X.2WX
            r14.<init>(r8, r3)
            boolean r6 = r2.A0O
            r3 = 2131440201(0x7f0b3249, float:1.8502379E38)
            if (r6 == 0) goto L_0x1968
            r3 = 2131443690(0x7f0b3fea, float:1.8509455E38)
        L_0x1968:
            java.lang.Integer r5 = X.AnonymousClass05K.A0B
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12 = 4
            X.9JS r3 = new X.9JS
            r3.<init>(r5, r4, r12)
            X.2WX r5 = new X.2WX
            r5.<init>(r14, r3)
            if (r19 == 0) goto L_0x1be0
            if (r10 == 0) goto L_0x1be0
            long r3 = r10.A00
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            X.9JR r10 = new X.9JR
            r10.<init>(r14, r7, r3)
            X.2WX r3 = new X.2WX
            r3.<init>(r8, r10)
        L_0x198b:
            X.2WX r10 = r5.A00(r3)
            X.3Y1 r14 = r1.A07
            java.lang.String r5 = r2.A0J
            com.instagram.common.session.UserSession r3 = r1.A03
            r36 = r3
            X.3W1 r4 = r2.A0E
            X.3ey r18 = r14.AXQ(r3, r4, r5, r6)
            X.2rm r3 = X.C231492rl.A00(r36)
            boolean r3 = r3.A0K
            r17 = r3
            X.2rm r3 = X.C231492rl.A00(r36)
            boolean r14 = r3.A0L
            r16 = 0
            X.2V1 r3 = r0.A05
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r5 = new X.2Wb
            r5.<init>(r3, r0)
            boolean r0 = r4.A37
            if (r0 == 0) goto L_0x1bdd
            r3 = 24
            X.9Lv r0 = new X.9Lv
            r0.<init>(r3, r4, r2)
            X.3at r3 = new X.3at
            r3.<init>(r13, r0, r8)
            X.2WX r0 = new X.2WX
            r0.<init>(r8, r3)
        L_0x19ce:
            X.2WX r13 = r10.A00(r0)
            X.9IV r0 = r1.A00
            if (r0 == 0) goto L_0x1bda
            java.lang.Object r15 = r0.A01
            X.3WV r15 = (X.AnonymousClass3WV) r15
            X.3ZH r3 = r2.A08
            java.lang.Object r0 = r0.A00
            X.2rv r0 = (X.C231592rv) r0
            r20 = r9
            r21 = r36
            r22 = r15
            r23 = r0
            r24 = r3
            r25 = r4
            r26 = r7
            X.2WX r0 = X.C244263au.A00(r20, r21, r22, r23, r24, r25, r26)
        L_0x19f2:
            X.2WX r13 = r13.A00(r0)
            java.lang.String r4 = "has-litho-media-view-holder"
            java.lang.Integer r3 = X.AnonymousClass05K.A0D
            X.9JS r0 = new X.9JS
            r0.<init>(r3, r4, r12)
            if (r13 != r9) goto L_0x1a02
            r13 = r8
        L_0x1a02:
            X.2WX r4 = new X.2WX
            r4.<init>(r13, r0)
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>(r11)
            r3 = 2131435580(0x7f0b203c, float:1.8493006E38)
            r0 = r18
            r13.append(r3, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            X.9JS r0 = new X.9JS
            r0.<init>(r3, r13, r12)
            X.2WX r3 = new X.2WX
            r3.<init>(r4, r0)
            X.3ZH r0 = r2.A08
            X.4DU r13 = r1.A05
            X.3Ds r20 = X.C238863Ds.ATTACHMENT
            r21 = r3
            r22 = r36
            r23 = r0
            r24 = r13
            r25 = r8
            r26 = r7
            r27 = r7
            X.2WX r35 = X.C244223aq.A00(r20, r21, r22, r23, r24, r25, r26, r27)
            X.3Zi r38 = X.C243583Zi.CENTER
            X.3Zh r37 = X.C243573Zh.CENTER
            X.2V1 r4 = r5.A00
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r3 = new X.2Wb
            r3.<init>(r4, r0)
            X.3b9 r12 = X.C244413b9.ABSOLUTE
            java.lang.Integer r11 = X.AnonymousClass05K.A0Y
            r4 = 3
            X.9JS r0 = new X.9JS
            r0.<init>(r11, r12, r4)
            if (r10 == r9) goto L_0x1a55
            r8 = r10
        L_0x1a55:
            X.2WX r9 = new X.2WX
            r9.<init>(r8, r0)
            if (r6 == 0) goto L_0x1bab
            if (r17 != 0) goto L_0x1b70
            if (r14 == 0) goto L_0x1b31
            X.3es r0 = r2.A0A
            X.0sP r6 = r0.A0H
            boolean r4 = r1.A0C
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r8 = r6.invoke(r4)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            X.3Xd r6 = r1.A06
            X.3fB r25 = r6.BRN()
            android.widget.SeekBar$OnSeekBarChangeListener r20 = r6.Br7()
            X.339 r10 = r1.A08
            r30 = r19 ^ 1
            X.GxZ r4 = new X.GxZ
            r19 = r4
            r21 = r9
            r23 = r13
            r24 = r2
            r26 = r18
            r27 = r10
            r28 = r6
            r29 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x1a93:
            r3.A00(r4)
            X.2uK r11 = r1.A09
            android.widget.SeekBar$OnSeekBarChangeListener r19 = r6.Br7()
            X.3fJ r27 = r6.B5P()
            X.0sa r0 = r0.A0A
            java.lang.Object r4 = r0.invoke()
            X.3fL r4 = (X.C246853fL) r4
            X.33B r10 = r1.A04
            X.3fN r23 = r6.BQx()
            X.3fP r21 = r6.Ahs()
            boolean r8 = r1.A0D
            X.4DV r6 = r1.A0A
            X.3fQ r0 = new X.3fQ
            r28 = r2
            r29 = r18
            r30 = r11
            r31 = r6
            r32 = r17
            r33 = r14
            r34 = r8
            r18 = r0
            r20 = r9
            r22 = r36
            r24 = r10
            r25 = r4
            r26 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.A00(r0)
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x1b09
            X.3ew r4 = r2.A05
            if (r4 == 0) goto L_0x1b26
            r0 = r16
            X.68u r4 = X.C3034368u.A02(r0, r4)
            X.2V1 r0 = r3.A00
            X.GrW r2 = X.GY5.A00(r0)
            r2.A0B(r4)
            X.2nI r0 = r1.A02
            r2.A0C(r0)
            r1 = 1120403456(0x42c80000, float:100.0)
            X.3mo r0 = r2.A00
            X.2TC r0 = r0.A0Z()
            r0.A08(r1)
            r2.A03()
            X.GY5 r0 = r2.A0A()
            r3.A00(r0)
        L_0x1b09:
            r33 = r3
            r34 = r5
            r36 = r16
            r39 = r7
            X.2Tl r0 = X.C243563Zg.A06(r33, r34, r35, r36, r37, r38, r39)
            r5.A00(r0)
            java.util.List r0 = r5.A01
            X.2Tl r1 = new X.2Tl
            r2 = r16
            r3 = r2
            r4 = r2
            r5 = r0
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x1b26:
            X.3ev r1 = r2.A0D
            X.GxA r0 = new X.GxA
            r0.<init>(r9, r13, r1)
            r3.A00(r0)
            goto L_0x1b09
        L_0x1b31:
            X.2uK r12 = r1.A09
            X.3es r0 = r2.A0A
            X.0sP r6 = r0.A0H
            boolean r4 = r1.A0C
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r8 = r6.invoke(r4)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            X.3Xd r6 = r1.A06
            X.3fB r26 = r6.BRN()
            X.3fN r23 = r6.BQx()
            android.widget.SeekBar$OnSeekBarChangeListener r20 = r6.Br7()
            boolean r11 = r1.A0D
            X.339 r10 = r1.A08
            r33 = r19 ^ 1
            X.4wq r4 = new X.4wq
            r19 = r4
            r21 = r9
            r25 = r2
            r27 = r18
            r28 = r10
            r29 = r12
            r30 = r6
            r31 = r8
            r32 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x1a93
        L_0x1b70:
            X.2uK r11 = r1.A09
            X.3es r0 = r2.A0A
            X.0sP r6 = r0.A0H
            boolean r4 = r1.A0C
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r8 = r6.invoke(r4)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            X.3Xd r6 = r1.A06
            X.3fB r25 = r6.BRN()
            X.3fN r22 = r6.BQx()
            X.339 r10 = r1.A08
            r31 = r19 ^ 1
            X.Gxa r4 = new X.Gxa
            r19 = r4
            r20 = r9
            r21 = r36
            r23 = r13
            r24 = r2
            r26 = r18
            r27 = r10
            r28 = r11
            r29 = r6
            r30 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x1a93
        L_0x1bab:
            X.3es r0 = r2.A0A
            X.0sP r6 = r0.A0H
            boolean r4 = r1.A0C
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r10 = r6.invoke(r4)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            X.3Xd r6 = r1.A06
            X.3fB r24 = r6.BRN()
            X.339 r8 = r1.A08
            X.4b9 r4 = new X.4b9
            r19 = r4
            r20 = r9
            r21 = r36
            r22 = r13
            r23 = r2
            r25 = r18
            r26 = r8
            r27 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x1a93
        L_0x1bda:
            r0 = r9
            goto L_0x19f2
        L_0x1bdd:
            r0 = r9
            goto L_0x19ce
        L_0x1be0:
            float r10 = r2.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            X.9JQ r4 = new X.9JQ
            r4.<init>(r3, r10, r11)
            X.2WX r3 = new X.2WX
            r3.<init>(r8, r4)
            goto L_0x198b
        L_0x1bf0:
            boolean r1 = r2 instanceof X.C247313g8
            if (r1 == 0) goto L_0x1cc6
            r11 = r2
            X.3g8 r11 = (X.C247313g8) r11
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r2 = 47
            X.9LN r1 = new X.9LN
            r1.<init>(r0, r2)
            X.2Wa r13 = X.C243643Zq.A00(r0, r1)
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.2V5 r8 = X.C247343gB.A00(r0, r1)
            X.2V5 r7 = X.C247343gB.A00(r0, r1)
            X.2V5 r3 = X.C247343gB.A00(r0, r1)
            X.2V5 r12 = X.C247343gB.A00(r0, r1)
            X.2V5 r10 = X.C247343gB.A00(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.2V5 r4 = X.C247343gB.A00(r0, r1)
            r19 = 1
            X.3W1 r1 = r11.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            X.9Mh r9 = new X.9Mh
            r14 = r0
            r15 = r4
            r16 = r3
            r17 = r8
            r18 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.C243773a4.A00(r0, r9, r1)
            java.lang.Object r6 = r13.A03
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r1 = 0
            if (r6 == 0) goto L_0x01cb
            X.3XV r2 = X.2WX.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A1F
            X.9JS r2 = new X.9JS
            r2.<init>(r8, r5)
            X.2WX r5 = new X.2WX
            r5.<init>(r1, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A1I
            X.9JS r1 = new X.9JS
            r1.<init>(r7, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r5, r1)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.9JS r1 = new X.9JS
            r1.<init>(r4, r7)
            X.2WX r4 = new X.2WX
            r4.<init>(r2, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            X.9JS r1 = new X.9JS
            r1.<init>(r3, r2)
            X.2WX r3 = new X.2WX
            r3.<init>(r4, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A03
            X.9JS r1 = new X.9JS
            r1.<init>(r12, r2)
            X.2WX r4 = new X.2WX
            r4.<init>(r3, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            X.9JS r1 = new X.9JS
            r1.<init>(r10, r2)
            X.2WX r3 = new X.2WX
            r3.<init>(r4, r1)
            X.3Zh r2 = X.C243573Zh.CENTER
            r5 = 3
            X.9JS r1 = new X.9JS
            r1.<init>(r7, r2, r5)
            X.2WX r4 = new X.2WX
            r4.<init>(r3, r1)
            X.3b9 r3 = X.C244413b9.ABSOLUTE
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            X.9JS r1 = new X.9JS
            r1.<init>(r2, r3, r5)
            X.2WX r2 = new X.2WX
            r2.<init>(r4, r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            X.2V1 r0 = r0.A05
            X.3gG r0 = X.C247373gE.A00(r0)
            r0.A0D(r6)
            r0.A0E(r1)
            r0.A0C()
            X.C244123ag.A00(r0, r2)
            X.3gE r1 = r0.A0A()
            return r1
        L_0x1cc6:
            r11 = r2
            X.4jK r11 = (X.C271624jK) r11
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.50X r8 = r11.A01
            java.util.List r4 = r8.A02
            X.3W1 r10 = r8.A01
            boolean r1 = r10.A1z
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.2V5 r7 = X.C247343gB.A00(r0, r1)
            boolean r1 = r10.A1z
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r5 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r16 = 1
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1}
            r6 = 6
            X.9LL r1 = new X.9LL
            r1.<init>(r7, r6)
            java.lang.Object r9 = X.AnonymousClass3Zw.A00(r0, r1, r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r9}
            r2 = 24
            X.9M1 r1 = new X.9M1
            r1.<init>(r2, r9, r10)
            X.C243773a4.A00(r0, r1, r3)
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.2V5 r12 = X.C247343gB.A00(r0, r1)
            X.2V5 r13 = X.C247343gB.A00(r0, r1)
            X.2V5 r14 = X.C247343gB.A00(r0, r1)
            int r1 = X.0Yv.A1E(r4, r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Iterator r2 = r4.iterator()
        L_0x1d25:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x1d39
            java.lang.Object r1 = r2.next()
            com.instagram.tagging.model.Tag r1 = (com.instagram.tagging.model.Tag) r1
            java.lang.String r1 = r1.getId()
            r3.add(r1)
            goto L_0x1d25
        L_0x1d39:
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            X.9MJ r1 = new X.9MJ
            r1.<init>(r6, r12, r13, r14)
            java.lang.Object r6 = X.AnonymousClass3Zw.A00(r0, r1, r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r2 = 5
            X.9LL r1 = new X.9LL
            r1.<init>(r6, r2)
            X.C243773a4.A00(r0, r1, r3)
            boolean r2 = r8.A03
            r1 = 0
            if (r2 != 0) goto L_0x1d68
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x1d68
            boolean r2 = r4 instanceof java.util.Collection
            if (r2 == 0) goto L_0x1d87
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x1d87
        L_0x1d68:
            int r0 = X.0Yv.A1E(r4, r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r4.iterator()
        L_0x1d75:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r2.next()
            com.instagram.tagging.model.Tag r0 = (com.instagram.tagging.model.Tag) r0
            android.graphics.PointF r0 = r0.A00
            r3.add(r0)
            goto L_0x1d75
        L_0x1d87:
            java.util.Iterator r3 = r4.iterator()
        L_0x1d8b:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x1d68
            java.lang.Object r2 = r3.next()
            com.instagram.tagging.model.Tag r2 = (com.instagram.tagging.model.Tag) r2
            android.graphics.PointF r2 = r2.A00
            if (r2 == 0) goto L_0x1d8b
            java.lang.Object r2 = r7.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01cb
            X.2V1 r2 = r0.A05
            android.content.Context r2 = r2.A0C
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131165285(0x7f070065, float:1.7944783E38)
            int r15 = r3.getDimensionPixelSize(r2)
            X.2WX r7 = r11.A00
            r2 = 36
            X.9Lv r5 = new X.9Lv
            r5.<init>(r2, r6, r11)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            java.lang.String r2 = "media_tag_hints"
            X.3at r3 = new X.3at
            r3.<init>(r4, r5, r2)
            X.3XV r2 = X.2WX.A02
            if (r7 != r2) goto L_0x1dcb
            r7 = r1
        L_0x1dcb:
            X.2WX r5 = new X.2WX
            r5.<init>(r7, r3)
            r2 = 37
            X.9Lv r4 = new X.9Lv
            r4.<init>(r2, r6, r11)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.3at r2 = new X.3at
            r2.<init>(r3, r4, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r5, r2)
            X.9MV r10 = new X.9MV
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.Gxc r1 = X.HSK.A00(r0, r1, r10)
            return r1
        L_0x1ded:
            X.2WX r7 = r14.A01
            X.2V1 r6 = r0.A05
            X.3Zd r3 = X.C243533Zd.GLOBAL
            r1 = 3139(0xc43, float:4.399E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            X.3Ze r1 = new X.3Ze
            r1.<init>(r6, r3, r2)
            X.3XV r11 = X.2WX.A02
            r26 = 0
            if (r7 != r11) goto L_0x1e06
            r7 = r26
        L_0x1e06:
            X.2WX r10 = new X.2WX
            r10.<init>(r7, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r9 = new X.2Wb
            r9.<init>(r6, r1)
            if (r5 == 0) goto L_0x1e28
            r1 = 46
            X.9LW r3 = new X.9LW
            r3.<init>(r5, r1)
            X.3Wq r2 = r14.A06
            X.Gs7 r1 = new X.Gs7
            r1.<init>(r2, r3)
            r9.A00(r1)
        L_0x1e28:
            if (r4 == 0) goto L_0x1e60
            r1 = 47
            X.9LW r8 = new X.9LW
            r8.<init>(r4, r1)
            X.0sa r1 = r14.A09
            r16 = r1
            com.instagram.common.session.UserSession r15 = r14.A02
            X.4DU r7 = r14.A04
            X.3Wa r6 = r14.A05
            boolean r5 = r14.A0B
            java.lang.String r4 = r14.A07
            X.3WV r3 = r14.A03
            java.lang.String r2 = r14.A08
            X.3Zf r1 = new X.3Zf
            r25 = r5
            r21 = r4
            r22 = r2
            r23 = r8
            r24 = r16
            r20 = r6
            r19 = r7
            r18 = r3
            r17 = r15
            r16 = r11
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r9.A00(r1)
        L_0x1e60:
            if (r12 == 0) goto L_0x1e70
            androidx.fragment.app.FragmentActivity r4 = r14.A00
            com.instagram.common.session.UserSession r3 = r14.A02
            X.4DU r2 = r14.A04
            X.GtN r1 = new X.GtN
            r1.<init>(r4, r3, r12, r2)
            r9.A00(r1)
        L_0x1e70:
            r23 = r9
            r24 = r0
            r25 = r10
            r27 = r26
            r28 = r26
            r29 = r13
            X.2Tl r1 = X.C243563Zg.A06(r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x1e81:
            android.content.Context r2 = r13.A0C
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r15 = X.0oh.A03(r2, r1, r11)
            r1 = 2131165249(0x7f070041, float:1.794471E38)
            long r3 = X.C244013aV.A0C(r0, r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
            r1 = 0
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            X.3ae r13 = X.2WW.A00(r13, r9)
            r13.A0V(r10)
            r13.A0U(r7)
            r10 = r22
            r13.A0P(r10)
            X.2V4 r10 = r0.Bnf()
            int r3 = X.2Wd.A00(r10, r3)
            r13.A0Q(r3)
            r13.A0R(r9)
            r13.A0S(r15)
            r3 = -7829368(0xffffffffff888888, float:NaN)
            r13.A0O(r3)
            X.2V4 r3 = r0.Bnf()
            int r3 = X.2Wd.A00(r3, r1)
            float r3 = (float) r3
            r13.A0K(r3)
            X.2V4 r3 = r0.Bnf()
            int r3 = X.2Wd.A00(r3, r1)
            float r3 = (float) r3
            r13.A0I(r3)
            X.2V4 r3 = r0.Bnf()
            int r3 = X.2Wd.A00(r3, r1)
            float r3 = (float) r3
            r13.A0J(r3)
            X.2V4 r0 = r0.Bnf()
            int r0 = X.2Wd.A00(r0, r1)
            float r0 = (float) r0
            r13.A0H(r0)
            r13.A0W(r12)
            r13.A0C()
            r13.A0X(r11)
            r13.A0L(r14)
            r13.A0a(r6)
            r13.A0N(r9)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13.A0M(r0)
            r13.A0b(r9)
            r13.A0Y(r9)
            r13.A0Z(r6)
            if (r8 == 0) goto L_0x1f14
            r13.A0T(r8)
        L_0x1f14:
            r13.A05(r7)
            X.C244123ag.A00(r13, r5)
            X.2WW r1 = r13.A0A()
            return r1
        L_0x1f1f:
            com.instagram.common.session.UserSession r10 = r3.A00
            X.4DU r8 = r3.A02
            X.3Wa r7 = r3.A03
            boolean r6 = r3.A08
            java.lang.String r5 = r3.A04
            java.lang.String r4 = r3.A05
            X.3WV r3 = r3.A01
            r0 = 29
            X.9LN r2 = new X.9LN
            r2.<init>(r11, r0)
            r1 = 30
            X.9LN r0 = new X.9LN
            r0.<init>(r9, r1)
            X.3XV r12 = X.2WX.A02
            X.3Zf r1 = new X.3Zf
            r11 = r1
            r13 = r10
            r14 = r3
            r15 = r8
            r16 = r7
            r17 = r5
            r18 = r4
            r19 = r2
            r20 = r0
            r21 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251343mx.A0X(X.3Y5):X.3mp");
    }

    public final C251263mp A0E() {
        C251263mp A0E = super.A0E();
        0qQ.A07(A0E);
        return A0E;
    }

    public final String A0J() {
        String A00 = AnonymousClass3XB.A00(getClass());
        0qQ.A07(A00);
        return A00;
    }
}
