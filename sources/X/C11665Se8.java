package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.Se8  reason: case insensitive filesystem */
public final class C11665Se8 implements 2YM {
    public QuickPerformanceLogger A00;
    public 2FO A01;
    public C10588Rui A02;
    public C10696Rwa A03;
    public C10444RsL A04;
    public C10445RsM A05;
    public C10446RsN A06;
    public S2Q A07;
    public S2Q A08;
    public C10447RsO A09;
    public S2S A0A;
    public SEL A0B;
    public final UserSession A0C;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public final 2YL create(Class cls) {
        if (cls == C8267Qn9.class) {
            return new C8267Qn9(this.A01, this.A05, this.A0C);
        }
        if (!(cls == C7425QCq.class || cls == C7427QCs.class || cls == C7428QCt.class || cls == C7429QCu.class)) {
            if (cls == C8269QnB.class) {
                return new C8269QnB(this.A01, this.A07, this.A0A, "FBPAY_HUB", new REG[]{REG.CREDIT_CARD, REG.PAYPAL, REG.DIRECT_DEBIT, REG.SHOP_PAY}, false, false, true);
            } else if (cls == Qn0.class) {
                return new C8269QnB(this.A01, this.A07, (S2S) null, "IAB_AUTOFILL", new REG[]{REG.CREDIT_CARD}, true, true, false);
            } else if (cls == C8263Qn5.class) {
                return new C8263Qn5();
            } else {
                if (cls != Qn4.class) {
                    if (cls == C8272QnE.class) {
                        return new C8272QnE(this.A01, this.A03);
                    } else if (cls == C8264Qn6.class) {
                        return new C8264Qn6(this.A01, this.A06);
                    } else if (cls == QDC.class) {
                        return new QDC(this.A01, this.A04);
                    } else if (cls == C8265Qn7.class) {
                        return new C8265Qn7(this.A01, this.A03);
                    } else if (cls == C8268QnA.class) {
                        return new C8268QnA(this.A01, this.A07);
                    } else if (cls == QD5.class) {
                        return new QD5(this.A00, this.A01);
                    } else if (cls == QDB.class) {
                        return new QDB(this.A01);
                    } else {
                        if (cls == C8271QnD.class) {
                            C10447RsO rsO = this.A09;
                            return new C8271QnD(this.A00, this.A01, rsO);
                        } else if (cls == C8266Qn8.class) {
                            return new C8266Qn8(this.A01, this.A02);
                        } else if (cls == C8273QnF.class) {
                            return new C8273QnF(this.A01, this.A08, this.A0A);
                        } else if (cls != C7426QCr.class) {
                            if (cls == C8270QnC.class) {
                                return new C8270QnC(this.A01, this.A0A);
                            } else if (cls == QD1.class) {
                                return new QD1(this.A0B);
                            } else {
                                if (cls == C7431QCw.class) {
                                    return new C7431QCw();
                                }
                                throw DbW.A0c(cls.getName(), " cannot be created");
                            }
                        }
                    }
                }
            }
        }
        Object obj = null;
        obj.getClass();
        throw AnonymousClass00P.createAndThrow();
    }

    public C11665Se8(QuickPerformanceLogger quickPerformanceLogger, 2FO r2, C10588Rui rui, C10696Rwa rwa, C10444RsL rsL, C10445RsM rsM, C10446RsN rsN, S2Q s2q, C10447RsO rsO, S2S s2s, UserSession userSession, SEL sel) {
        this.A01 = r2;
        this.A00 = quickPerformanceLogger;
        this.A07 = s2q;
        this.A03 = rwa;
        this.A06 = rsN;
        this.A04 = rsL;
        this.A09 = rsO;
        this.A05 = rsM;
        this.A02 = rui;
        this.A0A = s2s;
        this.A08 = s2q;
        this.A0B = sel;
        this.A0C = userSession;
    }
}
