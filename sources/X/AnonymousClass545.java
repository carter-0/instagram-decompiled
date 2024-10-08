package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.545  reason: invalid class name */
public final class AnonymousClass545 extends 0ng {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1pO A02;
    public final /* synthetic */ Integer A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass545(AnonymousClass540 r4, UserSession userSession, 1pO r6, Integer num) {
        super(589, 3, false, false);
        this.A03 = num;
        this.A02 = r6;
        this.A01 = userSession;
        this.A00 = r4;
    }

    public final void run() {
        if (14i.A08()) {
            Integer num = this.A03;
            if (num == AnonymousClass05K.A00) {
                1pO r3 = this.A02;
                UserSession userSession = this.A01;
                C3722990g r1 = new C3722990g(userSession, r3.A00);
                1OC A012 = r1.A01(userSession, UUID.randomUUID().toString());
                1OC A002 = r1.A00(userSession);
                1P2.A00(1P1.A00(userSession), AnonymousClass93P.A00, (1P0) null, new C15576Uf4(userSession, r3), A012, A002, "explore_prefetch", 1pO.A03, true, true);
            } else if (num == AnonymousClass05K.A01) {
                1pO r4 = this.A02;
                UserSession userSession2 = this.A01;
                AnonymousClass540 r5 = this.A00;
                if (182.A06(0Tu.A05, userSession2, 36315163963558962L)) {
                    C15589UfH ufH = new C15589UfH(r5, userSession2, r4);
                    C55104HcD.A00(r4.A00, userSession2).A01(ufH, (1ET) 1ET.A01.getValue(), C3723090h.A00(AnonymousClass05K.A0j));
                    return;
                }
                C15590UfI ufI = new C15590UfI(r5, userSession2, r4);
                1P2 A003 = 1P1.A00(userSession2);
                AnonymousClass93P r8 = AnonymousClass93P.A00;
                C3723790p r32 = new C3723790p(userSession2);
                r32.A08 = C3723090h.A00(AnonymousClass05K.A0j).A06;
                r32.A0A = UUID.randomUUID().toString();
                r32.A0I = true;
                r32.A0H = false;
                r32.A01 = r4.A00;
                1P2.A00(A003, r8, (1P0) null, ufI, r32.A01(), (1OC) null, "explore_prefetch", 21600, true, false);
            }
        } else {
            AnonymousClass540 r12 = this.A00;
            if (r12 != null) {
                r12.AVX("explore_popular_background_prefetch");
            }
        }
    }
}
