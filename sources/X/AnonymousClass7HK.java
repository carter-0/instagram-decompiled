package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.7HK  reason: invalid class name */
public final class AnonymousClass7HK implements AnonymousClass7HL {
    public final /* synthetic */ AnonymousClass7H6 A00;

    public final boolean Dj1(String str) {
        C333547Zj A002;
        C254933tI r8;
        String str2 = str;
        0qQ.A0B(str2, 0);
        AnonymousClass7H6 r4 = this.A00;
        if (str2.length() == 0) {
            return false;
        }
        C254743sy r3 = r4.A0S;
        if (r3 != null) {
            if (r3 instanceof MsysThreadId) {
                A002 = C67497Mor.A00(r4.A0w);
            } else {
                A002 = C333527Zh.A00(r4.A0w);
            }
            C333547Zj r6 = A002;
            AnonymousClass77B A05 = AnonymousClass7H6.A05(r4);
            if (A05 != null) {
                if (!r4.A0i) {
                    r8 = AnonymousClass7H6.A07(r4);
                } else {
                    r8 = null;
                }
                if (A05.A0g) {
                    C62320sa r0 = r4.A0Z;
                    if (r0 != null) {
                        r0.invoke();
                    }
                    r6.EMO(r8, r3, r4.A0X, A05.A0S, (String) null, str2, (String) null);
                    r4.A10.A00(C69347Njm.PERMANENT_MEDIA_VIEWER, r3, (String) null);
                } else {
                    C254793t3 A09 = AnonymousClass7H6.A09(r3);
                    if (A09 != null) {
                        r4.A0v.A02(r6.EMt((C70766OKm) null, r8, (OCA) null, r4.A0R, 2FW.A1g, A09, (Integer) null, (Integer) null, str2, "toast", (String) null, (String) null, (String) null, (String) null, A05.A0b, A05.A0m, false), new PSG(r4, A09));
                        if (r8 != null) {
                            r4.A10.A00(C69347Njm.PERMANENT_MEDIA_VIEWER, r3, r8.A0F.A00);
                        }
                    }
                }
            }
        }
        r4.A0a.invoke();
        return true;
    }

