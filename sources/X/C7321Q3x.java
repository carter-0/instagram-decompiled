package X;

import java.util.concurrent.Callable;

/* renamed from: X.Q3x  reason: case insensitive filesystem */
public final class C7321Q3x implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6R2 A01;
    public final /* synthetic */ T9F A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C7321Q3x(AnonymousClass6R2 r1, T9F t9f, String str, String str2, long j) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A02 = t9f;
        this.A01 = r1;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r9 = this;
            java.lang.String r8 = "BloksComponentQueryDiskCache"
            java.lang.String r0 = "storeResponseForKey:"
            java.lang.String r7 = r9.A03
            java.lang.String r1 = X.002.A0R(r0, r7)
            java.lang.String r4 = r9.A04
            long r2 = r9.A00
            X.T9F r6 = r9.A02
            X.6R2 r5 = r9.A01
            r0 = 58
            java.lang.String r0 = X.002.A0T(r8, r1, r0)     // Catch:{ all -> 0x006a }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x006a }
            X.Q3y r1 = new X.Q3y     // Catch:{ all -> 0x006a }
            r1.<init>(r6, r4, r2)     // Catch:{ all -> 0x006a }
            java.io.ByteArrayOutputStream r0 = X.Pxe.A0b()     // Catch:{ all -> 0x006a }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x006a }
            r4.<init>(r0)     // Catch:{ all -> 0x006a }
            r4.writeObject(r1)     // Catch:{ all -> 0x0063 }
            r4.close()     // Catch:{ all -> 0x006a }
            byte[] r1 = r0.toByteArray()     // Catch:{ all -> 0x006a }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x006a }
            X.6R1 r0 = r5.A01     // Catch:{ all -> 0x006a }
            com.facebook.stash.core.Stash r0 = r0.A00     // Catch:{ all -> 0x006a }
            r0.write(r7, r1)     // Catch:{ all -> 0x006a }
            java.util.concurrent.atomic.AtomicReference r0 = r5.A05     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006a }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x006a }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x006a }
            java.util.Map r1 = X.0Yt.A0B(r0)     // Catch:{ all -> 0x006a }
            X.Q41 r0 = new X.Q41     // Catch:{ all -> 0x006a }
            r0.<init>(r6, r2)     // Catch:{ all -> 0x006a }
            X.0eP r0 = X.AnonymousClass7TE.A1L(r7, r0)     // Catch:{ all -> 0x006a }
            java.util.Map r0 = X.0Yt.A0C(r1, r0)     // Catch:{ all -> 0x006a }
            X.AnonymousClass6R2.A00(r5, r0)     // Catch:{ all -> 0x006a }
            X.1KZ.A00()
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.1zE.A00(r4, r1)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            X.1KZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7321Q3x.call():java.lang.Object");
    }
}
