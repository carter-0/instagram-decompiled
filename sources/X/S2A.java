package X;

public final class S2A {
    public final /* synthetic */ SF4 A00;
    public final /* synthetic */ T69 A01;
    public final /* synthetic */ String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f2, code lost:
        if (r13 != null) goto L_0x01a1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0208 A[Catch:{ Exception -> 0x0219 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r20) {
        /*
            r19 = this;
            r11 = 0
            r12 = 0
            r4 = r19
            X.SF4 r3 = r4.A00     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            int r1 = r3.A00     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            r0 = 2
            if (r1 != r0) goto L_0x006f
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r0 = r3.A02     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            if (r0 == 0) goto L_0x006f
            android.content.ServiceConnection r0 = r3.A01     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            if (r0 == 0) goto L_0x006f
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            android.content.Context r0 = r3.A03     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            java.lang.String r0 = "package_name"
            r8.putString(r0, r1)     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r7 = r3.A02     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy r7 = (com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy) r7     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            r0 = -1688150585(0xffffffff9b60ddc7, float:-1.8600506E-22)
            int r6 = X.AnonymousClass0fD.A03(r0)     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
            r5.writeInterfaceToken(r0)     // Catch:{ all -> 0x0061 }
            r1 = 1
            r5.writeInt(r1)     // Catch:{ all -> 0x0061 }
            r8.writeToParcel(r5, r12)     // Catch:{ all -> 0x0061 }
            android.os.IBinder r0 = r7.A00     // Catch:{ all -> 0x0061 }
            int r0 = X.Pxg.A02(r0, r5, r2, r1)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0053
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r0.createFromParcel(r2)     // Catch:{ all -> 0x0061 }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ all -> 0x0061 }
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            r2.recycle()     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            r5.recycle()     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            r0 = -904788255(0xffffffffca1206e1, float:-2392504.2)
            X.AnonymousClass0fD.A0A(r0, r6)     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            goto L_0x0081
        L_0x0061:
            r1 = move-exception
            r2.recycle()     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            r5.recycle()     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            r0 = 128906760(0x7aef608, float:2.6325214E-34)
            X.AnonymousClass0fD.A0A(r0, r6)     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
            throw r1     // Catch:{ RemoteException -> 0x0076, RemoteException | IllegalStateException -> 0x0083 }
        L_0x006f:
            java.lang.String r0 = "Service not connected. Please start a connection before using the service."
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            goto L_0x0080
        L_0x0076:
            r2 = move-exception
            java.lang.String r1 = "InstallReferrerClient"
            java.lang.String r0 = "RemoteException getting install referrer information"
            X.Pxg.A1O(r1, r0)     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
            r3.A00 = r12     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
        L_0x0080:
            throw r2     // Catch:{ RemoteException | IllegalStateException -> 0x0083 }
        L_0x0081:
            r11 = r1
            r12 = 1
        L_0x0083:
            X.T69 r2 = r4.A01
            java.lang.String r8 = r4.A02
            r3 = 0
            if (r12 == 0) goto L_0x01f5
            java.lang.String r0 = "install_referrer"
            java.lang.String r5 = r11.getString(r0)
        L_0x0090:
            r6 = r20
            if (r20 == 0) goto L_0x00bb
            r0 = 1
            if (r6 == r0) goto L_0x01f8
            java.lang.String r1 = "FEATURE_NOT_SUPPORTED"
            X.0lg r0 = r2.A01
            X.C9865Rie.A00(r0, r3, r1, r8)
        L_0x009e:
            r5 = 1
            if (r6 == r5) goto L_0x01ff
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            r2 = 0
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "preference_referral_logging_attempt_count"
            r1.E5Z(r0, r2)
            r1.apply()
            X.T69.A03 = r5
            goto L_0x01ff
        L_0x00bb:
            X.0lg r2 = r2.A01
            java.lang.String r7 = "install_referrer"
            if (r5 == 0) goto L_0x00f1
            android.net.Uri$Builder r1 = X.Pxe.A0I()
            java.lang.String r0 = android.net.Uri.decode(r5)
            android.net.Uri$Builder r0 = r1.encodedQuery(r0)
            android.net.Uri r13 = r0.build()
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.util.Set r0 = r13.getQueryParameterNames()
            java.util.Iterator r9 = r0.iterator()
        L_0x00dd:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r13.getQueryParameter(r1)
            r10.put(r1, r0)
            goto L_0x00dd
        L_0x00f1:
            r10 = 0
        L_0x00f2:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r15 = 0
            if (r12 == 0) goto L_0x016f
            java.lang.String r0 = "referrer_click_timestamp_seconds"
            long r0 = r11.getLong(r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "install_begin_timestamp_seconds"
            long r0 = r11.getLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x010e:
            if (r10 == 0) goto L_0x0172
            java.util.Iterator r17 = X.Pxf.A0u(r10)
            r18 = r3
            r13 = r3
            r12 = r3
            r11 = r3
        L_0x0119:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0177
            java.lang.String r14 = X.AnonymousClass7TE.A18(r17)
            if (r14 == 0) goto L_0x009e
            java.lang.String r16 = X.DbS.A0r(r14, r10)
            int r0 = r14.hashCode()
            switch(r0) {
                case -1539894552: goto L_0x0131;
                case -1190254514: goto L_0x013d;
                case -64687999: goto L_0x0140;
                case 3230707: goto L_0x014c;
                case 1889642278: goto L_0x0157;
                case 2071166924: goto L_0x0163;
                default: goto L_0x0130;
            }
        L_0x0130:
            goto L_0x0119
        L_0x0131:
            java.lang.String r0 = "utm_content"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0119
            r15 = r16
            goto L_0x0119
        L_0x013d:
            java.lang.String r0 = "igshid"
            goto L_0x014e
        L_0x0140:
            java.lang.String r0 = "utm_campaign"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0119
            r18 = r16
            goto L_0x0119
        L_0x014c:
            java.lang.String r0 = "igsh"
        L_0x014e:
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0119
            r11 = r16
            goto L_0x0119
        L_0x0157:
            java.lang.String r0 = "utm_medium"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0119
            r12 = r16
            goto L_0x0119
        L_0x0163:
            java.lang.String r0 = "utm_source"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0119
            r13 = r16
            goto L_0x0119
        L_0x016f:
            r9 = r3
            r1 = r3
            goto L_0x010e
        L_0x0172:
            r14 = r3
            r13 = r3
            r12 = r3
            r11 = r3
            goto L_0x017a
        L_0x0177:
            r14 = r15
            r15 = r18
        L_0x017a:
            X.0xN r0 = X.C60510iO.A00(r2)
            java.lang.String r10 = r0.BcO()
            X.0wc r2 = X.AnonymousClass0kN.A02(r2)
            java.lang.String r0 = "instagram_android_install_with_referrer"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            if (r15 == 0) goto L_0x0194
            java.lang.String r0 = "utm_campaign"
            r2.AAJ(r0, r15)
        L_0x0194:
            r15 = 1
            if (r14 == 0) goto L_0x01f2
            if (r13 == 0) goto L_0x01ec
            java.lang.String r0 = "ig_contact_invite"
            boolean r0 = r13.equals(r0)
            if (r0 != r15) goto L_0x01ec
        L_0x01a1:
            java.lang.String r0 = "utm_source"
            r2.AAJ(r0, r13)
        L_0x01a7:
            if (r12 == 0) goto L_0x01af
            java.lang.String r0 = "utm_medium"
            r2.AAJ(r0, r12)
        L_0x01af:
            if (r11 == 0) goto L_0x01b6
            java.lang.String r0 = "ig_share_id"
            r2.AAJ(r0, r11)
        L_0x01b6:
            if (r10 == 0) goto L_0x01be
            java.lang.String r0 = "pigeon_session_id"
            r2.AAJ(r0, r10)
        L_0x01be:
            if (r9 == 0) goto L_0x01c6
            java.lang.String r0 = "referrer_click_timestamp_seconds"
            r2.A9F(r0, r9)
        L_0x01c6:
            if (r1 == 0) goto L_0x01cd
            java.lang.String r0 = "install_begin_timestamp_seconds"
            r2.A9F(r0, r1)
        L_0x01cd:
            java.lang.String r0 = "family_device_id"
            r2.AAJ(r0, r8)
            java.lang.String r1 = X.1Q0.A01()
            java.lang.String r0 = "waterfall_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "containermodule"
            r2.AAJ(r0, r7)
            java.lang.String r0 = "referrer"
            r2.AAJ(r0, r5)
            r2.Cgf()
            goto L_0x009e
        L_0x01ec:
            java.lang.String r0 = "utm_content"
            r2.AAJ(r0, r14)
        L_0x01f2:
            if (r13 == 0) goto L_0x01a7
            goto L_0x01a1
        L_0x01f5:
            r5 = r3
            goto L_0x0090
        L_0x01f8:
            java.lang.String r1 = "SERVICE_UNAVAILABLE"
            X.0lg r0 = r2.A01
            X.C9865Rie.A00(r0, r3, r1, r8)
        L_0x01ff:
            X.SF4 r2 = r4.A00     // Catch:{ Exception -> 0x0219 }
            r0 = 3
            r2.A00 = r0     // Catch:{ Exception -> 0x0219 }
            android.content.ServiceConnection r0 = r2.A01     // Catch:{ Exception -> 0x0219 }
            if (r0 == 0) goto L_0x0217
            java.lang.String r1 = "InstallReferrerClient"
            r0 = 2
            android.util.Log.isLoggable(r1, r0)     // Catch:{ Exception -> 0x0219 }
            android.content.Context r1 = r2.A03     // Catch:{ Exception -> 0x0219 }
            android.content.ServiceConnection r0 = r2.A01     // Catch:{ Exception -> 0x0219 }
            r1.unbindService(r0)     // Catch:{ Exception -> 0x0219 }
            r2.A01 = r3     // Catch:{ Exception -> 0x0219 }
        L_0x0217:
            r2.A02 = r3     // Catch:{ Exception -> 0x0219 }
        L_0x0219:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2A.A00(int):void");
    }

    public S2A(SF4 sf4, T69 t69, String str) {
        this.A01 = t69;
        this.A00 = sf4;
        this.A02 = str;
    }
}
