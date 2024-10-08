package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Hd9  reason: case insensitive filesystem */
public abstract class C55157Hd9 {
    public static final void A00(UserSession userSession, 1L5 r13, HashMap hashMap) {
        long j;
        long j2;
        AnonymousClass7TG.A1O(hashMap, r13);
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession, 36325819777365243L);
        boolean A062 = 182.A06(r2, userSession, 36325819777430780L);
        if (A06 || A062) {
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            int i = 0;
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                AnonymousClass9IV r8 = (AnonymousClass9IV) C51971G9r.A0p(A0s);
                if (r8 != null) {
                    C233162v9 r1 = (C233162v9) ((AnonymousClass9J4) r8.A01).A04;
                    if (!C254393sP.A01(r1)) {
                        if (r1 == C233162v9.SEEN_STATE) {
                            C253513qu r22 = (C253513qu) r8.A00;
                            String A04 = r22.A04();
                            AnonymousClass9IV r12 = (AnonymousClass9IV) A1H.get(A04);
                            if (r12 != null) {
                                if (r22 instanceof C253533qw) {
                                    j = ((C253533qw) r22).A0A;
                                } else {
                                    j = -1;
                                }
                                C253513qu r14 = (C253513qu) r12.A00;
                                if (r14 instanceof C253533qw) {
                                    j2 = ((C253533qw) r14).A0A;
                                } else {
                                    j2 = -1;
                                }
                                if (j > j2) {
                                    A1H.put(A04, r8);
                                }
                            } else {
                                A1H.put(A04, r8);
                            }
                        } else if (A06) {
                            r13.EGW(r8, AnonymousClass05K.A00);
                        }
                        i++;
                    }
                }
            }
            if (A06) {
                for (AnonymousClass9IV EGW : A1H.values()) {
                    r13.EGW(EGW, AnonymousClass05K.A00);
                }
            }
            if (A062) {
                r13.EGX(i, AnonymousClass05K.A00);
            }
        }
    }
}
