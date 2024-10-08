package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dew  reason: case insensitive filesystem */
public final class C46434Dew extends C249383je implements C229122ms, C229132mt {
    public String A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public int A04;
    public final AnonymousClass07Z A05;
    public final UserSession A06;
    public final C14190TrU A07;
    public final C51923G7r A08;

    public final boolean CWV() {
        return true;
    }

    public final void ACw() {
        if (this.A05.getLifecycle().A07().compareTo(07U.A04) >= 0 && !this.A02 && !this.A01 && AnonymousClass7TF.A1V(this.A00)) {
            CgO();
        }
    }

    public final boolean CJz() {
        return this.A08.CJz();
    }

    public final boolean CKB() {
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final boolean CT5() {
        return this.A01;
    }

    public final void CgO() {
        this.A08.CgO();
    }

    public final boolean isLoading() {
        if (this.A02) {
            return true;
        }
        if (!AnonymousClass7TF.A1V(this.A00) || this.A01) {
            return false;
        }
        return true;
    }

    public C46434Dew(AnonymousClass07Z r4, UserSession userSession, C51923G7r g7r) {
        AnonymousClass7TG.A1U(r4, g7r, userSession);
        this.A05 = r4;
        this.A08 = g7r;
        this.A06 = userSession;
        this.A07 = new C14190TrU(userSession, this, AnonymousClass05K.A01, 4);
    }

    public final void onScroll(C238133Ar r10, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(-1172376703);
        0qQ.A0B(r10, 0);
        this.A03 = i5;
        this.A07.onScroll(r10, i, i2, i3, i4, i5);
        AnonymousClass0fD.A0A(1312467857, A032);
    }

    public final void onScrollStateChanged(C238133Ar r4, int i) {
        int A0D = AnonymousClass7TG.A0D(r4, -82591321);
        if (r4.COw() && this.A03 <= 0 && i == 0 && this.A04 == 1) {
            this.A08.DhN();
        }
        this.A04 = i;
        this.A07.onScrollStateChanged(r4, i);
        AnonymousClass0fD.A0A(2049895578, A0D);
    }
}
