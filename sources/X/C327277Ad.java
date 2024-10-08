package X;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import java.util.ArrayList;

/* renamed from: X.7Ad  reason: invalid class name and case insensitive filesystem */
public final class C327277Ad implements C327287Ae {
    public final Context A00;
    public final String A01;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:7:0x0071=Splitter:B:7:0x0071, B:16:0x00e3=Splitter:B:16:0x00e3} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair A00(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            android.content.Context r0 = r1.A00
            X.Xwk r10 = X.C22178Xwk.A00(r0)
            java.lang.String r4 = r1.A01
            boolean r0 = r4.isEmpty()
            r8 = 0
            java.lang.String r11 = "live_location_sessions "
            if (r0 == 0) goto L_0x0082
            r1 = 0
            java.lang.String r2 = "_id"
            java.lang.String r0 = "start_time_millis"
            r6 = 1
            java.lang.String[] r12 = new java.lang.String[]{r2, r0}
            java.lang.String r13 = "groupish_id = ?"
            java.lang.String r0 = java.lang.String.valueOf(r19)
            java.lang.String[] r14 = new java.lang.String[]{r0}
            r3 = 4
            r15 = 0
            r2 = 5
            r5 = 6
            r16 = r15
            r17 = r15
            java.lang.Object[] r4 = new java.lang.Object[]{r11, r12, r13, r14, r15, r16, r17}
            r0 = r4[r2]
            if (r0 == 0) goto L_0x0050
            android.database.sqlite.SQLiteDatabase r3 = r10.AWy()
            r2 = r4[r2]
            java.lang.String r2 = (java.lang.String) r2
            r0 = r4[r5]
            java.lang.String[] r0 = (java.lang.String[]) r0
            android.database.Cursor r0 = r3.rawQuery(r2, r0)
        L_0x0048:
            X.UIO r5 = new X.UIO
            r5.<init>(r0)
            r3 = 0
            goto L_0x0071
        L_0x0050:
            android.database.sqlite.SQLiteDatabase r10 = r10.AWy()
            r11 = r4[r1]
            java.lang.String r11 = (java.lang.String) r11
            r12 = r4[r6]
            java.lang.String[] r12 = (java.lang.String[]) r12
            r0 = 2
            r13 = r4[r0]
            java.lang.String r13 = (java.lang.String) r13
            r0 = 3
            r14 = r4[r0]
            java.lang.String[] r14 = (java.lang.String[]) r14
            r0 = r4[r3]
            java.lang.String r0 = (java.lang.String) r0
            r17 = r0
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0048
        L_0x0071:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00f4
            android.database.Cursor r2 = r5.A01     // Catch:{ all -> 0x0104 }
            long r8 = r2.getLong(r1)     // Catch:{ all -> 0x0104 }
            long r3 = r2.getLong(r6)     // Catch:{ all -> 0x0104 }
            goto L_0x0071
        L_0x0082:
            r2 = 0
            r7 = 2
            java.lang.String r3 = "_id"
            java.lang.String r0 = "start_time_millis"
            r1 = 1
            java.lang.String[] r12 = new java.lang.String[]{r3, r0}
            java.lang.String r13 = "groupish_id = ? AND user_alias_id = ?"
            java.lang.String r3 = java.lang.String.valueOf(r19)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String[] r14 = new java.lang.String[]{r3, r0}
            r4 = 4
            r15 = 0
            r3 = 5
            r6 = 6
            r16 = r15
            r17 = r15
            java.lang.Object[] r5 = new java.lang.Object[]{r11, r12, r13, r14, r15, r16, r17}
            r0 = r5[r3]
            if (r0 == 0) goto L_0x00c3
            android.database.sqlite.SQLiteDatabase r4 = r10.AWy()
            r3 = r5[r3]
            java.lang.String r3 = (java.lang.String) r3
            r0 = r5[r6]
            java.lang.String[] r0 = (java.lang.String[]) r0
            android.database.Cursor r0 = r4.rawQuery(r3, r0)
        L_0x00bb:
            X.UIP r5 = new X.UIP
            r5.<init>(r0)
            r3 = 0
            goto L_0x00e3
        L_0x00c3:
            android.database.sqlite.SQLiteDatabase r10 = r10.AWy()
            r11 = r5[r2]
            java.lang.String r11 = (java.lang.String) r11
            r12 = r5[r1]
            java.lang.String[] r12 = (java.lang.String[]) r12
            r13 = r5[r7]
            java.lang.String r13 = (java.lang.String) r13
            r0 = 3
            r14 = r5[r0]
            java.lang.String[] r14 = (java.lang.String[]) r14
            r0 = r5[r4]
            java.lang.String r0 = (java.lang.String) r0
            r17 = r0
            android.database.Cursor r0 = r10.query(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00bb
        L_0x00e3:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00f4
            android.database.Cursor r0 = r5.A01     // Catch:{ all -> 0x0104 }
            long r8 = r0.getLong(r2)     // Catch:{ all -> 0x0104 }
            long r3 = r0.getLong(r1)     // Catch:{ all -> 0x0104 }
            goto L_0x00e3
        L_0x00f4:
            r5.close()
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        L_0x0104:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0109 }
            throw r1
        L_0x0109:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327277Ad.A00(java.lang.String):android.util.Pair");
    }

    /* JADX INFO: finally extract failed */
    public final void AOa(C13919TlL tlL, String str) {
        C22178Xwk A002 = C22178Xwk.A00(this.A00);
        XZ2 xz2 = new XZ2();
        0ff.A01("DirectTransactionExecutor.startTransaction", 464807821);
        C22006Xqh xqh = new C22006Xqh(xz2, A002);
        xqh.A03();
        try {
            C21185XIf xIf = new C21185XIf();
            C10385RrM rrM = C22006Xqh.A00(xqh).A03.A00;
            Class<Y8Q> cls = Y8Q.class;
            ArrayList arrayList = rrM.A00;
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
            }
            rrM.A01.add(xIf);
            YAf yAf = ((C21182XIc) C21304XUn.A00(xIf, xqh)).A00;
            yAf.ENJ(0L, 0);
            yAf.ENJ((Long) A00(str).first, 1);
            yAf.ABj();
            xqh.A02();
            xqh.A01();
            tlL.onSuccess();
        } catch (Throwable th) {
            xqh.A01();
            throw th;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0147=Splitter:B:28:0x0147, B:8:0x0088=Splitter:B:8:0x0088} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AYi(X.C18983WFk r27, java.lang.String r28) {
        /*
            r26 = this;
            r0 = r26
            java.lang.String r5 = r0.A01
            boolean r7 = r5.isEmpty()
            android.content.Context r0 = r0.A00
            X.Xwk r10 = X.C22178Xwk.A00(r0)
            r8 = 7
            java.lang.String r19 = "live_location_sessions "
            r9 = 0
            java.lang.String r11 = "_id"
            java.lang.String r12 = "user_alias_id"
            r6 = 1
            r2 = 9
            r1 = 10
            r0 = 68
            java.lang.String r13 = X.XDX.A00(r2, r1, r0)
            r4 = 2
            java.lang.String r14 = "optimistic_session_id"
            r3 = 3
            java.lang.String r15 = "groupish_id"
            r2 = 4
            java.lang.String r16 = "start_time_millis"
            r0 = 5
            java.lang.String r17 = "expiration_time_millis"
            r1 = 6
            java.lang.String r18 = "message_id"
            java.lang.String[] r20 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18}
            if (r7 == 0) goto L_0x00ee
            java.lang.String r21 = "groupish_id = ? AND (expiration_time_millis > 0 OR expiration_time_millis = -1)"
            java.lang.String r5 = java.lang.String.valueOf(r28)
            java.lang.String[] r22 = new java.lang.String[]{r5}
            r7 = 0
            r23 = r7
            r24 = r7
            r25 = r7
            java.lang.Object[] r11 = new java.lang.Object[]{r19, r20, r21, r22, r23, r24, r25}
            r5 = r11[r0]
            if (r5 == 0) goto L_0x0063
            android.database.sqlite.SQLiteDatabase r10 = r10.AWy()
            r9 = r11[r0]
            java.lang.String r9 = (java.lang.String) r9
            r5 = r11[r1]
            java.lang.String[] r5 = (java.lang.String[]) r5
            android.database.Cursor r5 = r10.rawQuery(r9, r5)
        L_0x005f:
            if (r5 == 0) goto L_0x00e6
            r10 = 0
            goto L_0x0088
        L_0x0063:
            android.database.sqlite.SQLiteDatabase r12 = r10.AWy()
            r13 = r11[r9]
            java.lang.String r13 = (java.lang.String) r13
            r14 = r11[r6]
            java.lang.String[] r14 = (java.lang.String[]) r14
            r15 = r11[r4]
            java.lang.String r15 = (java.lang.String) r15
            r9 = r11[r3]
            java.lang.String[] r9 = (java.lang.String[]) r9
            r5 = r11[r2]
            java.lang.String r5 = (java.lang.String) r5
            r17 = r7
            r18 = r7
            r19 = r5
            r16 = r9
            android.database.Cursor r5 = r12.query(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x005f
        L_0x0088:
            boolean r9 = r5.isClosed()     // Catch:{ all -> 0x01be }
            if (r9 != 0) goto L_0x00d0
            boolean r9 = r5.moveToNext()     // Catch:{ all -> 0x01be }
            if (r9 == 0) goto L_0x00cb
            long r15 = r5.getLong(r1)     // Catch:{ all -> 0x01be }
            java.lang.String r11 = r5.getString(r2)     // Catch:{ all -> 0x01be }
            java.lang.String r9 = "groupishId"
            X.C11367SPk.A03(r11, r9)     // Catch:{ all -> 0x01be }
            java.lang.String r13 = r5.getString(r4)     // Catch:{ all -> 0x01be }
            java.lang.String r9 = "sessionId"
            X.C11367SPk.A03(r13, r9)     // Catch:{ all -> 0x01be }
            java.lang.String r14 = r5.getString(r6)     // Catch:{ all -> 0x01be }
            java.lang.String r9 = "userAliasId"
            X.C11367SPk.A03(r14, r9)     // Catch:{ all -> 0x01be }
            long r17 = r5.getLong(r0)     // Catch:{ all -> 0x01be }
            int r9 = r5.getInt(r3)     // Catch:{ all -> 0x01be }
            r19 = 0
            if (r9 == 0) goto L_0x00c1
            r19 = 1
        L_0x00c1:
            java.lang.String r12 = r5.getString(r8)     // Catch:{ all -> 0x01be }
            com.facebook.locationsharing.core.models.LiveLocationSession r10 = new com.facebook.locationsharing.core.models.LiveLocationSession     // Catch:{ all -> 0x01be }
            r10.<init>(r11, r12, r13, r14, r15, r17, r19)     // Catch:{ all -> 0x01be }
            goto L_0x0088
        L_0x00cb:
            r5.close()
            goto L_0x018d
        L_0x00d0:
            java.lang.String r1 = android.util.Log.getStackTraceString(r7)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "AbstractDAOItem"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "Can't access DAO when it is already closed: "
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x01be }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01be }
            r0.<init>(r1)     // Catch:{ all -> 0x01be }
            goto L_0x01bd
        L_0x00e6:
            java.lang.String r1 = "cursor is null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            java.lang.String r21 = "groupish_id = ? AND user_alias_id = ? AND (expiration_time_millis > 0 OR expiration_time_millis = -1)"
            java.lang.String r7 = java.lang.String.valueOf(r28)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String[] r22 = new java.lang.String[]{r7, r5}
            r7 = 0
            r23 = r7
            r24 = r7
            r25 = r7
            java.lang.Object[] r12 = new java.lang.Object[]{r19, r20, r21, r22, r23, r24, r25}
            r5 = r12[r0]
            if (r5 == 0) goto L_0x011f
            android.database.sqlite.SQLiteDatabase r10 = r10.AWy()
            r9 = r12[r0]
            java.lang.String r9 = (java.lang.String) r9
            r5 = r12[r1]
            java.lang.String[] r5 = (java.lang.String[]) r5
            android.database.Cursor r5 = r10.rawQuery(r9, r5)
        L_0x011b:
            if (r5 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x0147
        L_0x011f:
            android.database.sqlite.SQLiteDatabase r13 = r10.AWy()
            r14 = r12[r9]
            java.lang.String r14 = (java.lang.String) r14
            r11 = r12[r6]
            java.lang.String[] r11 = (java.lang.String[]) r11
            r10 = r12[r4]
            java.lang.String r10 = (java.lang.String) r10
            r9 = r12[r3]
            java.lang.String[] r9 = (java.lang.String[]) r9
            r5 = r12[r2]
            java.lang.String r5 = (java.lang.String) r5
            r15 = r11
            r16 = r10
            r17 = r9
            r18 = r7
            r19 = r7
            r20 = r5
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x011b
        L_0x0147:
            boolean r9 = r5.isClosed()     // Catch:{ all -> 0x01be }
            if (r9 != 0) goto L_0x01a9
            boolean r9 = r5.moveToNext()     // Catch:{ all -> 0x01be }
            if (r9 == 0) goto L_0x018a
            long r15 = r5.getLong(r1)     // Catch:{ all -> 0x01be }
            java.lang.String r11 = r5.getString(r2)     // Catch:{ all -> 0x01be }
            java.lang.String r9 = "groupishId"
            X.C11367SPk.A03(r11, r9)     // Catch:{ all -> 0x01be }
            java.lang.String r13 = r5.getString(r4)     // Catch:{ all -> 0x01be }
            java.lang.String r9 = "sessionId"
            X.C11367SPk.A03(r13, r9)     // Catch:{ all -> 0x01be }
            java.lang.String r14 = r5.getString(r6)     // Catch:{ all -> 0x01be }
            java.lang.String r9 = "userAliasId"
            X.C11367SPk.A03(r14, r9)     // Catch:{ all -> 0x01be }
            long r17 = r5.getLong(r0)     // Catch:{ all -> 0x01be }
            int r9 = r5.getInt(r3)     // Catch:{ all -> 0x01be }
            r19 = 0
            if (r9 == 0) goto L_0x0180
            r19 = 1
        L_0x0180:
            java.lang.String r12 = r5.getString(r8)     // Catch:{ all -> 0x01be }
            com.facebook.locationsharing.core.models.LiveLocationSession r10 = new com.facebook.locationsharing.core.models.LiveLocationSession     // Catch:{ all -> 0x01be }
            r10.<init>(r11, r12, r13, r14, r15, r17, r19)     // Catch:{ all -> 0x01be }
            goto L_0x0147
        L_0x018a:
            r5.close()
        L_0x018d:
            r5 = r27
            if (r10 == 0) goto L_0x01a5
            long r3 = r10.A00
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01a1
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
        L_0x01a1:
            r5.onSuccess(r10)
            return
        L_0x01a5:
            r5.A00(r7)
            return
        L_0x01a9:
            java.lang.String r1 = android.util.Log.getStackTraceString(r7)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "AbstractDAOItem"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "Can't access DAO when it is already closed: "
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x01be }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01be }
            r0.<init>(r1)     // Catch:{ all -> 0x01be }
        L_0x01bd:
            throw r0     // Catch:{ all -> 0x01be }
        L_0x01be:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x01c3 }
            throw r1
        L_0x01c3:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        L_0x01c8:
            java.lang.String r1 = "cursor is null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327277Ad.AYi(X.WFk, java.lang.String):void");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x017c=Splitter:B:30:0x017c, B:9:0x008d=Splitter:B:9:0x008d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AYj(X.C13920TlM r30) {
        /*
            r29 = this;
            r0 = r29
            java.lang.String r4 = r0.A01
            boolean r1 = r4.isEmpty()
            com.google.common.collect.ImmutableList$Builder r12 = com.google.common.collect.ImmutableList.builder()
            android.content.Context r0 = r0.A00
            X.Xwk r6 = X.C22178Xwk.A00(r0)
            r11 = 7
            java.lang.String r21 = "live_location_sessions "
            r5 = 0
            if (r1 == 0) goto L_0x0101
            java.lang.String r13 = "_id"
            java.lang.String r14 = "user_alias_id"
            r10 = 1
            r2 = 9
            r1 = 10
            r0 = 68
            java.lang.String r15 = X.XDX.A00(r2, r1, r0)
            r9 = 2
            java.lang.String r16 = "optimistic_session_id"
            r3 = 3
            java.lang.String r17 = "groupish_id"
            r2 = 4
            java.lang.String r18 = "start_time_millis"
            r0 = 5
            java.lang.String r19 = "expiration_time_millis"
            r1 = 6
            java.lang.String r20 = "message_id"
            java.lang.String[] r22 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19, r20}
            java.lang.String r23 = "expiration_time_millis > 0 OR expiration_time_millis = -1"
            r18 = 0
            r24 = r18
            r25 = r18
            r26 = r18
            r27 = r18
            java.lang.Object[] r7 = new java.lang.Object[]{r21, r22, r23, r24, r25, r26, r27}
            r4 = r7[r0]
            if (r4 == 0) goto L_0x0068
            android.database.sqlite.SQLiteDatabase r6 = r6.AWy()
            r5 = r7[r0]
            java.lang.String r5 = (java.lang.String) r5
            r4 = r7[r1]
            java.lang.String[] r4 = (java.lang.String[]) r4
            android.database.Cursor r7 = r6.rawQuery(r5, r4)
        L_0x005e:
            if (r7 != 0) goto L_0x008d
            java.lang.String r1 = "cursor is null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0068:
            android.database.sqlite.SQLiteDatabase r13 = r6.AWy()
            r14 = r7[r5]
            java.lang.String r14 = (java.lang.String) r14
            r15 = r7[r10]
            java.lang.String[] r15 = (java.lang.String[]) r15
            r6 = r7[r9]
            java.lang.String r6 = (java.lang.String) r6
            r5 = r7[r3]
            java.lang.String[] r5 = (java.lang.String[]) r5
            r4 = r7[r2]
            java.lang.String r4 = (java.lang.String) r4
            r16 = r6
            r17 = r5
            r19 = r18
            r20 = r4
            android.database.Cursor r7 = r13.query(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x005e
        L_0x008d:
            boolean r4 = r7.isClosed()     // Catch:{ all -> 0x01fc }
            if (r4 != 0) goto L_0x00eb
            boolean r4 = r7.moveToNext()     // Catch:{ all -> 0x01fc }
            if (r4 == 0) goto L_0x01da
            long r24 = r7.getLong(r1)     // Catch:{ all -> 0x01fc }
            java.lang.String r8 = r7.getString(r2)     // Catch:{ all -> 0x01fc }
            java.lang.String r4 = "groupishId"
            X.C11367SPk.A03(r8, r4)     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = r7.getString(r9)     // Catch:{ all -> 0x01fc }
            java.lang.String r4 = "sessionId"
            X.C11367SPk.A03(r5, r4)     // Catch:{ all -> 0x01fc }
            java.lang.String r4 = r7.getString(r10)     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = "userAliasId"
            X.C11367SPk.A03(r4, r6)     // Catch:{ all -> 0x01fc }
            long r26 = r7.getLong(r0)     // Catch:{ all -> 0x01fc }
            int r6 = r7.getInt(r3)     // Catch:{ all -> 0x01fc }
            r28 = 0
            if (r6 == 0) goto L_0x00c6
            r28 = 1
        L_0x00c6:
            java.lang.String r21 = r7.getString(r11)     // Catch:{ all -> 0x01fc }
            com.facebook.locationsharing.core.models.LiveLocationSession r6 = new com.facebook.locationsharing.core.models.LiveLocationSession     // Catch:{ all -> 0x01fc }
            r19 = r6
            r20 = r8
            r22 = r5
            r23 = r4
            r19.<init>(r20, r21, r22, r23, r24, r26, r28)     // Catch:{ all -> 0x01fc }
            long r4 = r6.A00     // Catch:{ all -> 0x01fc }
            r13 = -1
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x00e7
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01fc }
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x008d
        L_0x00e7:
            r12.add(r6)     // Catch:{ all -> 0x01fc }
            goto L_0x008d
        L_0x00eb:
            java.lang.String r1 = android.util.Log.getStackTraceString(r18)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "AbstractDAOItem"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "Can't access DAO when it is already closed: "
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x01fc }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01fc }
            r0.<init>(r1)     // Catch:{ all -> 0x01fc }
            goto L_0x01fb
        L_0x0101:
            java.lang.String r13 = "_id"
            java.lang.String r14 = "user_alias_id"
            r10 = 1
            r2 = 9
            r1 = 10
            r0 = 68
            java.lang.String r15 = X.XDX.A00(r2, r1, r0)
            r9 = 2
            java.lang.String r16 = "optimistic_session_id"
            r3 = 3
            java.lang.String r17 = "groupish_id"
            r2 = 4
            java.lang.String r18 = "start_time_millis"
            r0 = 5
            java.lang.String r19 = "expiration_time_millis"
            r1 = 6
            java.lang.String r20 = "message_id"
            java.lang.String[] r22 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19, r20}
            java.lang.String r23 = "user_alias_id = ? AND (expiration_time_millis > 0 OR expiration_time_millis = -1)"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String[] r24 = new java.lang.String[]{r4}
            r18 = 0
            r25 = r18
            r26 = r18
            r27 = r18
            java.lang.Object[] r7 = new java.lang.Object[]{r21, r22, r23, r24, r25, r26, r27}
            r4 = r7[r0]
            if (r4 == 0) goto L_0x0157
            android.database.sqlite.SQLiteDatabase r6 = r6.AWy()
            r5 = r7[r0]
            java.lang.String r5 = (java.lang.String) r5
            r4 = r7[r1]
            java.lang.String[] r4 = (java.lang.String[]) r4
            android.database.Cursor r7 = r6.rawQuery(r5, r4)
        L_0x014d:
            if (r7 != 0) goto L_0x017c
            java.lang.String r1 = "cursor is null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0157:
            android.database.sqlite.SQLiteDatabase r13 = r6.AWy()
            r14 = r7[r5]
            java.lang.String r14 = (java.lang.String) r14
            r15 = r7[r10]
            java.lang.String[] r15 = (java.lang.String[]) r15
            r6 = r7[r9]
            java.lang.String r6 = (java.lang.String) r6
            r5 = r7[r3]
            java.lang.String[] r5 = (java.lang.String[]) r5
            r4 = r7[r2]
            java.lang.String r4 = (java.lang.String) r4
            r16 = r6
            r17 = r5
            r19 = r18
            r20 = r4
            android.database.Cursor r7 = r13.query(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x014d
        L_0x017c:
            boolean r4 = r7.isClosed()     // Catch:{ all -> 0x01fc }
            if (r4 != 0) goto L_0x01e7
            boolean r4 = r7.moveToNext()     // Catch:{ all -> 0x01fc }
            if (r4 == 0) goto L_0x01da
            long r24 = r7.getLong(r1)     // Catch:{ all -> 0x01fc }
            java.lang.String r8 = r7.getString(r2)     // Catch:{ all -> 0x01fc }
            java.lang.String r4 = "groupishId"
            X.C11367SPk.A03(r8, r4)     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = r7.getString(r9)     // Catch:{ all -> 0x01fc }
            java.lang.String r4 = "sessionId"
            X.C11367SPk.A03(r5, r4)     // Catch:{ all -> 0x01fc }
            java.lang.String r4 = r7.getString(r10)     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = "userAliasId"
            X.C11367SPk.A03(r4, r6)     // Catch:{ all -> 0x01fc }
            long r26 = r7.getLong(r0)     // Catch:{ all -> 0x01fc }
            int r6 = r7.getInt(r3)     // Catch:{ all -> 0x01fc }
            r28 = 0
            if (r6 == 0) goto L_0x01b5
            r28 = 1
        L_0x01b5:
            java.lang.String r21 = r7.getString(r11)     // Catch:{ all -> 0x01fc }
            com.facebook.locationsharing.core.models.LiveLocationSession r6 = new com.facebook.locationsharing.core.models.LiveLocationSession     // Catch:{ all -> 0x01fc }
            r19 = r6
            r20 = r8
            r22 = r5
            r23 = r4
            r19.<init>(r20, r21, r22, r23, r24, r26, r28)     // Catch:{ all -> 0x01fc }
            long r4 = r6.A00     // Catch:{ all -> 0x01fc }
            r13 = -1
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x01d6
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01fc }
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x017c
        L_0x01d6:
            r12.add(r6)     // Catch:{ all -> 0x01fc }
            goto L_0x017c
        L_0x01da:
            r7.close()
            com.google.common.collect.ImmutableList r0 = r12.build()
            r1 = r30
            r1.onSuccess(r0)
            return
        L_0x01e7:
            java.lang.String r1 = android.util.Log.getStackTraceString(r18)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "AbstractDAOItem"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "Can't access DAO when it is already closed: "
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x01fc }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01fc }
            r0.<init>(r1)     // Catch:{ all -> 0x01fc }
        L_0x01fb:
            throw r0     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0201 }
            throw r1
        L_0x0201:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327277Ad.AYj(X.TlM):void");
    }

    public final void FMb(C13919TlL tlL, LiveLocationSession liveLocationSession) {
        XZ2 xz2;
        C22006Xqh xqh;
        XnD xnD;
        boolean z;
        SQLiteStatement sQLiteStatement;
        int i;
        String str;
        int length;
        String str2;
        String str3;
        String str4;
        Cursor rawQuery;
        String str5;
        String str6;
        LiveLocationSession liveLocationSession2 = liveLocationSession;
        String str7 = liveLocationSession2.A02;
        Pair A002 = A00(str7);
        long longValue = ((Number) A002.first).longValue();
        long longValue2 = ((Number) A002.second).longValue();
        int i2 = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
        C22178Xwk A003 = C22178Xwk.A00(this.A00);
        if (i2 == 0) {
            0ff.A01("DirectTransactionExecutor.startTransaction", 464807821);
            xqh = new C22006Xqh(xz2, A003);
            xqh.A03();
            C21184XIe xIe = new C21184XIe();
            C10385RrM rrM = C22006Xqh.A00(xqh).A03.A00;
            Class<Y8Q> cls = Y8Q.class;
            ArrayList arrayList = rrM.A00;
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
            }
            rrM.A01.add(xIe);
            xqh.A05.A00++;
            YBX ybx = xqh.A04;
            XZ2 xz22 = xqh.A03;
            Object[] objArr = xIe.A01;
            XZ0 xz0 = xqh.A02;
            synchronized (xz22) {
                try {
                    String str8 = (String) objArr[0];
                    String str9 = (String) objArr[1];
                    String[] strArr = (String[]) objArr[4];
                    String[] strArr2 = (String[]) objArr[2];
                    String str10 = (String) objArr[6];
                    01r r0 = xz22.A00;
                    xnD = (XnD) r0.get(str8);
                    if (xnD == null) {
                        xnD = new XnD(str9, str10, strArr, strArr2);
                        r0.put(str8, xnD);
                    }
                    try {
                    } catch (Throwable th) {
                        xqh.A01();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            String[] strArr3 = (String[]) objArr[2];
            int intValue = ((Integer) objArr[3]).intValue();
            String[] strArr4 = (String[]) objArr[4];
            int[] iArr = (int[]) objArr[5];
            int intValue2 = ((Integer) objArr[7]).intValue();
            String str11 = (String) objArr[8];
            int intValue3 = ((Integer) objArr[9]).intValue();
            if (str11 == null) {
                intValue3 = strArr3.length + intValue2;
            }
            Object[] objArr2 = new Object[intValue3];
            if (intValue == 5) {
                String str12 = liveLocationSession2.A04;
                if (str12 == null) {
                    str12 = null;
                }
                objArr2[1] = str12;
                String str13 = liveLocationSession2.A05;
                int i3 = 0;
                if (str13 == null) {
                    str13 = null;
                }
                objArr2[0] = str13;
                Boolean valueOf = Boolean.valueOf(liveLocationSession2.A06);
                if (valueOf == null) {
                    valueOf = null;
                }
                objArr2[2] = valueOf;
                if (str7 == null) {
                    str7 = null;
                }
                objArr2[3] = str7;
                Long valueOf2 = Long.valueOf(liveLocationSession2.A01);
                if (valueOf2 == null) {
                    valueOf2 = null;
                }
                objArr2[4] = valueOf2;
                Long valueOf3 = Long.valueOf(liveLocationSession2.A00);
                if (valueOf3 == null) {
                    valueOf3 = null;
                }
                objArr2[5] = valueOf3;
                String str14 = liveLocationSession2.A03;
                if (str14 == null) {
                    str14 = null;
                }
                objArr2[6] = str14;
                SQLiteDatabase AWy = ybx.AWy();
                int length2 = strArr4.length;
                String[] strArr5 = new String[length2];
                for (int i4 = 0; i4 < length2; i4++) {
                    Object obj = objArr2[iArr[i4]];
                    if (obj != null) {
                        str6 = obj.toString();
                    } else {
                        str6 = null;
                    }
                    strArr5[i4] = str6;
                }
                long j = -1;
                if (length2 > 0) {
                    synchronized (xnD) {
                        try {
                            C21425Xaa A004 = XnD.A00(AWy, xnD);
                            int i5 = 0;
                            int i6 = 0;
                            do {
                                if (strArr5[i5] == null) {
                                    i6 |= 1 << i5;
                                }
                                i5++;
                            } while (i5 < length2);
                            SparseArray sparseArray = A004.A03;
                            str4 = (String) sparseArray.get(i6);
                            if (str4 == null) {
                                String str15 = xnD.A00;
                                String[] strArr6 = xnD.A03;
                                StringBuilder sb = new StringBuilder();
                                sb.append("SELECT ");
                                sb.append("_id");
                                sb.append(" FROM ");
                                sb.append(str15);
                                sb.append(" WHERE ");
                                for (int i7 = 0; i7 < strArr6.length; i7++) {
                                    if (i7 > 0) {
                                        sb.append(" AND ");
                                    }
                                    sb.append(strArr6[i7]);
                                    if (strArr5[i7] == null) {
                                        str5 = " IS NULL";
                                    } else {
                                        str5 = "=?";
                                    }
                                    sb.append(str5);
                                }
                                sb.append(" LIMIT 1");
                                str4 = sb.toString();
                                sparseArray.put(i6, str4);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(length2);
                    int i8 = 0;
                    do {
                        String str16 = strArr5[i8];
                        if (str16 != null) {
                            arrayList2.add(str16);
                        }
                        i8++;
                    } while (i8 < length2);
                    rawQuery = AWy.rawQuery(str4, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    j = -1;
                    int columnCount = rawQuery.getColumnCount();
                    if (columnCount <= 1) {
                        if (rawQuery.moveToFirst()) {
                            j = rawQuery.getLong(0);
                        }
                        rawQuery.close();
                    } else {
                        throw new IllegalArgumentException(002.A0O("Expected 1 column, got ", columnCount));
                    }
                }
                if (j == -1) {
                    z = true;
                    SQLiteDatabase AWy2 = ybx.AWy();
                    synchronized (xnD) {
                        C21425Xaa A005 = XnD.A00(AWy2, xnD);
                        sQLiteStatement = A005.A00;
                        if (sQLiteStatement == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("INSERT");
                            sb2.append(" INTO ");
                            sb2.append(xnD.A00);
                            sb2.append('(');
                            int i9 = 0;
                            while (true) {
                                String[] strArr7 = xnD.A02;
                                length = strArr7.length;
                                if (i9 >= length) {
                                    break;
                                }
                                if (i9 > 0) {
                                    str3 = ",";
                                } else {
                                    str3 = "";
                                }
                                sb2.append(str3);
                                sb2.append(strArr7[i9]);
                                i9++;
                            }
                            sb2.append(')');
                            sb2.append(" VALUES (");
                            for (int i10 = 0; i10 < length; i10++) {
                                if (i10 > 0) {
                                    str2 = ",?";
                                } else {
                                    str2 = "?";
                                }
                                sb2.append(str2);
                            }
                            sb2.append(')');
                            sQLiteStatement = AWy2.compileStatement(sb2.toString());
                            A005.A00 = sQLiteStatement;
                        }
                    }
                } else {
                    z = false;
                    SQLiteDatabase AWy3 = ybx.AWy();
                    synchronized (xnD) {
                        C21425Xaa A006 = XnD.A00(AWy3, xnD);
                        SQLiteStatement sQLiteStatement2 = A006.A01;
                        if (sQLiteStatement2 == null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("UPDATE ");
                            sb3.append(xnD.A00);
                            sb3.append(" SET ");
                            int i11 = 0;
                            while (true) {
                                String[] strArr8 = xnD.A02;
                                if (i11 >= strArr8.length) {
                                    break;
                                }
                                if (i11 > 0) {
                                    str = ",";
                                } else {
                                    str = "";
                                }
                                sb3.append(str);
                                sb3.append(strArr8[i11]);
                                sb3.append("=?");
                                i11++;
                            }
                            sb3.append(" WHERE ");
                            sb3.append("_id");
                            sb3.append("=?");
                            sQLiteStatement2 = AWy3.compileStatement(sb3.toString());
                            A006.A01 = sQLiteStatement2;
                        }
                    }
                    sQLiteStatement.bindLong(strArr3.length + 1, j);
                }
                while (i3 < intValue3) {
                    int i12 = i3 + 1;
                    DatabaseUtils.bindObjectToProgram(sQLiteStatement, i12, objArr2[i3]);
                    i3 = i12;
                }
                if (z) {
                    try {
                        AnonymousClass0fa.A00(-2038690264);
                        sQLiteStatement.executeInsert();
                        i = 123914462;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteStatement.clearBindings();
                    }
                } else {
                    AnonymousClass0fa.A00(1426615759);
                    sQLiteStatement.execute();
                    i = 1848906915;
                }
                AnonymousClass0fa.A00(i);
                if (xz0 != null) {
                    xz0.A00.A06.A00++;
                }
                sQLiteStatement.clearBindings();
            } else {
                th = new UnsupportedOperationException();
                throw th;
            }
        } else {
            xz2 = new XZ2();
            0ff.A01("DirectTransactionExecutor.startTransaction", 464807821);
            xqh = new C22006Xqh(xz2, A003);
            xqh.A03();
            C21186XIg xIg = new C21186XIg();
            C10385RrM rrM2 = C22006Xqh.A00(xqh).A03.A00;
            Class<Y8Q> cls2 = Y8Q.class;
            ArrayList arrayList3 = rrM2.A00;
            if (!arrayList3.contains(cls2)) {
                arrayList3.add(cls2);
            }
            rrM2.A01.add(xIg);
            String str17 = liveLocationSession2.A04;
            YAf yAf = ((C21183XId) C21304XUn.A00(xIg, xqh)).A00;
            yAf.ENK(str17, 1);
            yAf.ENK(liveLocationSession2.A05, 0);
            yAf.ENL(Boolean.valueOf(liveLocationSession2.A06), 2);
            yAf.ENJ(Long.valueOf(Math.max(longValue2, liveLocationSession2.A01)), 3);
            yAf.ENJ(Long.valueOf(liveLocationSession2.A00), 4);
            yAf.ENK(liveLocationSession2.A03, 5);
            yAf.ENJ(Long.valueOf(longValue), 6);
            yAf.ABj();
        }
        xqh.A02();
        xqh.A01();
        tlL.onSuccess();
    }

    public C327277Ad(Context context, String str) {
        this.A00 = context.getApplicationContext();
        this.A01 = str;
    }
}
