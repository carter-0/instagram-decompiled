package com.instagram.react.views.inbox;

import X.0qQ;
import X.0s1;
import X.1as;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.C11470SaY;
import X.C273624mt;
import X.C66581MXm;
import X.C9848RiK;
import X.DbW;
import X.Pxe;
import X.QZK;
import X.QZL;
import X.SN3;
import android.view.Choreographer;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.SimpleViewManager;

public final class ReactInboxManager extends SimpleViewManager {
    @Deprecated
    public static final String ANALYTICS_MODULE_NAME = "vr-react";
    public static final C9848RiK Companion = new Object();
    @Deprecated
    public static final String REACT_CLASS = "DirectInbox";
    public QZL context;

    public ReactInboxManager() {
        super((QZK) null);
    }

    public FrameLayout createViewInstance(QZL qzl) {
        0qQ.A0B(qzl, 0);
        this.context = qzl;
        C273624mt A09 = 1as.A04.A02.A09("on_launch_direct_inbox", Pxe.A0a(this).A05, true);
        QZL qzl2 = this.context;
        if (qzl2 == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        FragmentActivity A00 = qzl2.A00();
        0qQ.A0C(A00, AnonymousClass000.A00(22));
        0s1 A0D = DbW.A0D(A00);
        A0D.A0B(A09, REACT_CLASS);
        A0D.A0K();
        FrameLayout frameLayout = new FrameLayout(qzl);
        C66581MXm.A1A(frameLayout, -1);
        frameLayout.addView(A09.mView, -1, -1);
        setupLayout(frameLayout);
        return frameLayout;
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: private */
    public final void manuallyLayoutChildren(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), SN3.MAX_SIGNED_POWER_OF_TWO));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final void setupLayout(View view) {
        Choreographer.getInstance().postFrameCallback(new C11470SaY(1, this, view));
    }
}
