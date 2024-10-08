package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.4GC  reason: invalid class name */
public final class AnonymousClass4GC implements AnonymousClass4GD {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final C246733f9 A03;
    public final AnonymousClass2lU A04;
    public final AnonymousClass2xS A05;

    public AnonymousClass4GC(Fragment fragment, UserSession userSession, AnonymousClass311 r4, C246733f9 r5, AnonymousClass2lU r6, AnonymousClass2xS r7) {
        0qQ.A0B(r5, 4);
        this.A02 = r4;
        this.A00 = fragment;
        this.A01 = userSession;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
    }

    public final void DKF(C240983Nk r7, C279064y1 r8, 1Xj r9, AnonymousClass3W1 r10) {
        String str;
        0qQ.A0B(r9, 1);
        0qQ.A0B(r10, 2);
        r10.A0I(r7);
        AnonymousClass2lU r3 = this.A04;
        if (r3 != null && r3.A0A(this.A00.getModuleName())) {
            if (r7.A02 == null && r7.A04 == null && r7.A03 == null) {
                r3.A02(r9);
                return;
            }
            String id = r9.getId();
            boolean A06 = 182.A06(0Tu.A05, this.A01, 36322774645483932L);
            if (r9.CeS() && id != null && !r3.A06.contains(id) && A06) {
                1Xj A002 = this.A05.A00();
                if (r9.getId() != null) {
                    String id2 = r9.getId();
                    if (A002 != null) {
                        str = A002.getId();
                    } else {
                        str = null;
                    }
                    if (0qQ.A0K(id2, str)) {
                        return;
                    }
                }
            }
            r3.A03(r9);
        }
    }

    public final void DPo(1Xj r1) {
    }

    public final void DWW(1Xj r8, AnonymousClass3V3 r9, AnonymousClass3W1 r10, int i) {
        1Xj r0;
        1Xj r2 = r8;
        0qQ.A0B(r8, 0);
        AnonymousClass3W1 r4 = r10;
        if (r8.A5D()) {
            r0 = r8.A1c(r10.A03);
            if (r0 == null) {
                return;
            }
        } else {
            r0 = r8;
        }
        if (r0.BR7() == 1iA.A0a) {
            this.A05.A08(r2, r9, r4, (C262864Gh) null, i);
        }
    }

    public final B1Y Am8() {
        return this.A02.Am8();
    }

    public final C279134y8 AmB() {
        return this.A02.AmB();
    }

    public final C246453ed BQd() {
        return this.A02.BQd();
    }

    public final C246873fN BQx() {
        return this.A02.BQx();
    }

    public final C262864Gh BR1() {
        return this.A02.BR1();
    }

    public final AnonymousClass4H6 BYF() {
        return this.A02.BYF();
    }

    public final C262994Gu BYI() {
        return this.A02.BYI();
    }
}
