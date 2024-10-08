package X;

/* renamed from: X.48q  reason: invalid class name and case insensitive filesystem */
public enum C2611948q {
    ALL("all"),
    UNREAD("unread"),
    FLAGGED("flagged"),
    RELEVANT("relevant"),
    NO_INTEROP("no_interop"),
    NO_EMPTY("no_empty"),
    CLOSE_FRIENDS("close_friends"),
    NO_CLOSE_FRIENDS("no_close_friends"),
    VERIFIED_ACCOUNTS("verified_accounts"),
    SUBSCRIBERS("subscribers"),
    CREATORS("creators"),
    BUSINESSES("businesses"),
    UNANSWERED("unanswered"),
    BOOKED("booked"),
    ORDERED("ordered"),
    PAID("paid"),
    SHIPPED("shipped"),
    LEAD("lead"),
    FRIENDS("Friends"),
    PEOPLE_YOU_FOLLOW("following"),
    IMPORTANT("important"),
    FOLLOW_UP("follow_up"),
    CREATOR_AI("creator_ai"),
    FOLLOWERS("followers"),
    GROUPS("groups");
    
    public final String A00;

    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (((java.lang.Boolean) r11.A05.getValue()).booleanValue() == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r1 = r11.A03.readLock();
        r1.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r11.A01.A28.isEmpty() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r11.CQ2() != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r1 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r1.A28.isEmpty() == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r11.CQ2() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        return X.0qQ.A0K(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        if (r11.Cdv(r10) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
        if (r11.C6M() == 1) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f3, code lost:
        if (X.0qQ.A0K(r10.A06, r0.BsI()) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010a, code lost:
        if ((java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.MILLISECONDS.convert(r11.BKd(), java.util.concurrent.TimeUnit.MICROSECONDS)) < X.AnonymousClass48N.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010c, code lost:
        r0 = X.2El.A05(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012f, code lost:
        r0 = X.C271314ie.A01(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0133, code lost:
        if (r0 == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0135, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x013f, code lost:
        return X.C271314ie.A01(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r11.CVr() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014e, code lost:
        if (r2 != false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0150, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        r11 = (X.AnonymousClass3U9) r11;
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(com.instagram.common.session.UserSession r10, X.AnonymousClass2Ep r11) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r5 = 1
            long r3 = r11.BKd()
            r8 = 1
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x015f
            int r0 = r9.ordinal()
            switch(r0) {
                case 0: goto L_0x0160;
                case 1: goto L_0x00c0;
                case 2: goto L_0x00c7;
                case 3: goto L_0x0160;
                case 4: goto L_0x002d;
                case 5: goto L_0x0033;
                case 6: goto L_0x0082;
                case 7: goto L_0x001d;
                case 8: goto L_0x0089;
                case 9: goto L_0x00ce;
                case 10: goto L_0x00d3;
                case 11: goto L_0x00d8;
                case 12: goto L_0x00dd;
                case 13: goto L_0x0111;
                case 14: goto L_0x0114;
                case 15: goto L_0x011f;
                case 16: goto L_0x0122;
                case 17: goto L_0x0125;
                case 18: goto L_0x014a;
                case 19: goto L_0x0151;
                case 20: goto L_0x0136;
                case 21: goto L_0x0139;
                case 22: goto L_0x0140;
                case 23: goto L_0x0098;
                case 24: goto L_0x0145;
                default: goto L_0x0017;
            }
        L_0x0017:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x001d:
            X.3U9 r11 = (X.AnonymousClass3U9) r11
            X.3S9 r0 = r11.A01
            java.lang.Boolean r1 = r0.A1W
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r2 = X.0qQ.A0K(r1, r0)
            goto L_0x014e
        L_0x002d:
            boolean r0 = r11.CVr()
            if (r0 != 0) goto L_0x015f
        L_0x0033:
            X.3U9 r11 = (X.AnonymousClass3U9) r11
            X.0eM r0 = r11.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L_0x0069
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r11.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            X.3S9 r0 = r11.A01     // Catch:{ all -> 0x0064 }
            java.util.List r0 = r0.A28     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x005e
            boolean r0 = r11.CQ2()     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            r1.unlock()
            goto L_0x014e
        L_0x0064:
            r0 = move-exception
            r1.unlock()
            throw r0
        L_0x0069:
            X.3S9 r1 = r11.A01
            monitor-enter(r1)
            java.util.List r0 = r1.A28     // Catch:{ all -> 0x007f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007b
            boolean r0 = r11.CQ2()     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            monitor-exit(r1)
            goto L_0x014e
        L_0x007f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0082:
            X.3U9 r11 = (X.AnonymousClass3U9) r11
            X.3S9 r0 = r11.A01
            java.lang.Boolean r1 = r0.A1W
            goto L_0x008f
        L_0x0089:
            X.3U9 r11 = (X.AnonymousClass3U9) r11
            X.3S9 r0 = r11.A01
            java.lang.Boolean r1 = r0.A1b
        L_0x008f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r8 = X.0qQ.A0K(r1, r0)
            return r8
        L_0x0098:
            java.util.List r1 = r11.BRZ()
            boolean r0 = r1 instanceof java.util.Collection
            r8 = 0
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00a8
            return r8
        L_0x00a8:
            java.util.Iterator r1 = r1.iterator()
        L_0x00ac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.A2A()
            if (r0 == 0) goto L_0x00ac
            r8 = 1
            return r8
        L_0x00c0:
            boolean r0 = r11.Cdv(r10)
            if (r0 == 0) goto L_0x015f
            goto L_0x00f5
        L_0x00c7:
            int r0 = r11.C6M()
            if (r0 != r5) goto L_0x015f
            goto L_0x00f5
        L_0x00ce:
            boolean r8 = r11.CTB()
            return r8
        L_0x00d3:
            boolean r8 = r11.CQs()
            return r8
        L_0x00d8:
            boolean r8 = r11.CPn()
            return r8
        L_0x00dd:
            boolean r0 = r11.Cdv(r10)
            if (r0 != 0) goto L_0x015f
            X.3su r0 = r11.BKv()
            if (r0 == 0) goto L_0x015f
            java.lang.String r1 = r10.A06
            java.lang.String r0 = r0.BsI()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x015f
        L_0x00f5:
            long r6 = X.AnonymousClass48N.A00
            long r4 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r11.BKd()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r3.convert(r1, r0)
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0160
            boolean r0 = X.2El.A05(r10)
            goto L_0x0133
        L_0x0111:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x013b
        L_0x0114:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            boolean r0 = X.C271314ie.A01(r11, r0)
            if (r0 != 0) goto L_0x0160
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            goto L_0x012f
        L_0x011f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x013b
        L_0x0122:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            goto L_0x013b
        L_0x0125:
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            boolean r0 = X.C271314ie.A01(r11, r0)
            if (r0 != 0) goto L_0x0160
            java.lang.Integer r0 = X.AnonymousClass05K.A06
        L_0x012f:
            boolean r0 = X.C271314ie.A01(r11, r0)
        L_0x0133:
            if (r0 == 0) goto L_0x015f
            return r8
        L_0x0136:
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            goto L_0x013b
        L_0x0139:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
        L_0x013b:
            boolean r8 = X.C271314ie.A01(r11, r0)
            return r8
        L_0x0140:
            boolean r8 = r11.CL4()
            return r8
        L_0x0145:
            boolean r8 = r11.CUG()
            return r8
        L_0x014a:
            boolean r2 = r11.Ca9()
        L_0x014e:
            if (r2 != 0) goto L_0x015f
            return r8
        L_0x0151:
            java.util.List r1 = r11.BRZ()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0161
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0161
        L_0x015f:
            r8 = 0
        L_0x0160:
            return r8
        L_0x0161:
            java.util.Iterator r2 = r1.iterator()
        L_0x0165:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r2.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.user.model.FollowStatus r1 = r0.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r1 != r0) goto L_0x0165
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2611948q.A00(com.instagram.common.session.UserSession, X.2Ep):boolean");
    }

    /* access modifiers changed from: public */
    static {
        C2611948q[] r0;
        A01 = 0oU.A00(r0);
    }

    /* access modifiers changed from: public */
    C2611948q(String str) {
        this.A00 = str;
    }
}
