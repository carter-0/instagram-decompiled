package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7VS  reason: invalid class name */
public final class AnonymousClass7VS {
    public Boolean A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final 1a8 A03 = new 1a8((C269794fh) null);
    public final UserSession A04;
    public final AnonymousClass7VU A05;
    public final C254783t2 A06;
    public final AnonymousClass0eK A07;
    public final C62320sa A08;

    public AnonymousClass7VS(AnonymousClass4DH r3, AnonymousClass0iw r4, UserSession userSession, C254783t2 r6, AnonymousClass0eK r7, C62320sa r8) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
        this.A01 = r3;
        this.A04 = userSession;
        this.A02 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A05 = AnonymousClass7VT.A00(userSession);
    }

    public final void maybeRedirectThread() {
        UserSession userSession = this.A04;
        if (182.A06(0Tu.A05, userSession, 2342156064350996112L)) {
            C254783t2 r1 = this.A06;
            if ((r1 instanceof C254773t1) && ((Boolean) this.A08.invoke()).booleanValue()) {
                AnonymousClass7VU r2 = this.A05;
                AnonymousClass4DH r4 = this.A01;
                r2.A01(r4.getActivity(), r4, this.A02, userSession, AnonymousClass6W3.A01(r1), (List) this.A07.get());
                this.A03.A02(MYb.A00(MYc.A01(r2.A00, "IGDThreadCutoverHelper").A01).A0N(new C40265AYe(C74070PoZ.A00)).A0P(C318146oT.A01), new C40721Ahq(this));
            }
        }
    }
}
