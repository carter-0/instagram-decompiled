package X;

import android.content.Context;
import android.util.Log;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ss3  reason: case insensitive filesystem */
public final class C12357Ss3 implements C13862Tii, C13596TdO {
    public C12356Ss2 A00;
    public C13596TdO A01;
    public C13597TdP A02;
    public C10292Rpq A03;
    public String A04;
    public Map A05;
    public long A06;
    public long A07;
    public C10850RzA A08;
    public final Map A09;
    public final long A0A;
    public final long A0B;
    public final Context A0C;
    public final AnonymousClass0JR A0D;
    public final C13886Tj9 A0E;
    public final C13724Tfu A0F;
    public final C7255Q1d A0G;
    public final C13587TdF A0H;
    public final C10566RuL A0I;
    public final C13588TdG A0J;
    public final C13725Tfv A0K;
    public final C13590TdI A0L;
    public final C13780Tgv A0M;
    public final C13804ThT A0N;
    public final C10796RyI A0O;
    public final C13598TdQ A0P;
    public final File A0Q;
    public final String A0R;

    private final C12356Ss2 A00() {
        Context context = this.A0C;
        String str = this.A0R;
        C10796RyI ryI = this.A0O;
        C13725Tfv tfv = this.A0K;
        C13590TdI tdI = this.A0L;
        C13780Tgv tgv = this.A0M;
        C13598TdQ tdQ = this.A0P;
        C10850RzA rzA = this.A08;
        C7255Q1d q1d = this.A0G;
        File file = this.A0Q;
        C13804ThT thT = this.A0N;
        C13588TdG tdG = this.A0J;
        C13886Tj9 tj9 = this.A0E;
        Map map = this.A05;
        C13724Tfu tfu = this.A0F;
        File file2 = file;
        String str2 = str;
        C10850RzA rzA2 = rzA;
        C13598TdQ tdQ2 = tdQ;
        C13804ThT thT2 = thT;
        C10796RyI ryI2 = ryI;
        C13590TdI tdI2 = tdI;
        C13780Tgv tgv2 = tgv;
        C13588TdG tdG2 = tdG;
        C13725Tfv tfv2 = tfv;
        return new C12356Ss2(context, tj9, tfu, q1d, this.A0H, tdG2, tfv2, tdI2, tgv2, thT2, ryI2, rzA2, tdQ2, file2, str2, this.A04, map);
    }

    public final void APK() {
        this.A00.A0Y = true;
    }

    public final long AuJ() {
        return this.A00.AuJ();
    }

