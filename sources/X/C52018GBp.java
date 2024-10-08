package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.EglBase14Impl;

/* renamed from: X.GBp  reason: case insensitive filesystem */
public final class C52018GBp implements JR1, JRF, AnonymousClass32U, C250603lj {
    public C267324bN A00;
    public C52806Gcy A01;
    public ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final Context A03;
    public final UserSession A04;
    public final 1Av A05;
    public final C227232is A06;
    public final GD6 A07;
    public final C52017GBo A08;
    public final String A09;
    public final ConcurrentHashMap A0A = new ConcurrentHashMap();
    public final ConcurrentHashMap A0B = new ConcurrentHashMap();
    public final ConcurrentHashMap A0C = new ConcurrentHashMap();
    public final AtomicLong A0D = new AtomicLong(0);
    public final AtomicLong A0E = new AtomicLong(0);
    public final AtomicReference A0F = new AtomicReference((Object) null);
    public final AtomicReference A0G = new AtomicReference((Object) null);
    public final AnonymousClass0eM A0H = AnonymousClass0eN.A01(C58715IwO.A01(this, 45));
    public final AnonymousClass0eM A0I = AnonymousClass0eN.A01(C58715IwO.A01(this, 46));
    public final AnonymousClass0eM A0J = C58715IwO.A00(this, 0eO.A03, 47);
    public final Handler A0K = new Handler(C64021Cb.A00());
    public final ClipsViewerConfig A0L;
    public final ConcurrentHashMap A0M = new ConcurrentHashMap();
    public final AtomicBoolean A0N = new AtomicBoolean();
    public final AtomicReference A0O = new AtomicReference((Object) null);
    public final C62320sa A0P;
    public final C62320sa A0Q;

    public C52018GBp(Context context, ClipsViewerConfig clipsViewerConfig, UserSession userSession, 1Av r9, C227232is r10, GD6 gd6, C52017GBo gBo, String str, C62320sa r14, C62320sa r15) {
        0qQ.A0B(userSession, 1);
        C51973G9u.A0s(6, clipsViewerConfig, r9, str);
        this.A04 = userSession;
        this.A03 = context;
        this.A06 = r10;
        this.A07 = gd6;
        this.A08 = gBo;
        this.A0L = clipsViewerConfig;
        this.A05 = r9;
        this.A09 = str;
        this.A0Q = r14;
        this.A0P = r15;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = X.JSx.A00(r4, r3.A07).A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A07(X.C267324bN r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0019
            X.GD6 r0 = r3.A07
            X.GDe r0 = X.JSx.A00(r4, r0)
            X.3W1 r0 = r0.A0E
            r1 = 1
            if (r0 == 0) goto L_0x0019
            X.3W8 r0 = r0.A3Z
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != r1) goto L_0x0019
            r2 = 1
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52018GBp.A07(X.4bN):boolean");
    }

    public final GHA A08(C267324bN r3) {
        AnonymousClass0eM r0;
        if (r3 == null || !r3.CcK()) {
            r0 = this.A0H;
        } else {
            r0 = this.A0I;
        }
        return (GHA) r0.getValue();
    }

