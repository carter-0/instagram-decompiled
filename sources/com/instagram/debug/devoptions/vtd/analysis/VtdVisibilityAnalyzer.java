package com.instagram.debug.devoptions.vtd.analysis;

import X.0qQ;
import X.C51966G9m;
import X.C66580MXl;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.ViewStubCompat;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class VtdVisibilityAnalyzer implements VtdTreeAnalyzer {
    public final Set loggedViews = new LinkedHashSet();
    public final VtdLogger logger;
    public final Map viewVisibilityMap = new LinkedHashMap();

    public VtdVisibilityAnalyzer(VtdLogger vtdLogger) {
        0qQ.A0B(vtdLogger, 1);
        this.logger = vtdLogger;
    }

    public void onAttach(View view, List list) {
        0qQ.A0B(view, 0);
        if (isAnalyzable(view)) {
            C66580MXl.A1T(view, this.viewVisibilityMap, view.getVisibility());
            checkVisibility(view);
        }
    }

    public void onDetach(View view, List list) {
        0qQ.A0B(view, 0);
        if (isAnalyzable(view)) {
            this.viewVisibilityMap.remove(view);
        }
    }

    public void onLayout(View view, List list) {
        0qQ.A0B(view, 0);
        if (isAnalyzable(view)) {
            Number A14 = C51966G9m.A14(view, this.viewVisibilityMap);
            int visibility = view.getVisibility();
            if (A14 == null || visibility != A14.intValue()) {
                C66580MXl.A1T(view, this.viewVisibilityMap, view.getVisibility());
                checkVisibility(view);
            }
        }
    }

    private final boolean isAnalyzable(View view) {
        if ((view instanceof ViewStub) || (view instanceof ViewStubCompat)) {
            return false;
        }
        return true;
    }

    private final void checkVisibility(View view) {
        if (view.getVisibility() != 0 && !this.loggedViews.contains(view)) {
            this.loggedViews.add(view);
            this.logger.logHidden(view);
        }
    }
}
