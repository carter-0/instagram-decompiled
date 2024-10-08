package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.GUo  reason: case insensitive filesystem */
public final class C52486GUo extends C233202vF {
    public final int A00;
    public final UserSession A01;
    public final C233172vA A02;
    public final C238233Bb A03;
    public final AnonymousClass4DU A04;

    public C52486GUo(UserSession userSession, C233172vA r11, AnonymousClass4DU r12, C233182vC r13, String str, int i) {
        super(userSession, r11, r12, (AnonymousClass57O) null, r13, str, (String) null);
        this.A01 = userSession;
        this.A04 = r12;
        this.A02 = r11;
        this.A00 = i;
        C238233Bb r0 = C238233Bb.A02;
        0qQ.A07(r0);
        this.A03 = r0;
    }

    public final void Cj5(C251373n0 r11) {
        0qQ.A0B(r11, 0);
        AnonymousClass3OA r0 = (AnonymousClass3OA) r11.BTb();
        0wb.A03("logInvalidContent: Search Feed Ad item is not an ad", 002.A17("ad_id: [", r0.A0S, "] tracking_token: [", r0.A0j, "] media_id: [", r0.A0K.getId(), "] ad_client_delivery_session_id: [", this.A00, ']'));
    }

    public final /* bridge */ /* synthetic */ void Cgt(Integer num, Object obj) {
        AnonymousClass3OA r7 = (AnonymousClass3OA) obj;
        boolean A1Z = AnonymousClass7TG.A1Z(r7, num);
        AnonymousClass4DU r4 = this.A04;
        C254523sc A042 = C254513sb.A04(r7, r4, "delivery");
        A042.A7K = "ad";
        UserSession userSession = this.A01;
        A042.A0K(userSession, r7);
        A042.A2r = num;
        A042.A4M = this.A00;
        A042.A8B = C231122qu.A0R(userSession, r7.A0K);
        A042.A8A = A1Z;
        A042.A5X = r7.A0c;
        A042.A4s = r4.getModuleName();
        C51965G9l.A1T(userSession, A042);
        C233172vA r1 = this.A02;
        Integer num2 = r1.A0F;
        if (num2 != null) {
            A042.A07(num2.intValue());
        }
        Integer num3 = r1.A0E;
        if (num3 != null) {
            A042.A3I = C51969G9p.A0r(num3);
        }
        A042.A47 = DbS.A0j(this.A00);
        G9w.A1M(userSession, A042);
        C233822wX.A0H(userSession, A042, r4);
    }

    public final /* bridge */ /* synthetic */ void Cgv(C251373n0 r9, Object obj) {
        1PW r10 = (1PW) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r9, r10);
        Object BTb = r9.BTb();
        AnonymousClass4DU r5 = this.A04;
        C254523sc A042 = C254513sb.A04((1Nv) BTb, r5, "insertion_success");
        UserSession userSession = this.A01;
        AnonymousClass3OA r2 = (AnonymousClass3OA) BTb;
        C51973G9u.A1C(userSession, A042, r2, r9);
        A042.A2r = r9.Bxj();
        A042.A3G = DbS.A0j(r10.A02);
        A042.A4M = this.A00;
        1Xj r6 = r2.A0K;
        A042.A8B = C231122qu.A0R(userSession, r6);
        A042.A8A = A1U;
        A042.A5X = r2.A0c;
        A042.A4s = r5.getModuleName();
        C51965G9l.A1T(userSession, A042);
        Integer num = r2.A0P;
        if (num != null) {
            A042.A47 = C51969G9p.A0r(num);
        }
        C51971G9r.A1L(A042, r10);
        C233472vm r0 = ((GV8) BTb).A00;
        if (r0 != null) {
            A042.A0O(r0);
            A042.A3g = DbS.A0j(r0.A07());
            A042.A3i = -1L;
            A042.A3h = -1L;
            A042.A3j = -1L;
        }
        G9w.A1M(userSession, A042);
        Integer num2 = AnonymousClass05K.A00;
        Integer num3 = r10.A0C;
        if (num2 == num3) {
            A042.A0G = r10.A03;
        } else if (AnonymousClass05K.A01 == num3) {
            C51974G9v.A1I(A042, r10, AnonymousClass7TE.A1b(r10.A00()) ? 1 : 0);
            A042.A02 = r10.A00;
            int i = r10.A03;
            A042.A08 = i;
            C238233Bb r22 = this.A03;
            A042.A0Q(Integer.valueOf(r22.A00(C267004ai.AD, i)));
            A042.A0S(Integer.valueOf(r22.A00(C267004ai.NETEGO, r10.A03)));
            String A0a = C51974G9v.A0a(A042, r6);
            if (A0a.length() > 0) {
                A042.A6C = A0a;
            }
        }
        C233822wX.A0H(userSession, A042, r5);
    }

    public final /* bridge */ /* synthetic */ void Cgw(1PW r24, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        AnonymousClass3OA A0m = C51969G9p.A0m(obj);
        String str5 = str;
        Collection collection3 = collection;
        Collection collection4 = collection2;
        C51974G9v.A1M(str5, collection3, collection4);
        0qQ.A0B(r24, 11);
        IT4 it4 = new IT4(1, this, A0m);
        UserSession userSession = this.A01;
        AnonymousClass4DU r8 = this.A04;
        ArrayList A1D = AnonymousClass7TE.A1D(collection3);
        ArrayList A1D2 = AnonymousClass7TE.A1D(collection4);
        String str6 = this.A00;
        1Xj r1 = A0m.A0K;
        C233822wX.A0M(userSession, it4, A0m, r8, Integer.valueOf(r1.A0m()), l, str5, str2, str3, str4, str6, (String) null, (String) null, r1.A2p(), (HashMap) map, A1D, A1D2, z);
    }
}
