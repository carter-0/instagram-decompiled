package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2lL  reason: invalid class name and case insensitive filesystem */
public final class C228322lL extends C252233om implements AnonymousClass4DU, C228132kq, AnonymousClass2lM {
    public static final Handler A0d = new Handler(Looper.getMainLooper());
    public static final String __redex_internal_original_name = "StoriesAdsPrefetchController";
    public 02m A00;
    public C2365334c A01;
    public C2365934i A02;
    public C233812wV A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public C228352lS A07;
    public boolean A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final Context A0C;
    public final UserSession A0D;
    public final C228332lN A0E = new C228332lN(this);
    public final C228102kn A0F;
    public final Double A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final long A0R;
    public final AnonymousClass07i A0S;
    public final AnonymousClass0iw A0T;
    public final AnonymousClass4DU A0U;
    public final AnonymousClass2lP A0V = new AnonymousClass2lO(this);
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;

    public final void D6z(View view) {
        if (this.A0X) {
            UserSession userSession = this.A0D;
            AnonymousClass0iw r6 = this.A0T;
            0qQ.A0B(userSession, 1);
            0qQ.A0B(r6, 2);
            C230252pH r5 = new C230252pH(r6, userSession, (String) null, (String) null, (String) null);
            this.A03 = 1P6.A01(this.A0C, this.A0S, userSession, this, AnonymousClass3BQ.MAIN_FEED_TRAY, new C238343Bm(this), r5.A04);
            C228352lS r2 = this.A07;
            if (r2 != null && this.A0c) {
                AnonymousClass2lP r1 = this.A0V;
                0qQ.A0B(r1, 0);
                r2.A00 = new WeakReference(r1);
            }
        }
    }

    public final void DJL(boolean z) {
    }

    public final void DWD(long j, int i) {
    }

    public final void DWE(long j) {
    }

    public final void Dcg(Integer num, int i, long j, boolean z) {
    }

    public final /* synthetic */ void Dcj() {
    }

