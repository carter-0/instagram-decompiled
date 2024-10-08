package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.855  reason: invalid class name */
public final class AnonymousClass855 implements AnonymousClass851, AnonymousClass856 {
    public final AnonymousClass85B A00 = AnonymousClass85B.A00;
    public final AnonymousClass85C A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LC(this, 9));
    public final C357638Yz A04;
    public final AnonymousClass858 A05 = new AnonymousClass858("pre_capture");
    public final Map A06;
    public final /* synthetic */ AnonymousClass857 A07;

    public AnonymousClass855(UserSession userSession, C357638Yz r4, Map map, boolean z) {
        0qQ.A0B(map, 3);
        this.A07 = new AnonymousClass857(r4, map);
        this.A02 = userSession;
        this.A04 = r4;
        this.A06 = map;
        this.A01 = new AnonymousClass85C(z);
    }

    public final C359248cL AND(AnonymousClass9J8 r2, AnonymousClass84D r3) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r2, 1);
        return this.A07.AND(r2, r3);
    }

    public final AnonymousClass0r6 ARB(AnonymousClass80W r7) {
        0qQ.A0B(r7, 0);
        C357638Yz r5 = this.A04;
        return AnonymousClass11E.A01(AnonymousClass10H.A03(new C376949Jy(4, (AnonymousClass4D7) null), AnonymousClass11E.A01(AnonymousClass10H.A03(new C66193MHj(8, (AnonymousClass4D7) null), AnonymousClass0Zq.A00(new C66188MGz((Object) r5, (AnonymousClass4D7) null, 44, 42)), AnonymousClass0Zq.A00(new C66188MGz((Object) r5, (AnonymousClass4D7) null, 45, 42)))), new AnonymousClass8DZ(AnonymousClass8DX.A00(r7))));
    }

    public final boolean Aki() {
        return this.A07.Aki();
    }

    public final Integer B0K() {
        return this.A07.B0K();
    }

    public final boolean BuC() {
        return this.A07.BuC();
    }

    public final boolean Buj() {
        return this.A07.Buj();
    }

    public final boolean But() {
        return this.A07.But();
    }

    public final AnonymousClass85D ALx() {
        return new C348347yI((AnonymousClass86T) this.A03.getValue(), this.A00, this.A01, B0F(), this.A02);
    }

    public final boolean Akh() {
        return true;
    }

    public final C358348al B0F() {
        if (0qQ.A0K(this.A04.A08.A00, AnonymousClass80L.A00)) {
            return C358348al.LIVE;
        }
        return C358348al.PRECAPTURE_PHOTO;
    }

    public final boolean Bu9() {
        return !this.A07.BuC();
    }

    public final AnonymousClass858 C9l() {
        return this.A05;
    }

    public final boolean CRm() {
        return this.A04.A0Q();
    }
}
