package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class K0W extends V4O {
    public float A00;
    public boolean A01;
    public final /* synthetic */ LRE A02;

    public final void A02(View view, int i) {
        C62500Kgq kgq;
        LBH lbh;
        MQY mqy;
        C61206Jyz jyz;
        String str;
        String str2;
        String str3;
        Long l;
        AnonymousClass0Ud r0;
        if (i == 1) {
            LRE lre = this.A02;
            C62500Kgq kgq2 = lre.A08;
            kgq = C62500Kgq.EXPANDED;
            if (kgq2 == kgq) {
                return;
            }
            if (kgq2 != C62500Kgq.DISMISSED || !this.A01) {
                if (kgq2 != C62500Kgq.DEFAULT || !this.A01 || (lbh = lre.A09) == null) {
                    return;
                }
                lbh.A08.Epw(kgq);
            }
            lbh = lre.A09;
        } else if (i == 3) {
            LRE lre2 = this.A02;
            LBH lbh2 = lre2.A09;
            Integer num = null;
            if (lbh2 == null || (r0 = lbh2.A0A) == null) {
                mqy = null;
            } else {
                mqy = (MQY) r0.getValue();
            }
            if ((mqy instanceof C61206Jyz) && (jyz = (C61206Jyz) mqy) != null) {
                LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
                for (C62587KiK kiK : C62587KiK.values()) {
                    A0x.put(kiK.A01, "null");
                }
                LinkedHashMap A03 = 0Yt.A03(A0x);
                List<C61168JyK> list = jyz.A00;
                ArrayList A0p = AnonymousClass7TF.A0p(list);
                for (C61168JyK jyK : list) {
                    String str4 = jyK.A00.A01;
                    String str5 = jyK.A02;
                    if (str5 == null) {
                        str5 = "null";
                    }
                    A03.put(str4, str5);
                    A0p.add(C60340gF.A00);
                }
                C313756gx A0R = DbZ.A0R(lre2.A0G);
                LBH lbh3 = lre2.A09;
                if (lbh3 != null) {
                    str = lbh3.A06.C6C();
                } else {
                    str = null;
                }
                LBH lbh4 = lre2.A09;
                if (lbh4 != null) {
                    str2 = lbh4.A06.C6k();
                } else {
                    str2 = null;
                }
                LBH lbh5 = lre2.A09;
                if (lbh5 != null) {
                    num = Integer.valueOf(lbh5.A06.AdN());
                }
                1Ln A0J = DbT.A0J(A0R);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, A0R);
                    DbV.A1M(A0J, "member_participation_hub_active_participation_expanded");
                    A0J.A0p("member_participation_hub");
                    A0J.A0q("thread_view");
                    if (num == null || num.intValue() != 2) {
                        str3 = "broadcast";
                    } else {
                        str3 = "subscriber_broadcast";
                    }
                    A0J.A0o(str3);
                    A0J.A0s(str);
                    if (str2 != null) {
                        l = 00y.A0n(10, str2);
                    } else {
                        l = null;
                    }
                    A0J.A0i(l);
                    ArrayList A0f = JTQ.A0f(A03);
                    Iterator A0s = AnonymousClass7TF.A0s(A03);
                    while (A0s.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                        A0f.add(002.A0g(DbT.A13(A1J), ": ", DbS.A0s(A1J)));
                    }
                    A0J.A0w(AnonymousClass7TF.A0w("activities_id", DbT.A0z(", ", A0f, (0sP) null)));
                    A0J.Cgf();
                }
            }
            LRE.A01(lre2, C62500Kgq.EXPANDED);
            return;
        } else if (i == 4) {
            LRE lre3 = this.A02;
            int ordinal = lre3.A08.ordinal();
            if (ordinal == 1) {
                lbh = lre3.A09;
                if (lbh != null) {
                    kgq = C62500Kgq.DISMISSED;
                    lbh.A08.Epw(kgq);
                }
                return;
            } else if (ordinal == 2) {
                lbh = lre3.A09;
            } else if (ordinal == 3) {
                LRE.A01(lre3, C62500Kgq.DEFAULT);
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        if (lbh != null) {
            kgq = C62500Kgq.DEFAULT;
            lbh.A08.Epw(kgq);
        }
    }

    public K0W(LRE lre) {
        this.A02 = lre;
    }

    public final void A01(View view, float f) {
        String str;
        String str2;
        String str3;
        LRE lre = this.A02;
        if (lre.A08 != C62500Kgq.HIDDEN) {
            float f2 = this.A00;
            boolean z = true;
            if (f < f2 && f2 < -0.3f) {
                C313756gx A0R = DbZ.A0R(lre.A0G);
                LBH lbh = lre.A09;
                Integer num = null;
                if (lbh != null) {
                    str = lbh.A06.C6C();
                } else {
                    str = null;
                }
                LBH lbh2 = lre.A09;
                if (lbh2 != null) {
                    str2 = lbh2.A06.C6k();
                } else {
                    str2 = null;
                }
                LBH lbh3 = lre.A09;
                if (lbh3 != null) {
                    num = Integer.valueOf(lbh3.A06.AdN());
                }
                1Ln A0J = DbT.A0J(A0R);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, A0R);
                    DbV.A1M(A0J, "member_participation_hub_active_participation_hidden");
                    A0J.A0p("member_participation_hub");
                    A0J.A0q("thread_view");
                    if (num == null || num.intValue() != 2) {
                        str3 = "broadcast";
                    } else {
                        str3 = "subscriber_broadcast";
                    }
                    A0J.A0o(str3);
                    A0J.A0s(str);
                    A0J.A0i(DbZ.A0d(str2));
                    A0J.Cgf();
                }
                LRE.A01(lre, C62500Kgq.DISMISSED);
            }
            if (f <= this.A00) {
                z = false;
            }
            this.A01 = z;
            this.A00 = f;
        }
    }
}
