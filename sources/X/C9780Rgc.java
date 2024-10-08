package X;

/* renamed from: X.Rgc  reason: case insensitive filesystem */
public abstract class C9780Rgc {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.QQT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.QQV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.QQT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.QQT} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean A00(X.AnonymousClass6Tm r8) {
        /*
            java.lang.String r2 = X.DbY.A0g(r8)
            java.lang.Object r1 = r8.A02()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r3 = X.DbW.A04(r1, r0)
            X.SOL r0 = X.SBL.A00(r2)
            java.lang.Object r2 = r0.A04
            monitor-enter(r2)
            X.SJG r4 = r0.A01     // Catch:{ all -> 0x01bf }
            X.QP0 r0 = r0.A02     // Catch:{ all -> 0x01bf }
            int r1 = r0.A02     // Catch:{ all -> 0x01bf }
            r0 = 10
            r8 = 0
            monitor-exit(r2)
            if (r1 == r0) goto L_0x0028
            if (r4 == 0) goto L_0x0028
            switch(r3) {
                case 10: goto L_0x00fb;
                case 11: goto L_0x003c;
                case 12: goto L_0x002d;
                default: goto L_0x0027;
            }
        L_0x0027:
            r8 = 1
        L_0x0028:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L_0x002d:
            android.content.Context r3 = r4.A01
            X.SOJ r2 = r4.A04
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "APP_OPEN"
            X.AnonymousClass7TF.A1B(r3, r8, r2)
            X.Pxk.A0N(r3, r2, r1, r0)
            goto L_0x0027
        L_0x003c:
            boolean r0 = r4 instanceof X.QQV
            if (r0 == 0) goto L_0x007c
            X.QQV r4 = (X.QQV) r4
            java.lang.String r3 = "DirectInstallAgentManagerXiaomi"
            X.SOJ r2 = r4.A04
            java.lang.String r0 = "IPC_SERVICE_CANCEL_REQUESTED"
            r2.A01(r0)
            com.xiaomi.market.IMarketDownloadService r1 = r4.A03
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = r4.A06     // Catch:{ RemoteException -> 0x006d }
            boolean r0 = r1.AG8(r0)     // Catch:{ RemoteException -> 0x006d }
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "Download is cancelled."
            X.0KC.A0C(r3, r0)     // Catch:{ RemoteException -> 0x006d }
            X.S3r r1 = r4.A03     // Catch:{ RemoteException -> 0x006d }
            X.REo r0 = X.C8896REo.CANCEL_DOWNLOAD     // Catch:{ RemoteException -> 0x006d }
            r1.A00(r0)     // Catch:{ RemoteException -> 0x006d }
            r1 = 0
            java.lang.String r0 = "CANCEL_DOWNLOAD"
            X.SOJ.A00(r1, r2, r1, r0, r1)     // Catch:{ RemoteException -> 0x006d }
            r4.A03()     // Catch:{ RemoteException -> 0x006d }
            goto L_0x0027
        L_0x006d:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Xiaomi Silent Install Error: %s"
            X.0KC.A0O(r3, r0, r1)
            goto L_0x0027
        L_0x007c:
            boolean r0 = r4 instanceof X.QQU
            if (r0 == 0) goto L_0x00c3
            X.QQU r4 = (X.QQU) r4
            X.SOJ r2 = r4.A04
            java.lang.String r0 = "IPC_SERVICE_CANCEL_REQUESTED"
            r2.A01(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r4.A06
            java.lang.Object r1 = r0.get()
            com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService r1 = (com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService) r1
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = r4.A06     // Catch:{ RemoteException -> 0x00aa }
            r1.AGF(r0)     // Catch:{ RemoteException -> 0x00aa }
            X.S3r r1 = r4.A03     // Catch:{ RemoteException -> 0x00aa }
            X.REo r0 = X.C8896REo.CANCEL_DOWNLOAD     // Catch:{ RemoteException -> 0x00aa }
            r1.A00(r0)     // Catch:{ RemoteException -> 0x00aa }
            r1 = 0
            java.lang.String r0 = "CANCEL_DOWNLOAD"
            X.SOJ.A00(r1, r2, r1, r0, r1)     // Catch:{ RemoteException -> 0x00aa }
            r4.A03()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x0027
        L_0x00aa:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "DirectInstallAgentManagerSamsung"
            java.lang.String r0 = "Samsung Cancel Download Error: %s"
            X.0KC.A0O(r1, r0, r2)
            goto L_0x0027
        L_0x00bc:
            java.lang.String r0 = "IPC_SERVICE_CANCEL_REQUEST_SKIPPED"
            r2.A01(r0)
            goto L_0x0027
        L_0x00c3:
            boolean r0 = r4 instanceof X.QQS
            if (r0 == 0) goto L_0x00ed
            X.QQS r4 = (X.QQS) r4
            X.SOJ r1 = r4.A04
            java.lang.String r0 = "IPC_SERVICE_CANCEL_REQUESTED"
            r1.A01(r0)
            X.Ru2 r0 = r4.A00     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = r4.A06     // Catch:{ Exception -> 0x00db }
            java.util.Map r0 = r0.A01     // Catch:{ Exception -> 0x00db }
            r0.get(r1)     // Catch:{ Exception -> 0x00db }
            goto L_0x0027
        L_0x00db:
            r1 = move-exception
            java.lang.Class<X.QQS> r2 = X.QQS.class
            java.lang.String r0 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Cancel Download Error: %s"
            X.0KC.A09(r2, r0, r1)
            goto L_0x0027
        L_0x00ed:
            X.SOJ r1 = r4.A04
            java.lang.String r0 = "IPC_SERVICE_CANCEL_REQUESTED"
            r1.A01(r0)
            java.lang.String r0 = "IPC_SERVICE_CANCEL_REQUEST_SKIPPED"
            r1.A01(r0)
            goto L_0x0027
        L_0x00fb:
            boolean r0 = r4 instanceof X.QQV
            if (r0 == 0) goto L_0x011e
            r5 = r4
            X.QQV r5 = (X.QQV) r5
            boolean r0 = X.QQV.A01(r5)     // Catch:{ SecurityException -> 0x019f }
            if (r0 != 0) goto L_0x01af
            X.SOJ r3 = r5.A04     // Catch:{ SecurityException -> 0x019f }
            X.RIq r2 = X.C8951RIq.ERROR_SERVICE_UNAVAILABLE     // Catch:{ SecurityException -> 0x019f }
            java.lang.String r1 = "FAILED_SERVICE_CONNECTION"
            r0 = 0
            X.SOJ.A00(r2, r3, r0, r1, r0)     // Catch:{ SecurityException -> 0x019f }
            X.S3r r1 = r5.A03     // Catch:{ SecurityException -> 0x019f }
            X.REo r0 = X.C8896REo.FAILED_INSTALL     // Catch:{ SecurityException -> 0x019f }
            r1.A00(r0)     // Catch:{ SecurityException -> 0x019f }
            r5.A03()     // Catch:{ SecurityException -> 0x019f }
            goto L_0x01af
        L_0x011e:
            boolean r0 = r4 instanceof X.QQU
            if (r0 == 0) goto L_0x012c
            r1 = r4
            X.QQU r1 = (X.QQU) r1
            android.content.ServiceConnection r0 = r1.A00
            X.QQU.A01(r0, r1)
            goto L_0x01af
        L_0x012c:
            boolean r0 = r4 instanceof X.QQS
            if (r0 == 0) goto L_0x013b
            X.SOJ r1 = r4.A04
            java.lang.String r0 = "IPC_SERVICE_BIND_REQUESTED"
            r1.A01(r0)
            r4.A04()
            goto L_0x01af
        L_0x013b:
            r5 = r4
            X.QQT r5 = (X.QQT) r5
            X.SOJ r3 = r5.A04
            java.lang.String r0 = "IPC_SERVICE_BIND_REQUESTED"
            r3.A01(r0)
            android.content.ServiceConnection r7 = r5.A01     // Catch:{ SecurityException -> 0x0194 }
            android.content.Context r6 = r5.A00     // Catch:{ SecurityException -> 0x0194 }
            java.lang.String r2 = "com.digitalturbine.ignite.cl.IgniteRemoteService"
            android.content.Intent r1 = X.Pxe.A0G(r2)     // Catch:{ SecurityException -> 0x0194 }
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ SecurityException -> 0x0194 }
            java.util.List r1 = r0.queryIntentServices(r1, r8)     // Catch:{ SecurityException -> 0x0194 }
            X.0qQ.A07(r1)     // Catch:{ SecurityException -> 0x0194 }
            boolean r0 = X.AnonymousClass7TE.A1b(r1)     // Catch:{ SecurityException -> 0x0194 }
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = X.00k.A0I(r1)     // Catch:{ SecurityException -> 0x0194 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ SecurityException -> 0x0194 }
            if (r0 == 0) goto L_0x017e
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch:{ SecurityException -> 0x0194 }
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = r0.packageName     // Catch:{ SecurityException -> 0x0194 }
            if (r0 == 0) goto L_0x017e
            android.content.Intent r1 = X.DbS.A09()     // Catch:{ SecurityException -> 0x0194 }
            r1.setClassName(r0, r2)     // Catch:{ SecurityException -> 0x0194 }
            X.Tgk r0 = r5.A05     // Catch:{ SecurityException -> 0x0194 }
            boolean r0 = r0.ADg(r6, r1, r7)     // Catch:{ SecurityException -> 0x0194 }
            goto L_0x017f
        L_0x017e:
            r0 = 0
        L_0x017f:
            if (r0 != 0) goto L_0x01af
            X.RIq r2 = X.C8951RIq.ERROR_SERVICE_UNAVAILABLE     // Catch:{ SecurityException -> 0x0194 }
            java.lang.String r1 = "FAILED_SERVICE_CONNECTION"
            r0 = 0
            X.SOJ.A00(r2, r3, r0, r1, r0)     // Catch:{ SecurityException -> 0x0194 }
            X.S3r r1 = r5.A03     // Catch:{ SecurityException -> 0x0194 }
            X.REo r0 = X.C8896REo.FAILED_DOWNLOAD     // Catch:{ SecurityException -> 0x0194 }
            r1.A00(r0)     // Catch:{ SecurityException -> 0x0194 }
            r5.A03()     // Catch:{ SecurityException -> 0x0194 }
            goto L_0x01af
        L_0x0194:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "FAILED_SERVICE_CONNECTION"
            X.SJG.A02(r5, r3, r0, r1)
            goto L_0x01ac
        L_0x019f:
            r0 = move-exception
            X.SOJ r3 = r5.A04
            java.lang.String r2 = r0.getMessage()
            java.lang.String r1 = "FAILED_SERVICE_CONNECTION"
            r0 = 0
            X.SOJ.A00(r0, r3, r0, r1, r2)
        L_0x01ac:
            r5.A03()
        L_0x01af:
            java.lang.String r1 = r4.A08
            java.lang.String r0 = "xiaomi"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0027
            r4.A04()
            goto L_0x0027
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9780Rgc.A00(X.6Tm):java.lang.Boolean");
    }
}
