package X;

/* renamed from: X.9Cu  reason: invalid class name and case insensitive filesystem */
public final class C375239Cu {
    public final C375249Cv A00;

    public final synchronized AnonymousClass9BV A01() {
        return AnonymousClass9BV.A01((C3738097a) this.A00.A01());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = new java.security.GeneralSecurityException(X.002.A0O("key not found: ", r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A02(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
        L_0x0002:
            X.9Cv r2 = r4.A00     // Catch:{ all -> 0x0053 }
            X.972 r0 = r2.A00     // Catch:{ all -> 0x0053 }
            X.97a r0 = (X.C3738097a) r0     // Catch:{ all -> 0x0053 }
            X.978 r0 = r0.key_     // Catch:{ all -> 0x0053 }
            int r0 = r0.size()     // Catch:{ all -> 0x0053 }
            if (r3 >= r0) goto L_0x003b
            X.972 r0 = r2.A00     // Catch:{ all -> 0x0053 }
            X.97a r0 = (X.C3738097a) r0     // Catch:{ all -> 0x0053 }
            X.978 r0 = r0.key_     // Catch:{ all -> 0x0053 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x0053 }
            X.98h r1 = (X.C3741398h) r1     // Catch:{ all -> 0x0053 }
            int r0 = r1.keyId_     // Catch:{ all -> 0x0053 }
            if (r0 != r5) goto L_0x0036
            X.9Ck r1 = r1.A0F()     // Catch:{ all -> 0x0053 }
            X.9Ck r0 = X.C375139Ck.ENABLED     // Catch:{ all -> 0x0053 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0047
            r2.A03()     // Catch:{ all -> 0x0053 }
            X.972 r0 = r2.A00     // Catch:{ all -> 0x0053 }
            X.97a r0 = (X.C3738097a) r0     // Catch:{ all -> 0x0053 }
            r0.primaryKeyId_ = r5     // Catch:{ all -> 0x0053 }
            goto L_0x0039
        L_0x0036:
            int r3 = r3 + 1
            goto L_0x0002
        L_0x0039:
            monitor-exit(r4)
            return
        L_0x003b:
            java.lang.String r0 = "key not found: "
            java.lang.String r0 = X.002.A0O(r0, r5)     // Catch:{ all -> 0x0053 }
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0053 }
            r1.<init>(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0052
        L_0x0047:
            java.lang.String r0 = "cannot set key as primary because it's not enabled: "
            java.lang.String r0 = X.002.A0O(r0, r5)     // Catch:{ all -> 0x0053 }
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0053 }
            r1.<init>(r0)     // Catch:{ all -> 0x0053 }
        L_0x0052:
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375239Cu.A02(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r4 == X.AnonymousClass98D.UNKNOWN_PREFIX) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r2 = (X.C384229gy) X.C3741398h.DEFAULT_INSTANCE.A0C();
        r2.A03();
        r1 = (X.C3741398h) r2.A00;
        r6.getClass();
        r1.keyData_ = r6;
        r1.bitField0_ |= 1;
        r2.A03();
        ((X.C3741398h) r2.A00).keyId_ = r5;
        r2.A03();
        ((X.C3741398h) r2.A00).status_ = 1;
        r2.A03();
        ((X.C3741398h) r2.A00).outputPrefixType_ = r4.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.A04((X.C3741398h) r2.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1 = new java.security.GeneralSecurityException("unknown output prefix type");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(X.C374789Au r9) {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            X.983 r1 = r9.A00     // Catch:{ all -> 0x00d3 }
            boolean r0 = r1 instanceof X.AnonymousClass98L     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x000f
            X.98L r1 = (X.AnonymousClass98L) r1     // Catch:{ all -> 0x00d3 }
            X.98E r0 = r1.A00     // Catch:{ all -> 0x00d3 }
        L_0x000c:
            X.9hM r5 = r0.A00     // Catch:{ all -> 0x00d3 }
            goto L_0x0018
        L_0x000f:
            X.97o r0 = X.C3739497o.A01     // Catch:{ all -> 0x00d3 }
            X.97u r0 = r0.A03(r1)     // Catch:{ all -> 0x00d3 }
            X.98E r0 = (X.AnonymousClass98E) r0     // Catch:{ all -> 0x00d3 }
            goto L_0x000c
        L_0x0018:
            java.lang.Class<X.AGk> r4 = X.AGk.class
            monitor-enter(r4)     // Catch:{ all -> 0x00cf }
            X.98M r3 = X.AnonymousClass98M.A02     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r5.typeUrl_     // Catch:{ all -> 0x00cc }
            X.97g r2 = X.AnonymousClass98M.A00(r3, r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = r5.typeUrl_     // Catch:{ all -> 0x00cc }
            java.util.concurrent.ConcurrentMap r0 = r3.A01     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00cc }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00be
            X.97R r0 = r5.value_     // Catch:{ all -> 0x00cc }
            X.98i r6 = r2.CrA(r0)     // Catch:{ all -> 0x00cc }
            monitor-exit(r4)     // Catch:{ all -> 0x00cf }
            X.98D r4 = r5.A0F()     // Catch:{ all -> 0x00cf }
            int r5 = X.C3740397x.A00()     // Catch:{ all -> 0x00b2 }
        L_0x0042:
            X.9Cv r3 = r8.A00     // Catch:{ all -> 0x00b0 }
            X.972 r0 = r3.A00     // Catch:{ all -> 0x00b0 }
            X.97a r0 = (X.C3738097a) r0     // Catch:{ all -> 0x00b0 }
            X.978 r0 = r0.key_     // Catch:{ all -> 0x00b0 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x00b0 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x0052:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00b0 }
            X.98h r0 = (X.C3741398h) r0     // Catch:{ all -> 0x00b0 }
            int r0 = r0.keyId_     // Catch:{ all -> 0x00b0 }
            if (r0 != r5) goto L_0x0052
            int r5 = X.C3740397x.A00()     // Catch:{ all -> 0x00b2 }
            goto L_0x0042
        L_0x0067:
            X.98D r0 = X.AnonymousClass98D.UNKNOWN_PREFIX     // Catch:{ all -> 0x00bc }
            if (r4 == r0) goto L_0x00b4
            X.98h r0 = X.C3741398h.DEFAULT_INSTANCE     // Catch:{ all -> 0x00bc }
            X.9Cx r2 = r0.A0C()     // Catch:{ all -> 0x00bc }
            X.9gy r2 = (X.C384229gy) r2     // Catch:{ all -> 0x00bc }
            r2.A03()     // Catch:{ all -> 0x00bc }
            X.972 r1 = r2.A00     // Catch:{ all -> 0x00bc }
            X.98h r1 = (X.C3741398h) r1     // Catch:{ all -> 0x00bc }
            r6.getClass()     // Catch:{ all -> 0x00bc }
            r1.keyData_ = r6     // Catch:{ all -> 0x00bc }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x00bc }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ all -> 0x00bc }
            r2.A03()     // Catch:{ all -> 0x00bc }
            X.972 r0 = r2.A00     // Catch:{ all -> 0x00bc }
            X.98h r0 = (X.C3741398h) r0     // Catch:{ all -> 0x00bc }
            r0.keyId_ = r5     // Catch:{ all -> 0x00bc }
            r2.A03()     // Catch:{ all -> 0x00bc }
            X.972 r1 = r2.A00     // Catch:{ all -> 0x00bc }
            X.98h r1 = (X.C3741398h) r1     // Catch:{ all -> 0x00bc }
            r0 = 1
            r1.status_ = r0     // Catch:{ all -> 0x00bc }
            r2.A03()     // Catch:{ all -> 0x00bc }
            X.972 r1 = r2.A00     // Catch:{ all -> 0x00bc }
            X.98h r1 = (X.C3741398h) r1     // Catch:{ all -> 0x00bc }
            int r0 = r4.A01()     // Catch:{ all -> 0x00bc }
            r1.outputPrefixType_ = r0     // Catch:{ all -> 0x00bc }
            X.972 r0 = r2.A01()     // Catch:{ all -> 0x00bc }
            X.98h r0 = (X.C3741398h) r0     // Catch:{ all -> 0x00bc }
            r3.A04(r0)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r7)
            return
        L_0x00b0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            goto L_0x00bb
        L_0x00b4:
            java.lang.String r0 = "unknown output prefix type"
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x00bc }
            r1.<init>(r0)     // Catch:{ all -> 0x00bc }
        L_0x00bb:
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            goto L_0x00ce
        L_0x00be:
            java.lang.String r1 = "newKey-operation not permitted for key type "
            java.lang.String r0 = r5.typeUrl_     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x00cc }
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x00cc }
            r0.<init>(r1)     // Catch:{ all -> 0x00cc }
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00cf }
        L_0x00ce:
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375239Cu.A03(X.9Au):void");
    }

    public static C375239Cu A00(AnonymousClass9BV r4) {
        C3738097a r42 = r4.A01;
        C375269Cx r3 = (C375269Cx) r42.A0E(AnonymousClass05K.A0Y, (Object) null, (Object) null);
        if (!r3.A01.equals(r42)) {
            r3.A03();
            AnonymousClass972 r2 = r3.A00;
            AnonymousClass9BZ.A02.A00(r2.getClass()).Co5(r2, r42);
        }
        return new C375239Cu((C375249Cv) r3);
    }

    public C375239Cu(C375249Cv r1) {
        this.A00 = r1;
    }
}