    public final void A09(C267324bN r8, C52318GNk gNk, C52317GNj gNj, Integer num) {
        String str;
        0qQ.A0B(gNj, 2);
        if (r8 != null) {
            String A012 = A01(gNk, gNj);
            boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A00);
            AnonymousClass3W1 r4 = JSx.A00(r8, this.A07).A0E;
            ConcurrentHashMap concurrentHashMap = this.A02;
            Runnable runnable = (Runnable) C51968G9o.A0x(r8, concurrentHashMap);
            if (runnable != null) {
                this.A0K.removeCallbacks(runnable);
            }
            this.A0A.put(r8.getId(), AnonymousClass7TE.A1L(A012, Boolean.valueOf(A1W)));
            if (r4 != null) {
                if (1 - num.intValue() != 0) {
                    str = "for_session";
                } else {
                    str = "for_media";
                }
                r4.A3Q.A00(r4, AnonymousClass7TE.A1L(A012, str));
            }
            concurrentHashMap.put(r8.getId(), new C57878Ihv(r8, this));
            Runnable runnable2 = (Runnable) C51968G9o.A0x(r8, concurrentHashMap);
            if (runnable2 != null) {
                this.A0K.postDelayed(runnable2, 1000);
            }
        }
    }

    public final void AGC(C267324bN r5, C52318GNk gNk, C52317GNj gNj) {
        this.A0E.set(0);
        A05(r5, gNk, gNj, false);
    }

    public final void ATF(AnonymousClass30Y r18, C252093oY r19) {
        long j;
        long j2;
        long j3;
        1Xj r0;
        Double d;
        Double d2;
        1Xj r02;
        C267324bN r03;
        AnonymousClass30Y r3 = r18;
        0qQ.A0B(r3, 0);
        C252093oY r1 = r19;
        0qQ.A0B(r1, 1);
        int intValue = r1.CEk(r3).intValue();
        if (intValue == 0) {
            Object obj = r3.A03;
            C267324bN r6 = (C267324bN) obj;
            long j4 = A08(r6).A06;
            AnonymousClass30J r10 = AnonymousClass30J.SECONDS;
            AnonymousClass30M.A03(AnonymousClass30K.A04(r10, j4));
            0qQ.A06(obj);
            long incrementAndGet = this.A0D.incrementAndGet();
            AtomicReference atomicReference = this.A0F;
            if (0qQ.A0K(atomicReference.get(), r6.getId())) {
                if (incrementAndGet == 2) {
                    A03(r6);
                } else {
                    atomicReference.set((Object) null);
                    AnonymousClass3W1 r2 = this.A07.A0A.BzC(r6).A0E;
                    if (r2 != null) {
                        r2.A3S.A00(r2, false);
                    }
                }
            }
            if (CRr(r6)) {
                AnonymousClass3W1 r04 = ((C52058GDe) r3.A04).A0E;
                if (r04 != null) {
                    r04.A0i(false);
                }
                this.A0G.set((Object) null);
                AnonymousClass3W1 r12 = this.A07.A0A.BzC(r6).A0E;
                0qQ.A0A(r6);
                UserSession userSession = this.A04;
                AnonymousClass3WR A092 = r6.A09(userSession, (Integer) null);
                if (A092 == null || (d2 = A092.A0C) == null) {
                    j = 1000;
                } else {
                    j = AnonymousClass30M.A03(AnonymousClass30K.A02(r10, d2.doubleValue()));
                }
                if (!A08(r6).A0F || !A08(r6).A0B.contains(this.A09)) {
                    j2 = A08(r6).A02;
                } else {
                    j2 = A08(r6).A01;
                }
                long A032 = AnonymousClass30M.A03(AnonymousClass30K.A04(r10, A08(r6).A03));
                if (j2 * j < A032) {
                    j2 = (long) Math.ceil(((double) A032) / ((double) j));
                }
                String id = r6.getId();
                ConcurrentHashMap concurrentHashMap = this.A0B;
                AnonymousClass3WR A093 = r6.A09(userSession, (Integer) null);
                if (A093 == null || (d = A093.A0C) == null) {
                    j3 = 1000;
                } else {
                    j3 = AnonymousClass30M.A03(AnonymousClass30K.A02(r10, d.doubleValue()));
                }
                int i = (int) j2;
                int i2 = i - 1;
                int i3 = i2;
                if (i2 < 0) {
                    i3 = 0;
                }
                concurrentHashMap.put(id, Long.valueOf((((long) i3) * j3) + j3));
                if (!r6.CcK() || (r0 = r6.A02) == null || !r0.A5p()) {
                    if (r12 != null) {
                        r12.A3X.A00(r12, Integer.valueOf(i2));
                    }
                    this.A0C.put(id, Integer.valueOf(i));
                }
            }
            this.A0N.set(false);
        } else if (intValue != 1) {
            1Xj r13 = ((C267324bN) r3.A03).A02;
            if (r13 != null) {
                this.A07.BQr(r13).A0i(false);
            }
        } else if (r1.CFe(r3) == 1.0f) {
            AtomicBoolean atomicBoolean = this.A0N;
            if (!atomicBoolean.get()) {
                Object obj2 = r3.A03;
                C267324bN r32 = (C267324bN) obj2;
                this.A00 = r32;
                if (0qQ.A0K(this.A0F.get(), r32.getId())) {
                    0qQ.A06(obj2);
                    if (A06(r32)) {
                        AGC(r32, C52318GNk.SCROLLBACK, C52317GNj.A0f);
                        atomicBoolean.set(true);
                    }
                }
                0qQ.A06(obj2);
                if (CRr(r32) && r32.CcK() && (r02 = r32.A02) != null && r02.A5p()) {
                    C52806Gcy gcy = this.A01;
                    if (gcy != null) {
                        r03 = gcy.A00;
                    } else {
                        r03 = null;
                    }
                    if (!0qQ.A0K(r03, obj2)) {
                        C52806Gcy gcy2 = new C52806Gcy(r32, this, AnonymousClass30M.A03(AnonymousClass30K.A04(AnonymousClass30J.SECONDS, A08(r32).A06)));
                        this.A01 = gcy2;
                        gcy2.start();
                    }
                }
                atomicBoolean.set(true);
            }
        }
    }

    public final boolean CRr(C267324bN r8) {
        AnonymousClass3W1 r0;
        0qQ.A0B(r8, 0);
        if (!this.A05.A01.getBoolean("has_cancelled_reels_auto_scroll", false)) {
            long j = A08(r8).A04;
            if ((j < 0 || this.A0E.get() < j) && A06(r8)) {
                if ((!A08(r8).A0F || A08(r8).A0E || A08(r8).A0B.contains(this.A09)) && (r0 = this.A07.A0A.BzC(r8).A0E) != null && !((Boolean) r0.A3S.A00).booleanValue()) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean CRs(C267324bN r7) {
        boolean z = false;
        0qQ.A0B(r7, 0);
        if (A06(r7)) {
            0eP r1 = (0eP) this.A0O.get();
            z = true;
            if (r1 != null && C51969G9p.A1Y(r7, r1.A00)) {
                if (SystemClock.elapsedRealtime() - AnonymousClass7TE.A0R(r1.A01) <= 100) {
                    return true;
                }
                return false;
            }
        }
        return z;
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cf, code lost:
        if (r17 != false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DaS(X.C267324bN r22, int r23, int r24, boolean r25) {
        /*
            r21 = this;
            r2 = 0
            r9 = r22
            X.0qQ.A0B(r9, r2)
            r12 = r21
            boolean r0 = r12.CRr(r9)
            if (r0 == 0) goto L_0x009a
            java.lang.String r14 = r9.getId()
            X.GHA r0 = r12.A08(r9)
            long r0 = r0.A06
            X.30J r13 = X.AnonymousClass30J.SECONDS
            long r0 = X.AnonymousClass30K.A04(r13, r0)
            long r18 = X.AnonymousClass30M.A03(r0)
            X.GD6 r0 = r12.A07
            X.GBg r11 = r0.A0A
            X.GDe r0 = r11.BzC(r9)
            X.3W1 r8 = r0.A0E
            int r7 = r0.A08
            int r0 = r12.A00(r9)
            r10 = r24
            long r3 = (long) r10
            int r0 = r0 - r7
            int r0 = r0 + -1
            if (r0 >= r2) goto L_0x003b
            r0 = 0
        L_0x003b:
            long r5 = (long) r0
            long r5 = r5 * r3
            long r5 = r5 + r3
            r2 = r23
            long r0 = (long) r2
            long r5 = r5 - r0
            r15 = 0
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x009a
            if (r2 >= r10) goto L_0x009a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap r0 = r12.A0B
            r0.put(r14, r2)
            r14 = 1
            if (r8 == 0) goto L_0x010e
            boolean r0 = r8.A1q
            if (r0 != r14) goto L_0x010e
            r17 = 1
            boolean r0 = r9.CcK()
            if (r0 != 0) goto L_0x0066
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
        L_0x0066:
            X.GNk r15 = X.C52318GNk.ITEM_INTERACTION
            X.GNj r1 = X.C52317GNj.A0A
            int r16 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            r0 = 0
            if (r16 > 0) goto L_0x0070
            r0 = 1
        L_0x0070:
            r12.A05(r9, r15, r1, r0)
        L_0x0073:
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
            X.2is r0 = r12.A06
            X.GBj r0 = r0.A0N()
            androidx.recyclerview.widget.RecyclerView r0 = X.C52012GBj.A03(r0)
            if (r0 == 0) goto L_0x009b
            boolean r0 = X.C2808154f.A04(r0)
            if (r0 == 0) goto L_0x009b
            X.5o2 r1 = r9.A01
            X.5o2 r0 = X.C295365o2.GHOST
            if (r1 == r0) goto L_0x009b
        L_0x008f:
            if (r8 == 0) goto L_0x009a
            X.3W8 r1 = r8.A3S
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r1.A00(r8, r0)
        L_0x009a:
            return
        L_0x009b:
            android.content.Context r0 = r12.A03
            boolean r0 = X.C61970qY.A0F(r0)
            if (r0 != 0) goto L_0x00a4
            goto L_0x008f
        L_0x00a4:
            X.GHA r0 = r12.A08(r9)
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x00b5
            X.GDe r0 = r11.BzC(r9)
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x00b5
            goto L_0x008f
        L_0x00b5:
            X.0sa r0 = r12.A0Q
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ca
            X.GNk r1 = X.C52318GNk.ITEM_INTERACTION_WITH_NEW_SURFACE
            X.GNj r0 = X.C52317GNj.A08
            r12.AGC(r9, r1, r0)
        L_0x00ca:
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x00d1
            r11 = 1
            if (r17 == 0) goto L_0x00d2
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            X.GHA r0 = r12.A08(r9)
            long r0 = r0.A05
            long r0 = X.AnonymousClass30K.A04(r13, r0)
            long r5 = X.AnonymousClass30M.A03(r0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r20 = 0
            if (r0 > 0) goto L_0x00e8
            r20 = 1
        L_0x00e8:
            if (r8 == 0) goto L_0x009a
            X.3W8 r0 = r8.A3Z
            java.lang.Object r0 = r0.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0123
            if (r11 == 0) goto L_0x0123
            java.util.concurrent.atomic.AtomicReference r0 = r12.A0G
            java.lang.Object r0 = r0.get()
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x0112
            java.lang.Object r1 = r0.A00
            X.GNk r1 = (X.C52318GNk) r1
            java.lang.Object r0 = r0.A01
            X.GNj r0 = (X.C52317GNj) r0
            r12.A05(r9, r1, r0, r14)
            return
        L_0x010e:
            r17 = 0
            goto L_0x0073
        L_0x0112:
            X.GBo r12 = r12.A08
            long r5 = (long) r7
            int r7 = r7 * r24
            long r0 = (long) r7
            long r0 = r0 - r18
            r13 = r9
            r14 = r5
            r16 = r3
            r18 = r0
            r12.A00(r13, r14, r16, r18, r20)
        L_0x0123:
            X.3W8 r0 = r8.A3c
            r0.A00(r8, r2)
            r8.A0i(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52018GBp.DaS(X.4bN, int, int, boolean):void");
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r7, int i, int i2) {
        0qQ.A0B(r7, 0);
        if (CRr(r7)) {
            int A002 = A00(r7);
            C52009GBg gBg = this.A07.A0A;
            int i3 = gBg.BzC(r7).A08;
            AnonymousClass3W1 r2 = gBg.BzC(r7).A0E;
            if (r2 != null) {
                int i4 = (A002 - i3) - 1;
                if (i4 < 0) {
                    i4 = 0;
                }
                r2.A3X.A00(r2, Integer.valueOf(i4));
            }
            if (i3 >= A002) {
                A04(r7, this);
            }
        }
    }

    private final int A00(C267324bN r2) {
        int intValue;
        Number number = (Number) C51968G9o.A0x(r2, this.A0C);
        if (number == null || (intValue = number.intValue()) == 0) {
            return 3;
        }
        return intValue;
    }

    private final void A03(C267324bN r5) {
        AnonymousClass3W1 r2 = JSx.A00(r5, this.A07).A0E;
        if (r2 != null) {
            r2.A0i(false);
            C51966G9m.A1N(r2.A3S, r2, true);
        }
        this.A0O.set(AnonymousClass7TF.A0y(r5.getId(), SystemClock.elapsedRealtime()));
    }

    public static final void A04(C267324bN r4, C52018GBp gBp) {
        C52017GBo gBo = gBp.A08;
        0qQ.A0B(r4, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gBo.A00, gBo.A01), "instagram_reels_auto_advance_countdown_finished");
        if (A0e.isSampled()) {
            String str = null;
            C51965G9l.A1J(A0e, C51969G9p.A0u(r4.A02));
            C51965G9l.A1L(A0e, r4.A0P);
            if (r4.CcK()) {
                str = C51966G9m.A1B(r4);
            }
            A0e.AAJ("ad_id", str);
            A0e.Cgf();
        }
        1Xj r1 = r4.A02;
        if (r1 != null) {
            gBp.A07.BQr(r1).A0i(false);
        }
        gBp.A06.A0N().A0L(true);
        gBp.A0E.incrementAndGet();
        gBp.A0D.set(0);
        gBp.A0F.set(r4.getId());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0138, code lost:
        if (r2 == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x013a, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0140, code lost:
        if (X.0qQ.A0K(r3, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0144, code lost:
        if (r1 != X.AnonymousClass05K.A00) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0146, code lost:
        r5.A1I(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0149, code lost:
        A09(r12, r13, r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x014c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x014d, code lost:
        r0 = r1.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0151, code lost:
        if (r0 == 0) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0153, code lost:
        if (r0 != 1) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0155, code lost:
        if (r12 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0159, code lost:
        if (r13 != X.C52318GNk.A03) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x015d, code lost:
        if (r14 == X.C52317GNj.A0A) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0161, code lost:
        if (r14 == X.C52317GNj.A0O) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0163, code lost:
        if (r10 == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0169, code lost:
        if (A07(r12) != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x016b, code lost:
        if (r9 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x016d, code lost:
        r0 = X.JSx.A00(r12, r11.A07).A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0175, code lost:
        if (r0 == null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x017f, code lost:
        if (X.AnonymousClass7TE.A1a(r0.A3S.A00) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0181, code lost:
        A09(r12, r13, r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0184, code lost:
        A03(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0187, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0188, code lost:
        r5.A1I(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x018b, code lost:
        if (r12 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x018d, code lost:
        A03(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0195, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r1 == 3) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r12.CcK() == true) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r13 == X.C52318GNk.A03) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r13 == X.C52318GNk.A05) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r13 == X.C52318GNk.A04) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        if (r13 != r3) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0062, code lost:
        if (r13 == X.C52318GNk.A07) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
        if (r13 != X.C52318GNk.A08) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006c, code lost:
        if (A07(r12) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006f, code lost:
        if (r15 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0071, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        if (r2 != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0074, code lost:
        if (r0 == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0076, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0077, code lost:
        r5 = r11.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0082, code lost:
        if (r5.A01.getBoolean("has_cancelled_reels_auto_scroll", false) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
        r0 = A08(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0088, code lost:
        switch(r1) {
            case 0: goto L_0x00db;
            case 1: goto L_0x00d8;
            case 2: goto L_0x00d8;
            case 3: goto L_0x00d8;
            case 4: goto L_0x00d5;
            case 5: goto L_0x00d5;
            case 6: goto L_0x00de;
            case 7: goto L_0x00e1;
            default: goto L_0x008b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008f, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0090, code lost:
        if (r12 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0099, code lost:
        if (A08(r12).A0H != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x009b, code lost:
        if (r12 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009d, code lost:
        r0 = X.JSx.A00(r12, r11.A07).A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a5, code lost:
        if (r0 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00af, code lost:
        if (X.AnonymousClass7TE.A1a(r0.A3S.A00) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b3, code lost:
        if (r13 != X.C52318GNk.A03) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b7, code lost:
        if (r14 == X.C52317GNj.A0A) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bb, code lost:
        if (r14 == X.C52317GNj.A0O) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00bf, code lost:
        if (r13 != X.C52318GNk.A05) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c5, code lost:
        if (A07(r12) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c7, code lost:
        if (r15 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c9, code lost:
        r11.A0G.set(X.AnonymousClass7TE.A1L(r13, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d3, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d5, code lost:
        r8 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d8, code lost:
        r8 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00db, code lost:
        r8 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00de, code lost:
        r8 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00e1, code lost:
        r8 = "for_media";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00e3, code lost:
        r7 = X.AnonymousClass05K.A00(2);
        r6 = r7.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00ea, code lost:
        if (r3 >= r6) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00ec, code lost:
        r1 = r7[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00f4, code lost:
        if ((1 - r1.intValue()) == 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00f6, code lost:
        r0 = "for_session";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00fc, code lost:
        if (r0.equals(r8) != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00fe, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0101, code lost:
        r0 = "for_media";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0104, code lost:
        r1 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0106, code lost:
        if (r12 == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0108, code lost:
        r0 = X.JSx.A00(r12, r11.A07).A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0110, code lost:
        if (r0 == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x011a, code lost:
        if (X.AnonymousClass7TE.A1a(r0.A3S.A00) != true) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x011c, code lost:
        r6 = r11.A0A;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x012c, code lost:
        if (X.0qQ.A0K(X.C51968G9o.A0x(r12, r6), new X.0eP((java.lang.Object) null, (java.lang.Object) null)) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012e, code lost:
        r3 = A01(r13, r14);
        r2 = (X.0eP) X.C51968G9o.A0x(r12, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(X.C267324bN r12, X.C52318GNk r13, X.C52317GNj r14, boolean r15) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0020
            boolean r0 = r11.A06(r12)
            if (r0 == 0) goto L_0x0196
            boolean r0 = r12.CcK()
            r1 = 1
            if (r0 == 0) goto L_0x0020
            X.1Xj r0 = r12.A02
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.A5p()
            if (r0 != r1) goto L_0x0020
            X.Gcy r0 = r11.A01
            if (r0 == 0) goto L_0x0020
            r0.cancel()
        L_0x0020:
            int r1 = r13.ordinal()
            r4 = 1
            r0 = 5
            if (r1 == r0) goto L_0x0032
            r0 = 4
            if (r1 == r0) goto L_0x0032
            r0 = 7
            if (r1 == r0) goto L_0x0032
            r0 = 3
            r10 = 1
            if (r1 != r0) goto L_0x0033
        L_0x0032:
            r10 = 0
        L_0x0033:
            X.GNk r3 = X.C52318GNk.SCRUBBER_INTERACTION
            if (r13 != r3) goto L_0x0090
            if (r12 == 0) goto L_0x0196
            X.GD6 r0 = r11.A07
            X.GDe r0 = X.JSx.A00(r12, r0)
            int r2 = r0.A08
            int r0 = r11.A00(r12)
            int r0 = r0 + -1
            if (r2 != r0) goto L_0x0196
        L_0x0049:
            boolean r0 = r12.CcK()
            if (r0 != r4) goto L_0x0093
        L_0x004f:
            X.GNk r0 = X.C52318GNk.ITEM_INTERACTION
            r9 = 0
            if (r13 == r0) goto L_0x005f
            X.GNk r0 = X.C52318GNk.ITEM_INTERACTION_WITH_NEW_SURFACE
            if (r13 == r0) goto L_0x005f
            X.GNk r0 = X.C52318GNk.ITEM_INTERACTION_NEW_PAGE
            if (r13 == r0) goto L_0x005f
            r2 = 0
            if (r13 != r3) goto L_0x0060
        L_0x005f:
            r2 = 1
        L_0x0060:
            X.GNk r0 = X.C52318GNk.SCROLL_DOWN
            if (r13 == r0) goto L_0x0068
            X.GNk r0 = X.C52318GNk.SCROLL_UP
            if (r13 != r0) goto L_0x0071
        L_0x0068:
            boolean r0 = r11.A07(r12)
            if (r0 == 0) goto L_0x0071
            r0 = 1
            if (r15 != 0) goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            if (r2 != 0) goto L_0x0076
            if (r0 == 0) goto L_0x0077
        L_0x0076:
            r9 = 1
        L_0x0077:
            X.1Av r5 = r11.A05
            X.0xa r3 = r5.A01
            java.lang.String r0 = "has_cancelled_reels_auto_scroll"
            r2 = 0
            boolean r0 = r3.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0196
            X.GHA r0 = r11.A08(r12)
            switch(r1) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00d8;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00de;
                case 7: goto L_0x00e1;
                default: goto L_0x008b;
            }
        L_0x008b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0090:
            if (r12 == 0) goto L_0x0093
            goto L_0x0049
        L_0x0093:
            X.GHA r0 = r11.A08(r12)
            boolean r0 = r0.A0H
            if (r0 != 0) goto L_0x004f
            if (r12 == 0) goto L_0x00d3
            X.GD6 r0 = r11.A07
            X.GDe r0 = X.JSx.A00(r12, r0)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x00d3
            X.3W8 r0 = r0.A3S
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x00d3
            X.GNk r0 = X.C52318GNk.ITEM_INTERACTION
            if (r13 != r0) goto L_0x00bd
            X.GNj r0 = X.C52317GNj.A0A
            if (r14 == r0) goto L_0x00c1
            X.GNj r0 = X.C52317GNj.A0O
            if (r14 == r0) goto L_0x00c1
        L_0x00bd:
            X.GNk r0 = X.C52318GNk.ITEM_INTERACTION_WITH_NEW_SURFACE
            if (r13 != r0) goto L_0x00d3
        L_0x00c1:
            boolean r0 = r11.A07(r12)
            if (r0 != 0) goto L_0x00d3
            if (r15 != 0) goto L_0x00d3
            java.util.concurrent.atomic.AtomicReference r1 = r11.A0G
            X.0eP r0 = X.AnonymousClass7TE.A1L(r13, r14)
            r1.set(r0)
            return
        L_0x00d3:
            r9 = 0
            goto L_0x0077
        L_0x00d5:
            java.lang.String r8 = r0.A09
            goto L_0x00e3
        L_0x00d8:
            java.lang.String r8 = r0.A08
            goto L_0x00e3
        L_0x00db:
            java.lang.String r8 = r0.A07
            goto L_0x00e3
        L_0x00de:
            java.lang.String r8 = r0.A0A
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r8 = "for_media"
        L_0x00e3:
            r0 = 2
            java.lang.Integer[] r7 = X.AnonymousClass05K.A00(r0)
            int r6 = r7.length
            r3 = 0
        L_0x00ea:
            if (r3 >= r6) goto L_0x0104
            r1 = r7[r3]
            int r0 = r1.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "for_session"
        L_0x00f8:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0106
            int r3 = r3 + 1
            goto L_0x00ea
        L_0x0101:
            java.lang.String r0 = "for_media"
            goto L_0x00f8
        L_0x0104:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0106:
            if (r12 == 0) goto L_0x014d
            X.GD6 r0 = r11.A07
            X.GDe r0 = X.JSx.A00(r12, r0)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x014d
            X.3W8 r0 = r0.A3S
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != r4) goto L_0x014d
            java.util.concurrent.ConcurrentHashMap r6 = r11.A0A
            java.lang.Object r3 = X.C51968G9o.A0x(r12, r6)
            r0 = 0
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r0)
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 != 0) goto L_0x0196
            java.lang.String r3 = r11.A01(r13, r14)
            java.lang.Object r2 = X.C51968G9o.A0x(r12, r6)
            X.0eP r2 = (X.0eP) r2
            if (r2 == 0) goto L_0x013c
            java.lang.Object r0 = r2.A00
        L_0x013c:
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0196
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0149
            r5.A1I(r4)
        L_0x0149:
            r11.A09(r12, r13, r14, r1)
            return
        L_0x014d:
            int r0 = r1.intValue()
            if (r0 == r2) goto L_0x0188
            if (r0 != r4) goto L_0x0191
            if (r12 == 0) goto L_0x0196
            X.GNk r0 = X.C52318GNk.ITEM_INTERACTION
            if (r13 != r0) goto L_0x0163
            X.GNj r0 = X.C52317GNj.A0A
            if (r14 == r0) goto L_0x016d
            X.GNj r0 = X.C52317GNj.A0O
            if (r14 == r0) goto L_0x016d
        L_0x0163:
            if (r10 == 0) goto L_0x016d
            boolean r0 = r11.A07(r12)
            if (r0 != 0) goto L_0x016d
            if (r9 == 0) goto L_0x0196
        L_0x016d:
            X.GD6 r0 = r11.A07
            X.GDe r0 = X.JSx.A00(r12, r0)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x0184
            X.3W8 r0 = r0.A3S
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0184
            r11.A09(r12, r13, r14, r1)
        L_0x0184:
            r11.A03(r12)
            return
        L_0x0188:
            r5.A1I(r4)
            if (r12 == 0) goto L_0x0149
            r11.A03(r12)
            goto L_0x0149
        L_0x0191:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52018GBp.A05(X.4bN, X.GNk, X.GNj, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r0.CeS() != true) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        if (((java.lang.Boolean) r7.A0J.getValue()).booleanValue() == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06(X.C267324bN r8) {
        /*
            r7 = this;
            java.util.concurrent.ConcurrentHashMap r3 = r7.A0M
            java.lang.String r2 = r8.getId()
            java.lang.Object r0 = r3.get(r2)
            if (r0 != 0) goto L_0x003f
            X.GD6 r0 = r7.A07
            X.GBg r0 = r0.A0A
            X.GDe r1 = r0.BzC(r8)
            X.GHA r0 = r7.A08(r8)
            boolean r0 = r0.A0C
            r5 = 0
            if (r0 == 0) goto L_0x0023
            int r0 = r1.A09()
            if (r0 != 0) goto L_0x0034
        L_0x0023:
            X.0sa r0 = r7.A0P
            java.lang.Object r0 = r0.invoke()
            X.JQs r0 = (X.C59624JQs) r0
            r6 = 1
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.CRI(r8)
            if (r0 != r6) goto L_0x0049
        L_0x0034:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r0 = r3.putIfAbsent(r2, r1)
            if (r0 != 0) goto L_0x003f
            r0 = r1
        L_0x003f:
            X.0qQ.A09(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0049:
            com.instagram.clips.intf.ClipsViewerConfig r1 = r7.A0L
            boolean r0 = r1.A1n
            if (r0 != 0) goto L_0x0034
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x005c
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x005c
            goto L_0x0034
        L_0x005c:
            boolean r1 = r8.CcK()
            X.GHA r0 = r7.A08(r8)
            boolean r0 = r0.A0D
            if (r1 == 0) goto L_0x00ae
            r5 = 1
            if (r0 == 0) goto L_0x0076
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.CeS()
            r4 = 1
            if (r0 == r6) goto L_0x0077
        L_0x0076:
            r4 = 0
        L_0x0077:
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0090
            boolean r0 = r0.A5p()
            if (r0 != r6) goto L_0x0090
            X.0eM r0 = r7.A0J
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            boolean r0 = r8.A0E()
            if (r0 != 0) goto L_0x00ac
            boolean r0 = r8.A0F()
            if (r0 != 0) goto L_0x00ac
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r0.A5o()
            if (r0 != 0) goto L_0x00ac
            if (r4 != 0) goto L_0x0034
            if (r1 == 0) goto L_0x00ac
            goto L_0x0034
        L_0x00ac:
            r5 = 0
            goto L_0x0034
        L_0x00ae:
            if (r0 == 0) goto L_0x0034
            boolean r0 = X.C52076GDw.A03(r8)
            if (r0 != 0) goto L_0x0034
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52018GBp.A06(X.4bN):boolean");
    }

    public final long BXX() {
        return this.A0E.get();
    }

    public final void DhG(float f, float f2) {
        C52318GNk gNk;
        C267324bN r2 = this.A00;
        if (r2 == null) {
            return;
        }
        if ((CRr(r2) && A07(r2)) || this.A0A.get(r2.getId()) != null) {
            1Xj r1 = r2.A02;
            if (r1 != null) {
                this.A07.BQr(r1).A0i(false);
            }
            if (f > f2) {
                gNk = C52318GNk.SCROLL_DOWN;
            } else {
                gNk = C52318GNk.SCROLL_UP;
            }
            AGC(r2, gNk, C52317GNj.A0f);
        }
    }

    public final void Dzs() {
    }

    public final void EI8() {
        this.A0G.set((Object) null);
    }

    private final String A01(C52318GNk gNk, C52317GNj gNj) {
        switch (gNk.ordinal()) {
            case 0:
                return "cancel_button";
            case 1:
                return 002.A0R("interaction", A02(gNj));
            case 2:
                return 002.A0R("interaction_new_page", A02(gNj));
            case 3:
                return 002.A0R("interaction_dialog", A02(gNj));
            case 4:
                return "scroll_down";
            case 5:
                return "scroll_up";
            case 6:
                return "scrollback";
            case 7:
                return "scrub";
            default:
                throw AnonymousClass7TE.A1K();
        }
    }

    public static final String A02(C52317GNj gNj) {
        switch (gNj.ordinal()) {
            case 0:
                return "_ad_cta";
            case 1:
                return "_appreciation";
            case 2:
                return "_attr_audio";
            case 3:
                return "_attr_sponsored";
            case 4:
                return "_back";
            case 5:
                return "_boost_cta";
            case 6:
                return "_bottomsheet";
            case 7:
                return "_camera";
            case 8:
                return "_caption";
            case 9:
                return "_clips_showcase";
            case 10:
                return "_comment";
            case 11:
                return "_content_lane";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "_content_notes";
            case 13:
                return "_direct";
            case 14:
                return "_follow";
            case 15:
                return "_footer";
            case 16:
                return "_fund_raiser";
            case 17:
                return "_insights_cta";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "_insights_tip_cta";
            case 19:
                return "_join_channel";
            case 20:
                return "_like";
            case 21:
                return "_long_press";
            case 22:
                return "_long_press_fast_play";
            case 23:
                return "_media_info";
            case 24:
                return "_midscene_ad_cta";
            case 25:
                return "_more_menu";
            case 26:
                return "_header_mute";
            case 27:
                return "_overflow_attribution";
            case 28:
                return "_overlay_ad_cta";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "_overlay_ad_menu";
            case 30:
                return "_professional_cta";
            case 31:
                return AnonymousClass000.A00(2553);
            case 32:
                return "_remix_button";
            case 33:
                return "_share";
            case 34:
                return "_social_context";
            case 35:
                return "_sponsored_followed_by";
            case 36:
                return "_tap";
            case 37:
                return "_trending_audio_cta";
            case 38:
                return "_ufi";
            case 39:
                return "";
            default:
                throw AnonymousClass7TE.A1K();
        }
    }

    public final void Cmm(C267324bN r8) {
        if (!r8.CcK()) {
            long A042 = DbY.A04((Number) C51968G9o.A0x(r8, this.A0B));
            long j = A08(r8).A06;
            AnonymousClass30J r2 = AnonymousClass30J.SECONDS;
            long A032 = AnonymousClass30M.A03(AnonymousClass30K.A04(r2, j));
            long A033 = AnonymousClass30M.A03(AnonymousClass30K.A04(r2, A08(r8).A00));
            if (A042 > A032 && A042 < A032 + A033) {
                this.A0C.put(r8.getId(), Integer.valueOf(A00(r8) + 1));
            }
        }
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void Dxm(C267324bN r1, Integer num, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
