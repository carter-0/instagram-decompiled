package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.4ni  reason: invalid class name and case insensitive filesystem */
public final class C274104ni implements C274114nj {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final C246733f9 A03;
    public final AnonymousClass2lU A04;

    public C274104ni(Fragment fragment, UserSession userSession, AnonymousClass311 r4, C246733f9 r5, AnonymousClass2lU r6) {
        0qQ.A0B(r5, 4);
        this.A02 = r4;
        this.A00 = fragment;
        this.A01 = userSession;
        this.A03 = r5;
        this.A04 = r6;
    }

    public final void DKE(C240983Nk r3, C262804Gb r4, 1Xj r5, AnonymousClass3W1 r6) {
        0qQ.A0B(r5, 1);
        r6.A0I(r3);
        AnonymousClass2lU r1 = this.A04;
        if (r1 != null && r1.A0A(this.A00.getModuleName())) {
            if (r3.A02 == null && r3.A04 == null && r3.A03 == null) {
                r1.A02(r5);
            } else {
                r1.A03(r5);
            }
        }
    }

    public final void DPn(1Xj r1) {
    }

    public final C274184nq Alq() {
        return this.A02.Alq();
    }

    public final B1Y Am8() {
        return this.A02.Am8();
    }

    public final C246453ed BQd() {
        return this.A02.BQd();
    }

    public final C262864Gh BR1() {
        return this.A02.BR1();
    }

    public final AnonymousClass47O BR2() {
        return this.A02.BR2();
    }

    public final AnonymousClass4H6 BYF() {
        return this.A02.BYF();
    }

    public final C262994Gu BYI() {
        return this.A02.BYI();
    }
}
