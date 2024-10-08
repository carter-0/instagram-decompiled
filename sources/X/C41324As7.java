package X;

import java.util.concurrent.Callable;

/* renamed from: X.As7  reason: case insensitive filesystem */
public final class C41324As7 implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ AnonymousClass2NT A01;

    public C41324As7(1WY r1, AnonymousClass2NT r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:5|(2:7|9)(1:8)|10|(2:12|13)|14|15|(2:17|19)(1:18)|20|(2:22|23)|24|25|(1:27)(1:28)|29|(2:31|41)(2:32|40)|33|3) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r3.close();
        r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0093 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[SYNTHETIC, Splitter:B:22:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac A[Catch:{ all -> 0x00c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r26 = this;
            r2 = r26
            X.2NT r0 = r2.A01
            X.3oI r1 = r0.A00
            X.1WY r11 = r2.A00
            r0 = 0
            r13 = 0
            android.database.Cursor r3 = X.1wT.A00(r1, r11, r0)
            java.lang.String r0 = "draft_id"
            int r10 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "revision_id"
            int r9 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "composition_id"
            int r8 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "date_created"
            int r7 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "date_modified"
            int r6 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "media_info"
            int r5 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "persisted_media_info"
            int r4 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "media_edits"
            int r2 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "cover_file_path"
            int r1 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x00c0 }
            java.util.ArrayList r0 = X.AnonymousClass7TF.A0o(r3)     // Catch:{ all -> 0x00c0 }
        L_0x0048:
            boolean r12 = r3.moveToNext()     // Catch:{ all -> 0x00c0 }
            if (r12 == 0) goto L_0x00b9
            java.lang.String r18 = r3.getString(r10)     // Catch:{ all -> 0x00c0 }
            java.lang.String r19 = r3.getString(r9)     // Catch:{ all -> 0x00c0 }
            java.lang.String r20 = r3.getString(r8)     // Catch:{ all -> 0x00c0 }
            long r22 = r3.getLong(r7)     // Catch:{ all -> 0x00c0 }
            long r24 = r3.getLong(r6)     // Catch:{ all -> 0x00c0 }
            boolean r12 = r3.isNull(r5)     // Catch:{ all -> 0x00c0 }
            if (r12 == 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            java.lang.String r12 = r3.getString(r5)     // Catch:{ all -> 0x00c0 }
            goto L_0x006f
        L_0x006e:
            r12 = r13
        L_0x006f:
            r15 = 0
            if (r12 == 0) goto L_0x007a
            X.16F r12 = X.16P.A00(r12)     // Catch:{ IOException -> 0x007a }
            X.8ka r15 = X.C363948kc.parseFromJson(r12)     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            boolean r12 = r3.isNull(r4)     // Catch:{ all -> 0x00c0 }
            if (r12 == 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            java.lang.String r12 = r3.getString(r4)     // Catch:{ all -> 0x00c0 }
            goto L_0x0087
        L_0x0086:
            r12 = r13
        L_0x0087:
            r16 = 0
            if (r12 == 0) goto L_0x0093
            X.16F r12 = X.16P.A00(r12)     // Catch:{ IOException -> 0x0093 }
            X.8ka r16 = X.C363948kc.parseFromJson(r12)     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            boolean r12 = r3.isNull(r2)     // Catch:{ all -> 0x00c0 }
            if (r12 == 0) goto L_0x009b
            r12 = r13
            goto L_0x009f
        L_0x009b:
            java.lang.String r12 = r3.getString(r2)     // Catch:{ all -> 0x00c0 }
        L_0x009f:
            X.8vh r17 = X.AnonymousClass9OZ.A00(r12)     // Catch:{ all -> 0x00c0 }
            boolean r12 = r3.isNull(r1)     // Catch:{ all -> 0x00c0 }
            if (r12 == 0) goto L_0x00ac
            r21 = r13
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r21 = r3.getString(r1)     // Catch:{ all -> 0x00c0 }
        L_0x00b0:
            X.9by r14 = new X.9by     // Catch:{ all -> 0x00c0 }
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x00c0 }
            r0.add(r14)     // Catch:{ all -> 0x00c0 }
            goto L_0x0048
        L_0x00b9:
            r3.close()
            r11.A00()
            return r0
        L_0x00c0:
            r0 = move-exception
            r3.close()
            r11.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41324As7.call():java.lang.Object");
    }
}
