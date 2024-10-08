package com.instagram.debug.devoptions.vtd.analysis;

import X.0qQ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.debug.devoptions.vtd.output.VtdIssueCategory;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class VtdLinearLayoutAnalyzer implements VtdTreeAnalyzer {
    public final Set loggedViews = new LinkedHashSet();
    public final VtdLogger logger;

    public VtdLinearLayoutAnalyzer(VtdLogger vtdLogger) {
        0qQ.A0B(vtdLogger, 1);
        this.logger = vtdLogger;
    }

    public void onAttach(View view, List list) {
    }

    public void onDetach(View view, List list) {
    }

    public void onLayout(View view, List list) {
        0qQ.A0B(view, 0);
        if (view instanceof LinearLayout) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof LinearLayout.LayoutParams) && ((LinearLayout.LayoutParams) layoutParams).weight > 0.0f && !this.loggedViews.contains(view)) {
                this.loggedViews.add(view);
                this.logger.logVTD(VtdIssueCategory.LINEAR_LAYOUT.getTag(), view);
            }
        }
    }
}
