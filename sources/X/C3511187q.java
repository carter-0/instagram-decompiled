package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.87q  reason: invalid class name and case insensitive filesystem */
public final class C3511187q extends 2YL {
    public C390159qp A00;
    public A7X A01;
    public Medium A02;
    public 1Xj A03;
    public boolean A04;
    public final UserSession A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08 = 106.A01((Object) null);

    public C3511187q(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        1HR r0 = new 1HR(0);
        this.A06 = r0;
        this.A07 = 0u9.A04(r0);
    }

    public final void A03(1Xj r5) {
        A00();
        this.A04 = false;
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new C58105ImR((Object) this, (Object) r5, (AnonymousClass4D7) null, 31), A002);
        this.A03 = r5;
        this.A02 = null;
    }

    public final void A00() {
        C390159qp r2 = this.A00;
        if (r2 != null) {
            C14044Tol tol = r2.A00;
            if (tol != null) {
                tol.A0B("auto");
            }
            r2.A00 = null;
        }
        A7X a7x = this.A01;
        if (a7x != null) {
            STU stu = a7x.A00;
            if (stu != null) {
                stu.A07();
            }
            a7x.A00 = null;
        }
        this.A00 = null;
        this.A01 = null;
        this.A08.Epw((Object) null);
    }

    public final void A01() {
        STU stu;
        C14044Tol tol;
        C390159qp r0 = this.A00;
        if (!(r0 == null || (tol = r0.A00) == null)) {
            tol.A0A("auto");
        }
        A7X a7x = this.A01;
        if (!(a7x == null || (stu = a7x.A00) == null)) {
            stu.A05();
        }
        if (this.A04) {
            A7X a7x2 = this.A01;
            if (a7x2 != null) {
                STU stu2 = a7x2.A00;
                if (stu2 != null) {
                    stu2.A06();
                    return;
                }
                return;
            }
            Medium medium = this.A02;
            if (medium != null) {
                A02(medium);
                return;
            }
            return;
        }
        C390159qp r02 = this.A00;
        if (r02 != null) {
            C14044Tol tol2 = r02.A00;
            if (tol2 != null) {
                tol2.A0C("auto", false);
                return;
            }
            return;
        }
        1Xj r03 = this.A03;
        if (r03 != null) {
            A03(r03);
        }
    }

    public final void A02(Medium medium) {
        A00();
        this.A04 = true;
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new C58105ImR((Object) this, (Object) medium, (AnonymousClass4D7) null, 32), A002);
        this.A03 = null;
        this.A02 = medium;
    }
}
