package com.instagram.debug.devoptions.zero;

import X.0qQ;
import X.AnonymousClass00P;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.instagram.common.ui.base.IgEditText;

public final class ZeroFeatureOverrideFragment$onViewCreated$1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ InputMethodManager $inputMethodManager;
    public final /* synthetic */ ZeroFeatureOverrideFragment this$0;

    public ZeroFeatureOverrideFragment$onViewCreated$1(ZeroFeatureOverrideFragment zeroFeatureOverrideFragment, InputMethodManager inputMethodManager) {
        this.this$0 = zeroFeatureOverrideFragment;
        this.$inputMethodManager = inputMethodManager;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            CharSequence text = textView.getText();
            if (!(text == null || text.length() == 0)) {
                this.this$0.getEnabledFeaturesStore().add(textView.getText().toString());
                this.this$0.getFeaturesAdapter().notifyItemInserted(this.this$0.getEnabledFeaturesStore().features.size());
            }
            InputMethodManager inputMethodManager = this.$inputMethodManager;
            IgEditText igEditText = this.this$0.featureText;
            if (igEditText != null) {
                inputMethodManager.hideSoftInputFromWindow(igEditText.getWindowToken(), 0);
                IgEditText igEditText2 = this.this$0.featureText;
                if (igEditText2 != null) {
                    igEditText2.clearFocus();
                    IgEditText igEditText3 = this.this$0.featureText;
                    if (igEditText3 != null) {
                        igEditText3.getText().clear();
                    }
                }
            }
            0qQ.A0F("featureText");
            throw AnonymousClass00P.createAndThrow();
        }
        return true;
    }
}
