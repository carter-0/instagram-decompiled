package instagram.features.stories.dashboard.fragment;

import X.002;
import X.0Aj;
import X.0Tu;
import X.0fE;
import X.0hq;
import X.0nA;
import X.0nH;
import X.0qQ;
import X.0s1;
import X.0wb;
import X.0wc;
import X.17k;
import X.1Au;
import X.1Ef;
import X.1Ln;
import X.1NP;
import X.1NY;
import X.1Ng;
import X.1OC;
import X.1OP;
import X.1Xj;
import X.1Xv;
import X.1YN;
import X.1aC;
import X.1as;
import X.1vm;
import X.1vn;
import X.1wn;
import X.28D;
import X.2IS;
import X.2bV;
import X.2cs;
import X.2db;
import X.AnonymousClass000;
import X.AnonymousClass06S;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass2bO;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass36D;
import X.AnonymousClass36R;
import X.AnonymousClass36V;
import X.AnonymousClass376;
import X.AnonymousClass37Q;
import X.AnonymousClass3BQ;
import X.AnonymousClass3BU;
import X.AnonymousClass3PN;
import X.AnonymousClass3PO;
import X.AnonymousClass3PP;
import X.AnonymousClass3TG;
import X.AnonymousClass3WT;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DU;
import X.AnonymousClass4HC;
import X.AnonymousClass6ST;
import X.AnonymousClass6W8;
import X.AnonymousClass7Q8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass8YF;
import X.AnonymousClass9J5;
import X.BBV;
import X.C13989Tnp;
import X.C13991Tnr;
import X.C14176TrF;
import X.C14177TrG;
import X.C14610TzH;
import X.C14611TzI;
import X.C14625TzX;
import X.C14629Tzb;
import X.C14631Tzd;
import X.C14637Tzj;
import X.C14639Tzl;
import X.C14651Tzx;
import X.C14707U2r;
import X.C15392Ubv;
import X.C15393Ubw;
import X.C15620Ufm;
import X.C15622Ufo;
import X.C16468UvO;
import X.C17700VcV;
import X.C17801VgE;
import X.C17834Vgn;
import X.C18138VmE;
import X.C18280Vp0;
import X.C19029WHg;
import X.C19201WPh;
import X.C19446WZu;
import X.C19447WZv;
import X.C19452Wa0;
import X.C19475WaN;
import X.C19487WaZ;
import X.C19489Wab;
import X.C19686Wdo;
import X.C19861Wgn;
import X.C19863Wgp;
import X.C20107Wl5;
import X.C20961X6o;
import X.C231002qi;
import X.C2355930l;
import X.C2370836g;
import X.C250973mM;
import X.C252203oj;
import X.C252553pI;
import X.C255773uh;
import X.C255783ui;
import X.C270184gK;
import X.C273374mT;
import X.C273654mx;
import X.C278474ww;
import X.C289745e8;
import X.C290815g0;
import X.C309516Yo;
import X.C309616Yy;
import X.C311526cp;
import X.C311596cw;
import X.C316216lI;
import X.C320156rr;
import X.C331127Pr;
import X.C331137Ps;
import X.C331157Pu;
import X.C334247ax;
import X.C334257ay;
import X.C41845B3m;
import X.C41945B7x;
import X.C41946B7y;
import X.C49574Eyj;
import X.C51031FnN;
import X.C51924G7s;
import X.C57302IWl;
import X.C59689JTv;
import X.C59730JVo;
import X.C61290mR;
import X.C61500KAf;
import X.C61675KGz;
import X.C64022LJj;
import X.C71392co;
import X.DFR;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.Dbb;
import X.F35;
import X.G7V;
import X.G9t;
import X.JTS;
import X.JTT;
import X.K74;
import X.KIC;
import X.NJ6;
import X.O14;
import X.OLT;
import X.Oy7;
import X.VW6;
import X.WB0;
import X.WBE;
import X.WC3;
import X.WWR;
import X.WZX;
import X.WZZ;
import X.X5P;
import X.X5Q;
import X.X9R;
import X.XA1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Adapter;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.api.FetchXPSFBStoryCardViewersQueryResponseImpl;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.triangleshape.TriangleShape;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.CameraVideoCapturer;

public class ReelDashboardFragment extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, X9R, C252203oj, C51924G7s, 1wn, AnonymousClass3PN, C20961X6o {
    public int A00;
    public int A01 = -1;
    public GestureDetector A02;
    public 2cs A03;
    public C2355930l A04;
    public 0wc A05;
    public UserSession A06;
    public Reel A07;
    public C250973mM A08;
    public C231002qi A09;
    public C51031FnN A0A;
    public C19447WZv A0B;
    public String A0C;
    public boolean A0D = true;
    public boolean A0E = false;
    public boolean A0F;
    public int A0G;
    public int A0H;
    public long A0I = 0;
    public View A0J;
    public AnonymousClass36V A0K;
    public AnonymousClass36D A0L;
    public ReelViewerConfig A0M;
    public AnonymousClass3BQ A0N;
    public C14177TrG A0O;
    public AnonymousClass7Q8 A0P;
    public C311526cp A0Q;
    public String A0R;
    public Set A0S;
    public boolean A0T = true;
    public boolean A0U;
    public boolean A0V = true;
    public final Runnable A0W = new C20107Wl5(this);
    public final Map A0X = new HashMap();
    public final Set A0Y = new HashSet();
    public final Map A0Z = new HashMap();
    public final Set A0a = new HashSet();
    public TouchInterceptorFrameLayout mContainer;
    public EmptyStateView mEmptyView;
    public ReboundViewPager mImageViewPager;
    public C14625TzX mListAdapter;
    public ReboundViewPager mListViewPager;
    public C14611TzI mPagerAdapter;
    public ReboundViewPager mScrollOwner;

