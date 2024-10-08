package com.instagram.debug.devoptions.debughead.data.delegates;

import X.C21250XQv;
import X.Yef;
import X.Yeg;
import java.util.Collection;

public interface MemoryLeakDelegate {
    void onHeapAnalysisFailure(Yef yef);

    void onHeapAnalysisProgress(C21250XQv xQv);

    void onHeapAnalysisSuccess(Yeg yeg);

    void onLeaksDetected(Collection collection);
}
