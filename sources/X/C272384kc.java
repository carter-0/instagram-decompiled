package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.common.build.BuildConstants;
import com.facebook.memorytimeline.MemoryTimeline;
import java.util.HashSet;

/* renamed from: X.4kc  reason: invalid class name and case insensitive filesystem */
public final class C272384kc implements 1JA {
    public final /* synthetic */ AnonymousClass141 A00;

    public C272384kc(AnonymousClass141 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v60, types: [java.lang.Object, X.0NG] */
    public final void DRA(MemoryTimeline memoryTimeline) {
        C70442Pg r0;
        int intValue;
        C272554kw r9;
        int intValue2;
        int intValue3;
        int intValue4;
        AnonymousClass141 r2 = this.A00;
        02m r10 = 02m.A0p;
        if (r10 != null && (r0 = r2.A01) != null) {
            0lg r4 = r0.A00;
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, r4, 36312282041222182L)) {
                ? obj = new Object();
                obj.A00 = r10;
                synchronized (0Gh.class) {
                    0Gh.A00 = obj;
                }
            }
            C70442Pg r02 = r2.A01;
            0qQ.A0A(r02);
            boolean A06 = 182.A06(r3, r02.A00, 36312282040763425L);
            C70442Pg r03 = r2.A01;
            0qQ.A0A(r03);
            boolean A062 = 182.A06(r3, r03.A00, 36312282040828962L);
            if (r2.A01 != null) {
                HandlerThread handlerThread = new HandlerThread("NavigationTrackerWithMemoryInfoThread");
                AnonymousClass0fe.A00(handlerThread);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                if (looper != null) {
                    Handler handler = new Handler(looper);
                    C70442Pg r04 = r2.A01;
                    0qQ.A0A(r04);
                    Long valueOf = Long.valueOf(182.A01(r3, r04.A00, 36593757017343460L));
                    if (valueOf == null) {
                        intValue = 0;
                    } else {
                        intValue = valueOf.intValue();
                    }
                    MemoryTimeline memoryTimeline2 = memoryTimeline;
                    C272394kd r1 = new C272394kd(memoryTimeline2, BuildConstants.A02());
                    C272454kj r05 = new C272454kj(memoryTimeline2, intValue);
                    HashSet hashSet = new HashSet();
                    hashSet.add(r1);
                    hashSet.add(r05);
                    C70442Pg r06 = r2.A01;
                    0qQ.A0A(r06);
                    boolean A063 = 182.A06(r3, r06.A00, 36312282040960036L);
                    C70442Pg r07 = r2.A01;
                    0qQ.A0A(r07);
                    boolean A064 = 182.A06(r3, r07.A00, 36312282041025573L);
                    if (A063 || A064) {
                        C70442Pg r08 = r2.A01;
                        0qQ.A0A(r08);
                        Long valueOf2 = Long.valueOf(182.A01(r3, r08.A00, 36593757017802214L));
                        if (valueOf2 == null) {
                            intValue3 = 0;
                        } else {
                            intValue3 = valueOf2.intValue();
                        }
                        C70442Pg r09 = r2.A01;
                        0qQ.A0A(r09);
                        Long valueOf3 = Long.valueOf(182.A01(r3, r09.A00, 36593757017867751L));
                        if (valueOf3 == null) {
                            intValue4 = 0;
                        } else {
                            intValue4 = valueOf3.intValue();
                        }
                        0qQ.A0A(r2.A01);
                        0qQ.A0A(r2.A01);
                        0qQ.A0A(r2.A01);
                        0qQ.A0A(r2.A01);
                        0qQ.A0A(r2.A01);
                        0qQ.A0A(r2.A01);
                        hashSet.add(new C272464kk(intValue3, intValue4, A063, A064));
                    }
                    C70442Pg r010 = r2.A01;
                    0qQ.A0A(r010);
                    if (182.A06(r3, r010.A00, 36312282041287719L)) {
                        C70442Pg r011 = r2.A01;
                        0qQ.A0A(r011);
                        String A04 = 182.A04(r3, r011.A00, 36875231994773570L);
                        C70442Pg r012 = r2.A01;
                        0qQ.A0A(r012);
                        Long valueOf4 = Long.valueOf(182.A01(r3, r012.A00, 36593757018129896L));
                        if (valueOf4 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = valueOf4.intValue();
                        }
                        0qQ.A0A(r2.A01);
                        0qQ.A0A(r2.A01);
                        0qQ.A0A(r2.A01);
                        r9 = new C272554kw(A04, intValue2);
                    } else {
                        r9 = null;
                    }
                    C70442Pg r013 = r2.A01;
                    0qQ.A0A(r013);
                    long A01 = 182.A01(r3, r013.A00, 36593757017081315L);
                    long j = r2.A02;
                    C70442Pg r014 = r2.A01;
                    0qQ.A0A(r014);
                    C272584kz r7 = new C272584kz(handler, r9, r10, hashSet, A01, j, A06, A062, 182.A06(r3, r014.A00, 36312282040894499L));
                    if (A06) {
                        C50146FRd fRd = new C50146FRd(r7);
                        r2.A00 = fRd;
                        0LA.A02(fRd);
                        return;
                    }
                    C272594l0 r22 = new C272594l0(r10);
                    2RW r015 = 2RW.A03;
                    if (r015 == null) {
                        r015 = new 2RW();
                        2RW.A03 = r015;
                    }
                    r015.A00 = r22;
                    r22.A02.add(new C272604l1(r7));
                    if (A062) {
                        0LA.A03(new C272614l2(r7), false);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