    public final void DXY(C390949s6 r35, String str, String str2, Throwable th) {
        Object obj;
        C390949s6 r9 = r35;
        String str3 = str;
        AnonymousClass7TG.A1N(r9, str3);
        Throwable th2 = th;
        0qQ.A0B(th2, 2);
        long AuJ = this.A00.AuJ();
        long now = this.A0D.now();
        if (now - this.A06 > this.A0B) {
            long j = this.A07;
            if (j < this.A0A) {
                this.A06 = now;
                this.A07 = j + 1;
                C12356Ss2 ss2 = this.A00;
                String str4 = ss2.A0T;
                boolean z = ss2.A10;
                C12356Ss2 ss22 = this.A00;
                C266724aF r6 = ss22.A0J;
                MediaComposition mediaComposition = ss22.A0P.A08;
                if (mediaComposition != null) {
                    long j2 = ss22.A06;
                    C10850RzA rzA = this.A08;
                    int i = rzA.A05;
                    int i2 = rzA.A04;
                    C7334Q4k q4k = rzA.A0C;
                    int i3 = rzA.A01;
                    int i4 = rzA.A03;
                    boolean z2 = rzA.A0D;
                    int i5 = rzA.A02;
                    SJA sja = rzA.A08;
                    C13834Ti9 ti9 = rzA.A07;
                    boolean z3 = rzA.A0E;
                    HashSet hashSet = rzA.A00;
                    C10954S2m s2m = rzA.A0A;
                    HashSet hashSet2 = hashSet;
                    boolean z4 = z3;
                    this.A08 = new C10850RzA(rzA.A06, ti9, sja, mediaComposition, s2m, rzA.A0B, q4k, hashSet2, i3, i5, i4, i2, i, z4, z2);
                    C12356Ss2.A0A(ss22, "releaseWithoutListening", Pxe.A1b());
                    ss22.A0O = null;
                    ss22.A0R = null;
                    ss22.A0N = null;
                    try {
                        ss22.release();
                    } catch (Exception e) {
                        C12356Ss2.A0B(ss22, e);
                    }
                    C10566RuL ruL = this.A0I;
                    Long l = ruL.A00;
                    if (l != null) {
                        long longValue = l.longValue();
                        C10425Rs1 rs1 = ruL.A01;
                        if (rs1 != null) {
                            String stackTraceString = Log.getStackTraceString(th2);
                            0qQ.A0A(stackTraceString);
                            0qQ.A0B(stackTraceString, 2);
                            rs1.A01.flowAnnotate(longValue, "error_trace", stackTraceString);
                        }
                    }
                    long j3 = this.A07;
                    this.A04 = str3;
                    Map map = this.A05;
                    Object obj2 = "";
                    if (!(map == null || (obj = map.get("source_type")) == null)) {
                        obj2 = obj;
                    }
                    LinkedHashMap A0y = C66582MXn.A0y("source_type", obj2);
                    A0y.put("reason", "retry");
                    A0y.put("retry_attempt_number", String.valueOf(j3));
                    A0y.put("retry_position_ns", String.valueOf(AuJ));
                    this.A05 = A0y;
                    this.A00 = A00();
                    if (str4 != null) {
                        ETy(str4);
                    }
                    Eka(z);
                    C13597TdP tdP = this.A02;
                    if (tdP != null) {
                        Eg3(tdP);
                    }
                    C13596TdO tdO = this.A01;
                    if (tdO != null) {
                        Efy(tdO);
                    }
                    C10292Rpq rpq = this.A03;
                    if (rpq != null) {
                        Eg0(rpq, j2);
                    }
                    E3v(AuJ);
                    Iterator A0u = AnonymousClass7TF.A0u(this.A09);
                    while (A0u.hasNext()) {
                        AnonymousClass59G r0 = (AnonymousClass59G) C51971G9r.A0p(A0u);
                        Object obj3 = r0.A00;
                        Object obj4 = r0.A01;
                        Object obj5 = r0.A02;
                        C12356Ss2 ss23 = this.A00;
                        C12356Ss2.A0H(ss23);
                        ss23.A0I(C8897REp.SEND_RENDERER_EVENT, new Object[]{obj3, obj4, obj5}, 0);
                    }
                    if (r6 != null) {
                        Efv(r6);
                    }
                    if (r9 == C390949s6.PLAYING) {
                        E2p();
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        C13597TdP tdP2 = this.A02;
        if (tdP2 != null) {
            tdP2.DXi(r9, C390949s6.ERROR);
        }
        C13596TdO tdO2 = this.A01;
        if (tdO2 != null) {
            String stackTraceString2 = Log.getStackTraceString(th2);
            0qQ.A0A(stackTraceString2);
            tdO2.DXY(r9, str3, stackTraceString2, th2);
        }
        C10566RuL ruL2 = this.A0I;
        Long l2 = ruL2.A00;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            ruL2.A00 = null;
            C10425Rs1 rs12 = ruL2.A01;
            if (rs12 != null) {
                String stackTraceString3 = Log.getStackTraceString(th2);
                0qQ.A0A(stackTraceString3);
                0qQ.A0B(stackTraceString3, 2);
                UserFlowLogger userFlowLogger = rs12.A01;
                userFlowLogger.flowAnnotate(longValue2, "error_trace", stackTraceString3);
                String obj6 = th2.toString();
                0qQ.A0B(obj6, 1);
                userFlowLogger.flowEndFail(longValue2, obj6, (String) null);
            }
        }
    }

    public final void E2p() {
        this.A00.E2p();
    }

    public final void E3m() {
        this.A00.E3v(0);
    }

    public final void E3v(long j) {
        this.A00.E3v(j);
    }

    public final void EKz(long j) {
        this.A00.EKz(j);
    }

    public final void ETy(String str) {
        this.A00.A0T = str;
    }

    public final void Efv(C266724aF r2) {
        this.A00.Efv(r2);
    }

    public final void Efy(C13596TdO tdO) {
        this.A01 = tdO;
        this.A00.Efy(this);
    }

    public final void Eg0(C10292Rpq rpq, long j) {
        this.A03 = rpq;
        this.A00.Eg0(rpq, j);
    }

    public final void Eg3(C13597TdP tdP) {
        this.A02 = tdP;
        this.A00.Eg3(new C12364SsD(this));
    }

    public final void Eka(boolean z) {
        this.A00.Eka(z);
    }

    public final boolean FKF(C266714aE r3, MediaEffect mediaEffect, String str) {
        0qQ.A0B(r3, 0);
        return this.A00.FKF(r3, mediaEffect, "global_volume");
    }

    public final void FKk(MediaComposition mediaComposition) {
        this.A00.FKk(mediaComposition);
    }

    public final void FKl(MediaComposition mediaComposition, long j) {
        this.A00.FKl(mediaComposition, j);
    }

    public final void FM6(C266724aF r2, String str) {
        this.A00.FM6(r2, str);
    }

    public final boolean isPlaying() {
        return this.A00.isPlaying();
    }

    public final void pause() {
        this.A00.pause();
    }

    public final void release() {
        this.A00.release();
        C10566RuL ruL = this.A0I;
        Long l = ruL.A00;
        if (l != null) {
            long longValue = l.longValue();
            ruL.A00 = null;
            C10425Rs1 rs1 = ruL.A01;
            if (rs1 != null) {
                rs1.A01.flowEndSuccess(longValue);
            }
        }
    }

    public C12357Ss3(Context context, C13886Tj9 tj9, C13724Tfu tfu, C7255Q1d q1d, C13587TdF tdF, C13588TdG tdG, C13725Tfv tfv, C13590TdI tdI, C13780Tgv tgv, C13804ThT thT, C10796RyI ryI, C10850RzA rzA, C13598TdQ tdQ, File file, String str, String str2, Map map, long j, long j2) {
        0qQ.A0B(q1d, 9);
        0qQ.A0B(tfu, 16);
        this.A0C = context;
        String str3 = str;
        this.A0R = str3;
        this.A0O = ryI;
        this.A0K = tfv;
        this.A0L = tdI;
        this.A0M = tgv;
        this.A0P = tdQ;
        this.A08 = rzA;
        this.A0G = q1d;
        this.A0Q = file;
        this.A0N = thT;
        this.A0J = tdG;
        this.A0E = tj9;
        this.A05 = map;
        this.A0F = tfu;
        this.A0H = tdF;
        this.A04 = str2;
        this.A0A = j;
        this.A0B = j2;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A0D = awakeTimeSinceBootClock;
        C10566RuL ruL = new C10566RuL(this.A08.A06, str3, this.A05);
        this.A0I = ruL;
        Long l = ruL.A00;
        if (l != null) {
            long longValue = l.longValue();
            C10425Rs1 rs1 = ruL.A01;
            if (rs1 != null) {
                rs1.A01.flowStart(longValue, "", false);
            }
        }
        this.A00 = A00();
        this.A09 = AnonymousClass7TE.A1E();
    }
}
