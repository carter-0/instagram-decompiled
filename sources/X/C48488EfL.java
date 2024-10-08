package X;

/* renamed from: X.EfL  reason: case insensitive filesystem */
public abstract class C48488EfL {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        if (X.C273654mx.A00(3493).equals(r6.getHost()) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if ("barcelona".equals(r6.getScheme()) != false) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C307896Rx r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
        /*
            androidx.fragment.app.FragmentActivity r13 = X.C308206Td.A04(r24)
            X.0lg r7 = X.C308206Td.A0B(r24)
            X.0iw r11 = X.C308206Td.A08(r24)
            java.lang.String r0 = r11.getModuleName()
            r4 = r25
            android.os.Bundle r3 = X.FGU.A00(r7, r4, r0)
            r12 = 0
            r2 = 1
            r14 = r12
            r15 = r3
            r16 = r7
            r17 = r4
            r18 = r2
            X.34S r0 = X.FGU.A01(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x002f
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            return
        L_0x002f:
            android.net.Uri r6 = X.0cp.A03(r4)
            boolean r0 = r6.isOpaque()
            java.lang.String r5 = "android.intent.action.VIEW"
            if (r0 == 0) goto L_0x004c
            boolean r0 = r6.isAbsolute()
            if (r0 == 0) goto L_0x004c
            android.content.Intent r0 = X.DbY.A06(r5)
            r0.setData(r6)
            X.0kR.A0D(r13, r0)
            return
        L_0x004c:
            java.lang.String r1 = r6.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r6.getHost()
            r0 = 1893(0x765, float:2.653E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0084
            java.lang.String r1 = r6.getHost()
            r0 = 3493(0xda5, float:4.895E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0084
        L_0x0078:
            java.lang.String r1 = r6.getScheme()
            java.lang.String r0 = "barcelona"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015d
        L_0x0084:
            boolean r0 = X.0oI.A0A(r13)
            if (r0 == 0) goto L_0x0114
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r5, r6)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r8.addFlags(r0)
            r0 = 1024(0x400, float:1.435E-42)
            r8.addFlags(r0)
            java.lang.String r0 = "com.instagram.barcelona"
        L_0x009b:
            r8.setPackage(r0)
        L_0x009e:
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0160
            if (r8 == 0) goto L_0x0160
            X.0lg r10 = X.C308206Td.A0B(r24)
            X.0Tu r9 = X.0Tu.A05
            r0 = 2342161630626453830(0x20810798000a1946, double:4.064416955200032E-152)
            boolean r0 = X.182.A06(r9, r10, r0)
            if (r0 == 0) goto L_0x0160
            r0 = 36602986905736036(0x820a39003c1364, double:3.211214535360967E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r9, r7, r0)
            int r10 = r0.intValue()
            java.lang.String r1 = X.0oI.A04(r13)
            if (r1 == 0) goto L_0x010d
            boolean r0 = X.0oI.A0A(r13)
            if (r0 == 0) goto L_0x010d
            r0 = 337(0x151, float:4.72E-43)
            int r0 = java.lang.Math.max(r10, r0)
            boolean r0 = X.0oI.A0H(r13, r1, r0)
            if (r0 == 0) goto L_0x010d
            r0 = 3352(0xd18, float:4.697E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r10 = r6.getQueryParameter(r0)
            java.lang.String r0 = "deeplink_ig_tifu=1"
            boolean r0 = r4.contains(r0)
            if (r10 == 0) goto L_0x010d
            if (r0 == 0) goto L_0x010d
            r0 = 36321511928374752(0x810a39003225e0, double:3.033208626268931E-306)
            boolean r0 = X.182.A06(r9, r7, r0)
            if (r0 == 0) goto L_0x010d
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.IwM r1 = new X.IwM
            r1.<init>(r7, r0)
            java.lang.Class<X.IOo> r0 = X.C57100IOo.class
            java.lang.Object r0 = r7.A01(r0, r1)
            X.IOo r0 = (X.C57100IOo) r0
            r0.A00(r10)
        L_0x010d:
            boolean r0 = X.0kR.A0A(r13, r8)
            if (r0 == 0) goto L_0x0160
            return
        L_0x0114:
            java.lang.String r0 = r6.getPath()
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = r6.getPath()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0130
            java.lang.String r1 = r6.getPath()
            java.lang.String r0 = "/mainfeed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x015d
        L_0x0130:
            X.0lg r9 = X.C308206Td.A0B(r24)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36881571366240637(0x830798000b017d, double:3.387392469953659E-306)
            java.lang.String r1 = X.182.A04(r8, r9, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x015d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            boolean r0 = X.0oI.A0F(r13)
            android.content.Intent r8 = new android.content.Intent
            if (r0 == 0) goto L_0x0158
            r8.<init>(r5, r1)
            java.lang.String r0 = "com.android.vending"
            goto L_0x009b
        L_0x0158:
            r8.<init>(r5, r1)
            goto L_0x009e
        L_0x015d:
            r8 = r12
            goto L_0x009e
        L_0x0160:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r6)
            r0 = 3
            java.lang.String r7 = X.C66579MXk.A00(r0)
            android.content.Intent r1 = r1.putExtra(r7, r2)
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r8 = r1.setFlags(r0)
            int r1 = X.0oI.A00(r13, r8)
            r0 = 4
            if (r1 != r0) goto L_0x018e
            boolean r0 = X.0kR.A0A(r13, r8)
            if (r0 != 0) goto L_0x002e
            java.lang.String r1 = "Opening FOA URL "
            java.lang.String r0 = " was unsuccessful."
            java.lang.String r1 = X.002.A0g(r1, r4, r0)
            java.lang.String r0 = "BKBloksActionNavigationOpenUrlImpl"
            X.1Kn.A02(r0, r1)
        L_0x018e:
            r14 = 0
            X.0qQ.A0B(r4, r14)
            android.net.Uri r0 = X.0cp.A03(r4)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ab
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r6)
            X.0kR.A09(r13, r0)
            return
        L_0x01ab:
            X.14E r0 = X.14D.A04
            X.14D r1 = r0.A00()
            if (r1 == 0) goto L_0x002e
            X.0lg r0 = X.C308206Td.A0B(r24)
            X.0wW r0 = (X.AnonymousClass0wW) r0
            X.34S r0 = r1.A00(r0, r4)
            androidx.fragment.app.FragmentActivity r6 = X.C308206Td.A04(r24)
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r5 = r0.A00
            if (r5 == 0) goto L_0x01fa
            android.net.Uri r1 = X.0cp.A03(r4)
            if (r1 == 0) goto L_0x01dc
            X.14B r0 = X.AnonymousClass14B.A00()
            android.content.Intent r0 = r0.A04(r6, r1)
            r0.putExtra(r7, r2)
            X.0kR.A0B(r6, r0)
            return
        L_0x01dc:
            X.G7o r5 = (X.C51920G7o) r5
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x01e7
            android.os.Bundle r0 = (android.os.Bundle) r0
            r3.putAll(r0)
        L_0x01e7:
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK"
            r3.putBoolean(r0, r2)
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A04(r24)
            X.0lg r0 = X.C308206Td.A0B(r24)
            X.0wW r0 = (X.AnonymousClass0wW) r0
            r5.CI1(r3, r1, r0)
            return
        L_0x01fa:
            com.instagram.common.session.UserSession r3 = X.DbT.A0Z(r24)
            java.lang.String r0 = "download/redirect"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x020c
            java.lang.String r0 = "tifu"
            X.C49965FGy.A03(r6, r3, r0, r12)
            return
        L_0x020c:
            X.0lg r0 = X.C308206Td.A0B(r24)
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0235
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A04(r24)
            X.2EG r0 = X.2EG.A0V
            X.SUL r1 = new X.SUL
            r1.<init>(r2, r3, r0, r4)
            java.lang.String r0 = r11.getModuleName()
            r1.A0S = r0
            r0 = r26
            if (r26 == 0) goto L_0x0231
            r1.A0D(r0)
            r0 = r27
            r1.A0B(r0)
        L_0x0231:
            r1.A0A()
            return
        L_0x0235:
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A04(r24)
            X.0lg r0 = X.C308206Td.A0B(r24)
            com.instagram.simplewebview.SimpleWebViewConfig r11 = new com.instagram.simplewebview.SimpleWebViewConfig
            r13 = r12
            r15 = r14
            r16 = r14
            r17 = r14
            r19 = r2
            r20 = r14
            r21 = r14
            r22 = r2
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r12
            r27 = r4
            r11.<init>((java.lang.String) r12, (java.lang.String) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21, (boolean) r22, (boolean) r23, (boolean) r24, (boolean) r25, (java.lang.String) r26, (java.lang.String) r27)
            com.instagram.simplewebview.SimpleWebViewActivity.A00(r1, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48488EfL.A00(X.6Rx, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
