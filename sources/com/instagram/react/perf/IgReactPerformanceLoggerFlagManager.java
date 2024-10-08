package com.instagram.react.perf;

import X.0lg;
import X.C7843QbR;
import X.C9847RiJ;
import X.QZK;
import X.QZL;
import com.facebook.react.uimanager.ViewGroupManager;

public class IgReactPerformanceLoggerFlagManager extends ViewGroupManager {
    public static final String REACT_CLASS = "ReactPerformanceLoggerFlag";
    public final C9847RiJ mReactPerformanceFlagListener;
    public final 0lg mSession;

    public IgReactPerformanceLoggerFlagManager(C9847RiJ riJ, 0lg r3) {
        super((QZK) null);
        this.mReactPerformanceFlagListener = riJ;
        this.mSession = r3;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public C7843QbR createViewInstance(QZL qzl) {
        return new C7843QbR(qzl, this.mSession, this.mReactPerformanceFlagListener);
    }
}
