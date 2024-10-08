package com.instagram.debug.devoptions.vtd.analysis;

import X.0qQ;
import android.view.View;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.List;

public final class VtdViewAttachedLogger implements VtdTreeAnalyzer {
    public final VtdLogger logger;

    public VtdViewAttachedLogger(VtdLogger vtdLogger) {
        0qQ.A0B(vtdLogger, 1);
        this.logger = vtdLogger;
    }

    public void onAttach(View view, List list) {
        0qQ.A0B(view, 0);
        this.logger.logAttached(view);
    }

    public void onDetach(View view, List list) {
    }

    public void onLayout(View view, List list) {
    }
}
