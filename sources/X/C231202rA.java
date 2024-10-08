package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2rA  reason: invalid class name and case insensitive filesystem */
public final class C231202rA implements C250603lj {
    public double A00;
    public boolean A01;
    public final UserSession A02;

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        double B0M = (double) r15.B0M(r14);
        double CFe = (double) r15.CFe(r14);
        this.A00 = Math.max(this.A00, CFe);
        int intValue = r15.CEk(r14).intValue();
        if (intValue == 0) {
            C3018660j.A01(this.A02).A04 = true;
        } else if (intValue != 1) {
            if (this.A01) {
                AnonymousClass9J1 r1 = ((DHK) r14.A03).A00.A00;
                0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.api.schemas.NotesResponse");
                int size = ((List) r1.A01).size();
                C3018660j.A01(this.A02).A0P(Double.valueOf(B0M), Double.valueOf(this.A00), Integer.valueOf(((C242803Vz) r14.A04).getPosition()), size, size);
                this.A01 = false;
                this.A00 = 0.0d;
            }
            C3018760k A012 = C3018660j.A01(this.A02);
            A012.A08();
            A012.A04 = false;
            A012.A0C.clear();
            A012.A09.clear();
            A012.A03.clear();
            A012.A0D.clear();
            A012.A01 = null;
        } else if (B0M >= 250.0d && CFe >= 0.5d) {
            this.A01 = true;
        }
    }

    public C231202rA(UserSession userSession) {
        this.A02 = userSession;
    }
}
