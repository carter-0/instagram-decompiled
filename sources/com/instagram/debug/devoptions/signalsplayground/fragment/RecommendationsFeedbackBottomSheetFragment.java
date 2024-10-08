package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C252063oV;
import X.C273494mf;
import X.DbT;
import X.EVS;
import X.W0n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.form.IgFormField;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RecommendationsFeedbackBottomSheetFragment extends AnonymousClass4DH implements C273494mf {
    public static final int $stable = 8;
    public static final Companion Companion = new Object();
    public final String moduleName = "recommendations_feedback_bottom_sheet";
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    public final class Companion {
        public final RecommendationsFeedbackBottomSheetFragment newInstance() {
            return new RecommendationsFeedbackBottomSheetFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public /* synthetic */ void onBottomSheetClosed() {
    }

    public /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public /* synthetic */ void onDragStarted() {
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgFormField igFormField = (IgFormField) AnonymousClass7TE.A0b(view, R.id.feedback_form);
        igFormField.setInputType(131073);
        W0n.A00(igFormField);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TE.A0b(view, R.id.submit_feedback_cta);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new RecommendationsFeedbackBottomSheetFragment$onViewCreated$1(igFormField, this));
        igFormField.A0G(new RecommendationsFeedbackBottomSheetFragment$onViewCreated$2(igdsBottomButtonLayout));
    }

    public /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public /* synthetic */ boolean collapseToPartialStateOnClickXButton() {
        return false;
    }

    public /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1098530077);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_inspiration_signals_playground_recommendations_feedback_bottom_sheet, false);
        AnonymousClass0fD.A09(-796734110, A02);
        return A0D;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
