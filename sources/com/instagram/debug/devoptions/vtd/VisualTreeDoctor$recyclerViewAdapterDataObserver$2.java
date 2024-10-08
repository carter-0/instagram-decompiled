package com.instagram.debug.devoptions.vtd;

import X.03J;
import X.0sP;
import X.C51969G9p;
import X.C60340gF;
import android.view.View;

public final /* synthetic */ class VisualTreeDoctor$recyclerViewAdapterDataObserver$2 extends 03J implements 0sP {
    public VisualTreeDoctor$recyclerViewAdapterDataObserver$2(Object obj) {
        super(1, obj, VisualTreeDoctor.class, "detachFromView", "detachFromView(Landroid/view/View;)V", 0);
    }

    public final void invoke(View view) {
        ((VisualTreeDoctor) C51969G9p.A0t(view, this)).detachFromView(view);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C60340gF.A00;
    }
}
