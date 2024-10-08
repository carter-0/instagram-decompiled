package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.ArrayList;

public final class GCQ {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass93U A03;
    public final GD6 A04;
    public final C59624JQs A05;
    public final C52016GBn A06;
    public final C52012GBj A07;

    public GCQ(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4, AnonymousClass93U r5, GD6 gd6, C59624JQs jQs, C52016GBn gBn, C52012GBj gBj) {
        AnonymousClass7TG.A0w(1, userSession, r4, r5);
        AnonymousClass7TF.A1F(gBn, 5, jQs);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = gBn;
        this.A04 = gd6;
        this.A07 = gBj;
        this.A05 = jQs;
    }

    public final void A00(C267324bN r31, C52058GDe gDe, C13823Tht tht, 2EG r34, S6e s6e, C55571Hjr hjr, Boolean bool, String str, float f, float f2, boolean z, boolean z2, boolean z3) {
        AnonymousClass3OA A072;
        AnonymousClass3OA A073;
        ArrayList A3K;
        Product product;
        String str2;
        C2608347f Atb;
        AnonymousClass3OA A074;
        String str3;
        C62320sa r0;
        2EG r23 = r34;
        C267324bN r7 = r31;
        AnonymousClass3OA r6 = r7.A02;
        if (r6 != null) {
            C52058GDe gDe2 = gDe;
            AnonymousClass3W1 r10 = gDe2.A0E;
            if (r10 != null) {
                if (r7.CcK()) {
                    A072 = r7.A06();
                } else {
                    A072 = r7.A07();
                    if (A072 == null) {
                        A072 = r6;
                    }
                }
                UserSession userSession = this.A01;
                C271794jb r12 = new C271794jb(userSession, (1Xl) A072, r10.A06());
                r12.A04 = r10.A1L;
                C59624JQs jQs = this.A05;
                AnonymousClass5Gv r9 = null;
                if (jQs.CRt(r7, false) && (r0 = jQs.Arh().A02) != null) {
                    r0.invoke();
                }
                0Tu r3 = 0Tu.A06;
                if (182.A06(r3, userSession, 2342164594155529784L)) {
                    AnonymousClass4DH r2 = this.A00;
                    if (r2.getActivity() == null) {
                        if (r7.CcK()) {
                            A074 = r7.A06();
                        } else {
                            A074 = r7.A07();
                            if (A074 == null) {
                                str3 = null;
                                0f9 AEf = 0wj.A01.AEf(String.valueOf(this), 817896246);
                                AEf.ABQ("FragmentDetachedActivity", AnonymousClass7TG.A0m(r2, "Could not get activity from fragment: ", AnonymousClass7TE.A1A()));
                                AEf.ABQ("UrlSource", String.valueOf(r23));
                                AEf.ABQ("UserId", userSession.A06);
                                AEf.ABQ("AdId", String.valueOf(str3));
                                AEf.ABQ("FragmentState", String.valueOf(r2.mLifecycleRegistry.A07()));
                                AEf.report();
                                return;
                            }
                        }
                        str3 = A074.A0S;
                        0f9 AEf2 = 0wj.A01.AEf(String.valueOf(this), 817896246);
                        AEf2.ABQ("FragmentDetachedActivity", AnonymousClass7TG.A0m(r2, "Could not get activity from fragment: ", AnonymousClass7TE.A1A()));
                        AEf2.ABQ("UrlSource", String.valueOf(r23));
                        AEf2.ABQ("UserId", userSession.A06);
                        AEf2.ABQ("AdId", String.valueOf(str3));
                        AEf2.ABQ("FragmentState", String.valueOf(r2.mLifecycleRegistry.A07()));
                        AEf2.report();
                        return;
                    }
                }
                Fragment fragment = this.A00;
                if (r34 == null) {
                    r23 = 2EG.A0w;
                }
                AnonymousClass4DU r02 = this.A02;
                AnonymousClass4DU r25 = r02;
                Q03 q03 = new Q03(fragment, userSession, r12, r02, r23);
                if (r7.CcK()) {
                    A073 = r7.A06();
                } else {
                    A073 = r7.A07();
                }
                if (A073 != null) {
                    q03.A0O = A073;
                    q03.A0J = r6;
                    q03.A0B = r10.getPosition();
                    q03.A0K = r10;
                    AnonymousClass93U r18 = this.A03;
                    q03.A0h = r18.getSessionId();
                    float f3 = f;
                    q03.A06 = f3;
                    float f4 = f2;
                    q03.A07 = f4;
                    boolean z4 = z;
                    q03.A0n = z4;
                    boolean z5 = z2;
                    q03.A0o = z5;
                    q03.A0q = z3;
                    if (r7.A0E()) {
                        q03.A09 = r10.A03;
                    }
                    IntentAwareAdsInfoIntf A002 = r7.A00();
                    if (A002 != null) {
                        q03.A0H = A002;
                        if (r7.A0F()) {
                            Integer A0A = r7.A0A();
                            if (A0A != null) {
                                q03.A0Y = A0A;
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    }
                    if (r7.A06().A0t) {
                        q03.A0I = C56373HxR.A00(jQs.BlO(r7));
                    }
                    String str4 = gDe2.A05;
                    if (str4 != null) {
                        q03.A0d = str4;
                        gDe2.A05 = null;
                    }
                    1Xj r03 = r7.A02;
                    if (r03 == null || (Atb = r03.A0C.Atb()) == null || !AnonymousClass7TF.A1Y(Atb.Bud(), true) || !182.A06(0Tu.A05, userSession, 36321615004313183L)) {
                        if (z3) {
                            FragmentActivity requireActivity = fragment.requireActivity();
                            GD6 gd6 = this.A04;
                            C52012GBj gBj = this.A07;
                            C52016GBn gBn = this.A06;
                            C55571Hjr hjr2 = hjr;
                            if (hjr != null) {
                                r9 = hjr2.A00;
                            }
                            S6e s6e2 = s6e;
                            q03.A0S = new C57401Ia7(requireActivity, r7, userSession, r6, r10, r9, s6e2, gd6, gBn, gBj);
                            q03.A0b = str;
                            q03.A0T = s6e2;
                            q03.A0R = tht;
                            q03.A03 = C51965G9l.A00(r3, userSession, 37166009871106460L);
                            q03.A0r = C51965G9l.A1a(r3, userSession, 36321584940852783L);
                            q03.A0s = true;
                            boolean A062 = 182.A06(r3, userSession, 36321584939935271L);
                            if (A062 || 182.A06(r3, userSession, 36321584940262953L)) {
                                q03.A0Q = new IZW(userSession);
                                if (A062) {
                                    q03.A0u = true;
                                }
                                if (182.A06(r3, userSession, 36321584940394027L)) {
                                    q03.A0t = true;
                                    q03.A02 = C51965G9l.A00(r3, userSession, 37166009870582171L);
                                    int A042 = DbS.A04(r3, userSession, 36603059918476137L);
                                    int i = 4;
                                    if (A042 == 3) {
                                        i = 3;
                                    } else if (A042 != 4) {
                                        i = 2;
                                    }
                                    q03.A08 = i;
                                } else {
                                    q03.A08 = 1;
                                }
                            }
                            if (182.A06(r3, userSession, 36321584940000808L)) {
                                q03.A0U = new SHR(C61270mF.A00(fragment.requireContext()), userSession);
                            }
                        }
                        if (z) {
                            if (182.A06(0Tu.A05, q03.A10, 36328839139311226L) && r6.A0C.BDp() != null) {
                                String BDp = r6.A0C.BDp();
                                if (BDp != null) {
                                    q03.A0L = C271714jT.A00(BDp);
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            }
                        }
                        Boolean bool2 = bool;
                        if (!((!AnonymousClass71K.A04(r7) && (!AnonymousClass7TF.A1Y(bool2, true) || !AnonymousClass71K.A05(r7))) || (A3K = r6.A3K(true)) == null || A3K.size() != 1 || (product = (Product) A3K.get(0)) == null || (str2 = product.A0F) == null)) {
                            q03.A0L = C271714jT.A00(str2);
                        }
                        if (bool != null) {
                            q03.A0l = bool2.booleanValue();
                        }
                        C51969G9p.A1L(q03);
                        return;
                    }
                    FragmentActivity requireActivity2 = fragment.requireActivity();
                    String sessionId = r18.getSessionId();
                    0qQ.A0B(sessionId, 6);
                    Fragment gzw = new C54127Gzw();
                    C331127Pr A0W = DbS.A0W(userSession);
                    A0W.A0g = requireActivity2.getString(2131963584);
                    boolean z6 = z5;
                    A0W.A0K = GHY.A00(new C56786ICj(gzw, r7, userSession, r12, r25, r10, sessionId, f3, f4, z4, z6), C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, userSession, (Integer) null);
                    A0W.A1J = true;
                    A0W.A0v = true;
                    DbU.A0y(requireActivity2, gzw, A0W);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
