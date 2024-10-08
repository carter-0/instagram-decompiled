package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2j8  reason: invalid class name */
public final class AnonymousClass2j8 implements C61110lV, AnonymousClass0lh {
    public static final AnonymousClass2j9 A04 = new Object();
    public final Context A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final UserSession A02;
    public final 1Av A03;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x018f, code lost:
        if ((r24 + r2) < r2) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a8, code lost:
        if ((r20 - r18) > r8) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d9, code lost:
        if (r0 == false) goto L_0x01b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass2j8 r31) {
        /*
            r0 = r31
            android.content.Context r0 = r0.A00
            r30 = r0
            boolean r0 = X.0oI.A09(r30)
            if (r0 != 0) goto L_0x022d
            r28 = 60000(0xea60, double:2.9644E-319)
            r0 = r31
            com.instagram.common.session.UserSession r10 = r0.A02
            X.1Av r0 = r0.A03
            X.0xa r12 = r0.A01
            java.lang.String r3 = "bg_fetch_server_timing_ms"
            r0 = -1
            long r6 = r12.getLong(r3, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0103
            X.0xY r0 = r12.AR4()
            r0.ED3(r3)
            r0.apply()
            long r6 = r6 / r28
        L_0x0031:
            long r28 = r28 * r6
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316233410482302(0x81056c0003107e, double:3.02987047029886E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.Integer r27 = X.AnonymousClass05K.A01
        L_0x0042:
            X.45O r26 = X.AnonymousClass45O.A04
            X.PRg r1 = new X.PRg
            r0 = r31
            r1.<init>(r0)
            r24 = r0
            r25 = r1
            r24.A00(r25, r26, r27, r28)
            r0 = 36315309993561217(0x81049500130c81, double:3.0292864977196645E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0078
            r0 = 36316233410941057(0x81056c000a1081, double:3.0298704705889786E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x00da
            java.lang.Integer r27 = X.AnonymousClass05K.A01
        L_0x006a:
            X.45O r26 = X.AnonymousClass45O.A05
            X.PRe r1 = new X.PRe
            r0 = r31
            r1.<init>(r0)
            r25 = r1
            r24.A00(r25, r26, r27, r28)
        L_0x0078:
            r0 = 36316224820940908(0x81056a0009106c, double:3.029865038238295E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x009e
            r0 = 36316233411072130(0x81056c000c1082, double:3.02987047067187E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x00b7
            java.lang.Integer r27 = X.AnonymousClass05K.A01
        L_0x0090:
            X.45O r26 = X.AnonymousClass45O.A06
            X.PRf r1 = new X.PRf
            r0 = r31
            r1.<init>(r0)
            r25 = r1
            r24.A00(r25, r26, r27, r28)
        L_0x009e:
            r6 = 1
            r0 = 36322456817903809(0x810b15000028c1, double:3.0338061782118714E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x022d
            java.util.concurrent.atomic.AtomicBoolean r5 = X.C10040Rld.A00
            boolean r0 = r5.get()
            if (r0 != 0) goto L_0x022d
            java.lang.Class<X.4xQ> r3 = X.C278724xQ.class
            monitor-enter(r3)
            goto L_0x01df
        L_0x00b7:
            r0 = 36316224821334130(0x81056a000f1072, double:3.0298650384869704E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x00c5
            java.lang.Integer r27 = X.AnonymousClass05K.A00
            goto L_0x0090
        L_0x00c5:
            r0 = 36597699797126004(0x82056a00010b74, double:3.207870946586505E-306)
            long r5 = X.182.A01(r2, r10, r0)
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            java.lang.Integer r27 = X.AnonymousClass05K.A0C
            goto L_0x0090
        L_0x00d7:
            java.lang.Integer r27 = X.AnonymousClass05K.A0N
            goto L_0x0090
        L_0x00da:
            r0 = 36315309993757826(0x81049500160c82, double:3.029286497844001E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.Integer r27 = X.AnonymousClass05K.A00
            goto L_0x006a
        L_0x00e8:
            r0 = 36596784969288311(0x82049500040a77, double:3.207292405778232E-306)
            long r5 = X.182.A01(r2, r10, r0)
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fb
            java.lang.Integer r27 = X.AnonymousClass05K.A0C
            goto L_0x006a
        L_0x00fb:
            java.lang.Integer r27 = X.AnonymousClass05K.A0N
            goto L_0x006a
        L_0x00ff:
            java.lang.Integer r27 = X.AnonymousClass05K.A0N
            goto L_0x0042
        L_0x0103:
            java.lang.String r5 = "last_session_ts"
            long r3 = r12.getLong(r5, r0)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xY r2 = r12.AR4()
            r2.E5c(r5, r0)
            r2.apply()
            long r0 = r0 - r3
            int r2 = (int) r0
            r0 = 60000(0xea60, float:8.4078E-41)
            int r2 = r2 / r0
            r6 = 10
            if (r2 < 0) goto L_0x0031
            r0 = 600(0x258, float:8.41E-43)
            if (r2 >= r0) goto L_0x0031
            java.lang.String r27 = "total_sessions_count"
            r1 = 0
            r0 = r27
            int r11 = r12.getInt(r0, r1)
            long r8 = (long) r2
            r26 = r11
            r2 = 1
            if (r11 != 0) goto L_0x0151
            X.0xY r1 = r12.AR4()
            r1.E5Z(r0, r2)
        L_0x013b:
            r1.apply()
        L_0x013e:
            r0 = 100
            if (r11 < r0) goto L_0x0031
            java.lang.String r0 = "min_between_sessions"
            long r4 = r12.getLong(r0, r6)
            long r0 = (long) r11
            long r4 = r4 / r0
            double r2 = (double) r4
            r0 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r2 = r2 * r0
            long r6 = (long) r2
            goto L_0x0031
        L_0x0151:
            long r24 = r8 * r8
            java.lang.String r23 = "min_between_sessions"
            r0 = r23
            long r4 = r12.getLong(r0, r6)
            java.lang.String r22 = "min_between_sessions_sum_of_squares"
            r0 = 125(0x7d, double:6.2E-322)
            r2 = r22
            long r2 = r12.getLong(r2, r0)
            long r0 = (long) r11
            long r20 = r4 / r0
            long r13 = r20 * r20
            double r0 = (double) r2
            double r15 = (double) r11
            double r0 = r0 / r15
            double r15 = (double) r13
            double r0 = r0 - r15
            double r15 = java.lang.Math.sqrt(r0)
            long r18 = java.lang.Math.round(r15)
            r15 = 100
            if (r11 >= r15) goto L_0x01dc
            r15 = 10
        L_0x017d:
            long r18 = r18 * r15
            int r15 = r11 + 1
            if (r15 < r11) goto L_0x0191
            long r16 = r8 + r4
            int r15 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r15 < 0) goto L_0x0191
            long r16 = r24 + r2
            int r15 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            r17 = 0
            if (r15 >= 0) goto L_0x019d
        L_0x0191:
            r17 = 1
            r15 = 100
            long r4 = (long) r0
            long r4 = r4 + r13
            long r2 = r15 * r4
            long r4 = r20 * r15
            r26 = 100
        L_0x019d:
            long r13 = r20 + r18
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x01aa
            long r20 = r20 - r18
            int r1 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x01ab
        L_0x01aa:
            r0 = 1
        L_0x01ab:
            if (r17 != 0) goto L_0x01d9
            if (r0 != 0) goto L_0x013e
            int r26 = r26 + 1
        L_0x01b1:
            long r4 = r4 + r8
            long r2 = r2 + r24
        L_0x01b4:
            X.0xY r8 = r12.AR4()
            r1 = r27
            r0 = r26
            r8.E5Z(r1, r0)
            r8.apply()
            X.0xY r1 = r12.AR4()
            r0 = r23
            r1.E5c(r0, r4)
            r1.apply()
            X.0xY r1 = r12.AR4()
            r0 = r22
            r1.E5c(r0, r2)
            goto L_0x013b
        L_0x01d9:
            if (r0 != 0) goto L_0x01b4
            goto L_0x01b1
        L_0x01dc:
            r15 = 3
            goto L_0x017d
        L_0x01df:
            java.lang.Object r4 = r10.A00(r3)     // Catch:{ all -> 0x022a }
            X.4xQ r4 = (X.C278724xQ) r4     // Catch:{ all -> 0x022a }
            monitor-exit(r3)
            if (r4 != 0) goto L_0x01fc
            r0 = 276374592(0x10792440, float:4.9134517E-29)
            X.4xP r1 = new X.4xP
            r1.<init>(r10, r0)
            monitor-enter(r3)
            X.4xQ r4 = new X.4xQ     // Catch:{ all -> 0x022a }
            r0 = r30
            r4.<init>(r0, r10, r1)     // Catch:{ all -> 0x022a }
            r10.A04(r3, r4)     // Catch:{ all -> 0x022a }
            monitor-exit(r3)
        L_0x01fc:
            r0 = 36603931794674667(0x820b15000113eb, double:3.2118120869305195E-306)
            long r2 = X.182.A01(r2, r10, r0)
            int r1 = (int) r2
            if (r1 == 0) goto L_0x021c
            if (r1 == r6) goto L_0x0219
            r0 = 2
            if (r1 == r0) goto L_0x021f
            java.lang.String r0 = "unknown job code: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.String r0 = "SessionBackgroundPrefetcher"
            X.0KC.A0C(r0, r1)
            return
        L_0x0219:
            java.lang.String r1 = "FEED"
            goto L_0x0221
        L_0x021c:
            java.lang.String r1 = "STORY"
            goto L_0x0221
        L_0x021f:
            java.lang.String r1 = "ALL"
        L_0x0221:
            r5.set(r6)
            X.T8P r0 = X.T8P.A00
            r4.A01(r0, r1)
            return
        L_0x022a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2j8.A01(X.2j8):void");
    }

    public static final void A02(AnonymousClass2j8 r9, Integer num, String str, C62320sa r12, long j) {
        C278714xP r3 = new C278714xP(r9.A02, 276374386);
        r3.A03();
        if (C278714xP.A01(r3)) {
            1QP r4 = r3.A02;
            long j2 = r3.A01;
            r4.flowAnnotate(j2, "scheduled_latency_ms", j);
            r4.flowAnnotate(j2, "job_class", str);
            r4.flowAnnotate(j2, "standby_bucket", C278714xP.A00(r3));
            r4.flowAnnotate(j2, AnonymousClass000.A00(1493), 14i.A08());
            r4.flowAnnotate(j2, "job_id", num.intValue());
        }
        r12.invoke();
        if (C278714xP.A01(r3)) {
            r3.A02.flowEndSuccess(r3.A01);
        }
    }

    public AnonymousClass2j8(Context context, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = 1Au.A00(userSession);
    }

    private final void A00(C59554JOa jOa, AnonymousClass45O r14, Integer num, long j) {
        Long A012;
        long longValue;
        UserSession userSession;
        0Tu r2;
        long j2;
        int intValue = num.intValue();
        long j3 = j;
        if (intValue != 1) {
            if (intValue == 0) {
                int ordinal = r14.ordinal();
                if (ordinal == 2) {
                    A012 = new S5L(this.A03).A01();
                } else if (ordinal == 1) {
                    1Av r0 = this.A03;
                    0qQ.A0B(r0, 1);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList A0U = 00k.A0U(C63093KrM.A00(r0));
                    01V.A1C(A0U);
                    Iterator it = A0U.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        long longValue2 = ((Number) it.next()).longValue();
                        if (longValue2 > currentTimeMillis / 1000) {
                            A012 = Long.valueOf(longValue2);
                            break;
                        }
                    }
                }
                if (A012 != null) {
                    longValue = (A012.longValue() * 1000) - System.currentTimeMillis();
                }
            } else if (intValue == 2) {
                int ordinal2 = r14.ordinal();
                if (ordinal2 == 2) {
                    userSession = this.A02;
                    r2 = 0Tu.A05;
                    j2 = 36596784969288311L;
                } else if (ordinal2 == 1) {
                    userSession = this.A02;
                    r2 = 0Tu.A05;
                    j2 = 36597699797126004L;
                }
                longValue = 182.A01(r2, userSession, j2) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
            }
            if (longValue > 0) {
                jOa.DYg(longValue);
                return;
            }
        } else {
            IgSignalsCasper A002 = 2C5.A00(this.A00, this.A02);
            if (A002 != null) {
                A002.A03(new C58749Iww(j3, this, jOa, 9));
            }
        }
        jOa.DYg(j3);
    }

    public final void A03() {
        for (AnonymousClass45O r4 : AnonymousClass45O.values()) {
            C227462jM.A00(this.A00, this.A02).A04(new C227512jS(new C227502jR(r4.A01, r4.A00)));
        }
        0xY AR4 = this.A03.A01.AR4();
        AR4.ED3("bg_fetch_schedule_target_ms");
        AR4.apply();
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1668738042);
        if (182.A06(0Tu.A05, this.A02, 36326897814157375L)) {
            0nY.A01(913571864, new C73152PXn(this));
        } else {
            A01(this);
        }
        AnonymousClass0fD.A0A(1468357340, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(-954288967);
        0nY.A00().ATE(new AnonymousClass3G5(this));
        AnonymousClass0fD.A0A(-103069644, A032);
    }

    public final void onSessionWillEnd() {
        A03();
        14i.A06(this);
    }
}
