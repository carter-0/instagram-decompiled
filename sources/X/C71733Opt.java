package X;

import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Opt  reason: case insensitive filesystem */
public final class C71733Opt implements C295145ne {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C71733Opt(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static NotificationScope A00(C295115nb r1, Object obj, String str, int i) {
        return r1.A00(new C71733Opt(str, obj, i), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.5z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.NBH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.5z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.NAo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.NAo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.NBH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.NBH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: X.NAo} */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.NAt, X.5z0] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.NAq, X.5z0] */
    /* JADX WARNING: type inference failed for: r6v2, types: [X.5z0, X.NAi] */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.5z0, X.NAp] */
    /* JADX WARNING: type inference failed for: r12v2, types: [X.5z0] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e2, code lost:
        r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0);
        r0 = ((X.C67192Mjo) r14.A01).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0145, code lost:
        r1 = r14.A02;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x022d, code lost:
        r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0);
        r0 = ((X.C71723Oph) r14.A01).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r0.setResult(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0286, code lost:
        r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x062a, code lost:
        r0.setResult(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x062d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DfW(java.util.Map r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0274;
                case 1: goto L_0x060a;
                case 2: goto L_0x05e4;
                case 3: goto L_0x05be;
                case 4: goto L_0x0260;
                case 5: goto L_0x024c;
                case 6: goto L_0x0238;
                case 7: goto L_0x0224;
                case 8: goto L_0x021a;
                case 9: goto L_0x0210;
                case 10: goto L_0x01fc;
                case 11: goto L_0x01e7;
                case 12: goto L_0x01d2;
                case 13: goto L_0x01bd;
                case 14: goto L_0x01a8;
                case 15: goto L_0x0193;
                case 16: goto L_0x0188;
                case 17: goto L_0x0173;
                case 18: goto L_0x015e;
                case 19: goto L_0x0597;
                case 20: goto L_0x0574;
                case 21: goto L_0x054c;
                case 22: goto L_0x0526;
                case 23: goto L_0x0500;
                case 24: goto L_0x04dd;
                case 25: goto L_0x04b9;
                case 26: goto L_0x0495;
                case 27: goto L_0x046f;
                case 28: goto L_0x043f;
                case 29: goto L_0x014a;
                case 30: goto L_0x0140;
                case 31: goto L_0x012b;
                case 32: goto L_0x0414;
                case 33: goto L_0x03e9;
                case 34: goto L_0x03c6;
                case 35: goto L_0x0117;
                case 36: goto L_0x0103;
                case 37: goto L_0x00ee;
                case 38: goto L_0x00d9;
                case 39: goto L_0x00cf;
                case 40: goto L_0x00c5;
                case 41: goto L_0x0345;
                case 42: goto L_0x00bb;
                case 43: goto L_0x00b1;
                case 44: goto L_0x0326;
                case 45: goto L_0x00aa;
                case 46: goto L_0x0096;
                case 47: goto L_0x0082;
                case 48: goto L_0x006d;
                case 49: goto L_0x0058;
                case 50: goto L_0x0044;
                case 51: goto L_0x002f;
                case 52: goto L_0x001b;
                case 53: goto L_0x02db;
                case 54: goto L_0x028a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r15.getClass()
            X.681 r2 = X.NAV.A00
            java.lang.String r1 = r14.A02
            r0 = 1
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Op9 r0 = (X.Op9) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A00
        L_0x0017:
            r0.setResult(r1)
            return
        L_0x001b:
            r15.getClass()
            X.681 r2 = X.NAT.A00
            java.lang.String r1 = r14.A02
            r0 = 26
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OpO r0 = (X.C71704OpO) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A03
            goto L_0x0017
        L_0x002f:
            r15.getClass()
            X.681 r2 = X.NAT.A00
            java.lang.String r1 = r14.A02
            r0 = 34
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Op7 r0 = (X.C71688Op7) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x0044:
            r15.getClass()
            X.681 r2 = X.NAT.A00
            java.lang.String r1 = r14.A02
            r0 = 35
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Oom r0 = (X.C71667Oom) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A02
            goto L_0x0017
        L_0x0058:
            r15.getClass()
            X.681 r2 = X.NAT.A00
            java.lang.String r1 = r14.A02
            r0 = 33
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Op7 r0 = (X.C71688Op7) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x006d:
            r15.getClass()
            X.681 r2 = X.NAT.A00
            java.lang.String r1 = r14.A02
            r0 = 29
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Oow r0 = (X.C71677Oow) r0
            java.lang.Object r0 = r0.A04
            goto L_0x0286
        L_0x0082:
            r15.getClass()
            X.681 r2 = X.NAS.A00
            java.lang.String r1 = r14.A02
            r0 = 5
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Op8 r0 = (X.C71689Op8) r0
            java.lang.Object r0 = r0.A03
            goto L_0x0286
        L_0x0096:
            r15.getClass()
            X.681 r2 = X.NAS.A00
            java.lang.String r1 = r14.A02
            r0 = 0
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Op0 r0 = (X.C71681Op0) r0
            java.lang.Object r0 = r0.A03
            goto L_0x0286
        L_0x00aa:
            r15.getClass()
            X.681 r2 = X.NAP.A00
            goto L_0x0145
        L_0x00b1:
            r15.getClass()
            X.681 r2 = X.AnonymousClass67N.A00
            java.lang.String r1 = r14.A02
            r0 = 14
            goto L_0x00e2
        L_0x00bb:
            r15.getClass()
            X.681 r2 = X.AnonymousClass67N.A00
            java.lang.String r1 = r14.A02
            r0 = 12
            goto L_0x00e2
        L_0x00c5:
            r15.getClass()
            X.681 r2 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 17
            goto L_0x00e2
        L_0x00cf:
            r15.getClass()
            X.681 r2 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 26
            goto L_0x00e2
        L_0x00d9:
            r15.getClass()
            X.681 r2 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 18
        L_0x00e2:
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Mjo r0 = (X.C67192Mjo) r0
            java.lang.Object r0 = r0.A03
            goto L_0x0286
        L_0x00ee:
            r15.getClass()
            X.681 r2 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 16
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Ooh r0 = (X.C71662Ooh) r0
            java.lang.Object r0 = r0.A04
            goto L_0x0286
        L_0x0103:
            r15.getClass()
            X.681 r2 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 1
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Op6 r0 = (X.C71687Op6) r0
            java.lang.Object r0 = r0.A04
            goto L_0x0286
        L_0x0117:
            r15.getClass()
            X.681 r2 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 2
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Ooq r0 = (X.C71671Ooq) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A02
            goto L_0x0017
        L_0x012b:
            r15.getClass()
            X.681 r2 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 21
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Op1 r0 = (X.C71682Op1) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A02
            goto L_0x0017
        L_0x0140:
            r15.getClass()
            X.681 r2 = X.NAN.A00
        L_0x0145:
            java.lang.String r1 = r14.A02
            r0 = 0
            goto L_0x022d
        L_0x014a:
            r15.getClass()
            X.681 r2 = X.NAN.A00
            java.lang.String r1 = r14.A02
            r0 = 3
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Opd r0 = (X.C71719Opd) r0
            java.lang.Object r0 = r0.A03
            goto L_0x0286
        L_0x015e:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 382(0x17e, float:5.35E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r0 = r0.A03
            goto L_0x0286
        L_0x0173:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 390(0x186, float:5.47E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OpK r0 = (X.C71700OpK) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A01
            goto L_0x0017
        L_0x0188:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 378(0x17a, float:5.3E-43)
            goto L_0x022d
        L_0x0193:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 353(0x161, float:4.95E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Opd r0 = (X.C71719Opd) r0
            java.lang.Object r0 = r0.A03
            goto L_0x0286
        L_0x01a8:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 347(0x15b, float:4.86E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x01bd:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 389(0x185, float:5.45E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoX r0 = (X.C71652OoX) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x01d2:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 319(0x13f, float:4.47E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoX r0 = (X.C71652OoX) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x01e7:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 320(0x140, float:4.48E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoX r0 = (X.C71652OoX) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x01fc:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 318(0x13e, float:4.46E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x0210:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 388(0x184, float:5.44E-43)
            goto L_0x022d
        L_0x021a:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 385(0x181, float:5.4E-43)
            goto L_0x022d
        L_0x0224:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 321(0x141, float:4.5E-43)
        L_0x022d:
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Oph r0 = (X.C71723Oph) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x0238:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 317(0x13d, float:4.44E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.Op8 r0 = (X.C71689Op8) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x024c:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 360(0x168, float:5.04E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r0 = r0.A02
            goto L_0x0286
        L_0x0260:
            r15.getClass()
            X.681 r2 = X.NAX.A00
            java.lang.String r1 = r14.A02
            r0 = 250(0xfa, float:3.5E-43)
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r0 = r0.A03
            goto L_0x0286
        L_0x0274:
            r15.getClass()
            X.681 r2 = X.NAW.A00
            java.lang.String r1 = r14.A02
            r0 = 5
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.Object r0 = r14.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r0 = r0.A03
        L_0x0286:
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            goto L_0x0017
        L_0x028a:
            r15.getClass()
            X.681 r1 = X.C68314NAb.A00
            java.lang.String r2 = r14.A02
            r0 = 42
            java.lang.Object r8 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r1, r15, r2, r0)
            java.lang.Number r8 = (java.lang.Number) r8
            r0 = 43
            java.lang.Object r0 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r1, r15, r2, r0)
            boolean r11 = X.AnonymousClass7TE.A1a(r0)
            r0 = 38
            java.lang.Object r9 = X.C66581MXm.A0s(r1, r15, r0)
            java.lang.Number r9 = (java.lang.Number) r9
            r0 = 34
            java.lang.Object r10 = X.C66581MXm.A0s(r1, r15, r0)
            byte[] r10 = (byte[]) r10
            r0 = 40
            java.lang.Object r6 = X.C66581MXm.A0s(r1, r15, r0)
            android.net.Uri r6 = (android.net.Uri) r6
            r0 = 39
            java.lang.Object r0 = r1.A00(r0)
            r15.get(r0)
            r0 = 41
            java.lang.Object r7 = X.C66581MXm.A0s(r1, r15, r0)
            com.facebook.msys.mca.MailboxHealthReport r7 = (com.facebook.msys.mca.MailboxHealthReport) r7
            java.lang.Object r0 = r14.A01
            X.Ope r0 = (X.C71720Ope) r0
            java.lang.Object r0 = r0.A04
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            X.OGh r5 = new X.OGh
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x062a
        L_0x02db:
            r15.getClass()
            X.681 r2 = X.C68314NAb.A00
            java.lang.String r1 = r14.A02
            r0 = 25
            com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            r0 = 26
            java.lang.Object r7 = X.C66581MXm.A0s(r2, r15, r0)
            java.lang.Number r7 = (java.lang.Number) r7
            r0 = 29
            java.lang.Object r8 = X.C66581MXm.A0s(r2, r15, r0)
            java.lang.Number r8 = (java.lang.Number) r8
            r0 = 27
            java.lang.Object r6 = X.C66581MXm.A0s(r2, r15, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r0 = 31
            java.lang.Object r10 = X.C66581MXm.A0s(r2, r15, r0)
            java.lang.String r10 = (java.lang.String) r10
            r0 = 30
            java.lang.Object r9 = X.C66581MXm.A0s(r2, r15, r0)
            java.lang.Number r9 = (java.lang.Number) r9
            r0 = 16
            java.lang.Object r11 = X.C66581MXm.A0s(r2, r15, r0)
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = r14.A01
            X.Opi r0 = (X.C71724Opi) r0
            java.lang.Object r0 = r0.A04
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            X.OGg r5 = new X.OGg
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x062a
        L_0x0326:
            r15.getClass()
            X.681 r2 = X.NAO.A00
            java.lang.String r1 = r14.A02
            r0 = 5
            com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            r0 = 0
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r14.A01
            X.OpR r0 = (X.C71707OpR) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A01
            X.O5b r5 = new X.O5b
            r5.<init>(r1)
            goto L_0x062a
        L_0x0345:
            r15.getClass()
            X.681 r1 = X.AnonymousClass67N.A00
            java.lang.String r2 = r14.A02
            r0 = 28
            java.lang.Object r7 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r1, r15, r2, r0)
            com.facebook.msys.mci.CQLResultSet r7 = (com.facebook.msys.mci.CQLResultSet) r7
            r0 = 23
            java.lang.Object r6 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r1, r15, r2, r0)
            com.facebook.msys.mci.CQLResultSet r6 = (com.facebook.msys.mci.CQLResultSet) r6
            r0 = 19
            java.lang.Object r13 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r1, r15, r2, r0)
            java.util.Map r13 = (java.util.Map) r13
            r0 = 3
            java.lang.Object r5 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r1, r15, r2, r0)
            com.facebook.msys.mci.CQLResultSet r5 = (com.facebook.msys.mci.CQLResultSet) r5
            r0 = 26
            java.lang.Object r4 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r1, r15, r2, r0)
            com.facebook.msys.mci.CQLResultSet r4 = (com.facebook.msys.mci.CQLResultSet) r4
            r0 = 15
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r15, r0)
            com.facebook.msys.mci.CQLResultSet r3 = (com.facebook.msys.mci.CQLResultSet) r3
            r0 = 16
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r15, r0)
            com.facebook.msys.mci.CQLResultSet r2 = (com.facebook.msys.mci.CQLResultSet) r2
            r0 = 29
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r15, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r14.A01
            X.OpE r0 = (X.C71694OpE) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A07
            X.NAt r11 = new X.NAt
            r11.<init>(r7)
            X.NAq r10 = new X.NAq
            r10.<init>(r6)
            X.NAi r6 = new X.NAi
            r6.<init>(r5)
            X.NAp r9 = new X.NAp
            r9.<init>(r4)
            r12 = 0
            if (r3 != 0) goto L_0x03c0
            r7 = r12
        L_0x03a9:
            if (r2 != 0) goto L_0x03ba
            r8 = r12
        L_0x03ac:
            if (r1 == 0) goto L_0x03b3
            X.NBE r12 = new X.NBE
            r12.<init>(r1)
        L_0x03b3:
            X.OHg r5 = new X.OHg
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x062a
        L_0x03ba:
            X.NAo r8 = new X.NAo
            r8.<init>(r2)
            goto L_0x03ac
        L_0x03c0:
            X.NBH r7 = new X.NBH
            r7.<init>(r3)
            goto L_0x03a9
        L_0x03c6:
            r15.getClass()
            X.681 r3 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 25
            java.lang.Object r2 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r14.A01
            X.OpC r0 = (X.C71692OpC) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A02
            X.OAu r5 = new X.OAu
            r5.<init>(r2, r1)
            goto L_0x062a
        L_0x03e9:
            r15.getClass()
            X.681 r4 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 24
            java.lang.Object r3 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r4, r15, r1, r0)
            java.util.List r3 = (java.util.List) r3
            r0 = 20
            java.lang.Object r2 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r4, r15, r1, r0)
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r4, r15, r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r14.A01
            X.Mdc r0 = (X.C66844Mdc) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A03
            X.Mda r5 = new X.Mda
            r5.<init>(r3, r2, r1)
            goto L_0x062a
        L_0x0414:
            r15.getClass()
            X.681 r4 = X.NAZ.A00
            java.lang.String r1 = r14.A02
            r0 = 23
            java.lang.Object r3 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r4, r15, r1, r0)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 19
            java.lang.Object r2 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r4, r15, r1, r0)
            java.util.Map r2 = (java.util.Map) r2
            r0 = 0
            java.lang.Object r1 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r4, r15, r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r14.A01
            X.Op2 r0 = (X.C71683Op2) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A02
            X.A5x r5 = new X.A5x
            r5.<init>(r3, r2, r1)
            goto L_0x062a
        L_0x043f:
            r15.getClass()
            X.681 r4 = X.NAY.A00
            r0 = 23
            java.lang.Object r3 = X.C66581MXm.A0s(r4, r15, r0)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 15
            java.lang.Object r2 = X.C66581MXm.A0s(r4, r15, r0)
            com.facebook.msys.mcf.MsysError r2 = (com.facebook.msys.mcf.MsysError) r2
            java.lang.String r1 = r14.A02
            r0 = 14
            java.lang.Object r0 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r4, r15, r1, r0)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r14.A01
            X.Op6 r0 = (X.C71687Op6) r0
            java.lang.Object r0 = r0.A03
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            X.ODB r5 = new X.ODB
            r5.<init>(r2, r3, r1)
            goto L_0x062a
        L_0x046f:
            r15.getClass()
            X.681 r3 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 33
            java.lang.Object r2 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 32
            java.lang.Object r1 = X.C66581MXm.A0s(r3, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.Op5 r0 = (X.C71686Op5) r0
            java.lang.Object r0 = r0.A04
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            X.OAs r5 = new X.OAs
            r5.<init>(r1, r2)
            goto L_0x062a
        L_0x0495:
            r15.getClass()
            X.681 r3 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 33
            java.lang.Object r2 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 32
            java.lang.Object r1 = X.C66581MXm.A0s(r3, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.OpM r0 = (X.C71702OpM) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A04
            X.OAr r5 = new X.OAr
            r5.<init>(r1, r2)
            goto L_0x062a
        L_0x04b9:
            r15.getClass()
            X.681 r3 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 33
            java.lang.Object r2 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 32
            java.lang.Object r1 = X.C66581MXm.A0s(r3, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.OpL r0 = (X.C71701OpL) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A03
            X.OAq r5 = new X.OAq
            r5.<init>(r1, r2)
            goto L_0x062a
        L_0x04dd:
            r15.getClass()
            X.681 r2 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 52
            com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            r0 = 50
            java.lang.Object r1 = X.C66581MXm.A0s(r2, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.Op0 r0 = (X.C71681Op0) r0
            java.lang.Object r0 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            X.O5Z r5 = new X.O5Z
            r5.<init>(r1)
            goto L_0x062a
        L_0x0500:
            r15.getClass()
            X.681 r3 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 49
            java.lang.Object r0 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            r0 = 47
            java.lang.Object r1 = X.C66581MXm.A0s(r3, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.Oop r0 = (X.C71670Oop) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A02
            X.OAo r5 = new X.OAo
            r5.<init>(r1, r2)
            goto L_0x062a
        L_0x0526:
            r15.getClass()
            X.681 r3 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 49
            java.lang.Object r0 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            r0 = 47
            java.lang.Object r1 = X.C66581MXm.A0s(r3, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.OpA r0 = (X.C71690OpA) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A02
            X.OAp r5 = new X.OAp
            r5.<init>(r1, r2)
            goto L_0x062a
        L_0x054c:
            r15.getClass()
            X.681 r3 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 46
            java.lang.Object r0 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            r0 = 44
            java.lang.Object r1 = X.C66581MXm.A0s(r3, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.Ool r0 = (X.C71666Ool) r0
            java.lang.Object r0 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            X.OAn r5 = new X.OAn
            r5.<init>(r1, r2)
            goto L_0x062a
        L_0x0574:
            r15.getClass()
            X.681 r2 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 30
            com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            r0 = 28
            java.lang.Object r1 = X.C66581MXm.A0s(r2, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r0 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            X.O5Y r5 = new X.O5Y
            r5.<init>(r1)
            goto L_0x062a
        L_0x0597:
            r15.getClass()
            X.681 r3 = X.NAY.A00
            java.lang.String r1 = r14.A02
            r0 = 42
            java.lang.Object r0 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r3, r15, r1, r0)
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            r0 = 40
            java.lang.Object r1 = X.C66581MXm.A0s(r3, r15, r0)
            com.facebook.msys.mcf.MsysError r1 = (com.facebook.msys.mcf.MsysError) r1
            java.lang.Object r0 = r14.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r0 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r0 = (com.facebook.msys.mca.MailboxObservableImpl) r0
            X.OAm r5 = new X.OAm
            r5.<init>(r1, r2)
            goto L_0x062a
        L_0x05be:
            r15.getClass()
            X.681 r2 = X.AnonymousClass66t.A00
            java.lang.String r1 = r14.A02
            r0 = 9
            java.lang.Object r0 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            r0 = 8
            java.lang.Object r0 = r2.A00(r0)
            r15.get(r0)
            java.lang.Object r0 = r14.A01
            X.OoT r0 = (X.C71648OoT) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A01
            X.O5X r5 = new X.O5X
            r5.<init>(r1)
            goto L_0x062a
        L_0x05e4:
            r15.getClass()
            X.681 r2 = X.AnonymousClass66t.A00
            java.lang.String r1 = r14.A02
            r0 = 11
            java.lang.Object r0 = com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            r0 = 10
            java.lang.Object r0 = r2.A00(r0)
            r15.get(r0)
            java.lang.Object r0 = r14.A01
            X.Mq8 r0 = (X.C67574Mq8) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A01
            X.Mq9 r5 = new X.Mq9
            r5.<init>(r1)
            goto L_0x062a
        L_0x060a:
            r15.getClass()
            X.681 r2 = X.AnonymousClass66t.A00
            java.lang.String r1 = r14.A02
            r0 = 17
            com.facebook.msys.mca.MailboxFeature.getNonNullNotificationValue(r2, r15, r1, r0)
            r0 = 16
            java.lang.Object r0 = r2.A00(r0)
            r15.get(r0)
            java.lang.Object r0 = r14.A01
            X.OoS r0 = (X.C71647OoS) r0
            com.facebook.msys.mca.MailboxFutureImpl r0 = r0.A01
            X.NqK r5 = new X.NqK
            r5.<init>()
        L_0x062a:
            r0.setResult(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71733Opt.DfW(java.util.Map):void");
    }
}
