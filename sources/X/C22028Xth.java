package X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.crudolib.sqliteproc.annotations.DefaultDataMigrator;
import com.facebook.crudolib.sqliteproc.annotations.DropAllTablesDataMigrator;
import com.facebook.crudolib.sqliteproc.annotations.DropTableDataMigrator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Xth  reason: case insensitive filesystem */
public abstract class C22028Xth {
    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        X.C21992XpF.A01(r2, "migrate_data_savepoint");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.database.sqlite.SQLiteDatabase r2, X.XZ3 r3) {
        /*
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0020 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0020 }
            X.Y9K r0 = (X.Y9K) r0     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0020 }
            java.lang.String r1 = "migrate_data_savepoint"
            X.C21992XpF.A00(r2, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0020 }
            r0.CoM(r2, r3)     // Catch:{ XFp | SQLException -> 0x0014 }
            goto L_0x0017
        L_0x0014:
            X.C21992XpF.A02(r2, r1)     // Catch:{ all -> 0x001b }
        L_0x0017:
            X.C21992XpF.A01(r2, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0020 }
            return
        L_0x001b:
            r0 = move-exception
            X.C21992XpF.A01(r2, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0020 }
            throw r0     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0020 }
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22028Xth.A01(android.database.sqlite.SQLiteDatabase, X.XZ3):void");
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, String str, C21386XZt[] xZtArr) {
        int length = xZtArr.length;
        for (int i = 0; i < length; i = 1) {
            C21386XZt xZt = xZtArr[i];
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("CREATE ");
            A1A.append("UNIQUE ");
            A1A.append("INDEX ");
            A1A.append(str);
            String[] strArr = xZt.A00;
            for (String append : strArr) {
                A1A.append("_");
                A1A.append(append);
            }
            A1A.append(" ON ");
            A1A.append(str);
            A1A.append("(");
            A1A.append(strArr[0]);
            String[] strArr2 = xZt.A01;
            String str2 = strArr2[0];
            if (!str2.isEmpty()) {
                A1A.append(" ");
                A1A.append(str2);
            }
            for (int i2 = 1; i2 < r5; i2 = 2) {
                A1A.append(',');
                A1A.append(strArr[i2]);
                if (!strArr2[i2].isEmpty()) {
                    A1A.append(" ");
                    A1A.append(strArr2[i2]);
                }
            }
            String A0l = AnonymousClass7TF.A0l(")", A1A);
            AnonymousClass0fa.A00(-1493524764);
            sQLiteDatabase.execSQL(A0l);
            AnonymousClass0fa.A00(-1741596280);
        }
    }

    public static void A07(String str, Map map, C21503Xd8[] xd8Arr) {
        for (C21503Xd8 xd8 : xd8Arr) {
            String str2 = xd8.A02;
            if (str2 != null) {
                Set set = (Set) map.get(str2);
                if (set == null) {
                    set = AnonymousClass7TE.A1F();
                    map.put(str2, set);
                }
                set.add(str);
            }
        }
    }

    public static boolean A08() {
        if (TextUtils.isEmpty((CharSequence) null) || DefaultDataMigrator.class.getName().equals((Object) null) || DropTableDataMigrator.class.getName().equals((Object) null) || DropAllTablesDataMigrator.class.getName().equals((Object) null)) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a A[Catch:{ all -> 0x005b }] */
    public static void A02(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, X.C21503Xd8[] r7, X.C21386XZt[] r8) {
        /*
            java.lang.String r1 = "createTableWithIndices"
            r0 = 1251039575(0x4a915957, float:4762795.5)
            X.0ff.A01(r1, r0)
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "CREATE TABLE "
            r4.append(r0)     // Catch:{ all -> 0x005b }
            r4.append(r6)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = " ("
            r4.append(r0)     // Catch:{ all -> 0x005b }
            int r3 = r7.length     // Catch:{ all -> 0x005b }
            r2 = 0
        L_0x001b:
            if (r2 >= r3) goto L_0x0026
            r1 = r7[r2]     // Catch:{ all -> 0x005b }
            boolean r0 = r1.A09     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0035
            int r2 = r2 + 1
            goto L_0x001b
        L_0x0026:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0039
            r1 = r7[r2]     // Catch:{ all -> 0x005b }
            boolean r0 = r1.A09     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = ", "
            r4.append(r0)     // Catch:{ all -> 0x005b }
        L_0x0035:
            A05(r1, r4)     // Catch:{ all -> 0x005b }
            goto L_0x0026
        L_0x0039:
            r0 = 41
            r4.append(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x005b }
            r0 = -1434718027(0xffffffffaa7bf0b5, float:-2.237679E-13)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ all -> 0x005b }
            r5.execSQL(r1)     // Catch:{ all -> 0x005b }
            r0 = 478050478(0x1c7e78ae, float:8.4197525E-22)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ all -> 0x005b }
            A03(r5, r6, r8)     // Catch:{ all -> 0x005b }
            r0 = -16535361(0xffffffffff03b0bf, float:-1.7504659E38)
            X.0ff.A00(r0)
            return
        L_0x005b:
            r1 = move-exception
            r0 = 1228390264(0x4937bf78, float:752631.5)
            X.0ff.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22028Xth.A02(android.database.sqlite.SQLiteDatabase, java.lang.String, X.Xd8[], X.XZt[]):void");
    }

    public static void A05(C21503Xd8 xd8, StringBuilder sb) {
        sb.append(xd8.A03);
        sb.append(" ");
        sb.append(xd8.A06);
        sb.append(" ");
        String str = xd8.A00;
        if (str != null) {
            sb.append("DEFAULT ");
            sb.append(str);
            sb.append(" ");
        }
        if (!xd8.A0A) {
            sb.append("NOT NULL ");
        }
        if (xd8.A0B) {
            sb.append("PRIMARY KEY ");
        }
        if (xd8.A08) {
            sb.append("AUTOINCREMENT ");
        }
        String str2 = xd8.A02;
        if (str2 != null || xd8.A01 != null) {
            sb.append("REFERENCES ");
            sb.append(str2);
            sb.append("(");
            sb.append(xd8.A01);
            sb.append(")");
            sb.append(" ON UPDATE ");
            sb.append(xd8.A05);
            sb.append(" ON DELETE ");
            sb.append(xd8.A04);
        }
    }

    public static void A06(String str, String str2) {
        throw new UnsupportedOperationException(002.A0u("[", str, "]: ", str2));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0026 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    public static void A00(android.database.sqlite.SQLiteDatabase r9, X.C21188XIi r10, X.C21503Xd8[] r11, X.C21386XZt[] r12) {
        /*
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            int r3 = r11.length
            r2 = 0
        L_0x0006:
            if (r2 >= r3) goto L_0x0016
            r1 = r11[r2]
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0011
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0011:
            java.lang.String r0 = r1.A03
            r4.append(r0)
        L_0x0016:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0026
            r1 = r11[r2]
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = ", "
            r4.append(r0)
            goto L_0x0011
        L_0x0026:
            java.lang.String r7 = r4.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r2 = "recreate_table_savepoint"
            X.C21992XpF.A00(r9, r2)
            r8 = 0
            java.lang.String r0 = "_temp_"
            java.lang.String r6 = r10.A01     // Catch:{ SQLException -> 0x009d }
            java.lang.String r4 = X.002.A0R(r0, r6)     // Catch:{ SQLException -> 0x009d }
            A02(r9, r4, r11, r12)     // Catch:{ SQLException -> 0x009d }
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r7, r7, r6}     // Catch:{ SQLException -> 0x009d }
            java.lang.String r5 = "INSERT OR IGNORE INTO %s (%s) SELECT %s FROM %s"
            java.lang.String r1 = java.lang.String.format(r5, r0)     // Catch:{ SQLException -> 0x009d }
            r0 = 787066303(0x2ee9adbf, float:1.0626477E-10)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLException -> 0x009d }
            r9.execSQL(r1)     // Catch:{ SQLException -> 0x009d }
            r0 = 777775661(0x2e5bea2d, float:5.0002825E-11)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLException -> 0x009d }
            java.lang.String r3 = "DROP TABLE "
            java.lang.String r1 = X.002.A0R(r3, r6)     // Catch:{ SQLException -> 0x009d }
            r0 = -2036823505(0xffffffff86988a2f, float:-5.737909E-35)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLException -> 0x009d }
            r9.execSQL(r1)     // Catch:{ SQLException -> 0x009d }
            r0 = 1172688247(0x45e5cd77, float:7353.683)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLException -> 0x009d }
            A02(r9, r6, r11, r12)     // Catch:{ SQLException -> 0x009d }
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r7, r7, r4}     // Catch:{ SQLException -> 0x009d }
            java.lang.String r1 = java.lang.String.format(r5, r0)     // Catch:{ SQLException -> 0x009d }
            r0 = 787066303(0x2ee9adbf, float:1.0626477E-10)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLException -> 0x009d }
            r9.execSQL(r1)     // Catch:{ SQLException -> 0x009d }
            r0 = 777775661(0x2e5bea2d, float:5.0002825E-11)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLException -> 0x009d }
            java.lang.String r1 = X.002.A0R(r3, r4)     // Catch:{ SQLException -> 0x009d }
            r0 = 875723827(0x34327c33, float:1.6622725E-7)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLException -> 0x009d }
            r9.execSQL(r1)     // Catch:{ SQLException -> 0x009d }
            r0 = -567561128(0xffffffffde2bb458, float:-3.09315271E18)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLException -> 0x009d }
            goto L_0x00a7
        L_0x009d:
            r8 = move-exception
            X.C21992XpF.A02(r9, r2)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a7
        L_0x00a2:
            r0 = move-exception
            X.C21992XpF.A01(r9, r2)
            throw r0
        L_0x00a7:
            X.C21992XpF.A01(r9, r2)
            if (r8 == 0) goto L_0x00c6
        L_0x00ac:
            java.lang.String r0 = "DROP TABLE IF EXISTS "
            java.lang.String r2 = r10.A01
            java.lang.String r1 = X.002.A0R(r0, r2)
            r0 = -463443053(0xffffffffe4606b93, float:-1.6559289E22)
            X.AnonymousClass0fa.A00(r0)
            r9.execSQL(r1)
            r0 = -474708895(0xffffffffe3b48461, float:-6.6599057E21)
            X.AnonymousClass0fa.A00(r0)
            A02(r9, r2, r11, r12)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22028Xth.A00(android.database.sqlite.SQLiteDatabase, X.XIi, X.Xd8[], X.XZt[]):void");
    }

    public static void A04(YBX ybx, String str, Map map, Set set) {
        if (!set.contains(str)) {
            if (map.containsKey(str)) {
                Iterator it = ((Set) map.get(str)).iterator();
                while (it.hasNext()) {
                    A04(ybx, AnonymousClass7TE.A18(it), map, set);
                }
            }
            SQLiteDatabase AWy = ybx.AWy();
            String A0R = 002.A0R("DROP TABLE IF EXISTS ", str);
            AnonymousClass0fa.A00(1523472672);
            AWy.execSQL(A0R);
            AnonymousClass0fa.A00(-2022094031);
            SQLiteDatabase AWy2 = ybx.AWy();
            AWy2.delete("sqliteproc_schema", "table_name = ?", new String[]{str});
            AWy2.delete("sqliteproc_metadata", "table_name = ?", new String[]{str});
            set.add(str);
        }
    }
}
