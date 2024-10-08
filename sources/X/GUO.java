package X;

import com.instagram.android.R;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GUO implements JRI {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final void DeS() {
    }

    public final void Dex(String str, String str2, List list, boolean z, boolean z2) {
        String str3;
        C238143As r0;
        C60071Jf4 A02;
        0qQ.A0B(list, 1);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        UserDetailFragment userDetailFragment = contextualFeedFragment.A0I;
        if (userDetailFragment != null) {
            C321646uW r02 = userDetailFragment.A0j;
            C294265mA r6 = C294265mA.MAIN_GRID;
            C321646uW.A00(r02, r6).A03.A03.A09 = str;
            C321646uW r3 = userDetailFragment.A0j;
            0qQ.A0B(r6, 0);
            C321646uW.A00(r3, r6).A03.A03.A07 = str2;
            if (userDetailFragment.A1x) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A1C.add(new C17884Vhb(ProfileGridItemTypeEnum.MEDIA, C51966G9m.A0t(it), (Reel) null));
                }
                userDetailFragment.A0z.A0Q(r6, A1C);
            } else {
                userDetailFragment.A0z.A0P(r6, list);
            }
        }
        if (!contextualFeedFragment.A0V || !AnonymousClass7TE.A1b(list)) {
            if (!z2 && AnonymousClass7TE.A1b(list)) {
                C228362lW r5 = contextualFeedFragment.A0E;
                if (r5 == null) {
                    str3 = "feedMediaLoadingLogger";
                } else {
                    r5.A01((1Xj) null, AnonymousClass05K.A0C, AnonymousClass05K.A0j, contextualFeedFragment.getModuleName());
                    1Xj A0T = DbZ.A0T(list, 0);
                    String id = DbZ.A0T(list, 0).getId();
                    if (A0T.A5D()) {
                        1Xj A1c = A0T.A1c(0);
                        if (A1c != null) {
                            id = A1c.getId();
                        } else {
                            id = null;
                        }
                    }
                    GAQ gaq = contextualFeedFragment.A0G;
                    if (gaq == null) {
                        str3 = "feedMediaLoadingTracker";
                    } else {
                        gaq.A03 = id;
                    }
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            str3 = "adapter";
            if (z) {
                HDB hdb = contextualFeedFragment.A0N;
                if (hdb != null) {
                    hdb.A0B(list);
                    ContextualFeedFragment.A02(contextualFeedFragment);
                    AnonymousClass36D r03 = contextualFeedFragment.A0C;
                    if (r03 == null) {
                        str3 = "mediaUpdateListener";
                    } else {
                        r03.A00();
                    }
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            if (z2) {
                HDB hdb2 = contextualFeedFragment.A0N;
                if (hdb2 != null) {
                    hdb2.A05();
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            HDB hdb3 = contextualFeedFragment.A0N;
            if (hdb3 != null) {
                hdb3.A0B(list);
            }
            0qQ.A0F(str3);
            throw AnonymousClass00P.createAndThrow();
            if (contextualFeedFragment.mView != null && (r0 = (C238143As) contextualFeedFragment.getScrollingViewProxy()) != null) {
                r0.EaP(false);
            }
        } else if (contextualFeedFragment.isResumed() && !z2) {
            UserSession A002 = ContextualFeedFragment.A00(contextualFeedFragment);
            String moduleName = contextualFeedFragment.getModuleName();
            boolean A1S = DbW.A1S(1, A002, moduleName);
            0Tu r52 = 0Tu.A06;
            if (!182.A06(r52, A002, 36321451796080008L)) {
                return;
            }
            if (("shopping_consumer_bau_ad_click_and_interaction_reminder".equals(moduleName) || "shopping_consumer_bau_ad_click_reminder".equals(moduleName) || "shopping_consumer_bau_ad_like_reminder".equals(moduleName) || "shopping_consumer_bau_ad_save_reminder".equals(moduleName) || "shopping_consumer_bau_ad_caption_expand_reminder".equals(moduleName) || "shopping_consumer_bau_ad_click_percentage_off".equals(moduleName) || "shopping_consumer_bau_ad_click_free_shipping".equals(moduleName)) && 182.A06(r52, A002, 36321451796145545L) && !AnonymousClass7TE.A0q(ContextualFeedFragment.A00(contextualFeedFragment)).getBoolean("preference_has_seen_recon_notifications_scroll_toast", A1S) && (A02 = C59689JTv.A02(contextualFeedFragment.requireContext(), contextualFeedFragment.getString(2131972794), (String) null, A1S ? 1 : 0)) != null) {
                A02.setGravity(80, A1S, DbV.A05(contextualFeedFragment).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
                A02.show();
                String string = contextualFeedFragment.requireArguments().getString(AnonymousClass000.A00(1230), "");
                0qQ.A07(string);
                long parseLong = Long.parseLong(string);
                String string2 = contextualFeedFragment.requireArguments().getString(AnonymousClass000.A00(274), "");
                0qQ.A07(string2);
                long parseLong2 = Long.parseLong(string2);
                C55499Hih hih = contextualFeedFragment.A0D;
                if (hih != null) {
                    String moduleName2 = contextualFeedFragment.getModuleName();
                    0qQ.A0B(moduleName2, 2);
                    0Aj A0e = AnonymousClass7TE.A0e(hih.A00, "instagram_recon_scroll_more_toast_impression");
                    if (A0e.isSampled()) {
                        C51970G9q.A17(A0e, parseLong);
                        A0e.AAJ("module_name", moduleName2);
                        C51970G9q.A18(A0e, parseLong2);
                        A0e.Cgf();
                    }
                }
                DbX.A1V(AnonymousClass7TE.A0q(ContextualFeedFragment.A00(contextualFeedFragment)), "preference_has_seen_recon_notifications_scroll_toast", true);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void EDn(Object obj) {
    }

    public GUO(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final void A8o(List list) {
        String str;
        ContextualFeedFragment contextualFeedFragment = this.A00;
        GAR gar = contextualFeedFragment.A0B;
        if (gar == null) {
            str = "contextualFeedController";
        } else {
            boolean A0a = gar.A0a();
            str = "adapter";
            HDB hdb = contextualFeedFragment.A0N;
            if (A0a) {
                if (hdb != null) {
                    boolean z = hdb instanceof GAP;
                    AnonymousClass2rW r1 = (AnonymousClass2rW) hdb.A00;
                    if (z) {
                        r1.A0A(list);
                        return;
                    } else {
                        r1.A0A(1Xg.A0A.A06(list));
                        return;
                    }
                }
            } else if (hdb != null) {
                hdb.A0B(list);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AVB(User user) {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.A09(user);
        }
    }

    public final List AZL() {
        HDB hdb = this.A00.A0N;
        if (hdb != null) {
            return hdb.A04();
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass3W1 BQt(String str) {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else if (hdb instanceof C52766GcJ) {
            return (AnonymousClass3W1) ((C52766GcJ) hdb).A0B.get(str);
        } else {
            return null;
        }
    }

    public final void Cs9(1Xj r2) {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.Cs9(r2);
        }
    }

    public final void DEt(String str) {
        this.A00.A04("favorites_feed_nav_bar");
    }

    public final void DeI() {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        C228362lW r5 = contextualFeedFragment.A0E;
        String str = "feedMediaLoadingLogger";
        if (r5 != null) {
            String moduleName = contextualFeedFragment.getModuleName();
            Integer num = AnonymousClass05K.A0C;
            r5.A01((1Xj) null, num, AnonymousClass05K.A0u, moduleName);
            C228362lW r1 = contextualFeedFragment.A0E;
            if (r1 != null) {
                r1.A03((1Xj) null, num, contextualFeedFragment.getModuleName());
                HDB hdb = contextualFeedFragment.A0N;
                if (hdb == null) {
                    str = "adapter";
                } else {
                    hdb.Cs9((1Xj) null);
                    C51974G9v.A1D(contextualFeedFragment);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dei() {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.Cs9((1Xj) null);
        }
    }

    public final void FIY(String str) {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.A0A(str);
        }
    }

    public final void FK4() {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.FK4();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3W1 BQs(Object obj) {
        1Xj A0m = C51968G9o.A0m(obj);
        HDB hdb = this.A00.A0N;
        if (hdb != null) {
            return hdb.BQr(A0m);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }
}
