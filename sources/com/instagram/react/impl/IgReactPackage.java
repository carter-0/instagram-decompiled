package com.instagram.react.impl;

import X.AnonymousClass0wW;
import X.C20836X0l;
import X.C20837X0m;
import X.C9847RiJ;
import X.QZK;
import com.facebook.catalyst.views.art.ARTGroupViewManager;
import com.facebook.catalyst.views.art.ARTShapeViewManager;
import com.facebook.catalyst.views.art.ARTTextViewManager;
import com.facebook.catalyst.views.gradient.ReactAxialGradientManager;
import com.facebook.fbreact.views.picker.ReactDialogPickerManager;
import com.facebook.fbreact.views.picker.ReactDropdownPickerManager;
import com.facebook.fbreact.views.slider.ReactSliderManager;
import com.facebook.react.LazyReactPackage;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.react.perf.IgReactPerformanceLoggerFlagManager;
import java.util.Arrays;
import java.util.List;

public final class IgReactPackage extends LazyReactPackage {
    public final AnonymousClass0wW A00;
    public final C9847RiJ A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Tcx] */
    public final List ANL(QZK qzk) {
        ARTGroupViewManager aRTGroupViewManager = new ARTGroupViewManager();
        ARTShapeViewManager aRTShapeViewManager = new ARTShapeViewManager();
        ARTTextViewManager aRTTextViewManager = new ARTTextViewManager();
        ViewManager viewManager = new ViewManager((QZK) null);
        ViewManager viewManager2 = new ViewManager((QZK) null);
        ViewManager viewManager3 = new ViewManager((QZK) null);
        ReactAxialGradientManager reactAxialGradientManager = new ReactAxialGradientManager();
        ReactViewManager reactViewManager = new ReactViewManager();
        ReactHorizontalScrollViewManager reactHorizontalScrollViewManager = new ReactHorizontalScrollViewManager((C20836X0l) null);
        ReactModalHostManager reactModalHostManager = new ReactModalHostManager();
        ReactProgressBarViewManager reactProgressBarViewManager = new ReactProgressBarViewManager();
        ViewManager viewManager4 = new ViewManager();
        ReactScrollViewManager reactScrollViewManager = new ReactScrollViewManager((C20836X0l) null);
        ReactSliderManager reactSliderManager = new ReactSliderManager();
        ViewManager viewManager5 = new ViewManager((QZK) null);
        ViewManager viewManager6 = new ViewManager((QZK) null);
        ReactTextViewManager reactTextViewManager = new ReactTextViewManager((C20837X0m) null);
        ReactViewManager reactViewManager2 = new ReactViewManager();
        ReactWebViewManager reactWebViewManager = new ReactWebViewManager(new Object(), (List) null);
        ViewManager viewManager7 = new ViewManager((QZK) null);
        ReactDropdownPickerManager reactDropdownPickerManager = new ReactDropdownPickerManager();
        ReactDialogPickerManager reactDialogPickerManager = new ReactDialogPickerManager();
        SwipeRefreshLayoutManager swipeRefreshLayoutManager = new SwipeRefreshLayoutManager();
        IgReactPerformanceLoggerFlagManager igReactPerformanceLoggerFlagManager = new IgReactPerformanceLoggerFlagManager(this.A01, this.A00);
        return Arrays.asList(new ViewManager[]{aRTGroupViewManager, aRTShapeViewManager, aRTTextViewManager, viewManager, viewManager2, viewManager3, reactAxialGradientManager, reactViewManager, reactHorizontalScrollViewManager, reactModalHostManager, reactProgressBarViewManager, viewManager4, reactScrollViewManager, reactSliderManager, viewManager5, viewManager6, reactTextViewManager, reactViewManager2, reactWebViewManager, viewManager7, reactDropdownPickerManager, reactDialogPickerManager, swipeRefreshLayoutManager, igReactPerformanceLoggerFlagManager, new ViewManager((QZK) null), new ReactSafeAreaViewManager()});
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RiJ, java.lang.Object] */
    public IgReactPackage(AnonymousClass0wW r2) {
        this.A00 = r2;
    }
}
