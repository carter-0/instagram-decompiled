package com.facebook.react.bridge;

import X.002;
import X.AnonymousClass7TE;
import X.Pxe;
import X.QZK;
import java.util.Map;

public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";
    public CxxCallbackImpl mEventEmitterCallback;
    public final QZK mReactApplicationContext;

    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map getConstants() {
        return null;
    }

    public void initialize() {
    }

    public void invalidate() {
    }

    public /* synthetic */ void onCatalystInstanceDestroy() {
    }

    private final void setEventEmitterCallback(CxxCallbackImpl cxxCallbackImpl) {
        this.mEventEmitterCallback = cxxCallbackImpl;
    }

    public final QZK getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.A0F()) {
            return this.mReactApplicationContext;
        }
        ReactSoftExceptionLogger.logSoftException("ReactNative", AnonymousClass7TE.A15(002.A0R("React Native Instance has already disappeared: requested by ", getName())));
        return null;
    }

    public BaseJavaModule(QZK qzk) {
        this.mReactApplicationContext = qzk;
    }

    public final QZK getReactApplicationContext() {
        return Pxe.A0T(this);
    }

    public BaseJavaModule() {
        this((QZK) null);
    }
}
