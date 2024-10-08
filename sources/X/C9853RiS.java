package X;

/* renamed from: X.RiS  reason: case insensitive filesystem */
public abstract class C9853RiS {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r4 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        return new X.C61058Jvw(X.C59778JXx.A01(r6, r7), java.lang.Boolean.valueOf(r6.getBooleanExtra("com.instagram.sharedSticker.attach_audio_previews", false)), r3, r4, r6.getStringExtra("content_url"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r4 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r4.length() == 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r0 = r5.getReferrer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r0.getAuthority();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C61058Jvw A00(android.app.Activity r5, android.content.Intent r6, X.0lg r7) {
        /*
            r1 = 0
            r0 = 370(0x172, float:5.18E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r6.getStringExtra(r0)
            if (r3 == 0) goto L_0x0048
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0048
            r4 = r3
        L_0x0014:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0024
        L_0x001a:
            android.net.Uri r0 = r5.getReferrer()
            if (r0 == 0) goto L_0x0046
            java.lang.String r4 = r0.getAuthority()
        L_0x0024:
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x0029
            r4 = r0
        L_0x0029:
            if (r3 != 0) goto L_0x002c
            r3 = r0
        L_0x002c:
            java.lang.String r0 = "content_url"
            java.lang.String r5 = r6.getStringExtra(r0)
            java.lang.String r0 = "com.instagram.sharedSticker.attach_audio_previews"
            boolean r0 = r6.getBooleanExtra(r0, r1)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = X.C59778JXx.A01(r6, r7)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.Jvw r0 = new X.Jvw
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x0046:
            r4 = 0
            goto L_0x0024
        L_0x0048:
            java.lang.String r4 = r5.getCallingPackage()
            if (r4 == 0) goto L_0x001a
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9853RiS.A00(android.app.Activity, android.content.Intent, X.0lg):X.Jvw");
    }
}
