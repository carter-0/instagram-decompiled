package X;

import com.instagram.reels.store.ReelStore;

/* renamed from: X.3Nq  reason: invalid class name and case insensitive filesystem */
public final class C241043Nq implements C241053Nr {
    public final ReelStore A00;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r0 == null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2Q9 AvE() {
        /*
            r4 = this;
            com.instagram.reels.store.ReelStore r2 = r4.A00
            com.instagram.model.reels.Reel r1 = r2.A01
            r3 = 0
            if (r1 == 0) goto L_0x0026
            boolean r0 = r1.A0k()
            if (r0 == 0) goto L_0x0026
            r3 = 1
            X.3HX r1 = r1.A0N
            if (r1 == 0) goto L_0x005c
            java.util.List r0 = r1.A1j
            if (r0 != 0) goto L_0x0018
            X.0sn r0 = X.0sn.A00
        L_0x0018:
            X.9IZ r2 = new X.9IZ
            r2.<init>((X.AnonymousClass3HX) r1, (java.util.List) r0, (boolean) r3)
        L_0x001d:
            X.3Ns r0 = new X.3Ns
            r0.<init>()
            r0.A0K(r2)
            return r0
        L_0x0026:
            monitor-enter(r2)
            X.1Np r0 = r2.A03     // Catch:{ all -> 0x006c }
            java.util.ArrayList r0 = r0.A00()     // Catch:{ all -> 0x006c }
            monitor-exit(r2)
            java.util.Iterator r1 = r0.iterator()
        L_0x0032:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A0k()
            if (r0 == 0) goto L_0x0032
        L_0x0045:
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            r1 = 0
            if (r2 == 0) goto L_0x0052
            X.3HX r3 = r2.A0N
            if (r3 == 0) goto L_0x0064
            java.util.List r0 = r3.A1j
            if (r0 != 0) goto L_0x0054
        L_0x0052:
            X.0sn r0 = X.0sn.A00
        L_0x0054:
            X.9IZ r2 = new X.9IZ
            r2.<init>((X.AnonymousClass3HX) r3, (java.util.List) r0, (boolean) r1)
            goto L_0x001d
        L_0x005a:
            r2 = r3
            goto L_0x0045
        L_0x005c:
            java.lang.String r1 = "Recent response item captured for this Reel is null."
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0064:
            java.lang.String r1 = "Recent response item captured for this Reel is null."
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x006c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241043Nq.AvE():X.2Q9");
    }

    public C241043Nq(ReelStore reelStore) {
        this.A00 = reelStore;
    }
}
