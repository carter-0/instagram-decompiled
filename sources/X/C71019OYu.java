package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.Executor;

/* renamed from: X.OYu  reason: case insensitive filesystem */
public final class C71019OYu {
    public final OOB A00;
    public final OML A01;
    public final C70665OFm A02;
    public final C70682OGd A03;
    public final QuickPerformanceLogger A04;
    public final Executor A05;
    public final Executor A06;
    public final C62320sa hardTimeoutInSecondsForLogin;
    public final C62320sa hardTimeoutInSecondsForRegister;
    public final C62320sa isLoginHighPriorityEnabled;
    public final C62320sa isLoginLongLivedRetryEnabled;
    public final C62320sa isRegisterHighPriorityEnabled;
    public final C62320sa isRegisterLongLivedRetryEnabled;

    public static final OW0 A00(OW0 ow0) {
        C69363Nk3 nk3;
        C69363Nk3 nk32;
        Boolean bool = ow0.A01;
        Number number = ow0.A02;
        Number number2 = ow0.A03;
        if (!AnonymousClass7TF.A1Y(bool, false) || !((nk32 = ow0.A00) == null || nk32 == C69363Nk3.A0A)) {
            nk3 = ow0.A00;
        } else {
            nk3 = C69363Nk3.A07;
        }
        return new OW0(nk3, bool, number, number2);
    }

    public static final void A01(C71019OYu oYu, C69363Nk3 nk3, C71087ObS obS, int i) {
        oYu.A01.A01(Integer.valueOf(nk3.A00.intValue()), (Integer) null, (Long) null, i);
        obS.A05(A00(new OW0(nk3, AnonymousClass7TE.A0u(), (Number) null, (Number) null)));
    }

    public C71019OYu(OOB oob, 1vo r12, QuickPerformanceLogger quickPerformanceLogger, Integer num, Executor executor) {
        C51972G9s.A1C(oob, r12);
        OML oml = new OML(quickPerformanceLogger);
        C70665OFm oFm = new C70665OFm(oob, r12, num, executor);
        C70682OGd oGd = new C70682OGd(oob, r12, num, executor);
        C73681Pi4 pi4 = C73681Pi4.A00;
        C73682Pi5 pi5 = C73682Pi5.A00;
        C73683Pi6 pi6 = C73683Pi6.A00;
        C73684Pi7 pi7 = C73684Pi7.A00;
        C73685Pi8 pi8 = C73685Pi8.A00;
        C73686Pi9 pi9 = C73686Pi9.A00;
        C51973G9u.A0u(8, pi4, pi5, pi6);
        DbW.A1P(pi7, 11, pi8);
        0qQ.A0B(pi9, 13);
        this.A01 = oml;
        this.A00 = oob;
        this.A02 = oFm;
        this.A03 = oGd;
        this.A04 = quickPerformanceLogger;
        this.A05 = executor;
        this.A06 = executor;
        this.isLoginHighPriorityEnabled = pi4;
        this.isRegisterHighPriorityEnabled = pi5;
        this.isLoginLongLivedRetryEnabled = pi6;
        this.isRegisterLongLivedRetryEnabled = pi7;
        this.hardTimeoutInSecondsForLogin = pi8;
        this.hardTimeoutInSecondsForRegister = pi9;
    }
}
