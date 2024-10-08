package com.instagram.ui.widget.expanding;

import X.C16082Uo9;
import X.C249383je;
import X.W4P;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.List;

public class ExpandingListView extends RefreshableListView {
    public boolean A00;
    public boolean A01;
    public final List A02 = new ArrayList();
    public final C249383je A03 = new C16082Uo9(this, 1);

    public static ValueAnimator A00(View view, View view2, float f, float f2, int i) {
        View view3 = view;
        int top = view.getTop();
        int bottom = view.getBottom();
        int bottom2 = view2.getBottom();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new W4P(view2, view3, f, f2, bottom2, i, top, bottom));
        return ofFloat;
    }

    public C249383je getOnScrollListener() {
        return this.A03;
    }

    public void setExpandingDisabledOnScroll(boolean z) {
        this.A00 = z;
    }

    public void setExpandingEnabled(boolean z) {
        this.A01 = z;
    }

    public ExpandingListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A01) {
            List<View> list = this.A02;
            if (!list.isEmpty()) {
                for (View view : list) {
                    canvas.translate(0.0f, (float) view.getTop());
                    view.draw(canvas);
                    canvas.translate(0.0f, (float) (-view.getTop()));
                }
            }
        }
    }

    public ExpandingListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandingListView(Context context) {
        super(context);
    }
}
