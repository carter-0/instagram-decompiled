package X;

public final class KIZ extends 0ng {
    public final /* synthetic */ C64097LMr A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIZ(C64097LMr lMr) {
        super(440, 3, false, false);
        this.A00 = lMr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0251, code lost:
        if (r3.size() == X.DbS.A05(r5.getValue())) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.1zE.A00(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bb, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de A[Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1, all -> 0x01c3 }, LOOP:0: B:13:0x006f->B:38:0x00de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012d A[Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162, all -> 0x01ac }, LOOP:1: B:57:0x0127->B:59:0x012d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0156 A[LOOP:2: B:62:0x0150->B:64:0x0156, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            java.lang.String r11 = "video_pdq_report_hash_calculation_error"
            java.lang.String r19 = "video_pdq_report_hash_upload_error"
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            r6 = r26
            X.LMr r8 = r6.A00
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            X.0wc r0 = r8.A00
            r20 = r0
            X.3Q2 r0 = r8.A03
            java.lang.String r2 = r0.A3t
            com.instagram.common.session.UserSession r1 = r8.A01
            java.lang.String r1 = r1.A06
            r24 = r1
            java.lang.Integer r21 = X.AnonymousClass05K.A0u
            r17 = 0
            r23 = r2
            r25 = r17
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)
            java.io.File r5 = X.AnonymousClass457.A06()
            r9 = 0
            X.04u r4 = new X.04u
            r4.<init>(r9)
            java.lang.String r3 = r5.getPath()
            r2 = 1
            X.Lc6 r1 = new X.Lc6
            r1.<init>(r2, r5, r6)
            X.0mb.A01(r1, r3, r4)
            com.instagram.pendingmedia.model.ClipInfo r2 = r0.A1N
            com.instagram.pendingmedia.model.ClipInfo r1 = X.C376399Hv.A00()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x01cf
            java.lang.String r15 = "video_pdq_report_bitmap_compress_error"
            java.lang.String r16 = "video_pdq_report_video_loading_error"
            android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever
            r5.<init>()
            com.instagram.pendingmedia.model.ClipInfo r1 = r0.A1N     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            java.lang.String r1 = r1.A0F     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x00e8
            r5.setDataSource(r1)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            r1 = 9
            java.lang.String r1 = r5.extractMetadata(r1)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            if (r1 == 0) goto L_0x00e3
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            int r7 = r1 / 1000
            if (r7 < 0) goto L_0x0110
            r6 = 0
        L_0x006f:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            r1 = 1
            long r3 = r3.toMicros(r1)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            long r1 = (long) r6     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            long r3 = r3 * r1
            r1 = 3
            android.graphics.Bitmap r10 = r5.getFrameAtTime(r3, r1)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            if (r10 == 0) goto L_0x00dc
            java.io.File r14 = X.AnonymousClass457.A06()     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            java.lang.String r13 = "original_frame_capture_"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            java.lang.String r12 = ".jpeg"
            java.lang.String r1 = X.002.A0e(r13, r12, r1)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            java.io.File r13 = X.JTO.A0s(r14, r1)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            java.io.FileOutputStream r12 = X.JTO.A0t(r13)     // Catch:{ OutOfMemoryError -> 0x00be, Exception -> 0x00bc }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00b5 }
            X.JZK.A00(r1, r10, r12)     // Catch:{ all -> 0x00b5 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x00b5 }
            long r1 = r1.toMillis(r3)     // Catch:{ all -> 0x00b5 }
            java.lang.String r4 = X.JTP.A0u(r13)     // Catch:{ all -> 0x00b5 }
            X.L6v r3 = new X.L6v     // Catch:{ all -> 0x00b5 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x00b5 }
            r1 = r18
            r1.add(r3)     // Catch:{ all -> 0x00b5 }
            r12.close()     // Catch:{ OutOfMemoryError -> 0x00be, Exception -> 0x00bc }
            goto L_0x00d9
        L_0x00b5:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            X.1zE.A00(r12, r2)     // Catch:{ OutOfMemoryError -> 0x00be, Exception -> 0x00bc }
            throw r1     // Catch:{ OutOfMemoryError -> 0x00be, Exception -> 0x00bc }
        L_0x00bc:
            r2 = move-exception
            goto L_0x00cb
        L_0x00be:
            r2 = move-exception
            java.lang.String r1 = r0.A3t     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r21 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00e1 }
            r23 = r1
            r25 = r15
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d6
        L_0x00cb:
            java.lang.String r1 = r0.A3t     // Catch:{ all -> 0x00e1 }
            java.lang.Integer r21 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00e1 }
            r23 = r1
            r25 = r15
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x00e1 }
        L_0x00d6:
            X.0wb.A07(r15, r2)     // Catch:{ all -> 0x00e1 }
        L_0x00d9:
            r10.recycle()     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
        L_0x00dc:
            if (r6 == r7) goto L_0x0110
            int r6 = r6 + 1
            goto L_0x006f
        L_0x00e1:
            r1 = move-exception
            goto L_0x00ed
        L_0x00e3:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            goto L_0x00f0
        L_0x00e8:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
            goto L_0x00f0
        L_0x00ed:
            r10.recycle()     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
        L_0x00f0:
            throw r1     // Catch:{ OutOfMemoryError -> 0x00f3, Exception -> 0x00f1 }
        L_0x00f1:
            r2 = move-exception
            goto L_0x0100
        L_0x00f3:
            r2 = move-exception
            java.lang.String r1 = r0.A3t     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r21 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x01c3 }
            r23 = r1
            r25 = r16
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x01c3 }
            goto L_0x010b
        L_0x0100:
            java.lang.String r1 = r0.A3t     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r21 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x01c3 }
            r23 = r1
            r25 = r16
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x01c3 }
        L_0x010b:
            r1 = r16
            X.0wb.A07(r1, r2)     // Catch:{ all -> 0x01c3 }
        L_0x0110:
            r5.release()     // Catch:{ all -> 0x0114 }
            goto L_0x011a
        L_0x0114:
            r2 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r2)
        L_0x011a:
            X.Kvf r1 = com.instagram.pdqhashing.PDQHashingBridge.Companion     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            java.lang.String r1 = "pdqhashing"
            com.instagram.pdqhashing.PDQHashingBridge r5 = new com.instagram.pdqhashing.PDQHashingBridge     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            r5.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            java.util.Iterator r4 = r18.iterator()     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
        L_0x0127:
            boolean r1 = r4.hasNext()     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            if (r1 == 0) goto L_0x0141
            java.lang.Object r3 = r4.next()     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            X.L6v r3 = (X.C63789L6v) r3     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            java.lang.String r2 = r3.A02     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            r1 = r17
            java.lang.String r1 = r5.getHashWithQuality(r2, r9, r1)     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            r3.A00 = r1     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            X.0mb.A08(r2)     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            goto L_0x0127
        L_0x0141:
            java.lang.String r1 = r0.A3t     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            java.lang.Integer r21 = X.AnonymousClass05K.A1F     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            r23 = r1
            r25 = r17
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)     // Catch:{ OutOfMemoryError -> 0x0187, Exception -> 0x0162 }
            java.util.Iterator r2 = r18.iterator()
        L_0x0150:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01cf
            java.lang.Object r1 = r2.next()
            X.L6v r1 = (X.C63789L6v) r1
            java.lang.String r1 = r1.A02
            X.0mb.A08(r1)
            goto L_0x0150
        L_0x0162:
            r2 = move-exception
            java.lang.String r1 = r0.A3t     // Catch:{ all -> 0x01ac }
            java.lang.Integer r21 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x01ac }
            java.lang.String r25 = "hash_calc_error"
            r23 = r1
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x01ac }
            X.0wb.A07(r11, r2)     // Catch:{ all -> 0x01ac }
            java.util.Iterator r2 = r18.iterator()
        L_0x0175:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01cf
            java.lang.Object r1 = r2.next()
            X.L6v r1 = (X.C63789L6v) r1
            java.lang.String r1 = r1.A02
            X.0mb.A08(r1)
            goto L_0x0175
        L_0x0187:
            r2 = move-exception
            java.lang.String r1 = r0.A3t     // Catch:{ all -> 0x01ac }
            java.lang.Integer r21 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x01ac }
            java.lang.String r25 = "hash_calc_error"
            r23 = r1
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x01ac }
            X.0wb.A07(r11, r2)     // Catch:{ all -> 0x01ac }
            java.util.Iterator r2 = r18.iterator()
        L_0x019a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01cf
            java.lang.Object r1 = r2.next()
            X.L6v r1 = (X.C63789L6v) r1
            java.lang.String r1 = r1.A02
            X.0mb.A08(r1)
            goto L_0x019a
        L_0x01ac:
            r2 = move-exception
            java.util.Iterator r1 = r18.iterator()
        L_0x01b1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0234
            java.lang.Object r0 = r1.next()
            X.L6v r0 = (X.C63789L6v) r0
            java.lang.String r0 = r0.A02
            X.0mb.A08(r0)
            goto L_0x01b1
        L_0x01c3:
            r2 = move-exception
            r5.release()     // Catch:{ all -> 0x01c8 }
            throw r2
        L_0x01c8:
            r1 = move-exception
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
            throw r2
        L_0x01cf:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.lang.String r1 = r0.A3t
            java.lang.Integer r21 = X.AnonymousClass05K.A15
            r25 = 0
            r23 = r1
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)
            X.51W r2 = r0.A1P
            if (r2 == 0) goto L_0x0214
            X.0eM r1 = r2.A06
            java.lang.Object r1 = r1.getValue()
            boolean r1 = X.G9w.A1b(r1)
            if (r1 == 0) goto L_0x0214
            X.0eM r5 = r2.A06
            java.util.List r1 = X.JTO.A15(r5)
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0q(r1, r9)
            java.util.Iterator r2 = r1.iterator()
        L_0x01fc:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0242
            X.51M r1 = X.JTO.A0g(r2)
            X.51R r1 = r1.A0F
            java.lang.String r1 = r1.A0F
            java.lang.String r1 = X.C9840RiC.A00(r1)
            if (r1 == 0) goto L_0x01fc
            r4.add(r1)
            goto L_0x01fc
        L_0x0214:
            com.instagram.pendingmedia.model.ClipInfo r2 = r0.A1N
            com.instagram.pendingmedia.model.ClipInfo r1 = X.C376399Hv.A00()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0235
            com.instagram.pendingmedia.model.ClipInfo r1 = r0.A1N
            java.lang.String r1 = r1.A0F
            if (r1 == 0) goto L_0x0230
            java.lang.String r1 = X.C9840RiC.A00(r1)
            if (r1 == 0) goto L_0x0235
            r3.add(r1)
            goto L_0x0253
        L_0x0230:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
        L_0x0234:
            throw r2
        L_0x0235:
            boolean r1 = X.DbT.A1b(r3)
            if (r1 == 0) goto L_0x027b
            java.lang.String r1 = r0.A3t
            java.lang.Integer r21 = X.AnonymousClass05K.A02
        L_0x023f:
            java.lang.String r25 = "hash_calc_error"
            goto L_0x0257
        L_0x0242:
            r3.addAll(r4)
            int r2 = r3.size()
            java.lang.Object r1 = r5.getValue()
            int r1 = X.DbS.A05(r1)
            if (r2 != r1) goto L_0x0235
        L_0x0253:
            java.lang.String r1 = r0.A3t
            java.lang.Integer r21 = X.AnonymousClass05K.A1I
        L_0x0257:
            r23 = r1
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)
            boolean r1 = X.DbT.A1b(r18)
            if (r1 != 0) goto L_0x0280
            boolean r1 = X.DbT.A1b(r3)
            if (r1 != 0) goto L_0x0280
            java.lang.String r0 = r0.A3t
            java.lang.Integer r21 = X.AnonymousClass05K.A0C
            java.lang.String r25 = "null_image_file"
            r23 = r0
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)
            java.lang.String r1 = "video_pdq_report_null_video_file_error"
            java.lang.String r0 = "null_video_file"
            X.0wb.A03(r1, r0)
            return
        L_0x027b:
            java.lang.String r1 = r0.A3t
            java.lang.Integer r21 = X.AnonymousClass05K.A0Y
            goto L_0x023f
        L_0x0280:
            r1 = r18
            X.C64097LMr.A00(r8, r1, r3)     // Catch:{ IOException | JSONException -> 0x0286 }
            goto L_0x0298
        L_0x0286:
            r1 = move-exception
            java.lang.String r0 = r0.A3t
            java.lang.Integer r21 = X.AnonymousClass05K.A0C
            java.lang.String r25 = "hash_upload_error"
            r23 = r0
            X.C63376Kvx.A00(r20, r21, r22, r23, r24, r25)
            r0 = r19
            X.0wb.A07(r0, r1)
            return
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIZ.run():void");
    }
}
