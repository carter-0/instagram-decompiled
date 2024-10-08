package com.facebook.react.views.modal;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C12225Spe;
import X.C17763VfZ;
import X.C19068WIz;
import X.C20831X0g;
import X.C20877X2e;
import X.C7366Q8j;
import X.C9549Rcm;
import X.DbY;
import X.Q6H;
import X.QZK;
import X.QZL;
import X.SVL;
import X.X62;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;

@ReactModule(name = "RCTModalHostView")
public final class ReactModalHostManager extends ViewGroupManager {
    public static final C9549Rcm Companion = new Object();
    public static final String REACT_CLASS = "RCTModalHostView";
    public final X62 delegate = new C19068WIz(this);

    public ReactModalHostManager() {
        super((QZK) null);
    }

    public C7366Q8j createViewInstance(QZL qzl) {
        0qQ.A0B(qzl, 0);
        return new C7366Q8j(qzl);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void onAfterUpdateTransaction(C7366Q8j q8j) {
        0qQ.A0B(q8j, 0);
        super.onAfterUpdateTransaction(q8j);
        q8j.A02();
    }

    public void onDropViewInstance(C7366Q8j q8j) {
        0qQ.A0B(q8j, 0);
        super.onDropViewInstance(q8j);
        Context context = q8j.getContext();
        0qQ.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((Q6H) context).A0A(q8j);
        C7366Q8j.A01(q8j);
    }

    @ReactProp(name = "animated")
    public void setAnimated(C7366Q8j q8j, boolean z) {
    }

    @ReactProp(name = "animationType")
    public void setAnimationType(C7366Q8j q8j, String str) {
        0qQ.A0B(q8j, 0);
        if (str != null) {
            q8j.setAnimationType(str);
        }
    }

    @ReactProp(name = "hardwareAccelerated")
    public void setHardwareAccelerated(C7366Q8j q8j, boolean z) {
        0qQ.A0B(q8j, 0);
        q8j.setHardwareAccelerated(z);
    }

    @ReactProp(name = "identifier")
    public void setIdentifier(C7366Q8j q8j, int i) {
    }

    @ReactProp(name = "presentationStyle")
    public void setPresentationStyle(C7366Q8j q8j, String str) {
    }

    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C7366Q8j q8j, boolean z) {
        0qQ.A0B(q8j, 0);
        q8j.setStatusBarTranslucent(z);
    }

    @ReactProp(name = "supportedOrientations")
    public void setSupportedOrientations(C7366Q8j q8j, ReadableArray readableArray) {
    }

    @ReactProp(name = "transparent")
    public void setTransparent(C7366Q8j q8j, boolean z) {
        0qQ.A0B(q8j, 0);
        q8j.A03 = z;
    }

    @ReactProp(name = "visible")
    public void setVisible(C7366Q8j q8j, boolean z) {
    }

    public X62 getDelegate() {
        return this.delegate;
    }

    public /* bridge */ /* synthetic */ Object updateState(View view, C17763VfZ vfZ, C20831X0g x0g) {
        C7366Q8j q8j = (C7366Q8j) view;
        DbY.A1S(q8j, x0g);
        q8j.setStateWrapper(x0g);
        return null;
    }

    public void addEventEmitters(QZL qzl, C7366Q8j q8j) {
        AnonymousClass7TG.A1N(qzl, q8j);
        C20877X2e A05 = UIManagerHelper.A05(qzl, q8j.getId());
        if (A05 != null) {
            q8j.A02 = new C12225Spe(qzl, A05, q8j);
            q8j.A01 = new SVL(0, qzl, A05, q8j);
            q8j.setEventDispatcher(A05);
        }
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.put("topRequestClose", AnonymousClass7TF.A0w("registrationName", "onRequestClose"));
        exportedCustomDirectEventTypeConstants.put("topShow", AnonymousClass7TF.A0w("registrationName", "onShow"));
        exportedCustomDirectEventTypeConstants.put("topDismiss", AnonymousClass7TF.A0w("registrationName", "onDismiss"));
        exportedCustomDirectEventTypeConstants.put("topOrientationChange", AnonymousClass7TF.A0w("registrationName", "onOrientationChange"));
        return exportedCustomDirectEventTypeConstants;
    }

    public /* bridge */ /* synthetic */ void setAnimated(View view, boolean z) {
    }

    public /* bridge */ /* synthetic */ void setIdentifier(View view, int i) {
    }

    public /* bridge */ /* synthetic */ void setPresentationStyle(View view, String str) {
    }

    public /* bridge */ /* synthetic */ void setSupportedOrientations(View view, ReadableArray readableArray) {
    }

    public /* bridge */ /* synthetic */ void setVisible(View view, boolean z) {
    }

    public Object updateState(C7366Q8j q8j, C17763VfZ vfZ, C20831X0g x0g) {
        DbY.A1S(q8j, x0g);
        q8j.setStateWrapper(x0g);
        return null;
    }
}
