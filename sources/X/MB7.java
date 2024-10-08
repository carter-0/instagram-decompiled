package X;

import java.util.concurrent.Callable;

public final class MB7 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public MB7(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static C290815g0 A00(Object obj, Object obj2, int i) {
        return new C290815g0(new MB7(i, obj, obj2), 1775937301);
    }

    public static Object A01(C251983oI r1, Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        return 1wR.A01(r1, new MB7(i, obj, obj2), r4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r7v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f9, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03fc, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0489, code lost:
        r1.close();
        r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x048f, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0521, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        return java.lang.Boolean.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0267, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026b, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x003c;
                case 2: goto L_0x006e;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00c9;
                case 5: goto L_0x0110;
                case 6: goto L_0x0127;
                case 7: goto L_0x0179;
                case 8: goto L_0x01d2;
                case 9: goto L_0x04e1;
                case 10: goto L_0x01f3;
                case 11: goto L_0x02a4;
                case 12: goto L_0x02c2;
                case 13: goto L_0x02e3;
                case 14: goto L_0x02fa;
                case 15: goto L_0x0312;
                case 16: goto L_0x0333;
                case 17: goto L_0x0358;
                case 18: goto L_0x0374;
                case 19: goto L_0x0395;
                case 20: goto L_0x03df;
                case 21: goto L_0x03fd;
                case 22: goto L_0x0414;
                case 23: goto L_0x042a;
                case 24: goto L_0x044b;
                case 25: goto L_0x0467;
                case 26: goto L_0x0498;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 1
            r1 = 0
            r0 = 30
            if (r2 < r0) goto L_0x0032
            r4 = 1
            java.lang.Object r0 = r15.A02
            X.LT3 r0 = (X.LT3) r0
            android.content.Context r3 = r0.A04
            java.lang.String r0 = ".png"
        L_0x0016:
            java.io.File r2 = X.0qc.A00(r3, r0)
            if (r2 == 0) goto L_0x051d
            java.lang.Object r1 = r15.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r4 == 0) goto L_0x002f
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
        L_0x0024:
            X.1MF.A0K(r3, r0, r1, r2)
            X.C59730JVo.A08(r3, r2)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x002f:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            goto L_0x0024
        L_0x0032:
            r4 = 0
            java.lang.Object r0 = r15.A02
            X.LT3 r0 = (X.LT3) r0
            android.content.Context r3 = r0.A04
            java.lang.String r0 = ".jpg"
            goto L_0x0016
        L_0x003c:
            java.lang.Object r0 = r15.A02
            X.LEL r0 = (X.LEL) r0
            android.content.Context r3 = r0.A03
            java.lang.String r0 = ".png"
            java.io.File r2 = X.0qc.A00(r3, r0)
            if (r2 == 0) goto L_0x00b9
            java.lang.Object r1 = r15.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            X.1MF.A0K(r3, r0, r1, r2)
            X.C59730JVo.A08(r3, r2)
            goto L_0x00af
        L_0x0057:
            java.lang.Object r0 = r15.A01
            X.86O r0 = (X.AnonymousClass86O) r0
            X.3oI r2 = r0.A01
            r2.beginTransaction()
            X.1Vf r1 = r0.A00     // Catch:{ all -> 0x0462 }
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x0462 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0462 }
            r1.insert(r0)     // Catch:{ all -> 0x0462 }
            X.0gF r7 = X.AnonymousClass7TF.A0z(r2)     // Catch:{ all -> 0x0462 }
            return r7
        L_0x006e:
            java.lang.String r5 = "qrcode_"
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = X.002.A0Q(r5, r0)
            java.lang.String r4 = ".pdf"
            java.io.File r3 = java.io.File.createTempFile(r0, r4)
            if (r3 == 0) goto L_0x00b9
            java.lang.Object r0 = r15.A02
            X.LEL r0 = (X.LEL) r0
            android.content.Context r1 = r0.A03
            r0 = 4
            X.LMm r0 = X.C64093LMm.A00(r0)
            X.LNw r2 = new X.LNw
            r2.<init>(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = X.002.A0e(r5, r4, r0)
            java.lang.String r0 = "application/pdf"
            X.1FG r2 = r2.A01(r1, r0)
            java.io.OutputStream r1 = r2.CGq()
            java.lang.Object r0 = r15.A01     // Catch:{ all -> 0x00b1 }
            android.graphics.pdf.PdfDocument r0 = (android.graphics.pdf.PdfDocument) r0     // Catch:{ all -> 0x00b1 }
            r0.writeTo(r1)     // Catch:{ all -> 0x00b1 }
            r2.AIX()
            r3.delete()
        L_0x00af:
            r5 = 1
            goto L_0x0106
        L_0x00b1:
            r0 = move-exception
            r2.AIX()
            r3.delete()
            throw r0
        L_0x00b9:
            r5 = 0
            goto L_0x0106
        L_0x00bb:
            java.lang.Object r1 = r15.A02
            X.Kop r1 = (X.C62937Kop) r1
            java.lang.Object r0 = r15.A01
            java.util.List r0 = (java.util.List) r0
            r1.A00(r0)
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x00c9:
            java.lang.Object r0 = r15.A02
            X.Loa r0 = (X.C65171Loa) r0
            X.L15 r4 = r0.A0B
            com.instagram.common.session.UserSession r3 = r0.A07
            java.lang.Object r2 = r15.A01
            android.view.View r2 = (android.view.View) r2
            r5 = 1
            X.0qQ.A0B(r2, r5)
            X.5Gv r0 = r4.A00
            if (r0 != 0) goto L_0x0101
            android.content.Context r1 = r2.getContext()
            X.JTO.A1Z(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131957377(0x7f131681, float:1.9551336E38)
            X.5Gt r1 = X.AnonymousClass7TG.A0e(r1, r0)
            r1.A0F = r5
            r1.A03(r2)
            r1.A01()
            r1.A0A = r5
            r1.A0B = r5
            r0 = 8
            X.5Gv r0 = X.KSP.A00(r1, r3, r0)
            r4.A00 = r0
        L_0x0101:
            if (r0 == 0) goto L_0x010b
            r0.A06()
        L_0x0106:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x010b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0110:
            java.lang.Object r0 = r15.A01
            X.2NS r0 = (X.AnonymousClass2NS) r0
            X.3oI r2 = r0.A01
            r2.beginTransaction()
            X.1Vf r1 = r0.A00     // Catch:{ all -> 0x0462 }
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x0462 }
            X.Jtm r0 = (X.C60928Jtm) r0     // Catch:{ all -> 0x0462 }
            r1.insert(r0)     // Catch:{ all -> 0x0462 }
            X.0gF r7 = X.AnonymousClass7TF.A0z(r2)     // Catch:{ all -> 0x0462 }
            return r7
        L_0x0127:
            java.lang.Object r0 = r15.A01
            X.2NS r0 = (X.AnonymousClass2NS) r0
            X.3oI r1 = r0.A01
            java.lang.Object r4 = r15.A02
            X.1WY r4 = (X.1WY) r4
            r0 = 0
            r7 = 0
            android.database.Cursor r3 = X.1wT.A00(r1, r4, r0)
            java.lang.String r0 = "media_id"
            int r6 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = "file_path"
            int r5 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = "file_size"
            int r2 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = "last_used_time_ms"
            int r1 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0171 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x016a
            java.lang.String r10 = r3.getString(r6)     // Catch:{ all -> 0x0171 }
            java.lang.String r13 = r3.getString(r5)     // Catch:{ all -> 0x0171 }
            long r8 = r3.getLong(r2)     // Catch:{ all -> 0x0171 }
            long r11 = r3.getLong(r1)     // Catch:{ all -> 0x0171 }
            X.Jtm r7 = new X.Jtm     // Catch:{ all -> 0x0171 }
            r7.<init>(r8, r10, r11, r13)     // Catch:{ all -> 0x0171 }
        L_0x016a:
            r3.close()
            r4.A00()
            return r7
        L_0x0171:
            r0 = move-exception
            r3.close()
            r4.A00()
            throw r0
        L_0x0179:
            java.lang.Object r0 = r15.A01
            X.2NS r0 = (X.AnonymousClass2NS) r0
            X.3oI r1 = r0.A01
            java.lang.Object r5 = r15.A02
            X.1WY r5 = (X.1WY) r5
            r0 = 0
            android.database.Cursor r4 = X.1wT.A00(r1, r5, r0)
            java.lang.String r0 = "media_id"
            int r6 = X.1Wd.A01(r4, r0)     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = "file_path"
            int r3 = X.1Wd.A01(r4, r0)     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = "file_size"
            int r2 = X.1Wd.A01(r4, r0)     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = "last_used_time_ms"
            int r1 = X.1Wd.A01(r4, r0)     // Catch:{ all -> 0x01ca }
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0o(r4)     // Catch:{ all -> 0x01ca }
        L_0x01a4:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x01ca }
            if (r0 == 0) goto L_0x01c3
            java.lang.String r11 = r4.getString(r6)     // Catch:{ all -> 0x01ca }
            java.lang.String r14 = r4.getString(r3)     // Catch:{ all -> 0x01ca }
            long r9 = r4.getLong(r2)     // Catch:{ all -> 0x01ca }
            long r12 = r4.getLong(r1)     // Catch:{ all -> 0x01ca }
            X.Jtm r8 = new X.Jtm     // Catch:{ all -> 0x01ca }
            r8.<init>(r9, r11, r12, r14)     // Catch:{ all -> 0x01ca }
            r7.add(r8)     // Catch:{ all -> 0x01ca }
            goto L_0x01a4
        L_0x01c3:
            r4.close()
            r5.A00()
            return r7
        L_0x01ca:
            r0 = move-exception
            r4.close()
            r5.A00()
            throw r0
        L_0x01d2:
            java.lang.Object r0 = r15.A01
            X.2NS r0 = (X.AnonymousClass2NS) r0
            X.3oI r0 = r0.A01
            java.lang.Object r3 = r15.A02
            X.1WY r3 = (X.1WY) r3
            r2 = 0
            android.database.Cursor r1 = X.1wT.A00(r0, r3, r2)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0o(r1)     // Catch:{ all -> 0x0490 }
        L_0x01e5:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x0489
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x0490 }
            r7.add(r0)     // Catch:{ all -> 0x0490 }
            goto L_0x01e5
        L_0x01f3:
            java.lang.Object r2 = r15.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r2 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r2
            java.lang.Object r3 = r15.A02
            X.34S r3 = (X.AnonymousClass34S) r3
            X.4DH r0 = r2.A0w
            android.content.Context r6 = r0.requireContext()
            r1 = 1
            com.instagram.common.session.UserSession r8 = r2.A0B
            java.lang.Object r7 = r3.A00
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r12 = r3.A01
            java.lang.String r12 = (java.lang.String) r12
            boolean r3 = X.DbW.A1S(r1, r8, r7)
            android.net.Uri r0 = android.net.Uri.EMPTY
            boolean r0 = r7.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x029d
            r9 = 0
            X.MB4 r5 = new X.MB4     // Catch:{ IOException -> 0x028c }
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x028c }
            com.instagram.common.gallery.Medium r0 = r5.call()     // Catch:{ IOException -> 0x028c }
            X.JYp r0 = X.C59796JYp.A00(r0, r3)     // Catch:{ IOException -> 0x028c }
            java.lang.String r9 = r0.A07     // Catch:{ IOException -> 0x028c }
            X.0qQ.A07(r9)     // Catch:{ IOException -> 0x028c }
            long r10 = r0.A03     // Catch:{ IOException -> 0x028c }
            r12 = r10
            com.instagram.pendingmedia.model.ClipInfo r5 = X.Q0X.A03(r8, r9, r10, r12)     // Catch:{ IOException -> 0x028c }
            int r0 = r5.A09     // Catch:{ IOException -> 0x028c }
            float r3 = (float) r0     // Catch:{ IOException -> 0x028c }
            int r0 = r5.A06     // Catch:{ IOException -> 0x028c }
            float r0 = (float) r0     // Catch:{ IOException -> 0x028c }
            float r3 = r3 / r0
            r5.A00 = r3     // Catch:{ IOException -> 0x028c }
            java.lang.String r0 = r5.A0F     // Catch:{ IOException -> 0x028c }
            if (r0 == 0) goto L_0x0287
            android.graphics.Bitmap r4 = android.media.ThumbnailUtils.createVideoThumbnail(r0, r1)     // Catch:{ IOException -> 0x028c }
            java.lang.String r3 = "video"
            java.lang.String r1 = ".jpg"
            java.io.File r0 = r6.getCacheDir()     // Catch:{ IOException -> 0x028c }
            java.io.File r1 = java.io.File.createTempFile(r3, r1, r0)     // Catch:{ IOException -> 0x028c }
            if (r4 == 0) goto L_0x0274
            java.io.FileOutputStream r3 = X.JTO.A0t(r1)     // Catch:{ all -> 0x026c }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0265 }
            X.JZK.A00(r0, r4, r3)     // Catch:{ all -> 0x0265 }
            r3.flush()     // Catch:{ all -> 0x0265 }
            r3.close()     // Catch:{ all -> 0x026c }
            goto L_0x0271
        L_0x0265:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x026c }
            throw r0     // Catch:{ all -> 0x026c }
        L_0x026c:
            r0 = move-exception
            r4.recycle()     // Catch:{ IOException -> 0x028c }
            goto L_0x028b
        L_0x0271:
            r4.recycle()     // Catch:{ IOException -> 0x028c }
        L_0x0274:
            java.lang.String r0 = X.JTP.A0t(r1)     // Catch:{ IOException -> 0x028c }
            X.L4R r7 = new X.L4R     // Catch:{ IOException -> 0x028c }
            r7.<init>(r5, r0)     // Catch:{ IOException -> 0x028c }
            com.instagram.pendingmedia.model.ClipInfo r0 = r7.A00
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r0.A0B
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A0A
            r1.A00(r0)
            return r7
        L_0x0287:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ IOException -> 0x028c }
        L_0x028b:
            throw r0     // Catch:{ IOException -> 0x028c }
        L_0x028c:
            r2 = move-exception
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "DirectExternalMediaShareHelper#getClipInfo failure: %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x029d:
            java.lang.String r0 = "Video uri is empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x02a4:
            java.lang.Object r3 = r15.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r3 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r3
            java.lang.Object r2 = r15.A02
            android.net.Uri r2 = (android.net.Uri) r2
            X.4DH r0 = r3.A0w
            android.content.Context r1 = r0.requireContext()
            com.instagram.common.session.UserSession r0 = r3.A0B
            X.8Cl r7 = X.C63256Ku1.A00(r1, r2, r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r7.A01()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r3.A0A
            r1.A00(r0)
            return r7
        L_0x02c2:
            java.lang.Object r0 = r15.A01
            X.92T r0 = (X.AnonymousClass92T) r0
            X.3oI r0 = r0.A00
            java.lang.Object r3 = r15.A02
            X.1WY r3 = (X.1WY) r3
            r2 = 0
            android.database.Cursor r1 = X.1wT.A00(r0, r3, r2)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0o(r1)     // Catch:{ all -> 0x0490 }
        L_0x02d5:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x0489
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x0490 }
            r7.add(r0)     // Catch:{ all -> 0x0490 }
            goto L_0x02d5
        L_0x02e3:
            java.lang.Object r0 = r15.A01
            X.L4Z r0 = (X.L4Z) r0
            X.3oI r2 = r0.A01
            r2.beginTransaction()
            X.1Vf r1 = r0.A00     // Catch:{ all -> 0x0462 }
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x0462 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0462 }
            r1.insert(r0)     // Catch:{ all -> 0x0462 }
            X.0gF r7 = X.AnonymousClass7TF.A0z(r2)     // Catch:{ all -> 0x0462 }
            return r7
        L_0x02fa:
            java.lang.Object r0 = r15.A01
            X.LMe r0 = (X.C64086LMe) r0
            X.3oI r2 = r0.A01
            r2.beginTransaction()
            X.1Vf r1 = r0.A00     // Catch:{ all -> 0x0462 }
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x0462 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0462 }
            java.util.List r7 = r1.insertAndReturnIdsList(r0)     // Catch:{ all -> 0x0462 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0462 }
            goto L_0x03f9
        L_0x0312:
            java.lang.Object r0 = r15.A01
            X.LMe r0 = (X.C64086LMe) r0
            X.3oI r0 = r0.A01
            java.lang.Object r3 = r15.A02
            X.1WY r3 = (X.1WY) r3
            r2 = 0
            android.database.Cursor r1 = X.1wT.A00(r0, r3, r2)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0o(r1)     // Catch:{ all -> 0x0490 }
        L_0x0325:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x0489
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x0490 }
            r7.add(r0)     // Catch:{ all -> 0x0490 }
            goto L_0x0325
        L_0x0333:
            java.lang.Object r0 = r15.A01
            X.JXF r0 = (X.JXF) r0
            X.3oI r0 = r0.A02
            java.lang.Object r3 = r15.A02
            X.1WY r3 = (X.1WY) r3
            r2 = 0
            android.database.Cursor r1 = X.1wT.A00(r0, r3, r2)
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x0352
            int r0 = r1.getInt(r2)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0490 }
            goto L_0x0489
        L_0x0352:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0490 }
            goto L_0x0489
        L_0x0358:
            java.lang.Object r0 = r15.A01
            X.JXF r0 = (X.JXF) r0
            X.3oI r0 = r0.A02
            java.lang.Object r3 = r15.A02
            X.1WY r3 = (X.1WY) r3
            r2 = 0
            r7 = 0
            android.database.Cursor r1 = X.1wT.A00(r0, r3, r2)
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x0489
            java.lang.String r7 = r1.getString(r2)     // Catch:{ all -> 0x0490 }
            goto L_0x0489
        L_0x0374:
            java.lang.Object r0 = r15.A01
            X.JXF r0 = (X.JXF) r0
            X.3oI r0 = r0.A02
            java.lang.Object r3 = r15.A02
            X.1WY r3 = (X.1WY) r3
            r2 = 0
            android.database.Cursor r1 = X.1wT.A00(r0, r3, r2)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0o(r1)     // Catch:{ all -> 0x0490 }
        L_0x0387:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x0489
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x0490 }
            r7.add(r0)     // Catch:{ all -> 0x0490 }
            goto L_0x0387
        L_0x0395:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "DELETE FROM drafts WHERE id in ("
            r1.append(r0)
            java.lang.Object r2 = r15.A02
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            X.1wO.A00(r1, r0)
            java.lang.String r0 = ")"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.Object r0 = r15.A01
            X.JXF r0 = (X.JXF) r0
            X.3oI r5 = r0.A02
            X.1WV r4 = r5.compileStatement(r1)
            java.util.Iterator r3 = r2.iterator()
            r2 = 1
        L_0x03be:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03cf
            int r0 = X.AnonymousClass7TG.A0F(r3)
            long r0 = (long) r0
            r4.ADa(r2, r0)
            int r2 = r2 + 1
            goto L_0x03be
        L_0x03cf:
            r5.beginTransaction()
            X.0gF r7 = X.AnonymousClass7TF.A10(r5, r4)     // Catch:{ all -> 0x03da }
            r5.endTransaction()
            return r7
        L_0x03da:
            r0 = move-exception
            r5.endTransaction()
            throw r0
        L_0x03df:
            java.lang.Object r0 = r15.A01
            X.JXF r0 = (X.JXF) r0
            X.3oI r2 = r0.A02
            r2.beginTransaction()
            X.1Vf r1 = r0.A01     // Catch:{ all -> 0x0462 }
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x0462 }
            X.JvZ r0 = (X.C61035JvZ) r0     // Catch:{ all -> 0x0462 }
            long r0 = r1.insertAndReturnId(r0)     // Catch:{ all -> 0x0462 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0462 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0462 }
        L_0x03f9:
            r2.endTransaction()
            return r7
        L_0x03fd:
            java.lang.Object r0 = r15.A01
            X.JXF r0 = (X.JXF) r0
            X.3oI r2 = r0.A02
            r2.beginTransaction()
            X.2NZ r1 = r0.A00     // Catch:{ all -> 0x0462 }
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x0462 }
            X.JvZ r0 = (X.C61035JvZ) r0     // Catch:{ all -> 0x0462 }
            r1.A00(r0)     // Catch:{ all -> 0x0462 }
            X.0gF r7 = X.AnonymousClass7TF.A0z(r2)     // Catch:{ all -> 0x0462 }
            return r7
        L_0x0414:
            java.lang.Object r2 = r15.A02
            X.LDv r2 = (X.C63935LDv) r2
            java.lang.Object r1 = r15.A01
            r0 = 23
            X.5g0 r1 = A00(r1, r2, r0)     // Catch:{ Exception -> 0x0427 }
            X.2Cn r0 = r2.A00     // Catch:{ Exception -> 0x0427 }
            r1.A00 = r0     // Catch:{ Exception -> 0x0427 }
            X.1ES.A03(r1)     // Catch:{ Exception -> 0x0427 }
        L_0x0427:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x042a:
            java.lang.Object r0 = r15.A02
            X.LDv r0 = (X.C63935LDv) r0
            android.content.Context r2 = r0.A01
            java.lang.String r0 = ".png"
            java.io.File r7 = X.0qc.A00(r2, r0)
            if (r7 == 0) goto L_0x0449
            java.lang.Object r0 = r15.A01
            X.60f r0 = (X.C3018260f) r0
            android.graphics.Bitmap r1 = X.C298615tk.A00(r0)
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            X.1MF.A0K(r2, r0, r1, r7)
            X.C59730JVo.A08(r2, r7)
            return r7
        L_0x0449:
            r7 = 0
            return r7
        L_0x044b:
            java.lang.Object r0 = r15.A01
            X.LS6 r0 = (X.LS6) r0
            X.3oI r2 = r0.A01
            r2.beginTransaction()
            X.1Vf r1 = r0.A00     // Catch:{ all -> 0x0462 }
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x0462 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0462 }
            r1.insert(r0)     // Catch:{ all -> 0x0462 }
            X.0gF r7 = X.AnonymousClass7TF.A0z(r2)     // Catch:{ all -> 0x0462 }
            return r7
        L_0x0462:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        L_0x0467:
            java.lang.Object r0 = r15.A01
            X.LS6 r0 = (X.LS6) r0
            X.3oI r0 = r0.A01
            java.lang.Object r3 = r15.A02
            X.1WY r3 = (X.1WY) r3
            r2 = 0
            android.database.Cursor r1 = X.1wT.A00(r0, r3, r2)
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0490 }
            if (r0 == 0) goto L_0x0485
            int r0 = r1.getInt(r2)     // Catch:{ all -> 0x0490 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0490 }
            goto L_0x0489
        L_0x0485:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0490 }
        L_0x0489:
            r1.close()
            r3.A00()
            return r7
        L_0x0490:
            r0 = move-exception
            r1.close()
            r3.A00()
            throw r0
        L_0x0498:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "DELETE FROM qs_realtime_signals WHERE signal_id IN ("
            r1.append(r0)
            java.lang.Object r2 = r15.A02
            java.util.Collection r2 = (java.util.Collection) r2
            int r0 = r2.size()
            X.1wO.A00(r1, r0)
            java.lang.String r0 = ")"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.Object r0 = r15.A01
            X.LS6 r0 = (X.LS6) r0
            X.3oI r4 = r0.A01
            X.1WV r3 = r4.compileStatement(r1)
            java.util.Iterator r2 = r2.iterator()
            r1 = 1
        L_0x04c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04d1
            java.lang.String r0 = X.AnonymousClass7TE.A18(r2)
            r3.ADh(r1, r0)
            int r1 = r1 + 1
            goto L_0x04c1
        L_0x04d1:
            r4.beginTransaction()
            X.0gF r7 = X.AnonymousClass7TF.A10(r4, r3)     // Catch:{ all -> 0x04dc }
            r4.endTransaction()
            return r7
        L_0x04dc:
            r0 = move-exception
            r4.endTransaction()
            throw r0
        L_0x04e1:
            java.lang.Object r2 = r15.A02
            X.Loz r2 = (X.C65196Loz) r2
            X.KHY r0 = r2.A00
            if (r0 != 0) goto L_0x04f3
            java.lang.String r0 = "exclusivePostsRow"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04f3:
            android.widget.TextView r5 = r0.A06
            if (r5 == 0) goto L_0x051c
            java.lang.Object r4 = r15.A01
            X.4DH r0 = r2.A01
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = r2.A02
            r2 = 1
            r0 = 2131961831(0x7f1327e7, float:1.956037E38)
            X.5Gt r1 = X.AnonymousClass7TG.A0e(r1, r0)
            r1.A0F = r2
            r1.A03(r5)
            r1.A01()
            r1.A0A = r2
            r0 = 9
            X.5Gv r0 = X.KSP.A00(r1, r4, r0)
            r0.A07(r3)
        L_0x051c:
            r1 = 1
        L_0x051d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MB7.call():java.lang.Object");
    }
}
