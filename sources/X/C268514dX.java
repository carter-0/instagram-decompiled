package X;

/* renamed from: X.4dX  reason: invalid class name and case insensitive filesystem */
public final class C268514dX extends C268504dW {
    public static final C268514dX A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0374, code lost:
        if (r4.equals("radial") == false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x039c, code lost:
        if (r0 == false) goto L_0x0332;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A00(X.C307786Rm r20, X.C276544tV r21, X.C276544tV r22) {
        /*
            r19 = this;
            r0 = 2
            r4 = r22
            X.0qQ.A0B(r4, r0)
            r3 = r21
            int r2 = r3.A04
            r1 = 13761(0x35c1, float:1.9283E-41)
            r0 = r20
            if (r2 == r1) goto L_0x0250
            r1 = 15775(0x3d9f, float:2.2105E-41)
            if (r2 == r1) goto L_0x01a6
            r1 = 15976(0x3e68, float:2.2387E-41)
            if (r2 == r1) goto L_0x011a
            r1 = 16526(0x408e, float:2.3158E-41)
            if (r2 == r1) goto L_0x0023
            r1 = r19
            android.graphics.drawable.Drawable r10 = super.A00(r0, r3, r4)
            return r10
        L_0x0023:
            java.lang.String r5 = "CDSShadowDrawableV2Utils"
            r8 = 0
            android.content.Context r7 = r0.A00
            java.lang.String r10 = "rectangle"
            r11 = r10
            r1 = 43
            java.lang.String r1 = r3.A0K(r1)
            if (r1 == 0) goto L_0x0034
            r10 = r1
        L_0x0034:
            java.lang.Integer[] r9 = X.C41944B7v.A00
            int r6 = r9.length
            r4 = 0
        L_0x0038:
            if (r4 >= r6) goto L_0x0051
            r2 = r9[r4]
            int r1 = r2.intValue()
            int r1 = 1 - r1
            if (r1 == 0) goto L_0x004e
            r1 = r11
        L_0x0045:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x005c
            int r4 = r4 + 1
            goto L_0x0038
        L_0x004e:
            java.lang.String r1 = "circle"
            goto L_0x0045
        L_0x0051:
            java.lang.String r1 = "Error finding Shape enum value for: "
            java.lang.String r1 = X.002.A0R(r1, r10)
            X.1Kn.A02(r5, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x005c:
            r1 = 42
            java.lang.String r9 = r3.A0K(r1)
            r6 = 1098907648(0x41800000, float:16.0)
            r14 = 0
            float r1 = X.C14573Tyc.A00(r7, r6)     // Catch:{ 3yO -> 0x0074 }
            if (r9 == 0) goto L_0x006f
            float r1 = X.AnonymousClass6Su.A01(r9)     // Catch:{ 3yO -> 0x0074 }
        L_0x006f:
            float r12 = java.lang.Math.max(r14, r1)     // Catch:{ 3yO -> 0x0074 }
            goto L_0x0082
        L_0x0074:
            r4 = move-exception
            java.lang.String r1 = "Error parsing shadow radius: "
            java.lang.String r1 = X.002.A0R(r1, r9)
            X.1Kn.A00(r0, r5, r1, r4)
            float r12 = X.C14573Tyc.A00(r7, r6)
        L_0x0082:
            r1 = 36
            X.4tV r1 = r3.A07(r1)
            if (r1 == 0) goto L_0x00a8
            int r4 = X.AnonymousClass6TP.A00(r0, r1, r8)
        L_0x008e:
            r1 = 41
            X.4tV r1 = r3.A07(r1)
            if (r1 == 0) goto L_0x00a4
            int r15 = X.AnonymousClass6TP.A00(r0, r1, r8)
        L_0x009a:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r1 != r2) goto L_0x00aa
            X.GbE r10 = new X.GbE
            r10.<init>(r15, r4, r12)
            return r10
        L_0x00a4:
            r15 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            goto L_0x009a
        L_0x00a8:
            r4 = 0
            goto L_0x008e
        L_0x00aa:
            r1 = 35
            java.lang.String r9 = r3.A0K(r1)
            r8 = 1082130432(0x40800000, float:4.0)
            float r1 = X.C14573Tyc.A00(r7, r8)     // Catch:{ 3yO -> 0x00c1 }
            if (r9 == 0) goto L_0x00bc
            float r1 = X.AnonymousClass6Su.A01(r9)     // Catch:{ 3yO -> 0x00c1 }
        L_0x00bc:
            float r11 = java.lang.Math.max(r14, r1)     // Catch:{ 3yO -> 0x00c1 }
            goto L_0x00cf
        L_0x00c1:
            r2 = move-exception
            java.lang.String r1 = "Error parsing corner radius: "
            java.lang.String r1 = X.002.A0R(r1, r9)
            X.1Kn.A00(r0, r5, r1, r2)
            float r11 = X.C14573Tyc.A00(r7, r8)
        L_0x00cf:
            r1 = 38
            java.lang.String r8 = r3.A0K(r1)
            float r1 = X.C14573Tyc.A00(r7, r6)     // Catch:{ 3yO -> 0x00e4 }
            if (r8 == 0) goto L_0x00df
            float r1 = X.AnonymousClass6Su.A01(r8)     // Catch:{ 3yO -> 0x00e4 }
        L_0x00df:
            float r13 = java.lang.Math.max(r14, r1)     // Catch:{ 3yO -> 0x00e4 }
            goto L_0x00ef
        L_0x00e4:
            r2 = move-exception
            java.lang.String r1 = "Error parsing horizontal offset: "
            java.lang.String r1 = X.002.A0R(r1, r8)
            X.1Kn.A00(r0, r5, r1, r2)
            r13 = 0
        L_0x00ef:
            r1 = 40
            java.lang.String r3 = r3.A0K(r1)
            float r1 = X.C14573Tyc.A00(r7, r6)     // Catch:{ 3yO -> 0x0104 }
            if (r3 == 0) goto L_0x00ff
            float r1 = X.AnonymousClass6Su.A01(r3)     // Catch:{ 3yO -> 0x0104 }
        L_0x00ff:
            float r14 = java.lang.Math.max(r14, r1)     // Catch:{ 3yO -> 0x0104 }
            goto L_0x010e
        L_0x0104:
            r2 = move-exception
            java.lang.String r1 = "Error parsing vertical offset: "
            java.lang.String r1 = X.002.A0R(r1, r3)
            X.1Kn.A00(r0, r5, r1, r2)
        L_0x010e:
            r17 = 1
            X.Gaz r10 = new X.Gaz
            r18 = r17
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x011a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = 35
            java.util.List r1 = r3.A0M(r1)
            X.0qQ.A07(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x012c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01a0
            java.lang.Object r3 = r8.next()
            X.4tV r3 = (X.C276544tV) r3
            X.0qQ.A0A(r3)
            r1 = 36
            java.util.List r7 = r3.A0M(r1)
            X.0qQ.A07(r7)
            int r1 = r7.size()
            int[] r12 = new int[r1]
            int r6 = r7.size()
            r5 = 0
        L_0x014f:
            if (r5 >= r6) goto L_0x0161
            java.lang.Object r2 = r7.get(r5)
            X.4tV r2 = (X.C276544tV) r2
            r1 = 0
            int r1 = X.AnonymousClass6TP.A00(r0, r2, r1)
            r12[r5] = r1
            int r5 = r5 + 1
            goto L_0x014f
        L_0x0161:
            r1 = 43
            X.4tV r1 = r3.A07(r1)
            if (r1 == 0) goto L_0x0198
            X.VaC r10 = X.C18775W0y.A01(r1)
            r1 = 44
            X.4tV r1 = r3.A07(r1)
            if (r1 == 0) goto L_0x0190
            X.VaC r11 = X.C18775W0y.A01(r1)
            r2 = 38
            r1 = 1
            boolean r14 = r3.A0R(r2, r1)
            r2 = 40
            r1 = 0
            float r13 = r3.A02(r2, r1)
            X.Vt1 r9 = new X.Vt1
            r9.<init>(r10, r11, r12, r13, r14)
            r4.add(r9)
            goto L_0x012c
        L_0x0190:
            java.lang.String r1 = "End line must not be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0198:
            java.lang.String r1 = "Start line must not be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            X.U1D r10 = new X.U1D
            r10.<init>(r4)
            return r10
        L_0x01a6:
            r4 = 0
            java.lang.String r2 = "primary"
            java.lang.String r1 = r3.A0H()
            if (r1 == 0) goto L_0x01b0
            r2 = r1
        L_0x01b0:
            java.lang.String r1 = "circular"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01c0
            android.content.Context r1 = r0.A00
            X.Gco r10 = new X.Gco
            r10.<init>(r1, r0)
            return r10
        L_0x01c0:
            java.lang.String r1 = "elevated"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0233
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
        L_0x01ca:
            r1 = 36
            X.4tV r1 = r3.A07(r1)
            if (r1 == 0) goto L_0x0231
            int r6 = X.AnonymousClass6TP.A00(r0, r1, r4)
        L_0x01d6:
            r1 = 35
            java.util.List r1 = r3.A0N(r1)
            X.0qQ.A07(r1)
            java.util.Iterator r3 = r1.iterator()
            r7 = 0
        L_0x01e4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0245
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x01e4
            int r1 = r2.hashCode()
            switch(r1) {
                case -1383228885: goto L_0x0226;
                case 96673: goto L_0x021b;
                case 115029: goto L_0x0210;
                case 3317767: goto L_0x0205;
                case 108511772: goto L_0x01fa;
                default: goto L_0x01f9;
            }
        L_0x01f9:
            goto L_0x01e4
        L_0x01fa:
            java.lang.String r1 = "right"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01e4
            r7 = r7 | 4
            goto L_0x01e4
        L_0x0205:
            java.lang.String r1 = "left"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01e4
            r7 = r7 | 2
            goto L_0x01e4
        L_0x0210:
            java.lang.String r1 = "top"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01e4
            r7 = r7 | 1
            goto L_0x01e4
        L_0x021b:
            java.lang.String r1 = "all"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01e4
            r7 = r7 | 15
            goto L_0x01e4
        L_0x0226:
            java.lang.String r1 = "bottom"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01e4
            r7 = r7 | 8
            goto L_0x01e4
        L_0x0231:
            r6 = 0
            goto L_0x01d6
        L_0x0233:
            r1 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0242
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            goto L_0x01ca
        L_0x0242:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x01ca
        L_0x0245:
            android.content.Context r1 = r0.A00
            X.Gcq r10 = new X.Gcq
            r2 = r10
            r3 = r1
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
        L_0x0250:
            X.3O0 r10 = new X.3O0
            r10.<init>()
            r1 = 41
            r7 = 0
            boolean r1 = r3.A0R(r1, r7)
            if (r1 == 0) goto L_0x03ab
            X.7du r2 = new X.7du
            r2.<init>()
        L_0x0263:
            boolean r1 = r2 instanceof X.C336007du
            if (r1 == 0) goto L_0x028e
            r1 = 38
            X.4tV r6 = r3.A07(r1)
            r1 = 50
            X.4tV r5 = r3.A07(r1)
            if (r6 == 0) goto L_0x0277
            if (r5 != 0) goto L_0x027e
        L_0x0277:
            java.lang.String r4 = "ShimmerDrawableUtils"
            java.lang.String r1 = "Base Color or highlight color were null for a Color highlight Shimmer Drawable"
            X.1Kn.A02(r4, r1)
        L_0x027e:
            r4 = r2
            X.7du r4 = (X.C336007du) r4
            if (r6 != 0) goto L_0x03a5
            r1 = 0
        L_0x0284:
            r4.A05(r1)
            if (r5 != 0) goto L_0x039f
            r0 = 0
        L_0x028a:
            X.3O5 r1 = r4.A00
            r1.A09 = r0
        L_0x028e:
            r1 = 40
            r0 = 1
            boolean r0 = r3.A0R(r1, r0)
            X.3O5 r1 = r2.A00
            r1.A0I = r0
            r4 = 36
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r0 = r3.A02(r4, r0)
            r2.A02(r0)
            r0 = 49
            r6 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3.A02(r0, r6)
            r2.A03(r0)
            r4 = 44
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = r3.A03(r4, r0)
            long r4 = (long) r0
            r2.A04(r4)
            r4 = 52
            r0 = -1
            int r0 = r3.A03(r4, r0)
            r1.A0A = r0
            r0 = 53
            int r0 = r3.A03(r0, r7)
            long r4 = (long) r0
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x03fa
            r1.A0E = r4
            r4 = 43
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r3.A02(r4, r0)
            r5 = 0
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x03ee
            r1.A00 = r4
            r0 = 46
            int r4 = r3.A03(r0, r7)
            if (r4 < 0) goto L_0x03e2
            r1.A08 = r4
            r0 = 45
            int r4 = r3.A03(r0, r7)
            if (r4 < 0) goto L_0x03d6
            r1.A07 = r4
            r0 = 51
            float r4 = r3.A02(r0, r5)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x03ca
            r1.A02 = r4
            r0 = 57
            float r4 = r3.A02(r0, r6)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x03be
            r1.A04 = r4
            r0 = 48
            float r4 = r3.A02(r0, r6)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x03b2
            r1.A01 = r4
            r0 = 56
            float r0 = r3.A02(r0, r5)
            r1.A03 = r0
            r0 = 42
            java.lang.String r4 = r3.A0K(r0)
            if (r4 == 0) goto L_0x0332
            int r0 = r4.hashCode()
            switch(r0) {
                case -1118360059: goto L_0x0389;
                case -1085344219: goto L_0x0395;
                case -87315416: goto L_0x0381;
                default: goto L_0x0332;
            }
        L_0x0332:
            r4 = 0
        L_0x0333:
            r1.A06 = r4
            r0 = 54
            java.lang.String r6 = r3.A0K(r0)
            r5 = 1
            if (r6 == 0) goto L_0x0355
            int r4 = r6.hashCode()
            r0 = 1097506319(0x416a9e0f, float:14.663589)
            if (r4 == r0) goto L_0x0355
            r0 = 1099846370(0x418e52e2, float:17.79047)
            if (r4 != r0) goto L_0x0355
            java.lang.String r0 = "reverse"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0355
            r5 = 2
        L_0x0355:
            r1.A0B = r5
            r0 = 55
            java.lang.String r4 = r3.A0K(r0)
            if (r4 == 0) goto L_0x0376
            int r3 = r4.hashCode()
            r0 = -1102672091(0xffffffffbe468f25, float:-0.19390543)
            if (r3 == r0) goto L_0x0376
            r0 = -938579425(0xffffffffc80e6a1f, float:-145832.48)
            if (r3 != r0) goto L_0x0376
            java.lang.String r0 = "radial"
            boolean r0 = r4.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0377
        L_0x0376:
            r3 = 0
        L_0x0377:
            r1.A0C = r3
            X.3O5 r0 = r2.A01()
            r10.A03(r0)
            return r10
        L_0x0381:
            java.lang.String r0 = "right_to_left"
            boolean r0 = r4.equals(r0)
            r4 = 2
            goto L_0x039c
        L_0x0389:
            r0 = 996(0x3e4, float:1.396E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r4.equals(r0)
            r4 = 1
            goto L_0x039c
        L_0x0395:
            java.lang.String r0 = "bottom_to_top"
            boolean r0 = r4.equals(r0)
            r4 = 3
        L_0x039c:
            if (r0 != 0) goto L_0x0333
            goto L_0x0332
        L_0x039f:
            int r0 = X.AnonymousClass6TP.A00(r0, r5, r7)
            goto L_0x028a
        L_0x03a5:
            int r1 = X.AnonymousClass6TP.A00(r0, r6, r7)
            goto L_0x0284
        L_0x03ab:
            X.3O3 r2 = new X.3O3
            r2.<init>()
            goto L_0x0263
        L_0x03b2:
            java.lang.String r0 = "Given invalid height ratio: "
            java.lang.String r1 = X.002.A0N(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03be:
            java.lang.String r0 = "Given invalid width ratio: "
            java.lang.String r1 = X.002.A0N(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03ca:
            java.lang.String r0 = "Given invalid intensity value: "
            java.lang.String r1 = X.002.A0N(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03d6:
            java.lang.String r0 = "Given invalid height: "
            java.lang.String r1 = X.002.A0O(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03e2:
            java.lang.String r0 = "Given invalid width: "
            java.lang.String r1 = X.002.A0O(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03ee:
            java.lang.String r0 = "Given invalid dropoff value: "
            java.lang.String r1 = X.002.A0N(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03fa:
            java.lang.String r0 = "Given a negative repeat delay: "
            java.lang.String r1 = X.002.A0Q(r0, r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268514dX.A00(X.6Rm, X.4tV, X.4tV):android.graphics.drawable.Drawable");
    }
}