    public final String getModuleName() {
        return "reel_feed_timeline";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onPause() {
        this.A08 = false;
        this.A0F.A0G(this);
        A0d.removeCallbacks(this.A0E);
    }

    public final void onResume() {
        this.A08 = true;
        this.A0F.A0F(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r7.A0c() != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private double A00(long r12) {
        /*
            r11 = this;
            com.instagram.common.session.UserSession r0 = r11.A0D
            com.instagram.reels.store.ReelStore r1 = X.1OP.A05(r0)
            r0 = 0
            java.util.List r0 = r1.A0U(r0)
            java.util.Iterator r10 = r0.iterator()
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = 0
        L_0x0014:
            long r5 = (long) r9
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r7 = r10.next()
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            boolean r6 = r7.A0e()
            boolean r0 = r7.A0d()
            if (r0 != 0) goto L_0x0036
            boolean r5 = r7.A0c()
            r0 = 0
            if (r5 == 0) goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            if (r6 != 0) goto L_0x0014
            if (r0 != 0) goto L_0x0014
            X.3HV r0 = r7.A0M
            if (r0 == 0) goto L_0x0014
            java.lang.Double r0 = r0.A0T
            if (r0 == 0) goto L_0x0014
            double r7 = r0.doubleValue()
            double r5 = r3 - r7
            double r1 = r1 * r5
            int r9 = r9 + 1
            goto L_0x0014
        L_0x004d:
            int r0 = java.lang.Double.compare(r1, r3)
            if (r0 == 0) goto L_0x0054
            double r3 = r3 - r1
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228322lL.A00(long):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r7.A0c() != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass5K5 A02() {
        /*
            r15 = this;
            boolean r0 = r15.A0b
            if (r0 != 0) goto L_0x0006
            r3 = 0
            return r3
        L_0x0006:
            com.instagram.common.session.UserSession r5 = r15.A0D
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r5)
            r3 = 0
            java.util.List r4 = r0.A0U(r3)
            r10 = 4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r4.iterator()
            r8 = 0
        L_0x001c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r7 = r9.next()
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            boolean r6 = r7.A0e()
            boolean r0 = r7.A0d()
            if (r0 != 0) goto L_0x0039
            boolean r1 = r7.A0c()
            r0 = 0
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r6 != 0) goto L_0x001c
            if (r0 != 0) goto L_0x001c
            X.3HV r0 = r7.A0M
            if (r0 == 0) goto L_0x001c
            java.lang.Double r0 = r0.A0T
            if (r0 == 0) goto L_0x001c
            r2.add(r0)
            int r8 = r8 + 1
            if (r8 >= r10) goto L_0x004e
            goto L_0x001c
        L_0x004e:
            r1 = 0
            r14 = 0
        L_0x0050:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0073
            java.lang.Object r0 = r4.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A0e()
            if (r0 != 0) goto L_0x0070
            java.lang.Object r0 = r4.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A16(r5)
            if (r0 != 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0073:
            long r0 = r15.A06
            double r4 = r15.A00(r0)
            double r6 = A01(r2, r3)
            r0 = 1
            double r8 = A01(r2, r0)
            r0 = 2
            double r10 = A01(r2, r0)
            r0 = 3
            double r12 = A01(r2, r0)
            X.5K5 r3 = new X.5K5
            r3.<init>(r4, r6, r8, r10, r12, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228322lL.A02():X.5K5");
    }

    public static void A03(AnonymousClass9J0 r12, C228322lL r13, C238523Ce r14, Integer num, String str, int i) {
        String A002;
        if (r13.A08 && r13.A03 != null) {
            C233632w4 A003 = AnonymousClass414.A00(r13.A02.A02(), r13.A0F.A0R, i);
            C233812wV r2 = r13.A03;
            if (num == null) {
                A002 = null;
            } else {
                A002 = C258463z7.A00(num);
            }
            double A004 = r13.A00(r13.A0A);
            HashSet hashSet = new HashSet();
            for (C251373n0 BTb : r2.A0Y.A03()) {
                hashSet.add(r2.A0R.BEZ(BTb.BTb()));
            }
            Iterator it = r2.A0b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!((C271744jW) entry.getValue()).CVX() && !hashSet.contains(entry.getKey()) && ((C271744jW) entry.getValue()).Bz6() == C271754jX.IN_AD_POOL) {
                    it.remove();
                }
            }
            C233812wV.A07(r2, true);
            r2.A0T.Cn8(r12, A003, r14, A002, str, A004, false);
        }
    }

    public static void A04(AnonymousClass9J0 r5, C228322lL r6, Integer num, String str) {
        Handler handler = A0d;
        C228332lN r2 = r6.A0E;
        handler.removeCallbacks(r2);
        AnonymousClass9J0 r1 = r5;
        Integer num2 = num;
        String str2 = str;
        if (!r6.A0Z) {
            r2.A01 = num;
            r2.A02 = str;
            r2.A00 = r1;
            handler.postDelayed(r2, r6.A0R);
            return;
        }
        A03(r1, r2.A03, C238523Ce.A03, num2, str2, 0);
    }

    public static void A05(C228322lL r11, Integer num, String str) {
        AnonymousClass2lP r7;
        long j;
        if (r11.A0Q) {
            boolean z = r11.A0K;
            if (z && Double.compare(r11.A00(r11.A0A), r11.A0G.doubleValue()) < 0) {
                return;
            }
            if (!r11.A0H || (!1Bh.A00().A03())) {
                if (r11.A0I) {
                    AnonymousClass1IN r4 = AnonymousClass1IN.A02;
                    if (r4 == null) {
                        r4 = new AnonymousClass1IN();
                        AnonymousClass1IN.A02 = r4;
                    }
                    0qQ.A0C(r4, "null cannot be cast to non-null type com.instagram.common.api.base.LatencyEstimatorRecorder");
                    String A002 = 1Ma.A00();
                    synchronized (r4) {
                        0qQ.A0B(A002, 0);
                        if (C61970qY.A0D()) {
                            A002 = 002.A0R(A002, "_wifi");
                        }
                        AnonymousClass2ZE r3 = (AnonymousClass2ZE) r4.A01.get(A002);
                        if (r3 != null) {
                            synchronized (r3) {
                                j = r3.A00 / ((long) r3.A01.size());
                            }
                        } else {
                            j = r4.A00.A04(A002, -1);
                        }
                    }
                    if (j == -1 || j >= r11.A09) {
                        return;
                    }
                }
                C228352lS r42 = r11.A07;
                if (z || r42 == null) {
                    A04((AnonymousClass9J0) null, r11, num, str);
                } else if (!r11.A0a) {
                    02m r6 = r11.A00;
                    r6.markerStart(424097382);
                    AnonymousClass5K5 A022 = r11.A02();
                    r6.markerPoint(424097382, "immediate_signals_extracted");
                    if (!r11.A0c) {
                        r7 = r11.A0V;
                    } else {
                        r7 = null;
                    }
                    r42.A03(r11.A0C.getApplicationContext(), r6, r7, A022, (C233632w4) null, (C238523Ce) null, r11.A0F.A0A, C258463z7.A00(num), str);
                } else {
                    A04(new AnonymousClass9J0((Object) null, r11.A02(), r11.A0F.A0A, 5, true), r11, num, str);
                }
            }
        }
    }

    public final void A06(boolean z) {
        if (this.A0Y && !z && !this.A04 && !this.A0F.A0G) {
            A05(this, AnonymousClass05K.A15, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r5 == false) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DcX(boolean r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3.A0W
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r5 != 0) goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x0022
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0017
            X.2kn r0 = r3.A0F
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x0022
        L_0x0017:
            if (r1 == 0) goto L_0x0021
            if (r2 != 0) goto L_0x0021
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            r0 = 0
            A05(r3, r1, r0)
        L_0x0021:
            return
        L_0x0022:
            r2 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228322lL.DcX(boolean, boolean):void");
    }

    public final void Dch(1OE r5, String str, int i, long j, boolean z, boolean z2) {
        if (!this.A0M || !this.A04) {
            if (i != -1) {
                UserSession userSession = this.A0D;
                0qQ.A0B(userSession, 1);
                if (i != 2) {
                    if (!182.A06(0Tu.A05, 1NM.A00(userSession).A00, 36317234137994173L)) {
                        return;
                    }
                }
            }
            A05(this, AnonymousClass05K.A01, 1NZ.A00(r5.A04));
        }
    }

    public final void DhA() {
        if (!this.A0M || !this.A04) {
            A05(this, AnonymousClass05K.A0u, (String) null);
        }
    }

    public final void onDestroyView() {
        C233812wV r0 = this.A03;
        if (r0 != null) {
            r0.A0B();
            this.A03 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x017d, code lost:
        if (X.182.A06(r2, r9, 36310542579007614L) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x004a, code lost:
        r0 = X.C228342lQ.A01(r4);
        r1 = X.1Az.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C228322lL(X.AnonymousClass07i r6, X.C227812jx r7, X.AnonymousClass0iw r8, com.instagram.common.session.UserSession r9, X.AnonymousClass4DU r10) {
        /*
            r5 = this;
            r5.<init>()
            r3 = 0
            X.2lN r0 = new X.2lN
            r0.<init>(r5)
            r5.A0E = r0
            X.2lO r0 = new X.2lO
            r0.<init>(r5)
            r5.A0V = r0
            r5.A0D = r9
            X.02m r0 = X.02m.A0p
            r5.A00 = r0
            r5.A0T = r8
            android.content.Context r0 = r7.getContext()
            r5.A0C = r0
            r5.A0U = r10
            X.2kn r0 = X.C228092km.A00(r9)
            r5.A0F = r0
            r5.A0S = r6
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321468976342422(0x810a2f000e2596, double:3.0331814632307316E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x0058
            X.1Av r4 = X.1Au.A00(r9)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 36321468976407959(0x810a2f000f2597, double:3.0331814632721774E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0173
            X.1Az r0 = X.C228342lQ.A01(r4)
            X.1Az r1 = X.1Az.A07
            if (r0 != r1) goto L_0x0058
            X.1Az r0 = X.C228342lQ.A00(r9)
            if (r0 == r1) goto L_0x0173
        L_0x0058:
            r1 = 0
        L_0x0059:
            r5.A0X = r1
            if (r1 == 0) goto L_0x0181
            r0 = 36310542578876540(0x81003f0004007c, double:3.0262715654762367E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0P = r0
            r0 = 36310542579204225(0x81003f00090081, double:3.026271565683466E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0Q = r0
            r0 = 36592017556111476(0x82003f000c0074, double:3.2042774744883696E-306)
            long r3 = X.182.A01(r2, r9, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r3)
            r5.A0R = r0
            r0 = 36310542580318351(0x81003f001a008f, double:3.026271566388044E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0K = r0
            r0 = 37154967510515719(0x84003f001b0007, double:3.560289292471131E-306)
            double r0 = X.182.A00(r2, r9, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.A0G = r0
            r0 = 36310542583988405(0x81003f005200b5, double:3.0262715687090007E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0H = r0
            r0 = 36310542584053942(0x81003f005300b6, double:3.0262715687504465E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0I = r0
            r0 = 36592017560830085(0x82003f00540085, double:3.204277477472437E-306)
            long r0 = X.182.A01(r2, r9, r0)
            r5.A09 = r0
            r0 = 36592017559584898(0x82003f00410082, double:3.2042774766849756E-306)
            long r0 = X.182.A01(r2, r9, r0)
            r5.A0A = r0
            r0 = 36310542580580498(0x81003f001e0092, double:3.0262715665538266E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0M = r0
            r0 = 36310542580842644(0x81003f00220094, double:3.026271566719609E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0L = r0
            r0 = 36592017557618809(0x82003f00230079, double:3.204277475441613E-306)
            long r0 = X.182.A01(r2, r9, r0)
            r5.A0B = r0
            r0 = 36317483246163123(0x81068f000614b3, double:3.0306608714160957E-306)
            X.182.A06(r2, r9, r0)
            r0 = 36310542581629083(0x81003f002e009b, double:3.026271567216956E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0W = r0
            r0 = 36310542581694620(0x81003f002f009c, double:3.026271567258402E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0J = r0
            r0 = 36310542581760157(0x81003f0030009d, double:3.0262715672998477E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0Z = r0
            r0 = 36599254576008663(0x8206d4000c0dd7, double:3.208854195012491E-306)
            long r0 = X.182.A01(r2, r9, r0)
            r5.A06 = r0
            X.2lS r0 = X.AnonymousClass2lR.A00(r9)
            r5.A07 = r0
            r0 = 36310542583398575(0x81003f004900af, double:3.02627156833599E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0O = r0
            r0 = 2342160788813583884(0x208106d40015160c, double:4.0637031692953E-152)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A05 = r0
            r0 = 36317779601004055(0x8106d400261617, double:3.030848287410826E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0c = r0
            r0 = 36317779601200666(0x8106d40029161a, double:3.030848287535164E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0b = r0
            r0 = 36317779601462814(0x8106d4002d161e, double:3.030848287700947E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0a = r0
            r0 = 36321468976014738(0x810a2f00092592, double:3.033181463023503E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0Y = r0
            r0 = 36317779602118183(0x8106d400371627, double:3.030848288115405E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r5.A0N = r0
            return
        L_0x0173:
            r0 = 36310542579007614(0x81003f0006007e, double:3.0262715655591284E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0059
            goto L_0x0058
        L_0x0181:
            r5.A03 = r3
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.A0G = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r5.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228322lL.<init>(X.07i, X.2jx, X.0iw, com.instagram.common.session.UserSession, X.4DU):void");
    }

    public static double A01(List list, int i) {
        if (i < list.size()) {
            return ((Number) list.get(i)).doubleValue();
        }
        return -1.0d;
    }
}
