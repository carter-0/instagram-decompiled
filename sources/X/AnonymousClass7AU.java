package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7AU  reason: invalid class name */
public final class AnonymousClass7AU extends AnonymousClass7PK implements AnonymousClass7Pe {
    public final UserSession A00;
    public final C328327Ej A01;
    public final C328347El A02;
    public final AnonymousClass9HC A03;
    public final AnonymousClass7L2 A04;
    public final 17i A05;

    public final /* bridge */ /* synthetic */ void A03(C331837So r3) {
        AnonymousClass7LQ r32 = (AnonymousClass7LQ) r3;
        C328327Ej r0 = this.A01;
        if (r32 != null) {
            r32.A0e.A0L = r0.A01;
        }
        super.A03(r32);
    }

    public final AnonymousClass7EF Bjp() {
        return ((AnonymousClass7Pe) this.A00).Bjp();
    }

    public AnonymousClass7AU(C249703kE r3, C232232tF r4, UserSession userSession, C328347El r6, C332807Wl r7, AnonymousClass9HC r8, AnonymousClass7L2 r9) {
        super(r3, r4);
        this.A00 = userSession;
        this.A05 = 17h.A00(userSession);
        this.A04 = r9;
        this.A03 = r8;
        this.A01 = new C328327Ej(r3.itemView, r7);
        this.A02 = r6;
    }

    public final void A01() {
        super.A01();
        AnonymousClass7LQ r0 = (AnonymousClass7LQ) this.A00;
        if (r0 != null) {
            r0.A0e.A0L = null;
        }
    }
}
