package X;

import java.io.File;

/* renamed from: X.Sli  reason: case insensitive filesystem */
public final class C12055Sli implements C13705TfO {
    public final /* synthetic */ C10534Rtn A00;
    public final /* synthetic */ QLA A01;
    public final /* synthetic */ File A02;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(4:1|2|3|4)|7|8|(1:23)|(3:10|11|21)) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r4 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DfV(java.lang.String r7) {
        /*
            r6 = this;
            r2 = 0
            java.io.File r1 = r6.A02     // Catch:{ Exception -> 0x002e, all -> 0x0049 }
            java.lang.String r0 = "iab_source.html"
            java.io.File r5 = X.JTO.A0s(r1, r0)     // Catch:{ Exception -> 0x002e, all -> 0x0049 }
            java.io.FileOutputStream r1 = X.JTO.A0t(r5)     // Catch:{ Exception -> 0x002e, all -> 0x0049 }
            java.lang.String r0 = "UTF-8"
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x002e, all -> 0x0049 }
            r4.<init>(r1, r0)     // Catch:{ Exception -> 0x002e, all -> 0x0049 }
            r4.write(r7)     // Catch:{ Exception -> 0x002f }
            X.Rtn r3 = r6.A00     // Catch:{ Exception -> 0x002f }
            java.util.Map r2 = r3.A02     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = "html_source_uri"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x002f }
            X.SRY r1 = X.SRY.A00()     // Catch:{ Exception -> 0x002f }
            android.os.Bundle r0 = r3.A00     // Catch:{ Exception -> 0x002f }
            r1.A07(r0, r2)     // Catch:{ Exception -> 0x002f }
            goto L_0x003e
        L_0x002e:
            r4 = r2
        L_0x002f:
            X.Rtn r0 = r6.A00     // Catch:{ all -> 0x0042 }
            X.SRY r2 = X.SRY.A00()     // Catch:{ all -> 0x0042 }
            java.util.Map r1 = r0.A02     // Catch:{ all -> 0x0042 }
            android.os.Bundle r0 = r0.A00     // Catch:{ all -> 0x0042 }
            r2.A07(r0, r1)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0041
        L_0x003e:
            r4.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return
        L_0x0042:
            r0 = move-exception
            if (r4 == 0) goto L_0x004a
            r4.close()     // Catch:{ IOException -> 0x004a }
            throw r0
        L_0x0049:
            r0 = move-exception
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12055Sli.DfV(java.lang.String):void");
    }

    public C12055Sli(C10534Rtn rtn, QLA qla, File file) {
        this.A01 = qla;
        this.A02 = file;
        this.A00 = rtn;
    }

    public final void onFailure() {
        C10534Rtn rtn = this.A00;
        SRY.A00().A07(rtn.A00, rtn.A02);
    }
}
