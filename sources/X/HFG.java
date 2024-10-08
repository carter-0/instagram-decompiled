package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class HFG extends C233422vh {
    public final UserSession A00;
    public final C52476GUc A01;
    public final C233372vc A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HFG(UserSession userSession, C52476GUc gUc, C233372vc r19, C228812mN r20, C249863kU r21) {
        super(r20, r21, false, false, false, false, false, false, false, false, false);
        this.A01 = gUc;
        UserSession userSession2 = userSession;
        this.A00 = userSession2;
        this.A02 = r19;
        this.A03 = 182.A06(0Tu.A05, userSession2, 36317027979236109L);
    }

    public final int A04(int i) {
        return 0;
    }

    public final void A0A(C251373n0 r11, C233462vl r12, Integer num, Integer num2, int i, int i2, int i3) {
        0qQ.A0B(num, 3);
        if (this.A03) {
            AnonymousClass3OA r1 = (AnonymousClass3OA) r11.BTb();
            0qQ.A0B(r1, 0);
            1Xj r13 = r1.A0K;
            0qQ.A0B(r13, 0);
            UserSession userSession = this.A00;
            if (C271854jh.A00(userSession, r13)) {
                return;
            }
            if ((num2 == AnonymousClass05K.A0C || num2 == AnonymousClass05K.A0N) && C266914aY.A02(num) && !r12.A0D(num2, num, i) && i < 2 && i3 < r12.A06) {
                AnonymousClass3VI.A00(userSession).A07(new C52567GXs(AnonymousClass3VL.EXPLORE, AnonymousClass05K.A01, Integer.valueOf(i2), (Integer) null, (Integer) null, Integer.valueOf(i), (String) null, r13.getId()));
            }
        }
    }

    public final List A08() {
        return C51966G9m.A1J(((IWI) this.A01.A00).A01);
    }

    public final /* bridge */ /* synthetic */ boolean A0E(Object obj) {
        AnonymousClass3OA r3 = (AnonymousClass3OA) obj;
        0qQ.A0B(r3, 0);
        1Xj r1 = r3.A0K;
        0qQ.A0B(r1, 0);
        return AnonymousClass7TF.A1P(C271854jh.A00(this.A00, r1) ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ C233462vl A07(Object obj) {
        return (C233462vl) GV8.A00(obj);
    }

    public final /* bridge */ /* synthetic */ boolean A0D(C233462vl r6, Object obj) {
        AnonymousClass3OA A0m = C51969G9p.A0m(obj);
        return this.A02.Cd4(A0m.A0K, C51966G9m.A1J(((IWI) this.A01.A00).A01), r6.A09());
    }

    public final /* bridge */ /* synthetic */ boolean A0F(Object obj) {
        return false;
    }

    public final /* bridge */ /* synthetic */ void A0B(Object obj, int i, int i2, int i3) {
    }
}
