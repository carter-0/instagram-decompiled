package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IY1 implements C233072uu, C233012uo {
    public int A00;
    public C233212vI A01;
    public Integer A02 = AnonymousClass05K.A00;
    public C233042ur A03 = new C233032uq();
    public C233072uu A04;
    public final Context A05;
    public final C55827HoA A06;
    public final AnonymousClass1O8 A07 = new AnonymousClass1O8();
    public final UserSession A08;
    public final C228232l0 A09;

    public IY1(Context context, UserSession userSession, C228232l0 r4, ContextualFeedFragment contextualFeedFragment) {
        0qQ.A0B(userSession, 2);
        this.A05 = context;
        this.A08 = userSession;
        this.A09 = r4;
        this.A06 = new C55827HoA(this, userSession, contextualFeedFragment);
    }

    public final void A00(String str, String str2, String str3, boolean z, boolean z2) {
        String str4 = str3;
        0qQ.A0B(str4, 2);
        UserSession userSession = this.A08;
        1NY A0M = DbU.A0M(userSession);
        Integer num = AnonymousClass05K.A01;
        A0M.A08(num);
        A0M.A0A("discover/chaining_experience_notification_ads/");
        A0M.A0O((15p) null, C54077Gz1.class, D1T.class, false);
        A0M.A00 = this.A07.A00;
        C51965G9l.A1S(A0M, str4);
        A0M.A9m("seed_media_id", str);
        String str5 = str2;
        A0M.A9m("seed_ad_id", str5);
        A0M.A0H("need_seed_media", z);
        Iterator A0u = AnonymousClass7TF.A0u(this.A09.AUH(C230432pc.EXPLORE.toString()));
        while (A0u.hasNext()) {
            C51974G9v.A1C(A0M, A0u);
        }
        A0M.A0R = true;
        C51968G9o.A1C(this.A05, A0M, userSession);
        if (C54771HSd.A00(userSession)) {
            this.A00++;
        }
        1OC A0M2 = A0M.A0M();
        this.A03.DFK(new AnonymousClass4LN((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0sr.A1M(new String[]{str5}), false, false, false, false));
        this.A02 = num;
        C55827HoA hoA = this.A06;
        hoA.A02 = true;
        A0M2.A00 = new C54243H4m(0, hoA, z2);
        1ES.A05(A0M2, 332178420, 2, true, true);
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final void Cn9(int i) {
    }

    public final void CsF(int i) {
    }

    public final void D67() {
    }

    public final boolean D69(int i, int i2) {
        return false;
    }

    public final void DsJ(int i) {
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

    public final boolean CTb() {
        return C51969G9p.A1a(this.A02, AnonymousClass05K.A00);
    }

    public final /* synthetic */ void Cmj(boolean z) {
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(110));
    }

    public final /* synthetic */ C268314dB Dm0(Integer num, Integer num2, List list) {
        throw AnonymousClass7TE.A1B(C273654mx.A00(11));
    }

    public final void deactivate() {
        this.A06.A02 = false;
        this.A07.A00();
    }

    public final boolean A7L(C233632w4 r2, C233042ur r3, C233072uu r4) {
        boolean A1Z = AnonymousClass7TG.A1Z(r4, r3);
        this.A04 = r4;
        this.A03 = r3;
        return A1Z;
    }

    public final Map Bk0() {
        return AnonymousClass7TE.A1H();
    }

    public final /* synthetic */ Set Bsw() {
        return AnonymousClass7TE.A1F();
    }

    public final C268314dB Dlz(Integer num, List list) {
        C268314dB Dlz;
        AnonymousClass7TG.A1N(list, num);
        C233072uu r0 = this.A04;
        if (r0 != null && (Dlz = r0.Dlz(num, list)) != null) {
            return Dlz;
        }
        0sn r1 = 0sn.A00;
        return new C268314dB(r1, r1);
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r1, C233632w4 r2, C238523Ce r3, String str, String str2, double d, boolean z) {
        AnonymousClass7TG.A1P(r2, r3);
    }
}
