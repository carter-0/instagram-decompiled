package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Oph  reason: case insensitive filesystem */
public final class C71723Oph implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71723Oph(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static NotificationScope A00(C295115nb r1, C71723Oph oph, String str, int i) {
        NotificationScope A002 = r1.A00(new C71734Opu(oph, i), str);
        ((MailboxFutureImpl) oph.A02).setNotification(str, A002);
        return A002;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: X.NiF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: X.NiG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: X.Njg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: X.ON8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: X.NiH} */
    /* JADX WARNING: type inference failed for: r0v132, types: [java.lang.Object, com.instagram.model.direct.DirectMessageSearchThread] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0346, code lost:
        if (r4.equals(com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion.NOT_SUPPORTED) == false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x062b, code lost:
        com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOO(r0, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x062e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0643, code lost:
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r7, r8, r9, 0, 0, r12, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0648, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0688, code lost:
        r11 = 1;
        r0 = X.AnonymousClass632.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x068b, code lost:
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x068e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0694, code lost:
        r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchOO(r1, r7);
        r1 = (com.facebook.msys.mca.MailboxObservableImpl) r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x069c, code lost:
        if (r2 != null) goto L_0x069f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x069e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x069f, code lost:
        r1.setResult(new com.facebook.msys.mca.MailboxNullable(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x06a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0909, code lost:
        r2.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x090c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x090d, code lost:
        r2 = (X.C71087ObS) r0.A01;
        r6 = X.C69253NiF.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0913, code lost:
        r0 = new X.N0I(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b6, code lost:
        r5.A00();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r40) {
        /*
            r39 = this;
            r0 = r39
            r7 = r40
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x08ef;
                case 1: goto L_0x08d4;
                case 2: goto L_0x08bd;
                case 3: goto L_0x0894;
                case 4: goto L_0x0861;
                case 5: goto L_0x0813;
                case 6: goto L_0x0710;
                case 7: goto L_0x06f7;
                case 8: goto L_0x06e2;
                case 9: goto L_0x06c0;
                case 10: goto L_0x06a8;
                case 11: goto L_0x0692;
                case 12: goto L_0x068f;
                case 13: goto L_0x0674;
                case 14: goto L_0x065f;
                case 15: goto L_0x0649;
                case 16: goto L_0x062f;
                case 17: goto L_0x0616;
                case 18: goto L_0x05fb;
                case 19: goto L_0x05e0;
                case 20: goto L_0x05cb;
                case 21: goto L_0x05af;
                case 22: goto L_0x0593;
                case 23: goto L_0x057b;
                case 24: goto L_0x0563;
                case 25: goto L_0x054b;
                case 26: goto L_0x052e;
                case 27: goto L_0x0516;
                case 28: goto L_0x04ff;
                case 29: goto L_0x04e7;
                case 30: goto L_0x04cd;
                case 31: goto L_0x04ac;
                case 32: goto L_0x0496;
                case 33: goto L_0x047e;
                case 34: goto L_0x045c;
                case 35: goto L_0x043d;
                case 36: goto L_0x042f;
                case 37: goto L_0x040b;
                case 38: goto L_0x03f0;
                case 39: goto L_0x03d6;
                case 40: goto L_0x03b0;
                case 41: goto L_0x0395;
                case 42: goto L_0x037b;
                case 43: goto L_0x0356;
                case 44: goto L_0x02dd;
                case 45: goto L_0x028c;
                case 46: goto L_0x0226;
                case 47: goto L_0x005b;
                case 48: goto L_0x021b;
                case 49: goto L_0x021b;
                case 50: goto L_0x0201;
                case 51: goto L_0x0919;
                case 52: goto L_0x0009;
                case 53: goto L_0x0009;
                case 54: goto L_0x002c;
                case 55: goto L_0x000f;
                case 56: goto L_0x01d9;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r0.A01
            X.C66581MXm.A1Q(r0, r7)
        L_0x000e:
            return
        L_0x000f:
            X.Mq9 r7 = (X.C67575Mq9) r7
            r4 = 0
            X.0qQ.A0B(r7, r4)
            boolean r1 = r7.A00
            if (r1 != 0) goto L_0x000e
            java.lang.Object r3 = r0.A01
            X.66t r3 = (X.AnonymousClass66t) r3
            java.lang.Object r2 = r0.A02
            r0 = 37
            X.Opf r1 = new X.Opf
            r1.<init>((java.lang.Object) r2, (int) r0)
            java.lang.String r0 = "should_present_security_alert"
            r3.A01(r1, r0, r4)
            return
        L_0x002c:
            X.Mq9 r7 = (X.C67575Mq9) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            boolean r1 = r7.A00
            if (r1 != 0) goto L_0x000e
            java.lang.Object r4 = r0.A01
            X.66t r4 = (X.AnonymousClass66t) r4
            java.lang.Object r3 = r0.A02
            X.5Gf r3 = (X.C283125Gf) r3
            com.instagram.common.session.UserSession r0 = r3.A00
            X.2HN r0 = X.2HM.A00(r0)
            X.2HR r0 = r0.A06
            java.lang.Object r0 = r0.A00()
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            r0 = 36
            X.Opf r1 = new X.Opf
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.lang.String r0 = "should_present_peer_device_change_security_alert"
            r4.A01(r1, r0, r2)
            return
        L_0x005b:
            com.facebook.msys.mca.MailboxNullable r7 = (com.facebook.msys.mca.MailboxNullable) r7
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            android.content.Context r22 = X.C51966G9m.A0P(r1)
            java.lang.Object r2 = r7.value
            X.5z0 r2 = (X.C301345z0) r2
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r0.A01
            r21 = r0
            r0 = r21
            X.1IX r0 = (X.1IX) r0
            r21 = r0
            r20 = 0
            r11 = 1
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            int r18 = X.C66580MXl.A04(r2)
            r1 = 0
        L_0x0081:
            r0 = r18
            if (r1 >= r0) goto L_0x0935
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 5
            java.lang.String r29 = r3.getString(r1, r0)
            java.lang.String r8 = ""
            if (r29 != 0) goto L_0x0092
            r29 = r8
        L_0x0092:
            com.facebook.msys.mci.CQLResultSet r0 = r2.mResultSet
            long r3 = r0.getLong(r1, r11)
            com.facebook.msys.mci.CQLResultSet r5 = r2.mResultSet
            r0 = 9
            java.lang.Long r7 = r5.getNullableLong(r1, r0)
            com.facebook.msys.mci.CQLResultSet r5 = r2.mResultSet
            r0 = 11
            java.lang.Long r6 = r5.getNullableLong(r1, r0)
            java.lang.String r0 = "e2ee"
            java.lang.String r5 = "cutover"
            if (r6 == 0) goto L_0x01d0
            r10 = r5
        L_0x00af:
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x01ca
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L_0x01ca
            r0 = r20
            java.lang.String r9 = X.C66580MXl.A0v(r2, r1, r0)
            X.0qQ.A07(r9)
        L_0x00c4:
            com.facebook.msys.mci.CQLResultSet r5 = r2.mResultSet
            r0 = 8
            java.lang.String r0 = r5.getString(r1, r0)
            r17 = 0
            if (r0 == 0) goto L_0x01c4
            java.util.List r5 = X.DbX.A0x(r0)
            if (r5 == 0) goto L_0x01c6
            r0 = r20
            java.lang.String r0 = X.C51966G9m.A1G(r5, r0)
        L_0x00dc:
            com.instagram.common.typedurl.SimpleImageUrl r16 = X.DbS.A0V(r0)
            if (r5 == 0) goto L_0x00ec
            java.lang.String r0 = X.C51966G9m.A1G(r5, r11)
            if (r0 == 0) goto L_0x00ec
            com.instagram.common.typedurl.SimpleImageUrl r17 = X.DbS.A0V(r0)
        L_0x00ec:
            r5 = 1
            r37 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0156
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 4
            java.lang.String r28 = r3.getString(r1, r0)
            X.0qQ.A07(r28)
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 7
            java.lang.String r30 = r3.getString(r1, r0)
            if (r30 != 0) goto L_0x0109
            r30 = r8
        L_0x0109:
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 2
            long r33 = r3.getLong(r1, r0)
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 10
            java.lang.Integer r0 = r3.getNullableInteger(r1, r0)
            java.lang.String r32 = X.OXJ.A02(r0)
            java.lang.String r0 = X.C66581MXm.A0v(r2, r1)
            com.google.common.collect.ImmutableList r24 = X.OXJ.A01(r0)
            com.google.common.collect.ImmutableList r25 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r25)
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 3
            long r35 = r3.getLong(r1, r0)
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 12
            java.lang.Long r0 = r3.getNullableLong(r1, r0)
            if (r0 == 0) goto L_0x0140
            long r37 = r0.longValue()
        L_0x0140:
            com.instagram.model.direct.DirectMessageSearchMessage r0 = new com.instagram.model.direct.DirectMessageSearchMessage
            r23 = r0
            r26 = r16
            r27 = r17
            r31 = r9
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37)
        L_0x014d:
            r3 = r19
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x0081
        L_0x0156:
            android.content.res.Resources r6 = r22.getResources()
            r5 = 2131820664(0x7f110078, float:1.927405E38)
            int r0 = (int) r3
            java.lang.String r15 = X.DbY.A0d(r6, r0, r5)
            X.0qQ.A07(r15)
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 7
            java.lang.String r14 = r3.getString(r1, r0)
            if (r14 != 0) goto L_0x016f
            r14 = r8
        L_0x016f:
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 10
            java.lang.Integer r0 = r3.getNullableInteger(r1, r0)
            java.lang.String r13 = X.OXJ.A02(r0)
            com.google.common.collect.ImmutableList r12 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r12)
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 2
            long r7 = r3.getLong(r1, r0)
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 3
            long r5 = r3.getLong(r1, r0)
            com.facebook.msys.mci.CQLResultSet r3 = r2.mResultSet
            r0 = 12
            java.lang.Long r0 = r3.getNullableLong(r1, r0)
            if (r0 == 0) goto L_0x01c1
            long r3 = r0.longValue()
        L_0x019e:
            X.0qQ.A0B(r9, r11)
            com.instagram.model.direct.DirectMessageSearchThread r0 = new com.instagram.model.direct.DirectMessageSearchThread
            r0.<init>()
            r0.A08 = r9
            r0.A06 = r15
            r0.A09 = r14
            r0.A0A = r13
            r0.A07 = r10
            r9 = r16
            r0.A04 = r9
            r9 = r17
            r0.A05 = r9
            r0.A03 = r12
            r0.A02 = r7
            r0.A01 = r5
            r0.A00 = r3
            goto L_0x014d
        L_0x01c1:
            r3 = -1
            goto L_0x019e
        L_0x01c4:
            r5 = r17
        L_0x01c6:
            r0 = r17
            goto L_0x00dc
        L_0x01ca:
            java.lang.String r9 = java.lang.String.valueOf(r7)
            goto L_0x00c4
        L_0x01d0:
            if (r7 == 0) goto L_0x01d5
            r10 = r0
            goto L_0x00af
        L_0x01d5:
            java.lang.String r10 = "open"
            goto L_0x00af
        L_0x01d9:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Object r3 = r0.A01
            X.1Ng r3 = (X.1Ng) r3
            java.lang.Object r2 = r0.A02
            X.3t3 r2 = (X.C254793t3) r2
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L_0x01fe
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x01eb:
            X.7Ov r0 = new X.7Ov
            r0.<init>(r2, r1)
            r3.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.7Ov r0 = new X.7Ov
            r0.<init>(r2, r1)
            r3.A00(r0)
            return
        L_0x01fe:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x01eb
        L_0x0201:
            java.lang.Object r1 = r0.A02
            X.OVM r1 = (X.OVM) r1
            X.1aS r2 = r1.A01
            X.Nix r1 = X.C69297Nix.BOOTSTRAP_END
            r2.accept(r1)
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            if (r40 == 0) goto L_0x0216
            r0.invoke(r7)
            return
        L_0x0216:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x021b:
            java.lang.Object r1 = r0.A02
            X.DbS.A1U(r1)
            java.lang.Object r5 = r0.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            goto L_0x02b6
        L_0x0226:
            java.lang.Object r5 = r0.A01
            X.67Z r5 = (X.AnonymousClass67Z) r5
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            com.facebook.msys.mca.MailboxNullable r7 = (com.facebook.msys.mca.MailboxNullable) r7
            java.lang.Object r0 = r7.value
            if (r0 != 0) goto L_0x0243
            java.lang.String r0 = "Fail to get MsysThreadId from DirectThreadId"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            X.Oxl r1 = new X.Oxl
            r1.<init>(r0)
        L_0x023f:
            r5.A02(r1)
            goto L_0x02b6
        L_0x0243:
            X.5z0 r0 = (X.C301345z0) r0
            int r0 = X.C66580MXl.A04(r0)
            if (r0 != 0) goto L_0x0253
            X.48z r0 = X.C2612848z.A00
        L_0x024d:
            X.MgO r1 = new X.MgO
            r1.<init>(r0)
            goto L_0x023f
        L_0x0253:
            java.lang.Object r0 = r7.value
            X.5z0 r0 = (X.C301345z0) r0
            r2 = 0
            com.facebook.msys.mci.CQLResultSet r1 = r0.mResultSet
            r0 = 1
            java.lang.Long r1 = r1.getNullableLong(r2, r0)
            java.lang.Object r0 = r7.value
            X.5z0 r0 = (X.C301345z0) r0
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            java.lang.Long r2 = r0.getNullableLong(r2, r2)
            if (r1 == 0) goto L_0x027b
            if (r2 == 0) goto L_0x027b
            long r0 = r1.longValue()
            com.instagram.model.direct.threadkey.impl.MsysThreadId r3 = X.C66580MXl.A0j(r2, r0)
        L_0x0275:
            X.3xQ r0 = new X.3xQ
            r0.<init>(r3)
            goto L_0x024d
        L_0x027b:
            java.util.List r2 = X.OXK.A01(r3)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Standard r1 = com.instagram.direct.msys.subtype.MsysThreadSubtype.Standard.A00
            X.3tH r0 = X.C254923tH.ACT
            X.PIO r3 = new X.PIO
            r3.<init>(r0, r1, r2)
            r3.getClass()
            goto L_0x0275
        L_0x028c:
            java.lang.Object r6 = r0.A01
            X.OMq r6 = (X.OMq) r6
            java.lang.Object r5 = r0.A02
            X.67Z r5 = (X.AnonymousClass67Z) r5
            X.Npa r7 = (X.C69652Npa) r7
            X.MYb r0 = X.MYb.A0M
            int r1 = r7.A00
            r4 = 1
            if (r1 == 0) goto L_0x02c6
            r2 = 0
            if (r1 == r4) goto L_0x02ba
            r0 = 2
            if (r1 != r0) goto L_0x02b6
            if (r6 == 0) goto L_0x02af
            java.lang.String r1 = "no_task_tracked"
            r6.A00(r1)
            java.lang.Integer r0 = r7.A01
        L_0x02ac:
            r6.A01(r1, r0)
        L_0x02af:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x02b3:
            r5.A02(r0)
        L_0x02b6:
            r5.A00()
            return
        L_0x02ba:
            if (r6 == 0) goto L_0x02af
            java.lang.String r0 = "failed"
            r6.A00(r0)
            java.lang.Integer r0 = r7.A01
            java.lang.String r1 = "fetch failed"
            goto L_0x02ac
        L_0x02c6:
            if (r6 == 0) goto L_0x02d8
            java.lang.String r0 = "succeeded"
            r6.A00(r0)
            X.02m r3 = r6.A01
            int r2 = r6.A00
            r1 = 20132336(0x13331f0, float:3.2912936E-38)
            r0 = 2
            r3.markerEnd(r1, r2, r0)
        L_0x02d8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            goto L_0x02b3
        L_0x02dd:
            X.O5b r7 = (X.C70399O5b) r7
            java.lang.String r4 = r7.A00
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0u()
            if (r4 == 0) goto L_0x0348
            int r2 = r4.hashCode()
            r1 = -1329337635(0xffffffffb0c3eadd, float:-1.425487E-9)
            r5 = 1
            if (r2 == r1) goto L_0x0322
            r1 = 854821378(0x32f38a02, float:2.8351682E-8)
            if (r2 == r1) goto L_0x033d
            r1 = 1064480392(0x3f72ae88, float:0.94797564)
            if (r2 != r1) goto L_0x0348
            r1 = 1312(0x520, float:1.839E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0348
            java.lang.Object r4 = r0.A02
            X.OyX r4 = (X.C72207OyX) r4
            java.lang.Object r0 = r0.A01
            monitor-enter(r4)
            X.Opy r3 = new X.Opy     // Catch:{ all -> 0x031f }
            r3.<init>(r5, r0, r4)     // Catch:{ all -> 0x031f }
            r4.A00 = r3     // Catch:{ all -> 0x031f }
            com.facebook.msys.mci.SessionedNotificationCenter r2 = r4.A01     // Catch:{ all -> 0x031f }
            java.lang.String r1 = "MCAMailboxMEMContextDidRegistrationNotification"
            r0 = 0
            r2.addObserver(r3, r1, r5, r0)     // Catch:{ all -> 0x031f }
            monitor-exit(r4)
            return
        L_0x031f:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x0322:
            r1 = 1332(0x534, float:1.867E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0348
            r1 = -1838507800(0xffffffff926a98e8, float:-7.402585E-28)
            X.0fh.A00(r1)
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            goto L_0x0352
        L_0x033d:
            java.lang.String r1 = "NOT_SUPPORTED"
            boolean r1 = r4.equals(r1)
            r2 = -1346831197(0xffffffffafb8fca3, float:-3.3648914E-10)
            if (r1 != 0) goto L_0x034b
        L_0x0348:
            r2 = -645791511(0xffffffffd98200e9, float:-4.5740935E15)
        L_0x034b:
            X.0fh.A00(r2)
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
        L_0x0352:
            r0.invoke(r3)
            return
        L_0x0356:
            com.facebook.msys.mca.MailboxNullable r7 = (com.facebook.msys.mca.MailboxNullable) r7
            java.lang.Object r3 = r0.A02
            X.65B r3 = (X.AnonymousClass65B) r3
            java.lang.Object r2 = r0.A01
            X.0sa r2 = (X.C62320sa) r2
            monitor-enter(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.msys.mca.MailboxNullable<com.facebook.messengerencryptedbackupscqljava.MEBReadClientState>"
            X.0qQ.A0C(r7, r0)     // Catch:{ all -> 0x0378 }
            java.lang.Object r1 = r7.value     // Catch:{ all -> 0x0378 }
            X.NB0 r1 = (X.NB0) r1     // Catch:{ all -> 0x0378 }
            X.65C r0 = X.AnonymousClass65B.A03     // Catch:{ all -> 0x0378 }
            r3.A00 = r1     // Catch:{ all -> 0x0378 }
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x0378 }
            if (r2 == 0) goto L_0x0376
            r2.invoke()     // Catch:{ all -> 0x0378 }
        L_0x0376:
            monitor-exit(r3)
            return
        L_0x0378:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x037b:
            com.facebook.msys.mca.StandaloneDatabaseHandle r7 = (com.facebook.msys.mca.StandaloneDatabaseHandle) r7
            X.681 r2 = X.NAV.A00
            r1 = 5
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nc r2 = r7.getNotificationCenterCallbackManager()
            X.5nb r2 = (X.C295115nb) r2
            r1 = 43
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 0
            com.facebook.urlblackholestandalone.mca.MailboxUrlBlackholeStandaloneJNI.dispatchVOO(r0, r7, r1)
            return
        L_0x0395:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r8 = r0.A02
            com.facebook.msys.mca.MailboxFutureImpl r8 = (com.facebook.msys.mca.MailboxFutureImpl) r8
            com.facebook.msys.mca.MailboxNullable r9 = X.C66581MXm.A0K()
            r1 = 20
            X.Opj r14 = new X.Opj
            r14.<init>(r0, r1)
            java.lang.String r12 = "MCAMailboxUrlBlackhole"
            java.lang.String r13 = "BlackholeUrlsSet"
            r10 = 0
            r11 = 1
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x03b0:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            X.681 r1 = X.NAU.A00
            r5 = 1
            java.lang.String r4 = X.C66580MXl.A0u(r1, r5)
            com.facebook.msys.mca.SlimMailbox r1 = r7.getSlimMailbox()
            X.5nc r3 = r1.getNotificationCenterCallbackManager()
            r2 = 42
            X.Opu r1 = new X.Opu
            r1.<init>(r0, r2)
            com.facebook.msys.util.NotificationScope r1 = r3.EBU(r1, r4, r5)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r4)
            r0 = 2
            com.facebook.threadtheme.mca.MailboxThreadThemeJNI.dispatchVOO(r0, r7, r1)
            return
        L_0x03d6:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r8 = r0.A02
            com.facebook.msys.mca.MailboxFutureImpl r8 = (com.facebook.msys.mca.MailboxFutureImpl) r8
            r10 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)
            r1 = 58
            X.Opk r14 = X.C71726Opk.A00(r0, r1)
            java.lang.String r12 = "MCAMailboxShim"
            java.lang.String r13 = "SHIMManualForceResnapshotDoNotUse"
            r11 = 1
            X.681 r0 = X.C68313NAa.A00
            goto L_0x068b
        L_0x03f0:
            com.facebook.msys.mca.StandaloneDatabaseHandle r7 = (com.facebook.msys.mca.StandaloneDatabaseHandle) r7
            X.681 r2 = X.NAT.A00
            r1 = 0
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nc r2 = r7.getNotificationCenterCallbackManager()
            X.5nb r2 = (X.C295115nb) r2
            r1 = 39
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 9
            com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI.dispatchVOO(r0, r7, r1)
            return
        L_0x040b:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAS.A00
            r1 = 9
            java.lang.String r4 = X.C66580MXl.A0u(r2, r1)
            X.5nb r3 = X.C66580MXl.A0H(r7)
            r2 = 37
            X.Opu r1 = new X.Opu
            r1.<init>(r0, r2)
            r2 = 1
            com.facebook.msys.util.NotificationScope r1 = r3.EBU(r1, r4, r2)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r4)
            r0 = 0
            com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI.dispatchVIOO(r2, r0, r7, r1)
            return
        L_0x042f:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r1 = r0.A02
            com.facebook.msys.mca.MailboxCallback r1 = (com.facebook.msys.mca.MailboxCallback) r1
            com.facebook.msys.mca.SlimMailbox r0 = r7.getSlimMailbox()
            r1.onCompletion(r0)
            return
        L_0x043d:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAP.A00
            r1 = 11
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 45
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r2, r0, r3, r1)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r3)
            r0 = 10
            com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI.dispatchVOO(r0, r7, r1)
            return
        L_0x045c:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAO.A00
            r1 = 4
            java.lang.String r4 = X.C66580MXl.A0u(r2, r1)
            X.5nb r3 = X.C66580MXl.A0H(r7)
            r2 = 27
            X.Opu r1 = new X.Opu
            r1.<init>(r0, r2)
            r2 = 1
            com.facebook.msys.util.NotificationScope r1 = r3.EBU(r1, r4, r2)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r4)
            com.facebook.memcontext.mca.MailboxMEMContextJNI.dispatchVOO(r2, r7, r1)
            return
        L_0x047e:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAO.A00
            r1 = 2
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 26
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 0
            com.facebook.memcontext.mca.MailboxMEMContextJNI.dispatchVOO(r0, r7, r1)
            return
        L_0x0496:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r8 = r0.A02
            com.facebook.msys.mca.MailboxFutureImpl r8 = (com.facebook.msys.mca.MailboxFutureImpl) r8
            com.facebook.msys.mca.MailboxNullable r9 = X.C66581MXm.A0K()
            r1 = 16
            X.Opk r14 = X.C71726Opk.A00(r0, r1)
            java.lang.String r12 = "MCAMailboxInstagramPresence"
            java.lang.String r13 = "PresenceStateForAllUsers"
            goto L_0x0643
        L_0x04ac:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r1 = X.NAN.A00
            r5 = 1
            java.lang.String r4 = X.C66580MXl.A0u(r1, r5)
            X.5nb r3 = X.C66580MXl.A0H(r7)
            r2 = 30
            X.Opt r1 = new X.Opt
            r1.<init>(r4, r0, r2)
            com.facebook.msys.util.NotificationScope r1 = r3.EBU(r1, r4, r5)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r4)
            com.facebook.instagramportabledb.mca.MailboxInstagramPortableDBJNI.dispatchVOO(r5, r7, r1)
            return
        L_0x04cd:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAY.A00
            r1 = 35
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 17
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 12
            com.facebook.instagrammem.mca.MailboxInstagramMemJNI.dispatchVOO(r0, r7, r1)
            return
        L_0x04e7:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r8 = r0.A02
            com.facebook.msys.mca.MailboxFutureImpl r8 = (com.facebook.msys.mca.MailboxFutureImpl) r8
            r10 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)
            r1 = 13
            X.Opk r14 = X.C71726Opk.A00(r0, r1)
            java.lang.String r12 = "MCAMailboxGlobalDeleteSettings"
            java.lang.String r13 = "DisableGlobalDeleteReceiverMitigationNux"
            r11 = 1
            goto L_0x068b
        L_0x04ff:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 79
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 15
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 6
            goto L_0x062b
        L_0x0516:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 361(0x169, float:5.06E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 14
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 48
            goto L_0x062b
        L_0x052e:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 323(0x143, float:4.53E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 16
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r2, r0, r3, r1)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r3)
            r0 = 47
            goto L_0x062b
        L_0x054b:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 332(0x14c, float:4.65E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 12
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 40
            goto L_0x062b
        L_0x0563:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 337(0x151, float:4.72E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 11
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 38
            goto L_0x062b
        L_0x057b:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 333(0x14d, float:4.67E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 9
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 31
            goto L_0x062b
        L_0x0593:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 350(0x15e, float:4.9E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 9
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r2, r0, r3, r1)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r3)
            r0 = 30
            goto L_0x062b
        L_0x05af:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 340(0x154, float:4.76E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 8
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r2, r0, r3, r1)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r3)
            r0 = 29
            goto L_0x062b
        L_0x05cb:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 97
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 6
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 0
            goto L_0x062b
        L_0x05e0:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 327(0x147, float:4.58E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 7
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r2, r0, r3, r1)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r3)
            r0 = 24
            goto L_0x062b
        L_0x05fb:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 117(0x75, float:1.64E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 5
            com.facebook.msys.util.NotificationScope r2 = A00(r2, r0, r3, r1)
            java.lang.String r1 = "ENCRYPTED_BACKUP_ONBOARDED_KEY"
            r0 = 15
            com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOOO(r0, r7, r1, r2)
            return
        L_0x0616:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.NAX.A00
            r1 = 111(0x6f, float:1.56E-43)
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 4
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 14
        L_0x062b:
            com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOO(r0, r7, r1)
            return
        L_0x062f:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r8 = r0.A02
            com.facebook.msys.mca.MailboxFutureImpl r8 = (com.facebook.msys.mca.MailboxFutureImpl) r8
            com.facebook.msys.mca.MailboxNullable r9 = X.C66581MXm.A0K()
            r1 = 9
            X.Opk r14 = X.C71726Opk.A00(r0, r1)
            java.lang.String r12 = "MCAMailboxBusinessInbox"
            java.lang.String r13 = "PreviousReplyList"
        L_0x0643:
            r10 = 0
            r11 = r10
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0649:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r8 = r0.A02
            com.facebook.msys.mca.MailboxFutureImpl r8 = (com.facebook.msys.mca.MailboxFutureImpl) r8
            r10 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)
            r1 = 8
            X.Opk r14 = X.C71726Opk.A00(r0, r1)
            java.lang.String r12 = "MCAMailboxAdvancedCryptoTransport"
            java.lang.String r13 = "ActEchoSerialize"
            goto L_0x0688
        L_0x065f:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r8 = r0.A02
            com.facebook.msys.mca.MailboxFutureImpl r8 = (com.facebook.msys.mca.MailboxFutureImpl) r8
            r10 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)
            r1 = 7
            X.Opk r14 = X.C71726Opk.A00(r0, r1)
            java.lang.String r12 = "MCAMailboxAdvancedCryptoTransport"
            java.lang.String r13 = "ActEchoDelete"
            goto L_0x0688
        L_0x0674:
            com.facebook.msys.mca.Mailbox r7 = (com.facebook.msys.mca.Mailbox) r7
            java.lang.Object r8 = r0.A02
            com.facebook.msys.mca.MailboxFutureImpl r8 = (com.facebook.msys.mca.MailboxFutureImpl) r8
            r10 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)
            r1 = 6
            X.Opk r14 = X.C71726Opk.A00(r0, r1)
            java.lang.String r12 = "MCAMailboxAdvancedCryptoTransport"
            java.lang.String r13 = "ActEchoManualDeserialize"
        L_0x0688:
            r11 = 1
            X.681 r0 = X.AnonymousClass632.A00
        L_0x068b:
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x068f:
            r1 = 17
            goto L_0x0694
        L_0x0692:
            r1 = 16
        L_0x0694:
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchOO(r1, r7)
            java.lang.Object r1 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r1 = (com.facebook.msys.mca.MailboxObservableImpl) r1
            if (r2 != 0) goto L_0x069f
            r2 = 0
        L_0x069f:
            com.facebook.msys.mca.MailboxNullable r0 = new com.facebook.msys.mca.MailboxNullable
            r0.<init>(r2)
            r1.setResult(r0)
            return
        L_0x06a8:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.AnonymousClass632.A00
            r1 = 3
            java.lang.String r3 = X.C66580MXl.A0u(r2, r1)
            X.5nb r2 = X.C66580MXl.A0H(r7)
            r1 = 2
            com.facebook.msys.util.NotificationScope r1 = A00(r2, r0, r3, r1)
            r0 = 8
            com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchVOO(r0, r7, r1)
            return
        L_0x06c0:
            com.facebook.msys.mci.AccountSession r7 = (com.facebook.msys.mci.AccountSession) r7
            X.681 r2 = X.AnonymousClass632.A00
            r1 = 12
            java.lang.String r4 = X.C66580MXl.A0u(r2, r1)
            X.5nb r3 = X.C66580MXl.A0H(r7)
            r2 = 0
            X.Opu r1 = new X.Opu
            r1.<init>(r0, r2)
            r2 = 1
            com.facebook.msys.util.NotificationScope r1 = r3.EBU(r1, r4, r2)
            java.lang.Object r0 = r0.A02
            X.C66580MXl.A1N(r1, r0, r4)
            com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchVOO(r2, r7, r1)
            return
        L_0x06e2:
            java.lang.Object r2 = r0.A02
            X.1K2 r2 = (X.1K2) r2
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.set(r1)
            java.lang.Object r2 = r0.A01
            X.638 r2 = (X.AnonymousClass638) r2
            r1 = 0
            X.638 r0 = X.AnonymousClass638.$redex_init_class
            r2.A0E = r1
            r2.A0F = r1
            return
        L_0x06f7:
            boolean r1 = X.AnonymousClass7TE.A1a(r7)
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            if (r1 == 0) goto L_0x0705
            X.NiH r6 = X.C69255NiH.A02
            goto L_0x0913
        L_0x0705:
            com.encryptedbackups.statemanager.model.RemoveAllDevicesFromBackupException r0 = new com.encryptedbackups.statemanager.model.RemoveAllDevicesFromBackupException
            r0.<init>()
            X.N0J r0 = X.N0J.A00(r0)
            goto L_0x0909
        L_0x0710:
            com.facebook.msys.mca.MailboxNullable r7 = (com.facebook.msys.mca.MailboxNullable) r7
            if (r7 == 0) goto L_0x07c3
            java.lang.Object r1 = r7.value
        L_0x0716:
            java.lang.String r3 = "EncryptedBackupsManagerApi"
            if (r1 == 0) goto L_0x0801
            java.lang.Object r1 = r7.value
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x07ef
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r1.iterator()
        L_0x0728:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x07dd
            java.lang.Object r10 = r13.next()
            boolean r1 = r10 instanceof java.util.HashMap
            r7 = 0
            if (r1 == 0) goto L_0x07cb
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r8 = "MCAMailboxEncryptedBackupsManagerVirtualDeviceIDDictKey"
            java.lang.Object r1 = r10.get(r8)
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L_0x07cb
            java.lang.String r12 = "MCAMailboxEncryptedBackupsManagerVirtualDeviceTypeDictKey"
            java.lang.Object r1 = r10.get(r12)
            boolean r1 = r1 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x07cb
            java.lang.Object r11 = r10.get(r12)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r11, r9)
            X.Njv[] r6 = X.C69356Njv.values()
            int r4 = r6.length
            r2 = 0
        L_0x075c:
            if (r2 >= r4) goto L_0x07cb
            r1 = r6[r2]
            java.lang.Number r1 = r1.A00
            boolean r1 = X.0qQ.A0K(r1, r11)
            if (r1 == 0) goto L_0x07c0
            java.lang.Object r11 = r10.get(r12)
            X.0qQ.A0C(r11, r9)
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            java.lang.String r1 = "MCAMailboxEncryptedBackupsManagerVirtualDeviceCreationTimeDictKey"
            java.lang.Object r6 = r10.get(r1)
            boolean r1 = r6 instanceof java.lang.Long
            if (r1 == 0) goto L_0x07be
            java.lang.Long r6 = (java.lang.Long) r6
        L_0x077d:
            java.lang.Object r4 = r10.get(r8)
            X.DbS.A1Y(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "MCAMailboxEncryptedBackupsManagerVirtualDeviceCreatedOnDictKey"
            java.lang.String r19 = X.C66584MXp.A0Z(r1, r10)
            X.Njv[] r9 = X.C69356Njv.values()
            int r8 = r9.length
            r2 = 0
        L_0x0792:
            if (r2 >= r8) goto L_0x07c6
            r15 = r9[r2]
            java.lang.Number r1 = r15.A00
            boolean r1 = X.0qQ.A0K(r1, r11)
            if (r1 == 0) goto L_0x07bb
            java.lang.String r1 = "MCAMailboxEncryptedBackupsManagerVirtualDeviceCloudServiceAccountKey"
            java.lang.Object r2 = r10.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x07ab
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x07ab:
            X.ONe r14 = new X.ONe
            r18 = r4
            r20 = r7
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r5.add(r14)
            goto L_0x0728
        L_0x07bb:
            int r2 = r2 + 1
            goto L_0x0792
        L_0x07be:
            r6 = r7
            goto L_0x077d
        L_0x07c0:
            int r2 = r2 + 1
            goto L_0x075c
        L_0x07c3:
            r1 = 0
            goto L_0x0716
        L_0x07c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x07cb:
            java.lang.String r1 = "EncryptedBackups fetchVirtualDevicesMetadata response typecast fails."
            X.0KC.A0C(r3, r1)
            java.lang.Object r1 = r0.A01
            X.ObS r1 = (X.C71087ObS) r1
            com.encryptedbackups.statemanager.model.FetchVirtualDevicesMetadataException r0 = new com.encryptedbackups.statemanager.model.FetchVirtualDevicesMetadataException
            r0.<init>()
            X.N0J.A01(r1, r0)
            return
        L_0x07dd:
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.O5Q r1 = new X.O5Q
            r1.<init>(r5)
            X.N0I r0 = new X.N0I
            r0.<init>(r1)
            r2.A05(r0)
            return
        L_0x07ef:
            java.lang.String r1 = "EncryptedBackups fetchVirtualDevicesMetadata fails list cast."
            X.0KC.A0C(r3, r1)
            java.lang.Object r1 = r0.A01
            X.ObS r1 = (X.C71087ObS) r1
            com.encryptedbackups.statemanager.model.FetchVirtualDevicesMetadataException r0 = new com.encryptedbackups.statemanager.model.FetchVirtualDevicesMetadataException
            r0.<init>()
            X.N0J.A01(r1, r0)
            return
        L_0x0801:
            java.lang.String r1 = "EncryptedBackups fetchVirtualDevicesMetadata fails."
            X.0KC.A0C(r3, r1)
            java.lang.Object r1 = r0.A01
            X.ObS r1 = (X.C71087ObS) r1
            com.encryptedbackups.statemanager.model.FetchVirtualDevicesMetadataException r0 = new com.encryptedbackups.statemanager.model.FetchVirtualDevicesMetadataException
            r0.<init>()
            X.N0J.A01(r1, r0)
            return
        L_0x0813:
            java.lang.Object r2 = X.C66583MXo.A0g(r7)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0852
            java.lang.String r1 = "MCAMailboxEncryptedBackupsManagerFetchEncryptedBackupsUserPreferencesOnboardingDecisionKey"
            java.lang.Object r2 = r2.get(r1)
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L_0x0852
            int r6 = X.AnonymousClass7TE.A0M(r2)
            r1 = 4
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r1)
            int r4 = r5.length
            r3 = 0
        L_0x0830:
            if (r3 >= r4) goto L_0x0852
            r2 = r5[r3]
            int r1 = r2.intValue()
            switch(r1) {
                case 1: goto L_0x084c;
                case 2: goto L_0x084e;
                case 3: goto L_0x0850;
                default: goto L_0x083b;
            }
        L_0x083b:
            r1 = -1
        L_0x083c:
            if (r1 != r6) goto L_0x0849
            X.ON8 r6 = new X.ON8
            r6.<init>(r2)
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            goto L_0x0913
        L_0x0849:
            int r3 = r3 + 1
            goto L_0x0830
        L_0x084c:
            r1 = 0
            goto L_0x083c
        L_0x084e:
            r1 = 1
            goto L_0x083c
        L_0x0850:
            r1 = 2
            goto L_0x083c
        L_0x0852:
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            com.encryptedbackups.statemanager.model.FetchUserPreferencesException r0 = new com.encryptedbackups.statemanager.model.FetchUserPreferencesException
            r0.<init>()
            X.N0J r0 = X.N0J.A00(r0)
            goto L_0x0909
        L_0x0861:
            X.OAh r7 = (X.C70533OAh) r7
            r1 = 0
            X.0qQ.A0B(r7, r1)
            java.lang.Object r4 = r0.A01
            X.ObS r4 = (X.C71087ObS) r4
            java.lang.Number r0 = r7.A00
            r3 = 0
            if (r0 == 0) goto L_0x0892
            long r0 = r0.longValue()
            java.lang.Long r2 = X.C66582MXn.A0l(r0)
        L_0x0878:
            java.lang.Number r0 = r7.A01
            if (r0 == 0) goto L_0x0884
            long r0 = r0.longValue()
            java.lang.Long r3 = X.C66582MXn.A0l(r0)
        L_0x0884:
            X.ONH r1 = new X.ONH
            r1.<init>(r2, r3)
            X.N0I r0 = new X.N0I
            r0.<init>(r1)
            r4.A05(r0)
            return
        L_0x0892:
            r2 = r3
            goto L_0x0878
        L_0x0894:
            int r5 = X.AnonymousClass7TE.A0M(r7)
            X.Njg[] r4 = X.C69341Njg.A01
            int r3 = r4.length
            r2 = 0
        L_0x089c:
            if (r2 >= r3) goto L_0x08a7
            r6 = r4[r2]
            int r1 = r6.A00
            if (r1 == r5) goto L_0x08a9
            int r2 = r2 + 1
            goto L_0x089c
        L_0x08a7:
            X.Njg r6 = X.C69341Njg.FETCH_BACKUP_STATUS_ERROR
        L_0x08a9:
            X.Njg r1 = X.C69341Njg.FETCH_BACKUP_STATUS_ERROR
            int r1 = r1.A00
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            if (r5 != r1) goto L_0x0913
            X.NnJ r0 = new X.NnJ
            r0.<init>()
            X.N0J r0 = X.N0J.A00(r0)
            goto L_0x0909
        L_0x08bd:
            boolean r1 = X.AnonymousClass7TE.A1a(r7)
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            if (r1 == 0) goto L_0x08ca
            X.NiG r6 = X.C69254NiG.A02
            goto L_0x0913
        L_0x08ca:
            com.encryptedbackups.statemanager.model.DeleteBackupException r0 = new com.encryptedbackups.statemanager.model.DeleteBackupException
            r0.<init>()
            X.N0J r0 = X.N0J.A00(r0)
            goto L_0x0909
        L_0x08d4:
            boolean r1 = X.AnonymousClass7TE.A1a(r7)
            java.lang.String r2 = "EncryptedBackupsManagerApi"
            if (r1 != 0) goto L_0x090d
            java.lang.String r1 = "EncryptedBackups createVirtualDevice fails."
            X.0KC.A0C(r2, r1)
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            com.encryptedbackups.statemanager.model.CreateVirtualDeviceException r0 = new com.encryptedbackups.statemanager.model.CreateVirtualDeviceException
            r0.<init>()
            X.N0J r0 = X.N0J.A00(r0)
            goto L_0x0909
        L_0x08ef:
            boolean r1 = X.AnonymousClass7TE.A1a(r7)
            java.lang.String r2 = "EncryptedBackupsManagerApi"
            if (r1 != 0) goto L_0x090d
            java.lang.String r1 = "EncryptedBackups createUniqueVirtualDevice fails."
            X.0KC.A0C(r2, r1)
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            com.encryptedbackups.statemanager.model.CreateVirtualDeviceException r0 = new com.encryptedbackups.statemanager.model.CreateVirtualDeviceException
            r0.<init>()
            X.N0J r0 = X.N0J.A00(r0)
        L_0x0909:
            r2.A05(r0)
            return
        L_0x090d:
            java.lang.Object r2 = r0.A01
            X.ObS r2 = (X.C71087ObS) r2
            X.NiF r6 = X.C69253NiF.A02
        L_0x0913:
            X.N0I r0 = new X.N0I
            r0.<init>(r6)
            goto L_0x0909
        L_0x0919:
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x092c }
            X.OVM r1 = (X.OVM) r1     // Catch:{ all -> 0x092c }
            X.1aS r2 = r1.A01     // Catch:{ all -> 0x092c }
            X.Nix r1 = X.C69297Nix.TEAR_DOWN_END     // Catch:{ all -> 0x092c }
            r2.accept(r1)     // Catch:{ all -> 0x092c }
            java.lang.Object r0 = r0.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x092c:
            r1 = move-exception
            java.lang.Object r0 = r0.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            throw r1
        L_0x0935:
            r2 = 0
            r1 = r21
            r0 = r19
            r1.EJ1(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71723Oph.onCompletion(java.lang.Object):void");
    }

    public C71723Oph(NAX nax, MailboxFutureImpl mailboxFutureImpl, int i) {
        this.A00 = i;
        this.A01 = nax;
        this.A02 = mailboxFutureImpl;
    }

    public C71723Oph(OZI ozi, C71087ObS obS, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                this.A02 = ozi;
                this.A01 = obS;
                break;
            default:
                this.A01 = obS;
                this.A02 = ozi;
                break;
        }
    }
}
