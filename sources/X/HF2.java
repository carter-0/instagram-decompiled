package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class HF2 extends C233202vF {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C233172vA A02;
    public final C233182vC A03;

    public HF2(UserSession userSession, C233172vA r10, AnonymousClass4DU r11, C233182vC r12, String str) {
        super(userSession, r10, r11, (AnonymousClass57O) null, r12, str, (String) null);
        this.A00 = userSession;
        this.A01 = r11;
        this.A02 = r10;
        this.A03 = r12;
    }

    public final /* bridge */ /* synthetic */ void Cgt(Integer num, Object obj) {
        AnonymousClass3OA r6 = (AnonymousClass3OA) obj;
        AnonymousClass7TG.A1N(r6, num);
        AnonymousClass4DU r3 = this.A01;
        C254523sc A04 = C254513sb.A04(r6, r3, "delivery");
        A04.A7K = "ad";
        UserSession userSession = this.A00;
        A04.A0K(userSession, r6);
        A04.A2r = num;
        A04.A4M = this.A00;
        C51965G9l.A1T(userSession, A04);
        G9w.A1M(userSession, A04);
        C233822wX.A0H(userSession, A04, r3);
    }

    public final /* bridge */ /* synthetic */ void Cgu(C251373n0 r2, Object obj) {
        1PW r3 = (1PW) obj;
        AnonymousClass7TG.A1N(r2, r3);
        A00(r2, r3, "insertion_failure");
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
        IT4 it4 = new IT4(2, this, A0m);
        UserSession userSession = this.A00;
        AnonymousClass4DU r8 = this.A01;
        ArrayList A1D = AnonymousClass7TE.A1D(collection3);
        ArrayList A1D2 = AnonymousClass7TE.A1D(collection4);
        String str6 = this.A00;
        1Xj r1 = A0m.A0K;
        C233822wX.A0M(userSession, it4, A0m, r8, Integer.valueOf(r1.A0m()), l, str5, str2, str3, str4, str6, (String) null, (String) null, r1.A2p(), (HashMap) map, A1D, A1D2, z);
    }

    public final /* bridge */ /* synthetic */ void Chf(C251373n0 r5, Object obj, String str) {
        1PW r6 = (1PW) obj;
        AnonymousClass7TG.A1N(r5, r6);
        AnonymousClass4DU r3 = this.A01;
        C254523sc A0n = C51965G9l.A0n(r3, "ad_exit_pool");
        UserSession userSession = this.A00;
        A0n.A0K(userSession, (AnonymousClass3OA) r5.BTb());
        A0n.A7K = "ad";
        C51971G9r.A1L(A0n, r6);
        A0n.A4M = this.A00;
        C233822wX.A0H(userSession, A0n, r3);
    }

    private final void A00(C251373n0 r7, 1PW r8, String str) {
        Object BTb = r7.BTb();
        AnonymousClass4DU r3 = this.A01;
        C254523sc A04 = C254513sb.A04((1Nv) BTb, r3, str);
        UserSession userSession = this.A00;
        AnonymousClass3OA r5 = (AnonymousClass3OA) BTb;
        C51973G9u.A1C(userSession, A04, r5, r7);
        C51971G9r.A1L(A04, r8);
        G9w.A1N(A04, this, r7, r8);
        C51965G9l.A1T(userSession, A04);
        Integer num = AnonymousClass05K.A00;
        Integer num2 = r8.A0C;
        if (num == num2) {
            A04.A0G = r8.A03;
        } else if (AnonymousClass05K.A01 == num2) {
            C51974G9v.A1I(A04, r8, AnonymousClass7TE.A1b(r8.A00()) ? 1 : 0);
            A04.A08 = r8.A03;
            String A0a = C51974G9v.A0a(A04, r5.A0K);
            if (A0a.length() > 0) {
                A04.A6C = A0a;
            }
        }
        G9w.A1M(userSession, A04);
        C233822wX.A0H(userSession, A04, r3);
    }

    public final void Cj5(C251373n0 r3) {
        0wb.A03("logInvalidContent: Intent Aware Ad item is not an ad", C51976G9y.A0L(this, r3));
    }
}
