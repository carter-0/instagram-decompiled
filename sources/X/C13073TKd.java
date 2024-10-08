package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.TKd  reason: case insensitive filesystem */
public final class C13073TKd implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C307706Rd A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C13073TKd(Context context, C307706Rd r2, Integer num, String str, String str2, String str3, List list) {
        this.A01 = r2;
        this.A00 = context;
        this.A06 = list;
        this.A04 = str;
        this.A02 = num;
        this.A03 = str2;
        this.A05 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02b8, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r13 == null) goto L_0x008b;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x023a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r7 = r34
            X.6Rd r3 = r7.A01
            X.6Re r9 = r3.A00
            android.content.Context r0 = r7.A00
            r33 = r0
            java.util.List r0 = r7.A06
            if (r0 == 0) goto L_0x002a
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0016:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0016
            r4.add(r0)
            goto L_0x0016
        L_0x002a:
            X.0sn r4 = X.0sn.A00
        L_0x002c:
            java.lang.String r8 = r7.A04
            r26 = 3
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r26)
            int r5 = r6.length
            r2 = 0
        L_0x0036:
            if (r2 >= r5) goto L_0x0052
            r1 = r6[r2]
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x004c;
                case 2: goto L_0x0050;
                default: goto L_0x0041;
            }
        L_0x0041:
            java.lang.String r0 = "image"
        L_0x0043:
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x0054
            int r2 = r2 + 1
            goto L_0x0036
        L_0x004c:
            java.lang.String r0 = "video"
            goto L_0x0043
        L_0x0050:
            r0 = 0
            goto L_0x0043
        L_0x0052:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0054:
            java.lang.Integer r0 = r7.A02
            r20 = r0
            java.lang.String r13 = r7.A03
            java.lang.String r2 = r7.A05
            r8 = 1
            X.PmN r25 = new X.PmN
            r0 = r25
            r0.<init>(r2, r3, r8)
            java.lang.String r7 = "height"
            java.lang.String r6 = "width"
            r2 = 0
            X.0qQ.A0B(r4, r8)
            r15 = 5
            android.content.Context r0 = r33.getApplicationContext()
            android.content.ContentResolver r19 = r0.getContentResolver()
            java.lang.String r0 = "external"
            android.net.Uri r5 = android.provider.MediaStore.Files.getContentUri(r0)
            java.util.List r0 = r9.A01
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0117
            java.lang.Integer r0 = r9.A00
            if (r0 != r1) goto L_0x0117
            r3 = 0
            if (r13 != 0) goto L_0x0090
        L_0x008b:
            java.util.List r0 = r9.A02
            r0.clear()
        L_0x0090:
            r9.A01 = r4
            r9.A00 = r1
            X.0qQ.A0A(r19)
            X.0qQ.A0A(r5)
            r18 = 0
            if (r3 == 0) goto L_0x00a0
            r13 = r18
        L_0x00a0:
            java.lang.String r11 = "_id"
            java.lang.String r10 = "media_type"
            java.lang.String r3 = "date_added"
            java.lang.String[] r12 = new java.lang.String[]{r11, r10, r6, r7, r3}
            boolean r0 = X.RTC.A00()
            if (r0 == 0) goto L_0x00bc
            java.lang.String r14 = "duration"
            r0 = 6
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r0)
            r12[r15] = r14
            java.lang.String[] r12 = (java.lang.String[]) r12
        L_0x00bc:
            java.lang.String r15 = X.RTD.A00(r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            if (r13 == 0) goto L_0x00d1
            java.lang.String r14 = " AND "
            java.lang.String r0 = "_id < ?"
            java.lang.String r15 = X.002.A0g(r15, r14, r0)
            r1.add(r13)
        L_0x00d1:
            boolean r0 = X.RTC.A00()
            if (r0 == 0) goto L_0x0127
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x0127
            java.lang.StringBuilder r13 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r17 = r4.iterator()
            r16 = 0
        L_0x00e7:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x011a
            java.lang.Object r0 = r17.next()
            int r14 = r16 + 1
            if (r16 >= 0) goto L_0x00fd
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fd:
            int r4 = X.AnonymousClass7TE.A0M(r0)
            if (r16 <= 0) goto L_0x0108
            java.lang.String r0 = " OR "
            r13.append(r0)
        L_0x0108:
            java.lang.String r0 = "bucket_id = ?"
            r13.append(r0)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r1.add(r0)
            r16 = r14
            goto L_0x00e7
        L_0x0117:
            r3 = 1
            goto L_0x008b
        L_0x011a:
            java.lang.StringBuilder r4 = X.AnonymousClass7TF.A0n(r15)
            java.lang.String r0 = " AND ("
            r4.append(r0)
            java.lang.String r15 = X.AnonymousClass7TG.A0n(r13, r4)
        L_0x0127:
            boolean r0 = X.RTC.A00()
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = " AND is_pending = ?"
            java.lang.String r15 = X.002.A0R(r15, r0)
            java.lang.String r0 = "0"
            r1.add(r0)
        L_0x0138:
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r14 = r1.toArray(r0)
            java.lang.String[] r14 = (java.lang.String[]) r14
            java.lang.String r1 = "date_added DESC, _id DESC"
            java.lang.String r2 = "\n      "
            java.lang.String r13 = ",\n        |projection = "
            java.lang.String r16 = "Querying media:\n        |uri = "
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "android:query-arg-sql-selection"
            r4.putString(r0, r15)
            java.lang.String r0 = "android:query-arg-sql-selection-args"
            r4.putStringArray(r0, r14)
            java.lang.String r0 = "android:query-arg-sql-sort-order"
            r4.putString(r0, r1)
            if (r20 == 0) goto L_0x0166
            int r1 = r20.intValue()
            java.lang.String r0 = "android:query-arg-limit"
            r4.putInt(r0, r1)
        L_0x0166:
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r16)
            r1.append(r5)
            r1.append(r13)
            java.lang.String r0 = java.util.Arrays.toString(r12)
            X.0qQ.A07(r0)
            r1.append(r0)
            java.lang.String r0 = "\n        |queryArgs = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r2, r1)
            java.lang.String r0 = "|"
            X.0rw.A0u(r1, r0)
            r2 = -138324669(0xfffffffff7c15543, float:-7.8425204E33)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r5 == 0) goto L_0x01a5
            java.lang.String r0 = r5.getAuthority()
        L_0x0197:
            X.0Um.A00(r0, r2, r1)
            r1 = r19
            r0 = r18
            android.database.Cursor r4 = r1.query(r5, r12, r4, r0)
            if (r4 == 0) goto L_0x02bf
            goto L_0x01a7
        L_0x01a5:
            r0 = 0
            goto L_0x0197
        L_0x01a7:
            int r24 = r4.getColumnIndex(r11)     // Catch:{ all -> 0x02b5 }
            int r23 = r4.getColumnIndex(r10)     // Catch:{ all -> 0x02b5 }
            int r22 = r4.getColumnIndex(r6)     // Catch:{ all -> 0x02b5 }
            int r21 = r4.getColumnIndex(r7)     // Catch:{ all -> 0x02b5 }
            int r20 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x02b5 }
            boolean r0 = X.RTC.A00()     // Catch:{ all -> 0x02b5 }
            java.lang.String r3 = "duration"
            if (r0 == 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            r2 = -1
            goto L_0x01ca
        L_0x01c6:
            int r2 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x02b5 }
        L_0x01ca:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x02b5 }
            java.lang.String r14 = "id"
            java.lang.String r13 = ""
            if (r0 == 0) goto L_0x0286
            r0 = r24
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x02b5 }
            r10 = r23
            int r15 = r4.getInt(r10)     // Catch:{ all -> 0x02b5 }
            r10 = r22
            int r11 = r4.getInt(r10)     // Catch:{ all -> 0x02b5 }
            r10 = r21
            int r19 = r4.getInt(r10)     // Catch:{ all -> 0x02b5 }
            r10 = r20
            long r17 = r4.getLong(r10)     // Catch:{ all -> 0x02b5 }
            X.6QE r10 = X.AnonymousClass6QE.A02     // Catch:{ all -> 0x02b5 }
            android.net.Uri r10 = android.content.ContentUris.withAppendedId(r5, r0)     // Catch:{ all -> 0x02b5 }
            X.0qQ.A07(r10)     // Catch:{ all -> 0x02b5 }
            android.net.Uri r10 = X.AnonymousClass6QJ.A00(r10)     // Catch:{ all -> 0x02b5 }
            java.lang.String r12 = X.DbT.A10(r10)     // Catch:{ all -> 0x02b5 }
            r10 = r26
            if (r15 == r10) goto L_0x020c
            r16 = 0
            if (r15 != r8) goto L_0x0240
            goto L_0x023e
        L_0x020c:
            boolean r10 = X.RTC.A00()     // Catch:{ all -> 0x02b5 }
            if (r10 == 0) goto L_0x021e
            long r15 = r4.getLong(r2)     // Catch:{ all -> 0x02b5 }
            java.lang.Long r16 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x02b5 }
        L_0x021a:
            java.lang.String r13 = "video"
            goto L_0x0240
        L_0x021e:
            android.media.MediaMetadataRetriever r15 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x02b5 }
            r15.<init>()     // Catch:{ all -> 0x02b5 }
            r16 = 0
            android.net.Uri r13 = X.0cp.A03(r12)     // Catch:{ all -> 0x023a }
            r10 = r33
            r15.setDataSource(r10, r13)     // Catch:{ all -> 0x023a }
            r10 = 9
            java.lang.String r10 = r15.extractMetadata(r10)     // Catch:{ all -> 0x023a }
            if (r10 == 0) goto L_0x023a
            java.lang.Long r16 = X.AnonymousClass7TE.A10(r10)     // Catch:{ all -> 0x023a }
        L_0x023a:
            r15.release()     // Catch:{ all -> 0x021a }
            goto L_0x021a
        L_0x023e:
            java.lang.String r13 = "image"
        L_0x0240:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02b5 }
            X.0eP r27 = X.AnonymousClass7TE.A1L(r14, r0)     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = "url"
            X.0eP r28 = X.AnonymousClass7TE.A1L(r0, r12)     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = "type"
            X.0eP r29 = X.AnonymousClass7TE.A1L(r0, r13)     // Catch:{ all -> 0x02b5 }
            X.0eP r30 = X.AnonymousClass7TF.A0x(r6, r11)     // Catch:{ all -> 0x02b5 }
            r0 = r19
            X.0eP r31 = X.AnonymousClass7TF.A0x(r7, r0)     // Catch:{ all -> 0x02b5 }
            java.lang.String r1 = "creation_datetime"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x02b5 }
            X.0eP r32 = X.AnonymousClass7TE.A1L(r1, r0)     // Catch:{ all -> 0x02b5 }
            X.0eP[] r0 = new X.0eP[]{r27, r28, r29, r30, r31, r32}     // Catch:{ all -> 0x02b5 }
            java.util.LinkedHashMap r10 = X.0Yt.A07(r0)     // Catch:{ all -> 0x02b5 }
            if (r16 == 0) goto L_0x027f
            long r0 = r16.longValue()     // Catch:{ all -> 0x02b5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02b5 }
            r10.put(r3, r0)     // Catch:{ all -> 0x02b5 }
        L_0x027f:
            java.util.List r0 = r9.A02     // Catch:{ all -> 0x02b5 }
            r0.add(r10)     // Catch:{ all -> 0x02b5 }
            goto L_0x01ca
        L_0x0286:
            java.util.List r0 = r9.A02     // Catch:{ all -> 0x02b5 }
            java.util.List r1 = X.00k.A0a(r0)     // Catch:{ all -> 0x02b5 }
            java.lang.Object r0 = X.00k.A0L(r1)     // Catch:{ all -> 0x02b5 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x02b5 }
            if (r0 == 0) goto L_0x029a
            java.lang.Object r2 = r0.get(r14)     // Catch:{ all -> 0x02b5 }
            if (r2 != 0) goto L_0x029b
        L_0x029a:
            r2 = r13
        L_0x029b:
            r0 = 170(0xaa, float:2.38E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x02b5 }
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = "last_id"
            X.0eP[] r0 = X.JTQ.A1b(r0, r2, r1)     // Catch:{ all -> 0x02b5 }
            java.util.LinkedHashMap r1 = X.0Yt.A06(r0)     // Catch:{ all -> 0x02b5 }
            r0 = r25
            r0.invoke(r1)     // Catch:{ all -> 0x02b5 }
            goto L_0x02bc
        L_0x02b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02b7 }
        L_0x02b7:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        L_0x02bc:
            r4.close()
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13073TKd.run():void");
    }
}
