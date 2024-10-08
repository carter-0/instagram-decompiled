package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.ObC  reason: case insensitive filesystem */
public final class C71086ObC {
    public static final OQ4 A02 = new Object();
    public final long A00;
    public final UserSession A01;

    public C71086ObC(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = 182.A01(0Tu.A05, userSession, 36601792901419354L);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (X.11Z.A07() != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        if (X.11Z.A07() != false) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ef A[Catch:{ all -> 0x01a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012d A[Catch:{ all -> 0x01a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135 A[Catch:{ all -> 0x01a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0148 A[Catch:{ all -> 0x01a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b A[Catch:{ all -> 0x01a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A02(long r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x01ac }
            long r0 = r0.toSeconds(r14)     // Catch:{ all -> 0x01ac }
            int r8 = (int) r0     // Catch:{ all -> 0x01ac }
            com.instagram.common.session.UserSession r6 = r13.A01     // Catch:{ all -> 0x01ac }
            X.MmS r9 = X.C66833MdR.A00(r6)     // Catch:{ all -> 0x01ac }
            r2 = 0
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x01ac }
            r0 = 2342161901214571185(0x208107d700591ab1, double:4.064646390970203E-152)
            boolean r0 = X.182.A06(r4, r6, r0)     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x0024
            X.MdY r3 = X.C66843Mdb.A01(r6)     // Catch:{ all -> 0x01ac }
        L_0x0020:
            r9.A00(r8)     // Catch:{ all -> 0x01ac }
            goto L_0x0026
        L_0x0024:
            r3 = 0
            goto L_0x0020
        L_0x0026:
            if (r3 == 0) goto L_0x004e
            int r0 = com.facebook.msys.mci.Execution.getExecutionContext()     // Catch:{ all -> 0x01ac }
            if (r0 != 0) goto L_0x0035
            boolean r0 = X.11Z.A07()     // Catch:{ all -> 0x01ac }
            r5 = 1
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.17k.A0J(r5, r0, r1)     // Catch:{ all -> 0x01ac }
            X.Mdg r5 = X.O4V.A00     // Catch:{ all -> 0x01ac }
            com.instagram.common.session.UserSession r1 = r3.A00     // Catch:{ all -> 0x01ac }
            X.Pno r0 = X.C74023Pno.A00     // Catch:{ all -> 0x01ac }
            com.google.common.util.concurrent.SettableFuture r7 = r5.A01(r1, r0)     // Catch:{ all -> 0x01ac }
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r5 = "Synchronous purge of deleted messages"
            X.C66840MdY.A06(r5, r7, r0)     // Catch:{ all -> 0x01ac }
        L_0x004e:
            X.MmU r0 = r9.A01     // Catch:{ all -> 0x01ac }
            com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase r9 = r0.A02     // Catch:{ all -> 0x01ac }
            X.O4C r5 = r9.A02()     // Catch:{ all -> 0x01ac }
            X.MmV r5 = (X.C67354MmV) r5     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = "SELECT message_deletion_ts_sec FROM messages_table WHERE message_deletion_ts_sec IS NOT NULL ORDER BY message_deletion_ts_sec ASC LIMIT 1"
            java.util.TreeMap r0 = X.1WY.A08     // Catch:{ all -> 0x01ac }
            X.1WY r7 = X.1Wa.A00(r1, r2)     // Catch:{ all -> 0x01ac }
            X.3oI r0 = r5.A00     // Catch:{ all -> 0x01ac }
            r0.assertNotSuspendingTransaction()     // Catch:{ all -> 0x01ac }
            r5 = 0
            android.database.Cursor r1 = r0.query((X.AnonymousClass1WA) r7, (android.os.CancellationSignal) r5)     // Catch:{ all -> 0x01ac }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x007a
            boolean r0 = r1.isNull(r2)     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x007a
            java.lang.Integer r5 = X.C66581MXm.A0n(r1, r2)     // Catch:{ all -> 0x01a4 }
        L_0x007a:
            r1.close()     // Catch:{ all -> 0x01ac }
            r7.A00()     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x008e
            int r0 = r5.intValue()     // Catch:{ all -> 0x01ac }
            long r0 = (long) r0     // Catch:{ all -> 0x01ac }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x01ac }
            long r11 = r4.toMillis(r0)     // Catch:{ all -> 0x01ac }
            goto L_0x00e7
        L_0x008e:
            X.O4C r1 = r9.A02()     // Catch:{ all -> 0x01ac }
            X.MmV r1 = (X.C67354MmV) r1     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = "SELECT message_expiration_ts_sec FROM messages_table WHERE message_expiration_ts_sec IS NOT NULL ORDER BY message_expiration_ts_sec ASC LIMIT 1"
            X.1WY r7 = X.1Wa.A00(r0, r2)     // Catch:{ all -> 0x01ac }
            X.3oI r0 = r1.A00     // Catch:{ all -> 0x01ac }
            r0.assertNotSuspendingTransaction()     // Catch:{ all -> 0x01ac }
            r5 = 0
            android.database.Cursor r1 = r0.query((X.AnonymousClass1WA) r7, (android.os.CancellationSignal) r5)     // Catch:{ all -> 0x01ac }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r1.isNull(r2)     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x00b4
            java.lang.Integer r5 = X.C66581MXm.A0n(r1, r2)     // Catch:{ all -> 0x01a4 }
        L_0x00b4:
            r1.close()     // Catch:{ all -> 0x01ac }
            r7.A00()     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x00ec
            int r0 = r5.intValue()     // Catch:{ all -> 0x01ac }
            long r0 = (long) r0     // Catch:{ all -> 0x01ac }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x01ac }
            long r11 = r5.toMillis(r0)     // Catch:{ all -> 0x01ac }
            boolean r7 = X.C308556Us.A03(r6)     // Catch:{ all -> 0x01ac }
            r0 = 36601792901222745(0x82092300051159, double:3.2104594420988914E-306)
            long r0 = X.182.A01(r4, r6, r0)     // Catch:{ all -> 0x01ac }
            r9 = 2
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x00e2
            if (r7 == 0) goto L_0x00df
            r0 = 21600(0x5460, double:1.0672E-319)
            goto L_0x00e2
        L_0x00df:
            r0 = 1209600(0x127500, double:5.97622E-318)
        L_0x00e2:
            long r0 = r5.toMillis(r0)     // Catch:{ all -> 0x01ac }
            long r11 = r11 + r0
        L_0x00e7:
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01ac }
            goto L_0x00ed
        L_0x00ec:
            r9 = 0
        L_0x00ed:
            if (r3 == 0) goto L_0x012d
            int r0 = com.facebook.msys.mci.Execution.getExecutionContext()     // Catch:{ all -> 0x01ac }
            if (r0 != 0) goto L_0x00fc
            boolean r0 = X.11Z.A07()     // Catch:{ all -> 0x01ac }
            r4 = 1
            if (r0 == 0) goto L_0x00fd
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.17k.A0J(r4, r0, r1)     // Catch:{ all -> 0x01ac }
            X.Mdg r2 = X.O4V.A00     // Catch:{ all -> 0x01ac }
            com.instagram.common.session.UserSession r1 = r3.A00     // Catch:{ all -> 0x01ac }
            X.Pnk r0 = X.C74019Pnk.A00     // Catch:{ all -> 0x01ac }
            com.google.common.util.concurrent.SettableFuture r3 = r2.A01(r1, r0)     // Catch:{ all -> 0x01ac }
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r0 = "Synchronous get next deleted message purge timestamp fetch"
            X.0eP r0 = X.C66840MdY.A06(r0, r3, r1)     // Catch:{ all -> 0x01ac }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x01ac }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x01ac }
            r11 = 0
            if (r0 == 0) goto L_0x012e
            long r4 = r0.longValue()     // Catch:{ all -> 0x01ac }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01ac }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x012e
            r11 = r3
            goto L_0x012e
        L_0x012d:
            r11 = 0
        L_0x012e:
            X.0rl r7 = new X.0rl     // Catch:{ all -> 0x01ac }
            r7.<init>()     // Catch:{ all -> 0x01ac }
            if (r9 == 0) goto L_0x0148
            if (r11 == 0) goto L_0x0149
            long r2 = r9.longValue()     // Catch:{ all -> 0x01ac }
            long r0 = r11.longValue()     // Catch:{ all -> 0x01ac }
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x01ac }
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ac }
            goto L_0x0149
        L_0x0148:
            r9 = r11
        L_0x0149:
            if (r9 == 0) goto L_0x01a2
            long r2 = r9.longValue()     // Catch:{ all -> 0x01ac }
            r7.A00 = r2     // Catch:{ all -> 0x01ac }
            long r4 = (long) r8     // Catch:{ all -> 0x01ac }
            long r0 = r4 - r2
            r9 = 1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0181
            X.0wj r9 = X.0wj.A01     // Catch:{ all -> 0x01ac }
            r3 = 601237062(0x23d62646, float:2.3218136E-17)
            java.lang.String r2 = "deletion in past"
            X.0f9 r3 = r9.AEf(r2, r3)     // Catch:{ all -> 0x01ac }
            java.lang.String r2 = "seconds_in_past"
            r3.ABP(r2, r0)     // Catch:{ all -> 0x01ac }
            r0 = 1256(0x4e8, float:1.76E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x01ac }
            r3.ABO(r0, r8)     // Catch:{ all -> 0x01ac }
            java.lang.String r2 = "xplat_reverb_timestamp"
            if (r11 == 0) goto L_0x019f
            long r0 = r11.longValue()     // Catch:{ all -> 0x01ac }
        L_0x017b:
            r3.ABP(r2, r0)     // Catch:{ all -> 0x01ac }
            r3.report()     // Catch:{ all -> 0x01ac }
        L_0x0181:
            long r2 = r7.A00     // Catch:{ all -> 0x01ac }
            long r0 = r13.A00     // Catch:{ all -> 0x01ac }
            long r4 = r4 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x018c
            r7.A00 = r4     // Catch:{ all -> 0x01ac }
        L_0x018c:
            r0 = 43
            X.PqR r2 = new X.PqR     // Catch:{ all -> 0x01ac }
            r2.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r13)     // Catch:{ all -> 0x01ac }
            X.61K r1 = X.AnonymousClass61K.IGD_MEM     // Catch:{ all -> 0x01ac }
            r0 = 12
            X.PqK r0 = X.C74178PqK.A00(r2, r0)     // Catch:{ all -> 0x01ac }
            X.C67471MoQ.A01(r6, r1, r0)     // Catch:{ all -> 0x01ac }
            goto L_0x01a2
        L_0x019f:
            r0 = -1
            goto L_0x017b
        L_0x01a2:
            monitor-exit(r13)
            return
        L_0x01a4:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x01ac }
            r7.A00()     // Catch:{ all -> 0x01ac }
            throw r0     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71086ObC.A02(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(long r6, long r8, java.lang.String r10, long r11) {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            com.instagram.common.session.UserSession r3 = r5.A01     // Catch:{ all -> 0x0040 }
            boolean r0 = X.C308556Us.A05(r3)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0040 }
            r0 = 36323981531426451(0x810c7800022e93, double:3.034770413183119E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            X.2Dm r3 = X.2L2.A00(r3)     // Catch:{ all -> 0x0040 }
            X.3U9 r2 = r3.B34(r6)     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x002c
            java.lang.String r0 = "GetExtendedDirectThread"
            r3.CnE(r0)     // Catch:{ all -> 0x003c }
            X.3U9 r2 = r3.B34(r6)     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x003e
        L_0x002c:
            java.lang.String r1 = X.C2611348j.A04(r10, r11)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = A00(r2, r5, r0)     // Catch:{ all -> 0x0040 }
            r3.AEr(r2, r1, r0)     // Catch:{ all -> 0x0040 }
            goto L_0x003e
        L_0x003c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r4)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71086ObC.A03(long, long, java.lang.String, long):void");
    }

    public static final String A00(AnonymousClass2Ep r3, C71086ObC obC, String str) {
        Object obj;
        UserSession userSession = obC.A01;
        String str2 = userSession.A06;
        if (0qQ.A0K(str2, str) || 0qQ.A0K(String.valueOf(AnonymousClass7TF.A0Q(userSession).BST()), str)) {
            return str2;
        }
        Iterator it = r3.BRZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            User user = (User) obj;
            if (!0qQ.A0K(String.valueOf(user.BST()), str)) {
                if (0qQ.A0K(user.getId(), str)) {
                    break;
                }
            } else {
                break;
            }
        }
        User user2 = (User) obj;
        if (user2 != null) {
            return user2.getId();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A04(C70621ODs oDs, String str, long j, long j2, long j3, boolean z, boolean z2) {
        C70621ODs oDs2 = oDs;
        if (oDs2.A00 == C69405Nkj.DISAPPEARING_MESSAGE && oDs2.A01 != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long j4 = j3;
            long millis = timeUnit.toMillis(j4) + timeUnit.toMillis(DbY.A04(oDs2.A01));
            UserSession userSession = this.A01;
            long A012 = 182.A01(0Tu.A05, userSession, 36601792901222745L);
            if (A012 <= 2) {
                if (z2) {
                    A012 = 21600;
                } else {
                    A012 = 1209600;
                }
            }
            C67471MoQ.A01(userSession, AnonymousClass61K.IGD_MEM, C74178PqK.A00(new C74188PqU(15, (Object) new Date(millis), (Object) new Date(millis + timeUnit.toMillis(A012)), (Object) this), 12));
            if (z) {
                A03(j, j2, str, j4);
            }
        }
    }

    public static final List A01(Map map) {
        ArrayList A1F = 0Yv.A1F(map.values());
        ArrayList A0r = AnonymousClass7TG.A0r(A1F);
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            C61037Jvb jvb = (C61037Jvb) it.next();
            String str = jvb.A00;
            if (str == null) {
                str = jvb.A01;
            }
            A0r.add(str);
        }
        return A0r;
    }
}
