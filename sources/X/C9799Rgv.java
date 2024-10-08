package X;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Rgv  reason: case insensitive filesystem */
public abstract class C9799Rgv {
    /* JADX WARNING: type inference failed for: r6v2, types: [X.RsP, java.lang.Object] */
    public static final C60340gF A00(C307896Rx r27, AnonymousClass6Tm r28) {
        List list;
        String str;
        Set keySet;
        C307896Rx r6 = r27;
        C307786Rm r9 = r6.A03;
        if (r9 != null) {
            AnonymousClass6Tm r7 = r28;
            Object A02 = r7.A02();
            0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
            String A0p = DbX.A0p(r7, "null cannot be cast to non-null type kotlin.String");
            List list2 = r7.A00;
            String A0t = DbU.A0t(list2, 3);
            String A0t2 = DbU.A0t(list2, 4);
            String A0t3 = DbU.A0t(list2, 5);
            String A0n = Pxg.A0n(r7, 7);
            Object A03 = r7.A03(8);
            0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            C277014uI A0P = DbW.A0P(r7, 10);
            C277014uI A0P2 = DbW.A0P(r7, 11);
            list2.get(12);
            Context context = r9.A00;
            SOC A04 = AnonymousClass2E0.A04();
            0qQ.A07(A04);
            C11029S6h s6h = new C11029S6h(context, A04, new C10622RvG(r6, A0P, A0P2), (String) A02, A0p, A0t, A0t2, A0t3, A0n, (List) list2.get(6), (Map) A03, (Map) list2.get(9));
            SOC soc = s6h.A01;
            String str2 = s6h.A04;
            String str3 = s6h.A05;
            String str4 = s6h.A03;
            Map map = s6h.A07;
            Map map2 = s6h.A08;
            if (map2 == null || (keySet = map2.keySet()) == null) {
                list = 0sn.A00;
            } else {
                list = 00k.A0a(keySet);
            }
            if (map.get("target_account_id") != null) {
                str = Pxf.A0j("target_account_id", map);
            } else {
                str = null;
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("PAYMENT_TYPE", str2);
            A1E.put("SESSION_ID_LOGGING_KEY", str3);
            SSZ ssz = soc.A01;
            HashSet A12 = C66580MXl.A12(list);
            ? obj = new Object();
            obj.A00 = map;
            obj.A01 = A12;
            Set set = 0sl.A00;
            String str5 = str2;
            C11214SFo sFo = new C11214SFo(C11095S9w.A00(new C12496SvS(ssz, 1), set), obj, str4, str, (String) null, (String) null, (String) null, str5, A1E, set);
            SJB sjb = new SJB(sFo.A03, (String) null, (String) null, (String) null, str5, AnonymousClass7TF.A0c());
            SFZ sfz = soc.A02;
            sfz.A03.put(sjb, new C12486SvI(s6h));
            AnonymousClass5A3 A06 = AnonymousClass2E0.A06();
            0qQ.A07(A06);
            SUj.A0H(SSC.A03(SQA.A03(soc, A06, sFo)), new C11648Sdq(8, (Object) sjb, (Object) s6h));
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0y();
    }
}
