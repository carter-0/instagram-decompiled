package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class HF3 extends C233202vF {
    public final UserSession A00;
    public final C52476GUc A01;
    public final AnonymousClass4DU A02;
    public final C233172vA A03;
    public final C233182vC A04;

    public HF3(UserSession userSession, C52476GUc gUc, C233172vA r11, AnonymousClass4DU r12, C233182vC r13) {
        super(userSession, r11, r12, (AnonymousClass57O) null, r13, "session_id_not_defined_for_Discovery_Chaining", (String) null);
        this.A00 = userSession;
        this.A02 = r12;
        this.A03 = r11;
        this.A04 = r13;
        this.A01 = gUc;
    }

    private final void A00(C251373n0 r11, 1PW r12, String str) {
        String str2;
        Integer num;
        String str3;
        Integer num2;
        List list;
        UserSession userSession = this.A00;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36317027979236109L);
        Object BTb = r11.BTb();
        AnonymousClass4DU r3 = this.A02;
        C254523sc A042 = C254513sb.A04((1Nv) BTb, r3, str);
        AnonymousClass3OA r1 = (AnonymousClass3OA) BTb;
        C51973G9u.A1C(userSession, A042, r1, r11);
        C51971G9r.A1L(A042, r12);
        G9w.A1N(A042, this, r11, r12);
        A042.A1G = Boolean.valueOf(1Au.A00(userSession).A1j());
        1Xj r5 = r1.A0K;
        A042.A8B = C231122qu.A0R(userSession, r5);
        C51965G9l.A1T(userSession, A042);
        G9w.A1M(userSession, A042);
        Integer num3 = AnonymousClass05K.A00;
        Integer num4 = r12.A0C;
        if (num3 == num4) {
            A042.A0G = r12.A03;
            if (A06) {
                AnonymousClass3VK A002 = AnonymousClass3VI.A00(userSession);
                Integer A012 = A002.A01(r3);
                Integer A022 = A002.A02(r3);
                G9t.A1O(r3, A042, A002);
                A042.A2v = A012;
                A042.A2w = A022;
                A002.A06(r3, Integer.valueOf(r12.A03));
            }
        } else if (AnonymousClass05K.A01 == num4) {
            A042.A08 = r12.A03;
            A042.A02 = r12.A00;
            if (A06) {
                AnonymousClass3VI.A00(userSession).A05(r3, Integer.valueOf(r12.A03));
            }
            String A0a = C51974G9v.A0a(A042, r5);
            if (A0a.length() > 0) {
                A042.A6C = A0a;
            }
        }
        C51974G9v.A1I(A042, r12, AnonymousClass7TE.A1b(r12.A00()) ? 1 : 0);
        Integer valueOf = Integer.valueOf(r12.A03);
        if (!(r5 == null || valueOf == null)) {
            Integer A2J = r5.A2J();
            int intValue = valueOf.intValue();
            int i = intValue - 1;
            List list2 = null;
            if (i >= 0) {
                C52476GUc gUc = this.A01;
                if (i < C51966G9m.A1J(((IWI) gUc.A00).A01).size()) {
                    1Xj A023 = 1Xi.A02(gUc.A04(i));
                    if (A023 != null) {
                        str3 = A023.getId();
                        num2 = A023.A2I();
                        list = A023.A0e;
                    } else {
                        str3 = null;
                        num2 = null;
                        list = null;
                    }
                    String A003 = C243413Yr.A00(list);
                    if (str3 != null) {
                        A042.A6E = str3;
                    }
                    if (num2 != null) {
                        A042.A0D = num2.intValue();
                    }
                    if (A003 != null) {
                        A042.A52 = A003;
                    }
                }
            }
            if (r12.A0C == AnonymousClass05K.A01) {
                intValue++;
            }
            if (intValue >= 0) {
                C52476GUc gUc2 = this.A01;
                if (intValue < C51966G9m.A1J(((IWI) gUc2.A00).A01).size()) {
                    1Xj A024 = 1Xi.A02(gUc2.A04(intValue));
                    if (A024 != null) {
                        str2 = A024.getId();
                        num = A024.A2I();
                        list2 = A024.A0e;
                    } else {
                        str2 = null;
                        num = null;
                    }
                    String A004 = C243413Yr.A00(list2);
                    if (str2 != null) {
                        A042.A6D = str2;
                    }
                    if (num != null) {
                        A042.A0C = num.intValue();
                    }
                    if (A004 != null) {
                        A042.A51 = A004;
                    }
                }
            }
            if (A2J != null) {
                A042.A0E = A2J.intValue();
            }
        }
        C233822wX.A0H(userSession, A042, r3);
    }

    public final /* bridge */ /* synthetic */ void Cgt(Integer num, Object obj) {
        AnonymousClass3OA r6 = (AnonymousClass3OA) obj;
        AnonymousClass7TG.A1N(r6, num);
        AnonymousClass4DU r3 = this.A02;
        C254523sc A042 = C254513sb.A04(r6, r3, "delivery");
        A042.A7K = "ad";
        UserSession userSession = this.A00;
        A042.A0K(userSession, r6);
        A042.A2r = num;
        A042.A4M = this.A00;
        C51965G9l.A1T(userSession, A042);
        G9w.A1M(userSession, A042);
        C233822wX.A0H(userSession, A042, r3);
    }

    public final /* bridge */ /* synthetic */ void Cgu(C251373n0 r2, Object obj) {
        1PW r3 = (1PW) obj;
        AnonymousClass7TG.A1N(r2, r3);
        A00(r2, r3, "invalidation");
    }

    public final /* bridge */ /* synthetic */ void Cgv(C251373n0 r2, Object obj) {
        1PW r3 = (1PW) obj;
        AnonymousClass7TG.A1N(r2, r3);
        A00(r2, r3, "insertion_success");
    }

    public final /* bridge */ /* synthetic */ void Cgw(1PW r24, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        AnonymousClass3OA A0m = C51969G9p.A0m(obj);
        String str5 = str;
        Collection collection3 = collection;
        Collection collection4 = collection2;
        C51974G9v.A1M(str5, collection3, collection4);
        0qQ.A0B(r24, 11);
        IT4 it4 = new IT4(0, this, A0m);
        UserSession userSession = this.A00;
        AnonymousClass4DU r8 = this.A02;
        ArrayList A1D = AnonymousClass7TE.A1D(collection3);
        ArrayList A1D2 = AnonymousClass7TE.A1D(collection4);
        String str6 = this.A00;
        1Xj r1 = A0m.A0K;
        C233822wX.A0M(userSession, it4, A0m, r8, Integer.valueOf(r1.A0m()), l, str5, str2, str3, str4, str6, (String) null, (String) null, r1.A2p(), (HashMap) map, A1D, A1D2, z);
    }

    public final /* bridge */ /* synthetic */ void Chf(C251373n0 r5, Object obj, String str) {
        1PW r6 = (1PW) obj;
        AnonymousClass7TG.A1N(r5, r6);
        AnonymousClass4DU r3 = this.A02;
        C254523sc A0n = C51965G9l.A0n(r3, "ad_exit_pool");
        UserSession userSession = this.A00;
        A0n.A0K(userSession, (AnonymousClass3OA) r5.BTb());
        A0n.A7K = "ad";
        C51971G9r.A1L(A0n, r6);
        A0n.A4M = this.A00;
        C233822wX.A0H(userSession, A0n, r3);
    }

    public final void Cj5(C251373n0 r3) {
        0wb.A03("logInvalidContent: Discovery Chaining unit is not an ad", C51976G9y.A0L(this, r3));
    }
}
