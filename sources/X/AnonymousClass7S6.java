package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.7S6  reason: invalid class name */
public final class AnonymousClass7S6 implements AnonymousClass7S7, AnonymousClass7S9, AnonymousClass7SA, C74340PtG, AnonymousClass7SB, AnonymousClass7SC {
    public AnonymousClass9IO A00;
    public 1wn A01;
    public 1wn A02;
    public C330287Me A03;
    public AnonymousClass7ZX A04;
    public AnonymousClass9HC A05;
    public AnonymousClass7Z5 A06;
    public AnonymousClass2Ep A07;
    public 2E2 A08;
    public String A09;
    public C330297Mf A0A;
    public AnonymousClass7S4 A0B;
    public AnonymousClass7BO A0C;
    public C254773t1 A0D;
    public boolean A0E;
    public boolean A0F = false;
    public final UserSession A0G;
    public final Capabilities A0H;
    public final C330437Mt A0I;
    public final AnonymousClass7US A0J;
    public final AnonymousClass7TS A0K;
    public final AnonymousClass7TR A0L;
    public final C331787Sj A0M;
    public final C331717Sc A0N;
    public final 2Dm A0O;
    public final 1wn A0P = new AnonymousClass7Z1(this);
    public final 1wn A0Q = new AnonymousClass7Z2(this);
    public final 1wn A0R = new AnonymousClass7Z3(this);
    public final 1wn A0S = new AnonymousClass7Z0(this);
    public final AnonymousClass1aS A0T = 1aF.A00();
    public final AnonymousClass1aS A0U = 1aF.A00();
    public final 1a8 A0V = new 1a8(C318146oT.A01);
    public final AnonymousClass7Z4 A0W;
    public final C333427Yx A0X;
    public final C333447Yz A0Y = new C333447Yz(this);
    public final C331797Sk A0Z;
    public final AnonymousClass9HO A0a;
    public final AnonymousClass7SH A0b;
    public final C331617Rr A0c;
    public final C331717Sc A0d;
    public final String A0e;
    public final String A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;

    public static void A05(AnonymousClass7S6 r6, AnonymousClass2Ep r7) {
        AnonymousClass2Ep r3 = r7;
        if (r7 != null && r7.C6C() != null) {
            AnonymousClass7SD A002 = AnonymousClass7S4.A02.A00(r6.A0G, r6.A05, r3, new C254763t0(r7.C6C()), false);
            AnonymousClass1aS r1 = r6.A0U;
            if (!2PP.A00(A002, r1.A0X())) {
                r1.accept(A002);
            }
        }
    }

    private void A0A(boolean z) {
        AnonymousClass7BO r4;
        1bO A002 = 1bO.A00(this.A0G);
        boolean A0G2 = A0G(z);
        String str = this.A09;
        if (str != null) {
            C330437Mt r42 = this.A0I;
            if (r42 == null || !r42.A03()) {
                r4 = A002.A08(ThreadFetchReason.INITIAL_SNAPSHOT, this, str, true);
                this.A0C = r4;
            } else {
                r42.A02();
            }
        } else {
            AnonymousClass2Ep r0 = this.A07;
            if (r0 != null && r0.CQ2() && !AnonymousClass48O.A06(Integer.valueOf(this.A07.C6a()))) {
                List BRZ = this.A07.BRZ();
                ThreadFetchReason threadFetchReason = ThreadFetchReason.INITIAL_SNAPSHOT;
                ArrayList A003 = DirectThreadKey.A00(BRZ);
                Collections.sort(A003);
                r4 = new AnonymousClass7BO(threadFetchReason, (C74340PtG) this, A002, (Boolean) false, (List) A003);
                r4.A03();
                this.A0C = r4;
            } else {
                return;
            }
        }
        this.A06 = new AnonymousClass7Z5(this.A06.A02, true, false, A0G2);
    }

    public final Integer BA1() {
        return 0;
    }

    public final Capabilities BN2() {
        return null;
    }

    public final C254763t0 BN3() {
        return null;
    }

