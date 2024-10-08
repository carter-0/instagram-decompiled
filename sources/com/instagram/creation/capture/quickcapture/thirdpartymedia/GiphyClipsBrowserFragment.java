package com.instagram.creation.capture.quickcapture.thirdpartymedia;

import X.0Yh;
import X.0qQ;
import X.1Ln;
import X.27r;
import X.29R;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1YB;
import X.AnonymousClass283;
import X.AnonymousClass3AS;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass8Y4;
import X.AnonymousClass8Z4;
import X.C227642jf;
import X.C252063oV;
import X.C273494mf;
import X.C352328Cx;
import X.C361278fx;
import X.C361648gZ;
import X.C39723A6o;
import X.C51971G9r;
import X.C51974G9v;
import X.C59725JVj;
import X.C60306Jj5;
import X.C60356Jk4;
import X.C60404Jkx;
import X.C60473Jm5;
import X.C60956JuE;
import X.C61077JwF;
import X.C61588KDp;
import X.C63879LAi;
import X.C64282LYi;
import X.C64286LYm;
import X.C64289LYp;
import X.C66030M8p;
import X.C66291MMa;
import X.C66579MXk;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.EVS;
import X.JTO;
import X.JTP;
import X.JTS;
import X.JTT;
import X.JTU;
import X.JVH;
import X.LIJ;
import X.M3A;
import X.MGV;
import X.MMQ;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.instagram.android.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class GiphyClipsBrowserFragment extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf, AnonymousClass8Z4 {
    public C59725JVj A00;
    public C60404Jkx A01;
    public GiphyClipsBrowserCategoriesViewController A02;
    public C60306Jj5 A03;
    public C64289LYp A04;
    public Integer A05;
    public Integer A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(MMQ.A00(this, 4));
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final String A0A = "giphy_clips_browser_fragment";
    public TextView errorTextView;
    public RecyclerView giphyClipsRecyclerView;
    public SearchEditText searchEditText;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onSearchSubmitted(SearchEditText searchEditText2, String str) {
        0qQ.A0B(str, 1);
        C60306Jj5 jj5 = this.A03;
        if (jj5 == null) {
            0qQ.A0F("giphyBrowserViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        jj5.A07.Epw(new C61077JwF(AnonymousClass05K.A0C, str));
    }

    public final void onSearchTextChanged(SearchEditText searchEditText2, CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 1);
        boolean A1Q = AnonymousClass7TF.A1Q(charSequence.length());
        C60306Jj5 jj5 = this.A03;
        if (A1Q) {
            if (jj5 != null) {
                Integer num = jj5.A00;
                0qQ.A0B(num, 0);
                String A012 = LIJ.A01(num);
                jj5.A07.Epw(new C61077JwF(AnonymousClass05K.A01, A012));
                C60306Jj5.A00(jj5, num);
                jj5.A00 = num;
                return;
            }
        } else if (jj5 != null) {
            String obj = charSequence.toString();
            Integer num2 = AnonymousClass05K.A0C;
            0qQ.A0B(obj, 0);
            jj5.A07.Epw(new C61077JwF(num2, obj));
            return;
        }
        0qQ.A0F("giphyBrowserViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        this.A04 = new C64289LYp(requireActivity(), viewGroup, AnonymousClass7TE.A0l(this.A09), C66291MMa.A00(view, this, 32));
        int A032 = AnonymousClass7TF.A03(getContext(), R.attr.assetSearchTextColor);
        SearchEditText searchEditText2 = (SearchEditText) view.requireViewById(R.id.row_search_edit_text);
        this.searchEditText = searchEditText2;
        if (searchEditText2 != null) {
            searchEditText2.setHint(2131972818);
        }
        SearchEditText searchEditText3 = this.searchEditText;
        if (searchEditText3 != null) {
            searchEditText3.A0C = this;
        }
        if (searchEditText3 != null) {
            searchEditText3.setAllowTextSelection(true);
        }
        SearchEditText searchEditText4 = this.searchEditText;
        if (searchEditText4 != null) {
            searchEditText4.setCompoundDrawableTintList(ColorStateList.valueOf(A032));
        }
        SearchEditText searchEditText5 = this.searchEditText;
        if (searchEditText5 != null) {
            C64286LYm.A00(searchEditText5, 13, this);
        }
        this.errorTextView = DbU.A0G(view, R.id.giphy_clips_error_text);
        0qQ.A0C(view, C66579MXk.A00(370));
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) view;
        touchInterceptorFrameLayout.CNi(new C64282LYi(4, this, touchInterceptorFrameLayout));
        RecyclerView A0I = DbT.A0I(view, R.id.giphy_clips_recyclerview);
        this.giphyClipsRecyclerView = A0I;
        if (A0I != null) {
            A0I.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        }
        RecyclerView recyclerView = this.giphyClipsRecyclerView;
        if (recyclerView != null) {
            C60404Jkx jkx = this.A01;
            if (jkx == null) {
                str = "giphyClipsBrowserAdapter";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView.setAdapter(jkx);
        }
        RecyclerView recyclerView2 = this.giphyClipsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.A11(new C361648gZ(DbY.A01(viewGroup.getContext()), false));
        }
        RecyclerView recyclerView3 = this.giphyClipsRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator((AnonymousClass3AS) null);
        }
        RecyclerView recyclerView4 = this.giphyClipsRecyclerView;
        if (recyclerView4 != null) {
            C60473Jm5.A00(recyclerView4, this, 9);
        }
        C60306Jj5 jj5 = this.A03;
        if (jj5 == null) {
            str = "giphyBrowserViewModel";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        DbZ.A1C(this, MGV.A01(this, (AnonymousClass4D7) null, 46), jj5.A09);
    }

    public static final void A00(C60404Jkx jkx, GiphyClipsBrowserFragment giphyClipsBrowserFragment, List list) {
        boolean z;
        Handler A0E;
        Runnable m3a;
        RecyclerView recyclerView = giphyClipsBrowserFragment.giphyClipsRecyclerView;
        if (recyclerView != null) {
            z = recyclerView.A1E();
        } else {
            z = false;
        }
        MMQ A002 = MMQ.A00(giphyClipsBrowserFragment, 3);
        0qQ.A0B(list, 0);
        List list2 = jkx.A00;
        jkx.A00 = list;
        if (z) {
            A0E = JTO.A0E(jkx.A02);
            m3a = new C66030M8p(jkx, list2, A002);
        } else {
            JTP.A1C(new C60356Jk4(list2, list), jkx);
            A0E = JTO.A0E(jkx.A02);
            m3a = new M3A(A002);
        }
        A0E.post(m3a);
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A0A;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public GiphyClipsBrowserFragment() {
        0Yh A0z = DbS.A0z(C352328Cx.class);
        this.A07 = DbS.A0I(MMQ.A00(this, 5), MMQ.A00(this, 6), C66291MMa.A00((Object) null, this, 33), A0z);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, X.07g, androidx.fragment.app.Fragment, java.lang.Object, com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment, X.4DH] */
    public final void onCreate(Bundle bundle) {
        CreationLayoutConfig creationLayoutConfig;
        Serializable serializable;
        C59725JVj jVj;
        int A022 = AnonymousClass0fD.A02(-1460999724);
        GiphyClipsBrowserFragment.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Integer num = null;
        if (bundle2 == null || (creationLayoutConfig = (CreationLayoutConfig) bundle2.getParcelable("ARG_TARGET_VIEW_SIZE_PROVIDER")) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-1505442068, A022);
            throw A0y;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable(AnonymousClass000.A00(2095));
        } else {
            serializable = null;
        }
        if (serializable instanceof C59725JVj) {
            jVj = (C59725JVj) serializable;
        } else {
            jVj = null;
        }
        this.A00 = jVj;
        Bundle bundle4 = this.mArguments;
        String A002 = AnonymousClass000.A00(2092);
        if (bundle4 != null && bundle4.containsKey(A002)) {
            Bundle bundle5 = this.mArguments;
            if (bundle5 != null) {
                num = DbV.A0o(bundle5, A002);
            }
            this.A06 = num;
        }
        AnonymousClass0eM r5 = this.A09;
        Object value = r5.getValue();
        Object value2 = this.A07.getValue();
        C59725JVj jVj2 = this.A00;
        Dba.A0j(1, value, value2);
        C60306Jj5 A003 = JTO.A0L(new C61588KDp(1, value2, jVj2, value), this).A00(C60306Jj5.class);
        this.A03 = A003;
        if (A003 == null) {
            0qQ.A0F("giphyBrowserViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        GiphyClipsBrowserCategoriesViewController giphyClipsBrowserCategoriesViewController = new GiphyClipsBrowserCategoriesViewController(this, A003);
        this.A02 = giphyClipsBrowserCategoriesViewController;
        registerLifecycleListener(giphyClipsBrowserCategoriesViewController);
        this.A01 = new C60404Jkx(requireContext(), AnonymousClass7TE.A0l(r5), this, ((NineSixteenLayoutConfigImpl) creationLayoutConfig).A06);
        C51971G9r.A1Q(this, DbW.A0E(this), 12);
        AnonymousClass0fD.A09(-1599330410, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(352304321);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.giphy_clips_browser_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-165169173, A022);
        return inflate;
    }

    public final void onDestroy() {
        List<C60956JuE> list;
        int A022 = AnonymousClass0fD.A02(263716616);
        super.onDestroy();
        C60306Jj5 jj5 = this.A03;
        Integer num = null;
        if (jj5 != null) {
            if (jj5.A01) {
                C361278fx r2 = (C361278fx) jj5.A08.getValue();
                if (r2 instanceof AnonymousClass8Y4) {
                    list = (List) r2.A00();
                    if (list != null) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (C60956JuE juE : list) {
                            if (juE.A04 == AnonymousClass05K.A0C) {
                                Integer num2 = AnonymousClass05K.A00;
                                String str = juE.A05;
                                String str2 = juE.A07;
                                String str3 = juE.A06;
                                int i = juE.A00;
                                C63879LAi lAi = juE.A01;
                                C63879LAi lAi2 = juE.A02;
                                C39723A6o a6o = juE.A03;
                                AnonymousClass7TG.A1N(str, str2);
                                C51974G9v.A0d(2, str3, lAi, lAi2, a6o);
                                A1C.add(new C60956JuE(lAi, lAi2, a6o, num2, str, str2, str3, i));
                            } else {
                                A1C.add(juE);
                            }
                        }
                        list = A1C;
                    }
                } else {
                    list = null;
                }
                C60306Jj5 jj52 = this.A03;
                if (jj52 != null) {
                    Integer num3 = (Integer) ((C61077JwF) jj52.A09.getValue()).A00;
                    C352328Cx r4 = (C352328Cx) this.A07.getValue();
                    C60306Jj5 jj53 = this.A03;
                    if (jj53 != null) {
                        String str4 = ((C61077JwF) jj53.A09.getValue()).A01;
                        Integer num4 = this.A05;
                        if (num3 != AnonymousClass05K.A0C) {
                            C60306Jj5 jj54 = this.A03;
                            if (jj54 != null) {
                                num = jj54.A00;
                            }
                        }
                        r4.A00 = new JVH(num4, num3, num, str4, list);
                    }
                }
            } else {
                27r A0g = C51971G9r.A0g(this.A09);
                C59725JVj jVj = this.A00;
                if (jVj != null) {
                    29R r22 = A0g.A09;
                    1Ln A0N = JTO.A0N(r22);
                    if (DbT.A1Y(A0N)) {
                        JTO.A1V(A0N);
                        AnonymousClass283 A0N2 = JTT.A0N(A0N, r22, "THIRD_PARTY_CLIP_HUB_CANCEL");
                        A0N.A0d(jVj);
                        JTU.A15(A0N, A0N2);
                        A0N.A0R("composition_str_id", A0N2.A0M);
                        JTS.A1E(A0N);
                    }
                    ((C352328Cx) this.A07.getValue()).A00 = null;
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A09(1980325317, A022);
                    throw A0y;
                }
            }
            AnonymousClass0fD.A09(-1646816195, A022);
            return;
        }
        0qQ.A0F("giphyBrowserViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(338015204);
        super.onDestroyView();
        GiphyClipsBrowserFragmentLifecycleUtil.cleanupReferences(this);
        C64289LYp lYp = this.A04;
        if (lYp == null) {
            0qQ.A0F("peekController");
            throw AnonymousClass00P.createAndThrow();
        }
        lYp.A07 = true;
        lYp.A0J.A0B("end_peek");
        AnonymousClass0fD.A09(-1618494842, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1830051560);
        GiphyClipsBrowserFragment.super.onPause();
        C64289LYp lYp = this.A04;
        if (lYp == null) {
            0qQ.A0F("peekController");
            throw AnonymousClass00P.createAndThrow();
        }
        lYp.A00();
        AnonymousClass0fD.A09(954279422, A022);
    }
}
