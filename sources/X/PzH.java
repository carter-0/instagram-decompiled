package X;

public final class PzH extends 0ng {
    public final PzJ A00;
    public final Object A01;
    public final String A02;
    public final /* synthetic */ 1NH A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.0wb.A06("JSONDiskSerializer_Cannot_Write_OutputStream", "output stream cannot be written", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r3 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r3.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r4 = 0
            X.1NH r2 = r5.A03     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            X.1JI r1 = X.1NH.A00(r2)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            java.lang.String r0 = r5.A02     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            X.2ic r1 = r1.AR2(r0)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            java.lang.Object r0 = r1.A00     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            if (r0 == 0) goto L_0x0030
            java.lang.Object r3 = r1.A00()     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            X.3Ey r3 = (X.AnonymousClass3Ey) r3     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            X.1NF r1 = r2.A00     // Catch:{ IOException -> 0x002e }
            java.lang.Object r0 = r5.A01     // Catch:{ IOException -> 0x002e }
            java.lang.String r1 = r1.END(r0)     // Catch:{ IOException -> 0x002e }
            java.nio.charset.Charset r0 = X.Pxe.A17()     // Catch:{ IOException -> 0x002e }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ IOException -> 0x002e }
            r3.write(r0)     // Catch:{ IOException -> 0x002e }
            r3.A03()     // Catch:{ IOException -> 0x002e }
            goto L_0x004c
        L_0x002e:
            r2 = move-exception
            goto L_0x0042
        L_0x0030:
            java.lang.String r1 = "JSONDiskSerializer_Missing_Output_File"
            java.lang.String r0 = "output file not available"
            X.0wb.A03(r1, r0)     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            r0.<init>()     // Catch:{ IOException -> 0x0040, all -> 0x003e }
            throw r0     // Catch:{ IOException -> 0x0040, all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            throw r0
        L_0x0040:
            r2 = move-exception
            r3 = r4
        L_0x0042:
            java.lang.String r1 = "JSONDiskSerializer_Cannot_Write_OutputStream"
            java.lang.String r0 = "output stream cannot be written"
            X.0wb.A06(r1, r0, r2)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004f
        L_0x004c:
            r3.A02()
        L_0x004f:
            return
        L_0x0050:
            r0 = move-exception
            if (r3 == 0) goto L_0x0056
            r3.A02()
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PzH.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PzH(1NH r3, Object obj, String str) {
        super(-13);
        PzJ pzJ = new PzJ(r3);
        this.A03 = r3;
        this.A02 = str;
        this.A01 = obj;
        this.A00 = pzJ;
    }
}
