package com.instagram.debug.devoptions.vtd.analysis;

import android.view.View;
import java.util.List;

public interface VtdTreeAnalyzer {
    void onAttach(View view, List list);

    void onDetach(View view, List list);

    void onLayout(View view, List list);
}