    public final C70465O7q CgJ(C70607ODe oDe, String str) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r1 = X.AnonymousClass4k9.A00(r10.A0G).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D6x() {
        /*
            r10 = this;
            r6 = r10
            X.7Sj r3 = r10.A0M
            r3.A02(r10)
            X.2Ep r0 = r10.A07
            if (r0 == 0) goto L_0x003c
            int r0 = r0.C6a()
            boolean r0 = X.AnonymousClass48O.A01(r0)
            if (r0 == 0) goto L_0x003c
            X.2Ep r0 = r10.A07
            int r1 = r0.BHS()
            r0 = 8
            if (r1 == r0) goto L_0x003c
            com.instagram.common.session.UserSession r0 = r10.A0G
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            X.0xa r1 = r0.A00
            java.lang.String r4 = "discoverable_chats_open_count"
            r0 = 0
            int r2 = r1.getInt(r4, r0)
            r0 = 2
            if (r2 >= r0) goto L_0x003c
            X.0xY r1 = r1.AR4()
            int r0 = r2 + 1
            r1.E5Z(r4, r0)
            r1.apply()
        L_0x003c:
            com.instagram.common.session.UserSession r5 = r10.A0G
            X.2Ep r0 = r10.A07
            if (r0 == 0) goto L_0x00c3
            r0 = 1
            X.3SZ r8 = r10.BrG(r0)
        L_0x0047:
            X.7Sc r9 = r10.A0d
            X.7Me r4 = new X.7Me
            r7 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A03 = r4
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 40
            X.PlY r1 = new X.PlY
            r1.<init>(r5, r0)
            java.lang.Class<X.7Mf> r0 = X.C330297Mf.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.7Mf r1 = (X.C330297Mf) r1
            X.7ZX r0 = r10.A04
            r1.A00 = r0
            r10.A0A = r1
            X.2Ep r0 = r10.A07
            if (r0 == 0) goto L_0x0078
            X.7Mt r0 = r10.A0I
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0079
        L_0x0078:
            return
        L_0x0079:
            java.lang.Boolean r0 = X.AnonymousClass7D0.A00(r5)
            boolean r0 = r0.booleanValue()
            X.0Tu r2 = X.0Tu.A05
            if (r0 == 0) goto L_0x009e
            r0 = 36318058774402892(0x810715002e174c, double:3.031024837792392E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0078
            X.2Ep r0 = r10.A07
            com.instagram.model.direct.DirectThreadKey r1 = r0.BJy()
            X.7SD r0 = r10.C6Q()
            r3.A03(r0, r1)
            return
        L_0x009e:
            r0 = 36318058771715895(0x81071500051737, double:3.031024836093124E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0078
            X.7Me r3 = r10.A03
            X.7SD r2 = r10.C6Q()
            X.2Ep r0 = r10.A07
            com.instagram.model.direct.DirectThreadKey r0 = r0.BJy()
            X.PaO r1 = new X.PaO
            r1.<init>(r3, r2, r0)
            java.util.concurrent.ExecutorService r0 = r3.A0C
            r0.execute(r1)
            r9.Evo()
            return
        L_0x00c3:
            r8 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S6.D6x():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r0.CKK() != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r1.A03 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (X.182.A06(X.0Tu.A05, r3.A0G, 36331162716619695L) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010b, code lost:
        if (r3.A0M.A0H != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dva(X.AnonymousClass7SD r23, java.lang.Integer r24, java.util.List r25, java.util.List r26, java.util.List r27) {
        /*
            r22 = this;
            r2 = 1
            r3 = r22
            r15 = r25
            if (r25 == 0) goto L_0x010f
            int r0 = r15.size()
            if (r0 != r2) goto L_0x010f
            r1 = 0
            java.lang.Object r0 = r15.get(r1)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r0 = r0.A0e
            java.lang.String r0 = r0.A0f()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r15.get(r1)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r0 = r0.A0e
            java.lang.String r0 = r0.A0f()
            int r0 = r0.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.instagram.common.session.UserSession r0 = r3.A0G
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r6 = X.C328727Fx.A00(r0, r1)
            if (r6 == 0) goto L_0x003e
            r6.onLogDataProcessingEnd()
            r6.onLogRenderStart()
        L_0x003e:
            X.7TR r0 = r3.A0L
            X.7TI r0 = r0.A00
            X.7Tw r0 = r0.A0j
            X.7Ty r0 = r0.A0O
            boolean r0 = r0.CXh()
            X.7ZX r7 = r3.A04
            X.7US r8 = r3.A0J
            java.lang.String r14 = r3.C6C()
            X.74d r10 = r3.A00(r0)
            if (r0 != 0) goto L_0x0064
            X.2Ep r0 = r3.A07
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.CKK()
            r18 = 1
            if (r0 == 0) goto L_0x0066
        L_0x0064:
            r18 = 0
        L_0x0066:
            X.2Ep r0 = r3.A07
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.CKK()
            if (r0 != 0) goto L_0x007c
            X.7Z5 r1 = r3.A06
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x007c
            boolean r0 = r1.A03
            r19 = 1
            if (r0 == 0) goto L_0x007e
        L_0x007c:
            r19 = 0
        L_0x007e:
            X.7Me r0 = r3.A03
            if (r0 == 0) goto L_0x0105
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0105
        L_0x0086:
            r20 = 1
        L_0x0088:
            X.2Ep r0 = r3.A07
            if (r0 == 0) goto L_0x009d
            com.instagram.common.session.UserSession r5 = r3.A0G
            X.0Tu r4 = X.0Tu.A05
            r0 = 36331162716619695(0x811300000043af, double:3.039311823615638E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r21 = 1
            if (r0 != 0) goto L_0x009f
        L_0x009d:
            r21 = 0
        L_0x009f:
            X.7Ei r11 = r3.CC6()
            X.7Yz r9 = r3.A0Y
            r12 = r23
            r13 = r24
            r16 = r26
            r17 = r27
            r7.A0U(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r25 == 0) goto L_0x00bd
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x00bd
            X.7ZX r0 = r3.A04
            r0.EEb()
        L_0x00bd:
            X.0sa r0 = r8.A0E
            r0.invoke()
            X.2Ep r5 = r3.A07
            if (r5 == 0) goto L_0x00d3
            X.7Yx r4 = r3.A0X
            X.2Ep r1 = r4.A01
            r0 = 0
            if (r1 != 0) goto L_0x00ce
            r0 = 1
        L_0x00ce:
            r4.A01 = r5
            X.C333427Yx.A01(r4, r0)
        L_0x00d3:
            boolean r0 = r3.A0B()
            if (r0 == 0) goto L_0x00e6
            if (r6 == 0) goto L_0x00de
            r6.onLogFetchMessageHistoryFromServerStart()
        L_0x00de:
            r3.CgQ()
            if (r6 == 0) goto L_0x00e6
            r6.onLogFetchMessageHistoryFromServerEnd()
        L_0x00e6:
            X.4DH r0 = r8.A00
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x00fb
            X.0sa r0 = r8.A09
            java.lang.Object r0 = r0.invoke()
            X.7Nb r0 = (X.C330497Nb) r0
            if (r0 == 0) goto L_0x00fb
            r0.A00(r2)
        L_0x00fb:
            if (r25 == 0) goto L_0x0104
            X.7Mf r0 = r3.A0A
            if (r0 == 0) goto L_0x0104
            r0.A01(r15)
        L_0x0104:
            return
        L_0x0105:
            X.7Sj r0 = r3.A0M
            boolean r0 = r0.A0H
            r20 = 0
            if (r0 == 0) goto L_0x0088
            goto L_0x0086
        L_0x010f:
            r6 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S6.Dva(X.7SD, java.lang.Integer, java.util.List, java.util.List, java.util.List):void");
    }

    public final boolean EsR() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (X.2PP.A00(r10.C6C(), r3) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        A06(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        r0 = r11.BJy();
        r3 = r9.A00;
        X.AnonymousClass7TI.A0B(r3, r0);
        r2 = r3.A0i;
        r1 = ((X.C332637Vu) r2.A0O.getValue()).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r1 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        r1.A04(new X.C388819oR(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        if (r3.A0U.isResumed() == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if (r5 == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        ((X.AnonymousClass7WL) r2.A0k.getValue()).A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cc, code lost:
        r0 = r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        if (r0 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        X.0qQ.A0F("clientInfra");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        if (r1 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        r0.AvL().EIQ(false);
        r1 = r3.A0j;
        r1.A0L.A00();
        r3.A0Q();
        r1.A0C.A02((X.AnonymousClass7LZ) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        r2 = r10.A0X;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fd, code lost:
        if (r2.A01 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ff, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0100, code lost:
        r2.A01 = r11;
        X.C333427Yx.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass7US r8, X.AnonymousClass7TS r9, X.AnonymousClass7S6 r10, X.AnonymousClass2Ep r11) {
        /*
            if (r11 == 0) goto L_0x0105
            X.2Ep r0 = r10.A07
            boolean r0 = X.2PP.A00(r0, r11)
            if (r0 != 0) goto L_0x0105
            r10.A07 = r11
            X.3Tu r0 = r11.AiM()
            if (r0 == 0) goto L_0x0017
            X.2Ep r0 = r10.A07
            r0.AiM()
        L_0x0017:
            X.1aS r1 = r10.A0T
            r5 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.accept(r0)
            X.7Mt r1 = r10.A0I
            if (r1 == 0) goto L_0x0036
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x0036
            X.3sy r0 = r1.A05
            if (r0 != 0) goto L_0x0036
            com.instagram.model.direct.DirectThreadKey r0 = r11.BJy()
            r1.A05 = r0
            r1.A02()
        L_0x0036:
            X.7US r6 = r10.A0J
            X.0sa r0 = r6.A0A
            r0.invoke()
            X.0sa r0 = r6.A0L
            r0.invoke()
            X.0sa r0 = r8.A0D
            r0.invoke()
            r4 = 0
            r10.A0E = r4
            java.lang.String r3 = r11.C6C()
            X.7ZX r0 = r10.A04
            if (r0 == 0) goto L_0x0085
            r7 = 0
            if (r3 == 0) goto L_0x00de
            X.3t0 r8 = new X.3t0
            r8.<init>(r3)
        L_0x005a:
            X.7ZX r1 = r10.A04
            X.3SZ r0 = r10.BrG(r5)
            r1.EjZ(r0)
            X.7ZX r2 = r10.A04
            X.3SZ r1 = r10.BrG(r5)
            X.3SZ r0 = r10.BrG(r4)
            r2.Eja(r1, r0, r8)
            X.7ZX r2 = r10.A04
            boolean r1 = r11.CUG()
            r0 = 0
            if (r1 != 0) goto L_0x007a
            r0 = 1
        L_0x007a:
            r0 = r0 ^ 1
            r2.A0a = r0
            X.7SD r0 = r10.C6Q()
            r6.A03(r0, r7, r4)
        L_0x0085:
            java.lang.String r0 = r10.A09
            r1 = 0
            if (r0 != 0) goto L_0x00da
            r1 = 1
            java.lang.String r0 = r10.C6C()
            boolean r0 = X.2PP.A00(r0, r3)
            if (r0 != 0) goto L_0x00da
        L_0x0095:
            A06(r10, r3)
        L_0x0098:
            com.instagram.model.direct.DirectThreadKey r0 = r11.BJy()
            X.7TI r3 = r9.A00
            X.AnonymousClass7TI.A0B(r3, r0)
            X.7Ue r2 = r3.A0i
            X.0eM r0 = r2.A0O
            java.lang.Object r0 = r0.getValue()
            X.7Vu r0 = (X.C332637Vu) r0
            X.7FA r1 = r0.A02
            if (r1 == 0) goto L_0x00b7
            X.9oR r0 = new X.9oR
            r0.<init>(r11)
            r1.A04(r0)
        L_0x00b7:
            X.4DH r0 = r3.A0U
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x00f8
            if (r5 == 0) goto L_0x00cc
            X.0eM r0 = r2.A0k
            java.lang.Object r0 = r0.getValue()
            X.7WL r0 = (X.AnonymousClass7WL) r0
            r0.A01()
        L_0x00cc:
            X.7Zg r0 = r3.A08
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "clientInfra"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00da:
            r5 = 0
            if (r1 == 0) goto L_0x0098
            goto L_0x0095
        L_0x00de:
            r8 = r7
            goto L_0x005a
        L_0x00e1:
            X.7S9 r0 = r0.AvL()
            r0.EIQ(r4)
            X.7Tw r1 = r3.A0j
            X.7U9 r0 = r1.A0L
            r0.A00()
            r3.A0Q()
            X.7UW r1 = r1.A0C
            r0 = 0
            r1.A02(r0)
        L_0x00f8:
            X.7Yx r2 = r10.A0X
            X.2Ep r1 = r2.A01
            r0 = 0
            if (r1 != 0) goto L_0x0100
            r0 = 1
        L_0x0100:
            r2.A01 = r11
            X.C333427Yx.A01(r2, r0)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S6.A02(X.7US, X.7TS, X.7S6, X.2Ep):void");
    }

    public static void A03(AnonymousClass7S6 r4) {
        UserSession userSession = r4.A0G;
        if (182.A06(0Tu.A05, userSession, 36330136219435484L) && r4.A01 != null) {
            AnonymousClass1Nd.A00(userSession).A02(r4.A01, AnonymousClass2KZ.class);
        }
    }

    public static void A04(AnonymousClass7S6 r4) {
        UserSession userSession = r4.A0G;
        if (182.A06(0Tu.A05, userSession, 36330136219501021L) && r4.A02 != null) {
            AnonymousClass1Nd.A00(userSession).A02(r4.A02, AnonymousClass43K.class);
        }
    }

    public static void A06(AnonymousClass7S6 r2, String str) {
        if (!2PP.A00(r2.A09, str)) {
            r2.A09 = str;
            AnonymousClass2Ep r1 = r2.A07;
            if (r1 != null) {
                2Dr.A00(r1, r2.A0O).A0D(str);
            }
        }
    }

    private void A09(String str, List list) {
        AnonymousClass3U9 BYg;
        if (this.A07 == null) {
            2Dr r2 = this.A0O;
            String str2 = this.A0f;
            if (str != null) {
                BYg = r2.A0N(str);
            } else if (list != null) {
                BYg = r2.BYg((CreatorBroadcastThreadInfo) null, (String) null, str2, list);
            } else {
                throw new IllegalArgumentException("At least one of threadId or recipients must be non-null");
            }
            if (BYg != null) {
                A02(this.A0J, this.A0K, this, BYg);
                A05(this, BYg);
                UserSession userSession = this.A0G;
                0qQ.A0B(userSession, 1);
                if (182.A06(0Tu.A05, userSession, 36317564850148701L)) {
                    Boolean BIx = BYg.BIx();
                    0qQ.A07(BIx);
                    boolean booleanValue = BIx.booleanValue();
                    boolean z = false;
                    if (BYg.BKv() == null) {
                        z = true;
                    }
                    if (booleanValue && z && BYg.BRZ().size() == 1) {
                        boolean z2 = false;
                        if (BYg.C6C() != null) {
                            z2 = true;
                        }
                        2Dm A002 = 1bJ.A00(userSession);
                        if (z2) {
                            String id = ((User) BYg.BRZ().get(0)).getId();
                            1NY r22 = new 1NY(userSession, -2);
                            r22.A05();
                            r22.A0A("direct_v2/icebreakers/get_suggested_icebreakers/");
                            r22.A9m("professional_id", id);
                            r22.A0Q(NGq.class, C70848OOb.class);
                            1OC A0M2 = r22.A0M();
                            A0M2.A00 = new C68517NLo(BYg, A002);
                            1ES.A01().schedule(A0M2, A0M2.getRunnableId(), 3, true, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.A0J.A0B.invoke();
        }
    }

    private boolean A0B() {
        int i;
        int itemCount = this.A04.getItemCount() - 1;
        MessageListLayoutManager messageListLayoutManager = this.A0L.A00.A0B;
        if (messageListLayoutManager != null) {
            i = messageListLayoutManager.A1b();
        } else {
            i = -1;
        }
        if (((long) (itemCount - i)) > 182.A01(0Tu.A05, this.A0G, 36604511615194171L)) {
            return false;
        }
        return true;
    }

    /* renamed from: A0C */
    public final DirectThreadKey B8S() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 != null) {
            return r0.BJy();
        }
        throw new IllegalStateException(C66579MXk.A00(945));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean A0D(java.lang.String r3) {
        /*
            r2 = this;
            X.2Dm r1 = r2.A0O
            com.instagram.model.direct.DirectThreadKey r0 = r2.B8S()
            X.3su r0 = r1.BRz(r0, r3)
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A1S()
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S6.A0D(java.lang.String):java.lang.Boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: A0F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dlb(X.AnonymousClass7BO r6) {
        /*
            r5 = this;
            X.7BO r0 = r5.A0C
            if (r0 != r6) goto L_0x00a4
            r1 = 0
            r5.A0C = r1
            X.2Ep r0 = r5.A07
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = r6.A02
            r5.A09(r0, r1)
        L_0x0010:
            X.2Ep r0 = r5.A07
            if (r0 == 0) goto L_0x001b
            X.7Sc r1 = r5.A0N
            java.lang.String r0 = "THREAD_FETCHED_FROM_NETWORK"
            r1.Eyv(r0)
        L_0x001b:
            X.7ZX r3 = r5.A04
            X.0mo r0 = r3.A0R()
            int r2 = r0.A01
        L_0x0023:
            int r2 = r2 + -1
            r0 = -1
            if (r0 >= r2) goto L_0x00bd
            X.0mo r0 = r3.A0R()
            java.lang.Object r1 = r0.A05(r2)
            X.0qQ.A07(r1)
            X.7So r1 = (X.C331837So) r1
            boolean r0 = r1 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x0023
            X.7LQ r1 = (X.AnonymousClass7LQ) r1
            long r0 = r1.A07
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x0041:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x00a5
            X.6BH r1 = r6.A00
            r0 = 0
            if (r1 == 0) goto L_0x004b
            r0 = 1
        L_0x004b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r5.A0F = r0
            X.7Z4 r3 = r5.A0W
            X.65E r0 = r3.A01
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36315949950897972(0x81052a00810f34, double:3.02969120931633E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)
            if (r0 == 0) goto L_0x007f
            r3.A09()
            int r1 = r3.A00
        L_0x006b:
            java.lang.String r0 = "NUMBER_OF_SCROLLS"
            r3.A0C(r0, r1)
            if (r4 == 0) goto L_0x007f
            long r0 = r4.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "OLDEST_MESSAGE_TIMESTAMP"
            r3.A0D(r0, r1)
        L_0x007f:
            X.7Z5 r0 = r5.A06
            boolean r3 = r0.A02
            r2 = 0
            boolean r0 = r6.A03
            r1 = r0 ^ 1
            X.7TR r0 = r5.A0L
            X.7TI r0 = r0.A00
            X.7Tw r0 = r0.A0j
            X.7Ty r0 = r0.A0O
            boolean r0 = r0.CXh()
            boolean r0 = r5.A0G(r0)
            A08(r5, r3, r2, r1, r0)
            boolean r0 = r5.A0B()
            if (r0 == 0) goto L_0x00a4
            r5.CgQ()
        L_0x00a4:
            return
        L_0x00a5:
            X.7Z4 r3 = r5.A0W
            X.65E r0 = r3.A01
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36315949950897972(0x81052a00810f34, double:3.02969120931633E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)
            if (r0 == 0) goto L_0x007f
            int r0 = r3.A00
            int r1 = r0 + 1
            r3.A00 = r1
            goto L_0x006b
        L_0x00bd:
            r4 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S6.Dlb(X.7BO):void");
    }

    public final boolean A0G(boolean z) {
        boolean z2;
        AnonymousClass2Ep r2 = this.A07;
        if (r2 == null) {
            return true;
        }
        if (z) {
            AnonymousClass3U9 r22 = (AnonymousClass3U9) r2;
            if (((Boolean) r22.A05.getValue()).booleanValue()) {
                ReentrantReadWriteLock.ReadLock readLock = r22.A03.readLock();
                readLock.lock();
                try {
                    z2 = r22.A01.A2M;
                } finally {
                    readLock.unlock();
                }
            } else {
                AnonymousClass3S9 r1 = r22.A01;
                synchronized (r1) {
                    z2 = r1.A2M;
                }
            }
            if (z2) {
                return true;
            }
            return false;
        } else if (!r2.CKK()) {
            return false;
        } else {
            return true;
        }
    }

    public final AnonymousClass7LZ AYK(Context context, C329967Kx r22, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        UserSession userSession = this.A0G;
        Capabilities capabilities = this.A0H;
        AnonymousClass2Ep r6 = this.A07;
        r6.getClass();
        boolean EtG = EtG();
        boolean z6 = this.A0h;
        AnonymousClass2Ep r0 = this.A07;
        boolean z7 = false;
        if (r0 != null && !r0.CUG() && BRZ().size() == 1 && ((User) BRZ().get(0)).A2R()) {
            z7 = true;
        }
        boolean z8 = this.A04.A0T;
        boolean z9 = this.A0g;
        boolean z10 = this.A0i;
        return C327837Cj.A00(context, userSession, capabilities, r22, r6, this.A0e, i, EtG, z6, z, z7, z8, z2, z9, z10, z3, z4, z5);
    }

    public final int AdN() {
        C242243Te r0;
        AnonymousClass2Ep r02 = this.A07;
        if (r02 == null || (r0 = ((AnonymousClass3U9) r02).A01.A0s) == null) {
            return 0;
        }
        return r0.A00;
    }

    public final AnonymousClass34S AeX() {
        UserSession userSession = this.A0G;
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        return AnonymousClass48N.A00(userSession, r0);
    }

    public final /* bridge */ /* synthetic */ C254743sy AfV() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 != null) {
            return r0.BJy();
        }
        String str = this.A09;
        if (str != null) {
            return new DirectThreadKey(str, (List) null);
        }
        return null;
    }

    public final Capabilities AlE() {
        return this.A0H;
    }

    public final List AxI() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null) {
            return null;
        }
        return r0.AxI();
    }

    public final 1aU BJJ() {
        return this.A0T.A0D();
    }

    public final int BRT() {
        AnonymousClass2Ep r2 = this.A07;
        r2.getClass();
        if (r2.C6a() != 29) {
            return r2.BRZ().size() + 1;
        }
        C242243Te r0 = ((AnonymousClass3U9) this.A07).A01.A0s;
        r0.getClass();
        return r0.A02;
    }

    public final List BRZ() {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        return r0.BRZ();
    }

    public final AnonymousClass7LQ BSO(String str) {
        AnonymousClass7ZX r0 = this.A04;
        if (r0 == null) {
            return null;
        }
        return r0.BSO(str);
    }

    public final AnonymousClass170 BY7() {
        return AnonymousClass48N.A05(this.A07);
    }

    public final String BY8() {
        return AnonymousClass48N.A09(this.A07);
    }

    public final String BiB() {
        C242243Te r0;
        AnonymousClass2Ep r02 = this.A07;
        if (r02 == null || (r0 = ((AnonymousClass3U9) r02).A01.A0s) == null) {
            return null;
        }
        return r0.A07;
    }

    public final C242243Te BiC() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 != null) {
            return ((AnonymousClass3U9) r0).A01.A0s;
        }
        return null;
    }

    public final AnonymousClass3SZ BrG(boolean z) {
        UserSession userSession = this.A0G;
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        return AnonymousClass48N.A02(userSession, r0, z);
    }

    public final 2EN C3d() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 != null) {
            return r0.C3d();
        }
        return null;
    }

    public final int C68(boolean z) {
        AnonymousClass2Ep r0;
        if (!z || (r0 = this.A07) == null) {
            return -1;
        }
        return r0.B6d();
    }

    public final String C6C() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null) {
            return this.A09;
        }
        return r0.C6C();
    }

    public final String C6G() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null || r0.BIt() == null) {
            return null;
        }
        return this.A07.BIt().getId();
    }

    public final String C6H() {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        User BIt = r0.BIt();
        if (BIt != null) {
            return BIt.getUsername();
        }
        return null;
    }

    public final List C6O() {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        return r0.BRV();
    }

    public final AnonymousClass7SD C6Q() {
        return this.A0B.A00(this.A07, this.A09, EtG());
    }

    public final 1aU C6S() {
        return this.A0U.A0D();
    }

    public final DirectShareTarget C6Z(Context context) {
        this.A07.getClass();
        UserSession userSession = this.A0G;
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        AnonymousClass2Ep r1 = this.A07;
        0qQ.A0B(r1, 0);
        String A072 = AnonymousClass48N.A07(context, userSession, r1);
        0qQ.A07(A072);
        ArrayList A012 = AnonymousClass48M.A01(r1.BRZ());
        return new DirectShareTarget(C66662MaV.A00(r1.C6C(), A012), A072, A012, r1.CQ2());
    }

    public final DirectThreadThemeInfo C6d() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null) {
            return null;
        }
        return r0.C5v();
    }

    public final String C6f() {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        return r0.C6f();
    }

    public final Map C6i() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null) {
            return null;
        }
        return r0.C6h();
    }

    public final String C6k() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 != null) {
            return r0.C6k();
        }
        return null;
    }

    public final C328317Ei CC6() {
        C328307Eh r4;
        C254703su r6;
        Set<C2611648n> set;
        boolean z = false;
        if (this.A07 != null) {
            z = true;
        }
        if (z) {
            AnonymousClass7SD C6Q = C6Q();
            2Dr r7 = this.A0O;
            DirectThreadKey A0C2 = B8S();
            2Dr r72 = r7;
            synchronized (r72) {
                AnonymousClass48S A0P2 = r72.A0P(A0C2);
                if (A0P2 != null) {
                    synchronized (A0P2) {
                        List A052 = AnonymousClass48S.A05(A0P2);
                        1UV r13 = A0P2.A0D;
                        r6 = (C254703su) AnonymousClass3S1.A01(r13, A052);
                        List<C254703su> list = A0P2.A0L;
                        C254703su r9 = (C254703su) AnonymousClass3S1.A01(r13, list);
                        if (r9 != null) {
                            for (C254703su r10 : list) {
                                if (r10.C7c() > r9.C7c() && r13.apply(r10)) {
                                    r9 = r10;
                                }
                            }
                            if (r6 != null) {
                                Comparator comparator = AnonymousClass48U.A05;
                                0qQ.A0B(comparator, 2);
                                if (comparator.compare(r9, r6) < 0) {
                                    r9 = r6;
                                }
                                r6 = r9;
                            } else {
                                r6 = null;
                            }
                        }
                    }
                } else {
                    r6 = null;
                }
            }
            int i = C6Q.A08;
            r4 = null;
            if (i != 29 && i != 62 && i != 61) {
                AnonymousClass2Ep r2 = this.A07;
                if (r2 != null) {
                    ArrayList arrayList = new ArrayList();
                    AnonymousClass3U9 r22 = (AnonymousClass3U9) r2;
                    if (((Boolean) r22.A05.getValue()).booleanValue()) {
                        ReentrantReadWriteLock.ReadLock readLock = r22.A03.readLock();
                        readLock.lock();
                        try {
                            set = r22.A01.A2G;
                        } finally {
                            readLock.unlock();
                        }
                    } else {
                        AnonymousClass3S9 r1 = r22.A01;
                        synchronized (r1) {
                            set = r1.A2G;
                        }
                    }
                    if (set != null) {
                        for (C2611648n r14 : set) {
                            long j = r14.A00;
                            UserSession userSession = this.A0G;
                            AnonymousClass2Ep r92 = this.A07;
                            Set<String> set2 = r14.A02;
                            HashSet hashSet = new HashSet();
                            HashMap CCo = r92.CCo();
                            for (String str : set2) {
                                User CCf = r92.CCf(str);
                                if (CCf == null) {
                                    CCf = 17h.A00(userSession).A02(str);
                                }
                                C241953Sa r0 = (C241953Sa) CCo.get(str);
                                if (!(CCf == null || r0 == null)) {
                                    hashSet.add(new C376659Iv(CCf.Bh3(), AnonymousClass50n.A08(CCf), r0.A00));
                                }
                            }
                            arrayList.add(new C3255873f(r14.A01, hashSet, j));
                        }
                        r4 = new C328297Eg(arrayList);
                    }
                }
            } else if (!(r6 == null || r6.A0g() == null || (i == 29 && C6Q.A0s && ((Boolean) this.A05.A1M.getValue()).booleanValue()))) {
                int i2 = C6Q.A06;
                String A0g2 = r6.A0g();
                long C7c = r6.C7c();
                r6.A0D();
                if (r6.A1P != null) {
                    r6.C7c();
                }
                r4 = new C68882NaK(i2, A0g2, C7c);
            }
        } else {
            r4 = null;
        }
        return new C328317Ei(r4, (String) null, false);
    }

    public final boolean CKz(String str) {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        if (r0.CCf(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean COR(String str) {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        return r0.AZs().contains(str);
    }

    public final boolean COb() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null || !r0.COb()) {
            return false;
        }
        return true;
    }

    public final boolean CQm() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null || !r0.CQq()) {
            return false;
        }
        return true;
    }

    public final boolean CRx() {
        AnonymousClass2Ep r1 = this.A07;
        Capabilities capabilities = this.A0H;
        UserSession userSession = this.A0G;
        if (!C66642MaB.A00(userSession, capabilities, r1)) {
            if (!C308556Us.A0B(userSession, C6Q(), C6c() instanceof C254773t1)) {
                return false;
            }
        }
        C330437Mt r0 = this.A0I;
        if (r0 == null || !r0.A03()) {
            return true;
        }
        return false;
    }

    public final boolean CSK() {
        AnonymousClass2Ep r2 = this.A07;
        if (!C66642MaB.A00(this.A0G, this.A0H, r2)) {
            return false;
        }
        C330437Mt r0 = this.A0I;
        if (r0 == null || !r0.A03()) {
            return true;
        }
        return false;
    }

    public final boolean CTo() {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        if (r0.C6M() != 1) {
            return false;
        }
        return true;
    }

    public final boolean CUO() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null || !r0.CUG()) {
            return false;
        }
        return true;
    }

    public final boolean CV8() {
        if (this.A07 != null) {
            if (!C66640Ma9.A06(this.A07.BRZ(), CZ0(), this.A07.CUG())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean CVE() {
        AnonymousClass2Ep r0;
        if (!this.A0H.A00(C376179Gx.SHH_MODE) || (r0 = this.A07) == null || !r0.CVE()) {
            return false;
        }
        return true;
    }

    public final boolean CVO() {
        return this.A0F;
    }

    public final boolean CVr() {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        return r0.CVr();
    }

    public final boolean CWb() {
        AnonymousClass2Ep r0;
        if (this.A09 == null && (r0 = this.A07) != null && r0.C6C() == null) {
            return true;
        }
        return false;
    }

    public final boolean CWp() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null || !r0.CWp()) {
            return false;
        }
        return true;
    }

    public final boolean CXj(String str) {
        AnonymousClass2Ep r0 = this.A07;
        r0.getClass();
        List BJl = r0.BJl();
        if (BJl == null || !BJl.contains(str)) {
            return false;
        }
        return true;
    }

    public final boolean CYS() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null || !C66641MaA.A00(r0)) {
            return false;
        }
        return true;
    }

    public final boolean CZ0() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null || !r0.isPending()) {
            return false;
        }
        return true;
    }

    public final boolean CZ1() {
        C242243Te r0;
        AnonymousClass2Ep r02 = this.A07;
        if (r02 == null || (r0 = ((AnonymousClass3U9) r02).A01.A0s) == null) {
            return false;
        }
        return r0.A0N;
    }

    public final boolean CcG() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null || !r0.CcG()) {
            return false;
        }
        return true;
    }

    public final boolean CdE() {
        if (this.A07 != null) {
            return true;
        }
        return false;
    }

    public final boolean CdK() {
        this.A07.getClass();
        return C66640Ma9.A05(this.A07.BRZ(), CUO());
    }

    public final boolean Cdt() {
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null) {
            return false;
        }
        if (r0.CWp() || this.A07.CKx() || this.A07.CKu() || this.A07.CKv()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4 == -1) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        if (r5.A0M.A0H != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CgQ() {
        /*
            r5 = this;
            X.7TR r3 = r5.A0L
            X.7TI r2 = r3.A00
            com.instagram.direct.messagethread.store.intf.MessageListLayoutManager r0 = r2.A0B
            if (r0 == 0) goto L_0x0057
            int r4 = r0.A1b()
        L_0x000c:
            X.7Z5 r1 = r5.A06
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x001e
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x001e
            X.7Me r0 = r5.A03
            if (r0 == 0) goto L_0x004f
            int r0 = r0.A00
            if (r0 == 0) goto L_0x004f
        L_0x001e:
            r1 = 0
        L_0x001f:
            X.4DH r0 = r2.A0U
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x002b
            r0 = -1
            r2 = 1
            if (r4 != r0) goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x004e
            X.7Z5 r1 = r5.A06
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x004e
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x004e
            X.7ZX r0 = r5.A04
            if (r0 == 0) goto L_0x004e
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x004e
            if (r2 == 0) goto L_0x004e
            X.7Mt r0 = r5.A0I
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0059
        L_0x004e:
            return
        L_0x004f:
            X.7Sj r0 = r5.A0M
            boolean r0 = r0.A0H
            r1 = 1
            if (r0 == 0) goto L_0x001f
            goto L_0x001e
        L_0x0057:
            r4 = -1
            goto L_0x000c
        L_0x0059:
            X.74U r0 = new X.74U
            r0.<init>()
            r5.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S6.CgQ():void");
    }

    public final AnonymousClass2Ep Cms() {
        return this.A07;
    }

    public final void D6W(C254783t2 r9) {
        C291175gg r1;
        List list;
        0fh.A01("DirectThreadViewDataLoader.onCreate", -1870939497);
        try {
            C254773t1 A012 = AnonymousClass6W3.A01(r9);
            this.A0D = A012;
            DirectThreadKey A013 = AnonymousClass6W4.A01(A012);
            C254773t1 r12 = this.A0D;
            0qQ.A0B(r12, 0);
            if (r12 instanceof C291175gg) {
                r1 = (C291175gg) r12;
            } else {
                r1 = null;
            }
            String str = A013.A00;
            if (r1 != null) {
                list = r1.A00;
            } else {
                list = null;
            }
            A06(this, str);
            2E2 r13 = this.A08;
            AnonymousClass9IO A002 = 2E2.A00(r13, AnonymousClass05K.A01);
            r13.A00.markerAnnotate(78266157, A002.A02, "request_data_type", "MESSAGE_LIST");
            this.A00 = A002;
            UserSession userSession = this.A0G;
            0Tu r7 = 0Tu.A05;
            boolean A062 = 182.A06(r7, userSession, 36330136219435484L);
            if (A062) {
                this.A01 = new C71927OtB(this, list);
                AnonymousClass1Nd.A00(userSession).A01(this.A01, AnonymousClass2KZ.class);
            }
            if (182.A06(r7, userSession, 36330136219501021L)) {
                this.A02 = new C71926OtA(this, list);
                AnonymousClass1Nd.A00(userSession).A01(this.A02, AnonymousClass43K.class);
            }
            1bC r14 = this.A0O.A0H;
            if (r14.A0F || r14.A0G) {
                A09(str, list);
                boolean z = false;
                if (this.A07 != null) {
                    z = true;
                }
                C331717Sc r4 = this.A0N;
                if (z) {
                    AnonymousClass7YS r42 = (AnonymousClass7YS) r4;
                    C2366634p r0 = r42.A00.A08;
                    if (r0 != null) {
                        r0.A02();
                    }
                    AnonymousClass9H4 r02 = r42.A01.A07;
                    18g r3 = r02.A00;
                    r3.A0M(r3.A02, r02.A01, 002.A0R(r02.A02, "_prefetched"));
                    r42.A02.accept(true);
                } else {
                    r4.EwO("THREAD_STORE_CACHE_MISS");
                }
                A0A(this.A0L.A00.A0j.A0O.CXh());
                A03(this);
                A04(this);
            } else {
                this.A0N.EwO("THREAD_STORE_NOT_LOADED");
                if (!A062) {
                    this.A01 = new C71927OtB(this, list);
                    AnonymousClass1Nd.A00(userSession).A01(this.A01, AnonymousClass2KZ.class);
                }
            }
        } finally {
            0fh.A00(-2014128583);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: X.2Dm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.2Dm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.3su} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D8R(X.C67536MpV r24, X.C254743sy r25) {
        /*
            r23 = this;
            r4 = r23
            r7 = r25
            if (r25 == 0) goto L_0x013f
            X.2Dm r0 = r4.A0O
            r22 = r0
            com.instagram.model.direct.DirectThreadKey r7 = (com.instagram.model.direct.DirectThreadKey) r7
            r6 = r22
            X.2Dr r6 = (X.2Dr) r6
            r13 = 0
            X.0qQ.A0B(r7, r13)
            X.48S r1 = r6.A0P(r7)
            if (r1 == 0) goto L_0x0023
            boolean r0 = r1.A0W()
            if (r0 == 0) goto L_0x0023
            X.2Dr.A0F(r6, r1)
        L_0x0023:
            com.instagram.common.session.UserSession r3 = r6.A0A
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325665159591032(0x810e0000113478, double:3.035835146413826E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0130
            X.48S r5 = r6.A0P(r7)
            if (r5 == 0) goto L_0x0130
            monitor-enter(r5)
            X.3U9 r1 = r5.A0I     // Catch:{ all -> 0x0121 }
            boolean r0 = r1.CYU()     // Catch:{ all -> 0x0121 }
            r9 = 0
            if (r0 == 0) goto L_0x010c
            java.util.HashMap r2 = r1.CCo()     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = r1.C6C()     // Catch:{ all -> 0x0121 }
            int r1 = r2.size()     // Catch:{ all -> 0x0121 }
            r0 = 2
            if (r1 < r0) goto L_0x010c
            if (r12 == 0) goto L_0x010c
            java.util.List r1 = r5.A0K     // Catch:{ all -> 0x0121 }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0121 }
            java.lang.Class<X.48U> r18 = X.AnonymousClass48U.class
            monitor-enter(r18)     // Catch:{ all -> 0x0121 }
            r0 = 1
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r11 = X.AnonymousClass48U.A06(r2)     // Catch:{ all -> 0x0109 }
            if (r11 == 0) goto L_0x0107
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0109 }
            r10.<init>()     // Catch:{ all -> 0x0109 }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ all -> 0x0109 }
            r1 = r9
            r2 = r9
        L_0x0071:
            r8 = 0
        L_0x0072:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r16 = r17.next()     // Catch:{ all -> 0x0109 }
            r3 = r16
            X.3su r3 = (X.C254703su) r3     // Catch:{ all -> 0x0109 }
            java.lang.String r15 = r3.A0g()     // Catch:{ all -> 0x0109 }
            if (r15 == 0) goto L_0x0072
            int r0 = r15.compareTo(r11)     // Catch:{ all -> 0x0109 }
            if (r0 > 0) goto L_0x00ef
            java.lang.Integer r14 = r3.A0b()     // Catch:{ all -> 0x0109 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0109 }
            if (r14 != r0) goto L_0x0097
            if (r2 == 0) goto L_0x0097
            goto L_0x00e7
        L_0x0097:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0109 }
            if (r14 != r0) goto L_0x0072
            monitor-enter(r16)     // Catch:{ all -> 0x0109 }
            java.lang.Long r0 = r3.A1N     // Catch:{ all -> 0x00ec }
            monitor-exit(r16)     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x0072
            if (r1 == 0) goto L_0x00ad
            java.lang.Long r14 = r1.A1M     // Catch:{ all -> 0x0109 }
            java.lang.Long r0 = r3.A1M     // Catch:{ all -> 0x0109 }
            boolean r0 = X.0qQ.A0K(r14, r0)     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x00d5
        L_0x00ad:
            if (r2 == 0) goto L_0x00b3
            X.AnonymousClass48U.A07(r2, r1, r10, r8)     // Catch:{ all -> 0x0109 }
            r8 = 0
        L_0x00b3:
            java.lang.Long r0 = r3.A1M     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00db
            long r0 = r0.longValue()     // Catch:{ all -> 0x0109 }
            int r14 = (int) r0     // Catch:{ all -> 0x0109 }
        L_0x00bc:
            java.lang.String r1 = r3.A1j     // Catch:{ all -> 0x0109 }
            if (r1 != 0) goto L_0x00c2
            java.lang.String r1 = ""
        L_0x00c2:
            java.lang.String r0 = ""
            X.Cvp r2 = new X.Cvp     // Catch:{ all -> 0x0109 }
            r2.<init>()     // Catch:{ all -> 0x0109 }
            r2.A00 = r13     // Catch:{ all -> 0x0109 }
            r2.A02 = r0     // Catch:{ all -> 0x0109 }
            r2.A03 = r0     // Catch:{ all -> 0x0109 }
            r2.A01 = r14     // Catch:{ all -> 0x0109 }
            r2.A04 = r15     // Catch:{ all -> 0x0109 }
            r2.A05 = r1     // Catch:{ all -> 0x0109 }
        L_0x00d5:
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0109 }
            monitor-enter(r16)     // Catch:{ all -> 0x0109 }
            goto L_0x00dd
        L_0x00db:
            r14 = 0
            goto L_0x00bc
        L_0x00dd:
            java.lang.Long r0 = r3.A1M     // Catch:{ all -> 0x00ec }
            X.C254703su.A0C(r3, r1, r0)     // Catch:{ all -> 0x00ec }
            monitor-exit(r16)     // Catch:{ all -> 0x0109 }
            int r8 = r8 + 1
            r1 = r3
            goto L_0x0072
        L_0x00e7:
            X.AnonymousClass48U.A07(r2, r1, r10, r8)     // Catch:{ all -> 0x0109 }
            r2 = r9
            goto L_0x0071
        L_0x00ec:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x00ef:
            if (r2 == 0) goto L_0x00f4
            X.AnonymousClass48U.A07(r2, r1, r10, r8)     // Catch:{ all -> 0x0109 }
        L_0x00f4:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x0107
            X.CvI r9 = new X.CvI     // Catch:{ all -> 0x0109 }
            r9.<init>()     // Catch:{ all -> 0x0109 }
            r9.A01 = r12     // Catch:{ all -> 0x0109 }
            r9.A03 = r10     // Catch:{ all -> 0x0109 }
            r0 = r19
            r9.A00 = r0     // Catch:{ all -> 0x0109 }
        L_0x0107:
            monitor-exit(r18)     // Catch:{ all -> 0x0121 }
            goto L_0x010c
        L_0x0109:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0121 }
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x010c:
            monitor-exit(r5)
            if (r9 == 0) goto L_0x0130
            r0 = r24
            X.7TI r0 = r0.A00
            X.7Zg r0 = r0.A08
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "clientInfra"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0121:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0124:
            X.7ZA r0 = r0.C62()
            r0.Clg(r9)
            r0 = r22
            r0.FI2(r7)
        L_0x0130:
            X.48S r1 = r6.A0P(r7)
            if (r1 == 0) goto L_0x013f
            boolean r0 = r1.A0X()
            if (r0 == 0) goto L_0x013f
            X.2Dr.A0F(r6, r1)
        L_0x013f:
            X.7BO r0 = r4.A0C
            r3 = 0
            if (r0 == 0) goto L_0x0149
            r0.A02()
            r4.A0C = r3
        L_0x0149:
            X.1wn r0 = r4.A01
            if (r0 == 0) goto L_0x015a
            com.instagram.common.session.UserSession r0 = r4.A0G
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.2KZ> r1 = X.AnonymousClass2KZ.class
            X.1wn r0 = r4.A01
            r2.A02(r0, r1)
        L_0x015a:
            X.1wn r0 = r4.A02
            if (r0 == 0) goto L_0x0161
            A04(r4)
        L_0x0161:
            X.7Mf r0 = r4.A0A
            if (r0 == 0) goto L_0x0167
            r0.A00 = r3
        L_0x0167:
            r4.A0A = r3
            X.2E2 r2 = r4.A08
            X.9IO r1 = r4.A00
            r0 = 615(0x267, float:8.62E-43)
            r2.A02(r1, r0)
            X.7Mt r2 = r4.A0I
            if (r2 == 0) goto L_0x018a
            java.util.List r0 = r2.A0D
            r0.clear()
            r2.A03 = r3
            X.3jg r1 = r2.A00
            if (r1 == 0) goto L_0x0188
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            if (r0 == 0) goto L_0x0188
            r0.A16(r1)
        L_0x0188:
            r2.A01 = r3
        L_0x018a:
            X.7Z4 r3 = r4.A0W
            X.65E r0 = r3.A01
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36315949950897972(0x81052a00810f34, double:3.02969120931633E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)
            if (r0 == 0) goto L_0x019e
            r3.A08()
        L_0x019e:
            X.1a8 r0 = r4.A0V
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S6.D8R(X.MpV, X.3sy):void");
    }

    public final void DRt(List list) {
        11Z.A02(new C3262175w(this, list));
    }

    public final void E2N() {
        throw new IllegalStateException("pendingSendInserted not implemented for DirectThreadViewDataLoader");
    }

    public final void EI1() {
        C330287Me r0 = this.A03;
        r0.getClass();
        r0.A01 = -1;
        if (AnonymousClass7D0.A00(this.A0G).booleanValue()) {
            this.A0M.A08.A01 = -1L;
        }
    }

    public final void EIF() {
        C330287Me r0 = this.A03;
        r0.getClass();
        r0.A05 = true;
        if (AnonymousClass7D0.A00(this.A0G).booleanValue()) {
            this.A0M.A04 = true;
        }
    }

    public final void EIQ(boolean z) {
        if (z) {
            EIF();
        }
        if (AnonymousClass7D0.A00(this.A0G).booleanValue()) {
            C331787Sj r3 = this.A0M;
            DirectThreadKey A0C2 = B8S();
            AnonymousClass7SD C6Q = C6Q();
            0qQ.A0B(C6Q, 1);
            r3.A04(C6Q, A0C2);
            return;
        }
        C330287Me r2 = this.A03;
        r2.getClass();
        r2.A00(C6Q(), B8S());
    }

    public final boolean EtG() {
        if (this.A0E) {
            return true;
        }
        AnonymousClass2Ep r0 = this.A07;
        if (r0 == null) {
            return false;
        }
        boolean isPending = r0.isPending();
        boolean CUG = this.A07.CUG();
        if (C66640Ma9.A04(this.A07.BRZ(), this.A07.BSK(), isPending, CUG)) {
            return true;
        }
        return false;
    }

    public final ArrayList F03(AnonymousClass7SD r9, List list) {
        UserSession userSession = this.A0G;
        0qQ.A0B(userSession, 0);
        ((AnonymousClass7OP) userSession.A01(AnonymousClass7OP.class, new C73897PlY(userSession, 39))).A01(list);
        C331797Sk r0 = this.A0Z;
        AnonymousClass2Ep r5 = this.A07;
        r5.getClass();
        C331617Rr r6 = this.A0c;
        AnonymousClass9HC r2 = this.A05;
        AnonymousClass7SH r3 = this.A0b;
        return r0.A00(this.A0a, r2, r3, r9, r5, r6, list);
    }

    public final void FKh(boolean z) {
        AnonymousClass7Z5 r0 = this.A06;
        A08(this, r0.A02, r0.A03, false, A0G(z));
    }

    public final void onDestroyView() {
        C330287Me r1 = this.A03;
        r1.getClass();
        r1.A03 = true;
        C331787Sj r12 = this.A0M;
        r12.A01 = null;
        r12.A02 = null;
        r12.A03 = null;
    }

    public final void onPause() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A0G);
        A002.A02(this.A0S, 2Kb.class);
        A002.A02(this.A0P, C330827Ok.class);
        A002.A02(this.A0Q, C330837Ol.class);
        A002.A02(this.A0R, C330847Om.class);
    }

    public final void onResume() {
        if (this.A07 == null) {
            AnonymousClass7Z5 r0 = this.A06;
            A08(this, false, r0.A03, r0.A01, r0.A00);
            if (A0B()) {
                CgQ();
            }
        } else {
            C330437Mt r02 = this.A0I;
            if (r02 == null || !r02.A03()) {
                AnonymousClass7SD C6Q = C6Q();
                this.A0U.accept(C6Q);
                AnonymousClass2Ep r03 = this.A07;
                r03.getClass();
                DirectThreadKey BJy = r03.BJy();
                if (AnonymousClass7D0.A00(this.A0G).booleanValue()) {
                    C331787Sj r2 = this.A0M;
                    AnonymousClass7SD C6Q2 = C6Q();
                    0qQ.A0B(C6Q2, 1);
                    r2.A04(C6Q2, BJy);
                } else {
                    C330287Me r04 = this.A03;
                    r04.getClass();
                    r04.A00(C6Q, BJy);
                }
            }
        }
        1Ng A002 = AnonymousClass1Nd.A00(this.A0G);
        A002.A01(this.A0S, 2Kb.class);
        A002.A01(this.A0P, C330827Ok.class);
        A002.A01(this.A0Q, C330837Ol.class);
        A002.A01(this.A0R, C330847Om.class);
    }

    public AnonymousClass7S6(UserSession userSession, Capabilities capabilities, C330437Mt r8, AnonymousClass7US r9, AnonymousClass7TS r10, AnonymousClass7TR r11, C331787Sj r12, C333427Yx r13, AnonymousClass9HO r14, AnonymousClass9HC r15, AnonymousClass7SH r16, C331617Rr r17, C331717Sc r18, C331717Sc r19, 2Dm r20, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0G = userSession;
        this.A0H = capabilities;
        this.A0c = r17;
        this.A05 = r15;
        this.A0M = r12;
        this.A0h = z;
        this.A0E = z2;
        this.A0e = str;
        this.A0O = r20;
        this.A0f = str2;
        this.A0g = z3;
        this.A0i = z4;
        this.A0I = r8;
        this.A0L = r11;
        this.A0b = r16;
        this.A0J = r9;
        this.A0K = r10;
        this.A0N = r18;
        this.A0d = r19;
        02m r4 = 02m.A0p;
        0qQ.A07(r4);
        this.A0W = new AnonymousClass7Z4(r4, AnonymousClass65D.A00(userSession), AnonymousClass0BO.A00(userSession));
        this.A08 = 2E1.A00(02m.A0p, userSession);
        this.A0X = r13;
        this.A06 = new AnonymousClass7Z5(true, false, false, false);
        C330437Mt r0 = this.A0I;
        if (r0 != null) {
            r0.A0D.add(new AnonymousClass7BL(this));
        }
        this.A0B = new AnonymousClass7S4(userSession, this.A05);
        this.A0Z = (C331797Sk) userSession.A01(C331797Sk.class, new C73918Ply(userSession, 18));
        this.A0a = r14;
    }

    private C3257874d A00(boolean z) {
        String str;
        C392009u2 r1 = null;
        if (!CSK() || this.A07 == null) {
            return null;
        }
        boolean z2 = z;
        if (z != CVE()) {
            if (!z) {
                r1 = C388999oj.A00;
            } else {
                r1 = C389009ok.A00;
            }
        }
        boolean CVE = CVE();
        if (CVE()) {
            AnonymousClass2Ep r0 = this.A07;
            r0.getClass();
            str = r0.Btb();
        } else {
            str = null;
        }
        return new C3257874d(r1, BrG(false), str, CVE, z2);
    }

    public static List A01(AnonymousClass2Ep r2) {
        if (r2.C6a() != 29 || r2.BJl() == null) {
            return Collections.emptyList();
        }
        return r2.BJl();
    }

    public static void A07(AnonymousClass7S6 r2, List list) {
        r2.A09(r2.C6C(), list);
        if (r2.A07 != null) {
            r2.A0N.Eyv("THREAD_STORE_CACHE_HIT");
        }
        r2.A0A(r2.A0L.A00.A0j.A0O.CXh());
    }

    public static void A08(AnonymousClass7S6 r5, boolean z, boolean z2, boolean z3, boolean z4) {
        11Z.A00();
        AnonymousClass7Z5 r4 = new AnonymousClass7Z5(z, z2, z3, z4);
        r5.A06 = r4;
        AnonymousClass7ZX r3 = r5.A04;
        0mo A0R2 = r3.A0R();
        AnonymousClass7Z5 r1 = r3.A0B;
        if (r1 == null) {
            0qQ.A0F("previousLoadMoreViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        int A002 = 0mo.A00(A0R2, r1, 4);
        if (A002 != -1) {
            r3.A0W(r4, A002);
        }
        r3.A0B = r4;
    }

    public final void A0E(C74340PtG ptG) {
        String C6C = C6C();
        if (C6C == null) {
            0wb.A03("DirectMessageLoaderImpl_loadMore", "Cannot paginate on an unconfirmed thread.");
        } else if (this.A0C == null) {
            this.A0C = 1bO.A00(this.A0G).A08(ThreadFetchReason.DIRECT_THREAD_VIEW_LOAD_MORE_FROM_NETWORK, new AnonymousClass74V(this, ptG), C6C, false);
            AnonymousClass7Z5 r0 = this.A06;
            A08(this, r0.A02, true, false, r0.A00);
        }
    }

    public final C254793t3 B6E() {
        return CBU();
    }

    public final C254743sy B6F() {
        return B8S();
    }

    public final Integer Btd() {
        return C6Q().A0S;
    }

    public final C254783t2 C6c() {
        C254793t3 CBU = CBU();
        if (CBU != null) {
            return CBU;
        }
        C254773t1 r0 = this.A0D;
        r0.getClass();
        return r0;
    }

    public final C254793t3 CBU() {
        String C6C = C6C();
        if (C6C != null) {
            return new C254763t0(C6C);
        }
        return null;
    }

    public final boolean CWe() {
        if (C6Q().A02 != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021e, code lost:
        if (r3.A0M.A0H != false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0184, code lost:
        if (r0.CKK() == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019c, code lost:
        if (r1.A03 != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bb, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36331162716619695L) == false) goto L_0x01bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DRu(X.AnonymousClass7SD r37, java.util.List r38, long r39) {
        /*
            r36 = this;
            X.11Z.A00()
            r3 = r36
            X.2E2 r8 = r3.A08
            X.9IO r0 = r3.A00
            r35 = r38
            int r7 = r35.size()
            if (r0 == 0) goto L_0x001c
            com.facebook.quicklog.QuickPerformanceLogger r6 = r8.A00
            int r2 = r0.A01
            int r1 = r0.A02
            java.lang.String r0 = "response_data_size"
            r6.markerAnnotate(r2, r1, r0, r7)
        L_0x001c:
            X.9IO r0 = r3.A00
            r7 = 2
            r8.A02(r0, r7)
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            X.7TR r0 = r3.A0L
            X.7TI r0 = r0.A00
            X.7Tw r0 = r0.A0j
            X.7Ty r0 = r0.A0O
            boolean r1 = r0.CXh()
            X.7US r2 = r3.A0J
            X.7UC r6 = r2.A03
            if (r1 != 0) goto L_0x00d9
            X.7ZX r10 = r3.A04
            r8 = -1
            int r0 = (r39 > r8 ? 1 : (r39 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00c7
            X.Maf r0 = r10.A06
            if (r0 != 0) goto L_0x005d
            r8 = 1
            long r4 = r39 - r8
            X.Maf r0 = new X.Maf
            r0.<init>(r4)
            r10.A06 = r0
            X.AnonymousClass7ZX.A0K(r10, r0)
        L_0x005d:
            r0 = 1
        L_0x005e:
            r6.A00 = r0
            com.instagram.common.session.UserSession r4 = r3.A0G
            X.7ZX r0 = r3.A04
            int r17 = r0.getItemCount()
            X.7Yz r0 = r3.A0Y
            r22 = r0
            X.7SH r6 = r3.A0b
            X.7ZX r5 = r3.A04
            r5.getClass()
            r16 = 0
            r0 = r16
            X.0qQ.A0B(r4, r0)
            r25 = r37
            r0 = r25
            X.0qQ.A0B(r0, r7)
            r7 = 4
            r0 = r22
            X.0qQ.A0B(r0, r7)
            r0 = 5
            X.0qQ.A0B(r6, r0)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r13 = r35.size()
            r12 = 0
        L_0x009f:
            if (r12 >= r13) goto L_0x00db
            r0 = r35
            java.lang.Object r0 = r0.get(r12)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r11 = r0.A0e
            X.0qQ.A07(r11)
            r9.put(r11, r0)
            java.lang.String r10 = r11.A0g()
            if (r10 == 0) goto L_0x00c3
            int r0 = r10.length()
            if (r0 == 0) goto L_0x00c3
            r8.put(r10, r11)
        L_0x00c0:
            int r12 = r12 + 1
            goto L_0x009f
        L_0x00c3:
            r7.add(r11)
            goto L_0x00c0
        L_0x00c7:
            X.Maf r0 = r10.A06
            if (r0 == 0) goto L_0x00d9
            X.0mo r4 = r10.A0R()
            X.Maf r0 = r10.A06
            if (r0 == 0) goto L_0x0221
            r4.A08(r0)
            r0 = 0
            r10.A06 = r0
        L_0x00d9:
            r0 = 0
            goto L_0x005e
        L_0x00db:
            r10 = 0
        L_0x00dc:
            r0 = r17
            if (r10 >= r0) goto L_0x0165
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            int r11 = r0.intValue()
            r0 = -1
            if (r11 == r0) goto L_0x0146
            X.7LQ r0 = X.AnonymousClass7ZX.A08(r5, r11)
            if (r0 == 0) goto L_0x0146
            X.3su r14 = r0.A0e
            if (r14 == 0) goto L_0x0146
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r14.A13
            if (r0 != 0) goto L_0x0146
            java.lang.String r13 = r14.A0g()
            if (r13 != 0) goto L_0x011b
            int r15 = r7.size()
            r11 = 0
        L_0x0104:
            if (r11 >= r15) goto L_0x014b
            java.lang.Object r12 = r7.get(r11)
            X.3su r12 = (X.C254703su) r12
            java.lang.Object r0 = r7.get(r11)
            X.3su r0 = (X.C254703su) r0
            boolean r0 = X.C254703su.A0B(r14, r0)
            if (r0 != 0) goto L_0x0121
            int r11 = r11 + 1
            goto L_0x0104
        L_0x011b:
            java.lang.Object r12 = r8.get(r13)
            X.3su r12 = (X.C254703su) r12
        L_0x0121:
            if (r12 == 0) goto L_0x014b
            r0 = r22
            X.7S6 r0 = r0.A00
            X.2Ep r11 = r0.A07
            if (r11 == 0) goto L_0x0149
            com.instagram.common.session.UserSession r0 = r0.A0G
            com.instagram.user.model.User r13 = X.AnonymousClass48N.A04(r0, r12, r11)
        L_0x0131:
            X.7LQ r11 = new X.7LQ
            r0 = r25
            r11.<init>(r4, r0, r12, r13)
            X.4UC r0 = r6.Biq()
            r11.A0J = r0
            r0 = r18
            r0.add(r11)
            r9.remove(r12)
        L_0x0146:
            int r10 = r10 + 1
            goto L_0x00dc
        L_0x0149:
            r13 = 0
            goto L_0x0131
        L_0x014b:
            boolean r0 = r14 instanceof X.C68899Nab
            if (r0 != 0) goto L_0x0146
            if (r13 != 0) goto L_0x015f
            java.lang.String r13 = r14.A0f()
            if (r13 != 0) goto L_0x015f
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015f:
            r0 = r19
            r0.add(r13)
            goto L_0x0146
        L_0x0165:
            java.util.Collection r5 = r9.values()
            r0 = r20
            r0.addAll(r5)
            X.7ZX r5 = r3.A04
            java.lang.String r27 = r3.C6C()
            X.74d r23 = r3.A00(r1)
            if (r1 != 0) goto L_0x0186
            X.2Ep r0 = r3.A07
            if (r0 == 0) goto L_0x0186
            boolean r0 = r0.CKK()
            r31 = 1
            if (r0 == 0) goto L_0x0188
        L_0x0186:
            r31 = 0
        L_0x0188:
            X.2Ep r0 = r3.A07
            if (r0 == 0) goto L_0x019e
            boolean r0 = r0.CKK()
            if (r0 != 0) goto L_0x019e
            X.7Z5 r1 = r3.A06
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x019e
            boolean r0 = r1.A03
            r32 = 1
            if (r0 == 0) goto L_0x01a0
        L_0x019e:
            r32 = 0
        L_0x01a0:
            X.7Me r0 = r3.A03
            if (r0 == 0) goto L_0x0218
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0218
        L_0x01a8:
            r33 = 1
        L_0x01aa:
            X.2Ep r0 = r3.A07
            if (r0 == 0) goto L_0x01bd
            X.0Tu r6 = X.0Tu.A05
            r0 = 36331162716619695(0x811300000043af, double:3.039311823615638E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            r34 = 1
            if (r0 != 0) goto L_0x01bf
        L_0x01bd:
            r34 = 0
        L_0x01bf:
            X.7Ei r24 = r3.CC6()
            r26 = 0
            r21 = r2
            r28 = r20
            r29 = r19
            r30 = r18
            r20 = r5
            r20.A0U(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.7Z5 r0 = r3.A06
            boolean r5 = r0.A03
            boolean r4 = r0.A01
            boolean r1 = r0.A00
            r0 = r16
            A08(r3, r0, r5, r4, r1)
            boolean r0 = r3.A0B()
            if (r0 == 0) goto L_0x01e8
            r3.CgQ()
        L_0x01e8:
            X.4DH r0 = r2.A00
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x0204
            X.1OP r0 = X.1OP.$redex_init_class
            X.3K2 r4 = X.AnonymousClass3K2.A04(r1)
            r1 = 1
            if (r4 == 0) goto L_0x0204
            boolean r0 = r4.A0Z()
            if (r0 != r1) goto L_0x0204
            X.0iw r0 = r2.A01
            r4.A0X(r0)
        L_0x0204:
            java.lang.String r0 = r3.C6C()
            r3.C6Q()
            r2.A04(r0)
            X.7Mf r1 = r3.A0A
            if (r1 == 0) goto L_0x0217
            r0 = r35
            r1.A01(r0)
        L_0x0217:
            return
        L_0x0218:
            X.7Sj r0 = r3.A0M
            boolean r0 = r0.A0H
            r33 = 0
            if (r0 == 0) goto L_0x01aa
            goto L_0x01a8
        L_0x0221:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S6.DRu(X.7SD, java.util.List, long):void");
    }
}
