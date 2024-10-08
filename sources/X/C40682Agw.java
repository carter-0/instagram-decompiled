package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.Agw  reason: case insensitive filesystem */
public final class C40682Agw implements AnonymousClass8GR {
    public final int A00;
    public final Object A01;

    public C40682Agw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dkw() {
        A8U a8u;
        switch (this.A00) {
            case 0:
                a8u = ((AS8) this.A01).A08;
                break;
            case 1:
                a8u = ((C17667Vby) this.A01).A02;
                break;
            default:
                AnonymousClass80U r1 = ((C366308of) this.A01).A09.A00.A08;
                0qQ.A0B(r1, 0);
                r1.E3H(new Object());
                return;
        }
        C15331Uag uag = a8u.A00;
        C39749A7p A012 = uag.A01();
        AH4 ah4 = A012.A03;
        A3E a3e = A012.A02;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.putAll(a3e.A00);
        ARU aru = A012.A00;
        0qQ.A0B(aru, 1);
        A7O a7o = new A7O();
        C392549uz r3 = C39625A2p.A02;
        0qQ.A0B(r3, 0);
        a7o.A03 = AnonymousClass7TE.A1a(A1E.get(r3));
        C392549uz r0 = C39625A2p.A03;
        0qQ.A0B(r0, 0);
        a7o.A05 = AnonymousClass7TE.A1a(A1E.get(r0));
        0qQ.A0B(r3, 0);
        a7o.A04 = AnonymousClass7TE.A1a(A1E.get(r3));
        C392549uz r02 = C39625A2p.A01;
        0qQ.A0B(r02, 0);
        boolean containsKey = A1E.containsKey(r02);
        if (containsKey) {
            a7o.A00 = (File) A1E.get(r02);
        }
        ah4.A08.Ddr(new AVZ(true));
        ((C344477rv) ah4.A0A.Ape(C344477rv.A01)).getHandler().post(new C41196Apu(a7o, aru, ah4, containsKey));
        uag.A02().A02(C16612Uy8.PHOTO_CAPTURE_STARTED, "", (String) null);
    }
}
