package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2kn  reason: invalid class name and case insensitive filesystem */
public final class C228102kn implements C228112ko, AnonymousClass0lh {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public AnonymousClass1O8 A06;
    public UserSession A07;
    public AnonymousClass34T A08;
    public String A09;
    public String A0A = "";
    public ArrayList A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public int A0K;
    public int A0L = -1;
    public int A0M;
    public long A0N;
    public Integer A0O;
    public final C228122kp A0P;
    public final ArrayList A0Q = new ArrayList();
    public final ArrayList A0R = new ArrayList();
    public final AtomicBoolean A0S = new AtomicBoolean(false);
    public final AtomicBoolean A0T = new AtomicBoolean(false);
    public final AtomicBoolean A0U = new AtomicBoolean(false);

    public C228102kn(UserSession userSession) {
        long A012;
        long A013;
        0qQ.A0B(userSession, 1);
        0Tu r3 = 0Tu.A05;
        this.A03 = 182.A01(r3, userSession, 36598992587197779L);
        this.A0P = new C228122kp(userSession);
        if (Systrace.A0E(1)) {
            0fS.A01("ReelTrayManager.init", -64870725);
        }
        try {
            this.A07 = userSession;
            if (1NN.A00(1NM.A00(userSession))) {
                A012 = 182.A01(r3, userSession, 36603519478207413L);
            } else {
                A012 = 182.A01(r3, userSession, 36592176469246291L);
            }
            this.A0L = (int) A012;
            this.A0M = (int) 182.A01(r3, userSession, 36592176469311828L);
            if (1NN.A00(1NM.A00(userSession))) {
                A013 = 182.A01(r3, userSession, 36603519478010803L);
            } else {
                A013 = 182.A01(r3, userSession, 36592176469180754L);
            }
            this.A0K = (int) A013;
            this.A00 = 182.A01(0Tu.A06, 1NM.A00(this.A07).A00, 36598992583462212L);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1123708731);
            }
        }
    }

    public final void A0F(C228132kq r7) {
        0qQ.A0B(r7, 0);
        C228122kp r5 = this.A0P;
        synchronized (r5.A01) {
            if (182.A06(0Tu.A05, r5.A00, 36325768238740701L)) {
                r5.A03.add(new AnonymousClass34X(r7));
            } else {
                r5.A02.add(r7);
            }
        }
    }

    public final void A0G(C228132kq r7) {
        0qQ.A0B(r7, 0);
        C228122kp r5 = this.A0P;
        synchronized (r5.A01) {
            if (182.A06(0Tu.A05, r5.A00, 36325768238740701L)) {
                018.A17(r5.A03, new AnonymousClass9LT(r7, 45));
            } else {
                r5.A02.remove(r7);
            }
        }
    }

    public final boolean A0I(AnonymousClass4D6 r8, AnonymousClass2l3 r9, Integer num) {
        int i;
        boolean z = false;
        0qQ.A0B(r8, 0);
        String A0R2 = 002.A0R("ReelTrayManager.refreshReelTray - fetchReason: ", 1NZ.A00(num));
        if (Systrace.A0E(1)) {
            0fS.A01(A0R2, -968557355);
        }
        try {
            if (!A0H()) {
                if (!182.A06(0Tu.A05, 1NM.A00(this.A07).A00, 36325867022202161L) || num == AnonymousClass05K.A0N || num == AnonymousClass05K.A01 || this.A0S.get()) {
                    if (num == AnonymousClass05K.A03) {
                        AtomicBoolean atomicBoolean = this.A0U;
                        if (!atomicBoolean.get()) {
                            if (Systrace.A0E(1)) {
                                i = 906348223;
                                0fS.A00(i);
                            }
                            return z;
                        }
                        atomicBoolean.set(false);
                    } else if (num != AnonymousClass05K.A0N && this.A0U.get()) {
                        if (Systrace.A0E(1)) {
                            i = 1328853784;
                            0fS.A00(i);
                        }
                        return z;
                    }
                    Integer num2 = AnonymousClass05K.A01;
                    if (num != num2 || r9 == null || !A0C(this, num)) {
                        z = A0B(r8, r9, AnonymousClass05K.A0Y, num);
                        if (Systrace.A0E(1)) {
                            i = 1551826938;
                            0fS.A00(i);
                        }
                        return z;
                    }
                    A05(r8, r9, this, num2);
                    if (Systrace.A0E(1)) {
                        i = -2096444520;
                        0fS.A00(i);
                    }
                    return z;
                }
            }
            if (Systrace.A0E(1)) {
                i = 236535586;
                0fS.A00(i);
            }
            return z;
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-1282230012);
            }
            throw th;
        }
    }

    public final boolean A0J(boolean z, boolean z2, boolean z3) {
        ArrayList A002;
        if (z && Math.abs(System.currentTimeMillis() - this.A02) <= TimeUnit.SECONDS.toMillis(this.A00)) {
            return false;
        }
        ReelStore A052 = 1OP.A05(this.A07);
        synchronized (A052) {
            A002 = A052.A03.A00();
        }
        List A0U2 = A052.A0U(z3);
        C228122kp r2 = this.A0P;
        boolean z4 = false;
        if (!A002.equals(A0U2)) {
            z4 = true;
        }
        r2.DcX(z2, z4);
        return !A002.equals(A0U2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (X.182.A06(X.0Tu.A05, X.1NM.A00(r5.A07).A00, 36317234137863099L) != false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EsD(java.lang.Integer r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            X.0qQ.A0B(r6, r0)
            int r0 = r6.intValue()
            r4 = 0
            if (r0 == r4) goto L_0x0028
            if (r0 != r1) goto L_0x0041
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r0 = r5.A07
            X.1NN r0 = X.1NM.A00(r0)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317234137863099(0x810655000313bb, double:3.030503334324082E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0030
        L_0x0027:
            return r4
        L_0x0028:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0S
            r0.set(r1)
            int r1 = r5.A0L
            goto L_0x0032
        L_0x0030:
            int r1 = r5.A0M
        L_0x0032:
            java.util.ArrayList r0 = r5.A0R
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0027
            int r8 = r8 - r7
            if (r8 > r1) goto L_0x0027
            r4 = 1
            return r4
        L_0x0041:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228102kn.EsD(java.lang.Integer, int, int):boolean");
    }

    private final AnonymousClass4ZZ A00(AnonymousClass2l3 r11, 1OE r12, Integer num, boolean z) {
        boolean z2 = z;
        String A1D = 002.A1D("ReelTrayManager.getColdStartCallback - useCache: ", z);
        if (Systrace.A0E(1)) {
            0fS.A01(A1D, -1369121406);
        }
        try {
            return new AnonymousClass4ZZ(r11, r12, this, num, z2);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1525353049);
            }
        }
    }

    private final C252433p6 A01(AnonymousClass2l3 r11, 1OE r12, Integer num, boolean z) {
        boolean z2 = z;
        String A1D = 002.A1D("ReelTrayManager.getStreamingColdStartCallback - useCache: ", z);
        if (Systrace.A0E(1)) {
            0fS.A01(A1D, 428616186);
        }
        try {
            return new C252433p6(r11, r12, this, num, z2);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1509868151);
            }
        }
    }

    public static final Integer A02(AnonymousClass4D6 r14, AnonymousClass2l3 r15, C228102kn r16, Integer num) {
        Integer num2;
        if (Systrace.A0E(1)) {
            0fS.A01("ReelTrayManager.fetchReelTrayFromServer", -1345908439);
        }
        C228102kn r3 = r16;
        try {
            if (r3.A0H()) {
                return null;
            }
            UserSession userSession = r3.A07;
            1OE A032 = 1KR.A00(userSession).A03();
            AnonymousClass4D6 r11 = r14;
            AnonymousClass2l3 r4 = r15;
            Integer num3 = num;
            if (A032 instanceof 1Oz) {
                1Ga A002 = 1GZ.A00(userSession);
                C252433p6 A012 = r3.A01(r15, A032, num3, false);
                0Tu r5 = 0Tu.A05;
                num2 = A002.A05(A012, r11, "main_reel", 182.A01(r5, userSession, 36596462846478837L), true, true, 182.A06(r5, userSession, 36328151946312687L));
            } else if (A032 instanceof AnonymousClass4Z5) {
                num2 = 1P1.A00(userSession).A05(r3.A00(r15, A032, num3, false), r11, "main_reel", 182.A01(0Tu.A05, userSession, 36596462846478837L), true, true);
            } else if (A032 instanceof AnonymousClass4Z6) {
                num2 = 1P1.A00(userSession).A05(new ECO(r3.A00(r15, A032, num3, false)), r11, "main_reel_gql", 182.A01(0Tu.A05, userSession, 36596462846478837L), true, true);
            } else {
                num2 = AnonymousClass05K.A0C;
            }
            if (num2 == AnonymousClass05K.A0C) {
                r3.A0B(r11, r4, AnonymousClass05K.A01, AnonymousClass05K.A00);
            } else {
                r3.A0G = true;
            }
            if (Systrace.A0E(1)) {
                0fS.A00(1923525353);
            }
            return num2;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-471526190);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if ((r1 instanceof java.io.IOException) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r7 = X.AnonymousClass1QO.A00(r9.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if (r3 == null) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C268654dm r17, X.1OE r18, X.C228102kn r19, long r20, boolean r22) {
        /*
            r10 = r19
            com.instagram.common.session.UserSession r4 = r10.A07
            X.1NN r0 = X.1NM.A00(r4)
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tu r5 = X.0Tu.A05
            r0 = 36325867021940014(0x810e2f0000352e, double:3.035962804976157E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            r11 = r18
            if (r0 == 0) goto L_0x0023
            X.1O9 r0 = r11.A00
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.A00
            if (r0 != r1) goto L_0x0023
            return
        L_0x0023:
            r13 = r17
            r19 = r22
            if (r22 != 0) goto L_0x005b
            java.lang.Integer r1 = r11.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x005b
            java.util.concurrent.atomic.AtomicBoolean r3 = r10.A0U
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x005b
            X.1NN r0 = X.1NM.A00(r4)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36317517608129770(0x810697002814ea, double:3.030682602062168E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x005b
            java.lang.Throwable r1 = r13.A01()
            if (r1 == 0) goto L_0x005b
            boolean r0 = r1 instanceof java.net.SocketException
            if (r0 != 0) goto L_0x0057
            boolean r1 = r1 instanceof java.io.IOException
            r0 = 0
            if (r1 == 0) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            r3.set(r0)
        L_0x005b:
            X.1OI r0 = X.1OH.A00(r4)
            r0.A06(r13, r11)
            X.36v r9 = X.C2372236u.A00(r4)
            monitor-enter(r9)
            r0 = 0
            X.0qQ.A0B(r11, r0)     // Catch:{ all -> 0x0180 }
            java.lang.Integer r8 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0180 }
            java.lang.Integer r15 = r11.A04     // Catch:{ all -> 0x0180 }
            if (r8 == r15) goto L_0x007b
            boolean r0 = r11.A00()     // Catch:{ all -> 0x0180 }
            if (r0 != 0) goto L_0x007b
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0180 }
            if (r0 != r15) goto L_0x0165
        L_0x007b:
            com.instagram.common.session.UserSession r0 = r9.A02     // Catch:{ all -> 0x0180 }
            X.1QP r7 = X.AnonymousClass1QO.A00(r0)     // Catch:{ all -> 0x0180 }
            X.36w r6 = X.C2372336v.A00(r7, r9)     // Catch:{ all -> 0x0180 }
            if (r6 == 0) goto L_0x0165
            java.lang.Integer r1 = r11.A03     // Catch:{ all -> 0x0180 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0180 }
            if (r1 != r0) goto L_0x0136
            java.util.HashSet r5 = r6.A07     // Catch:{ all -> 0x0180 }
            X.36y r0 = X.C2372636y.CACHE     // Catch:{ all -> 0x0180 }
            boolean r0 = r5.remove(r0)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0165
            X.3PG r14 = X.AnonymousClass3PG.CACHED     // Catch:{ all -> 0x0180 }
        L_0x0099:
            java.lang.String r4 = "Unknown"
            r12 = r4
            java.lang.Object r3 = r13.A00()     // Catch:{ all -> 0x0180 }
            X.3HO r3 = (X.AnonymousClass3HO) r3     // Catch:{ all -> 0x0180 }
            if (r3 == 0) goto L_0x00c2
            java.lang.String r0 = r3.getErrorMessage()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x012d
            java.lang.String r4 = "response: "
            int r2 = r3.mStatusCode     // Catch:{ all -> 0x0180 }
            java.lang.String r1 = " - "
            java.lang.String r0 = r3.getErrorMessage()     // Catch:{ all -> 0x0180 }
            java.lang.String r4 = X.002.A05(r2, r4, r1, r0)     // Catch:{ all -> 0x0180 }
        L_0x00b8:
            java.lang.String r1 = "response_http_status_code "
            int r0 = r3.mStatusCode     // Catch:{ all -> 0x0180 }
            java.lang.String r3 = X.002.A0O(r1, r0)     // Catch:{ all -> 0x0180 }
            if (r3 != 0) goto L_0x00f3
        L_0x00c2:
            java.lang.Throwable r2 = r13.A01()     // Catch:{ all -> 0x0180 }
            if (r2 == 0) goto L_0x00d8
            X.1O9 r0 = r11.A00     // Catch:{ all -> 0x0180 }
            r1 = 1
            if (r0 == 0) goto L_0x00da
            boolean r0 = r0.A00     // Catch:{ all -> 0x0180 }
            if (r0 != r1) goto L_0x00da
        L_0x00d1:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x0180 }
            r9.A06(r0)     // Catch:{ all -> 0x0180 }
            goto L_0x0165
        L_0x00d8:
            r3 = r12
            goto L_0x00f3
        L_0x00da:
            boolean r0 = r2 instanceof X.RCQ     // Catch:{ all -> 0x0180 }
            if (r0 != 0) goto L_0x00d1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r1.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "exception: "
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            r1.append(r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0180 }
            java.lang.String r3 = X.C2372336v.A02(r2)     // Catch:{ all -> 0x0180 }
        L_0x00f3:
            java.lang.String r1 = r14.name()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "_TRAY_DELIVERY_FAIL"
            java.lang.String r2 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0180 }
            long r0 = r6.A05     // Catch:{ all -> 0x0180 }
            r7.flowMarkPoint(r0, r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = "FAIL_TYPE"
            r7.flowAnnotate(r0, r12, r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = "FAILURE_REASON"
            r7.flowAnnotate(r0, r12, r3)     // Catch:{ all -> 0x0180 }
            java.lang.String r3 = "FAILURE_REASON_RAW"
            r7.flowAnnotate(r0, r3, r4)     // Catch:{ all -> 0x0180 }
            X.36y r3 = X.C2372636y.POG_LOAD     // Catch:{ all -> 0x0180 }
            boolean r3 = r5.contains(r3)     // Catch:{ all -> 0x0180 }
            r12 = 0
            if (r3 != 0) goto L_0x0145
            int r4 = r14.ordinal()     // Catch:{ all -> 0x0180 }
            r3 = 1
            if (r4 == r3) goto L_0x012a
            X.36y r3 = X.C2372636y.CACHE     // Catch:{ all -> 0x0180 }
        L_0x0123:
            boolean r3 = r5.contains(r3)     // Catch:{ all -> 0x0180 }
            if (r3 != 0) goto L_0x0145
            goto L_0x0144
        L_0x012a:
            X.36y r3 = X.C2372636y.NETWORK     // Catch:{ all -> 0x0180 }
            goto L_0x0123
        L_0x012d:
            java.lang.String r1 = "response: "
            int r0 = r3.mStatusCode     // Catch:{ all -> 0x0180 }
            java.lang.String r4 = X.002.A0O(r1, r0)     // Catch:{ all -> 0x0180 }
            goto L_0x00b8
        L_0x0136:
            java.util.HashSet r5 = r6.A07     // Catch:{ all -> 0x0180 }
            X.36y r0 = X.C2372636y.NETWORK     // Catch:{ all -> 0x0180 }
            boolean r0 = r5.remove(r0)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0165
            X.3PG r14 = X.AnonymousClass3PG.NETWORK     // Catch:{ all -> 0x0180 }
            goto L_0x0099
        L_0x0144:
            r12 = 1
        L_0x0145:
            r3 = 2
            r4 = 0
            if (r12 == 0) goto L_0x014f
            r7.flowEndFail(r0, r2, r4)     // Catch:{ all -> 0x0180 }
            r9.A01 = r4     // Catch:{ all -> 0x0180 }
            goto L_0x0158
        L_0x014f:
            short r0 = r6.A04     // Catch:{ all -> 0x0180 }
            if (r0 != r3) goto L_0x0158
            X.C2372336v.A03(r6, r9)     // Catch:{ all -> 0x0180 }
            r9.A01 = r4     // Catch:{ all -> 0x0180 }
        L_0x0158:
            short r0 = r6.A04     // Catch:{ all -> 0x0180 }
            if (r0 != r3) goto L_0x0165
            if (r8 == r15) goto L_0x0162
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0180 }
            if (r0 != r15) goto L_0x0165
        L_0x0162:
            X.C2372336v.A04(r6, r9, r11)     // Catch:{ all -> 0x0180 }
        L_0x0165:
            monitor-exit(r9)
            X.2kp r14 = r10.A0P
            long r17 = java.lang.System.currentTimeMillis()
            long r17 = r17 - r20
            java.lang.Object r0 = r13.A00()
            X.1XQ r0 = (X.1XQ) r0
            if (r0 == 0) goto L_0x017e
            int r0 = r0.mStatusCode
        L_0x0178:
            r16 = r0
            r14.Dcg(r15, r16, r17, r19)
            return
        L_0x017e:
            r0 = -1
            goto L_0x0178
        L_0x0180:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228102kn.A03(X.4dm, X.1OE, X.2kn, long, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass4D6 r5, X.AnonymousClass2l3 r6, X.1OE r7, X.C228102kn r8, java.lang.Integer r9, java.lang.Integer r10) {
        /*
            java.lang.String r3 = "ReelTrayManager.scheduleAndAddCallBack - fetchReason: "
            java.lang.String r2 = X.1NZ.A00(r10)
            java.lang.String r1 = " - cachePolciy: "
            java.lang.String r0 = X.1Oy.A00(r9)
            java.lang.String r1 = X.002.A0u(r3, r2, r1, r0)
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x001e
            r0 = -643005538(0xffffffffd9ac839e, float:-6.0698013E15)
            X.0fS.A01(r1, r0)
        L_0x001e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0077 }
            r1 = 0
            if (r9 != r0) goto L_0x0024
            r1 = 1
        L_0x0024:
            boolean r0 = r7 instanceof X.1Oz     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0041
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0077 }
            if (r10 != r0) goto L_0x003b
            X.3p6 r1 = r8.A01(r6, r7, r10, r1)     // Catch:{ all -> 0x0077 }
        L_0x0030:
            X.1Oz r7 = (X.1Oz) r7     // Catch:{ all -> 0x0077 }
            X.1GP r0 = r7.A00     // Catch:{ all -> 0x0077 }
            r0.A02(r1)     // Catch:{ all -> 0x0077 }
        L_0x0037:
            r5.schedule(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x006a
        L_0x003b:
            X.5iy r1 = new X.5iy     // Catch:{ all -> 0x0077 }
            r1.<init>(r6, r7, r8, r10)     // Catch:{ all -> 0x0077 }
            goto L_0x0030
        L_0x0041:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0077 }
            if (r10 != r0) goto L_0x0054
            X.4ZZ r2 = r8.A00(r6, r7, r10, r1)     // Catch:{ all -> 0x0077 }
        L_0x0049:
            boolean r0 = r7 instanceof X.AnonymousClass4Z5     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x005a
            X.4Z5 r7 = (X.AnonymousClass4Z5) r7     // Catch:{ all -> 0x0077 }
            X.1OC r0 = r7.A00     // Catch:{ all -> 0x0077 }
            r0.A00 = r2     // Catch:{ all -> 0x0077 }
            goto L_0x0037
        L_0x0054:
            X.5ix r2 = new X.5ix     // Catch:{ all -> 0x0077 }
            r2.<init>(r6, r7, r8, r10)     // Catch:{ all -> 0x0077 }
            goto L_0x0049
        L_0x005a:
            boolean r0 = r7 instanceof X.AnonymousClass4Z6     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x006a
            X.FTK r1 = new X.FTK     // Catch:{ all -> 0x0077 }
            r1.<init>(r2)     // Catch:{ all -> 0x0077 }
            X.4Z6 r7 = (X.AnonymousClass4Z6) r7     // Catch:{ all -> 0x0077 }
            X.FZ9 r0 = r7.A00     // Catch:{ all -> 0x0077 }
            r0.A00 = r1     // Catch:{ all -> 0x0077 }
            goto L_0x0037
        L_0x006a:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0076
            r0 = -807082344(0xffffffffcfe4e698, float:-7.6806349E9)
            X.0fS.A00(r0)
        L_0x0076:
            return
        L_0x0077:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0084
            r0 = 1361186055(0x51220d07, float:4.3500204E10)
            X.0fS.A00(r0)
        L_0x0084:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228102kn.A04(X.4D6, X.2l3, X.1OE, X.2kn, java.lang.Integer, java.lang.Integer):void");
    }

    public static final void A05(AnonymousClass4D6 r5, AnonymousClass2l3 r6, C228102kn r7, Integer num) {
        String A0R2 = 002.A0R("ReelTrayManager.fetchReelTrayFromCache - reason: ", 1NZ.A00(num));
        if (Systrace.A0E(1)) {
            0fS.A01(A0R2, 966149794);
        }
        try {
            AnonymousClass1HD r2 = r6.A0H.A03.A01;
            r2.A01.A02("CACHED_STORIES_TRAY_START");
            r2.A00().A00(1Gx.A07);
            r7.A0B(r5, r6, AnonymousClass05K.A0C, num);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1885127446);
            }
        }
    }

    public static final void A06(AnonymousClass4D6 r14, AnonymousClass2l3 r15, C228102kn r16, Integer num, Integer num2) {
        1Oz r2;
        Integer num3 = num2;
        Integer num4 = num;
        String A0u = 002.A0u("ReelTrayManager.fetchReelTrayHeadloadSync - fetchReason: ", 1NZ.A00(num3), " - cachePolicy: ", 1Oy.A00(num4));
        if (Systrace.A0E(1)) {
            0fS.A01(A0u, -1695724064);
        }
        try {
            AnonymousClass1O8 r5 = new AnonymousClass1O8();
            C228102kn r3 = r16;
            r3.A06 = r5;
            UserSession userSession = r3.A07;
            UserSession userSession2 = 1NM.A00(userSession).A00;
            0Tu r4 = 0Tu.A05;
            if (!182.A06(r4, userSession2, 36317234138387395L)) {
                boolean A062 = 182.A06(r4, 1NM.A00(userSession).A00, 36317234137666488L);
                AnonymousClass1O9 r8 = r5.A00;
                1OP r0 = 1OP.$redex_init_class;
                0qQ.A0B(num4, 1);
                0qQ.A0B(num3, 2);
                if (A062) {
                    r2 = 1NP.A06(r8, userSession, num4, num3, (String) null);
                } else {
                    r2 = 1NP.A05(r8, userSession, num4, num3, (String) null, false);
                }
                0qQ.A0A(r2);
                0qQ.A0A(r2);
            } else {
                r2 = C49294Esd.A00.A00(userSession, num4, num3);
            }
            A04(r14, r15, r2, r3, num4, num3);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(492959946);
            }
        }
    }

    public static final void A07(AnonymousClass2l3 r5, boolean z) {
        if (Systrace.A0E(1)) {
            0fS.A01("ReelTrayManager.measureColdStartOnReelTrayResponseReady", -1050524704);
        }
        if (z) {
            if (r5 != null) {
                try {
                    AnonymousClass2l3.A02(r5, "STORIES_LOAD_FROM_DISK_FINISHED");
                    AnonymousClass1HD r2 = r5.A0H.A03.A01;
                    r2.A01.A02("CACHED_STORIES_TRAY_END");
                    r2.A00().A00(1Gx.A08);
                } catch (Throwable th) {
                    if (Systrace.A0E(1)) {
                        0fS.A00(335951540);
                    }
                    throw th;
                }
            }
        } else if (r5 != null) {
            r5.A05(true, (String) null);
        }
        if (Systrace.A0E(1)) {
            0fS.A00(-1640652198);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x034e, code lost:
        r27 = r10.A02;
        r9 = X.AnonymousClass1QO.A00(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03c0, code lost:
        if (r6.isEmpty() != false) goto L_0x03c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x01c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0243 A[Catch:{ all -> 0x05c5, all -> 0x05d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024b A[Catch:{ all -> 0x05c5, all -> 0x05d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.1OE r47, X.AnonymousClass3HO r48, X.C228102kn r49, int r50, long r51, boolean r53) {
        /*
            java.lang.String r24 = "FAILURE_REASON"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ReelTrayManager.onReelTrayResponseReady - useCache: "
            r1.append(r0)
            r23 = r53
            r0 = r23
            r1.append(r0)
            java.lang.String r0 = " - chunkIndex: "
            r1.append(r0)
            r4 = r50
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r16 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x002f
            r0 = 1163124763(0x4553e01b, float:3390.0066)
            X.0fS.A01(r1, r0)
        L_0x002f:
            r2 = r49
            X.1O8 r0 = r2.A06     // Catch:{ all -> 0x05d6 }
            r25 = 0
            r15 = 1
            r14 = r47
            if (r0 == 0) goto L_0x0059
            X.1O9 r0 = r0.A00     // Catch:{ all -> 0x05d6 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x05d6 }
            if (r0 != r15) goto L_0x0059
            r0 = 0
            r2.A06 = r0     // Catch:{ all -> 0x05d6 }
            com.instagram.common.session.UserSession r0 = r2.A07     // Catch:{ all -> 0x05d6 }
            X.1OI r1 = X.1OH.A00(r0)     // Catch:{ all -> 0x05d6 }
            java.lang.String r0 = "Response returned after being cancelled"
            r1.A0B(r14, r0)     // Catch:{ all -> 0x05d6 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x05c4
            r0 = -1199114354(0xffffffffb886f78e, float:-6.4357286E-5)
            goto L_0x05c1
        L_0x0059:
            com.instagram.common.session.UserSession r0 = r2.A07     // Catch:{ all -> 0x05d6 }
            r49 = r0
            r20 = 0
            X.1NN r0 = X.1NM.A00(r49)     // Catch:{ all -> 0x05d6 }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x05d6 }
            X.0Tu r5 = X.0Tu.A05     // Catch:{ all -> 0x05d6 }
            r0 = 36317517610751241(0x81069700501509, double:3.0306826037199966E-306)
            boolean r0 = X.182.A06(r5, r3, r0)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x00a0
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x05d6 }
            java.lang.Integer r0 = r14.A04     // Catch:{ all -> 0x05d6 }
            if (r1 != r0) goto L_0x00a0
            X.1NN r0 = X.1NM.A00(r49)     // Catch:{ all -> 0x05d6 }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x05d6 }
            r0 = 36598992587525461(0x82069700510d55, double:3.208688512440771E-306)
            long r10 = X.182.A01(r5, r3, r0)     // Catch:{ all -> 0x05d6 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05d6 }
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            long r0 = r2.A01     // Catch:{ all -> 0x05d6 }
            long r0 = r0 - r6
            long r8 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x05d6 }
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            r2.A01 = r6     // Catch:{ all -> 0x05d6 }
            goto L_0x05b8
        L_0x00a0:
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A0U     // Catch:{ all -> 0x05d6 }
            r0 = r25
            r1.set(r0)     // Catch:{ all -> 0x05d6 }
            X.1OI r1 = X.1OH.A00(r49)     // Catch:{ all -> 0x05d6 }
            r50 = r48
            r0 = r50
            r1.A0A(r14, r0, r4)     // Catch:{ all -> 0x05d6 }
            X.1NN r0 = X.1NM.A00(r49)     // Catch:{ all -> 0x05d6 }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x05d6 }
            r0 = 36318569873348909(0x81078c000d192d, double:3.031348058823883E-306)
            boolean r0 = X.182.A06(r5, r3, r0)     // Catch:{ all -> 0x05d6 }
            r47 = r51
            if (r0 == 0) goto L_0x00ee
            java.lang.String r1 = r50.getStatus()     // Catch:{ all -> 0x05d6 }
            java.lang.String r0 = "fail"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x00ee
            X.4do r1 = new X.4do     // Catch:{ all -> 0x05d6 }
            r0 = r50
            r1.<init>(r0)     // Catch:{ all -> 0x05d6 }
            r44 = r1
            r45 = r14
            r46 = r2
            r49 = r23
            A03(r44, r45, r46, r47, r49)     // Catch:{ all -> 0x05d6 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x05c4
            r0 = -214748(0xfffffffffffcb924, float:NaN)
            goto L_0x05c1
        L_0x00ee:
            if (r53 != 0) goto L_0x0114
            r0 = r50
            long r6 = r0.mResponseTimestamp     // Catch:{ all -> 0x05d6 }
            long r0 = r14.A02     // Catch:{ all -> 0x05d6 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05d6 }
            long r0 = r0 - r8
            long r10 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x05d6 }
            r8 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0114
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05d6 }
            long r8 = r8 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0114
            X.AnonymousClass3PE.A00 = r8     // Catch:{ all -> 0x05d6 }
        L_0x0114:
            X.3Ia r3 = r50.FH3()     // Catch:{ all -> 0x05d6 }
            X.1E4.A00(r49)     // Catch:{ all -> 0x05d6 }
            if (r53 == 0) goto L_0x01ab
            java.util.List r0 = r3.A0J     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x01ab
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x05d6 }
            r11.<init>()     // Catch:{ all -> 0x05d6 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x05d6 }
        L_0x012a:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x0147
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x05d6 }
            X.3HX r0 = (X.AnonymousClass3HX) r0     // Catch:{ all -> 0x05d6 }
            X.4Ip r1 = new X.4Ip     // Catch:{ all -> 0x05d6 }
            r1.<init>(r0)     // Catch:{ all -> 0x05d6 }
            r0 = r20
            r1.A0M = r0     // Catch:{ all -> 0x05d6 }
            X.3HX r0 = r1.A00()     // Catch:{ all -> 0x05d6 }
            r11.add(r0)     // Catch:{ all -> 0x05d6 }
            goto L_0x012a
        L_0x0147:
            java.util.List r0 = r3.A0G     // Catch:{ all -> 0x05d6 }
            r43 = r0
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x05d6 }
            r40 = r0
            X.3Ic r0 = r3.A00     // Catch:{ all -> 0x05d6 }
            r26 = r0
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x05d6 }
            r41 = r0
            java.lang.Boolean r0 = r3.A05     // Catch:{ all -> 0x05d6 }
            r32 = r0
            com.instagram.api.schemas.IGUserHighlightsTrayType r0 = r3.A01     // Catch:{ all -> 0x05d6 }
            r27 = r0
            java.lang.Boolean r0 = r3.A06     // Catch:{ all -> 0x05d6 }
            r22 = r0
            java.lang.Integer r0 = r3.A09     // Catch:{ all -> 0x05d6 }
            r21 = r0
            java.lang.Integer r0 = r3.A0A     // Catch:{ all -> 0x05d6 }
            r19 = r0
            java.lang.Boolean r0 = r3.A07     // Catch:{ all -> 0x05d6 }
            r18 = r0
            java.lang.Integer r13 = r3.A0B     // Catch:{ all -> 0x05d6 }
            X.3IY r12 = r3.A03     // Catch:{ all -> 0x05d6 }
            java.lang.Integer r10 = r3.A0C     // Catch:{ all -> 0x05d6 }
            java.util.List r9 = r3.A0H     // Catch:{ all -> 0x05d6 }
            java.util.List r8 = r3.A0I     // Catch:{ all -> 0x05d6 }
            X.3HX r7 = r3.A04     // Catch:{ all -> 0x05d6 }
            X.3If r6 = r3.A02     // Catch:{ all -> 0x05d6 }
            java.lang.Boolean r1 = r3.A08     // Catch:{ all -> 0x05d6 }
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x05d6 }
            r28 = r6
            r29 = r12
            r30 = r7
            r31 = r3
            r33 = r22
            r34 = r18
            r35 = r1
            r36 = r21
            r37 = r19
            r38 = r13
            r39 = r10
            r42 = r0
            r44 = r9
            r45 = r8
            r46 = r11
            X.3Ib r1 = X.AnonymousClass4Iq.A00(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x05d6 }
            X.1E5 r0 = X.1E4.A00(r49)     // Catch:{ all -> 0x05d6 }
            X.3Ia r3 = r1.FEs(r0)     // Catch:{ all -> 0x05d6 }
        L_0x01ab:
            r0 = 36310628478419161(0x810053000700d9, double:3.02632588869288E-306)
            r6 = r49
            boolean r0 = X.182.A06(r5, r6, r0)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x02fa
            java.util.List r11 = r3.A0I     // Catch:{ all -> 0x05d6 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x05d6 }
            r9.<init>()     // Catch:{ all -> 0x05d6 }
            if (r11 == 0) goto L_0x025e
            X.A4O r10 = X.C70308O1m.A00(r49)     // Catch:{ all -> 0x05d6 }
            java.util.Iterator r12 = r11.iterator()     // Catch:{ all -> 0x05d6 }
        L_0x01c9:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x025e
            java.lang.Object r8 = r12.next()     // Catch:{ all -> 0x05d6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x05d6 }
            r0 = r25
            X.0qQ.A0B(r8, r0)     // Catch:{ all -> 0x05d6 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x01e8
            r1 = 1461446753(0x571be861, float:1.71422362E14)
            java.lang.String r0 = "ReelTrayPogUserCache.readUser"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x05d6 }
        L_0x01e8:
            java.lang.String r1 = "ReelTrayPogUserCache.readUser, userId: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r8}     // Catch:{ all -> 0x05c8 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r15)     // Catch:{ all -> 0x05c8 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x05c8 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x05c8 }
            com.facebook.stash.core.Stash r0 = r10.A00     // Catch:{ all -> 0x05c8 }
            byte[] r7 = r0.readResourceToMemory(r8)     // Catch:{ all -> 0x05c8 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x020d
            r1 = 1468177928(0x57829e08, float:2.87230501E14)
            java.lang.String r0 = "ReelTrayPerPogCache.deserializeFromBytes"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x05c8 }
        L_0x020d:
            r6 = 0
            if (r7 != 0) goto L_0x021a
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x023d
            r0 = 250577125(0xeef80e5, float:5.904217E-30)
            goto L_0x023a
        L_0x021a:
            java.nio.charset.Charset r1 = X.AnonymousClass15Q.A05     // Catch:{ IOException -> 0x0231, all -> 0x0250 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0231, all -> 0x0250 }
            r0.<init>(r7, r1)     // Catch:{ IOException -> 0x0231, all -> 0x0250 }
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0231, all -> 0x0250 }
            com.instagram.user.model.User r6 = X.1aC.A04(r0)     // Catch:{ IOException -> 0x0231, all -> 0x0250 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x023d
            r0 = 1921085586(0x72817092, float:5.127636E30)
            goto L_0x023a
        L_0x0231:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x023d
            r0 = 1086157945(0x40bd7479, float:5.920468)
        L_0x023a:
            X.0fS.A00(r0)     // Catch:{ all -> 0x05c8 }
        L_0x023d:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x0249
            r0 = -709488355(0xffffffffd5b6111d, float:-2.50230772E13)
            X.0fS.A00(r0)     // Catch:{ all -> 0x05d6 }
        L_0x0249:
            if (r6 == 0) goto L_0x01c9
            r9.put(r8, r6)     // Catch:{ all -> 0x05d6 }
            goto L_0x01c9
        L_0x0250:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x025d
            r0 = 1278295993(0x4c313fb9, float:4.646474E7)
            X.0fS.A00(r0)     // Catch:{ all -> 0x05c8 }
        L_0x025d:
            throw r1     // Catch:{ all -> 0x05c8 }
        L_0x025e:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x05d6 }
            r10.<init>()     // Catch:{ all -> 0x05d6 }
            java.util.List r0 = r3.A0J     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x0298
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x05d6 }
        L_0x026b:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x0298
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x05d6 }
            X.3HX r6 = (X.AnonymousClass3HX) r6     // Catch:{ all -> 0x05d6 }
            java.lang.String r1 = r6.A1U     // Catch:{ all -> 0x05d6 }
            boolean r0 = r9.containsKey(r1)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x0294
            X.4Ip r0 = new X.4Ip     // Catch:{ all -> 0x05d6 }
            r0.<init>(r6)     // Catch:{ all -> 0x05d6 }
            java.lang.Object r1 = r9.get(r1)     // Catch:{ all -> 0x05d6 }
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1     // Catch:{ all -> 0x05d6 }
            r0.A0a = r1     // Catch:{ all -> 0x05d6 }
            X.3HX r0 = r0.A00()     // Catch:{ all -> 0x05d6 }
            r10.add(r0)     // Catch:{ all -> 0x05d6 }
            goto L_0x026b
        L_0x0294:
            r10.add(r6)     // Catch:{ all -> 0x05d6 }
            goto L_0x026b
        L_0x0298:
            java.util.List r0 = r3.A0G     // Catch:{ all -> 0x05d6 }
            r43 = r0
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x05d6 }
            r40 = r0
            X.3Ic r0 = r3.A00     // Catch:{ all -> 0x05d6 }
            r26 = r0
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x05d6 }
            r41 = r0
            java.lang.Boolean r0 = r3.A05     // Catch:{ all -> 0x05d6 }
            r32 = r0
            com.instagram.api.schemas.IGUserHighlightsTrayType r0 = r3.A01     // Catch:{ all -> 0x05d6 }
            r27 = r0
            java.lang.Boolean r0 = r3.A06     // Catch:{ all -> 0x05d6 }
            r22 = r0
            java.lang.Integer r0 = r3.A09     // Catch:{ all -> 0x05d6 }
            r21 = r0
            java.lang.Integer r0 = r3.A0A     // Catch:{ all -> 0x05d6 }
            r19 = r0
            java.lang.Boolean r0 = r3.A07     // Catch:{ all -> 0x05d6 }
            r18 = r0
            java.lang.Integer r13 = r3.A0B     // Catch:{ all -> 0x05d6 }
            X.3IY r12 = r3.A03     // Catch:{ all -> 0x05d6 }
            java.lang.Integer r9 = r3.A0C     // Catch:{ all -> 0x05d6 }
            java.util.List r8 = r3.A0H     // Catch:{ all -> 0x05d6 }
            X.3HX r7 = r3.A04     // Catch:{ all -> 0x05d6 }
            X.3If r6 = r3.A02     // Catch:{ all -> 0x05d6 }
            java.lang.Boolean r1 = r3.A08     // Catch:{ all -> 0x05d6 }
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x05d6 }
            r28 = r6
            r29 = r12
            r30 = r7
            r31 = r3
            r33 = r22
            r34 = r18
            r35 = r1
            r36 = r21
            r37 = r19
            r38 = r13
            r39 = r9
            r42 = r0
            r44 = r8
            r45 = r11
            r46 = r10
            X.3Ib r1 = X.AnonymousClass4Iq.A00(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x05d6 }
            X.1E5 r0 = X.1E4.A00(r49)     // Catch:{ all -> 0x05d6 }
            X.3Ia r3 = r1.FEs(r0)     // Catch:{ all -> 0x05d6 }
        L_0x02fa:
            com.instagram.reels.store.ReelStore r26 = X.1OP.A05(r49)     // Catch:{ all -> 0x05d6 }
            r0 = r49
            java.util.List r30 = X.AnonymousClass3P8.A01(r0, r3)     // Catch:{ all -> 0x05d6 }
            java.util.List r31 = X.AnonymousClass3P8.A00(r0, r3)     // Catch:{ all -> 0x05d6 }
            X.3HX r0 = r3.A04     // Catch:{ all -> 0x05d6 }
            X.0eE r6 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x05d6 }
            r1 = r49
            com.instagram.user.model.User r29 = r6.A01(r1)     // Catch:{ all -> 0x05d6 }
            boolean r34 = r50.CPt()     // Catch:{ all -> 0x05d6 }
            boolean r35 = X.AnonymousClass3P8.A02(r3)     // Catch:{ all -> 0x05d6 }
            java.util.List r1 = r3.A0I     // Catch:{ all -> 0x05d6 }
            r22 = r1
            r32 = r1
            if (r1 != 0) goto L_0x0324
            X.0sn r32 = X.0sn.A00     // Catch:{ all -> 0x05d6 }
        L_0x0324:
            r27 = r0
            r28 = r14
            r33 = r4
            r26.A0a(r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x05d6 }
            X.36v r10 = X.C2372236u.A00(r49)     // Catch:{ all -> 0x05d6 }
            monitor-enter(r10)     // Catch:{ all -> 0x05d6 }
            r0 = r25
            X.0qQ.A0B(r14, r0)     // Catch:{ all -> 0x05c5 }
            r0 = 2
            java.lang.Integer r21 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x05c5 }
            java.lang.Integer r1 = r14.A04     // Catch:{ all -> 0x05c5 }
            r32 = r1
            r6 = r21
            if (r6 == r1) goto L_0x034e
            boolean r1 = r14.A00()     // Catch:{ all -> 0x05c5 }
            if (r1 != 0) goto L_0x034e
            java.lang.Integer r6 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x05c5 }
            r1 = r32
            if (r6 != r1) goto L_0x0448
        L_0x034e:
            com.instagram.common.session.UserSession r1 = r10.A02     // Catch:{ all -> 0x05c5 }
            r27 = r1
            X.1QP r9 = X.AnonymousClass1QO.A00(r27)     // Catch:{ all -> 0x05c5 }
            X.36w r8 = X.C2372336v.A00(r9, r10)     // Catch:{ all -> 0x05c5 }
            if (r8 == 0) goto L_0x0448
            java.lang.Integer r6 = r14.A03     // Catch:{ all -> 0x05c5 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x05c5 }
            if (r6 != r1) goto L_0x036f
            java.util.HashSet r7 = r8.A07     // Catch:{ all -> 0x05c5 }
            X.36y r1 = X.C2372636y.CACHE     // Catch:{ all -> 0x05c5 }
            boolean r1 = r7.remove(r1)     // Catch:{ all -> 0x05c5 }
            if (r1 == 0) goto L_0x0448
            X.3PG r13 = X.AnonymousClass3PG.CACHED     // Catch:{ all -> 0x05c5 }
            goto L_0x037b
        L_0x036f:
            java.util.HashSet r7 = r8.A07     // Catch:{ all -> 0x05c5 }
            X.36y r1 = X.C2372636y.NETWORK     // Catch:{ all -> 0x05c5 }
            boolean r1 = r7.remove(r1)     // Catch:{ all -> 0x05c5 }
            if (r1 == 0) goto L_0x0448
            X.3PG r13 = X.AnonymousClass3PG.NETWORK     // Catch:{ all -> 0x05c5 }
        L_0x037b:
            if (r4 != r0) goto L_0x0382
            long r0 = r8.A05     // Catch:{ all -> 0x05c5 }
            java.lang.String r6 = "NETWORK_TRAY_SECOND_CHUNK_SUCCESS"
            goto L_0x038e
        L_0x0382:
            long r0 = r8.A05     // Catch:{ all -> 0x05c5 }
            java.lang.String r11 = r13.name()     // Catch:{ all -> 0x05c5 }
            java.lang.String r6 = "_TRAY_DELIVERY_SUCCESS"
            java.lang.String r6 = X.002.A0R(r11, r6)     // Catch:{ all -> 0x05c5 }
        L_0x038e:
            r9.flowMarkPoint(r0, r6)     // Catch:{ all -> 0x05c5 }
            X.36y r19 = X.C2372636y.CACHE     // Catch:{ all -> 0x05c5 }
            r6 = r19
            r7.remove(r6)     // Catch:{ all -> 0x05c5 }
            com.instagram.reels.store.ReelStore r12 = X.1OP.A05(r27)     // Catch:{ all -> 0x05c5 }
            r11 = 0
            java.util.List r6 = r12.A0U(r11)     // Catch:{ all -> 0x05c5 }
            int r18 = r6.size()     // Catch:{ all -> 0x05c5 }
            java.util.concurrent.ConcurrentMap r6 = r12.A0D     // Catch:{ all -> 0x05c5 }
            r26 = r6
            com.instagram.common.session.UserSession r6 = r12.A09     // Catch:{ all -> 0x05c5 }
            java.lang.String r12 = r6.A06     // Catch:{ all -> 0x05c5 }
            r6 = r26
            java.lang.Object r6 = r6.get(r12)     // Catch:{ all -> 0x05c5 }
            com.instagram.model.reels.Reel r6 = (com.instagram.model.reels.Reel) r6     // Catch:{ all -> 0x05c5 }
            if (r6 == 0) goto L_0x03c3
            java.util.ArrayList r6 = r6.A0t     // Catch:{ all -> 0x05c5 }
            if (r6 == 0) goto L_0x03c2
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x05c5 }
            r11 = 1
            if (r6 == 0) goto L_0x03c3
        L_0x03c2:
            r11 = 0
        L_0x03c3:
            java.util.LinkedHashSet r6 = r8.A03     // Catch:{ all -> 0x05c5 }
            r6.add(r13)     // Catch:{ all -> 0x05c5 }
            java.lang.String r12 = "EXPECTED_TRAY_SIZE"
            r6 = r27
            java.util.List r6 = X.AnonymousClass3P8.A01(r6, r3)     // Catch:{ all -> 0x05c5 }
            int r6 = r6.size()     // Catch:{ all -> 0x05c5 }
            r9.flowAnnotate(r0, r12, r6)     // Catch:{ all -> 0x05c5 }
            java.lang.String r12 = "DELIVERED_TRAY_SIZE"
            r6 = r18
            r9.flowAnnotate(r0, r12, r6)     // Catch:{ all -> 0x05c5 }
            java.lang.String r12 = "SOURCE"
            java.lang.String r6 = r13.name()     // Catch:{ all -> 0x05c5 }
            r9.flowAnnotate(r0, r12, r6)     // Catch:{ all -> 0x05c5 }
            java.lang.String r6 = "HAS_SELF_STORY_POG"
            r9.flowAnnotate(r0, r6, r11)     // Catch:{ all -> 0x05c5 }
            if (r22 == 0) goto L_0x03f7
            int r11 = r22.size()     // Catch:{ all -> 0x05c5 }
            java.lang.String r6 = "LOCAL_SOURCED_REELS_COUNT"
            r9.flowAnnotate(r0, r6, r11)     // Catch:{ all -> 0x05c5 }
        L_0x03f7:
            X.3PG r6 = X.AnonymousClass3PG.CACHED     // Catch:{ all -> 0x05c5 }
            if (r13 == r6) goto L_0x0407
            boolean r6 = r50.CPt()     // Catch:{ all -> 0x05c5 }
            if (r6 != 0) goto L_0x0407
            r6 = r19
            r7.remove(r6)     // Catch:{ all -> 0x05c5 }
            goto L_0x0426
        L_0x0407:
            r6 = r50
            long r11 = r6.A00     // Catch:{ all -> 0x05c5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05c5 }
            r8.A01 = r6     // Catch:{ all -> 0x05c5 }
            r6 = r50
            java.lang.String r6 = r6.A0F     // Catch:{ all -> 0x05c5 }
            r8.A02 = r6     // Catch:{ all -> 0x05c5 }
            java.lang.String r29 = "CACHED_RESPONSE_AGE_MS"
            long r30 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05c5 }
            long r30 = r30 - r11
            r26 = r9
            r27 = r0
            r26.flowAnnotate(r27, r29, r30)     // Catch:{ all -> 0x05c5 }
        L_0x0426:
            r11 = r21
            r6 = r32
            if (r11 == r6) goto L_0x0430
            java.lang.Integer r11 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x05c5 }
            if (r11 != r6) goto L_0x043b
        L_0x0430:
            X.36y r6 = X.C2372636y.NETWORK     // Catch:{ all -> 0x05c5 }
            boolean r6 = r7.contains(r6)     // Catch:{ all -> 0x05c5 }
            if (r6 != 0) goto L_0x043b
            X.C2372336v.A04(r8, r10, r14)     // Catch:{ all -> 0x05c5 }
        L_0x043b:
            X.36y r6 = X.C2372636y.TRAY_RENDER     // Catch:{ all -> 0x05c5 }
            boolean r6 = r7.remove(r6)     // Catch:{ all -> 0x05c5 }
            if (r6 == 0) goto L_0x0448
            java.lang.String r6 = "TRAY_LOAD_SUCCESS"
            r9.flowMarkPoint(r0, r6)     // Catch:{ all -> 0x05c5 }
        L_0x0448:
            monitor-exit(r10)     // Catch:{ all -> 0x05d6 }
            X.1OI r0 = X.1OH.A00(r49)     // Catch:{ all -> 0x05d6 }
            r0.A08(r14, r4)     // Catch:{ all -> 0x05d6 }
            if (r4 != r15) goto L_0x0468
            X.1NN r0 = X.1NM.A00(r49)     // Catch:{ all -> 0x05d6 }
            com.instagram.common.session.UserSession r6 = r0.A00     // Catch:{ all -> 0x05d6 }
            r0 = 36317234137732025(0x810655000113b9, double:3.03050333424119E-306)
            boolean r0 = X.182.A06(r5, r6, r0)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x0468
            r0 = r25
            r2.A0J(r0, r15, r15)     // Catch:{ all -> 0x05d6 }
        L_0x0468:
            java.util.ArrayList r7 = r2.A0R     // Catch:{ all -> 0x05d6 }
            r7.clear()     // Catch:{ all -> 0x05d6 }
            X.1NN r0 = X.1NM.A00(r49)     // Catch:{ all -> 0x05d6 }
            com.instagram.common.session.UserSession r6 = r0.A00     // Catch:{ all -> 0x05d6 }
            r0 = 36317517609047286(0x810697003614f6, double:3.0306826026424086E-306)
            boolean r0 = X.182.A06(r5, r6, r0)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x04ac
            boolean r0 = r50.CPt()     // Catch:{ all -> 0x05d6 }
            if (r0 != 0) goto L_0x04ac
            java.util.ArrayList r6 = r2.A0Q     // Catch:{ all -> 0x05d6 }
            java.util.List r1 = r3.A0J     // Catch:{ all -> 0x05d6 }
            if (r1 == 0) goto L_0x04a7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05d6 }
            r0.<init>()     // Catch:{ all -> 0x05d6 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x05d6 }
        L_0x0493:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x05d6 }
            if (r1 == 0) goto L_0x04a9
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x05d6 }
            X.3HX r1 = (X.AnonymousClass3HX) r1     // Catch:{ all -> 0x05d6 }
            java.lang.String r1 = r1.A1U     // Catch:{ all -> 0x05d6 }
            if (r1 == 0) goto L_0x0493
            r0.add(r1)     // Catch:{ all -> 0x05d6 }
            goto L_0x0493
        L_0x04a7:
            X.0sn r0 = X.0sn.A00     // Catch:{ all -> 0x05d6 }
        L_0x04a9:
            r6.addAll(r0)     // Catch:{ all -> 0x05d6 }
        L_0x04ac:
            java.lang.String r0 = r14.A07     // Catch:{ all -> 0x05d6 }
            r2.A0A = r0     // Catch:{ all -> 0x05d6 }
            java.util.List r0 = r3.A0H     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x04ba
            r7.addAll(r0)     // Catch:{ all -> 0x05d6 }
            A09(r3, r2)     // Catch:{ all -> 0x05d6 }
        L_0x04ba:
            java.lang.String r0 = r3.A0E     // Catch:{ all -> 0x05d6 }
            r2.A09 = r0     // Catch:{ all -> 0x05d6 }
            r6 = -1
            if (r53 != 0) goto L_0x04e7
            if (r4 == r15) goto L_0x04c5
            if (r4 != r6) goto L_0x04e7
        L_0x04c5:
            X.1NN r0 = X.1NM.A00(r49)     // Catch:{ all -> 0x05d6 }
            com.instagram.common.session.UserSession r8 = r0.A00     // Catch:{ all -> 0x05d6 }
            r0 = 36317517606556891(0x810697001014db, double:3.030682601067473E-306)
            boolean r0 = X.182.A06(r5, r8, r0)     // Catch:{ all -> 0x05d6 }
            if (r0 != 0) goto L_0x04e1
            java.lang.Integer r0 = r3.A0C     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x0522
            int r0 = r0.intValue()     // Catch:{ all -> 0x05d6 }
        L_0x04de:
            long r0 = (long) r0     // Catch:{ all -> 0x05d6 }
            r2.A03 = r0     // Catch:{ all -> 0x05d6 }
        L_0x04e1:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05d6 }
            r2.A01 = r0     // Catch:{ all -> 0x05d6 }
        L_0x04e7:
            java.lang.String r3 = r3.A0F     // Catch:{ all -> 0x05d6 }
            if (r3 != 0) goto L_0x04ed
            java.lang.String r3 = ""
        L_0x04ed:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x052b
            X.1NN r0 = X.1NM.A00(r49)     // Catch:{ all -> 0x05d6 }
            com.instagram.common.session.UserSession r8 = r0.A00     // Catch:{ all -> 0x05d6 }
            r0 = 36317234138059710(0x810655000613be, double:3.0305033344484195E-306)
            boolean r0 = X.182.A06(r5, r8, r0)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x0524
            X.1Zn r9 = X.1Zm.A00(r49)     // Catch:{ all -> 0x05d6 }
            java.lang.Integer r8 = X.AnonymousClass05K.A0U     // Catch:{ all -> 0x05d6 }
            r1 = r21
            r0 = r25
            X.1Zp r8 = r9.A01(r1, r8, r0)     // Catch:{ all -> 0x05d6 }
            java.lang.String r1 = "onReelTrayResponseReady: story ranking token should be return from the server."
            r0 = r24
            r8.A03(r0, r1)     // Catch:{ all -> 0x05d6 }
            java.lang.String r1 = "logview_group_by"
            r8.A03(r1, r0)     // Catch:{ all -> 0x05d6 }
            r8.A00()     // Catch:{ all -> 0x05d6 }
            goto L_0x052b
        L_0x0522:
            r0 = 0
            goto L_0x04de
        L_0x0524:
            java.lang.String r1 = "ReelTrayManager"
            java.lang.String r0 = "story ranking token should be return from the server."
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x05d6 }
        L_0x052b:
            if (r4 == r6) goto L_0x0530
            if (r4 == r15) goto L_0x0530
            goto L_0x0538
        L_0x0530:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05d6 }
            long r0 = r0 - r51
            r2.A0N = r0     // Catch:{ all -> 0x05d6 }
        L_0x0538:
            X.2kp r8 = r2.A0P     // Catch:{ all -> 0x05d6 }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x05d6 }
            r31 = r0 ^ 1
            long r0 = r2.A0N     // Catch:{ all -> 0x05d6 }
            r24 = r8
            r25 = r14
            r26 = r3
            r27 = r4
            r28 = r0
            r30 = r23
            r24.Dch(r25, r26, r27, r28, r30, r31)     // Catch:{ all -> 0x05d6 }
            X.1Av r0 = X.1Au.A00(r49)     // Catch:{ all -> 0x05d6 }
            java.lang.String r7 = X.1NZ.A01(r32)     // Catch:{ all -> 0x05d6 }
            X.0xa r3 = r0.A01     // Catch:{ all -> 0x05d6 }
            X.0xY r1 = r3.AR4()     // Catch:{ all -> 0x05d6 }
            java.lang.String r0 = "last_stories_tray_fetch_reason"
            r1.E5g(r0, r7)     // Catch:{ all -> 0x05d6 }
            r1.apply()     // Catch:{ all -> 0x05d6 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05d6 }
            X.0xY r7 = r3.AR4()     // Catch:{ all -> 0x05d6 }
            java.lang.String r3 = "last_stories_tray_request_timestamp"
            r7.E5c(r3, r0)     // Catch:{ all -> 0x05d6 }
            r7.apply()     // Catch:{ all -> 0x05d6 }
            if (r4 == r15) goto L_0x057b
            if (r4 != r6) goto L_0x05ae
        L_0x057b:
            r3 = 36327748218141350(0x810fe500083aa6, double:3.037152481028851E-306)
            r0 = r49
            boolean r0 = X.182.A06(r5, r0, r3)     // Catch:{ all -> 0x05d6 }
            if (r0 != 0) goto L_0x05ae
            java.lang.Integer r1 = X.AnonymousClass8WT.A01(r49)     // Catch:{ all -> 0x05d6 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x05d6 }
            if (r1 == r0) goto L_0x0598
            java.lang.Integer r1 = X.AnonymousClass8WT.A01(r49)     // Catch:{ all -> 0x05d6 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x05d6 }
            if (r1 != r0) goto L_0x05ae
        L_0x0598:
            X.12T r3 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x05d6 }
            r1 = 1383647090(0x5278c772, float:2.67124507E11)
            r0 = 3
            X.0nV r4 = r3.AOJ(r1, r0)     // Catch:{ all -> 0x05d6 }
            r3 = 15
            X.JTg r1 = new X.JTg     // Catch:{ all -> 0x05d6 }
            r0 = r20
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x05d6 }
            X.1ES.A07(r4, r1)     // Catch:{ all -> 0x05d6 }
        L_0x05ae:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x05c4
            r0 = 750767088(0x2cbfcbf0, float:5.451188E-12)
            goto L_0x05c1
        L_0x05b8:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x05c4
            r0 = -314972198(0xffffffffed39e7da, float:-3.5959386E27)
        L_0x05c1:
            X.0fS.A00(r0)
        L_0x05c4:
            return
        L_0x05c5:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x05d6 }
            goto L_0x05d5
        L_0x05c8:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x05d6 }
            if (r0 == 0) goto L_0x05d5
            r0 = 482086103(0x1cbc0cd7, float:1.2444115E-21)
            X.0fS.A00(r0)     // Catch:{ all -> 0x05d6 }
        L_0x05d5:
            throw r1     // Catch:{ all -> 0x05d6 }
        L_0x05d6:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x05e3
            r0 = 1083279293(0x409187bd, float:4.5478196)
            X.0fS.A00(r0)
        L_0x05e3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228102kn.A08(X.1OE, X.3HO, X.2kn, int, long, boolean):void");
    }

    public static final void A09(C239753Ia r1, C228102kn r2) {
        Integer num = r1.A09;
        if (num != null) {
            r2.A0L = num.intValue();
        }
        Integer num2 = r1.A0A;
        if (num2 != null) {
            r2.A0M = num2.intValue();
        }
        Integer num3 = r1.A0B;
        if (num3 != null) {
            r2.A0O = num3;
        }
    }

    public static final void A0A(C239753Ia r4, C228102kn r5) {
        AnonymousClass3IY r42 = r4.A03;
        if (r42 != null) {
            1Av A002 = 1Au.A00(r5.A07);
            Integer num = r42.A04;
            if (num != null) {
                int intValue = num.intValue();
                0xY AR4 = A002.A01.AR4();
                AR4.E5Z("reel_tray_personalization_follow_count", intValue);
                AR4.apply();
            }
            Boolean bool = r42.A01;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                0xY AR42 = A002.A01.AR4();
                AR42.E5T("reel_tray_personalization_is_high_usage_likelihood", booleanValue);
                AR42.apply();
            }
            Float f = r42.A03;
            if (f != null) {
                float floatValue = f.floatValue();
                0xY AR43 = A002.A01.AR4();
                AR43.E5W("reel_tray_personalization_avg_core_sessions_per_day", floatValue);
                AR43.apply();
            }
            Integer num2 = r42.A09;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                0xY AR44 = A002.A01.AR4();
                AR44.E5Z("reel_tray_personalization_warm_refresh_cooldown_s", intValue2);
                AR44.apply();
            }
            Boolean bool2 = r42.A00;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                0xY AR45 = A002.A01.AR4();
                AR45.E5T("reel_tray_personalization_is_high_me_user", booleanValue2);
                AR45.apply();
            }
            Integer num3 = r42.A05;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                0xY AR46 = A002.A01.AR4();
                AR46.E5Z("reel_tray_personalization_lness28_score", intValue3);
                AR46.apply();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ff, code lost:
        if (X.182.A06(r6, X.1NM.A00(r8).A00, 36325867023447359L) != false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0B(X.AnonymousClass4D6 r17, X.AnonymousClass2l3 r18, java.lang.Integer r19, java.lang.Integer r20) {
        /*
            r16 = this;
            java.lang.String r1 = "ReelTrayManager.fetchReelTrayHeadload - fetchReason: "
            r11 = r20
            java.lang.String r0 = X.1NZ.A00(r11)
            java.lang.String r1 = X.002.A0R(r1, r0)
            r14 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r14)
            if (r0 == 0) goto L_0x001a
            r0 = -97329745(0xfffffffffa32ddaf, float:-2.3218128E35)
            X.0fS.A01(r1, r0)
        L_0x001a:
            r7 = r16
            com.instagram.common.session.UserSession r8 = r7.A07     // Catch:{ all -> 0x0136 }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ all -> 0x0136 }
            r0 = 2342160788814829081(0x208106d400281619, double:4.063703170351121E-152)
            boolean r0 = X.182.A06(r6, r8, r0)     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x006c
            r0 = 36317779598579205(0x8106d400011605, double:3.030848285877341E-306)
            boolean r0 = X.182.A06(r6, r8, r0)     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x006c
            r0 = 36317779600479759(0x8106d4001e160f, double:3.030848287079259E-306)
            boolean r0 = X.182.A06(r6, r8, r0)     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x006c
            X.0wX r0 = r8.A03     // Catch:{ all -> 0x0136 }
            android.content.Context r0 = r0.A06()     // Catch:{ all -> 0x0136 }
            android.content.Context r2 = r0.getApplicationContext()     // Catch:{ all -> 0x0136 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0136 }
            X.0nO r1 = X.0nY.A00()     // Catch:{ all -> 0x0136 }
            X.9Nc r0 = new X.9Nc     // Catch:{ all -> 0x0136 }
            r0.<init>(r2, r8)     // Catch:{ all -> 0x0136 }
            r1.ATE(r0)     // Catch:{ all -> 0x0136 }
            r0 = 36317779601790499(0x8106d400321623, double:3.0308482879081766E-306)
            boolean r0 = X.182.A06(r6, r8, r0)     // Catch:{ all -> 0x0136 }
            if (r0 != 0) goto L_0x006c
            X.3zf r0 = X.C393059vp.A00(r8)     // Catch:{ all -> 0x0136 }
            r0.A00()     // Catch:{ all -> 0x0136 }
        L_0x006c:
            java.lang.Integer r5 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0136 }
            r4 = 1
            r10 = r18
            r9 = r19
            if (r9 == r5) goto L_0x00ca
            java.lang.Integer r0 = X.AnonymousClass05K.A1I     // Catch:{ all -> 0x0136 }
            if (r11 == r0) goto L_0x007d
            java.lang.Integer r0 = X.AnonymousClass05K.A02     // Catch:{ all -> 0x0136 }
            if (r11 != r0) goto L_0x00a4
        L_0x007d:
            X.1NN r0 = X.1NM.A00(r8)     // Catch:{ all -> 0x0136 }
            com.instagram.common.session.UserSession r0 = r0.A00     // Catch:{ all -> 0x0136 }
            r2 = 36598992587197779(0x820697004c0d53, double:3.2086885122335434E-306)
            long r0 = X.182.A01(r6, r0, r2)     // Catch:{ all -> 0x0136 }
            int r12 = (int) r0     // Catch:{ all -> 0x0136 }
            r0 = -1
            if (r12 == r0) goto L_0x00a4
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0136 }
            long r0 = r7.A01     // Catch:{ all -> 0x0136 }
            long r12 = r12 - r0
            X.1NN r0 = X.1NM.A00(r8)     // Catch:{ all -> 0x0136 }
            com.instagram.common.session.UserSession r0 = r0.A00     // Catch:{ all -> 0x0136 }
            long r0 = X.182.A01(r6, r0, r2)     // Catch:{ all -> 0x0136 }
            int r2 = (int) r0     // Catch:{ all -> 0x0136 }
            long r0 = (long) r2     // Catch:{ all -> 0x0136 }
            goto L_0x0120
        L_0x00a4:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0136 }
            long r0 = r7.A01     // Catch:{ all -> 0x0136 }
            long r12 = r12 - r0
            long r0 = r7.A03     // Catch:{ all -> 0x0136 }
            goto L_0x0120
        L_0x00ae:
            X.1Gs r0 = r10.A0H     // Catch:{ all -> 0x0136 }
            X.1H8 r0 = r0.A04     // Catch:{ all -> 0x0136 }
            X.1H9 r2 = r0.A01     // Catch:{ all -> 0x0136 }
            X.1Gq r1 = r2.A01     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "STORIES_REQUEST_START"
            r1.A02(r0)     // Catch:{ all -> 0x0136 }
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r2.A00()     // Catch:{ all -> 0x0136 }
            X.1Gx r0 = X.1Gx.A07     // Catch:{ all -> 0x0136 }
            r1.A00(r0)     // Catch:{ all -> 0x0136 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0136 }
            r10.A0P = r0     // Catch:{ all -> 0x0136 }
        L_0x00c8:
            r7.A0G = r4     // Catch:{ all -> 0x0136 }
        L_0x00ca:
            int r1 = r11.intValue()     // Catch:{ all -> 0x0136 }
            r0 = 0
            r2 = r17
            if (r1 == r4) goto L_0x00ed
            if (r1 == r0) goto L_0x00d9
            r0 = 5
            if (r1 != r0) goto L_0x0113
            goto L_0x00f0
        L_0x00d9:
            X.1NN r0 = X.1NM.A00(r8)     // Catch:{ all -> 0x0136 }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x0136 }
            r0 = 36325867023381822(0x810e2f0016353e, double:3.035962805887962E-306)
            boolean r0 = X.182.A06(r6, r3, r0)     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x0113
            if (r9 != r5) goto L_0x0113
            goto L_0x0101
        L_0x00ed:
            if (r9 == r5) goto L_0x0113
            goto L_0x0101
        L_0x00f0:
            X.1NN r0 = X.1NM.A00(r8)     // Catch:{ all -> 0x0136 }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ all -> 0x0136 }
            r0 = 36325867023447359(0x810e2f0017353f, double:3.035962805929408E-306)
            boolean r0 = X.182.A06(r6, r3, r0)     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x0113
        L_0x0101:
            X.0nO r1 = X.0nY.A00()     // Catch:{ all -> 0x0136 }
            X.KJ9 r0 = new X.KJ9     // Catch:{ all -> 0x0136 }
            r12 = r9
            r13 = r11
            r11 = r7
            r8 = r0
            r9 = r2
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0136 }
            r1.ATE(r0)     // Catch:{ all -> 0x0136 }
            goto L_0x0116
        L_0x0113:
            A06(r2, r10, r7, r9, r11)     // Catch:{ all -> 0x0136 }
        L_0x0116:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r14)
            if (r0 == 0) goto L_0x0131
            r0 = 347329493(0x14b3d3d5, float:1.8157934E-26)
            goto L_0x012e
        L_0x0120:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
            r4 = 0
            boolean r0 = com.facebook.systrace.Systrace.A0E(r14)
            if (r0 == 0) goto L_0x0131
            r0 = 816892338(0x30b0c9b2, float:1.2863011E-9)
        L_0x012e:
            X.0fS.A00(r0)
        L_0x0131:
            return r4
        L_0x0132:
            if (r18 == 0) goto L_0x00c8
            goto L_0x00ae
        L_0x0136:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r14)
            if (r0 == 0) goto L_0x0143
            r0 = -1769091263(0xffffffff968dcf41, float:-2.2910574E-25)
            X.0fS.A00(r0)
        L_0x0143:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228102kn.A0B(X.4D6, X.2l3, java.lang.Integer, java.lang.Integer):boolean");
    }

    public static final boolean A0C(C228102kn r8, Integer num) {
        UserSession userSession = r8.A07;
        UserSession userSession2 = 1NM.A00(userSession).A00;
        0Tu r6 = 0Tu.A05;
        long A012 = 182.A01(r6, userSession2, 36598992585166157L);
        if (A012 <= 0 || 00l.A0d(182.A04(r6, 1NM.A00(userSession).A00, 36880467563446602L), 1NZ.A01(num), false) || !0qQ.A0K(1Au.A00(userSession).A01.getString("last_stories_tray_fetch_reason", (String) null), "BACKGROUND_PREFETCH") || System.currentTimeMillis() - 1Au.A00(userSession).A01.getLong("last_stories_tray_request_timestamp", -1) > TimeUnit.SECONDS.toMillis(A012)) {
            return false;
        }
        return true;
    }

    public final void A0D() {
        UserSession userSession = this.A07;
        1OP r0 = 1OP.$redex_init_class;
        1NY r2 = new 1NY(userSession);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A("stories/hallpass/hallpass_info_pogs/");
        r2.A0R(C2372736z.class, AnonymousClass372.class);
        1OC A0M2 = r2.A0M();
        A0M2.A00 = new AnonymousClass375(this);
        1ES.A03(A0M2);
    }

    public final void A0E() {
        this.A0S.set(true);
        if (this.A0E) {
            if (182.A06(0Tu.A05, 1NM.A00(this.A07).A00, 36317234137863099L)) {
                return;
            }
        }
        AnonymousClass1O8 r0 = this.A06;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final boolean A0H() {
        if (this.A0G || this.A0H || this.A0F) {
            return true;
        }
        return false;
    }

    public final boolean CJl() {
        return this.A0I;
    }

    public final boolean CKY() {
        ArrayList arrayList = this.A0B;
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return false;
        }
        return true;
    }

    public final boolean CKZ() {
        return !this.A0R.isEmpty();
    }

    public final void onSessionWillEnd() {
        Set set;
        C228122kp r5 = this.A0P;
        synchronized (r5.A01) {
            if (182.A06(0Tu.A05, r5.A00, 36325768238740701L)) {
                set = r5.A03;
            } else {
                set = r5.A02;
            }
            set.clear();
        }
        AnonymousClass34T r0 = this.A08;
        if (r0 != null) {
            A0G(r0);
        }
        this.A08 = null;
    }

    public final void AUz() {
        int i;
        long j;
        if (!A0H()) {
            ArrayList arrayList = this.A0R;
            if (!arrayList.isEmpty()) {
                this.A0H = true;
                Integer num = this.A0O;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = this.A0K;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.subList(0, Math.min(i, arrayList.size())));
                UserSession userSession = this.A07;
                List list = null;
                if (182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36325867022726456L)) {
                    ReelStore A052 = 1OP.A05(userSession);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(A052.A0M((String) it.next()));
                    }
                    list = 00k.A0X(arrayList3);
                }
                String str = this.A0A;
                ArrayList arrayList4 = this.A0Q;
                ReelStore A053 = 1OP.A05(userSession);
                synchronized (A053) {
                    j = 0;
                    for (Reel reel : A053.A03.A00.values()) {
                        j = Math.max(j, reel.A04);
                    }
                }
                String str2 = this.A09;
                0qQ.A0B(arrayList4, 3);
                1NY r3 = new 1NY(userSession);
                r3.A08(AnonymousClass05K.A01);
                r3.A0A("feed/reels_tray/");
                r3.A02 = new 1NS(new 0bH(userSession), AnonymousClass1NR.class);
                String obj = UUID.randomUUID().toString();
                r3.A9m(TraceFieldType.RequestID, obj);
                r3.A9m("tray_session_id", str);
                r3.A06 = 1CE.A04;
                Integer num2 = AnonymousClass05K.A0u;
                r3.A9m("reason", "pagination");
                r3.A9m("current_highest_ranked_position", String.valueOf(j));
                try {
                    r3.A9m("reel_ids_to_fetch", AnonymousClass49G.A01(arrayList2));
                    if (!arrayList4.isEmpty()) {
                        r3.A9m("head_load_delivered_ids", AnonymousClass49G.A01(arrayList4));
                    }
                    if (list != null) {
                        r3.A9m("latest_reel_media_by_id", AnonymousClass49G.A00(userSession, list));
                    }
                } catch (IOException e) {
                    0KC.A0G("ReelApiUtil", "Failed to convert a collection to json", e);
                }
                r3.A0G("cursor", str2);
                1OC A0M2 = r3.A0M();
                Integer num3 = AnonymousClass05K.A00;
                AnonymousClass4Z5 r6 = new AnonymousClass4Z5(A0M2, num3, num2, num3, obj, str, arrayList2);
                1OC r1 = r6.A00;
                r1.A00 = new C305806Jq(r6, this, arrayList2);
                1ES.A03(r1);
            }
        }
    }

    public final void Cmq() {
        if (!A0H()) {
            List list = null;
            if (this.A0D) {
                if (!182.A06(0Tu.A05, this.A07, 36329973010874767L)) {
                    return;
                }
            }
            ArrayList arrayList = this.A0B;
            if (arrayList == null || !arrayList.isEmpty()) {
                this.A0F = true;
                UserSession userSession = this.A07;
                if (arrayList != null) {
                    list = 00k.A0a(arrayList);
                }
                1OP r0 = 1OP.$redex_init_class;
                1NY r3 = new 1NY(userSession);
                r3.A08(AnonymousClass05K.A0N);
                r3.A0A("feed/stories_injection_tray/");
                r3.A0C(AnonymousClass000.A00(344), (int) 182.A01(0Tu.A05, userSession, 36611447987443940L));
                r3.A9m(AnonymousClass000.A00(1767), "tray");
                r3.A9m("reason", "inventory_exhaustion");
                r3.A0R(CE2.class, C45629Czf.class);
                if (list != null) {
                    try {
                        r3.A9m(AnonymousClass000.A00(762), AnonymousClass49G.A01(list));
                    } catch (IOException e) {
                        0KC.A0G("ReelApiUtil", "Failed to convert highlights IDs to be fetched to json", e);
                    }
                }
                1OC A0M2 = r3.A0M();
                A0M2.A00 = new CH6(this);
                1ES.A03(A0M2);
            }
        }
    }
}
