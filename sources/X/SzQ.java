package X;

import android.util.Base64;
import android.util.Log;

public final class SzQ implements C13652TeJ {
    public final C10613Rv7 A00;

    public SzQ(C10613Rv7 rv7) {
        this.A00 = rv7;
    }

    public final AnonymousClass9GD EHU(RPW rpw) {
        AnonymousClass9GD r5;
        C10613Rv7 rv7 = this.A00;
        SOT sot = rv7.A01;
        if (sot == null) {
            C8360QpI qpI = new C8360QpI(-2, (Throwable) null);
            AnonymousClass9GD r52 = new AnonymousClass9GD();
            r52.A0B(qpI);
            return r52;
        }
        RPW rpw2 = rpw;
        try {
            byte[] decode = Base64.decode(((C8610Qxs) rpw2).A00, 10);
            rv7.A00.A01("requestIntegrityToken(%s)", rpw);
            C365498nD r8 = new C365498nD();
            C8620QyE qyE = new C8620QyE(r8, r8, rpw2, rv7, decode);
            Object obj = sot.A07;
            synchronized (obj) {
                sot.A0A.add(r8);
                r5 = r8.A00;
                r5.A03(new C12599Syy(r8, sot));
            }
            synchronized (obj) {
                if (sot.A0B.getAndIncrement() > 0) {
                    C11229SGh sGh = sot.A06;
                    if (Log.isLoggable("PlayCore", 3)) {
                        002.A0g(sGh.A00, " : ", "Already connected to the service.");
                    }
                }
            }
            sot.A01().post(new C8618QyC(qyE.A00, qyE, sot));
            return r5;
        } catch (IllegalArgumentException e) {
            C8360QpI qpI2 = new C8360QpI(-13, e);
            AnonymousClass9GD r53 = new AnonymousClass9GD();
            r53.A0B(qpI2);
            return r53;
        }
    }
}
