package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

public final class JAP extends 0Yg implements 0sL {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ C57012ILe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ C62320sa A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JAP(C284945Oz r2, C57012ILe iLe, UserSession userSession, AnonymousClass4DU r5, String str, C62320sa r7, C62320sa r8, C62320sa r9, C62320sa r10) {
        super(2);
        this.A02 = userSession;
        this.A03 = r5;
        this.A01 = iLe;
        this.A04 = str;
        this.A08 = r7;
        this.A07 = r8;
        this.A05 = r9;
        this.A06 = r10;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        C286575Wy r8 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2007544591, "com.instagram.barcelonaig.fragment.BarcelonaIgScreen.<anonymous>.<anonymous> (BarcelonaIgScreen.kt:84)");
            }
            UserSession userSession = this.A02;
            AnonymousClass4DU r12 = this.A03;
            C57012ILe iLe = this.A01;
            String str = this.A04;
            C62320sa r14 = this.A08;
            C54852HVj.A00(r8, iLe, (C53008Ggz) null, userSession, r12, str, r14, this.A07, this.A05, this.A06, 384, 256);
            C284945Oz r6 = this.A00;
            C55706Hm3 hm3 = (C55706Hm3) r6.getValue();
            if (hm3 != null) {
                String str2 = hm3.A01;
                String str3 = hm3.A02;
                Boolean bool = hm3.A00;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                C66920MfE mfE = new C66920MfE(2, 0, z);
                C299645vb r11 = C299645vb.A00;
                Object A0m = C51967G9n.A0m(r8, -516924160);
                Object obj3 = AnonymousClass5XT.A00;
                if (A0m == obj3) {
                    A0m = new C58707IwG((Object) r6, 39);
                    r8.FLL(A0m);
                }
                C62320sa r2 = (C62320sa) A0m;
                C286565Wx A0H = C51965G9l.A0H(r8, false);
                boolean A1Y = C51967G9n.A1Y(r8, r14, -516922206);
                Object ECw = r8.ECw();
                if (A1Y || ECw == obj3) {
                    ECw = new C59111J6t(r14, 31);
                    r8.FLL(ECw);
                }
                C54826HUh.A00(r8, (Modifier) null, mfE, (C52969GgM) null, r11, str2, str3, r2, C51965G9l.A10(A0H, ECw), JK6.A00, 1600512, 384);
            }
            if (0fL.A02()) {
                0fL.A00(-391637762);
            }
        } else {
            r8.Evl();
        }
        return C60340gF.A00;
    }
}
