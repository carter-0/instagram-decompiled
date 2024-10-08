package X;

/* renamed from: X.PmS  reason: case insensitive filesystem */
public final class C73948PmS extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73948PmS(Object obj, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (X.OOd.A01(r1, r5) != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        if (r4 == false) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x004b;
                case 2: goto L_0x010d;
                case 3: goto L_0x0021;
                case 4: goto L_0x015c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r4 = X.AnonymousClass7TE.A1a(r9)
            boolean r1 = r8.A03
            java.lang.Object r0 = r8.A01
            X.HIq r0 = (X.C54555HIq) r0
            if (r1 == 0) goto L_0x003d
            com.meta.foa.session.FoaUserSession r4 = r0.A01
            X.GgN r2 = X.C54555HIq.A00(r0)
            X.I1s r1 = r0.A04
            boolean r0 = r0.A0D
            X.Gvy r3 = new X.Gvy
            r3.<init>(r4, r1, r2, r0)
        L_0x0020:
            return r3
        L_0x0021:
            android.content.Context r9 = (android.content.Context) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            android.text.SpannableStringBuilder r3 = X.C51965G9l.A0E()
            java.lang.String r2 = r8.A02
            boolean r1 = r8.A03
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            if (r2 == 0) goto L_0x0020
            android.text.SpannableStringBuilder r0 = X.C324476zN.A02(r9, r0, r2, r1)
            r3.append(r0)
            return r3
        L_0x003d:
            com.meta.foa.session.FoaUserSession r2 = r0.A01
            X.GgN r1 = X.C54555HIq.A00(r0)
            java.lang.String r0 = r8.A02
            X.Gta r3 = new X.Gta
            r3.<init>(r2, r1, r0, r4)
            return r3
        L_0x004b:
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x0108
            boolean r1 = r8.A03
            boolean r0 = X.OOd.A01(r9, r0)
            r6 = 0
            if (r0 != 0) goto L_0x00b7
            if (r1 == 0) goto L_0x00b6
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0065:
            X.5gD r9 = (X.C290915gD) r9
            r7 = 0
            X.0qQ.A0B(r9, r7)
            java.lang.String r5 = r8.A02
            if (r5 == 0) goto L_0x0103
            boolean r4 = r8.A03
            java.lang.String r0 = r9.A0A
            if (r0 == 0) goto L_0x00fe
            boolean r0 = X.0mp.A0H(r0, r5)
            r6 = 0
            if (r0 != 0) goto L_0x00b7
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = r9.A05
            r2 = 1
            if (r0 != 0) goto L_0x00b6
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r1 = r9.A03
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x00be
            X.0qQ.A0A(r1)
            java.lang.String r3 = r1.A03
            X.0qQ.A0A(r3)
            X.0qQ.A0B(r3, r7)
            java.util.List r0 = r9.A0B
            java.util.Iterator r2 = r0.iterator()
        L_0x009a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bc
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            java.lang.String r0 = r1.getId()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x009a
        L_0x00ae:
            if (r1 == 0) goto L_0x00b6
            boolean r0 = X.OOd.A01(r1, r5)
            if (r0 != 0) goto L_0x00b7
        L_0x00b6:
            r6 = 1
        L_0x00b7:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            return r3
        L_0x00bc:
            r1 = 0
            goto L_0x00ae
        L_0x00be:
            java.util.List r0 = r9.A0B
            java.util.List r0 = X.C51966G9m.A1J(r0)
            int r0 = r0.size()
            boolean r3 = X.C51970G9q.A1W(r0, r2)
            java.util.List r0 = r9.A0B
            java.util.List r1 = X.C51966G9m.A1J(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00dd
            goto L_0x00b6
        L_0x00dd:
            java.util.Iterator r2 = r1.iterator()
        L_0x00e1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b6
            com.instagram.user.model.User r0 = X.DbT.A0k(r2)
            if (r3 != 0) goto L_0x00f0
            r1 = 1
            if (r4 != 0) goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            boolean r0 = X.OOd.A01(r0, r5)
            if (r0 != 0) goto L_0x00b7
            if (r1 == 0) goto L_0x00e1
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0108:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x010d:
            X.Nnw r9 = (X.C69552Nnw) r9
            r6 = 0
            X.0qQ.A0B(r9, r6)
            boolean r0 = r9 instanceof X.N0I
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r8.A01
            X.OO6 r0 = (X.OO6) r0
            X.N0I r9 = (X.N0I) r9
            java.lang.Object r5 = r9.A00
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = r8.A02
            boolean r1 = r8.A03
            X.63j r0 = r0.A01
            X.Nmp r3 = X.C69507Nmp.A02
            X.N56 r2 = new X.N56
            r2.<init>(r4)
            X.0qQ.A0B(r5, r6)
            if (r1 == 0) goto L_0x013b
            X.63i r1 = r0.A00
            r0 = 1
            X.ObS r1 = X.C3024463i.A00(r2, r3, r1, r5, r0)
            goto L_0x0141
        L_0x013b:
            X.63i r0 = r0.A00
            X.ObS r1 = X.C3024463i.A00(r2, r3, r0, r5, r6)
        L_0x0141:
            java.util.concurrent.CountDownLatch r0 = r1.A01     // Catch:{ InterruptedException -> 0x0146 }
            r0.await()     // Catch:{ InterruptedException -> 0x0146 }
        L_0x0146:
            java.lang.Object r3 = r1.A00
            X.0qQ.A0A(r3)
            return r3
        L_0x014c:
            boolean r0 = r9 instanceof X.N0J
            if (r0 == 0) goto L_0x015a
            X.N0J r9 = (X.N0J) r9
            java.lang.Exception r0 = r9.A00
        L_0x0154:
            X.NEG r3 = new X.NEG
            r3.<init>(r0)
            return r3
        L_0x015a:
            r0 = 0
            goto L_0x0154
        L_0x015c:
            android.content.Context r9 = (android.content.Context) r9
            java.lang.String r2 = r8.A02
            boolean r1 = r8.A03
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            android.text.SpannableStringBuilder r3 = X.C324476zN.A02(r9, r0, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73948PmS.invoke(java.lang.Object):java.lang.Object");
    }
}
