package com.facebook.react.modules.appstate;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TF;
import X.C13773Tgo;
import X.C13948Tm8;
import X.C9536RcZ;
import X.Pxe;
import X.Pxh;
import X.QZK;
import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "AppState")
public final class AppStateModule extends NativeAppStateSpec implements C13773Tgo {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    public static final C9536RcZ Companion = new Object();
    public static final String INITIAL_STATE = "initialAppState";
    public static final String NAME = "AppState";
    public String appState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppStateModule(QZK qzk) {
        super(qzk);
        String str;
        0qQ.A0B(qzk, 1);
        qzk.A09(this);
        qzk.A0D.add(this);
        if (qzk.A07 == AnonymousClass05K.A0C) {
            str = APP_STATE_ACTIVE;
        } else {
            str = APP_STATE_BACKGROUND;
        }
        this.appState = str;
    }

    public void addListener(String str) {
    }

    public void getCurrentAppState(Callback callback, Callback callback2) {
        0qQ.A0B(callback, 0);
        Pxh.A1E(callback, createAppStateEventMap());
    }

    public void onHostDestroy() {
    }

    public void removeListeners(double d) {
    }

    public Map getTypedExportedConstants() {
        return AnonymousClass7TF.A0w(INITIAL_STATE, this.appState);
    }

    public void onHostPause() {
        this.appState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    public void onHostResume() {
        this.appState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }

    private final C13948Tm8 createAppStateEventMap() {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString("app_state", this.appState);
        return A0U;
    }

    private final void sendAppStateChangeEvent() {
        sendEvent("appStateDidChange", createAppStateEventMap());
    }

    private final void sendEvent(String str, Object obj) {
        QZK A0T = Pxe.A0T(this);
        if (A0T != null && A0T.A0F()) {
            A0T.A0E(str, obj);
        }
    }

    public void invalidate() {
        Pxe.A0T(this).A0A(this);
    }

    public void onWindowFocusChange(boolean z) {
        sendEvent("appStateFocusChange", Boolean.valueOf(z));
    }
}
