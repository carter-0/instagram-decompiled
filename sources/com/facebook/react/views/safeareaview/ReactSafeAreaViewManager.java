package com.facebook.react.views.safeareaview;

import X.0qQ;
import X.C17763VfZ;
import X.C19068WIz;
import X.C20831X0g;
import X.C7365Q8i;
import X.C9550Rcn;
import X.DbY;
import X.QZK;
import X.QZL;
import X.X62;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;

@ReactModule(name = "RCTSafeAreaView")
public final class ReactSafeAreaViewManager extends ViewGroupManager {
    public static final C9550Rcn Companion = new Object();
    public static final String REACT_CLASS = "RCTSafeAreaView";
    public final X62 delegate = new C19068WIz(this);

    public ReactSafeAreaViewManager() {
        super((QZK) null);
    }

    public C7365Q8i createViewInstance(QZL qzl) {
        0qQ.A0B(qzl, 0);
        return new C7365Q8i(qzl);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    public X62 getDelegate() {
        return this.delegate;
    }

    public Class getShadowNodeClass() {
        return ReactSafeAreaViewShadowNode.class;
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, C17763VfZ vfZ, C20831X0g x0g) {
        C7365Q8i q8i = (C7365Q8i) view;
        DbY.A1S(q8i, x0g);
        q8i.A00 = x0g;
        return null;
    }

    public Object updateState(C7365Q8i q8i, C17763VfZ vfZ, C20831X0g x0g) {
        DbY.A1S(q8i, x0g);
        q8i.A00 = x0g;
        return null;
    }
}
