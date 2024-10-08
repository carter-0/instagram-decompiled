package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.Ghd  reason: case insensitive filesystem */
public final class C53045Ghd extends 2YL implements C229122ms, C229132mt {
    public final C54431HDe A00;
    public final String A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;
    public final UserSession A05;
    public final C54140H0k A06;
    public final 05G A07;

    public final boolean CT5() {
        return false;
    }

    public final void A00() {
        String str;
        C54431HDe hDe = this.A00;
        String str2 = this.A01;
        C16672Uz8 uz8 = (C16672Uz8) this.A02.getValue();
        0qQ.A0B(uz8, 1);
        C61077JwF jwF = (C61077JwF) ((Map) hDe.A01.getValue()).get(uz8);
        if (jwF != null && !DbX.A1b(hDe.A03) && jwF.A02 && DbS.A05(jwF.A00) < 150) {
            int ordinal = uz8.ordinal();
            if (ordinal == 1) {
                str = "TOP";
            } else if (ordinal == 3) {
                str = "RECENT";
            } else {
                throw C51973G9u.A0g(uz8, AnonymousClass000.A00(485), AnonymousClass7TE.A1A());
            }
            AnonymousClass7TE.A1Z(new JVS(uz8, jwF, hDe, str2, str, (AnonymousClass4D7) null, 15), hDe.A01);
        }
    }

    public final void ACw() {
        String str;
        C54140H0k h0k = this.A06;
        HOV hov = h0k.A00;
        if (hov == null) {
            str = "entrySurface";
        } else {
            UserSession A0l = AnonymousClass7TE.A0l(h0k.A08);
            1Xj r4 = h0k.A02;
            if (r4 == null) {
                str = "entryMedia";
            } else {
                0qQ.A0B(A0l, 1);
                C55209Hdz.A00(hov, h0k, A0l, r4, AnonymousClass05K.A0j, (String) null, AnonymousClass7TE.A1H());
                A00();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CJz() {
        return !((Collection) this.A03.getValue()).isEmpty();
    }

    public final boolean CKB() {
        C61077JwF jwF = (C61077JwF) ((Map) this.A00.A04.getValue()).get(this.A02.getValue());
        if (jwF == null || !jwF.A02) {
            return false;
        }
        return true;
    }

    public final boolean isLoading() {
        return DbX.A1b(this.A07);
    }

    public C53045Ghd(UserSession userSession, C54140H0k h0k, String str) {
        AnonymousClass7TG.A1U(userSession, str, h0k);
        this.A05 = userSession;
        this.A01 = str;
        this.A06 = h0k;
        C54431HDe hDe = new C54431HDe(userSession);
        this.A00 = hDe;
        this.A04 = hDe.A05;
        02z A10 = DbS.A10(C16672Uz8.TOP);
        this.A02 = A10;
        this.A07 = hDe.A03;
        C61820pm A032 = AnonymousClass10H.A03(new C66193MHj(46, (AnonymousClass4D7) null), hDe.A04, A10);
        this.A03 = 10b.A02(0sn.A00, C318116oQ.A00(this), A032, AnonymousClass10A.A01);
    }

    public final boolean CWV() {
        return CKB();
    }

    public final void CgO() {
        A00();
    }
}
