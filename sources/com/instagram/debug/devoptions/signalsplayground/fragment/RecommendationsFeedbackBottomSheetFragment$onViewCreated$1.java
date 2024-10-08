package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.DbW;
import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.form.IgFormField;

public final class RecommendationsFeedbackBottomSheetFragment$onViewCreated$1 implements View.OnClickListener {
    public final /* synthetic */ IgFormField $feedbackForm;
    public final /* synthetic */ RecommendationsFeedbackBottomSheetFragment this$0;

    public RecommendationsFeedbackBottomSheetFragment$onViewCreated$1(IgFormField igFormField, RecommendationsFeedbackBottomSheetFragment recommendationsFeedbackBottomSheetFragment) {
        this.$feedbackForm = igFormField;
        this.this$0 = recommendationsFeedbackBottomSheetFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1604352072);
        this.$feedbackForm.getText().toString();
        BottomSheetFragment requireParentFragment = this.this$0.requireParentFragment();
        0qQ.A0C(requireParentFragment, AnonymousClass000.A00(1633));
        DbW.A1K(requireParentFragment.A02);
        AnonymousClass0fD.A0C(-450172426, A05);
    }
}
