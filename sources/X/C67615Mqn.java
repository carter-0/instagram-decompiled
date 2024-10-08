package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.List;

/* renamed from: X.Mqn  reason: case insensitive filesystem */
public final class C67615Mqn extends GAR implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "SerpContextualFeedController";
    public C67748Mu1 A00;
    public final JRI A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C18611Vv4 A04;
    public final C66986MgK A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C67615Mqn(Fragment fragment, UserSession userSession, JRI jri, SerpContextualFeedConfig serpContextualFeedConfig, C66986MgK mgK) {
        0qQ.A0B(serpContextualFeedConfig, 5);
        this.A02 = fragment;
        this.A03 = userSession;
        this.A01 = jri;
        this.A05 = mgK;
        this.A09 = serpContextualFeedConfig.A05;
        String str = serpContextualFeedConfig.A01;
        String str2 = serpContextualFeedConfig.A02;
        this.A07 = str2;
        this.A08 = serpContextualFeedConfig.A03;
        String str3 = serpContextualFeedConfig.A04;
        String str4 = serpContextualFeedConfig.A00;
        this.A06 = str4;
        this.A04 = new C18611Vv4(userSession, str, str2, str4, str3);
    }

    public final C54620HLd A05() {
        return null;
    }

    public final void A0A() {
    }

    public final void A0C() {
    }

    public final void A0H(AnonymousClass1qK r1) {
    }

    public final void A0I(AnonymousClass1qK r1) {
    }

    public final void A0L(C2362232x r1) {
    }

    public final void A0M(User user) {
    }

    public final void A0N(User user) {
    }

    public final void A0O(String str) {
    }

    public final void A0P(List list) {
    }

    public final boolean A0Y() {
        return true;
    }

    public final boolean A0Z() {
        return false;
    }

    public final boolean A0a() {
        return false;
    }

    public final boolean A0b() {
        return true;
    }

    public final boolean A0c() {
        return false;
    }

    public final boolean A0f() {
        return true;
    }

    public final boolean A0g() {
        return false;
    }

    public final boolean A0h(1Xj r2) {
        return true;
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(149);
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final 1sy A06() {
        return 1sy.A0S;
    }

    public final Integer A07() {
        return AnonymousClass05K.A01;
    }

    public final void A09() {
        C67748Mu1 mu1 = this.A00;
        if (mu1 == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        } else if (C67748Mu1.A00(mu1) != null) {
            AnonymousClass7TE.A1Z(new MG4(mu1, (AnonymousClass4D7) null, 13), C318116oQ.A00(mu1));
        }
    }

    public final void A0B() {
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A06;
        UserSession userSession = this.A03;
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        0qQ.A0B(userSession, 0);
        C16188UqD uqD = new C16188UqD(userSession);
        C18611Vv4 vv4 = this.A04;
        C67748Mu1 A002 = new 2YN(new NNT(userSession, uqD, vv4, (C71108Ocm) userSession.A01(C71108Ocm.class, new C13998To0(requireContext.getApplicationContext(), 19)), str, str2, str3), fragment).A00(C67748Mu1.class);
        this.A00 = A002;
        if (A002 != null) {
            A002.A00.A06(fragment, new C64318LZs(42, new C20705Wxc(this, 7)));
            C67748Mu1 mu1 = this.A00;
            if (mu1 != null) {
                mu1.A01.A06(fragment, new C64318LZs(42, new C20705Wxc(this, 8)));
                return;
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0D() {
        String str;
        String id;
        this.A04.A01();
        C67748Mu1 mu1 = this.A00;
        if (mu1 == null) {
            str = "viewModel";
        } else {
            ContextualFeedFragment contextualFeedFragment = this.A05.A00;
            if (contextualFeedFragment.mView != null) {
                C238133Ar scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
                C227762js r6 = contextualFeedFragment.A06;
                if (r6 == null) {
                    str = "_helper";
                } else {
                    int B6L = scrollingViewProxy.B6L();
                    if (scrollingViewProxy.AnH() > 0 && ((float) scrollingViewProxy.AnC(0).getBottom()) <= r6.A00 - r6.A01) {
                        B6L++;
                    }
                    if (B6L >= 0) {
                        HDB hdb = contextualFeedFragment.A0N;
                        str = "adapter";
                        if (hdb != null) {
                            if (B6L < hdb.getItemCount()) {
                                HDB hdb2 = contextualFeedFragment.A0N;
                                if (hdb2 != null) {
                                    Object item = hdb2.getItem(B6L);
                                    if (item instanceof 1Xj) {
                                        1Xj r2 = (1Xj) item;
                                        if (!r2.CcK() || r2.getId() == contextualFeedFragment.A0S) {
                                            id = r2.getId();
                                        } else {
                                            int BLQ = contextualFeedFragment.getScrollingViewProxy().BLQ();
                                            if (BLQ >= 0) {
                                                HDB hdb3 = contextualFeedFragment.A0N;
                                                if (hdb3 != null) {
                                                    if (BLQ < hdb3.getItemCount()) {
                                                        HDB hdb4 = contextualFeedFragment.A0N;
                                                        if (hdb4 != null) {
                                                            Object item2 = hdb4.getItem(BLQ);
                                                            if (item2 instanceof 1Xj) {
                                                                id = ((1Xj) item2).getId();
                                                            } else {
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        return;
                                                    }
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                        if (id != null) {
                                            mu1.A05.A04(mu1.A07, mu1.A08, id);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0F(2da r2) {
        r2.setTitle(this.A09);
    }

    public final void A0Q(boolean z, boolean z2) {
        C318136oS A002;
        AnonymousClass4D7 r2;
        int i;
        C67748Mu1 mu1 = this.A00;
        if (z) {
            if (mu1 != null) {
                A002 = C318116oQ.A00(mu1);
                r2 = null;
                i = 12;
            }
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        if (mu1 != null) {
            if (C67748Mu1.A00(mu1) != null) {
                A002 = C318116oQ.A00(mu1);
                r2 = null;
                i = 13;
            } else {
                return;
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
        AnonymousClass7TE.A1Z(new MG4(mu1, r2, i), A002);
    }

    public final boolean A0S() {
        C67748Mu1 mu1 = this.A00;
        if (mu1 != null) {
            return 0qQ.A0K(mu1.A00.A02(), Ng0.A00);
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0T() {
        return 182.A06(0Tu.A05, this.A03, 36319626434911786L);
    }

    public final boolean A0U() {
        C67748Mu1 mu1 = this.A00;
        if (mu1 != null) {
            return 0qQ.A0K(mu1.A00.A02(), C69175Nfy.A00);
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0W() {
        C67748Mu1 mu1 = this.A00;
        if (mu1 != null) {
            return 0qQ.A0K(mu1.A00.A02(), C69176Nfz.A00);
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0e() {
        UserSession userSession = this.A03;
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        if (!182.A06(A0H, userSession, 36317560555967830L) || !182.A06(A0H, userSession, 36317560556033367L)) {
            return false;
        }
        return true;
    }

    public final boolean isSponsoredEligible() {
        return 182.A06(0Tu.A05, this.A03, 36316997914530545L);
    }

    public final int A04(Context context) {
        return AnonymousClass3D4.A00(context);
    }

    public final List A08() {
        return AnonymousClass7TE.A1C();
    }
}
