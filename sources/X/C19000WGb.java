package X;

import java.io.File;

/* renamed from: X.WGb  reason: case insensitive filesystem */
public final class C19000WGb implements 0Gx {
    public boolean A00;
    public final /* synthetic */ C18998WFz A01;

    public C19000WGb(C18998WFz wFz) {
        this.A01 = wFz;
    }

    public final void E3M(File file) {
        C18998WFz wFz = this.A01;
        if (!wFz.A01.equals(file) && !this.A00) {
            file.delete();
        }
        if (this.A00 && file.equals(wFz.A02)) {
            this.A00 = false;
        }
    }

    public final void E3R(File file) {
        if (!this.A00 && file.equals(this.A01.A02)) {
            this.A00 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r5.equals(r1) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FN8(java.io.File r10) {
        /*
            r9 = this;
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0087
            X.WFz r6 = r9.A01
            java.lang.String r8 = r10.getName()
            r7 = 46
            int r3 = r8.lastIndexOf(r7)
            if (r3 <= 0) goto L_0x0087
            java.lang.String r1 = r8.substring(r3)
            java.lang.String r5 = ".cnt"
            r4 = r5
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x0027
            java.lang.String r5 = ".tmp"
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x0087
        L_0x0027:
            r2 = 0
            java.lang.String r1 = r8.substring(r2, r3)
            java.lang.String r3 = ".tmp"
            boolean r0 = r5.equals(r3)
            if (r0 == 0) goto L_0x003e
            int r0 = r1.lastIndexOf(r7)
            if (r0 <= 0) goto L_0x0087
            java.lang.String r1 = r1.substring(r2, r0)
        L_0x003e:
            int r0 = r1.hashCode()
            int r0 = r0 % 100
            int r0 = java.lang.Math.abs(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r0 = r6.A02
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            java.lang.String r0 = X.Pxg.A0s(r0, r2, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = r10.getParentFile()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0087
            r0 = 0
            if (r5 != r3) goto L_0x0080
            long r4 = r10.lastModified()
            X.0JP r0 = r6.A00
            long r2 = r0.now()
            long r0 = X.C18998WFz.A04
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            return
        L_0x0080:
            if (r5 != r4) goto L_0x0083
            r0 = 1
        L_0x0083:
            X.0He.A00(r0)
            return
        L_0x0087:
            r10.delete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19000WGb.FN8(java.io.File):void");
    }
}
