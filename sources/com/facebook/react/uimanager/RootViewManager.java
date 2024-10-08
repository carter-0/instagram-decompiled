package com.facebook.react.uimanager;

import X.0qQ;
import X.QZK;
import X.QZL;
import X.V6E;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class RootViewManager extends ViewGroupManager {
    public static final V6E Companion = new Object();
    public static final String REACT_CLASS = "RootView";

    public RootViewManager() {
        super((QZK) null);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public ViewGroup createViewInstance(QZL qzl) {
        0qQ.A0B(qzl, 0);
        return new FrameLayout(qzl);
    }
}
