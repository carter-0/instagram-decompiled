package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GUs  reason: case insensitive filesystem */
public final class C52490GUs implements C233012uo {
    public int A00;
    public int A01;
    public 1OC A02;
    public C233042ur A03 = new C233032uq();
    public C233072uu A04;
    public Integer A05 = AnonymousClass05K.A00;
    public boolean A06;
    public int A07;
    public boolean A08;
    public final int A09;
    public final Context A0A;
    public final UserSession A0B;
    public final C233172vA A0C;
    public final 1PX A0D;
    public final C233402vf A0E;
    public final AnonymousClass2vG A0F;
    public final C249863kU A0G;
    public final C308816Vs A0H;
    public final C228232l0 A0I;
    public final XER A0J;
    public final HQI A0K;
    public final String A0L;
    public final 0sI A0M;

    public final boolean A7L(C233632w4 r6, C233042ur r7, C233072uu r8) {
        boolean A1b = C51973G9u.A1b(r8, r7, r6);
        this.A08 = A1b;
        this.A04 = r8;
        this.A03 = r7;
        this.A0G.A05(this.A0H);
        1PX r2 = this.A0D;
        r2.A04 = false;
        r2.A06 = A1b;
        if (!r2.A02(new XPO(A1b ? 1 : 0, this.A0J, A1b), (C56455Hyn) null, (Object) null)) {
            A00(r6.A03, r6.A01);
        }
        return A1b;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
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
        this.A08 = false;
        C249863kU r0 = this.A0G;
        r0.A00.remove(this.A0H);
        1OC r02 = this.A02;
        if (r02 != null) {
            r02.cancel();
        }
        this.A02 = null;
        1PX r03 = this.A0D;
        r03.A04 = false;
        r03.A06 = false;
    }

    public /* synthetic */ C52490GUs(Context context, UserSession userSession, C233172vA r13, 1PX r14, C233402vf r15, AnonymousClass2vG r16, C249863kU r17, C228232l0 r18, HQI hqi, String str, int i) {
        String str2;
        HQI hqi2 = hqi;
        C58167InX inX = new C58167InX(1ES.A00, 9);
        UserSession userSession2 = userSession;
        this.A0B = userSession;
        this.A0A = context;
        int i2 = i;
        this.A09 = i2;
        String str3 = str;
        this.A0L = str3;
        this.A0E = r15;
        this.A0G = r17;
        this.A0F = r16;
        this.A0C = r13;
        this.A0M = inX;
        this.A0K = hqi2;
        this.A0I = r18;
        this.A0D = r14;
        this.A00 = i2;
        this.A06 = true;
        this.A0H = new IYN(this, 1);
        C57342IXz iXz = new C57342IXz(this, 2);
        String str4 = null;
        if (hqi2 instanceof C52491GUt) {
            str2 = ((C52491GUt) hqi2).A01;
        } else {
            str2 = null;
        }
        this.A0J = new XER(iXz, userSession2, str3, str2, hqi2 instanceof C54599HKi ? ((C54599HKi) hqi2).A02 : str4, i2, i2);
    }

