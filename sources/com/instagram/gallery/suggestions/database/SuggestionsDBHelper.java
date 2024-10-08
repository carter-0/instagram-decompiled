package com.instagram.gallery.suggestions.database;

import X.1VA;
import X.1VC;
import X.1Vg;
import X.AnonymousClass1WV;
import X.AnonymousClass7TF;
import X.C251983oI;
import X.C63273KuI;
import X.C64086LMe;
import X.C65607Lwi;
import X.JTS;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;

public final class SuggestionsDBHelper {
    public static final C63273KuI A00 = new Object();
    public static volatile SuggestionsDBHelper A01;

    public static final void A00(UserSession userSession, String str) {
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, str);
        C65607Lwi lwi = SuggestionsDatabase.A00;
        Class<SuggestionsDatabase> cls = SuggestionsDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (lwi) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    1VA A0F = JTS.A0F(userSession, lwi, cls);
                    1VC.A00(A0F, 1771825795, 1771825795, false);
                    igRoomDatabase = JTS.A0W(A0F, userSession, cls);
                }
            }
        }
        C64086LMe A002 = ((SuggestionsDatabase) igRoomDatabase).A00();
        C251983oI r3 = A002.A01;
        r3.assertNotSuspendingTransaction();
        1Vg r2 = A002.A02;
        AnonymousClass1WV acquire = r2.acquire();
        acquire.ADh(A1U ? 1 : 0, str);
        try {
            r3.beginTransaction();
            acquire.ATQ();
            r3.setTransactionSuccessful();
            r3.endTransaction();
            r2.release(acquire);
        } catch (Throwable th) {
            r2.release(acquire);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7 A[SYNTHETIC, Splitter:B:33:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9 A[Catch:{ SQLiteConstraintException -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9 A[Catch:{ SQLiteConstraintException -> 0x012a }, LOOP:0: B:47:0x00f3->B:49:0x00f9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0106 A[Catch:{ SQLiteConstraintException -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0126 A[Catch:{ SQLiteConstraintException -> 0x012a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r12, java.util.List r13, java.util.List r14, X.AnonymousClass4D7 r15) {
        /*
            r11 = this;
            r3 = 23
            boolean r0 = X.ME0.A02(r3, r15)
            if (r0 == 0) goto L_0x0029
            r4 = r15
            X.ME0 r4 = (X.ME0) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r4.A05
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r7 = 3
            r9 = 2
            r8 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0043
            if (r0 == r8) goto L_0x008e
            if (r0 == r9) goto L_0x0039
            if (r0 != r7) goto L_0x0034
            goto L_0x002f
        L_0x0029:
            X.ME0 r4 = new X.ME0
            r4.<init>(r11, r15, r3)
            goto L_0x0016
        L_0x002f:
            X.0eS.A00(r5)     // Catch:{ SQLiteConstraintException -> 0x012a }
            goto L_0x0134
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0039:
            java.lang.Object r1 = r4.A02
            com.instagram.gallery.suggestions.database.SuggestionsDatabase r1 = (com.instagram.gallery.suggestions.database.SuggestionsDatabase) r1
            java.lang.Object r14 = r4.A01
            java.util.List r14 = (java.util.List) r14
            goto L_0x00de
        L_0x0043:
            X.0eS.A00(r5)
            X.Lwi r5 = com.instagram.gallery.suggestions.database.SuggestionsDatabase.A00
            java.lang.Class<com.instagram.gallery.suggestions.database.SuggestionsDatabase> r10 = com.instagram.gallery.suggestions.database.SuggestionsDatabase.class
            java.lang.Object r1 = r12.A00(r10)
            com.instagram.roomdb.IgRoomDatabase r1 = (com.instagram.roomdb.IgRoomDatabase) r1
            if (r1 != 0) goto L_0x006f
            monitor-enter(r5)
            java.lang.Object r1 = r12.A00(r10)     // Catch:{ all -> 0x006b }
            com.instagram.roomdb.IgRoomDatabase r1 = (com.instagram.roomdb.IgRoomDatabase) r1     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x006e
            X.1VA r2 = X.JTS.A0F(r12, r5, r10)     // Catch:{ all -> 0x006b }
            r1 = 1771825795(0x699bea83, float:2.356137E25)
            r0 = 0
            X.1VC.A00(r2, r1, r1, r0)     // Catch:{ all -> 0x006b }
            com.instagram.roomdb.IgRoomDatabase r1 = X.JTS.A0W(r2, r12, r10)     // Catch:{ all -> 0x006b }
            goto L_0x006e
        L_0x006b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x006e:
            monitor-exit(r5)
        L_0x006f:
            com.instagram.gallery.suggestions.database.SuggestionsDatabase r1 = (com.instagram.gallery.suggestions.database.SuggestionsDatabase) r1
            X.LMe r10 = r1.A00()
            r4.A01 = r13
            r4.A02 = r14
            r4.A03 = r1
            r4.A04 = r10
            r4.A00 = r8
            X.3oI r5 = r10.A01
            r2 = 4
            X.MBL r0 = new X.MBL
            r0.<init>(r2, r10, r13)
            java.lang.Object r5 = X.AnonymousClass1t4.A00(r5, r4, r0)
            if (r5 != r3) goto L_0x00a1
            return r3
        L_0x008e:
            java.lang.Object r10 = r4.A04
            X.LMe r10 = (X.C64086LMe) r10
            java.lang.Object r1 = r4.A03
            com.instagram.gallery.suggestions.database.SuggestionsDatabase r1 = (com.instagram.gallery.suggestions.database.SuggestionsDatabase) r1
            java.lang.Object r14 = r4.A02
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r13 = r4.A01
            java.util.List r13 = (java.util.List) r13
            X.0eS.A00(r5)
        L_0x00a1:
            boolean r0 = X.G9w.A1b(r5)
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = X.00k.A0J(r13)     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.LAw r0 = (X.C63893LAw) r0     // Catch:{ SQLiteConstraintException -> 0x012a }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r2 = r0.A07     // Catch:{ SQLiteConstraintException -> 0x012a }
            goto L_0x00b3
        L_0x00b2:
            r2 = r6
        L_0x00b3:
            if (r2 == 0) goto L_0x0134
            r4.A01 = r14     // Catch:{ SQLiteConstraintException -> 0x012a }
            r4.A02 = r1     // Catch:{ SQLiteConstraintException -> 0x012a }
            r4.A03 = r6     // Catch:{ SQLiteConstraintException -> 0x012a }
            r4.A04 = r6     // Catch:{ SQLiteConstraintException -> 0x012a }
            r4.A00 = r9     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = "SELECT suggestion_id FROM suggestions WHERE suggestion_mode = ?"
            X.1WY r9 = X.JTO.A0M(r0, r8)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r9.ADh(r8, r2)     // Catch:{ SQLiteConstraintException -> 0x012a }
            android.os.CancellationSignal r8 = new android.os.CancellationSignal     // Catch:{ SQLiteConstraintException -> 0x012a }
            r8.<init>()     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.3oI r5 = r10.A01     // Catch:{ SQLiteConstraintException -> 0x012a }
            r0 = 15
            X.MB7 r2 = new X.MB7     // Catch:{ SQLiteConstraintException -> 0x012a }
            r2.<init>(r0, r10, r9)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r0 = 0
            java.lang.Object r5 = X.1wR.A00(r8, r5, r2, r4, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            if (r5 != r3) goto L_0x00e1
            return r3
        L_0x00de:
            X.0eS.A00(r5)     // Catch:{ SQLiteConstraintException -> 0x012a }
        L_0x00e1:
            java.util.List r5 = (java.util.List) r5     // Catch:{ SQLiteConstraintException -> 0x012a }
            com.instagram.gallery.suggestions.database.SuggestionsDatabase_Impl r1 = (com.instagram.gallery.suggestions.database.SuggestionsDatabase_Impl) r1     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.L4Z r0 = r1.A00     // Catch:{ SQLiteConstraintException -> 0x012a }
            if (r0 == 0) goto L_0x0106
            X.L4Z r9 = r1.A00     // Catch:{ SQLiteConstraintException -> 0x012a }
        L_0x00eb:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.util.Iterator r2 = r14.iterator()     // Catch:{ SQLiteConstraintException -> 0x012a }
        L_0x00f3:
            boolean r0 = r2.hasNext()     // Catch:{ SQLiteConstraintException -> 0x012a }
            if (r0 == 0) goto L_0x0116
            java.lang.Object r1 = r2.next()     // Catch:{ SQLiteConstraintException -> 0x012a }
            r0 = r1
            X.L6c r0 = (X.C63770L6c) r0     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = r0.A02     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.JTR.A1R(r0, r1, r8, r5)     // Catch:{ SQLiteConstraintException -> 0x012a }
            goto L_0x00f3
        L_0x0106:
            monitor-enter(r1)     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.L4Z r0 = r1.A00     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x0112
            X.L4Z r0 = new X.L4Z     // Catch:{ all -> 0x0127 }
            r0.<init>(r1)     // Catch:{ all -> 0x0127 }
            r1.A00 = r0     // Catch:{ all -> 0x0127 }
        L_0x0112:
            X.L4Z r9 = r1.A00     // Catch:{ all -> 0x0127 }
            monitor-exit(r1)     // Catch:{ all -> 0x0127 }
            goto L_0x00eb
        L_0x0116:
            r4.A01 = r6     // Catch:{ SQLiteConstraintException -> 0x012a }
            r4.A02 = r6     // Catch:{ SQLiteConstraintException -> 0x012a }
            r4.A00 = r7     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.3oI r1 = r9.A01     // Catch:{ SQLiteConstraintException -> 0x012a }
            r0 = 13
            java.lang.Object r0 = X.MB7.A01(r1, r9, r8, r4, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            if (r0 != r3) goto L_0x0134
            return r3
        L_0x0127:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0127 }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x012a }
        L_0x012a:
            X.0wj r2 = X.0wj.A01
            r1 = 817897079(0x30c01e77, float:1.3978497E-9)
            java.lang.String r0 = "Unable to insert suggestion media"
            r2.AEf(r0, r1)
        L_0x0134:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.gallery.suggestions.database.SuggestionsDBHelper.A01(com.instagram.common.session.UserSession, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }
}
