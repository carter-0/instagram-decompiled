package com.instagram.business.fragment;

import X.002;
import X.0fE;
import X.0gy;
import X.0lg;
import X.0mp;
import X.0no;
import X.0qQ;
import X.0sr;
import X.16V;
import X.1ES;
import X.1NY;
import X.1OC;
import X.2IS;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Q2;
import X.AnonymousClass32G;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22030Xtl;
import X.C239113Fa;
import X.C239123Fb;
import X.C273654mx;
import X.C319586qr;
import X.C41845B3m;
import X.C43782CDa;
import X.C45666D0q;
import X.C46672Dj1;
import X.C47080DqH;
import X.C47577E8p;
import X.C47692EDb;
import X.C47800EHl;
import X.C51173Fpj;
import X.C51174Fpk;
import X.C51335FsT;
import X.C51925G7t;
import X.C51926G7u;
import X.C59689JTv;
import X.C59904JbT;
import X.C59922Jbl;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.Dba;
import X.Dbl;
import X.EDV;
import X.EE7;
import X.EEJ;
import X.EET;
import X.FA3;
import X.FEa;
import X.FFF;
import X.FG1;
import X.FPB;
import X.FRU;
import X.FYO;
import X.Fd1;
import X.FdS;
import X.G8D;
import X.OIK;
import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.collect.ImmutableList;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.business.BusinessInfo;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public final class CategorySearchFragment extends AnonymousClass32G implements AnonymousClass4DR, C51926G7u, AnonymousClass4DS, C51925G7t, CallerContextable {
    public static final CallerContext A0U = CallerContext.A00(CategorySearchFragment.class);
    public int A00;
    public View A01;
    public ImmutableList A02;
    public ImmutableList A03 = ImmutableList.of();
    public C47577E8p A04;
    public BusinessFlowAnalyticsLogger A05;
    public G8D A06;
    public FYO A07;
    public EET A08;
    public EEJ A09;
    public AnonymousClass0wW A0A;
    public BusinessInfo A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public EE7 A0L;
    public C319586qr A0M;
    public FA3 A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final Handler A0S = AnonymousClass7TF.A0D();
    public final Handler A0T = new C46672Dj1(Looper.getMainLooper(), this, 0);
    public ActionButton actionButton;
    public IgdsBottomButtonLayout businessNavBar;
    public ListView categoriesListView;
    public IgdsSwitch categoryToggle;
    public View categoryToggleContainer;
    public ViewGroup container;
    public IgdsHeadline headline;
    public ViewGroup mainScreenContainer;
    public IgdsInlineSearchBox searchBox;
    public View selectedCategoryDivider;
    public IgdsRadioButton selectedCategoryView;
    public TextView suggestedCategoriesHeader;

    public static final void A06(CategorySearchFragment categorySearchFragment) {
        categorySearchFragment.A0J = true;
        C47577E8p e8p = categorySearchFragment.A04;
        if (e8p != null) {
            ImmutableList immutableList = categorySearchFragment.A02;
            FYO fyo = categorySearchFragment.A07;
            boolean z = categorySearchFragment.A0I;
            e8p.A06();
            if (immutableList != null && !immutableList.isEmpty()) {
                C47577E8p.A00(e8p, fyo, immutableList);
            } else if (z) {
                e8p.A08(e8p.A03, e8p.A00.getString(2131968420));
            }
            0fE.A00(e8p, 1476342982);
        }
    }

    public final void DeS() {
        ViewGroup.LayoutParams layoutParams;
        this.A0F = false;
        EET eet = this.A08;
        if (eet != null) {
            eet.A00 = true;
        }
        this.A0S.removeCallbacksAndMessages((Object) null);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
        if (igdsBottomButtonLayout != null) {
            layoutParams = igdsBottomButtonLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        0qQ.A0C(layoutParams, C273654mx.A00(3));
        layoutParams.height = -2;
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.businessNavBar;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setLayoutParams(layoutParams);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.businessNavBar;
        if (igdsBottomButtonLayout3 != null) {
            igdsBottomButtonLayout3.setFooterText((CharSequence) null);
        }
    }

    public final void Di0() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        if (this.A0G) {
            ? obj = new Object();
            C59922Jbl.A01(DbV.A05(this), obj, 2131954968);
            ActionButton A002 = C59904JbT.A00(FPB.A00(this, 29), r5, obj);
            this.actionButton = A002;
            A002.setEnabled(false);
            r5.setIsLoading(this.A0H);
            if (!A0f()) {
                A07(this);
                return;
            }
            return;
        }
        FPB.A02(DbV.A0K(), r5, this, 30);
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        CategorySearchFragment.super.onAttach(context);
        this.A06 = FG1.A01(this);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        IgdsSwitch igdsSwitch;
        BusinessInfo businessInfo;
        UserSession userSession;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0wW r0 = this.A0A;
        0qQ.A0A(r0);
        AnonymousClass4v0 A002 = AnonymousClass4v0.A00(r0);
        IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
        0qQ.A0A(igdsInlineSearchBox);
        DbU.A0G(igdsInlineSearchBox, R.id.search_edit_text).addTextChangedListener(A002);
        String str = this.A0C;
        if (str == null) {
            DbS.A16();
            throw AnonymousClass00P.createAndThrow();
        }
        if (str.equals("creator_tools") && (userSession = this.A0A) != null) {
            FFF.A02(userSession, "category_selection");
        }
        if (!(this.A06 == null || (businessInfo = this.A0B) == null)) {
            String str2 = businessInfo.A09;
            String str3 = businessInfo.A0A;
            if (!(str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0)) {
                this.A07 = new FYO(businessInfo.A02, str2, str3);
                A07(this);
            }
        }
        View view2 = this.categoryToggleContainer;
        if (view2 != null && (igdsSwitch = this.categoryToggle) != null) {
            igdsSwitch.A07 = new FdS(this, 2);
            0qQ.A0A(view2);
            FPB.A01(view2, 31, this);
        }
    }

    public static final Integer A01(CategorySearchFragment categorySearchFragment) {
        Object obj = null;
        if (categorySearchFragment.A07 == null) {
            return null;
        }
        ImmutableList immutableList = categorySearchFragment.A03;
        0qQ.A0A(immutableList);
        Iterator it = 0sr.A1R(immutableList).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int A0M2 = AnonymousClass7TE.A0M(next);
            FYO fyo = categorySearchFragment.A07;
            0qQ.A0A(fyo);
            ImmutableList immutableList2 = categorySearchFragment.A03;
            0qQ.A0A(immutableList2);
            if (fyo.isContentSame((FYO) immutableList2.get(A0M2))) {
                obj = next;
                break;
            }
        }
        return (Integer) obj;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, com.instagram.business.fragment.CategorySearchFragment, androidx.fragment.app.Fragment] */
    private final void A02() {
        boolean z;
        Integer num;
        if (!this.A0E) {
            View view = this.A01;
            0qQ.A0A(view);
            view.setVisibility(0);
            FA3 fa3 = this.A0N;
            if (fa3 == null) {
                0qQ.A0F("categoryHelper");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass0wW r6 = this.A0A;
            0qQ.A0A(r6);
            Context requireContext = requireContext();
            0gy A002 = AnonymousClass07i.A00(this);
            0qQ.A0B(r6, 0);
            2IS A042 = C41845B3m.A04();
            A042.A04("locale", AnonymousClass1Q2.A00());
            C239113Fa r1 = new C239113Fa(A042, C47080DqH.class, "CreatorAndBusinessSuggestedCategoriesQuery", false);
            C239123Fb r0 = new C239123Fb(r6);
            r0.A08(r1);
            1OC A062 = r0.A06();
            EDV.A00(A062, requireContext, fa3, 6);
            1ES.A00(requireContext, A002, A062);
            return;
        }
        this.A0J = false;
        TextView textView = this.suggestedCategoriesHeader;
        if (textView != null) {
            textView.setVisibility(0);
        }
        C47577E8p e8p = this.A04;
        if (e8p != null) {
            ImmutableList immutableList = this.A03;
            FYO fyo = this.A07;
            EET eet = this.A08;
            0qQ.A0A(eet);
            SearchController searchController = eet.A03;
            Integer num2 = searchController.A03;
            if (num2 == AnonymousClass05K.A0C || (num2 == (num = AnonymousClass05K.A01) && searchController.A02 == num)) {
                z = true;
            } else {
                z = false;
            }
            e8p.A06();
            if (immutableList != null && !immutableList.isEmpty()) {
                if (z) {
                    e8p.A08(e8p.A01, e8p.A00.getString(2131974674));
                }
                C47577E8p.A00(e8p, fyo, immutableList);
            }
            0fE.A00(e8p, 214347070);
        }
    }

    private final void A03() {
        String str;
        16V r2;
        String str2;
        FRU A0C2;
        BusinessInfo businessInfo;
        FYO fyo = this.A07;
        if (fyo != null) {
            str = fyo.A01;
            str2 = fyo.A02;
            r2 = fyo.A00;
        } else {
            str = null;
            r2 = null;
            str2 = null;
        }
        FEa fEa = new FEa(this.A0B);
        fEa.A09 = str;
        fEa.A0K = str2;
        fEa.A02 = r2;
        this.A0B = new BusinessInfo(fEa);
        G8D g8d = this.A06;
        if (g8d != null && (A0C2 = Dba.A0C(g8d)) != null && (businessInfo = this.A0B) != null) {
            A0C2.A02 = businessInfo;
        }
    }

    public static final void A04(CategorySearchFragment categorySearchFragment) {
        String str;
        String str2;
        if (categorySearchFragment.A05 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            FYO fyo = categorySearchFragment.A07;
            if (fyo != null) {
                str = fyo.A01;
            } else {
                str = null;
            }
            A1E.put("category_id", str);
            FYO fyo2 = categorySearchFragment.A07;
            if (fyo2 != null) {
                str2 = fyo2.A02;
            } else {
                str2 = null;
            }
            A1E.put("category_name", str2);
            IgdsInlineSearchBox igdsInlineSearchBox = categorySearchFragment.searchBox;
            0qQ.A0A(igdsInlineSearchBox);
            A1E.put("category_search_keyword", igdsInlineSearchBox.getSearchString());
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                String A0a = Dba.A0a(categorySearchFragment);
                String str3 = categorySearchFragment.A0C;
                if (str3 == null) {
                    DbS.A16();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    businessFlowAnalyticsLogger.Ci7(new C22030Xtl(A0a, str3, (String) null, (String) null, (String) null, (Map) null, A1E, (Map) null));
                }
            }
        }
    }

    public static final void A05(CategorySearchFragment categorySearchFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
        if (businessFlowAnalyticsLogger != null) {
            String A0a = Dba.A0a(categorySearchFragment);
            String str = categorySearchFragment.A0C;
            if (str == null) {
                DbS.A16();
                throw AnonymousClass00P.createAndThrow();
            } else {
                businessFlowAnalyticsLogger.Ckg(new C22030Xtl(A0a, str, "switch_to_professional", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
        }
    }

    public static final void A08(CategorySearchFragment categorySearchFragment, String str, String str2) {
        if (categorySearchFragment.A05 != null) {
            String A0a = Dba.A0a(categorySearchFragment);
            HashMap hashMap = null;
            String str3 = categorySearchFragment.A0C;
            if (str3 == null) {
                DbS.A16();
                throw AnonymousClass00P.createAndThrow();
            }
            if (str2 != null) {
                hashMap = AnonymousClass7TE.A1E();
                hashMap.put("category_id", str2);
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Ckp(new C22030Xtl(A0a, str3, str, (String) null, (String) null, (Map) null, hashMap, (Map) null));
            }
        }
    }

    public static final void A09(CategorySearchFragment categorySearchFragment, String str, String str2, String str3, int i) {
        if (categorySearchFragment.A05 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("data_count", String.valueOf(i));
            HashMap hashMap = null;
            if (!(str2 == null || str3 == null)) {
                hashMap = Dba.A0f(str2, str3);
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                String A0a = Dba.A0a(categorySearchFragment);
                String str4 = categorySearchFragment.A0C;
                if (str4 == null) {
                    DbS.A16();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    businessFlowAnalyticsLogger.Ci5(new C22030Xtl(A0a, str4, str, (String) null, (String) null, (Map) null, hashMap, A1E));
                }
            }
        }
    }

    public static final void A0A(CategorySearchFragment categorySearchFragment, String str, String str2, String str3, String str4) {
        if (categorySearchFragment.A05 != null) {
            HashMap hashMap = null;
            if (!(str3 == null || str4 == null)) {
                hashMap = Dba.A0f(str3, str4);
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                String A0a = Dba.A0a(categorySearchFragment);
                String str5 = categorySearchFragment.A0C;
                if (str5 == null) {
                    DbS.A16();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    businessFlowAnalyticsLogger.Ci6(new C22030Xtl(A0a, str5, str, str2, (String) null, (Map) null, hashMap, (Map) null));
                }
            }
        }
    }

    public static final void A0B(CategorySearchFragment categorySearchFragment, boolean z) {
        FEa fEa = new FEa(categorySearchFragment.A0B);
        fEa.A0Q = z;
        categorySearchFragment.A0B = new BusinessInfo(fEa);
        if (categorySearchFragment.A05 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("switch_display_category", String.valueOf(z));
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                String A0a = Dba.A0a(categorySearchFragment);
                String str = categorySearchFragment.A0C;
                if (str == null) {
                    DbS.A16();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    businessFlowAnalyticsLogger.Ckp(new C22030Xtl(A0a, str, "switch_display_category", (String) null, (String) null, (Map) null, A1E, (Map) null));
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A0A;
    }

    public final void A0d(FYO fyo) {
        String str;
        Integer A012;
        if (this.A0J) {
            str = "searched_category";
        } else {
            str = "suggested_category";
        }
        A08(this, str, fyo.A01);
        this.A07 = fyo;
        A07(this);
        if (A0f() && (A012 = A01(this)) != null) {
            ListView listView = this.categoriesListView;
            0qQ.A0A(listView);
            listView.post(new C51335FsT(this, A012));
        }
        EET eet = this.A08;
        if (eet != null) {
            eet.A00();
        }
    }

    public final void A0e(String str) {
        this.A0D = str;
        if (str.length() == 0) {
            A02();
            return;
        }
        Handler handler = this.A0T;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        Message obtainMessage = handler.obtainMessage(1, str);
        0qQ.A07(obtainMessage);
        handler.sendMessageDelayed(obtainMessage, 300);
    }

    public final boolean A0f() {
        EET eet = this.A08;
        0qQ.A0A(eet);
        return AnonymousClass7TF.A1W(eet.A03.A03, AnonymousClass05K.A0C);
    }

    public final void APF() {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
        if (igdsBottomButtonLayout == null || igdsBottomButtonLayout.getVisibility() != 0) {
            ActionButton actionButton2 = this.actionButton;
            if (actionButton2 != null) {
                actionButton2.setEnabled(false);
                return;
            }
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.businessNavBar;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setPrimaryButtonEnabled(false);
        }
    }

    public final void ARL() {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
        if (igdsBottomButtonLayout == null || igdsBottomButtonLayout.getVisibility() != 0) {
            ActionButton actionButton2 = this.actionButton;
            if (actionButton2 != null) {
                actionButton2.setEnabled(true);
                return;
            }
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.businessNavBar;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setPrimaryButtonEnabled(true);
        }
    }

    public final void DZI() {
        String str;
        16V r13;
        FYO fyo;
        String str2;
        FYO fyo2 = this.A07;
        if (fyo2 != null) {
            str = fyo2.A01;
        } else {
            str = null;
        }
        A08(this, "continue", str);
        A03();
        String str3 = this.A0C;
        String str4 = null;
        if (str3 == null) {
            str2 = "entryPoint";
        } else {
            if (str3.equals("creator_tools")) {
                UserSession userSession = this.A0A;
                0qQ.A0A(userSession);
                FFF.A03(userSession, "category_selection", "category_selection_cta");
            }
            if (this.A0Q) {
                IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setFooterText(getString(2131956739));
                }
                this.A0S.postDelayed(new C51174Fpk(this), 15000);
                String str5 = this.A0O;
                if (str5 == null) {
                    str2 = "creatorToolsEntryPoint";
                } else {
                    FYO fyo3 = this.A07;
                    if (fyo3 != null) {
                        String str6 = fyo3.A01;
                        BusinessInfo businessInfo = this.A0B;
                        0qQ.A0A(businessInfo);
                        boolean z = businessInfo.A0Q;
                        Context requireContext = requireContext();
                        AnonymousClass0wW r3 = this.A0A;
                        DbS.A1Z(r3);
                        0qQ.A0B(r3, 2);
                        CreatorToolsMonetizationApi creatorToolsMonetizationApi = (CreatorToolsMonetizationApi) r3.A01(CreatorToolsMonetizationApi.class, new Dbl(r3, 11));
                        ValuePropsFlow valuePropsFlow = (ValuePropsFlow) ValuePropsFlow.A01.get(str5);
                        if (valuePropsFlow == null) {
                            valuePropsFlow = ValuePropsFlow.UNRECOGNIZED;
                        }
                        1NY A0M2 = DbU.A0M(creatorToolsMonetizationApi.A00);
                        A0M2.A04();
                        A0M2.A02();
                        String A11 = 002.A11("api/", "v1/", "creators/", "open_creator_tools/", "convert_account/");
                        0qQ.A07(A11);
                        A0M2.A0E = A11;
                        A0M2.A0Q(C43782CDa.class, C45666D0q.class);
                        A0M2.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, valuePropsFlow.A00);
                        A0M2.A9m("category_id", str6);
                        A0M2.A0H("should_show_category", z);
                        1OC A0M3 = A0M2.A0M();
                        0qQ.A0C(A0M3, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.creatortools.api.schemas.CreatorToolsAccountConversionResponse>, com.instagram.api.response.IgApiResponse<com.instagram.creatortools.api.schemas.CreatorToolsAccountConversionResponse>>");
                        A0M3.A00 = new C47692EDb(1, (Object) this, (Object) r3, (Object) requireContext);
                        schedule(A0M3);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("categoryId should not be null");
                }
            } else {
                G8D g8d = this.A06;
                if (g8d == null || !FG1.A04(g8d)) {
                    G8D g8d2 = this.A06;
                    if (g8d2 != null) {
                        BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) g8d2;
                        boolean z2 = false;
                        if (DbT.A1Z(businessConversionActivity) && ((FG1.A03(businessConversionActivity) || FG1.A02(businessConversionActivity)) && ConversionStep.CHOOSE_CATEGORY == businessConversionActivity.A0n())) {
                            z2 = true;
                        }
                        G8D g8d3 = this.A06;
                        if (z2) {
                            if (FG1.A03(g8d3) || (this.A0R && (fyo = this.A07) != null && fyo.A00 == 16V.A06)) {
                                r13 = 16V.A06;
                            } else {
                                r13 = 16V.A05;
                            }
                            G8D g8d4 = this.A06;
                            0qQ.A0C(g8d4, "null cannot be cast to non-null type com.instagram.business.activity.BusinessConversionActivity");
                            ((BusinessConversionActivity) g8d4).A0o(requireContext(), this, this, r13, "choose_category", false);
                            return;
                        }
                        0qQ.A0A(g8d3);
                        FYO fyo4 = this.A07;
                        if (fyo4 != null) {
                            str4 = fyo4.A01;
                        }
                        g8d3.Clz(DbV.A0C(AnonymousClass000.A00(1856), str4));
                        A04(this);
                        return;
                    }
                    return;
                }
                A04(this);
                G8D g8d5 = this.A06;
                0qQ.A0A(g8d5);
                ((BusinessConversionActivity) g8d5).Clz((Bundle) null);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DeL(String str, String str2, String str3) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A05;
        if (businessFlowAnalyticsLogger != null) {
            String A0a = Dba.A0a(this);
            String str4 = this.A0C;
            if (str4 == null) {
                DbS.A16();
                throw AnonymousClass00P.createAndThrow();
            }
            businessFlowAnalyticsLogger.Ckh(new C22030Xtl(A0a, str4, "switch_to_professional", str2, str3, (Map) null, (Map) null, (Map) null));
        }
        Context context = getContext();
        if (context != null) {
            C59689JTv.A09(context, str);
        }
        EEJ eej = this.A09;
        if (eej != null) {
            eej.A00();
        }
    }

    public final void Dei() {
        EEJ eej = this.A09;
        if (eej != null) {
            eej.A01();
        }
        this.A0F = true;
        0no.A00().A01(new C47800EHl(this), 8000);
        EET eet = this.A08;
        if (eet != null) {
            eet.A00 = false;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setFooterText(getString(2131956739));
        }
        this.A0S.postDelayed(new C51174Fpk(this), 15000);
    }

    public final String getModuleName() {
        return "choose_category_with_search";
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A0F) {
            return true;
        }
        this.A03 = ImmutableList.of();
        this.A07 = null;
        IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A0E.setText("");
        }
        A07(this);
        if (!this.A0K && (businessFlowAnalyticsLogger = this.A05) != null) {
            String A0a = Dba.A0a(this);
            String str = this.A0C;
            if (str == null) {
                DbS.A16();
                throw AnonymousClass00P.createAndThrow();
            }
            businessFlowAnalyticsLogger.ChP(new C22030Xtl(A0a, str, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (!this.A0G) {
            A03();
            G8D g8d = this.A06;
            if (g8d != null) {
                ((BusinessConversionActivity) g8d).EJN((Bundle) null);
                return true;
            }
        }
        return false;
    }

    public CategorySearchFragment() {
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A02 = of;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0043, code lost:
        if (r2 != null) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a A[EDGE_INSN: B:53:0x007a->B:43:0x007a ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.instagram.business.fragment.CategorySearchFragment r3) {
        /*
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x005f
            X.FYO r0 = r3.A07
            if (r0 == 0) goto L_0x0085
            r3.ARL()
            android.view.View r1 = r3.categoryToggleContainer
            if (r1 == 0) goto L_0x0015
            r0 = 0
        L_0x0012:
            r1.setVisibility(r0)
        L_0x0015:
            X.FYO r0 = r3.A07
            if (r0 == 0) goto L_0x007a
            com.instagram.igds.components.button.IgdsRadioButton r0 = r3.selectedCategoryView
            if (r0 == 0) goto L_0x007a
            android.view.View r0 = r3.selectedCategoryDivider
            if (r0 == 0) goto L_0x007a
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x007a
            com.google.common.collect.ImmutableList r1 = r3.A03
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0062
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0062
        L_0x0033:
            com.instagram.igds.components.button.IgdsRadioButton r1 = r3.selectedCategoryView
            if (r1 == 0) goto L_0x0040
            X.FYO r0 = r3.A07
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r0.A02
        L_0x003d:
            r1.setText(r0)
        L_0x0040:
            com.instagram.igds.components.button.IgdsRadioButton r2 = r3.selectedCategoryView
            r1 = 0
            if (r2 == 0) goto L_0x0048
        L_0x0045:
            r2.setVisibility(r1)
        L_0x0048:
            android.view.View r0 = r3.selectedCategoryDivider
            X.0qQ.A0A(r0)
            r0.setVisibility(r1)
        L_0x0050:
            boolean r0 = r3.A0g()
            if (r0 != 0) goto L_0x008f
            boolean r0 = r3.A0f()
            if (r0 == 0) goto L_0x008f
            A06(r3)
        L_0x005f:
            return
        L_0x0060:
            r0 = 0
            goto L_0x003d
        L_0x0062:
            java.util.Iterator r2 = r1.iterator()
        L_0x0066:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()
            X.FYO r1 = (X.FYO) r1
            X.FYO r0 = r3.A07
            boolean r0 = r1.isContentSame(r0)
            if (r0 == 0) goto L_0x0066
        L_0x007a:
            com.instagram.igds.components.button.IgdsRadioButton r2 = r3.selectedCategoryView
            if (r2 == 0) goto L_0x0050
            android.view.View r0 = r3.selectedCategoryDivider
            if (r0 == 0) goto L_0x0050
            r1 = 8
            goto L_0x0045
        L_0x0085:
            r3.APF()
            android.view.View r1 = r3.categoryToggleContainer
            if (r1 == 0) goto L_0x0015
            r0 = 8
            goto L_0x0012
        L_0x008f:
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.A07(com.instagram.business.fragment.CategorySearchFragment):void");
    }

    public final void A0c() {
        String searchString;
        int length;
        OIK oik;
        if (A0f()) {
            EET eet = this.A08;
            if (eet != null) {
                OIK oik2 = eet.A03.mViewHolder;
                if (oik2 == null) {
                    searchString = "";
                } else {
                    searchString = oik2.A0F.getSearchString();
                }
            } else {
                searchString = null;
            }
        } else {
            IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
            0qQ.A0A(igdsInlineSearchBox);
            searchString = igdsInlineSearchBox.getSearchString();
        }
        if (searchString == null || (length = searchString.length()) == 0) {
            A02();
        } else {
            A0e(searchString);
            EET eet2 = this.A08;
            if (!(eet2 == null || (oik = eet2.A03.mViewHolder) == null)) {
                oik.A0F.setText(searchString);
                SearchEditText searchEditText = oik.A0F;
                Pattern pattern = 0mp.A01;
                searchEditText.setSelection(length);
            }
        }
        ViewGroup viewGroup = this.container;
        if (viewGroup != null) {
            if (this.A00 == 0) {
                this.A00 = viewGroup.getPaddingTop();
            }
            ViewGroup viewGroup2 = this.container;
            if (viewGroup2 != null) {
                viewGroup2.setPadding(0, 0, 0, 0);
            }
        }
        ViewGroup viewGroup3 = this.mainScreenContainer;
        if (viewGroup3 != null) {
            viewGroup3.setLayoutTransition((LayoutTransition) null);
        }
    }

    public final boolean A0g() {
        String searchString;
        if (A0f()) {
            EET eet = this.A08;
            0qQ.A0A(eet);
            OIK oik = eet.A03.mViewHolder;
            if (oik == null) {
                searchString = "";
            } else {
                searchString = oik.A0F.getSearchString();
                if (searchString == null) {
                    return true;
                }
            }
            if (searchString.length() == 0) {
                return true;
            }
        }
        if (A0f()) {
            return false;
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
        0qQ.A0A(igdsInlineSearchBox);
        if (igdsInlineSearchBox.getSearchString().length() == 0) {
            return true;
        }
        return false;
    }

    public final void Det(16V r3) {
        A05(this);
        this.A0T.post(new C51173Fpj(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e7, code lost:
        if (X.2Ek.A01(X.AnonymousClass0eD.A00(r0)) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -1520925387(0xffffffffa5588535, float:-1.8780146E-16)
            int r1 = X.AnonymousClass0fD.A02(r0)
            com.instagram.business.fragment.CategorySearchFragment.super.onCreate(r12)
            android.os.Bundle r4 = r11.requireArguments()
            X.0wW r0 = X.DbX.A0T(r11)
            r11.A0A = r0
            java.lang.String r0 = X.DbS.A0l(r4)
            if (r0 == 0) goto L_0x01c0
            r11.A0C = r0
            X.0wW r7 = r11.A0A
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            r6 = 0
            if (r0 == 0) goto L_0x01ac
            X.DbS.A1Z(r7)
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r2.A01(r7)
            boolean r5 = r0.A1f()
            com.instagram.user.model.User r0 = r2.A01(r7)
            boolean r3 = r0.A1g()
            X.6nu r0 = X.C317816nt.A00(r7)
            r0.A0A(r6)
        L_0x0041:
            X.G8D r0 = r11.A06
            if (r0 == 0) goto L_0x01a2
            X.FRU r0 = X.Dba.A0C(r0)
            com.instagram.model.business.BusinessInfo r0 = r0.A02
        L_0x004b:
            X.FEa r2 = new X.FEa
            r2.<init>(r0)
            r2.A0Q = r5
            r2.A0S = r3
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>(r2)
            r11.A0B = r0
            X.G8D r0 = r11.A06
            if (r0 == 0) goto L_0x006b
            X.FRU r2 = X.Dba.A0C(r0)
            if (r2 == 0) goto L_0x006b
            com.instagram.model.business.BusinessInfo r0 = r11.A0B
            if (r0 == 0) goto L_0x006b
            r2.A02 = r0
        L_0x006b:
            X.G8D r0 = r11.A06
            if (r0 == 0) goto L_0x00a7
            X.FRU r0 = X.Dba.A0C(r0)
            com.instagram.model.business.BusinessInfo r3 = r0.A03
            if (r3 == 0) goto L_0x00a7
            com.instagram.model.business.BusinessInfo r0 = r11.A0B
            X.FEa r2 = new X.FEa
            r2.<init>(r0)
            java.lang.String r0 = r3.A09
            r2.A09 = r0
            java.lang.String r0 = r3.A0A
            r2.A0A = r0
            java.lang.String r0 = r3.A0K
            r2.A0K = r0
            r0 = 1
            r2.A0O = r0
            X.16V r0 = r3.A02
            r2.A02 = r0
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>(r2)
            r11.A0B = r0
            X.G8D r0 = r11.A06
            X.0qQ.A0A(r0)
            X.FRU r2 = X.Dba.A0C(r0)
            com.instagram.model.business.BusinessInfo r0 = r11.A0B
            if (r0 == 0) goto L_0x00a7
            r2.A02 = r0
        L_0x00a7:
            androidx.fragment.app.FragmentActivity r2 = r11.getActivity()
            X.EE7 r0 = new X.EE7
            r0.<init>(r2)
            r11.A0L = r0
            r11.registerLifecycleListener(r0)
            X.FA3 r0 = new X.FA3
            r0.<init>(r11)
            r11.A0N = r0
            java.lang.String r5 = "edit_profile_entry"
            java.lang.String r0 = r4.getString(r5)
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r11.A0G = r0
            X.G8D r0 = r11.A06
            boolean r0 = X.FG1.A03(r0)
            if (r0 == 0) goto L_0x00d6
            X.0wW r0 = r11.A0A
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x00e9
        L_0x00d6:
            X.G8D r0 = r11.A06
            if (r0 != 0) goto L_0x019f
            X.0wW r0 = r11.A0A
            X.0qQ.A0A(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0eD.A00(r0)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x019f
        L_0x00e9:
            r0 = 1
        L_0x00ea:
            r11.A0P = r0
            X.G8D r3 = r11.A06
            if (r3 == 0) goto L_0x0195
            X.6qr r2 = r3.B6a()
            X.6qr r0 = X.C319586qr.INTEREST_ACCOUNT_CONVERSION
            if (r2 == r0) goto L_0x0100
            X.6qr r2 = r3.B6a()
            X.6qr r0 = X.C319586qr.RENEW_PROFESSIONAL_ACCOUNT
            if (r2 != r0) goto L_0x0195
        L_0x0100:
            r6 = 1
        L_0x0101:
            r11.A0R = r6
            java.lang.String r2 = r11.A0C
            r0 = 0
            if (r2 == 0) goto L_0x01b8
            java.lang.String r3 = "creator_tools"
            boolean r2 = r2.equals(r3)
            r11.A0Q = r2
            if (r2 == 0) goto L_0x011a
            java.lang.String r2 = r4.getString(r3)
            if (r2 == 0) goto L_0x01ca
            r11.A0O = r2
        L_0x011a:
            java.lang.String r2 = r4.getString(r5)
            if (r2 == 0) goto L_0x017b
            X.6qr r2 = X.C319586qr.EDIT_PROFILE
            r11.A0M = r2
        L_0x0124:
            X.6qr r3 = r11.A0M
            if (r3 == 0) goto L_0x0132
            X.0wW r2 = r11.A0A
            if (r2 == 0) goto L_0x01b0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C319596qs.A00(r3, r11, r2, r0)
            r11.A05 = r0
        L_0x0132:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r11.A05
            if (r0 == 0) goto L_0x0172
            com.instagram.model.business.BusinessInfo r4 = r11.A0B
            r2 = 1
            if (r4 == 0) goto L_0x0179
            boolean r0 = r4.A0O
            if (r0 != r2) goto L_0x0179
            java.lang.String r3 = r4.A09
            java.lang.String r2 = r4.A0A
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "prefilled_category_id"
            r9.put(r0, r3)
            java.lang.String r0 = "prefilled_category_name"
            r9.put(r0, r2)
        L_0x0151:
            java.lang.String r3 = X.Dba.A0a(r11)
            r5 = 0
            java.lang.String r4 = r11.A0C
            if (r4 == 0) goto L_0x01b8
            com.instagram.model.business.BusinessInfo r0 = r11.A0B
            X.0qQ.A0A(r0)
            java.util.HashMap r8 = X.C48728EjD.A00(r0)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r11.A05
            if (r0 == 0) goto L_0x0172
            X.Xtl r2 = new X.Xtl
            r6 = r5
            r7 = r5
            r10 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.Cka(r2)
        L_0x0172:
            r0 = -1472650693(0xffffffffa839223b, float:-1.02769855E-14)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x0179:
            r9 = 0
            goto L_0x0151
        L_0x017b:
            X.G8D r2 = r11.A06
            if (r2 == 0) goto L_0x0124
            X.6qr r0 = r2.B6a()
            r11.A0M = r0
            X.G8D r0 = r11.A06
            X.0qQ.A0A(r0)
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0124
        L_0x0195:
            X.G8D r0 = r11.A06
            boolean r0 = X.FG1.A04(r0)
            if (r0 == 0) goto L_0x0101
            goto L_0x0100
        L_0x019f:
            r0 = 0
            goto L_0x00ea
        L_0x01a2:
            java.lang.String r0 = "business_info"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.instagram.model.business.BusinessInfo r0 = (com.instagram.model.business.BusinessInfo) r0
            goto L_0x004b
        L_0x01ac:
            r5 = 0
            r3 = 0
            goto L_0x0041
        L_0x01b0:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -819038455(0xffffffffcf2e7709, float:-2.92703667E9)
            goto L_0x01d3
        L_0x01b8:
            X.DbS.A16()
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x01c0:
            java.lang.String r0 = "entry_point should not be null"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r0 = 1431519609(0x55534179, float:1.45173848E13)
            goto L_0x01d3
        L_0x01ca:
            java.lang.String r0 = "creator tools entrypoint should not be null if entrypoint to CategorySearch is creator_tools"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r0 = -1461697458(0xffffffffa8e0444e, float:-2.4898618E-14)
        L_0x01d3:
            X.AnonymousClass0fD.A09(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r9.A0Q != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = 900866477(0x35b221ad, float:1.3271834E-6)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            X.0qQ.A0B(r10, r4)
            r0 = 2131624462(0x7f0e020e, float:1.8876104E38)
            android.view.View r2 = r10.inflate(r0, r11, r4)
            r9.container = r11
            r0 = 2131435809(0x7f0b2121, float:1.849347E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r2, r0)
            r9.mainScreenContainer = r0
            r0 = 2131437264(0x7f0b26d0, float:1.8496422E38)
            com.instagram.igds.components.headline.IgdsHeadline r0 = X.DbZ.A0U(r2, r0)
            r9.headline = r0
            if (r0 == 0) goto L_0x002b
            r0.setVisibility(r4)
        L_0x002b:
            com.instagram.igds.components.headline.IgdsHeadline r3 = r9.headline
            if (r3 == 0) goto L_0x0035
            r0 = 2131973033(0x7f1353a9, float:1.958309E38)
            r3.setHeadline((int) r0)
        L_0x0035:
            com.instagram.igds.components.headline.IgdsHeadline r3 = r9.headline
            if (r3 == 0) goto L_0x003f
            r0 = 2131973032(0x7f1353a8, float:1.9583088E38)
            r3.setBody((int) r0)
        L_0x003f:
            boolean r0 = r9.A0R
            if (r0 != 0) goto L_0x004c
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x004c
            boolean r0 = r9.A0Q
            r3 = 0
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            r3 = 1
        L_0x004d:
            r9.A0E = r4
            r0 = 2131442082(0x7f0b39a2, float:1.8506194E38)
            android.view.View r0 = r2.requireViewById(r0)
            r9.A01 = r0
            r0 = 2131436820(0x7f0b2514, float:1.8495521E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r5 = X.DbT.A0c(r2, r0)
            r9.businessNavBar = r5
            r4 = 2131968361(0x7f134169, float:1.9573614E38)
            if (r3 == 0) goto L_0x0069
            r4 = 2131960992(0x7f1324a0, float:1.9558668E38)
        L_0x0069:
            r3 = -1
            X.0qQ.A0A(r5)
            X.EEJ r0 = new X.EEJ
            r0.<init>((X.C51925G7t) r9, (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r5, (int) r4, (int) r3)
            r9.A09 = r0
            r9.registerLifecycleListener(r0)
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x0080
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r9.businessNavBar
            X.AnonymousClass7TH.A0R(r0)
        L_0x0080:
            X.G8D r0 = r9.A06
            if (r0 == 0) goto L_0x0150
            X.FRU r0 = X.Dba.A0C(r0)
            com.instagram.model.business.BusinessInfo r0 = r0.A02
            if (r0 == 0) goto L_0x0150
            X.G8D r0 = r9.A06
            X.0qQ.A0A(r0)
            X.FRU r0 = X.Dba.A0C(r0)
            com.instagram.model.business.BusinessInfo r0 = r0.A02
        L_0x0097:
            r9.A0B = r0
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r0
            r9.searchBox = r0
            android.content.Context r3 = r9.requireContext()
            X.E8p r0 = new X.E8p
            r0.<init>(r3, r9)
            r9.A04 = r0
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r3 = r2.requireViewById(r0)
            android.widget.ListView r3 = (android.widget.ListView) r3
            r9.categoriesListView = r3
            X.0qQ.A0A(r3)
            X.E8p r0 = r9.A04
            r3.setAdapter(r0)
            r0 = 2131442081(0x7f0b39a1, float:1.8506192E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r9.suggestedCategoriesHeader = r0
            r0 = 2131440791(0x7f0b3497, float:1.8503575E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r2, r0)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0 = 2131433809(0x7f0b1951, float:1.8489414E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r2, r0)
            X.0wW r10 = r9.A0A
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            androidx.fragment.app.FragmentActivity r4 = r9.requireActivity()
            X.E8p r8 = r9.A04
            X.0qQ.A0A(r8)
            android.view.ViewGroup r6 = r9.mainScreenContainer
            X.0qQ.A0A(r6)
            com.instagram.igds.components.search.IgdsInlineSearchBox r11 = r9.searchBox
            X.0qQ.A0A(r11)
            X.EET r3 = new X.EET
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r9.A08 = r3
            r9.registerLifecycleListener(r3)
            r0 = 2131440119(0x7f0b31f7, float:1.8502212E38)
            android.view.View r0 = r2.requireViewById(r0)
            r9.categoryToggleContainer = r0
            X.0qQ.A0A(r0)
            android.widget.TextView r3 = X.Dba.A06(r0)
            r0 = 2131960867(0x7f132423, float:1.9558415E38)
            r3.setText(r0)
            android.view.View r3 = r9.categoryToggleContainer
            X.0qQ.A0A(r3)
            r0 = 2131442920(0x7f0b3ce8, float:1.8507893E38)
            android.view.View r3 = r3.requireViewById(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r3 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r3
            r9.categoryToggle = r3
            com.instagram.model.business.BusinessInfo r0 = r9.A0B
            if (r0 == 0) goto L_0x012e
            X.0qQ.A0A(r3)
            boolean r0 = r0.A0Q
            r3.setChecked(r0)
        L_0x012e:
            r0 = 2131440467(0x7f0b3353, float:1.8502918E38)
            android.view.View r3 = r2.requireViewById(r0)
            com.instagram.igds.components.button.IgdsRadioButton r3 = (com.instagram.igds.components.button.IgdsRadioButton) r3
            r9.selectedCategoryView = r3
            X.0qQ.A0A(r3)
            r0 = 1
            r3.setChecked(r0)
            r0 = 2131441027(0x7f0b3583, float:1.8504054E38)
            android.view.View r0 = r2.requireViewById(r0)
            r9.selectedCategoryDivider = r0
            r0 = -1504032663(0xffffffffa65a4869, float:-7.573208E-16)
            X.AnonymousClass0fD.A09(r0, r1)
            return r2
        L_0x0150:
            com.instagram.model.business.BusinessInfo r0 = r9.A0B
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-124459057);
        EE7 ee7 = this.A0L;
        if (ee7 != null) {
            ee7.onDestroy();
            EE7 ee72 = this.A0L;
            if (ee72 != null) {
                unregisterLifecycleListener(ee72);
                super.onDestroy();
                AnonymousClass0fD.A09(-250357024, A022);
                return;
            }
        }
        0qQ.A0F("noTabLifecycleListener");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1373520753);
        this.A0S.removeCallbacksAndMessages((Object) null);
        EEJ eej = this.A09;
        if (eej != null) {
            unregisterLifecycleListener(eej);
        }
        this.A01 = null;
        this.A09 = null;
        this.A03 = ImmutableList.of();
        EET eet = this.A08;
        if (eet != null) {
            unregisterLifecycleListener(eet);
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(-1438308237, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(188475854);
        Handler handler = this.A0T;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        CategorySearchFragment.super.onDetach();
        AnonymousClass0fD.A09(134978222, A022);
    }

    public final void onResume() {
        int i;
        int A022 = AnonymousClass0fD.A02(-667455641);
        super.onResume();
        if (A0f()) {
            i = 865937908;
        } else {
            A07(this);
            i = -1702985895;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-699954703);
        CategorySearchFragment.super.onViewStateRestored(bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = new Fd1(this, 0);
        }
        AnonymousClass0fD.A09(382873384, A022);
    }
}
