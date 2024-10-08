package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class GXT extends C233202vF {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C233182vC A02;
    public final String A03;
    public final boolean A04;
    public final C233172vA A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GXT(com.instagram.common.session.UserSession r12, X.C233172vA r13, X.AnonymousClass4DU r14, X.C233182vC r15, java.lang.String r16) {
        /*
            r11 = this;
            r0 = 3
            r9 = r16
            X.0qQ.A0B(r9, r0)
            r7 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r15
            r10 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r12
            r11.A01 = r14
            r11.A03 = r9
            r11.A05 = r13
            r11.A02 = r15
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322439638034621(0x810b11000028bd, double:3.033795313593419E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            r11.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GXT.<init>(com.instagram.common.session.UserSession, X.2vA, X.4DU, X.2vC, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3mI, X.GV9] */
    public final /* bridge */ /* synthetic */ void Cgv(C251373n0 r9, Object obj) {
        1PW r10 = (1PW) obj;
        AnonymousClass7TF.A1H(r9, r10);
        C376509Ig r2 = (C376509Ig) r9.BTb();
        1Xj A002 = ((C295745oq) r2.A02).A00();
        String str = null;
        if (A002 != null) {
            ? r0 = new C250933mI();
            r0.A0L = A002;
            C233462vl r7 = (C233462vl) r2.A04;
            r0.A00 = r7;
            GV8 A012 = r0.A01();
            AnonymousClass4DU r4 = this.A01;
            C254523sc A042 = C254513sb.A04(A012, r4, "insertion_success");
            UserSession userSession = this.A00;
            A042.A0K(userSession, A012);
            A042.A7K = "ad";
            A042.A4s = r4.getModuleName();
            A042.A7Q = this.A03;
            A042.A07(r9.BnH());
            C51971G9r.A1L(A042, r10);
            A042.A2r = r9.Bxj();
            A042.A3G = DbS.A0j(r10.A02);
            A042.A4M = this.A00;
            A042.A1G = Boolean.valueOf(1Au.A00(userSession).A1j());
            1Xj r5 = A012.A0K;
            A042.A8B = C231122qu.A0R(userSession, r5);
            C51965G9l.A1T(userSession, A042);
            A042.A08 = r10.A03;
            A042.A02 = r10.A00;
            if (r7 != null) {
                str = r7.A08;
            }
            A042.A77 = str;
            if (this.A04) {
                AnonymousClass3VI.A00(userSession).A05(r4, Integer.valueOf(r10.A03));
            }
            G9w.A1M(userSession, A042);
            C51974G9v.A1I(A042, r10, AnonymousClass7TE.A1b(r10.A00()) ? 1 : 0);
            int A0m = r5.A0m();
            if (A0m != -1) {
                A042.A2k = Integer.valueOf(A0m);
            }
            String A2p = r5.A2p();
            if (A2p.length() > 0) {
                A042.A6C = A2p;
            }
            C233822wX.A0H(userSession, A042, r4);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3mI, X.GV9] */
    public final /* bridge */ /* synthetic */ void Cgw(1PW r30, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        Integer num;
        String str5;
        Map map3 = map;
        C376509Ig r6 = (C376509Ig) obj;
        0qQ.A0B(r6, 0);
        String str6 = str;
        Collection collection3 = collection;
        Collection collection4 = collection2;
        C51974G9v.A1M(str6, collection3, collection4);
        0qQ.A0B(r30, 11);
        C295745oq r5 = (C295745oq) r6.A02;
        1Xj A002 = r5.A00();
        String str7 = null;
        if (A002 != null) {
            ? r0 = new C250933mI();
            r0.A0L = A002;
            C233472vm r2 = (C233472vm) r6.A04;
            r0.A00 = r2;
            GV8 A012 = r0.A01();
            IT5 it5 = new IT5(0, A012, r6, this);
            UserSession userSession = this.A00;
            boolean A06 = 182.A06(0Tu.A05, userSession, 36319295722167401L);
            AnonymousClass4DU r14 = this.A01;
            ArrayList A1D = AnonymousClass7TE.A1D(collection3);
            ArrayList A1D2 = AnonymousClass7TE.A1D(collection4);
            String str8 = this.A00;
            HashMap hashMap = (HashMap) map3;
            if (A06 && map2 != null) {
                Iterator A0u = AnonymousClass7TF.A0u(map2);
                while (true) {
                    if (!A0u.hasNext()) {
                        break;
                    }
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    Object key = A1J.getKey();
                    C271744jW r8 = (C271744jW) A1J.getValue();
                    1Xj A003 = r5.A00();
                    if (A003 == null || (str5 = A003.A2R()) == null) {
                        str5 = "";
                    }
                    if (0qQ.A0K(key, str5)) {
                        Integer AwI = r8.AwI();
                        Integer num2 = (Integer) r6.A01;
                        if (!(AwI == null || num2 == null)) {
                            str7 = 002.A0g(AnonymousClass93b.A00(AwI), "_then_", AnonymousClass93b.A00(num2));
                            break;
                        }
                    }
                }
            }
            1Xj r52 = A012.A0K;
            String str9 = str6;
            C233822wX.A0M(userSession, it5, A012, r14, Integer.valueOf(r52.A0m()), l, str9, str2, str3, str4, str8, str7, (String) null, r52.A2p(), hashMap, A1D, A1D2, z);
            if (this.A04) {
                AnonymousClass3VK A004 = AnonymousClass3VI.A00(userSession);
                if (r2 != null) {
                    num = Integer.valueOf(r2.A09());
                } else {
                    num = null;
                }
                A004.A06(r14, num);
            }
        }
    }
}
