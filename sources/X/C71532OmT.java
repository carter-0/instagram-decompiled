package X;

/* renamed from: X.OmT  reason: case insensitive filesystem */
public final class C71532OmT implements C74290PsI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C71532OmT(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj4;
        this.A03 = obj3;
        this.A05 = str;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0203 */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0207 A[Catch:{ UnsupportedOperationException -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void run(java.lang.Object r24) {
        /*
            r23 = this;
            r4 = r23
            r2 = r24
            int r0 = r4.A00
            X.Nnw r2 = (X.C69552Nnw) r2
            if (r0 == 0) goto L_0x0162
            boolean r0 = r2 instanceof X.N0I
            if (r0 == 0) goto L_0x0150
            java.lang.Object r3 = r4.A04
            X.MtS r3 = (X.C67713MtS) r3
            X.N0I r2 = (X.N0I) r2
            java.lang.Object r11 = r2.A00
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r14 = r4.A03
            X.S5E r14 = (X.S5E) r14
            java.lang.String r2 = r4.A05
            java.lang.Object r13 = r4.A01
            X.ObS r6 = X.C71087ObS.A00()
            X.OyT r0 = r3.A03     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            boolean r0 = r0.A08()     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            if (r0 == 0) goto L_0x0119
            X.NUN r5 = r3.A02     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            java.lang.String r0 = "GDRIVE_SETUP_UPLOAD_TO_GDRIVE_START"
            r5.A0B(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            X.0eM r0 = X.O5J.A04     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            X.Oao r0 = (X.C71069Oao) r0     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            X.AnonymousClass7TG.A1O(r2, r11)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            r0.A03(r14, r2)     // Catch:{ IOException -> 0x00df }
            java.lang.String r10 = "\r\n"
            java.lang.String r12 = "--*****\r\n"
            java.lang.String r0 = "https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart"
            java.net.HttpURLConnection r7 = X.C66584MXp.A0d(r0)     // Catch:{ IOException -> 0x00df }
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)     // Catch:{ IOException -> 0x00df }
            r9 = 0
            r7.setUseCaches(r9)     // Catch:{ IOException -> 0x00df }
            r0 = 1
            r7.setDoInput(r0)     // Catch:{ IOException -> 0x00df }
            r7.setDoOutput(r0)     // Catch:{ IOException -> 0x00df }
            java.lang.String r1 = "Bearer "
            X.PwC r0 = X.C74517PwC.A00     // Catch:{ IOException -> 0x00df }
            X.0qQ.A08(r0)     // Catch:{ IOException -> 0x00df }
            X.SIw r0 = r14.A00     // Catch:{ IOException -> 0x00df }
            java.lang.String r0 = r0.A00     // Catch:{ IOException -> 0x00df }
            r0.getClass()     // Catch:{ IOException -> 0x00df }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x00df }
            java.lang.String r0 = "Authorization"
            r7.setRequestProperty(r0, r1)     // Catch:{ IOException -> 0x00df }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "multipart/form-data; boundary=*****"
            r7.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x00df }
            r0 = 317528044(0x12ed17ec, float:1.49627E-27)
            X.0fY r0 = X.0fi.A01(r7, r0)     // Catch:{ IOException -> 0x00d0 }
            java.io.DataOutputStream r8 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x00d0 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x00d0 }
            r8.writeBytes(r12)     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r0 = "Content-Type: application/json\r\n\r\n"
            r8.writeBytes(r0)     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r1 = "{\"name\": \""
            java.lang.String r0 = "\",\"parents\":[\"appDataFolder\"]}\r\n"
            java.lang.String r0 = X.002.A0g(r1, r2, r0)     // Catch:{ IOException -> 0x00d0 }
            r8.writeBytes(r0)     // Catch:{ IOException -> 0x00d0 }
            r8.writeBytes(r12)     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"file\"\r\n\r\n"
            r8.writeBytes(r0)     // Catch:{ IOException -> 0x00d0 }
            r8.writeBytes(r11)     // Catch:{ IOException -> 0x00d0 }
            r8.writeBytes(r10)     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r0 = "--*****--\r\n"
            r8.writeBytes(r0)     // Catch:{ IOException -> 0x00d0 }
            r8.writeBytes(r10)     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r8 = "GoogleDriveIntegration"
            java.lang.String r1 = "response data for uploading :"
            int r0 = r7.getResponseCode()     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r0 = X.C71069Oao.A02(r7, r0)     // Catch:{ IOException -> 0x00d0 }
            X.C66580MXl.A1U(r1, r0, r8)     // Catch:{ IOException -> 0x00d0 }
            int r1 = r7.getResponseCode()     // Catch:{ IOException -> 0x00d0 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x00c6
            r9 = 1
        L_0x00c6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ IOException -> 0x00d0 }
            X.N05 r1 = new X.N05     // Catch:{ IOException -> 0x00d0 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00d0 }
            goto L_0x00d6
        L_0x00d0:
            r0 = move-exception
            X.N04 r1 = new X.N04     // Catch:{ all -> 0x00da }
            r1.<init>(r0)     // Catch:{ all -> 0x00da }
        L_0x00d6:
            r7.disconnect()     // Catch:{ IOException -> 0x00df }
            goto L_0x00e5
        L_0x00da:
            r0 = move-exception
            r7.disconnect()     // Catch:{ IOException -> 0x00df }
            throw r0     // Catch:{ IOException -> 0x00df }
        L_0x00df:
            r0 = move-exception
            X.N04 r1 = new X.N04     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            r1.<init>(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
        L_0x00e5:
            boolean r0 = r1 instanceof X.N05     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            if (r0 == 0) goto L_0x012a
            X.N05 r1 = (X.N05) r1     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            java.lang.Object r0 = r1.A00     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            boolean r0 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = "GDRIVE_SETUP_CREATE_VD_START"
            r5.A0B(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            X.OUY r1 = X.OUY.A00     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            com.instagram.common.session.UserSession r0 = r3.A01     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            java.util.concurrent.CompletableFuture r1 = r1.A00(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            r17 = 37
            X.PqV r12 = new X.PqV     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            r15 = r6
            r16 = r2
            r12.<init>((java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.String) r16, (int) r17)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            r0 = 6
            X.C73452Pcu.A00(r1, r12, r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            goto L_0x0145
        L_0x010f:
            X.Nnk r0 = new X.Nnk     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            r0.<init>()     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            X.N0J r0 = X.N0J.A00(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            goto L_0x0138
        L_0x0119:
            java.lang.String r1 = "EncryptedBackupsGDriveSetupViewModel"
            java.lang.String r0 = "Cannot create VD, backup exists and not onboarded"
            X.0KC.A0C(r1, r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            com.encryptedbackups.statemanager.model.CreateVirtualDeviceException r0 = new com.encryptedbackups.statemanager.model.CreateVirtualDeviceException     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            r0.<init>()     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            X.N0J r0 = X.N0J.A00(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            goto L_0x0138
        L_0x012a:
            boolean r0 = r1 instanceof X.N04     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            if (r0 == 0) goto L_0x013c
            X.N04 r1 = (X.N04) r1     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            java.lang.Object r0 = r1.A00     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            X.N0J r0 = X.N0J.A00(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
        L_0x0138:
            r6.A05(r0)     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            goto L_0x0145
        L_0x013c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ UserRecoverableAuthException -> 0x0141 }
            throw r0     // Catch:{ UserRecoverableAuthException -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            X.N0J.A01(r6, r0)
        L_0x0145:
            java.lang.Object r1 = r4.A02
            r0 = 17
            X.OmC r2 = new X.OmC
            r2.<init>(r1, r0)
            goto L_0x024b
        L_0x0150:
            boolean r0 = r2 instanceof X.N0J
            if (r0 == 0) goto L_0x024e
            java.lang.Object r3 = r4.A02
            X.ObS r3 = (X.C71087ObS) r3
            X.N0J r2 = (X.N0J) r2
            java.lang.Exception r0 = r2.A00
            X.N0J r2 = X.N0J.A00(r0)
            goto L_0x02ab
        L_0x0162:
            boolean r1 = r2 instanceof X.N0I
            java.lang.String r0 = "VestaRegistrationClient"
            if (r1 == 0) goto L_0x0270
            X.N0I r2 = (X.N0I) r2
            java.lang.Object r1 = r2.A00
            X.ONJ r1 = (X.ONJ) r1
            java.lang.String r0 = r1.A00
            r16 = r0
            java.lang.String r12 = r1.A01
            java.lang.Object r8 = r4.A02
            X.OVw r8 = (X.C71000OVw) r8
            com.facebook.quicklog.LightweightQuickPerformanceLogger r15 = r8.A01
            r14 = 1021652080(0x3ce52c70, float:0.027975291)
            int r10 = r8.A00
            java.lang.String r0 = "generate_rc_and_vdid_success"
            r15.markerPoint(r14, r10, r0)
            java.lang.Object r9 = r4.A04
            X.OGd r9 = (X.C70682OGd) r9
            java.lang.Object r0 = r4.A01
            X.O5S r0 = (X.O5S) r0
            X.ObS r6 = X.C71087ObS.A00()
            X.O5T r13 = r9.A04
            java.lang.Integer r7 = r9.A05
            java.lang.String r5 = r0.A00
            X.OV9 r1 = new X.OV9
            r1.<init>(r8, r6)
            r3 = 0
            X.0qQ.A0B(r7, r3)
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            X.0qQ.A07(r0)
            java.lang.String r11 = X.DbT.A10(r0)
            java.lang.String r2 = "request_uuid"
            r15.markerAnnotate(r14, r10, r2, r11)
            java.lang.String r0 = "init_register_network_start"
            r15.markerPoint(r14, r10, r0)
            X.OGc r10 = r13.A00
            java.lang.String r0 = X.C69691NqD.A00(r7)
            X.OLk r14 = new X.OLk
            r22 = r11
            r19 = r5
            r20 = r12
            r21 = r16
            r17 = r1
            r18 = r7
            r15 = r8
            r16 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r5 = 1
            X.0Df r7 = X.C66584MXp.A0E(r0, r12)
            int r0 = r10.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "vesta_client_api_version"
            X.0Df.A00(r7, r1, r0)
            X.0Df.A00(r7, r11, r2)
            java.lang.Class<X.OON> r1 = X.OON.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C41847B3o.A17(r1, r0, r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x026a }
            X.OnM r2 = (X.C71585OnM) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x026a }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "request"
            X.DbW.A18(r7, r1, r0)
            r2.A02 = r5
            X.1Ef r7 = r2.build()
            X.0qQ.A07(r7)
            boolean r0 = r10.A01     // Catch:{ UnsupportedOperationException -> 0x0203 }
            if (r0 == 0) goto L_0x0203
            r0 = 2
            r7.setRequestPurpose(r0)     // Catch:{ UnsupportedOperationException -> 0x0203 }
        L_0x0203:
            boolean r0 = r10.A02     // Catch:{ UnsupportedOperationException -> 0x0210 }
            if (r0 == 0) goto L_0x0210
            X.1Ef r1 = r7.setRetryPolicy(r5)     // Catch:{ UnsupportedOperationException -> 0x0210 }
            int r0 = r10.A00     // Catch:{ UnsupportedOperationException -> 0x0210 }
            r1.setNetworkTimeoutSeconds(r0)     // Catch:{ UnsupportedOperationException -> 0x0210 }
        L_0x0210:
            X.1vo r5 = r10.A04
            r0 = 5
            X.OnG r2 = new X.OnG
            r2.<init>(r0, r10, r14)
            X.On2 r1 = new X.On2
            r1.<init>(r14, r0)
            java.util.concurrent.Executor r0 = r10.A05
            r5.ATM(r1, r2, r7, r0)
            java.lang.String r10 = r4.A05
            X.ObS r7 = X.C71087ObS.A00()
            X.OOB r0 = r9.A03
            X.OZI r2 = r0.A00
            X.ObS r9 = X.C71087ObS.A00()
            X.O5P r0 = r2.A01
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x024f
            X.OZI.A01(r9)
        L_0x023d:
            r0 = 8
            X.C71087ObS.A02(r9, r8, r7, r0)
            java.lang.Object r1 = r4.A03
            r0 = 9
            X.OmG r2 = new X.OmG
            r2.<init>(r0, r1, r7)
        L_0x024b:
            r6.A04(r2)
        L_0x024e:
            return
        L_0x024f:
            X.NAX r5 = r2.A02
            X.Oph r1 = new X.Oph
            r1.<init>((X.OZI) r2, (X.C71087ObS) r9, (int) r3)
            X.68J r0 = r5.mMailboxApiHandleMetaProvider
            r3 = 2
            X.68L r2 = r0.ASa(r3)
            com.facebook.msys.mca.MailboxFutureImpl r1 = X.C66581MXm.A0J(r2, r1)
            X.OoX r0 = new X.OoX
            r0.<init>(r5, r1, r10, r3)
            X.C66582MXn.A1E(r2, r0, r1)
            goto L_0x023d
        L_0x026a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0270:
            java.lang.String r5 = "Failed to generate recovery code"
            X.0KC.A0C(r0, r5)
            java.lang.Object r1 = r4.A02
            X.OVw r1 = (X.C71000OVw) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.encryptedbackups.statemanager.model.ApiResult.Error<com.encryptedbackups.statemanager.model.GenerateRecoveryCodeAndVirtualDeviceIdResponse>"
            X.0qQ.A0C(r2, r0)
            X.N0J r2 = (X.N0J) r2
            java.lang.Exception r0 = r2.A00
            if (r0 == 0) goto L_0x028b
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x028b
            r5 = r0
        L_0x028b:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r3 = r1.A01
            r2 = 1021652080(0x3ce52c70, float:0.027975291)
            int r1 = r1.A00
            java.lang.String r0 = "generate_rc_and_vdid_failed"
            r3.markerPoint(r2, r1, r0)
            java.lang.String r0 = "generate_rc_and_vdid_error"
            X.C66583MXo.A1C(r3, r0, r5, r2, r1)
            java.lang.Object r3 = r4.A03
            X.ObS r3 = (X.C71087ObS) r3
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            X.Nk3 r0 = X.C69363Nk3.A07
            X.OVu r2 = new X.OVu
            r2.<init>(r0, r1)
        L_0x02ab:
            r3.A05(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71532OmT.run(java.lang.Object):void");
    }
}
