package com.instagram.ui.widget.search;

import X.X5G;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

public class ImeBackButtonHandlerFrameLayout extends FrameLayout {
    public X5G A00;

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        X5G x5g = this.A00;
        if (x5g != null) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (!((SearchController) x5g).A06 && keyDispatcherState != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    return x5g.onBackPressed();
                }
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setBackListener(X5G x5g) {
        this.A00 = x5g;
    }

    public ImeBackButtonHandlerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ImeBackButtonHandlerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImeBackButtonHandlerFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
