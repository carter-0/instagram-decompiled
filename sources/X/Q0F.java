package X;

public final class Q0F {
    public static final Q0F A00 = new Object();

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|(1:12)|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(com.instagram.common.session.UserSession r11, java.lang.String r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r7 = 2
            java.io.File r1 = new java.io.File     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0035 }
            r1.<init>(r12)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0035 }
            boolean r0 = r1.exists()     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0035 }
            if (r0 == 0) goto L_0x0035
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0035 }
            r9.<init>(r1)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0035 }
            byte[] r8 = X.Q0K.A00     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0032 }
            r6 = 4
            byte[] r5 = new byte[r6]     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0032 }
            r1 = 4
            long r3 = r9.skip(r1)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0032 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
            int r0 = r9.read(r5)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0032 }
            if (r0 != r6) goto L_0x0032
            boolean r0 = java.util.Arrays.equals(r8, r5)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0032 }
            if (r0 == 0) goto L_0x0032
            r1 = 0
            return r1
        L_0x0032:
            r9.close()     // Catch:{  }
        L_0x0035:
            X.9Ql r6 = X.C378599Ql.A01
            monitor-enter(r6)
            android.util.LruCache r4 = X.C378599Ql.A00     // Catch:{ all -> 0x008a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r4.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008a }
            monitor-exit(r6)
            if (r0 == 0) goto L_0x004c
            boolean r1 = r0.booleanValue()
            return r1
        L_0x004c:
            r5 = 0
            java.io.File r0 = new java.io.File     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            r0.<init>(r12)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            org.xmlpull.v1.XmlPullParser r2 = X.Q0K.A00(r11, r0)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            if (r2 != 0) goto L_0x0059
            goto L_0x007a
        L_0x0059:
            int r1 = r2.next()     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            r0 = 1
            if (r1 == r0) goto L_0x007a
            int r0 = r2.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            if (r0 != r7) goto L_0x0059
            java.lang.String r1 = "Description"
            java.lang.String r0 = r2.getName()     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
            if (r0 == 0) goto L_0x0059
            java.lang.String r1 = "http://ns.google.com/photos/1.0/camera/"
            java.lang.String r0 = "MotionPhoto"
            java.lang.String r5 = r2.getAttributeValue(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x007a }
        L_0x007a:
            java.lang.String r0 = "1"
            boolean r1 = r0.equals(r5)
            monitor-enter(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x008a }
            r4.put(r3, r0)     // Catch:{ all -> 0x008a }
            monitor-exit(r6)
            return r1
        L_0x008a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0F.A00(com.instagram.common.session.UserSession, java.lang.String, int):boolean");
    }
}
