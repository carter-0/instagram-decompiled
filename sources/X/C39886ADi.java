package X;

import android.database.sqlite.SQLiteStatement;
import java.io.IOException;

/* renamed from: X.ADi  reason: case insensitive filesystem */
public final class C39886ADi {
    public final 1W6 A00;
    public final C347947xd A01;
    public final boolean A02;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.1WT, java.io.Closeable] */
    public static void A00(C39886ADi aDi, String str) {
        ? AIZ;
        try {
            AIZ = aDi.A00.AIZ(str);
            SQLiteStatement sQLiteStatement = AIZ.A00;
            AnonymousClass0fa.A00(-1373470719);
            sQLiteStatement.execute();
            AnonymousClass0fa.A00(-1154077242);
            AIZ.close();
            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0196 A[LOOP:7: B:64:0x0190->B:66:0x0196, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r17 = this;
            r9 = r17
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0045
            X.1W6 r6 = r9.A00     // Catch:{ IOException -> 0x003e }
            java.lang.String r0 = "SELECT COUNT(*)\nFROM sqlite_master\nWHERE type = 'table'\n  AND name = ?"
            X.1WT r8 = r6.AIZ(r0)     // Catch:{ IOException -> 0x003e }
            java.lang.String r5 = "ig_meta_migrations"
            r7 = 1
            r8.ADh(r7, r5)     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteStatement r1 = r8.A00     // Catch:{ all -> 0x0034 }
            r0 = 1712711431(0x6615e707, float:1.7697358E23)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ all -> 0x0034 }
            long r3 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0034 }
            r0 = 1203533753(0x47bc77b9, float:96495.445)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ all -> 0x0034 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            r7 = 0
        L_0x002d:
            r8.close()     // Catch:{ IOException -> 0x003e }
            if (r7 != 0) goto L_0x0045
            goto L_0x015e
        L_0x0034:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x003e }
        L_0x003d:
            throw r1     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0045:
            X.7xd r0 = r9.A01
            r16 = r0
            java.lang.String r7 = r16.getName()
            X.1W6 r6 = r9.A00
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.lang.String r5 = "ig_meta_migrations"
            r3 = 0
            r14 = 2
            java.lang.String r1 = "sequence"
            java.lang.String r0 = "checksum"
            r11 = 1
            java.lang.String[] r15 = new java.lang.String[]{r1, r0}
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r4 = "schema_name = ?"
            java.lang.String r12 = "sequence ASC"
            r0 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r0 = "SELECT "
            r8.append(r0)
            r13 = 0
        L_0x0075:
            r1 = r15[r13]
            if (r13 <= 0) goto L_0x007e
            java.lang.String r0 = ", "
            r8.append(r0)
        L_0x007e:
            r8.append(r1)
            int r13 = r13 + 1
            if (r13 < r14) goto L_0x0075
            r0 = 32
            r8.append(r0)
            java.lang.String r0 = "FROM "
            r8.append(r0)
            r8.append(r5)
            java.lang.String r1 = " WHERE "
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00a0
            r8.append(r1)
            r8.append(r4)
        L_0x00a0:
            java.lang.String r1 = " ORDER BY "
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00ae
            r8.append(r1)
            r8.append(r12)
        L_0x00ae:
            java.lang.String r1 = r8.toString()
            X.0qQ.A07(r1)
            X.1W8 r0 = new X.1W8
            r0.<init>(r1, r2)
            android.database.Cursor r8 = r6.E5j(r0)
        L_0x00be:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x00d5
            int r2 = r8.getInt(r3)     // Catch:{ all -> 0x01c0 }
            java.lang.String r1 = r8.getString(r11)     // Catch:{ all -> 0x01c0 }
            X.A5j r0 = new X.A5j     // Catch:{ all -> 0x01c0 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x01c0 }
            r10.add(r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x00be
        L_0x00d5:
            r8.close()
            int r0 = r10.size()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>(r0)
            java.util.Iterator r2 = r10.iterator()
        L_0x00e5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r1 = r2.next()
            X.A5j r1 = (X.C39693A5j) r1
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.put(r0, r1)
            goto L_0x00e5
        L_0x00fb:
            X.7xe[] r12 = r16.BT1()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            int r10 = r12.length
            r8 = 0
        L_0x0105:
            if (r8 >= r10) goto L_0x0187
            r2 = r12[r8]
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r13.get(r0)
            X.A5j r0 = (X.C39693A5j) r0
            if (r0 != 0) goto L_0x0125
            java.lang.String[] r15 = r2.A02
            int r14 = r15.length
            r1 = 0
        L_0x011b:
            if (r1 >= r14) goto L_0x017d
            r0 = r15[r1]
            A00(r9, r0)
            int r1 = r1 + 1
            goto L_0x011b
        L_0x0125:
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r2.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0180
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r0}
            r0 = 2491(0x9bb, float:3.49E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Dropping and recreating schema %s due to checksum mismatch for migration with sequence %d"
            X.0KC.A0P(r1, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            r6.AON(r5, r4, r0)
            java.lang.String[] r0 = r16.C3q()
            r1 = r0[r3]
            r0 = 4335(0x10ef, float:6.075E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r1)
            A00(r9, r0)
        L_0x015e:
            X.7xd r0 = r9.A01
            r16 = r0
            X.7xe[] r8 = r16.BT1()
            int r7 = r8.length
            r4 = 0
        L_0x0168:
            if (r4 >= r7) goto L_0x0183
            r0 = r8[r4]
            java.lang.String[] r3 = r0.A02
            int r2 = r3.length
            r1 = 0
        L_0x0170:
            if (r1 >= r2) goto L_0x017a
            r0 = r3[r1]
            A00(r9, r0)
            int r1 = r1 + 1
            goto L_0x0170
        L_0x017a:
            int r4 = r4 + 1
            goto L_0x0168
        L_0x017d:
            r11.add(r2)
        L_0x0180:
            int r8 = r8 + 1
            goto L_0x0105
        L_0x0183:
            java.util.List r11 = java.util.Arrays.asList(r8)
        L_0x0187:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.util.Iterator r3 = r11.iterator()
        L_0x0190:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r2 = r3.next()
            X.7xe r2 = (X.C347957xe) r2
            r4.clear()
            java.lang.String r1 = r16.getName()
            java.lang.String r0 = "schema_name"
            r4.put(r0, r1)
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sequence"
            r4.put(r0, r1)
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "checksum"
            r4.put(r0, r1)
            r0 = 2
            r6.CNQ(r4, r5, r0)
            goto L_0x0190
        L_0x01bf:
            return
        L_0x01c0:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x01c5 }
            throw r1
        L_0x01c5:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39886ADi.A01():void");
    }

    public C39886ADi(1W6 r1, C347947xd r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }
}