    public AnonymousClass7HK(AnonymousClass7H6 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        if (r0 != false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D00() {
        /*
            r16 = this;
            r0 = r16
            X.7H6 r6 = r0.A00
            X.77B r7 = X.AnonymousClass7H6.A05(r6)
            if (r7 == 0) goto L_0x008e
            boolean r0 = r6.A0i
            r0 = r0 ^ 1
            r8 = 0
            if (r0 == 0) goto L_0x0015
            X.3tI r8 = X.AnonymousClass7H6.A07(r6)
        L_0x0015:
            X.3sy r1 = r6.A0S
            boolean r0 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x0094
            java.util.List r1 = r7.A0b
            if (r1 != 0) goto L_0x0021
            X.0sn r1 = X.0sn.A00
        L_0x0021:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r11 = r6.A0w
            com.instagram.user.model.User r0 = r0.A01(r11)
            java.util.ArrayList r2 = X.00k.A0T(r0, r1)
            X.3sy r0 = r6.A0S
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = X.C66647MaG.A06(r0)
            com.instagram.model.direct.DirectShareTarget r0 = r6.A0R
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = r0.A0I
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = ""
        L_0x003d:
            com.instagram.model.direct.DirectShareTarget r0 = X.C70118NxY.A00(r11, r1, r0, r2)
            com.instagram.model.direct.camera.DirectCameraViewModel r9 = X.C71046OaO.A03(r11, r0)
        L_0x0045:
            X.0qQ.A0A(r9)
            boolean r0 = r7.A0s
            if (r0 == 0) goto L_0x008f
            X.1aU r2 = r7.A0B
        L_0x004e:
            X.Pw3 r0 = r6.A0L
            if (r0 == 0) goto L_0x008e
            android.widget.ImageView r0 = r0.Ajf()
            if (r0 == 0) goto L_0x008e
            android.graphics.RectF r5 = X.0nA.A0F(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.add(r0)
            if (r8 == 0) goto L_0x0078
            X.7HC r4 = r6.A10
            X.3sy r3 = r6.A0S
            X.Njm r1 = X.C69347Njm.PERMANENT_MEDIA_VIEWER
            X.2FW r0 = r8.A0F
            java.lang.String r0 = r0.A00
            r4.A00(r1, r3, r0)
        L_0x0078:
            X.2Ep r0 = r6.A0N
            if (r0 == 0) goto L_0x0083
            boolean r0 = X.C69960Nv0.A00(r11, r0)
            r11 = 1
            if (r0 == 0) goto L_0x0084
        L_0x0083:
            r11 = 0
        L_0x0084:
            X.1a8 r0 = r6.A0v
            X.PSh r4 = new X.PSh
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.A02(r2, r4)
        L_0x008e:
            return
        L_0x008f:
            X.1aU r2 = r7.A09
            goto L_0x004e
        L_0x0092:
            r0 = 0
            goto L_0x003d
        L_0x0094:
            X.2Ep r13 = r6.A0N
            if (r13 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r11 = r6.A0w
            androidx.fragment.app.FragmentActivity r10 = r6.A0t
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r1)
            java.lang.String r14 = r0.A00
            r15 = 7
            if (r8 != 0) goto L_0x00a6
            r15 = 0
        L_0x00a6:
            r12 = r8
            com.instagram.model.direct.camera.DirectCameraViewModel r9 = X.C71046OaO.A01(r10, r11, r12, r13, r14, r15)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HK.D00():void");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.Y6q, X.0sa] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r5.A03 != 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r1 != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMs(int r13) {
        /*
            r12 = this;
            X.7H6 r2 = r12.A00
            X.OIL r0 = X.AnonymousClass7H6.A03(r2)
            if (r0 == 0) goto L_0x003b
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r0.A0E
            if (r1 == 0) goto L_0x003b
            r11 = 0
            if (r13 <= 0) goto L_0x0042
            X.Oal r7 = r2.A0J
            if (r7 == 0) goto L_0x0038
            android.view.View r0 = r7.A0A
            int r6 = r0.getHeight()
            int r6 = r6 - r13
            int r5 = r1.getHeight()
            int r4 = r1.getWidth()
            if (r5 <= r6) goto L_0x003c
            float r3 = (float) r6
            float r0 = (float) r5
            float r3 = r3 / r0
            r7.A00 = r3
            float r0 = (float) r4
            float r0 = r0 * r3
            int r4 = (int) r0
        L_0x002c:
            r7.A03 = r13
            float r5 = (float) r6
            float r4 = (float) r4
            int r0 = -r13
            float r3 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            X.C71066Oal.A00(r1, r5, r4, r3)
        L_0x0038:
            X.AnonymousClass7H6.A0V(r2, r11)
        L_0x003b:
            return
        L_0x003c:
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A00 = r0
            r6 = r5
            goto L_0x002c
        L_0x0042:
            boolean r0 = r2.A1E
            if (r0 == 0) goto L_0x009d
            X.OIL r3 = X.AnonymousClass7H6.A03(r2)
            if (r3 == 0) goto L_0x003b
            X.77B r0 = X.AnonymousClass7H6.A05(r2)
            if (r0 == 0) goto L_0x003b
            X.OZ0 r4 = X.OZ0.A00
            android.content.Context r6 = r3.A02
            float r9 = r0.A02
            androidx.fragment.app.FragmentActivity r5 = r2.A0t
            X.Y4M r7 = new X.Y4M
            r7.<init>(r2)
            X.Y6q r0 = new X.Y6q
            r0.<init>(r2)
            X.Y4Q r8 = new X.Y4Q
            r8.<init>(r0)
            boolean r10 = X.AnonymousClass7H6.A0e(r2)
            X.0eP r3 = r4.A01(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r3.A00
            java.lang.Number r0 = (java.lang.Number) r0
            float r4 = r0.floatValue()
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            float r3 = r0.floatValue()
            X.Oal r5 = r2.A0J
            if (r5 == 0) goto L_0x008d
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x00b1
            int r0 = r5.A03
            if (r0 != 0) goto L_0x00b1
        L_0x008d:
            X.77B r0 = X.AnonymousClass7H6.A05(r2)
            if (r0 == 0) goto L_0x0098
            boolean r1 = r0.A0p
            r0 = 1
            if (r1 == 0) goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            X.AnonymousClass7H6.A0V(r2, r0)
            return
        L_0x009d:
            X.Oal r5 = r2.A0J
            if (r5 == 0) goto L_0x008d
            int r0 = r1.getHeight()
            float r4 = (float) r0
            float r0 = r5.A00
            float r4 = r4 / r0
            int r0 = r1.getWidth()
            float r3 = (float) r0
            float r0 = r5.A00
            float r3 = r3 / r0
        L_0x00b1:
            r5.A03 = r11
            r0 = 0
            X.C71066Oal.A00(r1, r4, r3, r0)
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HK.DMs(int):void");
    }
}
