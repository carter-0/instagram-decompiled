package X;

/* renamed from: X.3hd  reason: invalid class name and case insensitive filesystem */
public final class C248233hd extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248233hd(2Lk r7) {
        super("igPermissionSnapshots", 614, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.95O, X.0iw, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4 A[Catch:{ NullPointerException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e8 A[Catch:{ NullPointerException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loggedRun() {
        /*
            r10 = this;
            X.2Lk r1 = r10.A00
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            android.content.Context r2 = r1.A01
            com.instagram.common.session.UserSession r1 = r1.A04
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.95O r9 = new X.95O
            r9.<init>()
            r9.A00 = r2
            r9.A01 = r1
            X.95P r0 = new X.95P
            r0.<init>(r1)
            r9.A02 = r0
            com.instagram.common.session.UserSession r8 = r9.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311152463970753(0x8100cd000001c1, double:3.026657259265627E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r3 = r0.booleanValue()
            X.95P r0 = r9.A02
            int r2 = r0.A00()
            int r0 = r0.A01()
            int r2 = r2 - r0
            r1 = 604800(0x93a80, float:8.47505E-40)
            r0 = 0
            if (r2 < r1) goto L_0x0047
            r0 = 1
        L_0x0047:
            if (r3 == 0) goto L_0x012b
            if (r0 == 0) goto L_0x012b
            android.content.Context r1 = r9.A00
            java.lang.String r0 = X.C10036RlY.A00
            X.95P r4 = new X.95P
            r4.<init>(r8)
            java.lang.String r5 = r1.getPackageName()
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NullPointerException -> 0x0123 }
            r0 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r6 = r1.getPackageInfo(r5, r0)     // Catch:{ NameNotFoundException -> 0x009a }
            if (r6 == 0) goto L_0x00a6
            java.util.HashMap r3 = com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher.A00     // Catch:{ NullPointerException -> 0x0123 }
            r3.clear()     // Catch:{ NullPointerException -> 0x0123 }
            int[] r0 = r6.requestedPermissionsFlags     // Catch:{ NullPointerException -> 0x0091 }
            int r1 = r0.length     // Catch:{ NullPointerException -> 0x0091 }
            java.lang.String[] r0 = r6.requestedPermissions     // Catch:{ NullPointerException -> 0x0091 }
            int r0 = r0.length     // Catch:{ NullPointerException -> 0x0091 }
            if (r1 != r0) goto L_0x00a8
            r5 = 0
        L_0x0072:
            java.lang.String[] r2 = r6.requestedPermissions     // Catch:{ NullPointerException -> 0x0091 }
            int r0 = r2.length     // Catch:{ NullPointerException -> 0x0091 }
            if (r5 >= r0) goto L_0x00a8
            int[] r0 = r6.requestedPermissionsFlags     // Catch:{ NullPointerException -> 0x0091 }
            r0 = r0[r5]     // Catch:{ NullPointerException -> 0x0091 }
            r1 = r0 & 2
            r0 = 0
            if (r1 == 0) goto L_0x0081
            r0 = 1
        L_0x0081:
            r1 = r2[r5]     // Catch:{ NullPointerException -> 0x0091 }
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "GRANTED"
        L_0x0087:
            r3.put(r1, r0)     // Catch:{ NullPointerException -> 0x0091 }
            goto L_0x008e
        L_0x008b:
            java.lang.String r0 = "DENIED"
            goto L_0x0087
        L_0x008e:
            int r5 = r5 + 1
            goto L_0x0072
        L_0x0091:
            r2 = move-exception
            java.lang.String r1 = "com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher"
            java.lang.String r0 = "Error while trying to get statuses"
            X.0KC.A0K(r1, r0, r2)     // Catch:{ NullPointerException -> 0x0123 }
            goto L_0x00a8
        L_0x009a:
            r3 = move-exception
            java.lang.String r2 = "com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch:{ NullPointerException -> 0x0123 }
            java.lang.String r0 = "Package name not found %s"
            X.0KC.A0N(r2, r0, r3, r1)     // Catch:{ NullPointerException -> 0x0123 }
        L_0x00a6:
            java.util.HashMap r3 = com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher.A00     // Catch:{ NullPointerException -> 0x0123 }
        L_0x00a8:
            com.google.common.collect.ImmutableMap r3 = com.google.common.collect.ImmutableMap.copyOf(r3)     // Catch:{ NullPointerException -> 0x0123 }
            r0 = 21
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ NullPointerException -> 0x0123 }
            X.0qQ.A0C(r3, r0)     // Catch:{ NullPointerException -> 0x0123 }
            int r0 = r4.A01()     // Catch:{ NullPointerException -> 0x0123 }
            long r1 = (long) r0     // Catch:{ NullPointerException -> 0x0123 }
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ NullPointerException -> 0x0123 }
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00cd
            int r0 = r4.A00()     // Catch:{ NullPointerException -> 0x0123 }
            long r0 = (long) r0     // Catch:{ NullPointerException -> 0x0123 }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ NullPointerException -> 0x0123 }
        L_0x00cd:
            X.0wc r2 = X.AnonymousClass0kN.A01(r9, r8)     // Catch:{ NullPointerException -> 0x0123 }
            java.lang.String r1 = "ig_privacy_permissions_snapshot"
            X.0kJ r0 = r2.A00     // Catch:{ NullPointerException -> 0x0123 }
            X.0Aj r1 = r2.A00(r0, r1)     // Catch:{ NullPointerException -> 0x0123 }
            r0 = 237(0xed, float:3.32E-43)
            X.1Ln r2 = new X.1Ln     // Catch:{ NullPointerException -> 0x0123 }
            r2.<init>(r1, r0)     // Catch:{ NullPointerException -> 0x0123 }
            X.0Aj r0 = r2.A00     // Catch:{ NullPointerException -> 0x0123 }
            boolean r0 = r0.isSampled()     // Catch:{ NullPointerException -> 0x0123 }
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "last_lookup_timestamp"
            r2.A0Q(r0, r5)     // Catch:{ NullPointerException -> 0x0123 }
            java.lang.String r1 = "permission_statuses"
            X.0Aj r0 = r2.A00     // Catch:{ NullPointerException -> 0x0123 }
            r0.A9H(r1, r3)     // Catch:{ NullPointerException -> 0x0123 }
            r2.Cgf()     // Catch:{ NullPointerException -> 0x0123 }
            int r3 = r4.A00()     // Catch:{ NullPointerException -> 0x0123 }
            r0 = 957(0x3bd, float:1.341E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ NullPointerException -> 0x0123 }
            if (r3 >= 0) goto L_0x0109
            java.lang.String r0 = "OverflowError - Saving negative timestamp values"
            X.0KC.A0E(r1, r0)     // Catch:{ ClassCastException -> 0x011c }
            r3 = 0
        L_0x0109:
            X.0xa r0 = r4.A00     // Catch:{ ClassCastException -> 0x011c }
            X.0xY r2 = r0.AR4()     // Catch:{ ClassCastException -> 0x011c }
            r0 = 3310(0xcee, float:4.638E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ ClassCastException -> 0x011c }
            r2.E5Z(r0, r3)     // Catch:{ ClassCastException -> 0x011c }
            r2.apply()     // Catch:{ ClassCastException -> 0x011c }
            return
        L_0x011c:
            r2 = move-exception
            java.lang.String r0 = "ClassCastException while saving last lookup timestamp"
            X.0KC.A0K(r1, r0, r2)     // Catch:{ NullPointerException -> 0x0123 }
            return
        L_0x0123:
            r2 = move-exception
            java.lang.String r1 = X.C10036RlY.A00
            java.lang.String r0 = "Last lookup stamp might not be available."
            X.0KC.A0G(r1, r0, r2)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C248233hd.loggedRun():void");
    }
}
