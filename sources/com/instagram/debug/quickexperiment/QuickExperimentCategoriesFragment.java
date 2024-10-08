package com.instagram.debug.quickexperiment;

import X.002;
import X.00k;
import X.00l;
import X.01V;
import X.0nY;
import X.0qQ;
import X.0yN;
import X.11Z;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass1YB;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21258XRd;
import X.C227642jf;
import X.C267704c4;
import X.C358248ab;
import X.C46448DfA;
import X.C47518E6c;
import X.C50989Fmc;
import X.C51968G9o;
import X.C66582MXn;
import X.C66583MXo;
import X.DbT;
import X.DbV;
import X.DbW;
import X.G6X;
import X.G7N;
import X.JTP;
import X.JTS;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.quickexperiment.L;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class QuickExperimentCategoriesFragment extends C47518E6c implements AnonymousClass4DR, G7N, AnonymousClass4DS, G6X {
    public static final Companion Companion = new Object();
    public static final Comparator PARAMETER_COMPARATOR = QuickExperimentCategoriesFragment$Companion$PARAMETER_COMPARATOR$1.INSTANCE;
    public final AnonymousClass0eM adapter$delegate = AnonymousClass1YB.A00(new QuickExperimentCategoriesFragment$adapter$2(this));
    public final List categoryList = AnonymousClass7TE.A1C();
    public List currentExperimentParams;
    public final AnonymousClass0eM isInTestRigMode$delegate = AnonymousClass1YB.A00(new QuickExperimentCategoriesFragment$isInTestRigMode$2(this));
    public String searchQuery = "";
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final AnonymousClass0eM testRigParameterNames$delegate = AnonymousClass1YB.A00(new QuickExperimentCategoriesFragment$testRigParameterNames$2(this));
    public final AnonymousClass0eM typeaheadHeader$delegate = AnonymousClass1YB.A00(new QuickExperimentCategoriesFragment$typeaheadHeader$2(this));
    public final AnonymousClass0eM universeCollapseTracker$delegate = AnonymousClass1YB.A00(QuickExperimentCategoriesFragment$universeCollapseTracker$2.INSTANCE);

    private final boolean matchByToken(String str, String str2) {
        List A18 = DbV.A18(str2, " ");
        List A182 = DbV.A18(str, " ");
        if (!(A18 instanceof Collection) || !A18.isEmpty()) {
            Iterator it = A18.iterator();
            while (it.hasNext()) {
                String A183 = AnonymousClass7TE.A18(it);
                if ((A182 instanceof Collection) && A182.isEmpty()) {
                    return false;
                }
                Iterator it2 = A182.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    if (00l.A0d(AnonymousClass7TE.A18(it2), A183, false)) {
                    }
                }
            }
        }
        return true;
    }

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        if (!AnonymousClass7TF.A1Z(this.isInTestRigMode$delegate)) {
            DbW.A1C(r2, "MetaConfig Categories");
        }
    }

    public String getModuleName() {
        return "quick_experiment_categories";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        checkMobileConfigIdNameMapping();
        getScrollingViewProxy().CEd().setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        getScrollingViewProxy().ENw(getAdapter());
        boolean A1Z = AnonymousClass7TF.A1Z(this.isInTestRigMode$delegate);
        TypeaheadHeader typeaheadHeader = getTypeaheadHeader();
        if (A1Z) {
            typeaheadHeader.setVisibility(8);
            setTestRigParameters();
            return;
        }
        typeaheadHeader.A01 = this;
        JTS.A0x(getTypeaheadHeader());
        if (this.searchQuery.length() > 0) {
            getTypeaheadHeader().A04(this.searchQuery);
        }
        getTypeaheadHeader().A03("Search MetaConfigs");
        getScrollingViewProxy().AAD(new QuickExperimentCategoriesFragment$onViewCreated$1(this));
        setItems(this.categoryList, false);
    }

    public void registerTextViewLogging(TextView textView) {
        0qQ.A0B(textView, 0);
        textView.addTextChangedListener(AnonymousClass4v0.A00(AnonymousClass7TE.A0l(this.session$delegate)));
    }

    public void searchTextChanged(String str) {
        0qQ.A0B(str, 0);
        String str2 = this.searchQuery;
        this.searchQuery = str;
        if (str.length() > 0) {
            getAdapter().setSearching(true);
            0nY.A00().ATE(new QuickExperimentCategoriesFragment$searchTextChanged$1(this, str2));
            return;
        }
        setItems(this.categoryList, false);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final void createUiFromExperimentParams(List list) {
        11Z.A03(new QuickExperimentCategoriesFragment$createUiFromExperimentParams$1(this, list));
    }

    /* access modifiers changed from: private */
    public final QuickExperimentCategoriesAdapter getAdapter() {
        return (QuickExperimentCategoriesAdapter) this.adapter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Set getTestRigParameterNames() {
        return (Set) this.testRigParameterNames$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final TypeaheadHeader getTypeaheadHeader() {
        return (TypeaheadHeader) this.typeaheadHeader$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final UniverseCollapseTracker getUniverseCollapseTracker() {
        return (UniverseCollapseTracker) this.universeCollapseTracker$delegate.getValue();
    }

    private final boolean isInTestRigMode() {
        return AnonymousClass7TF.A1Z(this.isInTestRigMode$delegate);
    }

    /* access modifiers changed from: private */
    public final void refreshUi() {
        List list = this.currentExperimentParams;
        if (list != null) {
            createUiFromExperimentParams(list);
        }
    }

    public boolean isElevated() {
        return AnonymousClass7TF.A1Z(this.isInTestRigMode$delegate);
    }

    private final void checkMobileConfigIdNameMapping() {
        C358248ab A0U;
        C267704c4 paramsMap = QuickExperimentHelper.getParamsMap();
        if (paramsMap == null) {
            A0U = DbW.A0U(this);
            A0U.A0q("Overrides won't work due to failed to load MobileConfig params map.");
            A0U.A0c((DialogInterface.OnClickListener) null, "OK");
        } else {
            double namedParamsRatio = QuickExperimentHelper.getNamedParamsRatio(paramsMap);
            if (namedParamsRatio < 0.5d) {
                A0U = DbW.A0U(this);
                A0U.A0q(StringFormatUtil.formatStrLocaleSafe("Overrides would be flaky due to only loaded config names for %.1f%% of %d params.\n\nSuggest to go parent menu and click \"Force user MetaConfig sync\", and then come back - or just click the button below.", Double.valueOf(namedParamsRatio * 100.0d), C51968G9o.A0t(paramsMap.A03)));
                A0U.A0c((DialogInterface.OnClickListener) null, "OK");
                A0U.A0a(new QuickExperimentCategoriesFragment$checkMobileConfigIdNameMapping$1(this), "Force sync and restart app");
            } else {
                return;
            }
        }
        DbT.A1V(A0U);
    }

    /* access modifiers changed from: private */
    public final void filterExperimentsList(String str, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String A0w = C66582MXn.A0w(str);
        List<0yN> list = this.currentExperimentParams;
        if (!z || list == null) {
            list = QuickExperimentHelper.getAllExperiments();
        }
        for (0yN r1 : list) {
            if (!str.equals(this.searchQuery)) {
                return;
            }
            if (searchQueryMatchesExperiment(A0w, r1)) {
                A1C.add(r1);
            }
        }
        01V.A1D(A1C, PARAMETER_COMPARATOR);
        createUiFromExperimentParams(A1C);
    }

    private final boolean hasMatchingTestRigConfigAndUniverse(0yN r7) {
        Set testRigParameterNames = getTestRigParameterNames();
        if (!(testRigParameterNames instanceof Collection) || !testRigParameterNames.isEmpty()) {
            Iterator it = testRigParameterNames.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                String A0w = C66582MXn.A0w(002.A0T(r7.universeName, r7.name, '.'));
                0qQ.A0A(A18);
                if (00l.A0d(A0w, A18, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean searchQueryMatchesExperiment(String str, 0yN r10) {
        if (OverlayConfigHelper.isOverlayConfig(r10)) {
            return false;
        }
        String niceUniverseName = QuickExperimentHelper.getNiceUniverseName(r10.universeName);
        0qQ.A07(niceUniverseName);
        String A0w = C66582MXn.A0w(niceUniverseName);
        if (!00l.A0d(A0w, str, false)) {
            String A0w2 = C66582MXn.A0w(r10.name);
            String replace = A0w2.replace('_', ' ');
            0qQ.A07(replace);
            if (!00l.A0d(replace, str, false)) {
                String A0T = 002.A0T(A0w, replace, ' ');
                if (!00l.A0d(A0T, str, false) && (!L.ig_android_internal_launcher_token_matching.enabled.getAndExpose(AnonymousClass7TE.A0l(this.session$delegate)).booleanValue() || !matchByToken(A0T, str))) {
                    String replace2 = A0w.replace(' ', '_');
                    0qQ.A07(replace2);
                    return 00l.A0d(002.A0T(replace2, A0w2, '_'), str, false);
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void setItems(List list, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!z) {
            isInTestRigMode();
            C46448DfA dfA = new C46448DfA((CharSequence) "Recent Items");
            dfA.A02 = JTP.A02(getContext(), requireContext(), R.attr.igds_color_secondary_background);
            A1C.add(dfA);
            List recentExperimentParameters = RecentQuickExperimentManager.getRecentExperimentParameters();
            01V.A1D(recentExperimentParameters, PARAMETER_COMPARATOR);
            A1C.addAll(QuickExperimentHelper.setupMenuItems(this, AnonymousClass7TE.A0l(this.session$delegate), (UniverseCollapseTracker) null, (Runnable) null, recentExperimentParameters, getAdapter(), false, true));
            C46448DfA dfA2 = new C46448DfA((CharSequence) "MetaConfig Categories");
            dfA2.A02 = JTP.A02(getContext(), requireContext(), R.attr.igds_color_secondary_background);
            C50989Fmc.A01(C66583MXo.A07(this, dfA2, A1C), new QuickExperimentCategoriesFragment$setItems$3(this), "Show all overridden MetaConfigs", A1C);
        }
        A1C.addAll(list);
        getAdapter().setMenuItemList(A1C);
    }

    private final void setTestRigParameters() {
        List allExperiments = QuickExperimentHelper.getAllExperiments();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = allExperiments.iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                0yN r1 = (0yN) next;
                0qQ.A0A(r1);
                if (!OverlayConfigHelper.isOverlayConfig(r1) && hasMatchingTestRigConfigAndUniverse(r1)) {
                    A1C.add(next);
                }
            } else {
                List A0g = 00k.A0g(A1C, PARAMETER_COMPARATOR);
                this.categoryList.clear();
                this.categoryList.addAll(QuickExperimentHelper.setupMenuItems(this, AnonymousClass7TE.A0l(this.session$delegate), getUniverseCollapseTracker(), new QuickExperimentCategoriesFragment$setTestRigParameters$1(this), A0g, getAdapter(), false, false));
                getAdapter().setMenuItemList(this.categoryList);
                return;
            }
        }
    }

    public View getRowView() {
        return getTypeaheadHeader();
    }

    public boolean onBackPressed() {
        getTypeaheadHeader().A01();
        return false;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1385822779);
        super.onCreate(bundle);
        for (C21258XRd xRd : C21258XRd.values()) {
            this.categoryList.add(new C50989Fmc(requireContext(), (View.OnClickListener) new QuickExperimentCategoriesFragment$onCreate$1(this, xRd), (CharSequence) xRd.A01));
        }
        AnonymousClass0fD.A09(1858468086, A02);
    }

    private final void mayBeAddLauncherTestRigPromo(List list) {
        isInTestRigMode();
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
