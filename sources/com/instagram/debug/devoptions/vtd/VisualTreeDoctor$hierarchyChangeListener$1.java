package com.instagram.debug.devoptions.vtd;

import android.view.View;
import android.view.ViewGroup;

public final class VisualTreeDoctor$hierarchyChangeListener$1 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ VisualTreeDoctor this$0;

    public VisualTreeDoctor$hierarchyChangeListener$1(VisualTreeDoctor visualTreeDoctor) {
        this.this$0 = visualTreeDoctor;
    }

    public void onChildViewAdded(View view, View view2) {
        if (view2 != null) {
            this.this$0.attachToView(view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        if (view2 != null) {
            this.this$0.detachFromView(view2);
        }
    }
}
