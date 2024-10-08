package X;

import android.graphics.Bitmap;

/* renamed from: X.9jq  reason: invalid class name and case insensitive filesystem */
public final class C385979jq extends 2Cl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C39656A3w A02;
    public final /* synthetic */ AnonymousClass6ST A03;

    public final int getRunnableId() {
        return 595;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        0wb.A03("ClipsRemixScreenshotUtil", AnonymousClass7TF.A0m("Error during screenshot callback. ", exc));
        this.A03.dismiss();
        C359318cb r0 = this.A02.A00.A00;
        r0.A0I = null;
        C359318cb.A0A(r0);
    }

    public C385979jq(Bitmap bitmap, C39656A3w a3w, AnonymousClass6ST r3, int i) {
        this.A01 = bitmap;
        this.A00 = i;
        this.A03 = r3;
        this.A02 = a3w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r6 = this;
            android.graphics.Bitmap r5 = r6.A01
            int r2 = r6.A00
            r4 = 0
            java.io.File r1 = X.AnonymousClass457.A01()     // Catch:{ Exception -> 0x001f, all -> 0x001d }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001f, all -> 0x001d }
            r3.<init>(r1)     // Catch:{ Exception -> 0x001f, all -> 0x001d }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x001b }
            X.0fO.A02(r0, r5, r3, r2)     // Catch:{ Exception -> 0x001b }
            r3.close()
            java.lang.String r4 = r1.getCanonicalPath()
            return r4
        L_0x001b:
            r2 = move-exception
            goto L_0x0021
        L_0x001d:
            r0 = move-exception
            goto L_0x0034
        L_0x001f:
            r2 = move-exception
            r3 = r4
        L_0x0021:
            java.lang.String r1 = "ClipsRemixScreenshotUtil"
            java.lang.String r0 = "Error while saving screenshot. "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r2)     // Catch:{ all -> 0x0032 }
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0031
            r3.close()
        L_0x0031:
            return r4
        L_0x0032:
            r0 = move-exception
            r4 = r3
        L_0x0034:
            if (r4 == 0) goto L_0x0039
            r4.close()
        L_0x0039:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385979jq.call():java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A03.dismiss();
        C359318cb r0 = this.A02.A00.A00;
        r0.A0I = (String) obj;
        C359318cb.A0A(r0);
    }

    public final void onStart() {
        C385979jq.super.onStart();
        AnonymousClass0fN.A00(this.A03);
    }
}
