package X;

import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.IYu  reason: case insensitive filesystem */
public final class C57363IYu implements C233022up {
    public boolean A00;
    public final 1Ph A01;
    public final UserSession A02;
    public final C270424gi A03;
    public final AnonymousClass2wW A04;
    public final C233212vI A05;
    public final Set A06 = DbS.A0y();

    public final String B4s() {
        return "ultra_responsive_infra";
    }

    public final void CJE(C376459Ib r10, List list) {
        int i;
        Integer num;
        String str;
        boolean A1U = AnonymousClass7TF.A1U(0, r10, list);
        if (Bsw().contains(r10) && list.size() == A1U) {
            if (182.A06(0Tu.A05, this.A02, 36321666543920757L)) {
                AnonymousClass9J4 r5 = (AnonymousClass9J4) ((AnonymousClass9IV) list.get(0)).A01;
                C270424gi r1 = this.A03;
                AnonymousClass9JO r6 = (AnonymousClass9JO) r5.A02;
                C250973mM Bkz = r1.Bkz(r6.A04);
                if (Bkz != null) {
                    int CMI = r1.CMI(Bkz);
                    Reel reel = Bkz.A0H;
                    if (reel.A1J) {
                        num = AnonymousClass05K.A01;
                    } else if (!this.A01.A03(1Pi.A04, AnonymousClass05K.A01, CMI)) {
                        num = AnonymousClass05K.A00;
                    } else {
                        reel.A1J = A1U;
                        AnonymousClass2wW r4 = this.A04;
                        String name = ((C233162v9) r5.A04).name();
                        C233812wV r42 = (C233812wV) r4;
                        if (r42.A06 && (i = r42.A00) > r42.A01) {
                            r42.A0T.Cn9(i);
                            AnonymousClass1PB r2 = r42.A0P;
                            1PG r12 = r42.A0M;
                            if (r12 != null && r2 != null) {
                                C233172vA A022 = r12.A02(r42.A04, r2);
                                A022.A0X = "RTI";
                                A022.A0Y = name;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C233212vI r22 = this.A05;
                    String str2 = r6.A01;
                    String str3 = ((C233162v9) r5.A04).A01;
                    if (num.intValue() != 0) {
                        str = "seed_ad_already_triggered_refresh";
                    } else {
                        str = "exceeds_session_rate_limit";
                    }
                    r22.Ch1(str2, "rti", str3, str, false, A1U);
                }
            }
        }
    }

    public final Set Bsw() {
        Boolean bool;
        if (!this.A00) {
            List A0x = DbX.A0x(182.A04(0Tu.A06, this.A02, 36884616497463872L));
            if (A0x != null) {
                ArrayList A0r = AnonymousClass7TG.A0r(A0x);
                Iterator it = A0x.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    C233162v9[] values = C233162v9.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            bool = null;
                            break;
                        }
                        C233162v9 r4 = values[i];
                        if (0qQ.A0K(r4.A01, DbV.A12(A18))) {
                            bool = Boolean.valueOf(this.A06.add(new C376459Ib(C230472pg.SPONSORED, r4, C230432pc.STORIES)));
                            break;
                        }
                        i++;
                    }
                    A0r.add(bool);
                }
            }
            this.A00 = true;
        }
        ImmutableSet A032 = ImmutableSet.A03(this.A06);
        0qQ.A07(A032);
        return A032;
    }

    public C57363IYu(UserSession userSession, C270424gi r3, AnonymousClass2wW r4, 1Ph r5, C233212vI r6) {
        this.A02 = userSession;
        this.A04 = r4;
        this.A03 = r3;
        this.A01 = r5;
        this.A05 = r6;
    }
}
