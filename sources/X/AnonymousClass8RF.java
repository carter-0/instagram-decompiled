package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.8RF  reason: invalid class name */
public final class AnonymousClass8RF extends C361478gI {
    public int A00;
    public int A01;
    public AnonymousClass51M A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass2Fj A05;
    public final AnonymousClass2Fj A06 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A07 = new AnonymousClass2Fj();
    public final UserSession A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final 2Fk A0B;
    public final 2Fk A0C;
    public final AnonymousClass2gB A0D;
    public final 0sP A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RF(Application application, 2Fk r9, 2Fk r10, UserSession userSession) {
        super(application);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r9, 3);
        0qQ.A0B(r10, 4);
        this.A08 = userSession;
        this.A0B = r9;
        this.A0C = r10;
        02z r0 = new 02z(new AnonymousClass9IZ());
        this.A09 = r0;
        05F A032 = 10b.A03(r0);
        this.A0A = A032;
        AnonymousClass2gB r5 = new AnonymousClass2gB();
        this.A0D = r5;
        2Fk r4 = new 2Fk(C361268fw.A00);
        this.A05 = r4;
        C377089Km r3 = new C377089Km(this, 8);
        this.A0E = r3;
        r9.A09(new AnonymousClass8RI(r3));
        r5.A0E(r10, new AnonymousClass8RI(new C377089Km(this, 6)));
        r5.A0E(C226292g8.A00(19B.A00, A032), new AnonymousClass8RI(new C377089Km(this, 7)));
        r4.A09(new AnonymousClass8RI(r3));
    }

    public final void A0G(AnonymousClass8RH r5) {
        0qQ.A0B(r5, 0);
        if (!r5.equals(A0E())) {
            05G r3 = this.A09;
            AnonymousClass8RH r2 = (AnonymousClass8RH) ((AnonymousClass9IZ) r3.getValue()).A00;
            boolean z = ((AnonymousClass9IZ) r3.getValue()).A01;
            0qQ.A0B(r2, 1);
            r3.Epw(new AnonymousClass9IZ(r5, r2, z));
        }
    }

    public final AnonymousClass8RH A0E() {
        return (AnonymousClass8RH) ((AnonymousClass9IZ) this.A0A.getValue()).A00;
    }

    public final void A0F(int i, Integer num) {
        this.A07.A0B(new AnonymousClass88W(new Object()));
        if (num == AnonymousClass05K.A00) {
            this.A01 = i;
        } else {
            this.A00 = i;
        }
        A00(this);
    }

    public final void A0H(AnonymousClass51M r4) {
        Object obj;
        this.A02 = r4;
        AnonymousClass2Fj r2 = this.A05;
        if (r4 != null) {
            obj = new AnonymousClass8Y4(C394759ye.A00(r4));
        } else {
            obj = C361268fw.A00;
        }
        r2.A0B(obj);
    }

    public final void onCleared() {
        2Fk r1 = this.A0B;
        0sP r2 = this.A0E;
        r1.A08(new AnonymousClass8RI(r2));
        this.A05.A08(new AnonymousClass8RI(r2));
    }

    public static final void A00(AnonymousClass8RF r7) {
        Integer num;
        AnonymousClass8RH A0E2 = r7.A0E();
        AnonymousClass863 r1 = (AnonymousClass863) r7.A0C.A02();
        if (A0E2 != null && r1 != null) {
            if (r7.A04) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            int CEG = r1.CEG();
            int Bd7 = r1.Bd7();
            if (A0E2 instanceof AnonymousClass8RS) {
                int i = r7.A01;
                CEG -= i;
                AnonymousClass51M r2 = r7.A02;
                if (r2 != null) {
                    Bd7 = (int) (((float) (r7.A00 - i)) / Math.abs(r2.A00));
                }
            }
            r7.A0D.A0A(new AnonymousClass9IO(num, Math.max(CEG, 0), Bd7, 0));
        }
    }

    public final boolean A0I() {
        AnonymousClass8RH A0E2 = A0E();
        if (!(A0E2 instanceof KM2) || !((KM2) A0E2).A01) {
            return false;
        }
        return true;
    }
}
