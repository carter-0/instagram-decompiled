package com.facebook.react.uimanager;

import X.0dV;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.RuntimeExecutor;

public final class UIConstantsProviderBinding {
    public static final UIConstantsProviderBinding INSTANCE = new Object();

    public interface ConstantsForViewManagerProvider {
        NativeMap getConstantsForViewManager(String str);
    }

    public interface ConstantsProvider {
        NativeMap getConstants();
    }

    public interface DefaultEventTypesProvider {
        NativeMap getDefaultEventTypes();
    }

    public static final native void install(RuntimeExecutor runtimeExecutor, DefaultEventTypesProvider defaultEventTypesProvider, ConstantsForViewManagerProvider constantsForViewManagerProvider, ConstantsProvider constantsProvider);

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.react.uimanager.UIConstantsProviderBinding, java.lang.Object] */
    static {
        0dV.A0C("uimanagerjni");
    }
}
