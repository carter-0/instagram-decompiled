package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qu  reason: invalid class name and case insensitive filesystem */
public abstract class C231122qu {
    public static final IGCTMessagingAdsInfoDictIntf A00(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 0);
        if (r2 == null) {
            return null;
        }
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 != null) {
            return A00.A09;
        }
        return r2.A1H();
    }

    public static final C257783xx A02(UserSession userSession, 1Xj r2) {
        C250513lZ injected;
        C257783xx BFg;
        0qQ.A0B(userSession, 0);
        if (r2 == null) {
            return null;
        }
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 != null && (injected = A00.A0J.A0C.getInjected()) != null && (BFg = injected.BFg()) != null) {
            return BFg;
        }
        C250513lZ injected2 = r2.A0C.getInjected();
        if (injected2 != null) {
            return injected2.BFg();
        }
        return null;
    }

    public static final C257893y8 A03(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 != null) {
            return A00.A0G;
        }
        C250513lZ injected = r2.A0C.getInjected();
        if (injected != null) {
            return injected.BhM();
        }
        return null;
    }

    public static final Integer A05(UserSession userSession, 1Xj r2) {
        0qQ.A0B(r2, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 != null) {
            return A00.A0P;
        }
        return r2.B9V();
    }

    public static final String A06(UserSession userSession, 1Nv r2) {
        0qQ.A0B(userSession, 0);
        if (r2 instanceof 1Xj) {
            return A0F(userSession, (1Xj) r2);
        }
        if (r2 != null) {
            return r2.ByO(userSession);
        }
        return null;
    }

    public static final String A07(UserSession userSession, 1Xj r2) {
        String str;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 == null || (str = A00.A0S) == null) {
            return r2.A2R();
        }
        return str;
    }

    public static final String A09(UserSession userSession, 1Xj r2) {
        String AsL;
        String str;
        0qQ.A0B(userSession, 0);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 != null && (str = A00.A0R) != null) {
            return str;
        }
        C250513lZ injected = r2.A0C.getInjected();
        if (injected == null || (AsL = injected.AsL()) == null) {
            return "UNKNOWN";
        }
        return AsL;
    }

    public static final String A0F(UserSession userSession, 1Xj r2) {
        String str;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 == null || (str = A00.A0j) == null) {
            return r2.A2v();
        }
        return str;
    }

    public static final String A0G(UserSession userSession, 1Xj r3) {
        String fullName;
        String A2S;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r3);
        if (A00 == null || (fullName = A00.A0U) == null || fullName.length() <= 0) {
            if (!r3.CcK() || (A2S = r3.A2S()) == null || A2S.length() == 0) {
                User A2A = r3.A2A(userSession);
                if (A2A == null) {
                    return "";
                }
                fullName = A2A.getFullName();
            } else {
                fullName = r3.A2S();
            }
            if (fullName == null) {
                return "";
            }
        }
        return fullName;
    }

    public static final String A0H(UserSession userSession, String str) {
        AnonymousClass3OA r1;
        0qQ.A0B(userSession, 0);
        if (str == null) {
            return null;
        }
        AnonymousClass1wP A00 = 1wN.A00(userSession);
        if (C67741wV.A00 || (r1 = (AnonymousClass3OA) A00.A00.get(str)) == null) {
            return null;
        }
        return r1.A0c;
    }

    public static final String A0I(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        1Xj A02 = 1E7.A00(userSession).A02(str);
        if (A02 == null) {
            return null;
        }
        return A0F(userSession, A02);
    }

    public static final String A0J(String str) {
        0qQ.A0B(str, 0);
        if (str.length() <= 27) {
            return str;
        }
        String substring = str.substring(0, 27);
        0qQ.A07(substring);
        String A0R = 002.A0R(substring, "...");
        0qQ.A0A(A0R);
        return A0R;
    }

    public static final List A0K(UserSession userSession, 1Xj r2) {
        ImmutableList immutableList;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 != null && (immutableList = A00.A00) != null) {
            return immutableList;
        }
        C250513lZ injected = r2.A0C.getInjected();
        if (injected != null) {
            return injected.getCookies();
        }
        return null;
    }

    public static final boolean A0M(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 0);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r2);
        if (A00 != null) {
            return A00.A0o;
        }
        C250513lZ injected = r2.A0C.getInjected();
        if (injected != null) {
            return 0qQ.A0K(injected.AxE(), true);
        }
        return false;
    }

    public static final boolean A0O(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r4);
        if (A00 != null) {
            return A00.A0w;
        }
        C250513lZ injected = r4.A0C.getInjected();
        if (injected != null) {
            return 0qQ.A0K(injected.CXn(), true);
        }
        return false;
    }

    public static final boolean A0R(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r4);
        if (A00 != null) {
            return A00.A12;
        }
        C250513lZ injected = r4.A0C.getInjected();
        if (injected != null) {
            return 0qQ.A0K(injected.CRL(), true);
        }
        return false;
    }

    public static final boolean A0S(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r4);
        if (A00 != null) {
            return A00.A13;
        }
        C250513lZ injected = r4.A0C.getInjected();
        if (injected != null) {
            return 0qQ.A0K(injected.CUk(), true);
        }
        return false;
    }

    public static final boolean A0T(UserSession userSession, 1Xj r4) {
        0qQ.A0B(r4, 1);
        if (!r4.A55() || r4.A5D() || r4.A5e() || r4.A5o() || r4.A5n() || r4.A0C.BMq() == null || !182.A06(0Tu.A05, userSession, 36329333060550707L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0U(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r4);
        if (A00 != null) {
            return A00.A14;
        }
        C250513lZ injected = r4.A0C.getInjected();
        if (injected != null) {
            return 0qQ.A0K(injected.AyJ(), true);
        }
        return false;
    }

    public static final boolean A0V(UserSession userSession, 1Xj r4) {
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r4);
        if (A00 != null) {
            return A00.A0p;
        }
        C250513lZ injected = r4.A0C.getInjected();
        if (injected != null) {
            return 0qQ.A0K(injected.Ay6(), true);
        }
        return false;
    }

    public static final boolean A0W(UserSession userSession, 1Xj r5, User user) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(user, 2);
        C257893y8 A03 = A03(userSession, r5);
        if (A03 == null) {
            return false;
        }
        Integer Bqc = A03.Bqc();
        if (Bqc != null && Bqc.intValue() == 8 && user.B6o() == FollowStatus.A05) {
            return false;
        }
        return true;
    }

    public static final boolean A0X(UserSession userSession, String str, boolean z) {
        AnonymousClass3OA r0;
        0qQ.A0B(str, 1);
        AnonymousClass1wP A00 = 1wN.A00(userSession);
        if (C67741wV.A00 || (r0 = (AnonymousClass3OA) A00.A00.get(str)) == null) {
            return z;
        }
        return r0.A15;
    }

    public static final boolean A0Y(AnonymousClass3ZH r4) {
        List sponsorTags;
        AnonymousClass536 r0;
        AnonymousClass3ZG r2 = r4.A00;
        List sponsorTags2 = r2.getSponsorTags();
        if (sponsorTags2 == null || sponsorTags2.isEmpty() || (sponsorTags = r2.getSponsorTags()) == null || (r0 = (AnonymousClass536) 00k.A0O(sponsorTags, 0)) == null || r0.ByI() == null) {
            return false;
        }
        return true;
    }

    public static final 1Xj A04(Object obj) {
        if (obj instanceof 1Xj) {
            return (1Xj) obj;
        }
        if (obj instanceof AnonymousClass3OA) {
            return ((AnonymousClass3OA) obj).A0K;
        }
        return null;
    }

    public static final Map A0L(List list) {
        C250953mK r2;
        C250953mK r22;
        if (list == null) {
            return 0Yt.A0E();
        }
        ArrayList<C250073kr> arrayList = new ArrayList<>();
        for (Object next : list) {
            Integer BYX = ((C250073kr) next).BYX();
            C250953mK[] values = C250953mK.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r22 = C250953mK.UNRECOGNIZED;
                    break;
                }
                r22 = values[i];
                int i2 = r22.A00;
                if (BYX != null && i2 == BYX.intValue()) {
                    break;
                }
                i++;
            }
            if (r22 != C250953mK.UNRECOGNIZED) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C250073kr r0 : arrayList) {
            Integer BYZ = r0.BYZ();
            if (BYZ != null) {
                Integer BYX2 = r0.BYX();
                C250953mK[] values2 = C250953mK.values();
                int length2 = values2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        r2 = C250953mK.UNRECOGNIZED;
                        break;
                    }
                    r2 = values2[i3];
                    int i4 = r2.A00;
                    if (BYX2 != null && i4 == BYX2.intValue()) {
                        break;
                    }
                    i3++;
                }
                arrayList2.add(new 0eP(r2, BYZ));
            }
        }
        return 0Yt.A08(arrayList2);
    }

    public static final boolean A0Q(UserSession userSession, 1Xj r5) {
        List<1Xj> Alu = r5.A0C.Alu();
        if (Alu == null) {
            return false;
        }
        if ((Alu instanceof Collection) && Alu.isEmpty()) {
            return false;
        }
        for (1Xj r0 : Alu) {
            if (r0.A0C.AzZ() != null) {
                if (userSession == null || !182.A06(0Tu.A05, userSession, 36325368805798826L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final C250363lK A01(UserSession userSession, 1Xj r1) {
        C250513lZ injected;
        C250363lK BE1;
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r1);
        if (A00 != null && (injected = A00.A0J.A0C.getInjected()) != null && (BE1 = injected.BE1()) != null) {
            return BE1;
        }
        C250513lZ injected2 = r1.A0C.getInjected();
        if (injected2 != null) {
            return injected2.BE1();
        }
        return null;
    }

    public static final String A08(UserSession userSession, 1Xj r1) {
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r1);
        if (A00 != null) {
            return A00.A0U;
        }
        return r1.A2S();
    }

    public static final String A0A(UserSession userSession, 1Xj r1) {
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r1);
        if (A00 != null) {
            return A00.A0Y;
        }
        return r1.A2c();
    }

    public static final String A0B(UserSession userSession, 1Xj r1) {
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r1);
        if (A00 != null) {
            return A00.A0Z;
        }
        return r1.A2d();
    }

    public static final String A0C(UserSession userSession, 1Xj r1) {
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r1);
        if (A00 != null) {
            return A00.A0a;
        }
        return r1.A2e();
    }

    public static final String A0D(UserSession userSession, 1Xj r1) {
        C257883y7 BdU;
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r1);
        if (A00 != null) {
            return A00.A0h;
        }
        C250513lZ injected = r1.A0C.getInjected();
        if (injected == null || (BdU = injected.BdU()) == null) {
            return null;
        }
        return BdU.AjA();
    }

    public static final String A0E(UserSession userSession, 1Xj r1) {
        String str;
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r1);
        if (A00 != null && (str = A00.A0i) != null) {
            return str;
        }
        C250513lZ injected = r1.A0C.getInjected();
        if (injected != null) {
            return injected.BKL();
        }
        return null;
    }

    public static final boolean A0N(UserSession userSession, 1Xj r1) {
        AnonymousClass3OA A00 = 1wN.A00(userSession).A00(r1);
        if (A00 != null) {
            return A00.A0r;
        }
        C250513lZ injected = r1.A0C.getInjected();
        if (injected != null) {
            return 0qQ.A0K(injected.CPA(), true);
        }
        return false;
    }

    public static final boolean A0P(UserSession userSession, 1Xj r2) {
        if (A0a(r2) || A0Z(r2) || A0Q(userSession, r2)) {
            return true;
        }
        return false;
    }

    public static final boolean A0Z(1Xj r2) {
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption;
        if (r2.CcK() && r2.A29() != null) {
            C250513lZ injected = r2.A0C.getInjected();
            if (injected != null) {
                brandedContentAdsPaidPartnershipLabelRemovalOption = injected.Afb();
            } else {
                brandedContentAdsPaidPartnershipLabelRemovalOption = null;
            }
            if (brandedContentAdsPaidPartnershipLabelRemovalOption != BrandedContentAdsPaidPartnershipLabelRemovalOption.DUAL_HEADER_AND) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0a(1Xj r2) {
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption;
        if (r2.CcK() && r2.A29() != null) {
            C250513lZ injected = r2.A0C.getInjected();
            if (injected != null) {
                brandedContentAdsPaidPartnershipLabelRemovalOption = injected.Afb();
            } else {
                brandedContentAdsPaidPartnershipLabelRemovalOption = null;
            }
            if (brandedContentAdsPaidPartnershipLabelRemovalOption != BrandedContentAdsPaidPartnershipLabelRemovalOption.DUAL_HEADER_WITH) {
                return false;
            }
            return true;
        }
        return false;
    }
}
