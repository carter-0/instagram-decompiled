package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.Map;

public final class SRV {
    public QuickPerformanceLogger A00;
    public C10302Rq0 A01;
    public C11168SDi A02;
    public C11665Se8 A03;
    public C9830Rhs A04;
    public SIG A05;
    public 2FO A06;
    public SDj A07;
    public final Context A08;
    public final UserSession A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;

    public final Fragment A03(Bundle bundle, String str) {
        Fragment A002 = ((C10987S3z) this.A0B.get()).A00(bundle, str);
        A002.getClass();
        return A002;
    }

    public final Fragment A04(Bundle bundle, String str) {
        Fragment A012 = ((C10987S3z) this.A0B.get()).A01(bundle, str);
        A012.getClass();
        return A012;
    }

    public final 2FO A05() {
        2FO r1 = this.A06;
        if (r1 != null) {
            return r1;
        }
        C12410Stn stn = new C12410Stn(new S40(AnonymousClass0kN.A00(new C12765T5z(this), 0kJ.A05, this.A09)));
        this.A06 = stn;
        return stn;
    }

    public final SDj A06() {
        SDj sDj = this.A07;
        if (sDj != null) {
            return sDj;
        }
        SDj sDj2 = new SDj(this.A09);
        this.A07 = sDj2;
        return sDj2;
    }

    public SRV(Context context, UserSession userSession, AnonymousClass0eK r3, AnonymousClass0eK r4) {
        this.A08 = context;
        this.A0B = r3;
        this.A0A = r4;
        this.A09 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, X.RPg] */
    public static 2YN A00(AnonymousClass07g r15) {
        SRV A0E = AnonymousClass2E0.A0E();
        C11665Se8 se8 = A0E.A03;
        if (se8 == null) {
            UserSession userSession = A0E.A09;
            IGPaymentMethodsAPI iGPaymentMethodsAPI = new IGPaymentMethodsAPI(userSession, "FBPAY_HUB");
            AnonymousClass0eK r3 = A0E.A0A;
            S2Q s2q = new S2Q((AnonymousClass5A3) r3.get(), iGPaymentMethodsAPI);
            C10696Rwa rwa = new C10696Rwa((AnonymousClass5A3) r3.get(), new C45439CwM(userSession));
            AnonymousClass5A3 r2 = (AnonymousClass5A3) r3.get();
            C10302Rq0 rq0 = A0E.A01;
            if (rq0 == null) {
                rq0 = new C10302Rq0(userSession);
                A0E.A01 = rq0;
            }
            C10444RsL rsL = new C10444RsL(r2, rq0);
            C10446RsN rsN = new C10446RsN((AnonymousClass5A3) r3.get(), new C45283Ctm(A0E.A08, userSession));
            C10447RsO rsO = new C10447RsO((AnonymousClass5A3) r3.get(), new C10304Rq2(userSession));
            C10445RsM rsM = new C10445RsM((AnonymousClass5A3) r3.get(), new C10303Rq1(userSession));
            C10588Rui rui = new C10588Rui((AnonymousClass5A3) r3.get(), new Object());
            S2S s2s = new S2S((AnonymousClass5A3) r3.get(), new C10491Rt6(userSession));
            SEL sel = new SEL(userSession);
            2FO A052 = A0E.A05();
            02m r32 = A0E.A00;
            if (r32 == null) {
                r32 = 02m.A0p;
                A0E.A00 = r32;
            }
            se8 = new C11665Se8(r32, A052, rui, rwa, rsL, rsM, rsN, s2q, rsO, s2s, userSession, sel);
            A0E.A03 = se8;
        }
        return new 2YN(se8, r15);
    }

    public static QuickPerformanceLogger A01() {
        SRV A0E = AnonymousClass2E0.A0E();
        QuickPerformanceLogger quickPerformanceLogger = A0E.A00;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        02m r0 = 02m.A0p;
        A0E.A00 = r0;
        return r0;
    }

    public static 2FO A02(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return AnonymousClass2E0.A0E().A05();
    }
}
