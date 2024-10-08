package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7PK  reason: invalid class name */
public abstract class AnonymousClass7PK extends AnonymousClass7PL {
    public final C249703kE A00;
    public final C232232tF A01;

    public C232262tL A04(C331837So r11) {
        C331837So r6 = r11;
        if (this instanceof C331017Pd) {
            return ((C331017Pd) this).A05((AnonymousClass7LQ) r6);
        }
        if (this instanceof AnonymousClass7PJ) {
            C232262tL r62 = (C232262tL) r6;
            0qQ.A0B(r62, 0);
            return r62;
        } else if (this instanceof AnonymousClass7AU) {
            AnonymousClass7AU r1 = (AnonymousClass7AU) this;
            C328347El r2 = r1.A02;
            Context context = r1.itemView.getContext();
            UserSession userSession = r1.A00;
            17i r8 = r1.A05;
            return r2.AWb(context, userSession, r1.A03, r6, r1.A04, r8, false);
        } else {
            C3256773r r12 = (C3256773r) this;
            0qQ.A0B(r11, 0);
            C3256973t r22 = r12.A01;
            Context context2 = r12.itemView.getContext();
            0qQ.A07(context2);
            UserSession userSession2 = r12.A00;
            17i r82 = r12.A04;
            return r22.AWb(context2, userSession2, r12.A02, r6, r12.A03, r82, false);
        }
    }

    public AnonymousClass7PK(C249703kE r2, C232232tF r3) {
        super(r2.itemView);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A01() {
        this.A01.unbind(this.A00);
    }

    public void A03(C331837So r4) {
        this.A01.bind(A04(r4), this.A00);
    }
}
