package X;

public abstract class A0E {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.1zE.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(X.1W6 r29, java.util.List r30) {
        /*
            r5 = r30
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.List r1 = java.util.Collections.emptyList()
            X.0qQ.A07(r1)
            return r1
        L_0x0010:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r2 = "id IN ("
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00e2 }
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x00e2 }
            int r6 = r5.size()     // Catch:{ RuntimeException -> 0x00e2 }
            r4 = 0
            r3 = 0
        L_0x0021:
            if (r3 >= r6) goto L_0x0038
            java.lang.String r2 = "?"
            r0.append(r2)     // Catch:{ RuntimeException -> 0x00e2 }
            int r2 = r5.size()     // Catch:{ RuntimeException -> 0x00e2 }
            int r2 = r2 + -1
            if (r3 >= r2) goto L_0x0035
            java.lang.String r2 = ","
            r0.append(r2)     // Catch:{ RuntimeException -> 0x00e2 }
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0038:
            java.lang.String r2 = ")"
            r0.append(r2)     // Catch:{ RuntimeException -> 0x00e2 }
            java.lang.String r3 = "gallery_media_metadata"
            r2 = 23
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
            java.lang.String[] r9 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}     // Catch:{ RuntimeException -> 0x00e2 }
            java.lang.String r8 = r0.toString()     // Catch:{ RuntimeException -> 0x00e2 }
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x00e2 }
            java.lang.Object[] r7 = r5.toArray(r0)     // Catch:{ RuntimeException -> 0x00e2 }
            r0 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00e2 }
            r6.<init>(r0)     // Catch:{ RuntimeException -> 0x00e2 }
            java.lang.String r0 = "SELECT "
            r6.append(r0)     // Catch:{ RuntimeException -> 0x00e2 }
            r5 = 0
        L_0x008a:
            r4 = r9[r5]     // Catch:{ RuntimeException -> 0x00e2 }
            if (r5 <= 0) goto L_0x0093
            java.lang.String r0 = ", "
            r6.append(r0)     // Catch:{ RuntimeException -> 0x00e2 }
        L_0x0093:
            r6.append(r4)     // Catch:{ RuntimeException -> 0x00e2 }
            int r5 = r5 + 1
            if (r5 < r2) goto L_0x008a
            r0 = 32
            r6.append(r0)     // Catch:{ RuntimeException -> 0x00e2 }
            java.lang.String r0 = "FROM "
            r6.append(r0)     // Catch:{ RuntimeException -> 0x00e2 }
            r6.append(r3)     // Catch:{ RuntimeException -> 0x00e2 }
            java.lang.String r2 = " WHERE "
            if (r8 == 0) goto L_0x00b7
            int r0 = r8.length()     // Catch:{ RuntimeException -> 0x00e2 }
            if (r0 == 0) goto L_0x00b7
            r6.append(r2)     // Catch:{ RuntimeException -> 0x00e2 }
            r6.append(r8)     // Catch:{ RuntimeException -> 0x00e2 }
        L_0x00b7:
            java.lang.String r2 = r6.toString()     // Catch:{ RuntimeException -> 0x00e2 }
            X.0qQ.A07(r2)     // Catch:{ RuntimeException -> 0x00e2 }
            X.1W8 r0 = new X.1W8     // Catch:{ RuntimeException -> 0x00e2 }
            r0.<init>(r2, r7)     // Catch:{ RuntimeException -> 0x00e2 }
            r2 = r29
            android.database.Cursor r3 = r2.E5j(r0)     // Catch:{ RuntimeException -> 0x00e2 }
        L_0x00c9:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00d7
            X.8aI r0 = X.C358048aH.A00(r3)     // Catch:{ all -> 0x00db }
            r1.add(r0)     // Catch:{ all -> 0x00db }
            goto L_0x00c9
        L_0x00d7:
            r3.close()     // Catch:{ RuntimeException -> 0x00e2 }
            return r1
        L_0x00db:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            X.1zE.A00(r3, r2)     // Catch:{ RuntimeException -> 0x00e2 }
            throw r0     // Catch:{ RuntimeException -> 0x00e2 }
        L_0x00e2:
            r2 = move-exception
            java.lang.String r0 = "GalleryMediaMetadataDatabaseAccessHelper#fetchAll"
            X.0wb.A07(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0E.A00(X.1W6, java.util.List):java.util.List");
    }
}
