package X;

import android.content.Context;

/* renamed from: X.POm  reason: case insensitive filesystem */
public final class C72902POm implements C74364Pte {
    public final Context A00;

    public C72902POm(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity} */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0132, code lost:
        if (r0.length() == 0) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x007f, code lost:
        if (r0.length() == 0) goto L_0x0081;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.instagram.rtc.signaling.models.RtcConnectionEntity E1i(java.lang.Object r29) {
        /*
            r28 = this;
            r4 = r29
            X.5HJ r4 = (X.AnonymousClass5HJ) r4
            r1 = 0
            X.0qQ.A0B(r4, r1)
            r0 = r28
            android.content.Context r2 = r0.A00
            X.OKy r0 = new X.OKy
            r0.<init>(r2, r4)
            java.lang.String r3 = r4.A0X
            java.lang.String r2 = "video_call_incoming"
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x00b3
            X.NjG r9 = X.C69315NjG.Incoming
            java.lang.String r14 = r4.A0j
            X.0qQ.A07(r14)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            java.lang.String r15 = r4.A0r
            com.instagram.model.rtc.RtcIgNotification r8 = X.O1E.A00(r4)
            X.0eM r2 = r0.A01
            java.lang.Object r4 = r2.getValue()
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r3 = "surface_id"
            java.lang.String r18 = r4.getQueryParameter(r3)
            X.0qQ.A0A(r18)
            java.lang.Object r4 = r2.getValue()
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r3 = "caller_id"
            java.lang.String r20 = r4.getQueryParameter(r3)
            X.0qQ.A0A(r20)
            java.lang.Object r4 = r2.getValue()
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r3 = "caller"
            java.lang.String r21 = r4.getQueryParameter(r3)
            X.0qQ.A0A(r21)
            java.lang.String r22 = r0.A00()
            X.5HJ r3 = r0.A00
            com.instagram.common.typedurl.ImageUrl r3 = r3.A0C
            if (r3 == 0) goto L_0x00b0
            java.lang.String r23 = r3.getUrl()
        L_0x0067:
            java.lang.Object r4 = r2.getValue()
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r3 = "is_audio_call"
            boolean r26 = r4.getBooleanQueryParameter(r3, r1)
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x0081
            int r0 = r0.length()
            r27 = 0
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r27 = 1
        L_0x0083:
            java.lang.Object r2 = r2.getValue()
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r0 = "esi"
            java.lang.String r0 = r2.getQueryParameter(r0)
            X.0qQ.A0A(r0)
            r10 = 0
            java.lang.String r17 = "RtcCallConnectionEntity"
            X.Nid r5 = X.C69277Nid.NO_E2EE
            X.Nie r6 = X.C69278Nie.NOT_SET
            com.instagram.model.rtc.RtcCallKey r7 = new com.instagram.model.rtc.RtcCallKey
            r7.<init>(r0)
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r4 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity
            r12 = r11
            r13 = r10
            r19 = r10
            r24 = r10
            r25 = r1
            r16 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x00ad:
            com.instagram.rtc.signaling.models.RtcConnectionEntity r4 = (com.instagram.rtc.signaling.models.RtcConnectionEntity) r4
            return r4
        L_0x00b0:
            r23 = 0
            goto L_0x0067
        L_0x00b3:
            r2 = 4189(0x105d, float:5.87E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0154
            java.lang.String r5 = r4.A0j
            X.0qQ.A07(r5)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.String r3 = r4.A0r
            com.instagram.model.rtc.RtcIgNotification r8 = X.O1E.A00(r4)
            X.5HJ r2 = r0.A00
            com.instagram.common.typedurl.ImageUrl r2 = r2.A0C
            if (r2 == 0) goto L_0x0151
            java.lang.String r22 = r2.getUrl()
        L_0x00d6:
            X.0eM r6 = r0.A01
            java.lang.Object r7 = r6.getValue()
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r2 = "esi"
            java.lang.String r16 = r7.getQueryParameter(r2)
            X.0qQ.A0A(r16)
            java.lang.Object r7 = r6.getValue()
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r2 = "surface_id"
            java.lang.String r18 = r7.getQueryParameter(r2)
            X.0qQ.A0A(r18)
            java.lang.Object r7 = r6.getValue()
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r2 = "is_e2ee_mandated"
            boolean r2 = r7.getBooleanQueryParameter(r2, r1)
            if (r2 == 0) goto L_0x014e
            java.lang.String r2 = r0.A00()
            if (r2 == 0) goto L_0x014b
            int r2 = r2.length()
            if (r2 == 0) goto L_0x014b
            X.Nid r7 = X.C69277Nid.P2P_E2EE
        L_0x0112:
            java.lang.Object r6 = r6.getValue()
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.String r2 = "is_audio_call"
            boolean r24 = r6.getBooleanQueryParameter(r2, r1)
            java.lang.String r2 = r4.A1A
            java.lang.String r1 = r4.A19
            java.lang.String r21 = r0.A00()
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x0134
            int r0 = r0.length()
            r23 = 0
            if (r0 != 0) goto L_0x0136
        L_0x0134:
            r23 = 1
        L_0x0136:
            r12 = 0
            X.NjG r9 = X.C69315NjG.Unknown
            java.lang.String r17 = "EndCallConnectionEntity"
            com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity r4 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$EndCallConnectionEntity
            r6 = r4
            r11 = r10
            r13 = r12
            r14 = r5
            r15 = r3
            r19 = r2
            r20 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x00ad
        L_0x014b:
            X.Nid r7 = X.C69277Nid.GVC_E2EE
            goto L_0x0112
        L_0x014e:
            X.Nid r7 = X.C69277Nid.NO_E2EE
            goto L_0x0112
        L_0x0151:
            r22 = 0
            goto L_0x00d6
        L_0x0154:
            java.lang.String r10 = r4.A0j
            X.0qQ.A07(r10)
            X.0eM r0 = r0.A01
            java.lang.Object r1 = r0.getValue()
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r0 = "esi"
            java.lang.String r12 = r1.getQueryParameter(r0)
            X.0qQ.A0A(r12)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r5 = 0
            X.NjG r6 = X.C69315NjG.Unknown
            java.lang.String r13 = "RtcCallGenericConnectionEntity"
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity r4 = new com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallGenericConnectionEntity
            r8 = r7
            r9 = r5
            r11 = r5
            r14 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72902POm.E1i(java.lang.Object):com.instagram.rtc.signaling.models.RtcConnectionEntity");
    }
}
