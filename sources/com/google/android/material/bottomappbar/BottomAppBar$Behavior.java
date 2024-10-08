package com.google.android.material.bottomappbar;

import X.WBX;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public WeakReference A00;
    public final Rect A01 = new Rect();
    public final View.OnLayoutChangeListener A02 = new WBX(this, 1);

    public final /* bridge */ /* synthetic */ boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = new WeakReference((Object) null);
        throw new NullPointerException("findDependentView");
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomAppBar$Behavior() {
    }
}
