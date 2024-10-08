package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.SQt  reason: case insensitive filesystem */
public final class C11381SQt {
    public static volatile C11381SQt A0F;
    public final Context A00;
    public final Context A01;
    public final Qob A02;
    public final C11200SFa A03;
    public final C13473Tb0 A04 = C12562Sxn.A00;
    public final C8488Qva A05;
    public final C8481QvT A06;
    public final C8482QvU A07;
    public final C8483QvV A08;
    public final S2U A09 = new S2U(this);
    public final C8479QvR A0A;
    public final C8484QvW A0B;
    public final C8485QvX A0C;
    public final C8486QvY A0D;
    public final C8480QvS A0E;

    public static C11200SFa A00(ST5 st5) {
        C11200SFa sFa = st5.A00.A03;
        AnonymousClass3Qk.A02(sFa);
        return sFa;
    }

    public static void A02(C8492Qve qve) {
        AnonymousClass3Qk.A03(qve, "Analytics service not created/initialized");
        AnonymousClass3Qk.A08(AnonymousClass7TF.A1P(qve.A00 ? 1 : 0), "Analytics service not initialized");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.ST5, X.QvX, X.Qve] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.ST5, X.Qve, X.QvS] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.ST5, X.Qve, X.QvV] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.ST5, X.Qve, X.QvR] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.Qob, X.Qop] */
    public C11381SQt(Context context, Context context2) {
        AnonymousClass3Qk.A03(context, "Application context can't be null");
        AnonymousClass3Qk.A02(context2);
        this.A00 = context;
        this.A01 = context2;
        ? st5 = new ST5(this);
        st5.A0I();
        st5.A00 = true;
        this.A0C = st5;
        A02(st5);
        String str = C10087RmP.A00;
        StringBuilder A14 = Pxe.A14(Pxf.A09(str) + 134);
        A14.append("Google Analytics ");
        A14.append(str);
        ST5.A0B(st5, AnonymousClass7TF.A0l(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4", A14), 4);
        C8486QvY qvY = new C8486QvY(this);
        qvY.A0I();
        qvY.A00 = true;
        this.A0D = qvY;
        ? st52 = new ST5(this);
        st52.A0I();
        st52.A00 = true;
        this.A0E = st52;
        C8481QvT qvT = new C8481QvT(this);
        ? st53 = new ST5(this);
        C8488Qva qva = new C8488Qva(this);
        C8482QvU qvU = new C8482QvU(this);
        ? st54 = new ST5(this);
        AnonymousClass3Qk.A02(context);
        if (C11200SFa.A06 == null) {
            synchronized (C11200SFa.class) {
                if (C11200SFa.A06 == null) {
                    C11200SFa.A06 = new C11200SFa(context);
                }
            }
        }
        C11200SFa sFa = C11200SFa.A06;
        sFa.A00 = new TLH(this);
        this.A03 = sFa;
        ? qop = new C8339Qop(this);
        qop.A00 = AnonymousClass7TE.A1F();
        st53.A0I();
        st53.A00 = true;
        this.A08 = st53;
        qva.A0I();
        qva.A00 = true;
        this.A05 = qva;
        qvU.A0I();
        qvU.A00 = true;
        this.A07 = qvU;
        st54.A0I();
        st54.A00 = true;
        this.A0A = st54;
        C8484QvW qvW = new C8484QvW(this);
        qvW.A0I();
        qvW.A00 = true;
        this.A0B = qvW;
        qvT.A0I();
        qvT.A00 = true;
        this.A06 = qvT;
        C8480QvS qvS = qop.A01.A0E;
        A02(qvS);
        qvS.A0J();
        qvS.A0J();
        if (qvS.A04) {
            qvS.A0J();
            qop.A02 = qvS.A05;
        }
        qvS.A0J();
        qop.A01 = true;
        this.A02 = qop;
        C8490Qvc qvc = qvT.A00;
        qvc.A0J();
        AnonymousClass3Qk.A09(!qvc.A01, "Analytics backend already started");
        qvc.A01 = true;
        C11200SFa A002 = A00(qvc);
        A002.A02.submit(new TDO(qvc));
    }

    public static C11381SQt A01(Context context) {
        AnonymousClass3Qk.A02(context);
        if (A0F == null) {
            synchronized (C11381SQt.class) {
                if (A0F == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AnonymousClass3Qk.A02(context);
                    Context applicationContext = context.getApplicationContext();
                    AnonymousClass3Qk.A03(applicationContext, "Application context can't be null");
                    C11381SQt sQt = new C11381SQt(applicationContext, applicationContext);
                    A0F = sQt;
                    synchronized (Qob.class) {
                        List<Runnable> list = Qob.A03;
                        if (list != null) {
                            for (Runnable run : list) {
                                run.run();
                            }
                            Qob.A03 = null;
                        }
                    }
                    long A0C2 = Pxe.A0C(elapsedRealtime);
                    Long l = (Long) SDN.A0A.A00;
                    if (A0C2 > l.longValue()) {
                        C8485QvX qvX = sQt.A0C;
                        A02(qvX);
                        qvX.A0D(Long.valueOf(A0C2), l, "Slow initialization (ms)");
                    }
                }
            }
        }
        return A0F;
    }
}
