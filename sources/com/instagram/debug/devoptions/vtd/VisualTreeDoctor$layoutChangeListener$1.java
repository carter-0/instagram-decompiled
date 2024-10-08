package com.instagram.debug.devoptions.vtd;

import X.0qQ;
import X.C66580MXl;
import android.view.View;
import com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer;
import com.instagram.debug.devoptions.vtd.core.VtdBreadCrumb;
import com.instagram.debug.devoptions.vtd.core.VtdLifecycleEvent;
import java.util.Calendar;
import java.util.List;

public final class VisualTreeDoctor$layoutChangeListener$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ VisualTreeDoctor this$0;

    public VisualTreeDoctor$layoutChangeListener$1(VisualTreeDoctor visualTreeDoctor) {
        this.this$0 = visualTreeDoctor;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        List A13 = C66580MXl.A13(view, this.this$0.breadCrumbs);
        if (A13 != null) {
            VisualTreeDoctor visualTreeDoctor = this.this$0;
            A13.add(new VtdBreadCrumb(Calendar.getInstance().getTimeInMillis(), VtdLifecycleEvent.LAYOUT));
            for (VtdTreeAnalyzer onLayout : visualTreeDoctor.analyzers) {
                0qQ.A0A(view);
                onLayout.onLayout(view, A13);
            }
        }
    }
}
