package X;

import java.util.concurrent.Callable;

/* renamed from: X.TNf  reason: case insensitive filesystem */
public final class C13147TNf implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C13147TNf(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.Tgv} */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.RQJ] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r9 = this;
            int r0 = r9.A00
            java.lang.Object r3 = r9.A03
            if (r0 == 0) goto L_0x0014
            X.Tia r3 = (X.C13855Tia) r3
            int r0 = r9.A01
            r3.AIw(r0)
            r3.start()
            r3.FNL()
        L_0x0013:
            return r3
        L_0x0014:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r3 = (com.facebook.videolite.transcoder.base.composition.MediaComposition) r3
            r2 = 0
            if (r3 == 0) goto L_0x0056
            X.4aE r1 = X.C266714aE.AUDIO
            int r0 = r9.A01
            X.4aM r0 = r3.A04(r1, r0)
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = r0.A04
            java.lang.Object r0 = X.Pxg.A0j(r0)
            X.4aI r0 = (X.C266754aI) r0
            java.io.File r0 = r0.A04
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0043 }
            java.lang.String r0 = "audio/mp4a-latm"
            java.lang.String r1 = X.Q1U.A00(r1, r0, r2)     // Catch:{ IOException -> 0x0043 }
            goto L_0x003c
        L_0x003a:
            java.lang.String r1 = "audio/mp4a-latm"
        L_0x003c:
            java.lang.String r0 = "audio/mpeg"
            boolean r2 = r1.equals(r0)     // Catch:{ IOException -> 0x0043 }
            goto L_0x0056
        L_0x0043:
            r1 = move-exception
            X.Q1b r0 = new X.Q1b
            r0.<init>()
            X.C7254Q1b.A00(r0, r1)
            java.lang.Throwable r1 = r0.A01
            if (r1 == 0) goto L_0x0056
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r9.A02
            X.STM r0 = (X.STM) r0
            X.S30 r1 = r0.A0I
            X.RzN r8 = r0.A08
            X.RyG r4 = r0.A0F
            java.nio.ByteBuffer r0 = X.SsP.A0K
            X.TdI r6 = r1.A03
            X.Tfv r5 = r1.A02
            if (r2 == 0) goto L_0x0073
            X.Q4U r7 = new X.Q4U
            r7.<init>()
        L_0x006d:
            X.SsP r3 = new X.SsP
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0076
        L_0x0073:
            X.Tgv r7 = r1.A04
            goto L_0x006d
        L_0x0076:
            int r0 = r9.A01     // Catch:{ all -> 0x007c }
            r3.AIw(r0)     // Catch:{ all -> 0x007c }
            goto L_0x009e
        L_0x007c:
            r0 = move-exception
            X.Q1b r2 = new X.Q1b
            r2.<init>()
            X.C7254Q1b.A00(r2, r0)
            X.Qdp r1 = new X.Qdp
            r1.<init>((X.C7254Q1b) r2, (X.C13855Tia) r3)
            X.RQJ r0 = new X.RQJ
            r0.<init>()
            r0.A00 = r1
            r1.A00()
            java.lang.Throwable r1 = r2.A01
            if (r1 == 0) goto L_0x0013
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x009e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13147TNf.call():java.lang.Object");
    }
}