    private final void A00(List list, int i) {
        1NY r7;
        Integer num = AnonymousClass05K.A01;
        this.A05 = num;
        this.A03.DFK(new AnonymousClass4LN((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, list, false, false, false, false));
        int i2 = i;
        this.A07 = i2;
        this.A0C.A0F = Integer.valueOf(i2);
        HQI hqi = this.A0K;
        boolean z = hqi instanceof C52491GUt;
        1OC r3 = null;
        if (z) {
            Map AUH = this.A0I.AUH("profile_ads/get_profile_ads/");
            UserSession userSession = this.A0B;
            Context context = this.A0A;
            C52491GUt gUt = (C52491GUt) hqi;
            String str = gUt.A01;
            int i3 = this.A09;
            Integer num2 = gUt.A00;
            String str2 = this.A0L;
            String str3 = gUt.A02;
            C233072uu r0 = this.A04;
            if (r0 != null) {
                r3 = r0.Bk0();
            }
            C51973G9u.A0s(2, str, str3, AUH);
            String str4 = null;
            r7 = DbU.A0M(userSession);
            r7.A08(num);
            r7.A0A("profile_ads/get_profile_ads/");
            r7.A0O((15p) null, C43815CEh.class, C41914B6m.class, false);
            r7.A9m("profile_id", str);
            r7.A0C("entry_point_index", i3);
            r7.A0C("ad_request_index", i2);
            C51965G9l.A1S(r7, str2);
            if (num2 != null) {
                if (1 - num2.intValue() != 0) {
                    str4 = "BANNER_AD_SHOWN";
                } else {
                    str4 = "DEFAULT";
                }
            }
            r7.A0G("request_scenario", str4);
            r7.A9m("seed_media_id", str3);
            C51968G9o.A1C(context, r7, userSession);
            Iterator A0u = AnonymousClass7TF.A0u(AUH);
            while (A0u.hasNext()) {
                Map.Entry entry = (Map.Entry) A0u.next();
                r7.A9m((String) entry.getKey(), (String) entry.getValue());
            }
            if (r3 != null && (!r3.isEmpty()) && 182.A06(0Tu.A05, userSession, 36315829686832728L)) {
                r7.A0G("ad_and_netego_request_information", AnonymousClass4LV.A00(r3));
            }
        } else if (hqi instanceof C54599HKi) {
            UserSession userSession2 = this.A0B;
            C54599HKi hKi = (C54599HKi) hqi;
            String str5 = hKi.A02;
            Context context2 = this.A0A;
            int i4 = this.A09;
            String str6 = this.A0L;
            String str7 = hKi.A01;
            String str8 = hKi.A00;
            0qQ.A0B(str5, 1);
            C51972G9s.A1E(str7, str8);
            r7 = DbU.A0M(userSession2);
            r7.A08(num);
            r7.A0A("search_feed_ads/get_search_feed_ads/");
            r7.A0O((15p) null, C43815CEh.class, C41914B6m.class, false);
            r7.A9m("keyword", str5);
            r7.A0C("entry_point_index", i4);
            r7.A0C("ad_request_index", i2);
            C51965G9l.A1S(r7, str6);
            r7.A9m("media_id", str7);
            r7.A9m("author_id", str8);
            C51968G9o.A1C(context2, r7, userSession2);
        } else {
            0wb.A03("ContextualFeedAdsFetcher", "invalid module or parameters for firing a request");
            this.A05 = AnonymousClass05K.A00;
            this.A02 = r3;
        }
        r3 = r7.A0M();
        r3.A00 = new XPO(1, this.A0J, false);
        0sI r6 = this.A0M;
        int i5 = 605223098;
        if (z) {
            i5 = 1287586239;
        }
        r6.invoke(r3, Integer.valueOf(i5), 2, true, 1);
        this.A02 = r3;
    }

    public static final boolean A01(C52490GUs gUs, int i) {
        if (gUs.A08) {
            int i2 = gUs.A01;
            XER xer = gUs.A0J;
            if (i2 <= xer.A00 && i >= xer.A01 && gUs.A05 == AnonymousClass05K.A00) {
                if (!182.A06(0Tu.A05, gUs.A0B, 36315829686111826L) || xer.A01 != -1) {
                    gUs.A00(gUs.A0E.BYp(), i);
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

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return this.A07;
    }

    public final boolean CTb() {
        return C51969G9p.A1a(this.A05, AnonymousClass05K.A00);
    }

    public final void Cmj(boolean z) {
        C43815CEh cEh;
        if (182.A06(0Tu.A05, this.A0B, 36315829686111826L) && (this.A0K instanceof C52491GUt) && (cEh = this.A0J.A03) != null) {
            this.A0D.A00(cEh);
        }
    }

    public final boolean D69(int i, int i2) {
        this.A00 = i;
        return A01(this, i);
    }

    public final /* synthetic */ Set Bsw() {
        return AnonymousClass7TE.A1F();
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r1, C233632w4 r2, C238523Ce r3, String str, String str2, double d, boolean z) {
        AnonymousClass7TG.A1P(r2, r3);
    }
}
