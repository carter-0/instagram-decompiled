package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

public final class IY5 implements C233012uo {
    public int A00;
    public int A01;
    public 1OC A02;
    public C233072uu A03;
    public Integer A04 = AnonymousClass05K.A00;
    public boolean A05 = true;
    public boolean A06;
    public final int A07;
    public final UserSession A08;
    public final 1PX A09;
    public final C233212vI A0A;
    public final C249863kU A0B;
    public final C308816Vs A0C;
    public final XbE A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final 0sI A0H;

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final boolean CTb() {
        return false;
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final void Cn9(int i) {
    }

    public final void DsJ(int i) {
    }

    public final void deactivate() {
        this.A06 = false;
        C249863kU r0 = this.A0B;
        r0.A00.remove(this.A0C);
        1OC r02 = this.A02;
        if (r02 != null) {
            r02.cancel();
        }
        this.A02 = null;
        1PX r03 = this.A09;
        r03.A04 = false;
        r03.A06 = false;
    }

    public /* synthetic */ IY5(UserSession userSession, 1PX r5, C233212vI r6, C249863kU r7, String str, String str2, String str3, int i) {
        C58167InX inX = new C58167InX(1ES.A00, 6);
        this.A08 = userSession;
        this.A0E = str;
        this.A07 = i;
        this.A0B = r7;
        this.A0F = str2;
        this.A0G = str3;
        this.A09 = r5;
        this.A0A = r6;
        this.A0H = inX;
        this.A00 = i;
        this.A0C = new IYN(this, 0);
        this.A0D = new XbE(new C57342IXz(this, 1), userSession, str2, i);
    }

    private final void A00(int i) {
        Integer num = AnonymousClass05K.A01;
        this.A04 = num;
        String str = this.A0G;
        if (str != null) {
            UserSession userSession = this.A08;
            String str2 = this.A0F;
            int i2 = this.A07;
            String str3 = this.A0E;
            1NY A0M = DbU.A0M(userSession);
            A0M.A08(num);
            A0M.A0A("profile_ads/get_profile_ads/");
            A0M.A0Q(C43815CEh.class, C41914B6m.class);
            A0M.A9m("profile_id", str2);
            A0M.A0C("entry_point_index", i2);
            A0M.A0C("ad_request_index", i);
            C51965G9l.A1S(A0M, str3);
            1OC A0T = DbT.A0T(A0M, "seed_media_id", str);
            A0T.A00 = new XPO(0, this.A0D, false);
            0sI r1 = this.A0H;
            Boolean A0v = AnonymousClass7TE.A0v();
            r1.invoke(A0T, 1901924650, 2, A0v, A0v);
            this.A02 = A0T;
        }
    }

    public static final boolean A01(IY5 iy5, int i) {
        if (iy5.A06) {
            int i2 = iy5.A01;
            XbE xbE = iy5.A0D;
            if (i2 <= xbE.A00 && i >= xbE.A01 && iy5.A04 == AnonymousClass05K.A00) {
                if (!182.A06(0Tu.A05, iy5.A08, 36320730241245989L) || xbE.A01 != -1) {
                    iy5.A00(i);
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final /* synthetic */ void Cmj(boolean z) {
        C43815CEh cEh;
        if (182.A06(0Tu.A05, this.A08, 36320730241245989L) && (cEh = this.A0D.A03) != null) {
            this.A09.A00(cEh);
        }
    }

    public final boolean D69(int i, int i2) {
        this.A00 = i;
        return A01(this, i);
    }

    public final boolean A7L(C233632w4 r6, C233042ur r7, C233072uu r8) {
        DbY.A1S(r8, r6);
        this.A06 = true;
        this.A03 = r8;
        this.A0B.A05(this.A0C);
        1PX r3 = this.A09;
        r3.A04 = false;
        r3.A06 = true;
        if (!r3.A02(new XPO(0, this.A0D, true), (C56455Hyn) null, (Object) null)) {
            A00(r6.A01);
        }
        return true;
    }

    public final /* synthetic */ Set Bsw() {
        return AnonymousClass7TE.A1F();
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r1, C233632w4 r2, C238523Ce r3, String str, String str2, double d, boolean z) {
        AnonymousClass7TG.A1P(r2, r3);
    }
}
