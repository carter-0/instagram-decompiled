package X;

/* renamed from: X.9LQ  reason: invalid class name */
public final class AnonymousClass9LQ extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LQ(Object obj, int i) {
        super(4);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010e, code lost:
        r4 = new X.C58699Iw8(r5, r9, r0, r13, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0133, code lost:
        r4 = new X.C20704Wxb(r1, r0, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01cf, code lost:
        r3.A06(r2, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r14 = this;
            r10 = r18
            r13 = r17
            r9 = r16
            r0 = r15
            int r1 = r14.A00
            switch(r1) {
                case 0: goto L_0x030a;
                case 1: goto L_0x02da;
                case 2: goto L_0x02bf;
                case 3: goto L_0x01ed;
                case 4: goto L_0x01d4;
                case 5: goto L_0x019f;
                case 6: goto L_0x013a;
                case 7: goto L_0x0119;
                case 8: goto L_0x00ef;
                case 9: goto L_0x00cf;
                case 10: goto L_0x00b4;
                case 11: goto L_0x0098;
                default: goto L_0x000c;
            }
        L_0x000c:
            X.4bN r0 = (X.C267324bN) r0
            java.lang.Number r9 = (java.lang.Number) r9
            int r7 = r9.intValue()
            java.lang.Number r13 = (java.lang.Number) r13
            int r6 = r13.intValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r5 = r10.booleanValue()
            java.lang.Object r4 = r14.A01
            X.2is r4 = (X.C227232is) r4
            X.GBE r3 = r4.A09
            if (r3 != 0) goto L_0x0032
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0032:
            int r6 = r6 - r7
            if (r0 == 0) goto L_0x0096
            X.5o2 r2 = r0.A01
        L_0x0037:
            X.5o2 r1 = X.C295365o2.GHOST
            if (r2 != r1) goto L_0x003d
            int r6 = r6 + -1
        L_0x003d:
            int r2 = r3.A0C()
            com.instagram.clips.intf.ClipsViewerConfig r1 = r3.A0Y
            boolean r1 = r1.A1Z
            if (r1 == 0) goto L_0x008d
            if (r5 == 0) goto L_0x008d
            r1 = 1
            if (r7 != r1) goto L_0x004f
            X.GBE.A04(r3)
        L_0x004f:
            X.0eM r1 = r4.A13
            java.lang.Object r2 = r1.getValue()
            X.GDl r2 = (X.C52065GDl) r2
            boolean r1 = r2.A08
            if (r1 == 0) goto L_0x0333
            r1 = 1
            if (r0 == 0) goto L_0x0333
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0333
            boolean r0 = r0.A5z()
            if (r0 != r1) goto L_0x0333
            X.JUB r5 = r2.A01
            X.05G r0 = r5.A02
            java.lang.Object r4 = r0.getValue()
            boolean r0 = r4 instanceof X.KJY
            r3 = 0
            if (r0 == 0) goto L_0x0333
            X.KJY r4 = (X.KJY) r4
            if (r4 == 0) goto L_0x0333
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0333
            X.4Cq r2 = r5.A01
            r0 = 9
            X.MGa r1 = new X.MGa
            r1.<init>(r4, r5, r3, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r2)
            goto L_0x0333
        L_0x008d:
            if (r6 > r2) goto L_0x004f
            r2 = 0
            X.0sn r1 = X.0sn.A00
            X.GBE.A05(r3, r1, r2, r2)
            goto L_0x004f
        L_0x0096:
            r2 = 0
            goto L_0x0037
        L_0x0098:
            X.3uh r0 = (X.C255773uh) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            java.lang.Object r1 = r14.A01
            X.6Ut r1 = (X.C308566Ut) r1
            X.6V3 r3 = r1.A07
            r1 = 0
            X.0qQ.A0B(r3, r1)
            X.LOb r2 = r0.A0E
            r2.getClass()
            r1 = 5
            goto L_0x0133
        L_0x00b4:
            X.3uh r0 = (X.C255773uh) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            java.lang.Object r1 = r14.A01
            X.6Ut r1 = (X.C308566Ut) r1
            X.6V2 r3 = r1.A06
            r1 = 0
            X.0qQ.A0B(r3, r1)
            X.LOb r2 = r0.A0E
            r2.getClass()
            r1 = 4
            goto L_0x0133
        L_0x00cf:
            X.3uh r0 = (X.C255773uh) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            r1 = 2
            X.0qQ.A0B(r13, r1)
            java.lang.Object r1 = r14.A01
            X.6Ut r1 = (X.C308566Ut) r1
            X.6V5 r3 = r1.A05
            r1 = 0
            X.0qQ.A0B(r3, r1)
            X.LOb r2 = r0.A0E
            r2.getClass()
            r5 = 16
            goto L_0x010e
        L_0x00ef:
            X.3uh r0 = (X.C255773uh) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            r1 = 2
            X.0qQ.A0B(r13, r1)
            java.lang.Object r1 = r14.A01
            X.6Ut r1 = (X.C308566Ut) r1
            X.6V1 r3 = r1.A04
            r1 = 0
            X.0qQ.A0B(r3, r1)
            X.LOb r2 = r0.A0E
            r2.getClass()
            r5 = 15
        L_0x010e:
            X.Iw8 r4 = new X.Iw8
            r6 = r9
            r7 = r0
            r8 = r13
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x01cf
        L_0x0119:
            X.3uh r0 = (X.C255773uh) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            java.lang.Object r1 = r14.A01
            X.6Ut r1 = (X.C308566Ut) r1
            X.6Uu r3 = r1.A03
            r1 = 0
            X.0qQ.A0B(r3, r1)
            X.LOb r2 = r0.A0E
            r2.getClass()
            r1 = 3
        L_0x0133:
            X.Wxb r4 = new X.Wxb
            r4.<init>(r1, r0, r3, r9)
            goto L_0x01cf
        L_0x013a:
            X.3uh r0 = (X.C255773uh) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            r1 = 2
            X.0qQ.A0B(r13, r1)
            r1 = 3
            X.0qQ.A0B(r10, r1)
            java.lang.Object r1 = r14.A01
            X.6Ut r1 = (X.C308566Ut) r1
            X.6V6 r7 = r1.A01
            r1 = 0
            X.0qQ.A0B(r7, r1)
            X.LOb r2 = r0.A0E
            r2.getClass()
            X.L4p r1 = r2.A03
            java.util.List r8 = r1.A01
            r7.A05()
            android.view.ViewGroup r1 = r7.A04()
            android.content.Context r12 = r1.getContext()
            android.view.ViewGroup r11 = r7.A04()
            boolean r1 = r11.isLaidOut()
            if (r1 == 0) goto L_0x0191
            boolean r1 = r11.isLayoutRequested()
            if (r1 != 0) goto L_0x0191
            r6 = 5
            X.IwA r5 = new X.IwA
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r7.A06(r2, r5)
        L_0x0183:
            android.view.ViewGroup r2 = r7.A04()
            X.M7x r1 = new X.M7x
            r1.<init>(r0, r7)
            r2.post(r1)
            goto L_0x0333
        L_0x0191:
            r3 = 1
            X.AOo r2 = new X.AOo
            r4 = r9
            r5 = r12
            r6 = r0
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.addOnLayoutChangeListener(r2)
            goto L_0x0183
        L_0x019f:
            X.3uh r0 = (X.C255773uh) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            r1 = 2
            X.0qQ.A0B(r13, r1)
            java.lang.Object r1 = r14.A01
            X.6Ut r1 = (X.C308566Ut) r1
            X.6V4 r3 = r1.A02
            r1 = 0
            X.0qQ.A0B(r3, r1)
            android.view.ViewGroup r1 = r3.A04()
            android.content.Context r7 = r1.getContext()
            X.LOb r2 = r0.A0E
            r2.getClass()
            r5 = 30
            X.IoM r4 = new X.IoM
            r6 = r9
            r8 = r13
            r9 = r0
            r10 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x01cf:
            r3.A06(r2, r4)
            goto L_0x0333
        L_0x01d4:
            X.7Rj r0 = (X.C331537Rj) r0
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r2 = r9.booleanValue()
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r13 = (com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments) r13
            X.Nm9 r10 = (X.C69465Nm9) r10
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r14.A01
            X.7VX r1 = (X.AnonymousClass7VX) r1
            r1.A01(r10, r0, r13, r2)
            goto L_0x0333
        L_0x01ed:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r5 = 0
            X.0qQ.A0B(r15, r5)
            java.lang.Object r8 = r14.A01     // Catch:{ InterruptedException -> 0x02b6 }
            X.5fi r8 = (X.C290675fi) r8     // Catch:{ InterruptedException -> 0x02b6 }
            X.5fg r7 = r8.A02     // Catch:{ InterruptedException -> 0x02b6 }
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r7.A00     // Catch:{ InterruptedException -> 0x02b6 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r4.writeLock()     // Catch:{ InterruptedException -> 0x02b6 }
            r1 = 1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x02b6 }
            boolean r1 = r6.tryLock(r1, r3)     // Catch:{ InterruptedException -> 0x02b6 }
            if (r1 == 0) goto L_0x02ae
            r7.A00()     // Catch:{ all -> 0x02a5 }
            java.util.Map r1 = r8.A09     // Catch:{ all -> 0x02a5 }
            java.lang.Object r3 = r1.get(r15)     // Catch:{ all -> 0x02a5 }
            X.5gD r3 = (X.C290915gD) r3     // Catch:{ all -> 0x02a5 }
            r7.A00()     // Catch:{ all -> 0x02a5 }
            java.util.Map r1 = r8.A0A     // Catch:{ all -> 0x02a5 }
            java.lang.Object r2 = r1.get(r15)     // Catch:{ all -> 0x02a5 }
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2     // Catch:{ all -> 0x02a5 }
            if (r2 != 0) goto L_0x022e
            if (r3 != 0) goto L_0x022e
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.writeLock()     // Catch:{ InterruptedException -> 0x02b6 }
            r0.unlock()     // Catch:{ InterruptedException -> 0x02b6 }
            goto L_0x0333
        L_0x022e:
            java.lang.String r6 = "Required value was null."
            if (r2 == 0) goto L_0x0250
            if (r9 == 0) goto L_0x0296
            X.4Cl r1 = r2.A03     // Catch:{ all -> 0x02a5 }
            r1.EY6(r9)     // Catch:{ all -> 0x02a5 }
            if (r13 == 0) goto L_0x024a
            X.4Cl r1 = r2.A03     // Catch:{ all -> 0x02a5 }
            r1.EU2(r13)     // Catch:{ all -> 0x02a5 }
            X.4Cl r2 = r2.A03     // Catch:{ all -> 0x02a5 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x02a5 }
            r2.EU3(r1)     // Catch:{ all -> 0x02a5 }
            goto L_0x0250
        L_0x024a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02a5 }
            r0.<init>(r6)     // Catch:{ all -> 0x02a5 }
            goto L_0x029b
        L_0x0250:
            if (r3 == 0) goto L_0x029c
            java.util.List r1 = r3.A0B     // Catch:{ all -> 0x02a5 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x02a5 }
        L_0x0258:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x02a5 }
            if (r1 == 0) goto L_0x026f
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x02a5 }
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2     // Catch:{ all -> 0x02a5 }
            java.lang.String r1 = r2.getId()     // Catch:{ all -> 0x02a5 }
            boolean r1 = r1.equals(r15)     // Catch:{ all -> 0x02a5 }
            if (r1 == 0) goto L_0x0258
            goto L_0x0270
        L_0x026f:
            r2 = 0
        L_0x0270:
            if (r2 == 0) goto L_0x029c
            if (r9 == 0) goto L_0x0290
            X.4Cl r0 = r2.A03     // Catch:{ all -> 0x02a5 }
            r0.EY6(r9)     // Catch:{ all -> 0x02a5 }
            if (r13 == 0) goto L_0x028a
            X.4Cl r0 = r2.A03     // Catch:{ all -> 0x02a5 }
            r0.EU2(r13)     // Catch:{ all -> 0x02a5 }
            X.4Cl r1 = r2.A03     // Catch:{ all -> 0x02a5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x02a5 }
            r1.EU3(r0)     // Catch:{ all -> 0x02a5 }
            goto L_0x029c
        L_0x028a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02a5 }
            r0.<init>(r6)     // Catch:{ all -> 0x02a5 }
            goto L_0x029b
        L_0x0290:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02a5 }
            r0.<init>(r6)     // Catch:{ all -> 0x02a5 }
            goto L_0x029b
        L_0x0296:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02a5 }
            r0.<init>(r6)     // Catch:{ all -> 0x02a5 }
        L_0x029b:
            throw r0     // Catch:{ all -> 0x02a5 }
        L_0x029c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.writeLock()     // Catch:{ InterruptedException -> 0x02b6 }
            r0.unlock()     // Catch:{ InterruptedException -> 0x02b6 }
            goto L_0x0333
        L_0x02a5:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.writeLock()     // Catch:{ InterruptedException -> 0x02b6 }
            r0.unlock()     // Catch:{ InterruptedException -> 0x02b6 }
            goto L_0x02b5
        L_0x02ae:
            java.lang.String r0 = "Failed to claim lock after 1 seconds"
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x02b6 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x02b6 }
        L_0x02b5:
            throw r1     // Catch:{ InterruptedException -> 0x02b6 }
        L_0x02b6:
            r2 = move-exception
            java.lang.String r1 = "BanyanCache"
            java.lang.String r0 = "Unable to update cutover status for this user."
            X.0KC.A0F(r1, r0, r2)
            goto L_0x0333
        L_0x02bf:
            android.database.sqlite.SQLiteCursorDriver r9 = (android.database.sqlite.SQLiteCursorDriver) r9
            java.lang.String r13 = (java.lang.String) r13
            android.database.sqlite.SQLiteQuery r10 = (android.database.sqlite.SQLiteQuery) r10
            java.lang.Object r1 = r14.A01
            X.1WA r1 = (X.AnonymousClass1WA) r1
            X.0qQ.A0A(r10)
            X.1WD r0 = new X.1WD
            r0.<init>(r10)
            r1.ADk(r0)
            android.database.sqlite.SQLiteCursor r1 = new android.database.sqlite.SQLiteCursor
            r1.<init>(r9, r13, r10)
            return r1
        L_0x02da:
            X.4dQ r0 = (X.C268454dQ) r0
            X.5ZD r9 = (X.AnonymousClass5ZD) r9
            X.5hl r13 = (X.C291715hl) r13
            int r5 = r13.A00
            X.5hm r10 = (X.C291725hm) r10
            int r2 = r10.A00
            java.lang.Object r3 = r14.A01
            X.5hx r3 = (X.C291835hx) r3
            X.5Uu r1 = r3.A04
            X.4gU r2 = r1.EIX(r0, r9, r5, r2)
            boolean r0 = r2 instanceof X.C270294gV
            if (r0 != 0) goto L_0x0305
            X.A8n r1 = r3.A00
            X.A8n r0 = new X.A8n
            r0.<init>(r2, r1)
            r3.A00 = r0
            java.lang.Object r1 = r0.A00
        L_0x02ff:
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.Typeface"
            X.0qQ.A0C(r1, r0)
            return r1
        L_0x0305:
            java.lang.Object r1 = r2.getValue()
            goto L_0x02ff
        L_0x030a:
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            X.5Wy r13 = (X.C286575Wy) r13
            java.lang.Number r10 = (java.lang.Number) r10
            int r3 = r10.intValue()
            r1 = r3 & 6
            if (r1 != 0) goto L_0x0324
            boolean r2 = r13.AGu(r15)
            r1 = 2
            if (r2 == 0) goto L_0x0323
            r1 = 4
        L_0x0323:
            r3 = r3 | r1
        L_0x0324:
            r2 = r3 & 131(0x83, float:1.84E-43)
            r1 = 130(0x82, float:1.82E-43)
            if (r2 != r1) goto L_0x0336
            boolean r1 = r13.Bwn()
            if (r1 == 0) goto L_0x0336
            r13.Evl()
        L_0x0333:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0336:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0344
            r2 = 1936675074(0x736f5102, float:1.8960602E31)
            java.lang.String r1 = "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)"
            X.0fL.A01(r2, r1)
        L_0x0344:
            java.lang.Object r2 = r14.A01
            X.0sK r2 = (X.0sK) r2
            r1 = r3 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.invoke(r15, r13, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0333
            r0 = 1404572560(0x53b81390, float:1.58120437E12)
            X.0fL.A00(r0)
            goto L_0x0333
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9LQ.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
