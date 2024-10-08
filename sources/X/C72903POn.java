package X;

import android.content.Context;

/* renamed from: X.POn  reason: case insensitive filesystem */
public final class C72903POn implements C74364Pte {
    public final Context A00;
    public final OWY A01;

    public /* synthetic */ C72903POn(Context context) {
        OWY owy = new OWY(context);
        0qQ.A0B(context, 1);
        this.A00 = context;
        this.A01 = owy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f2, code lost:
        if (r0.length() == 0) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.instagram.rtc.signaling.models.RtcConnectionEntity E1i(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r25
            X.5HJ r0 = (X.AnonymousClass5HJ) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.String r3 = r0.A18
            r5 = r24
            if (r3 == 0) goto L_0x006b
            X.OWY r1 = r5.A01
            X.JwL r4 = r1.A02(r3)
        L_0x0014:
            android.content.Context r3 = r5.A00
            r12 = 0
            X.OcE r1 = new X.OcE
            r1.<init>(r4, r12)
            java.lang.Integer r4 = r1.A03()
            if (r4 == 0) goto L_0x010d
            int r5 = r4.intValue()
            r4 = 4
            if (r5 != r4) goto L_0x009f
            X.0eM r2 = r1.A02
            java.lang.String r2 = X.DbS.A0t(r2)
            if (r2 == 0) goto L_0x007b
            int r2 = r2.length()
            if (r2 == 0) goto L_0x007b
            java.lang.String r4 = r0.A0j
            X.0qQ.A07(r4)
            X.0eM r2 = r1.A0H
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            java.lang.Integer r10 = X.C51967G9n.A0l(r2)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            java.lang.String r3 = r0.A0r
            com.instagram.model.rtc.RtcIgNotification r8 = X.O1E.A00(r0)
            X.0eM r2 = r1.A03
            java.lang.String r18 = X.DbS.A0t(r2)
            if (r18 == 0) goto L_0x0076
            com.instagram.common.typedurl.ImageUrl r7 = r0.A0C
            java.lang.String r15 = r1.A04()
            X.NjG r9 = X.C69315NjG.Incoming
            java.lang.String r16 = "LiveInviteConnectionEntity"
            com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity r5 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity
            r6 = r5
            r13 = r4
            r14 = r3
            r17 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        L_0x006b:
            X.OWY r3 = r5.A01
            java.lang.String r1 = r0.A17
            if (r1 == 0) goto L_0x0130
            X.JwL r4 = r3.A01(r1)
            goto L_0x0014
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x007b:
            java.lang.String r14 = X.C71120OdE.A02(r3, r1)
            java.lang.String r4 = r0.A0j
            X.0qQ.A07(r4)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.String r2 = r0.A0r
            java.lang.String r13 = X.C71120OdE.A03(r3, r1, r2)
            com.instagram.model.rtc.RtcIgNotification r7 = X.O1E.A00(r0)
            X.0eM r0 = r1.A0G
            boolean r15 = X.AnonymousClass7TF.A1Z(r0)
            r8 = r12
            r9 = r1
            r11 = r12
            r12 = r4
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r5 = X.C71120OdE.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x009f:
            r4 = 5
            if (r5 != r4) goto L_0x010d
            java.lang.String r13 = r0.A0j
            X.0qQ.A07(r13)
            X.0eM r4 = r1.A0H
            boolean r4 = X.AnonymousClass7TF.A1Z(r4)
            java.lang.Integer r9 = X.C51967G9n.A0l(r4)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.String r14 = r0.A0r
            com.instagram.model.rtc.RtcIgNotification r7 = X.O1E.A00(r0)
            X.OKy r4 = new X.OKy
            r4.<init>(r3, r0)
            X.5HJ r4 = r4.A00
            com.instagram.common.typedurl.ImageUrl r4 = r4.A0C
            if (r4 == 0) goto L_0x010a
            java.lang.String r21 = r4.getUrl()
        L_0x00c8:
            java.lang.String r15 = r1.A04()
            X.0eM r1 = r1.A07
            java.lang.Object r11 = r1.getValue()
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.String r4 = r0.A1A
            java.lang.String r1 = r0.A19
            X.OKy r5 = new X.OKy
            r5.<init>(r3, r0)
            java.lang.String r20 = r5.A00()
            X.OKy r5 = new X.OKy
            r5.<init>(r3, r0)
            java.lang.String r0 = r5.A00()
            if (r0 == 0) goto L_0x00f4
            int r0 = r0.length()
            r22 = 0
            if (r0 != 0) goto L_0x00f6
        L_0x00f4:
            r22 = 1
        L_0x00f6:
            X.NjG r8 = X.C69315NjG.Unknown
            java.lang.String r16 = "EndCallConnectionEntity"
            X.Nid r6 = X.C69277Nid.NO_E2EE
            com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity r5 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity
            r17 = r12
            r23 = r2
            r18 = r4
            r19 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r5
        L_0x010a:
            r21 = 0
            goto L_0x00c8
        L_0x010d:
            java.lang.String r2 = r0.A0j
            X.0qQ.A07(r2)
            java.lang.String r13 = r1.A04()
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            java.lang.Integer r8 = X.C51967G9n.A0l(r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.NjG r7 = X.C69315NjG.Unknown
            java.lang.String r14 = "RtcCallGenericConnectionEntity"
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity r5 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity
            r6 = r12
            r10 = r12
            r11 = r2
            r15 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r5
        L_0x0130:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72903POn.E1i(java.lang.Object):com.instagram.rtc.signaling.models.RtcConnectionEntity");
    }
}
