package X;

import com.instagram.common.session.UserSession;

public final class OTY {
    public final OL8 A00;
    public final 2Dm A01;
    public final C70808OMd A02;
    public final UserSession A03;

    /* JADX WARNING: type inference failed for: r1v11, types: [X.57z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent.Event r24, X.AnonymousClass2Ep r25, X.OTY r26, java.lang.String r27, long r28, long r30) {
        /*
            r2 = r25
            java.lang.String r12 = r2.C6C()
            java.lang.String r8 = "Required value was null."
            if (r12 == 0) goto L_0x010f
            X.0eE r0 = X.AnonymousClass0t1.A01
            r1 = r26
            com.instagram.common.session.UserSession r5 = r1.A03
            java.lang.Long r0 = X.C66581MXm.A0r(r5, r0)
            r7 = 0
            if (r0 == 0) goto L_0x00db
            long r3 = r0.longValue()
            int r0 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x00db
            java.lang.String r13 = r5.A06
        L_0x0021:
            boolean r1 = X.C308556Us.A0O(r5, r2)
            java.lang.Long r0 = r2.C6I()
            long r17 = r0.longValue()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7 = 0
            r11 = r27
            r0 = r30
            java.lang.String r10 = X.C2611348j.A04(r11, r0)
            long r19 = X.C2611348j.A01(r10)
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            r21 = 0
            X.OIH r6 = new X.OIH
            r14 = r7
            r15 = r7
            r16 = r7
            r22 = r21
            r23 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23)
            r4 = r24
            int r0 = r4.eventCase_
            r5 = 1
            if (r0 != r5) goto L_0x006d
            X.OWL r1 = X.OWL.A00
            java.lang.Object r0 = r4.event_
            com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent$Event$DeviceChange r0 = (com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent.Event.DeviceChange) r0
            X.0qQ.A07(r0)
            X.3su r4 = r1.A01(r6, r0)
        L_0x0063:
            X.Nc9 r1 = new X.Nc9
            r1.<init>(r4, r2)
        L_0x0068:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
            return r0
        L_0x006d:
            r3 = 2
            if (r0 != r3) goto L_0x00d3
            X.OWL r1 = X.OWL.A00
            java.lang.Object r0 = r4.event_
            com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent$Event$IcdcAlert r0 = (com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent.Event.IcdcAlert) r0
            X.0qQ.A07(r0)
            X.3su r4 = new X.3su
            r4.<init>()
            r1.A02(r6, r4)
            int r0 = r0.type_
            if (r0 == 0) goto L_0x00d0
            if (r0 == r5) goto L_0x00cd
            if (r0 == r3) goto L_0x00ca
            X.Nmt r0 = X.C69511Nmt.A04
        L_0x008b:
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x00a0
            if (r0 == r5) goto L_0x00a3
            X.2FW r3 = X.2FW.A1M
            java.lang.String r0 = "need_update"
            X.57z r1 = new X.57z
            r1.<init>(r0)
        L_0x009c:
            r4.A17(r3, r1)
            goto L_0x0063
        L_0x00a0:
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            goto L_0x00a5
        L_0x00a3:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
        L_0x00a5:
            int r0 = r0.intValue()
            int r0 = 11 - r0
            if (r0 == 0) goto L_0x00c7
            java.lang.String r3 = "security_icdc_detect"
        L_0x00af:
            r1 = 21
            X.BBV r0 = new X.BBV
            r0.<init>(r3, r1)
            X.2FW r3 = X.2FW.A0G
            java.lang.String r10 = ""
            X.46n r1 = new X.46n
            r8 = r1
            r9 = r0
            r11 = r7
            r12 = r7
            r13 = r7
            r15 = r21
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x009c
        L_0x00c7:
            java.lang.String r3 = "security_icdc_clear"
            goto L_0x00af
        L_0x00ca:
            X.Nmt r0 = X.C69511Nmt.CLEARED
            goto L_0x008b
        L_0x00cd:
            X.Nmt r0 = X.C69511Nmt.DETECTED
            goto L_0x008b
        L_0x00d0:
            X.Nmt r0 = X.C69511Nmt.A04
            goto L_0x008b
        L_0x00d3:
            java.lang.String r0 = ""
            X.NcB r1 = new X.NcB
            r1.<init>(r0)
            goto L_0x0068
        L_0x00db:
            java.util.List r0 = r2.BRZ()
            java.util.Iterator r6 = r0.iterator()
        L_0x00e3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r1 = r6.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.Long r0 = r0.BST()
            if (r0 == 0) goto L_0x00e3
            long r3 = r0.longValue()
            int r0 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x00e3
        L_0x00fe:
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x010a
            java.lang.String r13 = r1.getId()
            goto L_0x0021
        L_0x0108:
            r1 = r7
            goto L_0x00fe
        L_0x010a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x010f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OTY.A00(com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent$Event, X.2Ep, X.OTY, java.lang.String, long, long):java.util.List");
    }

    public OTY(UserSession userSession, OL8 ol8, C70808OMd oMd) {
        AnonymousClass7TG.A1O(userSession, oMd);
        this.A03 = userSession;
        this.A02 = oMd;
        this.A00 = ol8;
        this.A01 = 2L2.A00(userSession);
    }
}
