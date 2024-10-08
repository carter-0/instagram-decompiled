package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ne8  reason: case insensitive filesystem */
public final class C69069Ne8 extends C252733pa implements C66514MUs {
    public C74480Pva A00;
    public final 05G A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final UserSession A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;

    public C69069Ne8(UserSession userSession) {
        super("search_interop", AnonymousClass43D.A00(359266386));
        this.A04 = userSession;
        02z A1J = JTO.A1J();
        this.A05 = A1J;
        this.A07 = A1J;
        02z A10 = C51970G9q.A10(false);
        this.A02 = A10;
        this.A06 = A10;
        02z A0q = JTQ.A0q();
        this.A01 = A0q;
        this.A03 = A0q;
        C74480Pva A002 = C67252Mkm.A00(userSession);
        this.A00 = A002;
        if (A002 != null) {
            A002.start();
        }
        C74480Pva pva = this.A00;
        if (pva != null) {
            pva.CgG();
        }
        C74480Pva pva2 = this.A00;
        if (pva2 != null) {
            PU7.A00(pva2.ANW().A0P(C318146oT.A01), C66581MXm.A0P(), this, 5);
        }
    }

    public final void FLH(String str) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0Ud BqH() {
        return this.A07;
    }

    public final AnonymousClass0Ud CWW() {
        return this.A06;
    }
}
