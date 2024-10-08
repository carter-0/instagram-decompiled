package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5iy  reason: invalid class name and case insensitive filesystem */
public final class C292455iy implements AnonymousClass1GR {
    public long A00 = System.currentTimeMillis();
    public AtomicInteger A01 = new AtomicInteger(1);
    public final /* synthetic */ AnonymousClass2l3 A02;
    public final /* synthetic */ 1OE A03;
    public final /* synthetic */ C228102kn A04;
    public final /* synthetic */ Integer A05;

    public final void DEO(C268654dm r9, AnonymousClass1QW r10) {
        0qQ.A0B(r9, 1);
        C228102kn.A03(r9, this.A03, this.A04, this.A00, false);
        AnonymousClass2l3 r1 = this.A02;
        if (r1 != null) {
            r1.A05(false, String.valueOf(r9.A01()));
        }
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r9, AnonymousClass1QW r10, AnonymousClass2ZK r11) {
        AnonymousClass2l3 r1;
        AnonymousClass3HO r2 = (AnonymousClass3HO) r9;
        0qQ.A0B(r2, 2);
        C228102kn r3 = this.A04;
        1OE r12 = this.A03;
        long j = this.A00;
        AtomicInteger atomicInteger = this.A01;
        C228102kn.A08(r12, r2, r3, atomicInteger.get(), j, false);
        int andIncrement = atomicInteger.getAndIncrement();
        boolean z = false;
        if (andIncrement == 1) {
            z = true;
        }
        r3.A0E = z;
        if (z && (r1 = this.A02) != null) {
            r1.A05(true, (String) null);
        }
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public C292455iy(AnonymousClass2l3 r3, 1OE r4, C228102kn r5, Integer num) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = num;
    }

    public final void D58(AnonymousClass1QW r3, AnonymousClass2ZK r4) {
        this.A04.A0I = false;
    }

    public final /* bridge */ /* synthetic */ void DTy(1XR r6, AnonymousClass1QW r7, AnonymousClass2ZK r8) {
        AnonymousClass3HO r62 = (AnonymousClass3HO) r6;
        0qQ.A0B(r62, 2);
        C239753Ia A002 = r62.FH3();
        C228102kn r3 = this.A04;
        UserSession userSession = r3.A07;
        1E4.A00(userSession);
        String str = A002.A0D;
        if (str != null) {
            1Av A003 = 1Au.A00(userSession);
            0qQ.A0B(A003, 1);
            A003.A0t(str);
        }
        C228102kn.A0A(A002, r3);
    }

    public final void DeX() {
        C228102kn r2 = this.A04;
        1OH.A00(r2.A07).A07(this.A03);
        r2.A0G = false;
        r2.A0E = false;
        r2.A0C = false;
    }

    public final void Den() {
        UserSession userSession = this.A04.A07;
        1OI A002 = 1OH.A00(userSession);
        1OE r2 = this.A03;
        A002.A0C(r2, (String) null);
        if (AnonymousClass05K.A01 == r2.A04 || r2.A00()) {
            C2372236u.A00(userSession).A05(r2);
        }
    }
}
