package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0qQ;
import X.AnonymousClass7TF;
import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class RecommendationsFeedbackBottomSheetFragment$onViewCreated$2 implements TextWatcher {
    public final /* synthetic */ IgdsBottomButtonLayout $submitFeedbackCta;

    public void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        this.$submitFeedbackCta.setPrimaryButtonEnabled(AnonymousClass7TF.A1R(editable.length()));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public RecommendationsFeedbackBottomSheetFragment$onViewCreated$2(IgdsBottomButtonLayout igdsBottomButtonLayout) {
        this.$submitFeedbackCta = igdsBottomButtonLayout;
    }
}
