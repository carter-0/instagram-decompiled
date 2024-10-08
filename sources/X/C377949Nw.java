package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Nw  reason: invalid class name and case insensitive filesystem */
public final class C377949Nw extends C392289uY {
    public C39761A8b A00;
    public O7Z A01;
    public AnonymousClass2Ep A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass7SU A05;
    public final C370928xI A06 = new C370928xI(this);
    public final C3725091e A07;
    public final C370948xK A08;
    public final AnonymousClass91K A09 = new C370938xJ(this);
    public final 1Av A0A;

    public static void A00(C377949Nw r3) {
        C74324Pt0 pt0 = r3.A00;
        if (pt0 != null) {
            pt0.onDismiss();
        }
        AnonymousClass2Ep r0 = r3.A02;
        if (r0 != null) {
            C3725091e r2 = r3.A07;
            String C6C = r0.C6C();
            if (!TextUtils.isEmpty(C6C)) {
                r2.A03.remove(C6C);
            }
        }
        0xY A0p = AnonymousClass7TE.A0p(r3.A0A);
        A0p.E5T("unsend_warning_banner_dismissed", true);
        A0p.apply();
    }

    public final boolean A08(AnonymousClass2Ep r5) {
        if (182.A06(0Tu.A05, this.A04, 36310435204431979L)) {
            0xa r3 = this.A0A.A01;
            if (!r3.getBoolean("unsend_warning_banner_dismissed", false) && r3.getInt("unsend_warning_banner_shown_count", 0) < 2) {
                r5.getClass();
                String C6C = r5.C6C();
                if (C6C == null || !r3.getBoolean(002.A0R(C66579MXk.A00(177), C6C), false)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C377949Nw(AnonymousClass0iw r3, UserSession userSession, AnonymousClass7SU r5) {
        this.A04 = userSession;
        this.A03 = r3;
        this.A0A = 1Au.A00(userSession);
        this.A07 = (C3725091e) userSession.A01(C3725091e.class, new C3725191f(userSession));
        this.A08 = new C370948xK(r3, userSession);
        this.A05 = r5;
    }
}
