package X;

import android.graphics.drawable.Drawable;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Jj2  reason: case insensitive filesystem */
public final class C60303Jj2 extends 2YL {
    public boolean A00 = true;
    public boolean A01 = true;
    public final UserSession A02;
    public final C352168Bz A03;
    public final 1Av A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;

    public C60303Jj2(UserSession userSession, C352168Bz r7) {
        AnonymousClass7TF.A1B(userSession, 1, r7);
        this.A02 = userSession;
        this.A03 = r7;
        this.A04 = 1Au.A00(userSession);
        02z A10 = DbS.A10(new L6J((Integer) null, 00k.A0k(r7.A00), r7.A07()));
        this.A07 = A10;
        this.A08 = 10b.A03(A10);
        1HR A0o = JTQ.A0o();
        this.A05 = A0o;
        this.A06 = 0u9.A04(A0o);
        C318136oS A002 = C318116oQ.A00(this);
        C66183MGu mGu = new C66183MGu(this, (AnonymousClass4D7) null, 33);
        19B r3 = 19B.A00;
        1Eo.A05(r3, new C66183MGu(this, (AnonymousClass4D7) null, 35), C51967G9n.A0M(this, r3, new C66183MGu(this, (AnonymousClass4D7) null, 34), C51967G9n.A0M(this, r3, mGu, A002)));
    }

    public static final Drawable A00(Drawable drawable, C60303Jj2 jj2) {
        if (!(drawable instanceof C347017w8)) {
            return drawable;
        }
        Drawable A042 = ((C347017w8) drawable).A04();
        0qQ.A07(A042);
        return A00(A042, jj2);
    }

    public final void A03(Drawable drawable, int i) {
        C391909ts r0;
        C352168Bz r3 = this.A03;
        if (drawable instanceof C321026tS) {
            C321026tS r1 = (C321026tS) drawable;
            UserSession userSession = r3.A02;
            if (r1.CZ7(userSession)) {
                if (r1.Cdq()) {
                    r0 = KLN.A00;
                    C352168Bz.A02(r0, r3);
                }
                if (!00k.A0k(r3.A00).contains(Integer.valueOf(i))) {
                    C352168Bz.A00(drawable, r3, i);
                } else {
                    C352168Bz.A01(drawable, r3, i, false);
                }
                C352168Bz.A02(KLO.A00, r3);
                27r A012 = 27p.A01(userSession);
                C59725JVj jVj = A012.A04.A0C;
                if (A012.A0J() != null && jVj != null) {
                    A012.A1Q(jVj, "STORY_TEMPLATE_EDITOR_ELEMENT_TAPPED");
                    return;
                }
                return;
            }
        }
        r0 = KLP.A00;
        C352168Bz.A02(r0, r3);
    }

    public static final void A01(C62759Klx klx, C60303Jj2 jj2) {
        1Eo.A05(JTO.A1F(), new MH1(klx, jj2, (AnonymousClass4D7) null, 31), C318116oQ.A00(jj2));
    }

    public final void A02() {
        C61770KLj kLj;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Object value = this.A07.getValue();
        if ((value instanceof C61770KLj) && (kLj = (C61770KLj) value) != null) {
            C352168Bz r2 = this.A03;
            r2.A06(kLj.A01);
            Boolean valueOf = Boolean.valueOf(kLj.A01);
            A1H.put(AppStateModule.APP_STATE_BACKGROUND, valueOf);
            r2.A05.Epw(valueOf);
        }
        A01(new C61767KLg(A1H), this);
    }
}
