package X;

/* renamed from: X.Iwc  reason: case insensitive filesystem */
public final class C58729Iwc extends 0Yg implements 0sP {
    public final int A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58729Iwc(String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x015d, code lost:
        return java.lang.Boolean.valueOf(X.0qQ.A0K(r1, r4.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01db, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r4 = r24
            r12 = r25
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x01b7;
                case 1: goto L_0x019e;
                case 2: goto L_0x017e;
                case 3: goto L_0x015e;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x0009;
                case 11: goto L_0x0149;
                case 12: goto L_0x0149;
                case 13: goto L_0x0130;
                case 14: goto L_0x0104;
                case 15: goto L_0x0088;
                case 16: goto L_0x004f;
                case 17: goto L_0x0030;
                case 18: goto L_0x001d;
                case 19: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r4 = r4.A01
            return r4
        L_0x000c:
            X.GDe r0 = X.C51969G9p.A0h(r12)
            java.lang.String r2 = r4.A01
            r1 = 0
            r4 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r5 = 7
            r3 = r1
            X.GDe r4 = X.C52058GDe.A00((X.C61081JwJ) null, (X.HMA) null, (X.HLU) null, r0, (X.AnonymousClass3WA) null, (java.lang.Integer) null, (java.lang.Integer) null, r1, r2, r3, 0, 0, r4, r5, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false)
            return r4
        L_0x001d:
            com.instagram.user.model.Product r12 = (com.instagram.user.model.Product) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            com.instagram.user.model.User r0 = r12.A0B
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            goto L_0x0153
        L_0x002d:
            r1 = 0
            goto L_0x0153
        L_0x0030:
            X.Hlx r12 = (X.C55700Hlx) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.02Z r2 = r12.A01
            android.view.View r1 = r12.A00
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r12.A02
            r2.A0Y(r1, r0)
            java.lang.String r2 = r4.A01
            r0 = 16
            X.04x r1 = new X.04x
            r1.<init>(r0, r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r12.A02
            r0.addAction(r1)
            goto L_0x01d9
        L_0x004f:
            X.Gd5 r12 = (X.C52813Gd5) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.XRa r1 = X.C21255XRa.A1M
            java.lang.String r5 = r4.A01
            X.2Wc r3 = r12.A00
            X.JNh r0 = X.I3I.A01(r3)
            int r4 = X.C56611I4l.A01(r1, r0)
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r2 = X.C51972G9s.A0E(r3, r0)
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r0 = X.C51972G9s.A0E(r3, r0)
            int r0 = r0 / 2
            X.I9p r3 = new X.I9p
            r3.<init>(r2, r4, r0)
            int r2 = r12.length()
            r12.append(r5)
            int r1 = r12.length()
            r0 = 17
            r12.setSpan(r3, r2, r1, r0)
            goto L_0x01d9
        L_0x0088:
            X.Gd5 r12 = (X.C52813Gd5) r12
            r8 = 0
            X.0qQ.A0B(r12, r8)
            X.XSY r14 = X.XSY.BELL_OFF
            X.XRa r18 = X.C21255XRa.A1W
            X.HOw r17 = X.C54691HOw.FILLED
            long r6 = X.C51970G9q.A0H()
            r15 = 0
            long r0 = X.C51969G9p.A0D()
            X.HOv r16 = X.C54690HOv.SIZE_16
            X.2Wc r5 = r12.A00
            X.JNh r3 = X.I3I.A01(r5)
            X.IcX r13 = new X.IcX
            r13.<init>(r14, r15, r16, r17, r18)
            android.content.Context r2 = X.C243803a8.A00(r5)
            X.HsU r2 = r13.EIh(r2, r3)
            android.graphics.drawable.Drawable r10 = r2.A01
            r9 = 2
            r11 = 1
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r2 = X.C51972G9s.A0E(r5, r2)
            r10.setBounds(r8, r8, r2, r2)
            android.content.res.Resources r2 = X.C51971G9r.A0M(r5)
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.getLayoutDirection()
            if (r2 != r11) goto L_0x0102
            r2 = r6
            r6 = r0
        L_0x00cf:
            int r8 = X.C51969G9p.A09(r5, r2)
            int r3 = X.C51969G9p.A09(r5, r0)
            int r2 = X.C51969G9p.A09(r5, r6)
            int r1 = X.C51969G9p.A09(r5, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r8, r3, r2, r1)
            X.U2b r3 = new X.U2b
            r3.<init>(r0, r10, r9)
            int r2 = r12.length()
            java.lang.String r0 = " "
            r12.append(r0)
            int r1 = r12.length()
            r0 = 17
            r12.setSpan(r3, r2, r1, r0)
            java.lang.String r0 = r4.A01
            r12.append(r0)
            goto L_0x01d9
        L_0x0102:
            r2 = r0
            goto L_0x00cf
        L_0x0104:
            java.util.List r12 = (java.util.List) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.String r3 = r4.A01
            java.util.Iterator r2 = r12.iterator()
        L_0x0110:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            com.instagram.wonderwall.model.WallPostInfo r0 = r0.BeB()
            java.lang.String r0 = r0.A06
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x0110
            if (r1 == 0) goto L_0x01d9
            r12.remove(r1)
            goto L_0x01d9
        L_0x0130:
            X.Gmj r12 = (X.C53359Gmj) r12
            r6 = 0
            X.0qQ.A0B(r12, r6)
            java.lang.String r0 = r4.A01
            boolean r11 = X.DbW.A1a(r0)
            boolean r8 = r12.A02
            boolean r9 = r12.A01
            r5 = 1
            X.Gmj r4 = new X.Gmj
            r7 = r6
            r10 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x0149:
            com.facebook.hyperthrift.HyperThriftBase r12 = (com.facebook.hyperthrift.HyperThriftBase) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r1 = r12.A00(r0)
        L_0x0153:
            java.lang.String r0 = r4.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x015e:
            X.GnE r12 = (X.C53382GnE) r12
            r1 = 0
            X.0qQ.A0B(r12, r1)
            java.lang.String r5 = r4.A01
            java.lang.Object r6 = r12.A02
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r12.A01
            java.util.Set r7 = (java.util.Set) r7
            r0 = 1
            X.0qQ.A0B(r5, r1)
            X.AnonymousClass7TF.A1B(r6, r0, r7)
            X.GnE r4 = new X.GnE
            r8 = r0
            r9 = r1
            r10 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x017e:
            X.Tpd r12 = (X.C14087Tpd) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.String r13 = r4.A01
            r11 = 0
            r20 = 1
            r19 = 7742(0x1e3e, float:1.0849E-41)
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r21 = r0
            r22 = r0
            r23 = r0
            X.Tpd r4 = X.C14087Tpd.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r4
        L_0x019e:
            X.ULi r12 = (X.ULi) r12
            r3 = 0
            X.0qQ.A0B(r12, r3)
            java.lang.String r2 = r4.A01
            java.lang.Object r1 = r12.A01
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.0qQ.A0B(r2, r3)
            X.0qQ.A0B(r1, r0)
            X.ULi r4 = new X.ULi
            r4.<init>((java.lang.String) r2, (java.util.List) r1, (boolean) r0, (boolean) r3)
            return r4
        L_0x01b7:
            X.NCZ r12 = (X.NCZ) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.NDB r1 = r12.A03
            java.lang.String r0 = r4.A01
            long r2 = java.lang.Long.parseLong(r0)
            com.facebook.rsys.livevideo.gen.LiveVideoApi r1 = r1.A00
            if (r1 == 0) goto L_0x01d0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.updateBroadcastId(r0)
        L_0x01d0:
            X.OU3 r0 = r12.A01
            com.facebook.rsys.callmanager.gen.CallApi r0 = r0.A02
            if (r0 == 0) goto L_0x01d9
            r0.finishSetup()
        L_0x01d9:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58729Iwc.invoke(java.lang.Object):java.lang.Object");
    }
}
