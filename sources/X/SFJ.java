package X;

public final class SFJ {
    public static SFJ A04;
    public long A00;
    public String A01;
    public String A02;
    public boolean A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.SFJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.SFJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.SFJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.SFJ} */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, X.SFJ] */
    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Object, X.SFJ] */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:47|48|49|50|51|52|53|54|55|56|88|(7:94|95|96|(1:(1:108)(1:107))(1:100)|101|(1:103)|(4:110|131|132|133)(6:111|(2:113|(3:115|116|(3:118|(1:123)|124)))(1:125)|126|127|(2:129|130)|93))|92|93) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|17|18|(6:22|23|24|25|26|(10:33|34|35|36|37|39|40|41|42|(14:47|48|49|50|51|52|53|54|55|56|88|(7:94|95|96|(1:(1:108)(1:107))(1:100)|101|(1:103)|(4:110|131|132|133)(6:111|(2:113|(3:115|116|(3:118|(1:123)|124)))(1:125)|126|127|(2:129|130)|93))|92|93)))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0095 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01df A[Catch:{ Exception -> 0x0279, all -> 0x027a }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01eb A[Catch:{ Exception -> 0x0279, all -> 0x027a }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f3 A[Catch:{ Exception -> 0x0279, all -> 0x027a }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0208 A[Catch:{ Exception -> 0x0279, all -> 0x027a }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0209 A[Catch:{ Exception -> 0x0279, all -> 0x027a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.SFJ A00(android.content.Context r29) {
        /*
            java.lang.String r11 = "limit_tracking"
            java.lang.String r10 = "androidid"
            java.lang.String r6 = "aid"
            X.SFJ r5 = A04
            if (r5 == 0) goto L_0x0019
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.A00
            long r3 = r3 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
            return r5
        L_0x0019:
            X.Pxe.A1G()
            r9 = 0
            r3 = 1
            r5 = r29
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8 = 0
            java.lang.Class[] r2 = new java.lang.Class[]{r4}     // Catch:{  }
            java.lang.String r0 = "com.google.android.gms.common.GooglePlayServicesUtil"
            java.lang.String r1 = "isGooglePlayServicesAvailable"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{  }
            java.lang.reflect.Method r2 = r0.getMethod(r1, r2)     // Catch:{ Exception -> 0x009d }
            if (r2 == 0) goto L_0x009d
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{  }
            r1 = 0
            java.lang.Object r1 = r2.invoke(r9, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x003e }
        L_0x003e:
            boolean r0 = r1 instanceof java.lang.Integer     // Catch:{  }
            if (r0 == 0) goto L_0x009d
            int r0 = X.Pxe.A09(r1)     // Catch:{  }
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            java.lang.String r2 = "getAdvertisingIdInfo"
            java.lang.Class[] r1 = new java.lang.Class[]{r4}     // Catch:{  }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{  }
            java.lang.reflect.Method r1 = r0.getMethod(r2, r1)     // Catch:{ Exception -> 0x009d }
            if (r1 == 0) goto L_0x009d
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{  }
            java.lang.Object r7 = r1.invoke(r9, r0)     // Catch:{  }
            if (r7 == 0) goto L_0x009d
            java.lang.Class r2 = r7.getClass()     // Catch:{  }
            java.lang.String r1 = "getId"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{  }
            java.lang.reflect.Method r9 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0070 }
        L_0x0070:
            java.lang.String r1 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{  }
            java.lang.reflect.Method r4 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0079 }
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            if (r9 == 0) goto L_0x009d
            if (r4 == 0) goto L_0x009d
            X.SFJ r0 = new X.SFJ     // Catch:{  }
            r0.<init>()     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{  }
            r1 = 0
            java.lang.Object r1 = r9.invoke(r7, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x008a }
        L_0x008a:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{  }
            r0.A01 = r1     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{  }
            r1 = 0
            java.lang.Object r1 = r4.invoke(r7, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0095 }
        L_0x0095:
            boolean r1 = X.AnonymousClass7TE.A1a(r1)     // Catch:{  }
            r0.A03 = r1     // Catch:{  }
            goto L_0x01a8
        L_0x009d:
            X.SVS r1 = new X.SVS
            r1.<init>()
            java.lang.String r0 = "com.google.android.gms.ads.identifier.service.START"
            android.content.Intent r2 = X.Pxe.A0G(r0)
            java.lang.String r0 = "com.google.android.gms"
            r2.setPackage(r0)
            r0 = 513(0x201, float:7.19E-43)
            boolean r0 = r5.bindService(r2, r1, r0)
            if (r0 == 0) goto L_0x019f
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            boolean r0 = r0.compareAndSet(r3, r3)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            if (r0 != 0) goto L_0x017c
            java.util.concurrent.BlockingQueue r0 = r1.A01     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            java.lang.Object r2 = r0.take()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r17 = 1994005342(0x76da1b5e, float:2.2118668E33)
            com.facebook.profilo.provider.constants.ExternalProvider r13 = com.facebook.profilo.provider.constants.ExternalProviders.A07     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r14 = r13.A07()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r15 = 6
            r16 = 21
            r18 = 0
            r12 = 0
            r20 = r12
            int r26 = r14.A00(r15, r16, r17, r18, r20)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r23 = 398801902(0x17c53bee, float:1.2745955E-24)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r20 = r13.A07()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r22 = 22
            r21 = r15
            r24 = r18
            r20.A00(r21, r22, r23, r24, r26)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            X.SFJ r0 = new X.SFJ     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r0.<init>()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r26 = 354002295(0x1519a577, float:3.1028633E-26)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r23 = r13.A07()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r24 = r15
            r25 = r16
            r27 = r18
            r29 = r12
            int r26 = r23.A00(r24, r25, r26, r27, r29)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            java.lang.String r4 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            r9.writeInterfaceToken(r4)     // Catch:{ all -> 0x0183 }
            r2.transact(r3, r9, r8, r12)     // Catch:{ all -> 0x0183 }
            r8.readException()     // Catch:{ all -> 0x0183 }
            java.lang.String r7 = r8.readString()     // Catch:{ all -> 0x0183 }
            r8.recycle()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r9.recycle()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r23 = -1645263356(0xffffffff9def4604, float:-6.3335168E-21)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r20 = r13.A07()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r24 = r18
            r20.A00(r21, r22, r23, r24, r26)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r0.A01 = r7     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r26 = -1586974568(0xffffffffa168b098, float:-7.8838377E-19)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r23 = r13.A07()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r24 = r15
            r25 = r16
            int r26 = r23.A00(r24, r25, r26, r27, r29)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r8.writeInterfaceToken(r4)     // Catch:{ all -> 0x0168 }
            r4 = 1
            r8.writeInt(r3)     // Catch:{ all -> 0x0168 }
            r3 = 2
            int r2 = X.Pxg.A02(r2, r8, r7, r3)     // Catch:{ all -> 0x0168 }
            if (r2 != 0) goto L_0x0153
            r4 = 0
        L_0x0153:
            r7.recycle()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r8.recycle()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r23 = -1729567861(0xffffffff98e8e38b, float:-6.0200354E-24)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r20 = r13.A07()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r24 = r18
            r20.A00(r21, r22, r23, r24, r26)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r0.A03 = r4     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            goto L_0x01a5
        L_0x0168:
            r0 = move-exception
            r7.recycle()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r8.recycle()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r23 = 1370419014(0x51aeef46, float:9.3917331E10)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r20 = r13.A07()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r24 = r18
            r20.A00(r21, r22, r23, r24, r26)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            goto L_0x0196
        L_0x017c:
            java.lang.String r0 = "Binder already consumed"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            goto L_0x0196
        L_0x0183:
            r0 = move-exception
            r8.recycle()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r9.recycle()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r23 = -1325392520(0xffffffffb1001d78, float:-1.8643203E-9)
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r20 = r13.A07()     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
            r24 = r18
            r20.A00(r21, r22, r23, r24, r26)     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
        L_0x0196:
            throw r0     // Catch:{ Exception -> 0x019c, all -> 0x0197 }
        L_0x0197:
            r0 = move-exception
            r5.unbindService(r1)
            throw r0
        L_0x019c:
            r5.unbindService(r1)
        L_0x019f:
            X.SFJ r0 = new X.SFJ
            r0.<init>()
            goto L_0x01a8
        L_0x01a5:
            r5.unbindService(r1)
        L_0x01a8:
            X.0qi r1 = X.C62000qj.A02
            boolean r1 = r1.A0Q
            if (r1 == 0) goto L_0x01bb
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x01bb
        L_0x01b2:
            long r1 = java.lang.System.currentTimeMillis()
            r0.A00 = r1
            A04 = r0
        L_0x01ba:
            return r0
        L_0x01bb:
            r15 = 0
            r4 = 0
            java.lang.String[] r14 = new java.lang.String[]{r6, r10, r11}     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            java.lang.String r1 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r3 = r2.resolveContentProvider(r1, r4)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            java.lang.String r1 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r1, r4)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            if (r3 == 0) goto L_0x01f3
            java.lang.String r1 = r3.packageName     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            boolean r1 = X.SBE.A00(r5, r1)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            if (r1 == 0) goto L_0x01f3
            java.lang.String r1 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r13 = X.0cp.A03(r1)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
        L_0x01e5:
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            if (r2 == 0) goto L_0x0206
            java.lang.String r1 = r5.getPackageName()     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            r2.getInstallerPackageName(r1)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            goto L_0x0206
        L_0x01f3:
            if (r2 == 0) goto L_0x0204
            java.lang.String r1 = r2.packageName     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            boolean r1 = X.SBE.A00(r5, r1)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            if (r1 == 0) goto L_0x0204
            java.lang.String r1 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r13 = X.0cp.A03(r1)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            goto L_0x01e5
        L_0x0204:
            r13 = r15
            goto L_0x01e5
        L_0x0206:
            if (r13 != 0) goto L_0x0209
            goto L_0x0264
        L_0x0209:
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            r1 = -1443598606(0xffffffffa9f46ef2, float:-1.0855023E-13)
            android.content.ContentProviderClient r12 = X.0fM.A00(r2, r13, r1)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            if (r12 == 0) goto L_0x0255
            r16 = r15
            r17 = r15
            android.database.Cursor r4 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            if (r4 == 0) goto L_0x0256
            boolean r1 = r4.moveToFirst()     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            if (r1 == 0) goto L_0x0256
            int r1 = r4.getColumnIndex(r6)     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            int r3 = r4.getColumnIndex(r10)     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            int r2 = r4.getColumnIndex(r11)     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            java.lang.String r1 = r4.getString(r1)     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            r0.A02 = r1     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            if (r3 <= 0) goto L_0x0250
            if (r2 <= 0) goto L_0x0250
            java.lang.String r1 = r0.A01     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            if (r1 != 0) goto L_0x0250
            java.lang.String r1 = r4.getString(r3)     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            r0.A01 = r1     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            java.lang.String r1 = r4.getString(r2)     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            r0.A03 = r1     // Catch:{ Exception -> 0x0274, all -> 0x026d }
        L_0x0250:
            r4.close()
            goto L_0x01b2
        L_0x0255:
            r4 = r15
        L_0x0256:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            r0.A00 = r1     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            A04 = r0     // Catch:{ Exception -> 0x0274, all -> 0x026d }
            if (r4 == 0) goto L_0x01ba
            r4.close()
            return r0
        L_0x0264:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            r0.A00 = r1     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            A04 = r0     // Catch:{ Exception -> 0x0279, all -> 0x027a }
            return r0
        L_0x026d:
            r0 = move-exception
            if (r4 == 0) goto L_0x027b
            r4.close()
            throw r0
        L_0x0274:
            if (r4 == 0) goto L_0x0279
            r4.close()
        L_0x0279:
            return r15
        L_0x027a:
            r0 = move-exception
        L_0x027b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SFJ.A00(android.content.Context):X.SFJ");
    }
}
