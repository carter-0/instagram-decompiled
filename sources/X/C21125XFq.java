package X;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* renamed from: X.XFq  reason: case insensitive filesystem */
public final class C21125XFq extends SQLiteOpenHelper {
    public SQLiteDatabase A00;
    public final YBX A01 = new C22177Xwj(this);
    public final C21305XUo A02;
    public final C21306XUp A03;
    public final C21387XZu A04;
    public final C21477XcE A05;

    public C21125XFq(Context context, C21305XUo xUo, C21306XUp xUp, C21387XZu xZu, C21477XcE xcE) {
        super(context, "location_sharing.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.A04 = xZu;
        this.A05 = xcE;
        this.A02 = xUo;
        this.A03 = xUp;
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        0ff.A01("onCreate", 1958808839);
        try {
            C22028Xth.A02(sQLiteDatabase, "sqliteproc_metadata", YBT.A00, YBT.A01);
            C22028Xth.A02(sQLiteDatabase, "sqliteproc_schema", YBU.A00, YBU.A01);
        } finally {
            0ff.A00(895824256);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase);
        onCreate(sQLiteDatabase);
        AnonymousClass7TE.A1F().add("metadata_version_downgrade");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.XZu, X.XIi] */
    /* JADX WARNING: type inference failed for: r0v25, types: [X.XZu, X.XIi] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.XZu, X.XIi] */
    /* JADX WARNING: type inference failed for: r2v6, types: [X.XZu, X.XIi] */
    /* JADX WARNING: type inference failed for: r9v7, types: [X.XZu, X.XIi] */
    /* JADX WARNING: type inference failed for: r3v15, types: [X.XZu, X.XIi] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03c3 A[Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r49) {
        /*
            r48 = this;
            r2 = r48
            android.database.sqlite.SQLiteDatabase r0 = r2.A00
            r47 = r49
            if (r0 != 0) goto L_0x000d
            r0 = r47
            r2.onConfigure(r0)
        L_0x000d:
            X.YBX r7 = r2.A01
            java.lang.String r18 = "__database__"
            r0 = r18
            X.C22019Xsu.A00(r7, r0)
            java.lang.String r1 = "migrate"
            r0 = 1731506034(0x6734af72, float:8.5326236E23)
            X.0ff.A01(r1, r0)
            r17 = 1
            r1 = r47
            r0 = r17
            r1.setForeignKeyConstraintsEnabled(r0)     // Catch:{ all -> 0x067d }
            X.XcE r6 = r2.A05     // Catch:{ all -> 0x067d }
            r0 = r18
            java.lang.String r1 = X.C22019Xsu.A00(r7, r0)     // Catch:{ all -> 0x067d }
            java.lang.String r19 = "3b5dcd93f5e7177914a5563a91f2383481c797df-53f769b8cd72a898ebbf56276cf53c61b5826d95-"
            r0 = r19
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x067d }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x066f
            r0 = 2491(0x9bb, float:3.49E-42)
            java.lang.String r16 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x067d }
            java.util.ArrayList r35 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x067d }
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch:{ all -> 0x067d }
            r5.<init>()     // Catch:{ all -> 0x067d }
            java.util.HashSet r25 = X.C22019Xsu.A01(r7)     // Catch:{ all -> 0x067d }
            r34 = 4
            java.util.HashSet r33 = new java.util.HashSet     // Catch:{ all -> 0x067d }
            r1 = r33
            r0 = r34
            r1.<init>(r0)     // Catch:{ all -> 0x067d }
            android.database.sqlite.SQLiteDatabase r4 = r7.AWy()     // Catch:{ all -> 0x067d }
            r0 = 1806125608(0x6ba74a28, float:4.044816E26)
            X.AnonymousClass0fa.A01(r4, r0)     // Catch:{ all -> 0x067d }
            java.lang.String r1 = "PRAGMA defer_foreign_keys = ON"
            r0 = 587199720(0x22fff4e8, float:6.9377193E-18)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r4.execSQL(r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = -238554985(0xfffffffff1c7f097, float:-1.9801079E30)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r32 = "live_location_sessions"
            java.lang.String r31 = "3b5dcd93f5e7177914a5563a91f2383481c797df"
            X.XIi r3 = new X.XIi     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r1 = r32
            r0 = r31
            r3.<init>(r1, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r30 = "live_location_sharers"
            java.lang.String r29 = "53f769b8cd72a898ebbf56276cf53c61b5826d95"
            X.XIi r2 = new X.XIi     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r1 = r30
            r0 = r29
            r2.<init>(r1, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XIi[] r28 = new X.C21188XIi[]{r3, r2}     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r8 = 2
            r3 = 0
            r27 = 0
        L_0x0096:
            r26 = r28[r3]     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.Xd8[] r2 = r6.A00(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = r26
            java.lang.String r1 = r0.A01     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = r25
            r0.remove(r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r9 = X.C22019Xsu.A00(r7, r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r9 != 0) goto L_0x00b5
            X.XZt[] r0 = r6.A01(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.C22028Xth.A02(r4, r1, r2, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r10 = 4
            goto L_0x03b7
        L_0x00b5:
            r0 = r26
            java.lang.String r0 = r0.A00     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            boolean r0 = r0.equals(r9)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 != 0) goto L_0x03b6
            java.lang.String r9 = "migrateTable"
            r0 = -314132230(0xffffffffed46b8fa, float:-3.8438534E27)
            X.0ff.A01(r9, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.Xd8[] r12 = X.C22019Xsu.A04(r7, r1)     // Catch:{ all -> 0x0424 }
            r45 = 0
            r46 = 0
            java.util.ArrayList r24 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0424 }
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0424 }
            java.util.ArrayList r22 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0424 }
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0424 }
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0424 }
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0424 }
            int r11 = r2.length     // Catch:{ all -> 0x0424 }
            java.util.HashMap r13 = X.C21053XCe.A0h(r11)     // Catch:{ all -> 0x0424 }
            r10 = 0
        L_0x00ed:
            if (r10 >= r11) goto L_0x00f9
            r9 = r2[r10]     // Catch:{ all -> 0x0424 }
            java.lang.String r0 = r9.A03     // Catch:{ all -> 0x0424 }
            r13.put(r0, r9)     // Catch:{ all -> 0x0424 }
            int r10 = r10 + 1
            goto L_0x00ed
        L_0x00f9:
            int r14 = r12.length     // Catch:{ all -> 0x0424 }
            r11 = 0
        L_0x00fb:
            if (r11 >= r14) goto L_0x0151
            r10 = r12[r11]     // Catch:{ all -> 0x0424 }
            java.lang.String r0 = r10.A03     // Catch:{ all -> 0x0424 }
            java.lang.Object r9 = r13.remove(r0)     // Catch:{ all -> 0x0424 }
            X.Xd8 r9 = (X.C21503Xd8) r9     // Catch:{ all -> 0x0424 }
            if (r9 == 0) goto L_0x0144
            boolean r0 = r9.equals(r10)     // Catch:{ all -> 0x0424 }
            if (r0 != 0) goto L_0x014e
            boolean r0 = r10.A09     // Catch:{ all -> 0x0424 }
            if (r0 != 0) goto L_0x0139
            boolean r0 = r9.A09     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x0139
            r0 = r21
            r0.add(r9)     // Catch:{ all -> 0x0424 }
            r9 = 0
            java.lang.Class<com.facebook.crudolib.sqliteproc.annotations.DropAllTablesDataMigrator> r0 = com.facebook.crudolib.sqliteproc.annotations.DropAllTablesDataMigrator.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0424 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x012a
            goto L_0x014c
        L_0x012a:
            java.lang.Class<com.facebook.crudolib.sqliteproc.annotations.DropTableDataMigrator> r0 = com.facebook.crudolib.sqliteproc.annotations.DropTableDataMigrator.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0424 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x014e
            r46 = 1
            goto L_0x014e
        L_0x0139:
            X.Xbo r0 = new X.Xbo     // Catch:{ all -> 0x0424 }
            r0.<init>(r10, r9)     // Catch:{ all -> 0x0424 }
            r9 = r24
            r9.add(r0)     // Catch:{ all -> 0x0424 }
            goto L_0x014e
        L_0x0144:
            java.lang.String r9 = r10.A03     // Catch:{ all -> 0x0424 }
            r0 = r20
            r0.add(r9)     // Catch:{ all -> 0x0424 }
            goto L_0x014e
        L_0x014c:
            r45 = 1
        L_0x014e:
            int r11 = r11 + 1
            goto L_0x00fb
        L_0x0151:
            java.util.Iterator r11 = X.AnonymousClass7TF.A0t(r13)     // Catch:{ all -> 0x0424 }
        L_0x0155:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x0424 }
            X.Xd8 r9 = (X.C21503Xd8) r9     // Catch:{ all -> 0x0424 }
            boolean r0 = r9.A09     // Catch:{ all -> 0x0424 }
            if (r0 != 0) goto L_0x0155
            boolean r0 = r9.A07     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x01a9
            r0 = r23
            r0.add(r9)     // Catch:{ all -> 0x0424 }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x018a
            boolean r0 = r9.A0A     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x018a
        L_0x017e:
            java.lang.String r10 = r9.A03     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = "foreign_key_violation_added_column"
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0424 }
            r0.<init>(r10, r9)     // Catch:{ all -> 0x0424 }
            r15.add(r0)     // Catch:{ all -> 0x0424 }
        L_0x018a:
            r9 = 0
            java.lang.Class<com.facebook.crudolib.sqliteproc.annotations.DropAllTablesDataMigrator> r0 = com.facebook.crudolib.sqliteproc.annotations.DropAllTablesDataMigrator.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0424 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x019a
            r45 = 1
            goto L_0x0155
        L_0x019a:
            java.lang.Class<com.facebook.crudolib.sqliteproc.annotations.DropTableDataMigrator> r0 = com.facebook.crudolib.sqliteproc.annotations.DropTableDataMigrator.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0424 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x0155
            r46 = 1
            goto L_0x0155
        L_0x01a9:
            java.lang.String r9 = r9.A03     // Catch:{ all -> 0x0424 }
            r0 = r22
            r0.add(r9)     // Catch:{ all -> 0x0424 }
            goto L_0x0155
        L_0x01b1:
            X.XbH r0 = new X.XbH     // Catch:{ all -> 0x0424 }
            r36 = r0
            r37 = r24
            r38 = r23
            r39 = r22
            r40 = r21
            r41 = r20
            r42 = r15
            r43 = r12
            r44 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x0424 }
            java.util.List r9 = r0.A02     // Catch:{ all -> 0x0424 }
            r20 = r9
            java.util.List r9 = r0.A00     // Catch:{ all -> 0x0424 }
            r22 = r9
            java.util.List r9 = r0.A06     // Catch:{ all -> 0x0424 }
            r21 = r9
            java.util.List r15 = r0.A07     // Catch:{ all -> 0x0424 }
            java.util.List r14 = r0.A01     // Catch:{ all -> 0x0424 }
            java.util.List r13 = r0.A05     // Catch:{ all -> 0x0424 }
            boolean r12 = r0.A09     // Catch:{ all -> 0x0424 }
            boolean r11 = r0.A08     // Catch:{ all -> 0x0424 }
            if (r11 == 0) goto L_0x01e7
            java.lang.String r10 = "data_migration"
            r9 = r33
            r9.add(r10)     // Catch:{ all -> 0x0424 }
        L_0x01e7:
            boolean r9 = r15.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r9 != 0) goto L_0x01fc
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0424 }
            java.lang.String r0 = "You must use @Deleted to remove columns: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r15, r0, r2)     // Catch:{ all -> 0x0424 }
            X.C22028Xth.A06(r1, r0)     // Catch:{ all -> 0x0424 }
            goto L_0x03fa
        L_0x01fc:
            boolean r9 = r14.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r9 != 0) goto L_0x0211
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0424 }
            java.lang.String r0 = "You must use @Added to add columns: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r14, r0, r2)     // Catch:{ all -> 0x0424 }
            X.C22028Xth.A06(r1, r0)     // Catch:{ all -> 0x0424 }
            goto L_0x03fa
        L_0x0211:
            boolean r9 = r20.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r9 != 0) goto L_0x0228
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0424 }
            java.lang.String r2 = "Modification of columns is not permitted, use @Deleted and a new column instead: "
            r0 = r20
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r0, r2, r3)     // Catch:{ all -> 0x0424 }
            X.C22028Xth.A06(r1, r0)     // Catch:{ all -> 0x0424 }
            goto L_0x03fa
        L_0x0228:
            boolean r9 = r13.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r9 != 0) goto L_0x023d
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0424 }
            java.lang.String r0 = "Detected other columns introducing illegal changes: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r13, r0, r2)     // Catch:{ all -> 0x0424 }
            X.C22028Xth.A06(r1, r0)     // Catch:{ all -> 0x0424 }
            goto L_0x03fa
        L_0x023d:
            if (r12 != 0) goto L_0x0389
            if (r11 != 0) goto L_0x0389
            boolean r9 = r22.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r9 != 0) goto L_0x0285
            r12 = 0
            int r11 = r22.size()     // Catch:{ all -> 0x0424 }
        L_0x024c:
            if (r12 >= r11) goto L_0x0285
            r9 = r22
            java.lang.Object r13 = r9.get(r12)     // Catch:{ all -> 0x0424 }
            X.Xd8 r13 = (X.C21503Xd8) r13     // Catch:{ all -> 0x0424 }
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = "ALTER TABLE "
            r10.append(r9)     // Catch:{ all -> 0x0424 }
            r10.append(r1)     // Catch:{ all -> 0x0424 }
            r9 = 32
            r10.append(r9)     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = "ADD COLUMN "
            r10.append(r9)     // Catch:{ all -> 0x0424 }
            X.C22028Xth.A05(r13, r10)     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0424 }
            r10 = -309648884(0xffffffffed8b220c, float:-5.382447E27)
            X.AnonymousClass0fa.A00(r10)     // Catch:{ all -> 0x0424 }
            r4.execSQL(r9)     // Catch:{ all -> 0x0424 }
            r9 = -386407652(0xffffffffe8f7e31c, float:-9.3649116E24)
            X.AnonymousClass0fa.A00(r9)     // Catch:{ all -> 0x0424 }
            int r12 = r12 + 1
            goto L_0x024c
        L_0x0285:
            boolean r9 = r21.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r9 == 0) goto L_0x036f
            java.lang.String r14 = "abed35df76b8d1f1350e076f2e4d833f2ca775f7"
            java.lang.String r36 = "sqliteproc_metadata "
            r20 = 0
            java.lang.String r10 = "_id"
            java.lang.String r9 = "index_hash"
            java.lang.String[] r37 = new java.lang.String[]{r10, r9}     // Catch:{ all -> 0x0424 }
            java.lang.String r38 = "table_name = ?"
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0424 }
            java.lang.String[] r39 = new java.lang.String[]{r9}     // Catch:{ all -> 0x0424 }
            r15 = 3
            r41 = 0
            r10 = 5
            r40 = r41
            r42 = r41
            java.lang.Object[] r9 = new java.lang.Object[]{r36, r37, r38, r39, r40, r41, r42}     // Catch:{ all -> 0x0424 }
            r10 = r9[r10]     // Catch:{ all -> 0x0424 }
            if (r10 == 0) goto L_0x02b8
            android.database.Cursor r10 = X.YBX.A00(r7, r9)     // Catch:{ all -> 0x0424 }
            goto L_0x02de
        L_0x02b8:
            android.database.sqlite.SQLiteDatabase r36 = r7.AWy()     // Catch:{ all -> 0x0424 }
            r13 = r9[r20]     // Catch:{ all -> 0x0424 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0424 }
            r12 = r9[r17]     // Catch:{ all -> 0x0424 }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ all -> 0x0424 }
            r11 = r9[r8]     // Catch:{ all -> 0x0424 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0424 }
            r10 = r9[r15]     // Catch:{ all -> 0x0424 }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x0424 }
            r9 = r9[r34]     // Catch:{ all -> 0x0424 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0424 }
            r37 = r13
            r38 = r12
            r39 = r11
            r40 = r10
            r43 = r9
            android.database.Cursor r10 = r36.query(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0424 }
        L_0x02de:
            if (r10 == 0) goto L_0x0418
            boolean r9 = r10.isClosed()     // Catch:{ all -> 0x0413 }
            if (r9 != 0) goto L_0x03ff
            boolean r9 = r10.moveToFirst()     // Catch:{ all -> 0x0413 }
            if (r9 == 0) goto L_0x02f3
            r9 = r17
            java.lang.String r9 = r10.getString(r9)     // Catch:{ all -> 0x0413 }
            goto L_0x02f4
        L_0x02f3:
            r9 = 0
        L_0x02f4:
            r10.close()     // Catch:{ all -> 0x0424 }
            boolean r9 = r14.equals(r9)     // Catch:{ all -> 0x0424 }
            if (r9 != 0) goto L_0x036f
            java.lang.String r14 = "recreate_indices_savepoint"
            X.C21992XpF.A00(r4, r14)     // Catch:{ all -> 0x0424 }
            r13 = 0
            X.XZt[] r12 = r6.A01(r3)     // Catch:{ SQLException -> 0x0365 }
            java.lang.String r10 = "recreateIndices"
            r9 = -1205995402(0xffffffffb81df876, float:-3.7663114E-5)
            X.0ff.A01(r10, r9)     // Catch:{ SQLException -> 0x0365 }
            java.lang.String r10 = "sqlite_autoindex_"
            java.lang.String r9 = "_"
            java.lang.String r11 = X.002.A0g(r10, r1, r9)     // Catch:{ all -> 0x035d }
            java.lang.String[] r10 = new java.lang.String[]{r1}     // Catch:{ all -> 0x035d }
            java.lang.String r9 = "SELECT name FROM sqlite_master WHERE type == 'index' AND tbl_name == ?"
            android.database.Cursor r10 = r4.rawQuery(r9, r10)     // Catch:{ all -> 0x035d }
        L_0x0321:
            boolean r9 = r10.moveToNext()     // Catch:{ all -> 0x0358 }
            if (r9 == 0) goto L_0x034b
            r9 = r20
            java.lang.String r15 = r10.getString(r9)     // Catch:{ all -> 0x0358 }
            if (r15 == 0) goto L_0x0321
            boolean r9 = r15.startsWith(r11)     // Catch:{ all -> 0x0358 }
            if (r9 != 0) goto L_0x0321
            java.lang.String r9 = "DROP INDEX "
            java.lang.String r9 = X.002.A0R(r9, r15)     // Catch:{ all -> 0x0358 }
            r15 = 392715864(0x17685e58, float:7.508232E-25)
            X.AnonymousClass0fa.A00(r15)     // Catch:{ all -> 0x0358 }
            r4.execSQL(r9)     // Catch:{ all -> 0x0358 }
            r9 = -94312165(0xfffffffffa60e91b, float:-2.919506E35)
            X.AnonymousClass0fa.A00(r9)     // Catch:{ all -> 0x0358 }
            goto L_0x0321
        L_0x034b:
            r10.close()     // Catch:{ all -> 0x035d }
            X.C22028Xth.A03(r4, r1, r12)     // Catch:{ all -> 0x035d }
            r9 = 259119985(0xf71db71, float:1.192448E-29)
            X.0ff.A00(r9)     // Catch:{ SQLException -> 0x0365 }
            goto L_0x0369
        L_0x0358:
            r9 = move-exception
            r10.close()     // Catch:{ all -> 0x035d }
            throw r9     // Catch:{ all -> 0x035d }
        L_0x035d:
            r10 = move-exception
            r9 = -1098610923(0xffffffffbe848715, float:-0.2588431)
            X.0ff.A00(r9)     // Catch:{ SQLException -> 0x0365 }
            throw r10     // Catch:{ SQLException -> 0x0365 }
        L_0x0365:
            r13 = move-exception
            X.C21992XpF.A02(r4, r14)     // Catch:{ all -> 0x041f }
        L_0x0369:
            X.C21992XpF.A01(r4, r14)     // Catch:{ all -> 0x0424 }
            if (r13 == 0) goto L_0x036f
            goto L_0x03ed
        L_0x036f:
            boolean r9 = r21.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r9 == 0) goto L_0x0382
            boolean r9 = r22.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r9 == 0) goto L_0x0382
            r0 = 0
            X.XZv r9 = new X.XZv     // Catch:{ all -> 0x0424 }
            r9.<init>(r0, r8)     // Catch:{ all -> 0x0424 }
            goto L_0x03af
        L_0x0382:
            r10 = 6
            X.XZv r9 = new X.XZv     // Catch:{ all -> 0x0424 }
            r9.<init>(r0, r10)     // Catch:{ all -> 0x0424 }
            goto L_0x03af
        L_0x0389:
            X.XZt[] r9 = r6.A01(r3)     // Catch:{ all -> 0x0424 }
            java.lang.String r0 = "DROP TABLE IF EXISTS "
            java.lang.String r10 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x0424 }
            r0 = -463443053(0xffffffffe4606b93, float:-1.6559289E22)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ all -> 0x0424 }
            r4.execSQL(r10)     // Catch:{ all -> 0x0424 }
            r0 = -474708895(0xffffffffe3b48461, float:-6.6599057E21)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ all -> 0x0424 }
            X.C22028Xth.A02(r4, r1, r2, r9)     // Catch:{ all -> 0x0424 }
            r10 = 3
            if (r11 == 0) goto L_0x03a9
            r10 = 5
        L_0x03a9:
            r0 = 0
            X.XZv r9 = new X.XZv     // Catch:{ all -> 0x0424 }
            r9.<init>(r0, r10)     // Catch:{ all -> 0x0424 }
        L_0x03af:
            r0 = 1158937850(0x4513fcfa, float:2367.811)
            X.0ff.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            goto L_0x03bd
        L_0x03b6:
            r10 = 1
        L_0x03b7:
            r0 = 0
            X.XZv r9 = new X.XZv     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r9.<init>(r0, r10)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x03bd:
            int r10 = r9.A00     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = r17
            if (r10 == r0) goto L_0x03d4
            X.C22019Xsu.A03(r4, r1, r2)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = r26
            java.lang.String r2 = r0.A00     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r0 = "abed35df76b8d1f1350e076f2e4d833f2ca775f7"
            X.C22019Xsu.A02(r4, r1, r2, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = 5
            if (r10 != r0) goto L_0x03db
            r27 = 1
        L_0x03d4:
            int r3 = r3 + 1
            if (r3 < r8) goto L_0x0096
            if (r27 != 0) goto L_0x0524
            goto L_0x042c
        L_0x03db:
            r0 = 3
            if (r10 != r0) goto L_0x03e4
            r0 = r35
            r0.add(r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            goto L_0x03d4
        L_0x03e4:
            r0 = 6
            if (r10 != r0) goto L_0x03d4
            X.XbH r0 = r9.A01     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r5.put(r3, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            goto L_0x03d4
        L_0x03ed:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0424 }
            java.lang.String r0 = "Detected exception when recreating indices: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r13, r0, r2)     // Catch:{ all -> 0x0424 }
            X.C22028Xth.A06(r1, r0)     // Catch:{ all -> 0x0424 }
        L_0x03fa:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0423
        L_0x03ff:
            java.lang.String r1 = android.util.Log.getStackTraceString(r41)     // Catch:{ all -> 0x0413 }
            java.lang.String r0 = "AbstractDAOItem"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x0413 }
            r0 = 54
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x0413 }
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r1)     // Catch:{ all -> 0x0413 }
            throw r0     // Catch:{ all -> 0x0413 }
        L_0x0413:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0424 }
            goto L_0x0423
        L_0x0418:
            java.lang.String r0 = "cursor is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x0424 }
            goto L_0x0423
        L_0x041f:
            r0 = move-exception
            X.C21992XpF.A01(r4, r14)     // Catch:{ all -> 0x0424 }
        L_0x0423:
            throw r0     // Catch:{ all -> 0x0424 }
        L_0x0424:
            r1 = move-exception
            r0 = -1248369900(0xffffffffb5976314, float:-1.1279212E-6)
            X.0ff.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            throw r1     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x042c:
            boolean r0 = r35.isEmpty()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 != 0) goto L_0x04ab
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XIi r9 = new X.XIi     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r1 = r32
            r0 = r31
            r9.<init>(r1, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XIi r3 = new X.XIi     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r1 = r30
            r0 = r29
            r3.<init>(r1, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XIi[] r9 = new X.C21188XIi[]{r9, r3}     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r3 = 0
        L_0x044d:
            r0 = r9[r3]     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r1 = r0.A01     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.Xd8[] r0 = r6.A00(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.C22028Xth.A07(r1, r2, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            int r3 = r3 + 1
            if (r3 < r8) goto L_0x044d
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = r35
            r9.<init>(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1D(r35)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x0467:
            boolean r0 = r10.isEmpty()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 != 0) goto L_0x04ab
            r0 = 0
            java.lang.Object r1 = r10.remove(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 == 0) goto L_0x0467
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x0482:
            boolean r0 = r8.hasNext()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 == 0) goto L_0x0467
            java.lang.String r3 = X.AnonymousClass7TE.A18(r8)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r0 = "DELETE FROM "
            java.lang.String r1 = X.002.A0R(r0, r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = -1292425346(0xffffffffb2f7277e, float:-2.8772543E-8)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r4.execSQL(r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = -337255030(0xffffffffebe5e58a, float:-5.5585596E26)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            boolean r0 = r9.add(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 == 0) goto L_0x0482
            r10.add(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            goto L_0x0482
        L_0x04ab:
            int r8 = r5.size()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r3 = 0
        L_0x04b0:
            if (r3 >= r8) goto L_0x04fb
            int r0 = r5.keyAt(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.Object r2 = r5.get(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XbH r2 = (X.XbH) r2     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.List r0 = r2.A06     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x04c2:
            boolean r0 = r1.hasNext()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 == 0) goto L_0x04da
            r1.next()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            boolean r0 = X.C22028Xth.A08()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 == 0) goto L_0x04c2
            X.XZ3 r0 = new X.XZ3     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.C22028Xth.A01(r4, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            goto L_0x04c2
        L_0x04da:
            java.util.List r0 = r2.A00     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x04e0:
            boolean r0 = r1.hasNext()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 == 0) goto L_0x04f8
            r1.next()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            boolean r0 = X.C22028Xth.A08()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 == 0) goto L_0x04e0
            X.XZ3 r0 = new X.XZ3     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.C22028Xth.A01(r4, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            goto L_0x04e0
        L_0x04f8:
            int r3 = r3 + 1
            goto L_0x04b0
        L_0x04fb:
            int r9 = r5.size()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r8 = 0
        L_0x0500:
            if (r8 >= r9) goto L_0x056c
            int r3 = r5.keyAt(r8)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.Object r0 = r5.get(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XbH r0 = (X.XbH) r0     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.List r0 = r0.A06     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            boolean r0 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 != 0) goto L_0x0521
            r2 = r28[r3]     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.Xd8[] r1 = r6.A00(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XZt[] r0 = r6.A01(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.C22028Xth.A00(r4, r2, r1, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x0521:
            int r8 = r8 + 1
            goto L_0x0500
        L_0x0524:
            int r10 = r5.size()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r9 = 0
        L_0x0529:
            if (r9 >= r10) goto L_0x054d
            int r3 = r5.keyAt(r9)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.Object r0 = r5.get(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XbH r0 = (X.XbH) r0     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.List r0 = r0.A06     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            boolean r0 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 != 0) goto L_0x054a
            r2 = r28[r3]     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.Xd8[] r1 = r6.A00(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.XZt[] r0 = r6.A01(r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            X.C22028Xth.A00(r4, r2, r1, r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x054a:
            int r9 = r9 + 1
            goto L_0x0529
        L_0x054d:
            r2 = 0
        L_0x054e:
            r0 = r28[r2]     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r1 = r0.A01     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r0 = "DELETE FROM "
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = -1292425346(0xffffffffb2f7277e, float:-2.8772543E-8)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r4.execSQL(r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = -337255030(0xffffffffebe5e58a, float:-5.5585596E26)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            int r2 = r2 + 1
            if (r2 >= r8) goto L_0x056c
            goto L_0x054e
        L_0x056c:
            android.database.sqlite.SQLiteDatabase r3 = r7.AWy()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r2 = 0
            r1 = r18
            r0 = r19
            X.C22019Xsu.A02(r3, r1, r0, r2)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.util.Iterator r5 = r25.iterator()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
        L_0x057c:
            boolean r0 = r5.hasNext()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            if (r0 == 0) goto L_0x05b0
            java.lang.String r3 = X.AnonymousClass7TE.A18(r5)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r0 = "DROP TABLE IF EXISTS "
            java.lang.String r1 = X.002.A0R(r0, r3)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = -1831239079(0xffffffff92d98259, float:-1.37267585E-27)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r4.execSQL(r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = 377374831(0x167e486f, float:2.0540813E-25)
            X.AnonymousClass0fa.A00(r0)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String[] r1 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r0 = "sqliteproc_schema"
            java.lang.String r2 = "table_name = ?"
            r4.delete(r0, r2, r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String[] r1 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            java.lang.String r0 = "sqliteproc_metadata"
            r4.delete(r0, r2, r1)     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            goto L_0x057c
        L_0x05b0:
            r4.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x05c1, all -> 0x05b8 }
            r0 = 1497886630(0x5947efa6, float:3.51731354E15)
            goto L_0x066c
        L_0x05b8:
            r1 = move-exception
            r0 = 800240147(0x2fb2b213, float:3.250454E-10)
            X.AnonymousClass0fa.A03(r4, r0)     // Catch:{ all -> 0x067d }
            goto L_0x066b
        L_0x05c1:
            r0 = 581579722(0x22aa33ca, float:4.6133426E-18)
            X.AnonymousClass0fa.A03(r4, r0)     // Catch:{ all -> 0x067d }
            java.lang.String r1 = "Failed to migrate database, so using fallback that safely drops/recreates all tables."
            r0 = r16
            X.0KC.A0E(r0, r1)     // Catch:{ all -> 0x067d }
            android.database.sqlite.SQLiteDatabase r4 = r7.AWy()     // Catch:{ all -> 0x067d }
            r0 = -652041695(0xffffffffd922a221, float:-2.86107555E15)
            X.AnonymousClass0fa.A01(r4, r0)     // Catch:{ all -> 0x067d }
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x0664 }
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0664 }
            java.util.HashSet r0 = X.C22019Xsu.A01(r7)     // Catch:{ all -> 0x0664 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0664 }
        L_0x05e8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x05fa
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)     // Catch:{ all -> 0x0664 }
            X.Xd8[] r0 = X.C22019Xsu.A04(r7, r1)     // Catch:{ all -> 0x0664 }
            X.C22028Xth.A07(r1, r3, r0)     // Catch:{ all -> 0x0664 }
            goto L_0x05e8
        L_0x05fa:
            java.util.HashSet r0 = X.C22019Xsu.A01(r7)     // Catch:{ all -> 0x0664 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0664 }
        L_0x0602:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0610
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ all -> 0x0664 }
            X.C22028Xth.A04(r7, r0, r3, r5)     // Catch:{ all -> 0x0664 }
            goto L_0x0602
        L_0x0610:
            java.lang.String r1 = "live_location_sessions"
            java.lang.String r0 = "3b5dcd93f5e7177914a5563a91f2383481c797df"
            X.XIi r3 = new X.XIi     // Catch:{ all -> 0x0664 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0664 }
            java.lang.String r2 = "live_location_sharers"
            java.lang.String r1 = "53f769b8cd72a898ebbf56276cf53c61b5826d95"
            X.XIi r0 = new X.XIi     // Catch:{ all -> 0x0664 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0664 }
            X.XIi[] r9 = new X.C21188XIi[]{r3, r0}     // Catch:{ all -> 0x0664 }
            r8 = 0
        L_0x0627:
            r5 = r9[r8]     // Catch:{ all -> 0x0664 }
            java.lang.String r3 = r5.A01     // Catch:{ all -> 0x0664 }
            X.XZt[] r2 = r6.A01(r8)     // Catch:{ all -> 0x0664 }
            X.Xd8[] r1 = r6.A00(r8)     // Catch:{ all -> 0x0664 }
            android.database.sqlite.SQLiteDatabase r0 = r7.AWy()     // Catch:{ all -> 0x0664 }
            X.C22028Xth.A02(r0, r3, r1, r2)     // Catch:{ all -> 0x0664 }
            android.database.sqlite.SQLiteDatabase r0 = r7.AWy()     // Catch:{ all -> 0x0664 }
            X.C22019Xsu.A03(r0, r3, r1)     // Catch:{ all -> 0x0664 }
            android.database.sqlite.SQLiteDatabase r2 = r7.AWy()     // Catch:{ all -> 0x0664 }
            java.lang.String r1 = r5.A00     // Catch:{ all -> 0x0664 }
            java.lang.String r0 = "abed35df76b8d1f1350e076f2e4d833f2ca775f7"
            X.C22019Xsu.A02(r2, r3, r1, r0)     // Catch:{ all -> 0x0664 }
            int r8 = r8 + 1
            r0 = 2
            if (r8 < r0) goto L_0x0627
            android.database.sqlite.SQLiteDatabase r3 = r7.AWy()     // Catch:{ all -> 0x0664 }
            r2 = 0
            r1 = r18
            r0 = r19
            X.C22019Xsu.A02(r3, r1, r0, r2)     // Catch:{ all -> 0x0664 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0664 }
            r0 = -1254626903(0xffffffffb537e9a9, float:-6.851283E-7)
            goto L_0x066c
        L_0x0664:
            r1 = move-exception
            r0 = 2063064401(0x7af7dd51, float:6.4349308E35)
            X.AnonymousClass0fa.A03(r4, r0)     // Catch:{ all -> 0x067d }
        L_0x066b:
            throw r1     // Catch:{ all -> 0x067d }
        L_0x066c:
            X.AnonymousClass0fa.A03(r4, r0)     // Catch:{ all -> 0x067d }
        L_0x066f:
            r1 = r47
            r0 = r17
            r1.setForeignKeyConstraintsEnabled(r0)     // Catch:{ all -> 0x067d }
            r0 = -1080327695(0xffffffffbf9b81f1, float:-1.214903)
            X.0ff.A00(r0)
            return
        L_0x067d:
            r1 = move-exception
            r0 = 1309693588(0x4e105694, float:6.0539827E8)
            X.0ff.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21125XFq.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        if (i < 3) {
            A00(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            AnonymousClass7TE.A1F().add("metadata_version_upgrade_old");
            return;
        }
        0ff.A01("upgrade_metadata", -1719321993);
        C21992XpF.A00(sQLiteDatabase, "update_metadata_savepoint");
        AnonymousClass0fa.A00(-295715942);
        sQLiteDatabase.execSQL("PRAGMA defer_foreign_keys = ON");
        AnonymousClass0fa.A00(774941575);
        SQLException e = null;
        if (i == 3) {
            try {
                AnonymousClass0fa.A00(-134207813);
                sQLiteDatabase.execSQL("ALTER TABLE sqliteproc_metadata ADD COLUMN index_hash TEXT;");
                AnonymousClass0fa.A00(-1409265254);
                String A0g = 002.A0g("CREATE TABLE _temp_sqliteproc_schema (", "_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, table_name TEXT NOT NULL, name TEXT NOT NULL, type_name TEXT NOT NULL, default_value TEXT, is_nullable INTEGER NOT NULL, is_primary INTEGER NOT NULL, is_autoincrement INTEGER NOT NULL, is_deleted INTEGER NOT NULL, is_added INTEGER NOT NULL, foreign_table TEXT, foreign_column TEXT, on_foreign_key_update TEXT, on_foreign_key_delete TEXT", ")");
                AnonymousClass0fa.A00(788577765);
                sQLiteDatabase.execSQL(A0g);
                AnonymousClass0fa.A00(228951583);
                String A11 = 002.A11("INSERT OR IGNORE INTO _temp_sqliteproc_schema (", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", ")SELECT ", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", " FROM sqliteproc_schema;");
                AnonymousClass0fa.A00(-176873696);
                sQLiteDatabase.execSQL(A11);
                AnonymousClass0fa.A00(1393872108);
                AnonymousClass0fa.A00(1728415561);
                sQLiteDatabase.execSQL("DROP TABLE sqliteproc_schema;");
                AnonymousClass0fa.A00(-1817531416);
                String A0g2 = 002.A0g("CREATE TABLE sqliteproc_schema (", "_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, table_name TEXT NOT NULL, name TEXT NOT NULL, type_name TEXT NOT NULL, default_value TEXT, is_nullable INTEGER NOT NULL, is_primary INTEGER NOT NULL, is_autoincrement INTEGER NOT NULL, is_deleted INTEGER NOT NULL, is_added INTEGER NOT NULL, foreign_table TEXT, foreign_column TEXT, on_foreign_key_update TEXT, on_foreign_key_delete TEXT", ")");
                AnonymousClass0fa.A00(-564102168);
                sQLiteDatabase.execSQL(A0g2);
                AnonymousClass0fa.A00(-1398834549);
                AnonymousClass0fa.A00(-1008897924);
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX sqliteproc_schema_name_table_name ON sqliteproc_schema(name, table_name)");
                AnonymousClass0fa.A00(-581202494);
                String A112 = 002.A11("INSERT OR IGNORE INTO sqliteproc_schema (", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", ")SELECT ", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", " FROM _temp_sqliteproc_schema;");
                AnonymousClass0fa.A00(-1977747350);
                sQLiteDatabase.execSQL(A112);
                AnonymousClass0fa.A00(1503411433);
                AnonymousClass0fa.A00(-736911587);
                sQLiteDatabase.execSQL("DROP TABLE _temp_sqliteproc_schema");
                AnonymousClass0fa.A00(-1718174911);
            } catch (SQLException e2) {
                e = e2;
                C21992XpF.A02(sQLiteDatabase, "update_metadata_savepoint");
            } catch (Throwable th) {
                C21992XpF.A01(sQLiteDatabase, "update_metadata_savepoint");
                throw th;
            }
        }
        C21992XpF.A01(sQLiteDatabase, "update_metadata_savepoint");
        if (e != null) {
            A00(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            AnonymousClass7TE.A1F().add("metadata_version_upgrade_error");
        }
        0ff.A00(-813160151);
    }

    private void A00(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0fa.A00(1030865728);
        sQLiteDatabase.execSQL("PRAGMA defer_foreign_keys = ON");
        AnonymousClass0fa.A00(876326482);
        Iterator it = C22019Xsu.A01(this.A01).iterator();
        while (it.hasNext()) {
            String A0R = 002.A0R("DROP TABLE IF EXISTS ", AnonymousClass7TE.A18(it));
            AnonymousClass0fa.A00(-965982083);
            sQLiteDatabase.execSQL(A0R);
            AnonymousClass0fa.A00(-594913825);
        }
        AnonymousClass0fa.A00(1976812883);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sqliteproc_metadata");
        AnonymousClass0fa.A00(-712954275);
        AnonymousClass0fa.A00(1166523650);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sqliteproc_schema");
        AnonymousClass0fa.A00(-1932114081);
    }
}
