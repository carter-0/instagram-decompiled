package com.instagram.debug.devoptions.vtd.analysis;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import android.view.View;
import com.instagram.debug.devoptions.vtd.core.VtdBreadCrumb;
import com.instagram.debug.devoptions.vtd.core.VtdLifecycleEvent;
import com.instagram.debug.devoptions.vtd.output.VtdIssueCategory;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class VtdMultipleLayoutPassAnalyzer implements VtdTreeAnalyzer {
    public static final Companion Companion = new Object();
    public static final long LAYOUT_TIME_SPAN_THRESHOLD_MSEC = 500;
    public final Set loggedViews = new LinkedHashSet();
    public final VtdLogger logger;

    public VtdMultipleLayoutPassAnalyzer(VtdLogger vtdLogger) {
        0qQ.A0B(vtdLogger, 1);
        this.logger = vtdLogger;
    }

    private final boolean isWithinThreshold(long j, long j2) {
        return AnonymousClass7TF.A1R(((j - j2) > 500 ? 1 : ((j - j2) == 500 ? 0 : -1)));
    }

    public void onAttach(View view, List list) {
    }

    public void onDetach(View view, List list) {
    }

    private final boolean hasMultipleLayoutPasses(List list) {
        Iterator it = list.iterator();
        VtdBreadCrumb vtdBreadCrumb = null;
        while (it.hasNext()) {
            VtdBreadCrumb vtdBreadCrumb2 = (VtdBreadCrumb) it.next();
            if (vtdBreadCrumb2.lifecycleEvent == VtdLifecycleEvent.LAYOUT) {
                if (vtdBreadCrumb == null) {
                    vtdBreadCrumb = vtdBreadCrumb2;
                } else if (AnonymousClass7TF.A1R(((vtdBreadCrumb2.timestamp - vtdBreadCrumb.timestamp) > 500 ? 1 : ((vtdBreadCrumb2.timestamp - vtdBreadCrumb.timestamp) == 500 ? 0 : -1)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onLayout(View view, List list) {
        AnonymousClass7TG.A1N(view, list);
        if (!this.loggedViews.contains(view) && hasMultipleLayoutPasses(list)) {
            this.logger.logVTD(VtdIssueCategory.MULTI_LAYOUT.getTag(), view);
            this.loggedViews.add(view);
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
