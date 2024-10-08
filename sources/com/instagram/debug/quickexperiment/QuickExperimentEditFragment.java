package com.instagram.debug.quickexperiment;

import X.002;
import X.0yN;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21258XRd;
import X.C47518E6c;
import X.DbX;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickExperimentEditFragment extends C47518E6c implements AnonymousClass4DS {
    public final ExperimentParameterListGenerator mExperimentParameterListGenerator;
    public UserSession mSession;
    public final boolean mShowSeeAllInUniverse;
    public final String mTitle;

    public interface ExperimentParameterListGenerator {
        List createList();
    }

    public String getModuleName() {
        return "quick_experiment_edit";
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List createList = this.mExperimentParameterListGenerator.createList();
        Collections.sort(createList, new QuickExperimentEditFragment$$ExternalSyntheticLambda2());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            QuickExperimentEditAdapter quickExperimentEditAdapter = new QuickExperimentEditAdapter(activity);
            getScrollingViewProxy().ENw(quickExperimentEditAdapter);
            quickExperimentEditAdapter.setMenuItemList(QuickExperimentHelper.setupMenuItems(this, this.mSession, (UniverseCollapseTracker) null, (Runnable) null, createList, quickExperimentEditAdapter, false, this.mShowSeeAllInUniverse));
        }
    }

    public static QuickExperimentEditFragment createForAllOverrides(UserSession userSession) {
        return new QuickExperimentEditFragment("MetaConfig: Overrides", true, new QuickExperimentEditFragment$$ExternalSyntheticLambda0(userSession));
    }

    public static QuickExperimentEditFragment createWithExperimentCategory(C21258XRd xRd) {
        return new QuickExperimentEditFragment(002.A0R("MetaConfig: ", xRd.A01), true, new QuickExperimentEditFragment$$ExternalSyntheticLambda1(xRd));
    }

    public static QuickExperimentEditFragment createWithUniverse(String str) {
        return new QuickExperimentEditFragment("MetaConfig: Launcher", false, new QuickExperimentEditFragment$$ExternalSyntheticLambda3(str));
    }

    public void configureActionBar(2da r2) {
        r2.setTitle(this.mTitle);
        r2.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
    }

    public AnonymousClass0wW getSession() {
        return this.mSession;
    }

    public QuickExperimentEditFragment(String str, boolean z, ExperimentParameterListGenerator experimentParameterListGenerator) {
        this.mTitle = str;
        this.mShowSeeAllInUniverse = z;
        this.mExperimentParameterListGenerator = experimentParameterListGenerator;
    }

    public static /* synthetic */ List lambda$createWithExperimentCategory$1(C21258XRd xRd) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (0yN r1 : QuickExperimentHelper.getAllExperiments()) {
            if (QuickExperimentHelper.getCategory(r1) == xRd && !OverlayConfigHelper.isOverlayConfig(r1)) {
                A1C.add(r1);
            }
        }
        return A1C;
    }

    public static /* synthetic */ List lambda$createWithUniverse$2(String str) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (0yN r1 : QuickExperimentHelper.getAllExperiments()) {
            if (str.equals(r1.universeName) && !OverlayConfigHelper.isOverlayConfig(r1)) {
                A1C.add(r1);
            }
        }
        return A1C;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1234508333);
        super.onCreate(bundle);
        this.mSession = DbX.A0U(this);
        AnonymousClass0fD.A09(1802868018, A02);
    }
}