    public static void A08(X5P x5p, ReelDashboardFragment reelDashboardFragment, String str, String str2, boolean z) {
        Integer num;
        ReelDashboardFragment reelDashboardFragment2 = reelDashboardFragment;
        if (reelDashboardFragment.isVisible()) {
            X5P x5p2 = x5p;
            String str3 = str;
            if (DbY.A1Y(0Tu.A05, reelDashboardFragment.A06, 36316804640936591L)) {
                C14625TzX tzX = reelDashboardFragment.mListAdapter;
                if (tzX != null) {
                    tzX.A0A(str, true);
                }
                1vn A012 = 1vm.A01(reelDashboardFragment.A06);
                if (z) {
                    num = 1NP.A01;
                } else if (str2 == null) {
                    num = 1NP.A03;
                } else {
                    num = 1NP.A04;
                }
                int intValue = num.intValue();
                2IS r7 = new 2IS();
                2IS r8 = new 2IS();
                1Xv r4 = 1Xj.A0h;
                String A062 = 1Xv.A06(str);
                0qQ.A0B(A062, 0);
                r7.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A062);
                Boolean A0v = AnonymousClass7TE.A0v();
                r7.A02(AnonymousClass000.A00(1454), A0v);
                r7.A02(AnonymousClass000.A00(3343), A0v);
                r7.A02(AnonymousClass000.A00(3344), A0v);
                Integer num2 = 1NP.A02;
                r7.A03("profile_pic_height", num2);
                r7.A03("profile_pic_width", num2);
                r7.A04("after", str2);
                r7.A03("first", Integer.valueOf(intValue));
                1Ef A0G2 = JTS.A0G(new PandoGraphQLRequest(C41845B3m.A05(), "FetchXPSFBStoryCardViewersQuery", r7.getParamsCopy(), r8.getParamsCopy(), FetchXPSFBStoryCardViewersQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_fetch_story", new ArrayList()));
                A012.ATL(new C19029WHg(reelDashboardFragment2, str3), new DFR(x5p2, reelDashboardFragment2, str3), A0G2);
                return;
            }
            C15620Ufm ufm = new C15620Ufm(reelDashboardFragment, x5p, str, 6);
            1NY A0O2 = DbU.A0O(reelDashboardFragment.A06);
            DbU.A1P(A0O2, "media/%s/list_reel_media_fb_viewer/", new Object[]{str.split("_")[0]});
            if (str2 != null) {
                A0O2.A9m("cursor", str2);
            }
            if (z) {
                A0O2.A0C(AnonymousClass000.A00(344), IgNetworkConsentStorage.MAX_ENTRIES);
            }
            1OC A0S2 = DbT.A0S(A0O2, C41945B7x.class, C41946B7y.class);
            A0S2.A00 = ufm;
            reelDashboardFragment.schedule(A0S2);
        }
    }

    public static void A09(X5Q x5q, ReelDashboardFragment reelDashboardFragment, String str, String str2, boolean z, boolean z2, boolean z3) {
        ReelDashboardFragment reelDashboardFragment2 = reelDashboardFragment;
        if (reelDashboardFragment.isVisible()) {
            C14651Tzx tzx = new C14651Tzx(x5q, reelDashboardFragment2, str, 1, z, z3);
            UserSession userSession = reelDashboardFragment2.A06;
            String str3 = reelDashboardFragment2.A0C;
            AnonymousClass3BQ r0 = reelDashboardFragment2.A0N;
            if (r0 == null) {
                r0 = AnonymousClass3BQ.UNKNOWN;
            }
            String str4 = r0.A00;
            1NY A0O2 = DbU.A0O(userSession);
            DbU.A1P(A0O2, "media/%s/list_reel_media_viewer/", new Object[]{str.split("_")[0]});
            A0O2.A0H("story_has_interactive_stickers", z2);
            if (str2 != null) {
                A0O2.A9m("max_id", str2);
            }
            if (z3) {
                A0O2.A9m("disable_pagination", "true");
            }
            A0O2.A9m(AnonymousClass000.A00(1747), str4);
            A0O2.A9m("reel_id", str3);
            Pair A002 = C278474ww.A00(userSession);
            A0O2.A0G((String) A002.first, (String) A002.second);
            1OC A0S2 = DbT.A0S(A0O2, C41945B7x.class, C41946B7y.class);
            A0S2.A00 = tzx;
            reelDashboardFragment2.schedule(A0S2);
        }
    }

    public final void A0I(1Xj r13) {
        if (getActivity() != null) {
            C18138VmE.A00().A07(this, (G7V) null, (PromoteLaunchOrigin) null, this, this.A06, r13, 002.A0R("reel_", "dashboard"), (String) null, true);
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, androidx.fragment.app.Fragment, instagram.features.stories.dashboard.fragment.ReelDashboardFragment] */
    public final void A0J(C255773uh r12) {
        Reel reel = this.A07;
        reel.getClass();
        C255773uh r9 = r12;
        if (reel.A0i()) {
            Context requireContext = requireContext();
            1Xj r5 = r12.A0b;
            r5.getClass();
            C64022LJj.A00(requireContext, (DialogInterface.OnDismissListener) null, AnonymousClass07i.A00(this), this.A06, r5, reel, AnonymousClass3BQ.DASHBOARD);
            return;
        }
        C19201WPh.A0Y.A04(requireActivity(), (DialogInterface.OnDismissListener) null, this, getParentFragmentManager(), this, this, this.A06, reel, r9, new C19452Wa0(this));
    }

    public final void A0L(String str, boolean z) {
        C255773uh A0F2;
        String str2;
        String str3;
        String str4 = str;
        C14629Tzb A012 = C14625TzX.A01(this.mListAdapter, str);
        if (A012 != null && A012.A0k.A00 != null) {
            C14629Tzb A013 = C14625TzX.A01(this.mListAdapter, str);
            if ((A013 != null && A013.A0j.A0A) || (A0F2 = A0F()) == null) {
                return;
            }
            if (!A0F2.A0n.isEmpty()) {
                C19861Wgn wgn = new C19861Wgn(this, str);
                C14629Tzb A014 = C14625TzX.A01(this.mListAdapter, str);
                if (A014 != null) {
                    str3 = A014.A0k.A00;
                } else {
                    str3 = null;
                }
                A08(wgn, this, str, str3, true);
                return;
            }
            C19863Wgp wgp = new C19863Wgp(this, str);
            C14629Tzb A015 = C14625TzX.A01(this.mListAdapter, str);
            if (A015 != null) {
                str2 = A015.A0k.A00;
            } else {
                str2 = null;
            }
            A09(wgp, this, str4, str2, false, z, true);
        }
    }

    public final /* synthetic */ void Db9(C17801VgE vgE, int i) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public static ArrayList A01(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AnonymousClass9J5((BBV) null, (XA1) null, (User) it.next(), true, (String) null, (List) null, false));
            }
        }
        return arrayList;
    }

    private void A02() {
        0hq r2 = this.mFragmentManager;
        FragmentActivity activity = getActivity();
        if (r2 != null && AnonymousClass06S.A01(r2) && activity != null && !r2.A19(C273654mx.A00(36), 1)) {
            DbT.A1K(this);
        }
    }

    private void A03() {
        C250973mM r1;
        View view;
        Reel reel = this.A07;
        if (reel != null) {
            17k.A0F(C14610TzH.A02(this.A06, reel));
            1Ng A002 = AnonymousClass1Nd.A00(this.A06);
            A002.A01(this, AnonymousClass376.class);
            A002.A01(this.A0P, C2370836g.class);
            if ((!C14610TzH.A01(this.A06, this.A07)) || (view = this.A0J) == null) {
                this.A0J.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
            C250973mM r4 = new C250973mM(this.A06, this.A07, this.A0S);
            this.A08 = r4;
            if (this.A01 == -1) {
                this.A01 = r4.A04(this.A06, this.A0R);
            }
            C14611TzI tzI = this.mPagerAdapter;
            tzI.A00 = this.A08;
            0fE.A00(tzI, -1574714095);
            C14625TzX tzX = this.mListAdapter;
            tzX.A01 = this.A08;
            0fE.A00(tzX, -1416777687);
            this.mListAdapter.A00 = this.A01;
            this.mEmptyView.setVisibility(8);
            this.mImageViewPager.A0K(this.A01);
            this.mListViewPager.A0K(this.A01);
            if (this.A0V) {
                this.A0V = false;
                int i = this.A01;
                if (i >= 0 && (r1 = this.A08) != null && i < r1.A02(this.A06)) {
                    this.A08.A0A(this.A06, this.A01);
                    A0C(this, this.A01);
                }
            }
        }
    }

    public static void A04(RectF rectF, ReelDashboardFragment reelDashboardFragment, float f) {
        float A092;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = reelDashboardFragment.mContainer;
        if (touchInterceptorFrameLayout != null) {
            Context context = touchInterceptorFrameLayout.getContext();
            C250973mM r0 = reelDashboardFragment.A08;
            if (r0 == null || !C316216lI.A0D(context, r0)) {
                A092 = (float) (0nA.A09(context) / reelDashboardFragment.A0H);
            } else {
                A092 = ((float) 0nA.A08(context)) / (((float) reelDashboardFragment.A0H) / 0.5625f);
            }
            double d = (double) f;
            float A032 = (float) AnonymousClass37Q.A03(d, 1.0d, (double) A092);
            reelDashboardFragment.mContainer.setScaleX(A032);
            reelDashboardFragment.mContainer.setScaleY(A032);
            float width = ((float) (reelDashboardFragment.mContainer.getWidth() / 2)) - rectF.centerX();
            float height = ((float) (reelDashboardFragment.mContainer.getHeight() / 2)) - rectF.centerY();
            reelDashboardFragment.mContainer.setTranslationX((float) AnonymousClass37Q.A01(d, (double) (width * A092)));
            reelDashboardFragment.mContainer.setTranslationY((float) AnonymousClass37Q.A01(d, (double) (height * A092)));
        }
    }

    public static void A05(View view, ReelDashboardFragment reelDashboardFragment) {
        if (!reelDashboardFragment.A0U) {
            reelDashboardFragment.A0U = true;
            RectF A0F2 = 0nA.A0F(view);
            Bundle bundle = new Bundle();
            bundle.putSerializable(AnonymousClass000.A00(117), 28D.A3c);
            bundle.putParcelable("ReelDashboardAddToStoryCameraFragment.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS", A0F2);
            AnonymousClass6W8.A02(reelDashboardFragment.requireActivity(), bundle, reelDashboardFragment.A06, TransparentModalActivity.class, C273654mx.A00(3215)).A0C(reelDashboardFragment.requireContext());
        }
    }

    public static void A07(C17700VcV vcV, ReelDashboardFragment reelDashboardFragment) {
        String str;
        C14625TzX tzX = reelDashboardFragment.mListAdapter;
        if (tzX != null && (str = vcV.A09) != null) {
            C14629Tzb tzb = (C14629Tzb) tzX.A0C.get(1Au.A00(tzX.A07).A01.getString(002.A0R("reel_viewers_list_megaphone_item_id", str), (String) null));
            if (tzb != null) {
                C14176TrF trF = tzb.A0j;
                DbX.A1T(AnonymousClass7TE.A0p(1Au.A00(trF.A0J)), "dismissed_reel_viewers_list_megaphone", str, true);
                trF.A07();
            }
        }
    }

    public static void A0A(ReelDashboardFragment reelDashboardFragment) {
        reelDashboardFragment.mEmptyView.setVisibility(0);
        reelDashboardFragment.mEmptyView.A0L();
        AnonymousClass3PO.A00(reelDashboardFragment.A06).A05(reelDashboardFragment, reelDashboardFragment.A0C, (String) null, false);
        AnonymousClass3PO.A00(reelDashboardFragment.A06).A02(AnonymousClass3BU.ON_TAP, reelDashboardFragment.A0C, 002.A0R("reel_", "dashboard"), (Map) null);
    }

    public static void A0B(ReelDashboardFragment reelDashboardFragment) {
        Activity requireActivity;
        0hq r0 = reelDashboardFragment.mFragmentManager;
        FragmentActivity activity = reelDashboardFragment.getActivity();
        if (r0 != null && AnonymousClass06S.A01(r0) && activity != null) {
            0wb.A03(C14625TzX.__redex_internal_original_name, "Resetting view holder id counter");
            C14625TzX.A0H = 0;
            if (reelDashboardFragment.getRootActivity() != null) {
                requireActivity = reelDashboardFragment.getRootActivity();
            } else {
                requireActivity = reelDashboardFragment.requireActivity();
            }
            0nA.A0J(requireActivity);
            DbT.A1J(reelDashboardFragment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r4 = r6.A08.A0A(r6.A06, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(instagram.features.stories.dashboard.fragment.ReelDashboardFragment r6, int r7) {
        /*
            X.3mM r1 = r6.A08
            if (r1 == 0) goto L_0x0092
            if (r7 < 0) goto L_0x0092
            com.instagram.common.session.UserSession r0 = r6.A06
            int r0 = r1.A02(r0)
            if (r7 >= r0) goto L_0x0092
            X.3mM r1 = r6.A08
            com.instagram.common.session.UserSession r0 = r6.A06
            X.3uh r4 = r1.A0A(r0, r7)
            X.1Xj r5 = r4.A0b
            if (r5 == 0) goto L_0x0092
            X.0wc r1 = r6.A05
            java.lang.String r0 = "reel_viewer_dashboard_feedback"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            int r0 = r5.A10()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "total_view_count"
            r3.A9F(r0, r1)
            java.lang.String r0 = r5.A30()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0093
            java.lang.String r1 = r5.A30()
        L_0x003c:
            java.lang.String r0 = "media_id"
            r3.AAJ(r0, r1)
            r0 = 5219(0x1463, float:7.313E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.AAJ(r0, r2)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "has_light_feedback"
            r3.A9F(r0, r1)
            java.lang.String r0 = "total_feedback_count"
            r3.A9F(r0, r1)
            X.1Xy r0 = r5.A0C
            java.lang.Integer r0 = r0.CEz()
            int r0 = X.AnonymousClass7TG.A0A(r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ig_view_count"
            r3.A9F(r0, r1)
            X.1Xy r0 = r5.A0C
            java.lang.Integer r0 = r0.B4f()
            int r0 = X.AnonymousClass7TG.A0A(r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "fb_view_count"
            r3.A9F(r0, r1)
            int r0 = r4.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "fb_anon_view_count"
            r3.A9F(r0, r1)
            X.C51965G9l.A1K(r3, r2)
            r3.Cgf()
        L_0x0092:
            return
        L_0x0093:
            r1 = r2
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A0C(instagram.features.stories.dashboard.fragment.ReelDashboardFragment, int):void");
    }

    public final C255773uh A0F() {
        C250973mM r1;
        int i;
        ReboundViewPager reboundViewPager = this.mListViewPager;
        if (reboundViewPager == null || (r1 = this.A08) == null || (i = reboundViewPager.A08) >= r1.A02(this.A06)) {
            return null;
        }
        return this.A08.A0A(this.A06, i);
    }

    public final void A0H(View view, C255773uh r17, Integer num) {
        C19475WaN waN;
        AnonymousClass8YF r1;
        Fragment fragment;
        C309516Yo r4;
        String str;
        Bundle bundle;
        String str2;
        String str3;
        View view2 = view;
        if (view != null) {
            C255773uh r6 = r17;
            switch (num.intValue()) {
                case 0:
                    r4 = C13991Tnr.A0M(this);
                    String str4 = r6.A0k;
                    str = r6.A0j;
                    AnonymousClass7TG.A1N(str4, str);
                    fragment = new C16468UvO();
                    bundle = new Bundle();
                    bundle.putString("ReelUserListFragment.REEL_ID", str4);
                    str2 = "ReelUserListFragment.REEL_ITEM_ID";
                    break;
                case 1:
                    RectF rectF = 0nA.A01;
                    RectF rectF2 = new RectF();
                    0nA.A0L(rectF2, view2);
                    AnonymousClass6ST r7 = new AnonymousClass6ST(requireContext());
                    r7.A00(getString(2131965491));
                    Context requireContext = requireContext();
                    UserSession userSession = this.A06;
                    1Xj r12 = r6.A0b;
                    r12.getClass();
                    C290815g0 A002 = C59730JVo.A00(requireContext, userSession, r12, "ReelDashboardFragment");
                    A002.A00 = new C61675KGz(1, rectF2, r6, r7, this);
                    schedule(A002);
                    return;
                case 2:
                    r4 = C13991Tnr.A0M(this);
                    String str5 = r6.A0k;
                    str = r6.A0j;
                    AnonymousClass7TG.A1N(str5, str);
                    fragment = new C273374mT();
                    bundle = new Bundle();
                    bundle.putString("ReelQuestionResponsesListFragment.REEL_ID", str5);
                    str2 = "ReelQuestionResponsesListFragment.REEL_ITEM_ID";
                    break;
                case 3:
                    r4 = C13991Tnr.A0M(this);
                    fragment = C18280Vp0.A00(r6.A0k, r6.A0j, -1);
                    break;
                case 4:
                    r4 = C13991Tnr.A0M(this);
                    String str6 = r6.A0k;
                    str = r6.A0j;
                    AnonymousClass7TG.A1N(str6, str);
                    fragment = new C15393Ubw();
                    bundle = new Bundle();
                    bundle.putString("ReelSliderVotersListFragment.REEL_ID", str6);
                    str2 = "ReelSliderVotersListFragment.REEL_ITEM_ID";
                    break;
                case 5:
                    r4 = C13991Tnr.A0M(this);
                    String str7 = r6.A0k;
                    str = r6.A0j;
                    AnonymousClass7TG.A1N(str7, str);
                    fragment = new C15392Ubv();
                    bundle = new Bundle();
                    bundle.putString("ReelFundraiserDonorsListFragment.REEL_ID", str7);
                    str2 = "ReelFundraiserDonorsListFragment.REEL_ITEM_ID";
                    break;
                case 6:
                    C255783ui A003 = C289745e8.A00(AnonymousClass3WT.FUNDRAISER, r6.A0b());
                    if (A003 == null || (r1 = A003.A0y) == null) {
                        waN = null;
                    } else {
                        waN = new C19475WaN(r1);
                    }
                    waN.getClass();
                    UserSession userSession2 = this.A06;
                    28D r72 = 28D.A2r;
                    Context requireContext2 = requireContext();
                    AnonymousClass8YF r5 = waN.A00;
                    User user = r5.A02;
                    String str8 = r5.A0A;
                    int[] iArr = C19475WaN.A02;
                    int A0C2 = 0nH.A0C(str8, iArr[0]);
                    int A0C3 = 0nH.A0C(r5.A05, iArr[1]);
                    int A0C4 = 0nH.A0C(r5.A0D, -16777216);
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable(AnonymousClass000.A00(118), r72);
                    bundle2.putInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_GRADIENT_START_BACKGROUND_COLOR", A0C2);
                    bundle2.putInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_GRADIENT_END_BACKGROUND_COLOR", A0C3);
                    bundle2.putInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_MESSAGE_COLOR", A0C4);
                    try {
                        user.getClass();
                        Parcelable.Creator creator = User.CREATOR;
                        bundle2.putString("ReelFundraiserShareConstants.ARGUMENTS_KEY_FUNDRAISER_RECIPIENT", 1aC.A07(user));
                        AnonymousClass6W8.A02((Activity) requireContext2, bundle2, userSession2, TransparentModalActivity.class, C273654mx.A00(3218)).A0C(requireContext2);
                        return;
                    } catch (IOException unused) {
                        0wb.A03(AnonymousClass000.A00(1011), "Could not json serialize model User for the fundraiser public thanks sticker.");
                        return;
                    }
                case 7:
                    A06(r6, this, (String) null);
                    return;
                case 8:
                    1Xj r3 = r6.A0b;
                    if (!(r3 == null || r3.A30() == null)) {
                        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "reel_viewer_dashboard_fb_viewers_info_icon_tapped");
                        A0e.AAJ("module", 002.A0R("reel_", "dashboard"));
                        G9t.A1J(A0e, r3.A30());
                        A0e.Cgf();
                    }
                    C331127Pr r32 = new C331127Pr(this.A06);
                    DbZ.A0z(requireContext(), r32, 2131971489);
                    C331137Ps r2 = new C331137Ps();
                    r2.A06 = requireContext().getString(2131971524);
                    r2.A05 = new WBE(47, (Object) this, (Object) r6);
                    r32.A07(r2.A00());
                    r32.A0U = new C19686Wdo((Object) this, 6);
                    C331157Pu A004 = r32.A00();
                    Fragment r13 = new AnonymousClass4DH();
                    r13.A00 = new C49574Eyj(A004, r6, this);
                    A004.A03(requireContext(), r13);
                    return;
                case 9:
                    String A0P2 = r6.A0P();
                    A0P2.getClass();
                    C14629Tzb tzb = (C14629Tzb) this.mListAdapter.A0C.get(r6.A0j);
                    if (tzb != null) {
                        str3 = tzb.A0j.A08;
                    } else {
                        str3 = null;
                    }
                    if (r6.A04 != null) {
                        1as r14 = 1as.A04;
                        UserSession userSession3 = this.A06;
                        FragmentActivity requireActivity = requireActivity();
                        OLT olt = r6.A04;
                        AnonymousClass7TF.A1C(userSession3, 0, olt);
                        NJ6 A032 = r14.A02.A03(olt, A0P2, str3, new LinkedHashSet(), true);
                        C309516Yo r0 = new C309516Yo(requireActivity, userSession3);
                        0qQ.A0A(A032);
                        Dba.A12(A032, r0);
                    }
                    if (str3 != null) {
                        Oy7 A005 = O14.A00(this.A06);
                        1Ln A0F2 = 1Ln.A0F(A005.A00);
                        if (DbT.A1Y(A0F2)) {
                            Dbb.A1G(A0F2, A005.A01);
                            A0F2.A0l("jcs_view_all_recipients");
                            A0F2.A0k("tap");
                            A0F2.A0p("jcs_viewer_sheet");
                            A0F2.A0q("story");
                            A0F2.A0o("instagram");
                            A0F2.A0s(A0P2);
                            A0F2.A0v(str3);
                            A0F2.Cgf();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    String str9 = r6.A0j;
                    if (str9 != null) {
                        r4 = C13991Tnr.A0M(this);
                        String str10 = this.A0C;
                        Bundle A0A2 = DbY.A0A(str10);
                        A0A2.putString(AnonymousClass000.A00(2625), str10);
                        A0A2.putString(AnonymousClass000.A00(1099), str9);
                        fragment = new K74();
                        fragment.setArguments(A0A2);
                        break;
                    } else {
                        return;
                    }
            }
            bundle.putString(str2, str);
            fragment.setArguments(bundle);
            r4.A0E(fragment);
            r4.A04();
        }
    }

    public final void A0K(C255773uh r4, int i) {
        C14629Tzb A012;
        C14625TzX tzX = this.mListAdapter;
        String str = r4.A0j;
        if (str != null && (A012 = C14625TzX.A01(tzX, str)) != null) {
            boolean z = tzX.A0F;
            ViewGroup CEd = A012.A0h.CEd();
            if (z) {
                C252553pI r0 = ((RecyclerView) CEd).A0D;
                r0.getClass();
                ((LinearLayoutManager) r0).A1p(i, 0);
                return;
            }
            ((AbsListView) CEd).setSelectionFromTop(i, 0);
        }
    }

    public final void A0M(boolean z) {
        View view;
        C250973mM r1;
        Reel reel;
        if (this.A0D && (reel = this.A07) != null) {
            reel.A1q = true;
        }
        if (!z || !this.A0Q.A01()) {
            Reel reel2 = this.A07;
            if (reel2 == null || !reel2.A15(this.A06)) {
                C250973mM r12 = this.A08;
                if (r12 != null && C13989Tnp.A0v(this.A06, r12).isEmpty()) {
                    A0B(this);
                }
                if (!A0E(this) && (view = this.mView) != null) {
                    Runnable runnable = this.A0W;
                    view.removeCallbacks(runnable);
                    view.postDelayed(runnable, 0);
                }
            } else {
                A02();
            }
        } else {
            Reel reel3 = this.A07;
            if ((reel3 == null || !reel3.A15(this.A06)) && ((r1 = this.A08) == null || !C13989Tnp.A0v(this.A06, r1).isEmpty())) {
                this.A0Q.A00((DialogInterface.OnDismissListener) null, false);
                Runnable runnable2 = this.A0W;
                view.removeCallbacks(runnable2);
                view.postDelayed(runnable2, 0);
            } else {
                this.A0Q.A00((DialogInterface.OnDismissListener) null, true);
            }
        }
        this.A0D = true;
    }

    public final void Cs2(C14631Tzd tzd) {
        0fE.A00(this.mListAdapter, 602516246);
    }

    public final void Cs5() {
        C14625TzX tzX = this.mListAdapter;
        if (tzX != null) {
            0fE.A00(tzX, -689028948);
        }
    }

    public final void Cun(VW6 vw6) {
        this.A0B.Cun(vw6);
    }

    public final void CyQ(C14631Tzd tzd) {
        this.A0B.CyQ(tzd);
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        this.A0B.D2y(reel, gradientSpinnerAvatarView);
    }

    public final void D8u(C14631Tzd tzd, C255773uh r3, User user, boolean z) {
        this.A0B.D8u(tzd, r3, user, z);
    }

    public final void DOJ(String str) {
        this.mEmptyView.A0J();
        C59689JTv.A0E(getContext(), "onLoadFailure_network_error");
    }

    public final void DOW(String str, boolean z) {
        Reel A0M2 = ReelStore.A03(this.A06).A0M(this.A0C);
        this.A07 = A0M2;
        this.A0A.A00 = A0M2;
        if (A0M2 == null || !A0M2.A15(this.A06)) {
            A03();
        } else {
            A02();
        }
    }

    public final void DRv(C14631Tzd tzd, C255773uh r3, User user) {
        this.A0B.DRv(tzd, r3, user);
    }

    public final void DVp(C14631Tzd tzd) {
        this.A0B.DVp(tzd);
    }

    public final void DbB(C17801VgE vgE, int i) {
        this.A0O.A00(i);
    }

    public final void DmE(2cs r6) {
        ReboundViewPager reboundViewPager = this.mImageViewPager;
        if (reboundViewPager != this.mScrollOwner) {
            reboundViewPager.A0R(true, (float) r6.A09.A00);
        }
    }

    public final void Drv(VW6 vw6) {
        this.A0B.Drv(vw6);
    }

    public final void Drw(User user) {
        this.A0B.Drw(user);
    }

    public final void DzU(C14631Tzd tzd) {
        this.A0B.DzU(tzd);
    }

    public final void FId(C14631Tzd tzd) {
        C14629Tzb tzb;
        C14625TzX tzX = this.mListAdapter;
        C255773uh r0 = tzd.A0K;
        if (r0 != null && (tzb = (C14629Tzb) tzX.A0C.get(r0.A0j)) != null) {
            C14176TrF trF = tzb.A0j;
            Object obj = trF.A0V.get(tzd.A0L);
            List list = trF.A0Z;
            int indexOf = list.indexOf(obj);
            if (indexOf >= 0 && indexOf < list.size()) {
                list.remove(indexOf);
                List list2 = trF.A0Y;
                list2.add(obj);
                C255773uh r02 = trF.A03;
                r02.getClass();
                List list3 = r02.A0p;
                list3.clear();
                list3.addAll(list2);
                List list4 = trF.A03.A0o;
                list4.clear();
                list4.addAll(list);
                trF.A07();
            }
        }
    }

    public final String getModuleName() {
        return 002.A0R("reel_", "dashboard");
    }

    public final AnonymousClass0wW getSession() {
        return this.A06;
    }

    public final boolean onBackPressed() {
        String str;
        if (this.A0F || this.A07 == null) {
            return false;
        }
        if (!1OP.A07(requireActivity(), this.A06).A0a()) {
            this.A0F = false;
            RectF A002 = A00(this);
            C250973mM r1 = this.A08;
            if (r1 == null || r1.A0E(this.A06)) {
                str = null;
            } else {
                C250973mM r3 = this.A08;
                UserSession userSession = this.A06;
                str = r3.A0A(userSession, Math.min(this.mImageViewPager.A08, r3.A02(userSession) - 1)).A0j;
            }
            1OP.A07(requireActivity(), this.A06).A0U((RectF) null, A002, this, this.A07, AnonymousClass3BQ.DASHBOARD, new C19487WaZ(A002, this), str, (List) null, -2, false);
        }
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        this.A0H = JTT.A06(this) / 5;
        this.A0G = DbV.A05(this).getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        this.mContainer = view2.findViewById(R.id.container);
        1YN A002 = AnonymousClass2bO.A00();
        UserSession userSession = this.A06;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A17;
        AnonymousClass2bO.A00();
        C231002qi A012 = A002.A01(this, this, userSession, 2bV.A04(new WZX(this, 3), new WZZ(this, 1)), quickPromotionSlot);
        this.A09 = A012;
        A012.Dh3();
        WB0.A00(view2.requireViewById(R.id.button_close), 66, this);
        View requireViewById = view2.requireViewById(R.id.button_settings);
        this.A0J = requireViewById;
        WB0.A00(requireViewById, 67, this);
        EmptyStateView emptyStateView = (EmptyStateView) view2.requireViewById(16908292);
        this.mEmptyView = emptyStateView;
        if (this.A00 == 0) {
            emptyStateView.A0N(new WB0(this, 68), C320156rr.ERROR);
        }
        ReboundViewPager reboundViewPager = (ReboundViewPager) view2.requireViewById(R.id.view_pager);
        this.mImageViewPager = reboundViewPager;
        reboundViewPager.A0M(4, false);
        C14611TzI tzI = new C14611TzI(this, this.A06, this, this.A0H);
        this.mPagerAdapter = tzI;
        this.mImageViewPager.setAdapter((Adapter) tzI);
        ReboundViewPager reboundViewPager2 = this.mImageViewPager;
        reboundViewPager2.A0C = this.A0H;
        reboundViewPager2.setPageSpacing((float) this.A0G);
        this.mImageViewPager.A0P(new KIC(this, 1));
        this.mImageViewPager.setScrollMode(AnonymousClass3TG.WHEEL_OF_FORTUNE);
        this.mImageViewPager.A0J = new AnonymousClass4HC(this.A0H, this.A0G, 0.7f);
        this.mListViewPager = (ReboundViewPager) view2.requireViewById(R.id.list_view_pager);
        C17834Vgn vgn = new C17834Vgn(this.A06);
        if (requireArguments().getBoolean(C273654mx.A00(1356), false)) {
            vgn.A00(false);
        }
        this.mListAdapter = new C14625TzX(this, this, this.A06, this.A0M, this.A0N, vgn, this);
        this.A0P = new AnonymousClass7Q8(requireContext(), this.A06, this.mListAdapter);
        C14625TzX tzX = this.mListAdapter;
        Map map = this.A0Z;
        Map map2 = tzX.A0D;
        map2.clear();
        map2.putAll(map);
        map.clear();
        this.mListViewPager.setAdapter((Adapter) this.mListAdapter);
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(C71392co.A04(70.0d, 8.0d));
        this.A03 = A0J2;
        this.mListViewPager.A0P(new C14637Tzj(this));
        TriangleShape triangleShape = (TriangleShape) view2.requireViewById(R.id.notch);
        triangleShape.A00 = this.mImageViewPager;
        triangleShape.invalidate();
        F35 f35 = new F35(this.A05);
        this.A0A = new C51031FnN(this, this, this.A06, this, f35, this);
        UserSession userSession2 = this.A06;
        this.A0B = new C19447WZv(this, userSession2, this, new C19489Wab(this, 8), new AnonymousClass32A(this, userSession2, new AnonymousClass328(this)), f35, this.A0A, this, this, AnonymousClass7TF.A0b());
        if (this.A00 == 0) {
            Reel A0M2 = ReelStore.A03(this.A06).A0M(this.A0C);
            this.A07 = A0M2;
            if (A0M2 == null) {
                A0A(this);
            } else {
                this.A0A.A00 = A0M2;
                A03();
            }
        }
        if (DbY.A1Y(0Tu.A05, this.A06, 36324376668418099L)) {
            this.A02 = new GestureDetector(getContext(), new C14707U2r(this, 2));
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mContainer;
            if (touchInterceptorFrameLayout != null) {
                WC3.A00(touchInterceptorFrameLayout, 19, this);
            }
        }
    }

    public static RectF A00(ReelDashboardFragment reelDashboardFragment) {
        ReboundViewPager reboundViewPager;
        if (reelDashboardFragment.getContext() == null || !((reboundViewPager = reelDashboardFragment.mImageViewPager) == null || reboundViewPager.A0F == null)) {
            int[] iArr = new int[2];
            View view = reelDashboardFragment.mImageViewPager.A0F;
            view.getClass();
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            return new RectF((float) i, (float) i2, (float) (i + view.getWidth()), (float) (i2 + view.getHeight()));
        }
        float A092 = ((float) 0nA.A09(reelDashboardFragment.getContext())) / 2.0f;
        float A082 = ((float) 0nA.A08(reelDashboardFragment.getContext())) / 2.0f;
        return new RectF(A092, A082, A092, A082);
    }

    public static void A06(C255773uh r6, ReelDashboardFragment reelDashboardFragment, String str) {
        reelDashboardFragment.getActivity().getClass();
        if (str != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(reelDashboardFragment, reelDashboardFragment.A06), "ig_aqr_tap_to_see_responders");
            A0e.AAJ("selected", str);
            A0e.Cgf();
        }
        C309516Yo A0M2 = C13991Tnr.A0M(reelDashboardFragment);
        String str2 = r6.A0k;
        String str3 = r6.A0j;
        AnonymousClass7TG.A1N(str2, str3);
        AnonymousClass4DH r2 = new AnonymousClass4DH();
        Bundle bundle = new Bundle();
        bundle.putString("ReelUserListFragment.REEL_ID", str2);
        bundle.putString("ReelUserListFragment.REEL_ITEM_ID", str3);
        if (str != null) {
            bundle.putString("ReelUserListFragment.REEL_REACTION", str);
        }
        DbX.A18(bundle, r2, A0M2);
    }

    public static void A0D(ReelDashboardFragment reelDashboardFragment, int i) {
        C250973mM r1;
        ReelViewerFragment targetFragment = reelDashboardFragment.getTargetFragment();
        if ((targetFragment instanceof ReelViewerFragment) && (r1 = reelDashboardFragment.A08) != null && r1.A02(reelDashboardFragment.A06) > 0) {
            ReelViewerFragment reelViewerFragment = targetFragment;
            C250973mM r2 = reelDashboardFragment.A08;
            UserSession userSession = reelDashboardFragment.A06;
            String str = r2.A0A(userSession, Math.min(i, r2.A02(userSession) - 1)).A0j;
            C250973mM r22 = reelViewerFragment.A0a;
            if (r22 != null) {
                UserSession session = reelViewerFragment.getSession();
                AnonymousClass7TG.A1N(session, str);
                r22.A0C(session, r22.A04(session, str));
            }
        }
    }

    public static boolean A0E(ReelDashboardFragment reelDashboardFragment) {
        int i = 0;
        if (reelDashboardFragment.isAdded()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - reelDashboardFragment.A0I > 0) {
                reelDashboardFragment.A0I = currentTimeMillis;
                reelDashboardFragment.A0Y.clear();
                C14625TzX tzX = reelDashboardFragment.mListAdapter;
                if (tzX != null) {
                    tzX.A0C.clear();
                }
                int i2 = reelDashboardFragment.mListViewPager.A07;
                C250973mM r1 = reelDashboardFragment.A08;
                if (r1 != null) {
                    i = r1.A02(reelDashboardFragment.A06) - 1;
                }
                int min = Math.min(i2, i);
                float f = (float) min;
                reelDashboardFragment.mListViewPager.A0H(f);
                reelDashboardFragment.mImageViewPager.A0H(f);
                A0D(reelDashboardFragment, min);
                View view = reelDashboardFragment.mView;
                if (view != null) {
                    view.removeCallbacks(reelDashboardFragment.A0W);
                }
                return true;
            }
        }
        return false;
    }

    public final void A0G() {
        C255773uh A0F2 = A0F();
        if (A0F2 != null) {
            C14625TzX tzX = this.mListAdapter;
            int i = this.mListViewPager.A08;
            HashMap hashMap = tzX.A0C;
            String str = A0F2.A0j;
            C14629Tzb tzb = (C14629Tzb) hashMap.get(str);
            if (tzb != null && tzb.A0h.COw()) {
                C14639Tzl.A00(tzX.A07).A04(str, "close");
                ReelDashboardFragment reelDashboardFragment = tzX.A0B;
                ReboundViewPager reboundViewPager = reelDashboardFragment.mImageViewPager;
                if (reboundViewPager.A08 != i) {
                    reboundViewPager.A0L(i, 0.0f);
                } else {
                    A0B(reelDashboardFragment);
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A0K.onActivityResult(i, i2, intent);
        if (i == 1000) {
            A0E(this);
        } else if (i == 95848312 && intent != null && intent.getBooleanExtra(AnonymousClass000.A00(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS), false)) {
            HashMap hashMap = new HashMap();
            hashMap.put(C273654mx.A00(289), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            AnonymousClass3PP A002 = AnonymousClass3PO.A00(this.A06);
            String str = this.A0C;
            A002.A00(AnonymousClass3BU.ON_TAP, new C57302IWl(this, 1), str, 002.A0R("reel_", "dashboard"), hashMap);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, instagram.features.stories.dashboard.fragment.ReelDashboardFragment, X.4DH] */
    public final void onCreate(Bundle bundle) {
        Set emptySet;
        ReelViewerConfig A002;
        int A022 = AnonymousClass0fD.A02(-759336264);
        ReelDashboardFragment.super.onCreate(bundle);
        this.A06 = DbX.A0U(this);
        this.A0R = requireArguments().getString(C273654mx.A00(1355), "");
        this.A00 = requireArguments().getInt(C273654mx.A00(1350), 0);
        Bundle requireArguments = requireArguments();
        String A003 = C273654mx.A00(1352);
        if (requireArguments.containsKey(A003)) {
            Serializable serializable = requireArguments().getSerializable(A003);
            serializable.getClass();
            emptySet = (HashSet) serializable;
        } else {
            emptySet = Collections.emptySet();
        }
        this.A0S = emptySet;
        this.A0C = DbU.A0l(requireArguments(), C273654mx.A00(1351));
        Serializable serializable2 = requireArguments().getSerializable(C273654mx.A00(1354));
        serializable2.getClass();
        this.A0N = (AnonymousClass3BQ) serializable2;
        Bundle requireArguments2 = requireArguments();
        String A004 = C273654mx.A00(1353);
        if (requireArguments2.getParcelable(A004) != null) {
            A002 = (ReelViewerConfig) requireArguments().getParcelable(A004);
        } else {
            A002 = ReelViewerConfig.A00();
        }
        this.A0M = A002;
        if (A002 == null) {
            this.A0M = ReelViewerConfig.A00();
        }
        this.A04 = new C2355930l(requireActivity(), this.A06);
        if (!DbY.A1Y(0Tu.A05, this.A06, 36328448297287010L)) {
            C15622Ufo ufo = new C15622Ufo(this, 25);
            UserSession userSession = this.A06;
            0qQ.A0B(userSession, 0);
            1NY A0a2 = AnonymousClass7TG.A0a(userSession);
            A0a2.A0A(AnonymousClass000.A00(3162));
            A0a2.A0Q(C334247ax.class, C334257ay.class);
            1OC A0K2 = DbW.A0K(A0a2);
            A0K2.A00 = ufo;
            schedule(A0K2);
        }
        C61500KAf kAf = new C61500KAf(this, 48);
        1OC A012 = 1NP.A01(this.A06);
        A012.A00 = kAf;
        schedule(A012);
        this.A0K = AnonymousClass36R.A00(requireContext(), this.A06, new C311596cw(this.A06, requireActivity(), this, true));
        this.A0O = new C14177TrG(requireActivity(), AnonymousClass07i.A00(this), this, this.A06, new C19446WZu(this));
        this.A0L = new AnonymousClass36D(this.A06, new WWR(this, 12));
        this.A0Q = new C311526cp(this.A06, requireActivity());
        this.A05 = AnonymousClass0kN.A01(this, this.A06);
        registerLifecycleListener(this.A0O);
        AnonymousClass0fD.A09(449983994, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-447911368);
        this.A0L.A01();
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_reel_dashboard);
        AnonymousClass0fD.A09(851432752, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1536864771);
        super.onDestroy();
        AnonymousClass0fD.A09(224026432, A022);
    }

    public final void onDestroyView() {
        Parcelable onSaveInstanceState;
        int A022 = AnonymousClass0fD.A02(1359785179);
        super.onDestroyView();
        Map map = this.A0X;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry entry = (Map.Entry) A0u.next();
            ((C270184gK) entry.getKey()).A01((C309616Yy) entry.getValue());
        }
        AnonymousClass3PO.A00(this.A06).A03(this);
        map.clear();
        this.A0L.A02();
        1Ng A002 = AnonymousClass1Nd.A00(this.A06);
        A002.A02(this, AnonymousClass376.class);
        A002.A02(this.A0P, C2370836g.class);
        if (!(C61290mR.A07() || getRootActivity() == null || getRootActivity().getWindow() == null || this.mView == null)) {
            ReelViewerConfig reelViewerConfig = this.A0M;
            Window window = getRootActivity().getWindow();
            View view = this.mView;
            0qQ.A0B(reelViewerConfig, 0);
            AnonymousClass7TF.A1B(window, 1, view);
            if (reelViewerConfig.A0K) {
                view.setSystemUiVisibility((view.getSystemUiVisibility() & -5) | 256);
            } else {
                2db.A07(view, window, true);
            }
        }
        this.mImageViewPager.A0F();
        this.mListViewPager.A0F();
        Map map2 = this.A0Z;
        C14625TzX tzX = this.mListAdapter;
        HashMap hashMap = new HashMap();
        Iterator A0t = AnonymousClass7TF.A0t(tzX.A0C);
        while (A0t.hasNext()) {
            C14629Tzb tzb = (C14629Tzb) A0t.next();
            String str = tzb.A0P;
            boolean z = tzX.A0F;
            ViewGroup CEd = tzb.A0h.CEd();
            if (z) {
                C252553pI r0 = ((RecyclerView) CEd).A0D;
                r0.getClass();
                onSaveInstanceState = r0.A1M();
            } else {
                onSaveInstanceState = ((AbsListView) CEd).onSaveInstanceState();
            }
            hashMap.put(str, onSaveInstanceState);
        }
        map2.putAll(hashMap);
        0hq childFragmentManager = getChildFragmentManager();
        List<Fragment> A042 = childFragmentManager.A0U.A04();
        if (A042 != null) {
            for (Fragment fragment : A042) {
                if (fragment != null) {
                    0s1 r02 = new 0s1(childFragmentManager);
                    r02.A03(fragment);
                    r02.A01();
                }
            }
            childFragmentManager.A0a();
        }
        this.A01 = this.mListViewPager.A08;
        ReelDashboardFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(903015417, A022);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-768898008);
        int A033 = AnonymousClass0fD.A03(-1706232397);
        A0M(false);
        AnonymousClass0fD.A0A(-1991322520, A033);
        AnonymousClass0fD.A0A(1126499256, A032);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1631781955);
        ReelDashboardFragment.super.onPause();
        this.A03.A0B(this);
        1OP.A07(requireActivity(), this.A06).A0S();
        this.A01 = this.mImageViewPager.getCurrentDataIndex();
        AnonymousClass0fD.A09(1915542414, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if (X.C250973mM.A00(r0, r1).isEmpty() != false) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r6 = this;
            r0 = -318756527(0xffffffffed002951, float:-2.479002E27)
            int r2 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            r3 = 0
            r6.A0U = r3
            X.2cs r0 = r6.A03
            r0.A0A(r6)
            r0 = 8
            X.DbZ.A1P(r6, r0)
            boolean r0 = X.C61290mR.A07()
            if (r0 != 0) goto L_0x004d
            android.app.Activity r0 = r6.getRootActivity()
            if (r0 == 0) goto L_0x004d
            android.app.Activity r0 = r6.getRootActivity()
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x004d
            android.view.View r0 = r6.mView
            if (r0 == 0) goto L_0x004d
            com.instagram.model.reels.ReelViewerConfig r5 = r6.A0M
            android.app.Activity r0 = r6.getRootActivity()
            android.view.Window r4 = r0.getWindow()
            android.view.View r1 = r6.mView
            X.C51973G9u.A1E(r5, r4, r1)
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x00db
            int r0 = r1.getSystemUiVisibility()
            r0 = r0 | 260(0x104, float:3.64E-43)
            r1.setSystemUiVisibility(r0)
        L_0x004d:
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            com.instagram.common.session.UserSession r0 = r6.A06
            X.3K2 r4 = X.1OP.A07(r1, r0)
            boolean r0 = r4.A0Z()
            if (r0 == 0) goto L_0x0066
            X.3BQ r1 = r4.A0H
            X.3BQ r0 = X.AnonymousClass3BQ.REEL_VIEWER_LIST
            if (r1 != r0) goto L_0x00d0
            r4.A0X(r6)
        L_0x0066:
            X.3uh r4 = r6.A0F()
            if (r4 == 0) goto L_0x008c
            boolean r0 = r6.A0T
            if (r0 != 0) goto L_0x008c
            X.1Xj r1 = r4.A0b
            if (r1 == 0) goto L_0x008c
            java.lang.String r0 = r1.A2n()
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = r1.A2n()
            com.instagram.common.session.UserSession r0 = r6.A06
            X.1OC r1 = X.C3724090s.A04(r0, r1)
            r0 = 30
            X.C15619Ufl.A00(r1, r6, r4, r0)
            r6.schedule(r1)
        L_0x008c:
            r6.A0T = r3
            com.instagram.model.reels.Reel r1 = r6.A07
            if (r1 == 0) goto L_0x009a
            com.instagram.common.session.UserSession r0 = r6.A06
            boolean r0 = r1.A15(r0)
            if (r0 != 0) goto L_0x00ad
        L_0x009a:
            X.3mM r1 = r6.A08
            if (r1 == 0) goto L_0x00c9
            com.instagram.common.session.UserSession r0 = r6.A06
            X.0qQ.A0B(r0, r3)
            java.util.List r0 = X.C250973mM.A00(r0, r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c9
        L_0x00ad:
            X.0hq r0 = r6.mFragmentManager
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            if (r0 == 0) goto L_0x00c9
            boolean r0 = X.AnonymousClass06S.A01(r0)
            if (r0 == 0) goto L_0x00c9
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = "ReelDashboardListAdapter"
            java.lang.String r0 = "Resetting view holder id counter"
            X.0wb.A03(r1, r0)
            X.C14625TzX.A0H = r3
            X.DbT.A1K(r6)
        L_0x00c9:
            r0 = -1862728004(0xffffffff90f906bc, float:-9.822356E-29)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x00d0:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r6.mImageViewPager
            X.Wl4 r0 = new X.Wl4
            r0.<init>(r6)
            r1.post(r0)
            goto L_0x0066
        L_0x00db:
            X.2db.A07(r1, r4, r3)
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.stories.dashboard.fragment.ReelDashboardFragment.onResume():void");
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1036876372);
        ReelDashboardFragment.super.onStart();
        DbZ.A1P(this, 8);
        AnonymousClass0fD.A09(-888876652, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1301832559);
        ReelDashboardFragment.super.onStop();
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(1964851267, A022);
    }
}
