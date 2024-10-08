package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Pd  reason: invalid class name and case insensitive filesystem */
public abstract class C331017Pd extends AnonymousClass7PK implements AnonymousClass7Pe {
    public final C328327Ej A00;

    public final void A03(C331837So r3) {
        AnonymousClass7LQ r1;
        if (r3 instanceof AnonymousClass7LQ) {
            r1 = (AnonymousClass7LQ) r3;
        } else {
            r1 = null;
        }
        C328327Ej r0 = this.A00;
        if (r1 != null) {
            r1.A0e.A0L = r0.A01;
        }
        super.A03(r3);
    }

    public C232262tL A05(AnonymousClass7LQ r11) {
        UserSession userSession;
        C328607Fl r3;
        AnonymousClass752 r2;
        17i r8;
        AnonymousClass7L2 r7;
        AnonymousClass9HC r5;
        Context context;
        AnonymousClass7LQ r6 = r11;
        if (this instanceof C328267Ed) {
            C328267Ed r1 = (C328267Ed) this;
            0qQ.A0B(r11, 0);
            AnonymousClass73U r22 = r1.A01;
            Context context2 = r1.itemView.getContext();
            0qQ.A07(context2);
            UserSession userSession2 = r1.A00;
            17i r82 = r1.A04;
            return r22.AWb(context2, userSession2, r1.A02, r6, r1.A03, r82, false);
        } else if (this instanceof AnonymousClass75P) {
            AnonymousClass75P r0 = (AnonymousClass75P) this;
            int intValue = r0.A05.intValue();
            if (intValue == 0) {
                context = r0.itemView.getContext();
                userSession = r0.A00;
                r8 = r0.A04;
                r7 = r0.A03;
                r5 = r0.A02;
                r2 = C3259874y.A05(context, userSession, r5, r6, r7, r8);
            } else if (intValue == 1) {
                context = r0.itemView.getContext();
                userSession = r0.A00;
                r8 = r0.A04;
                r7 = r0.A03;
                r5 = r0.A02;
                r2 = C3259874y.A04(context, userSession, r5, r6, r7, r8);
                if (r2.A04 instanceof AnonymousClass754) {
                    r3 = AnonymousClass7FX.A04(context, userSession, r5, r6, r7, r8);
                    0qQ.A0B(userSession, 0);
                    return new AnonymousClass75R(r3, r2, r11.A0e.A0h());
                }
            } else if (intValue == 2) {
                AnonymousClass75Q r23 = r0.A01;
                Context context3 = r0.itemView.getContext();
                UserSession userSession3 = r0.A00;
                17i r83 = r0.A04;
                return r23.AWb(context3, userSession3, r0.A02, r6, r0.A03, r83, false);
            } else {
                throw new IllegalStateException(002.A0R("Unknown reel share type ", "SHARE"));
            }
            r3 = AnonymousClass7FX.A05(context, userSession, r5, r6, r7, r8, false);
            0qQ.A0B(userSession, 0);
            return new AnonymousClass75R(r3, r2, r11.A0e.A0h());
        } else {
            C3257173w r12 = (C3257173w) this;
            C3257373y r24 = r12.A01;
            Context context4 = r12.itemView.getContext();
            UserSession userSession4 = r12.A00;
            17i r84 = r12.A04;
            return r24.AWb(context4, userSession4, r12.A02, r6, r12.A03, r84, false);
        }
    }

    public final AnonymousClass7EF Bjp() {
        return ((AnonymousClass7Pe) this.A00).Bjp();
    }

    public final void DAV(float f, float f2) {
        C249703kE r1 = this.A00;
        if (r1 instanceof AnonymousClass7PN) {
            ((AnonymousClass7PN) r1).DAV(f, f2);
        } else {
            super.DAV(f, f2);
        }
    }

    public C331017Pd(C249703kE r3, C232232tF r4, C332807Wl r5) {
        super(r3, r4);
        this.A00 = new C328327Ej(r3.itemView, r5);
    }

    public final void A01() {
        AnonymousClass7LQ r1;
        super.A01();
        C331837So r12 = this.A00;
        if ((r12 instanceof AnonymousClass7LQ) && (r1 = (AnonymousClass7LQ) r12) != null) {
            r1.A0e.A0L = null;
        }
    }
}
