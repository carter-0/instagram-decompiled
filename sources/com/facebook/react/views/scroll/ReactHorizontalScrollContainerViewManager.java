package com.facebook.react.views.scroll;

import X.V6G;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.views.view.ReactViewManager;

@ReactModule(name = "AndroidHorizontalScrollContentView")
public final class ReactHorizontalScrollContainerViewManager extends ReactViewManager {
    public static final V6G Companion = new Object();
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    public String getName() {
        return REACT_CLASS;
    }
}
