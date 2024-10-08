package X;

/* renamed from: X.Oxd  reason: case insensitive filesystem */
public final class C72168Oxd implements AnonymousClass67Q {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C72168Oxd(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public static 1aU A00(Object obj, Object obj2, Object obj3, int i) {
        return 1aU.A06(new C72168Oxd(i, obj, obj2, obj3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x012b, code lost:
        r3.addResultCallback(new X.C71723Oph(r1, (java.lang.Object) r15, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0133, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01a9, code lost:
        X.PU9.A00(r3, r0, r15, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01d1, code lost:
        r9.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01d4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eyr(X.AnonymousClass67Z r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            r10 = r15
            switch(r0) {
                case 0: goto L_0x01ad;
                case 1: goto L_0x019e;
                case 2: goto L_0x0183;
                case 3: goto L_0x0177;
                case 4: goto L_0x0134;
                case 5: goto L_0x001d;
                case 6: goto L_0x00f0;
                case 7: goto L_0x00b5;
                case 8: goto L_0x008e;
                case 9: goto L_0x007e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r14.A02
            X.T7R r0 = (X.T7R) r0
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r3 = r0.A00
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r14.A03
            X.Jvk r1 = (X.C61046Jvk) r1
            X.Oq4 r0 = new X.Oq4
            r0.<init>(r15)
            r3.A0G(r2, r1, r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r0 = r14.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.lang.Object r8 = r14.A02
            X.NAV r8 = (X.NAV) r8
            java.lang.Object r2 = r14.A03
            java.util.Iterator r5 = r0.iterator()
        L_0x002b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x001c
            X.3lr r4 = X.C41845B3m.A0V(r5)
            X.NkM r3 = X.C69382NkM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            java.lang.String r0 = "operation"
            java.lang.Enum r0 = r4.getOptionalEnumField(r1, r0, r3)
            X.NkM r0 = (X.C69382NkM) r0
            if (r0 == 0) goto L_0x007c
            java.lang.String r9 = r0.name()
        L_0x0046:
            java.lang.String r0 = "url_chunk"
            java.lang.String r10 = r4.A09(r0)
            java.lang.String r0 = "url_chunk_hash"
            java.lang.String r11 = r4.A0A(r0)
            java.lang.String r0 = "url_chunk_id"
            java.lang.String r12 = r4.A08(r0)
            java.lang.String r0 = "violation_type"
            java.lang.String r13 = r4.A0B(r0)
            X.68J r1 = r8.mMailboxApiHandleMetaProvider
            r0 = 3
            X.68L r0 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r7 = X.C66580MXl.A0G(r0)
            X.Op9 r6 = new X.Op9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.C66582MXn.A1E(r0, r6, r7)
            r1 = 25
            X.Opf r0 = new X.Opf
            r0.<init>((java.lang.Object) r2, (int) r1)
            r7.addResultCallback(r0)
            goto L_0x002b
        L_0x007c:
            r9 = 0
            goto L_0x0046
        L_0x007e:
            java.lang.Object r0 = r14.A03
            X.OCM r0 = (X.OCM) r0
            X.1a8 r0 = r0.A00
            java.lang.Object r3 = r14.A01
            X.1aU r3 = (X.1aU) r3
            java.lang.Object r2 = r14.A02
            r1 = 20
            goto L_0x01a9
        L_0x008e:
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r2 = r14.A01     // Catch:{ IOException -> 0x00a8 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ IOException -> 0x00a8 }
            java.lang.Object r1 = r14.A02     // Catch:{ IOException -> 0x00a8 }
            android.net.Uri r1 = (android.net.Uri) r1     // Catch:{ IOException -> 0x00a8 }
            java.lang.Object r0 = r14.A03     // Catch:{ IOException -> 0x00a8 }
            X.OTD r0 = (X.OTD) r0     // Catch:{ IOException -> 0x00a8 }
            com.instagram.common.session.UserSession r0 = r0.A00     // Catch:{ IOException -> 0x00a8 }
            X.8Cl r0 = X.C63256Ku1.A00(r2, r1, r0)     // Catch:{ IOException -> 0x00a8 }
            X.C66990MgO.A00(r15, r0)     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00b1
        L_0x00a8:
            r1 = move-exception
            X.Oxl r0 = new X.Oxl
            r0.<init>(r1)
            r15.A02(r0)
        L_0x00b1:
            r15.A00()
            return
        L_0x00b5:
            r9 = 0
            X.0qQ.A0B(r15, r9)
            java.lang.Object r4 = r14.A01
            X.NAT r4 = (X.NAT) r4
            java.lang.Object r2 = r14.A02
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r0 = "hidden_words_control_custom_list_enabled"
            java.lang.Boolean r5 = X.C41846B3n.A0d(r2, r0, r9)
            java.lang.String r0 = "hidden_words_control_custom_list_strings"
            java.lang.String r8 = r2.A08(r0)
            r1 = 2
            java.lang.String r0 = "hidden_words_control_predefined_enabled"
            java.lang.Boolean r6 = X.C41846B3n.A0d(r2, r0, r1)
            r1 = 3
            java.lang.String r0 = "on_device_nudity_control_image_scan_enabled"
            java.lang.Boolean r7 = X.C41846B3n.A0d(r2, r0, r1)
            X.68L r0 = X.C66580MXl.A0F(r4, r1)
            com.facebook.msys.mca.MailboxFutureImpl r3 = X.C66580MXl.A0G(r0)
            X.Op7 r2 = new X.Op7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.C66582MXn.A1E(r0, r2, r3)
            java.lang.Object r2 = r14.A03
            r1 = 53
            goto L_0x012b
        L_0x00f0:
            r1 = 0
            X.0qQ.A0B(r15, r1)
            java.lang.Object r4 = r14.A01
            X.NAT r4 = (X.NAT) r4
            java.lang.Object r2 = r14.A02
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r0 = "hidden_words_control_custom_list_enabled"
            java.lang.Boolean r5 = X.C41846B3n.A0d(r2, r0, r1)
            java.lang.String r0 = "hidden_words_control_custom_list_strings"
            java.lang.String r8 = r2.A08(r0)
            r1 = 2
            java.lang.String r0 = "hidden_words_control_predefined_enabled"
            java.lang.Boolean r6 = X.C41846B3n.A0d(r2, r0, r1)
            r1 = 3
            java.lang.String r0 = "on_device_nudity_control_image_scan_enabled"
            java.lang.Boolean r7 = X.C41846B3n.A0d(r2, r0, r1)
            X.68L r0 = X.C66580MXl.A0F(r4, r1)
            com.facebook.msys.mca.MailboxFutureImpl r3 = X.C66580MXl.A0G(r0)
            r9 = 1
            X.Op7 r2 = new X.Op7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.C66582MXn.A1E(r0, r2, r3)
            java.lang.Object r2 = r14.A03
            r1 = 52
        L_0x012b:
            X.Oph r0 = new X.Oph
            r0.<init>((int) r1, (java.lang.Object) r15, (java.lang.Object) r2)
            r3.addResultCallback(r0)
            return
        L_0x0134:
            java.lang.Object r5 = r14.A01
            com.facebook.msys.mca.MailboxFeature r5 = (com.facebook.msys.mca.MailboxFeature) r5
            java.lang.Object r0 = r14.A02
            X.3t0 r0 = (X.C254763t0) r0
            java.lang.Object r2 = r14.A03
            java.lang.String r7 = r0.A00
            r0 = 46
            X.Oph r1 = new X.Oph
            r1.<init>((int) r0, (java.lang.Object) r15, (java.lang.Object) r2)
            X.68J r0 = r5.mMailboxApiHandleMetaProvider
            r9 = 0
            X.68L r0 = r0.ASa(r9)
            com.facebook.msys.mca.MailboxFutureImpl r6 = X.C66580MXl.A0G(r0)
            java.lang.String r3 = "MailboxInstagramSecureMessage"
            java.lang.String r2 = "loadInstagramSecureThreadKeyFromIgThreadId"
            int r8 = X.C3030067a.A00(r6)
            com.facebook.msys.mci.TraceInfo r1 = X.C66580MXl.A0I(r1, r6, r3, r2)
            X.Ook r4 = new X.Ook
            r4.<init>(r5, r6, r7, r8, r9)
            boolean r0 = r0.EJd(r4)
            if (r0 != 0) goto L_0x0172
            r6.cancel(r9)
            X.C3030067a.A02(r8)
            X.C3030067a.A03(r1, r3, r2)
        L_0x0172:
            r0 = 5
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r0)
            return
        L_0x0177:
            java.lang.Object r0 = r14.A02
            X.1a8 r0 = (X.1a8) r0
            java.lang.Object r3 = r14.A01
            X.1aU r3 = (X.1aU) r3
            java.lang.Object r2 = r14.A03
            r1 = 5
            goto L_0x01a9
        L_0x0183:
            java.lang.Object r11 = r14.A03
            X.OO6 r11 = (X.OO6) r11
            java.lang.Object r9 = r14.A01
            X.1a8 r9 = (X.1a8) r9
            X.1aU r0 = r11.A02(r9)
            java.lang.Object r12 = r14.A02
            r8 = 1
            X.OvC r7 = new X.OvC
            r7.<init>(r8, r9, r10, r11, r12)
            X.1aU r1 = r0.A0L(r7)
            X.PSl r0 = X.C73002PSl.A00
            goto L_0x01d1
        L_0x019e:
            java.lang.Object r0 = r14.A02
            X.1a8 r0 = (X.1a8) r0
            java.lang.Object r3 = r14.A01
            X.1aU r3 = (X.1aU) r3
            java.lang.Object r2 = r14.A03
            r1 = 3
        L_0x01a9:
            X.PU9.A00(r3, r0, r15, r2, r1)
            return
        L_0x01ad:
            java.lang.Object r11 = r14.A03
            X.OHi r11 = (X.C70713OHi) r11
            java.lang.Object r9 = r14.A01
            X.1a8 r9 = (X.1a8) r9
            X.1aU r2 = r11.A02
            r0 = 28
            X.PqZ r1 = new X.PqZ
            r1.<init>(r11, r0)
            r0 = 1
            X.1aU r0 = A00(r2, r9, r1, r0)
            java.lang.Object r12 = r14.A02
            r8 = 0
            X.OvC r7 = new X.OvC
            r7.<init>(r8, r9, r10, r11, r12)
            X.1aU r1 = r0.A0L(r7)
            X.PSk r0 = X.C73001PSk.A00
        L_0x01d1:
            r9.A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72168Oxd.Eyr(X.67Z):void");
    }
}
