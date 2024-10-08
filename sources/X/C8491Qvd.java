package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.util.List;

/* renamed from: X.Qvd  reason: case insensitive filesystem */
public final class C8491Qvd extends C8492Qve implements Closeable {
    public static final String A03 = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    public static final String A04 = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    public final C11233SGt A00;
    public final C11233SGt A01;
    public final Q6Q A02;

    public static final long A01(C8491Qvd qvd, String str, String[] strArr) {
        C8491Qvd qvd2 = qvd;
        Cursor cursor = null;
        String str2 = str;
        try {
            Cursor rawQuery = qvd.A0K().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            }
            rawQuery.close();
            return 0;
        } catch (SQLiteException e) {
            ST5.A0A(qvd2, str2, e, (Object) null, "Database error", 6);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final SQLiteDatabase A0K() {
        try {
            return this.A02.getWritableDatabase();
        } catch (SQLiteException e) {
            A0G("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A0L(long r23) {
        /*
            r22 = this;
            java.lang.String r6 = "hit_id"
            r9 = 1
            r1 = 0
            r2 = 0
            int r0 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1))
            boolean r0 = X.Pxf.A1R(r0)
            X.AnonymousClass3Qk.A07(r0)
            X.C11200SFa.A00()
            r10 = r22
            r10.A0J()
            android.database.sqlite.SQLiteDatabase r11 = r10.A0K()
            r14 = 0
            java.lang.String r12 = "hits2"
            java.lang.String r8 = "hit_time"
            java.lang.String r7 = "hit_string"
            r3 = 2
            java.lang.String r5 = "hit_url"
            r2 = 3
            java.lang.String r4 = "hit_app_id"
            r0 = 4
            java.lang.String[] r13 = new java.lang.String[]{r6, r8, r7, r5, r4}     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.String r5 = "%s ASC"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.String r18 = java.lang.String.format(r5, r4)     // Catch:{ SQLiteException -> 0x00bd }
            java.lang.String r19 = java.lang.Long.toString(r23)     // Catch:{ SQLiteException -> 0x00bd }
            r15 = r14
            r16 = r14
            r17 = r14
            android.database.Cursor r8 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x00bd }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            boolean r4 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            if (r4 == 0) goto L_0x00b3
        L_0x004e:
            long r19 = r8.getLong(r1)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            long r17 = r8.getLong(r9)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            java.lang.String r5 = r8.getString(r3)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            java.lang.String r6 = r8.getString(r2)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            int r16 = r8.getInt(r0)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            java.lang.String r4 = "?"
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            if (r11 == 0) goto L_0x0093
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            r5.<init>(r1)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
        L_0x006f:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            r21 = 1
            if (r4 != 0) goto L_0x0081
            java.lang.String r4 = "http:"
            boolean r4 = r6.startsWith(r4)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            if (r4 == 0) goto L_0x0081
            r21 = 0
        L_0x0081:
            X.SHk r4 = new X.SHk     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            r15 = r5
            r12 = r4
            r13 = r10
            r12.<init>(r13, r14, r15, r16, r17, r19, r21)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            r7.add(r4)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            boolean r4 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            if (r4 != 0) goto L_0x004e
            goto L_0x00b3
        L_0x0093:
            boolean r11 = r5.startsWith(r4)     // Catch:{ URISyntaxException -> 0x00a7 }
            if (r11 != 0) goto L_0x009d
            java.lang.String r5 = X.Pxh.A0m(r4, r5)     // Catch:{ URISyntaxException -> 0x00a7 }
        L_0x009d:
            java.net.URI r4 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00a7 }
            r4.<init>(r5)     // Catch:{ URISyntaxException -> 0x00a7 }
            java.util.Map r5 = X.C11161SCv.A00(r4)     // Catch:{ URISyntaxException -> 0x00a7 }
            goto L_0x006f
        L_0x00a7:
            r5 = move-exception
            java.lang.String r4 = "Error parsing hit parameters"
            r10.A0H(r4, r5)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            r5.<init>(r1)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b7 }
            goto L_0x006f
        L_0x00b3:
            r8.close()
            return r7
        L_0x00b7:
            r0 = move-exception
            r14 = r8
            goto L_0x00c5
        L_0x00ba:
            r1 = move-exception
            r14 = r8
            goto L_0x00be
        L_0x00bd:
            r1 = move-exception
        L_0x00be:
            java.lang.String r0 = "Error loading hits from the database"
            r10.A0H(r0, r1)     // Catch:{ all -> 0x00c4 }
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
        L_0x00c5:
            if (r14 == 0) goto L_0x00ca
            r14.close()
        L_0x00ca:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8491Qvd.A0L(long):java.util.ArrayList");
    }

    public final void close() {
        String str;
        try {
            this.A02.close();
        } catch (SQLiteException e) {
            e = e;
            str = "Sql error closing database";
            A0H(str, e);
        } catch (IllegalStateException e2) {
            e = e2;
            str = "Error closing database";
            A0H(str, e);
        }
    }

    public C8491Qvd(C11381SQt sQt) {
        super(sQt);
        C13473Tb0 tb0 = this.A00.A04;
        this.A00 = new C11233SGt(tb0);
        this.A01 = new C11233SGt(tb0);
        this.A02 = new Q6Q(sQt.A00, this);
    }

    public static final long A00(C8491Qvd qvd) {
        C11200SFa.A00();
        C8491Qvd qvd2 = qvd;
        qvd.A0J();
        Cursor cursor = null;
        try {
            cursor = qvd.A0K().rawQuery("SELECT COUNT(*) FROM hits2", (String[]) null);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            ST5.A0A(qvd2, "SELECT COUNT(*) FROM hits2", e, (Object) null, "Database error", 6);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void A0M() {
        A0J();
        AnonymousClass0fa.A03(A0K(), 1331138944);
    }

    public final void A0N(List list) {
        C11200SFa.A00();
        A0J();
        if (!list.isEmpty()) {
            StringBuilder A16 = Pxe.A16("hit_id");
            A16.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Number number = (Number) list.get(i);
                if (number == null || number.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    A16.append(",");
                }
                A16.append(number);
            }
            String A0l = AnonymousClass7TF.A0l(")", A16);
            try {
                SQLiteDatabase A0K = A0K();
                A0E("Deleting dispatched hits. count", C51968G9o.A0t(list));
                int delete = A0K.delete("hits2", A0l, (String[]) null);
                if (delete != list.size()) {
                    ST5.A0A(this, C51968G9o.A0t(list), Integer.valueOf(delete), A0l, "Deleted fewer hits then expected", 5);
                }
            } catch (SQLiteException e) {
                A0H("Error deleting hits", e);
                throw e;
            }
        }
    }
}
