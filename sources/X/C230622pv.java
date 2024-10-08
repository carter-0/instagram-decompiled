package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2pv  reason: invalid class name and case insensitive filesystem */
public abstract class C230622pv implements C250603lj {
    public final long A00 = 500;
    public final C229322nC A01 = new C229322nC(0.5f);

    public void A00(Object obj, long j, Object obj2) {
        JR4 jr4;
        Object obj3 = obj;
        if (this instanceof C234762yc) {
            C234762yc r4 = (C234762yc) this;
            1Xj r6 = (1Xj) obj3;
            AnonymousClass4HA r15 = (AnonymousClass4HA) obj2;
            0qQ.A0B(r6, 0);
            0qQ.A0B(r15, 1);
            C232852uY r1 = r4.A01;
            AnonymousClass4DU r7 = r4.A02;
            int position = r15.A01.getPosition();
            UserSession userSession = r1.A00;
            C254523sc A04 = C254513sb.A04(r6, r7, 002.A0R("carousel_", "time_spent"));
            A04.A0G(userSession, r6);
            A04.A09(position);
            A04.A0B(j);
            A04.A03();
            A04.A02();
            C233822wX.A0F(r4.A00, A04, r6, r7, AnonymousClass05K.A00, r15.A00, true);
            return;
        }
        if (this instanceof C230612pu) {
            jr4 = ((C230612pu) this).A00;
        } else {
            jr4 = ((C230652py) this).A00;
        }
        if (jr4 == null) {
            0qQ.A0F("afiLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            jr4.Ckv(j);
        }
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        Integer CEk = r10.CEk(r9);
        Integer num = AnonymousClass05K.A0C;
        C229322nC r6 = this.A01;
        if (CEk == num) {
            String str = r9.A05;
            long A002 = r6.A00(str, r10.BlK());
            if (A002 >= this.A00) {
                A00(r9.A03, A002, r9.A04);
            }
            r6.A01.remove(str);
            return;
        }
        r6.A01(r9.A05, r10.CFe(r9), r10.BlK());
    }

    public C230622pv(long j, float f) {
    }

    public C230622pv() {
    }
}
