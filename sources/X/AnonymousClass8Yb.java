package X;

import java.util.concurrent.Callable;

/* renamed from: X.8Yb  reason: invalid class name */
public final class AnonymousClass8Yb implements Callable {
    public final /* synthetic */ AnonymousClass8XR A00;

    public AnonymousClass8Yb(AnonymousClass8XR r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.1zE.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r29 = this;
            r0 = r29
            X.8XR r0 = r0.A00
            android.content.Context r1 = r0.A00
            X.7xb r0 = new X.7xb
            r0.<init>(r1)
            X.1VY r1 = r0.A00     // Catch:{ Exception -> 0x00e0 }
            X.1W6 r2 = r1.CGp()     // Catch:{ Exception -> 0x00e0 }
            r1 = 1
            X.0qQ.A0B(r2, r1)     // Catch:{ Exception -> 0x00e0 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e0 }
            r1.<init>()     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r5 = "gallery_media_metadata"
            r4 = 0
            r3 = 23
            java.lang.String r6 = "id"
            java.lang.String r7 = "scanner_versions"
            java.lang.String r8 = "feature_name"
            java.lang.String r9 = "locality"
            java.lang.String r10 = "sub_admin_area"
            java.lang.String r11 = "admin_area"
            java.lang.String r12 = "country_name"
            java.lang.String r13 = "ocn_score"
            java.lang.String r14 = "ocv_score"
            java.lang.String r15 = "person_score"
            java.lang.String r16 = "food_score"
            java.lang.String r17 = "pet_score"
            java.lang.String r18 = "nature_score"
            java.lang.String r19 = "landmark_score"
            java.lang.String r20 = "aesthetic_score"
            java.lang.String r21 = "blur_score"
            java.lang.String r22 = "plant_score"
            java.lang.String r23 = "sports_score"
            java.lang.String r24 = "vehicle_score"
            java.lang.String r25 = "water_score"
            java.lang.String r26 = "outdoors_score"
            java.lang.String r27 = "event_score"
            java.lang.String r28 = "document_score"
            java.lang.String[] r10 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}     // Catch:{ RuntimeException -> 0x00a4 }
            r6 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00a4 }
            r9.<init>(r6)     // Catch:{ RuntimeException -> 0x00a4 }
            java.lang.String r6 = "SELECT "
            r9.append(r6)     // Catch:{ RuntimeException -> 0x00a4 }
            r8 = 0
        L_0x005e:
            r7 = r10[r8]     // Catch:{ RuntimeException -> 0x00a4 }
            if (r8 <= 0) goto L_0x0067
            java.lang.String r6 = ", "
            r9.append(r6)     // Catch:{ RuntimeException -> 0x00a4 }
        L_0x0067:
            r9.append(r7)     // Catch:{ RuntimeException -> 0x00a4 }
            int r8 = r8 + 1
            if (r8 < r3) goto L_0x005e
            r3 = 32
            r9.append(r3)     // Catch:{ RuntimeException -> 0x00a4 }
            java.lang.String r3 = "FROM "
            r9.append(r3)     // Catch:{ RuntimeException -> 0x00a4 }
            r9.append(r5)     // Catch:{ RuntimeException -> 0x00a4 }
            java.lang.String r5 = r9.toString()     // Catch:{ RuntimeException -> 0x00a4 }
            X.0qQ.A07(r5)     // Catch:{ RuntimeException -> 0x00a4 }
            X.1W8 r3 = new X.1W8     // Catch:{ RuntimeException -> 0x00a4 }
            r3.<init>(r5, r4)     // Catch:{ RuntimeException -> 0x00a4 }
            android.database.Cursor r4 = r2.E5j(r3)     // Catch:{ RuntimeException -> 0x00a4 }
        L_0x008b:
            boolean r2 = r4.moveToNext()     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x0099
            X.8aI r2 = X.C358048aH.A00(r4)     // Catch:{ all -> 0x009d }
            r1.add(r2)     // Catch:{ all -> 0x009d }
            goto L_0x008b
        L_0x0099:
            r4.close()     // Catch:{ RuntimeException -> 0x00a4 }
            goto L_0x00aa
        L_0x009d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x009f }
        L_0x009f:
            r2 = move-exception
            X.1zE.A00(r4, r3)     // Catch:{ RuntimeException -> 0x00a4 }
            throw r2     // Catch:{ RuntimeException -> 0x00a4 }
        L_0x00a4:
            r3 = move-exception
            java.lang.String r2 = "GalleryMediaMetadataDatabaseAccessHelper#fetchAll"
            X.0wb.A07(r2, r3)     // Catch:{ Exception -> 0x00e0 }
        L_0x00aa:
            r2 = 10
            int r2 = X.0Yv.A1E(r1, r2)     // Catch:{ Exception -> 0x00e0 }
            int r3 = X.0se.A0L(r2)     // Catch:{ Exception -> 0x00e0 }
            r2 = 16
            if (r3 >= r2) goto L_0x00ba
            r3 = 16
        L_0x00ba:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x00e0 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00e0 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ Exception -> 0x00e0 }
        L_0x00c3:
            boolean r1 = r3.hasNext()     // Catch:{ Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x00f0
            java.lang.Object r2 = r3.next()     // Catch:{ Exception -> 0x00e0 }
            r1 = r2
            X.8aI r1 = (X.C358058aI) r1     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r1 = r1.A0L     // Catch:{ Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x00d8
            r4.put(r1, r2)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00c3
        L_0x00d8:
            java.lang.String r2 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00e0 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00e0 }
            throw r1     // Catch:{ Exception -> 0x00e0 }
        L_0x00e0:
            r3 = move-exception
            r1 = 2286(0x8ee, float:3.203E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "Prepare failed"
            X.0KC.A0F(r1, r2, r3)     // Catch:{ all -> 0x00f6 }
            X.0sm r4 = X.0Yt.A0E()     // Catch:{ all -> 0x00f6 }
        L_0x00f0:
            X.1VY r0 = r0.A00
            r0.close()
            return r4
        L_0x00f6:
            r1 = move-exception
            X.1VY r0 = r0.A00
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Yb.call():java.lang.Object");
    }
}
