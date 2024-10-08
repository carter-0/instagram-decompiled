package X;

import android.content.Context;
import java.util.Locale;

public final class SNY {
    public final Context A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(TUU.A00);
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(TUV.A00);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(TUW.A00);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(TUX.A00);

    public static final C8286QnS A01(QXI qxi) {
        C7799QXk A0E;
        QXF A0F;
        QXH A0H;
        QXG A0G;
        QXE A0E2;
        C7795QXg A0E3;
        QXL A0F2;
        QVG A0S;
        QXW A0E4;
        C7719QUi A0E5;
        C7790QXb A0E6;
        QVE A0E7;
        QXN A0E8;
        QSH A0E9;
        C7791QXc qXc;
        QVK A0E10;
        if (qxi == null || (A0E = qxi.A0E()) == null) {
            return null;
        }
        QRV A0I = A0E.A0I();
        if ((A0I == null || (qXc = (C7791QXc) A0I.A01(C7791QXc.class, -507874568)) == null || (A0E10 = qXc.A0E()) == null || (A0S = Pxj.A0S(A0E10)) == null) && (((A0F = A0E.A0F()) == null || (A0E8 = A0F.A0E()) == null || (A0E9 = A0E8.A0E()) == null || (A0S = Pxj.A0S(A0E9)) == null) && (((A0H = A0E.A0H()) == null || (A0E6 = A0H.A0E()) == null || (A0E7 = A0E6.A0E()) == null || (A0S = Pxj.A0S(A0E7)) == null) && (((A0G = A0E.A0G()) == null || (A0E4 = A0G.A0E()) == null || (A0E5 = A0E4.A0E()) == null || (A0S = Pxj.A0S(A0E5)) == null) && ((A0E2 = A0E.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (A0F2 = A0E3.A0F()) == null || (A0S = Pxj.A0S(A0F2)) == null))))) {
            return null;
        }
        return SPz.A03(A0S);
    }

    public static final C7551QIu A00(String str) {
        0bb r2 = new 0bb();
        r2.A06("mutation_data", str);
        Locale locale = Locale.US;
        0qQ.A08(locale);
        r2.A01(C69426NlW.valueOf(Pxf.A0n(locale, "CREATE")), "mutation_type");
        return r2;
    }

    public SNY(Context context) {
        this.A00 = context;
    }
}
