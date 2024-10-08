package com.facebook.react.bridge;

import X.SBO;
import X.TO4;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.util.Map;
import java.util.concurrent.Executor;

public class ReactInstanceManagerInspectorTarget implements AutoCloseable {
    public static final ReactInstanceManagerInspectorTarget $redex_init_class = null;
    public final HybridData mHybridData;

    public interface TargetDelegate {
        Map getMetadata();

        void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener);

        void onReload();

        void onSetPausedInDebuggerMessage(String str);
    }

    private native HybridData initHybrid(Executor executor, TargetDelegate targetDelegate);

    public native void sendDebuggerResumeCommand();

    public void close() {
        this.mHybridData.resetNative();
    }

    public boolean isValid() {
        return this.mHybridData.isValid();
    }

    static {
        SBO.A00();
    }

    public ReactInstanceManagerInspectorTarget(TargetDelegate targetDelegate) {
        this.mHybridData = initHybrid(new TO4((Object) this, 1), targetDelegate);
    }
}
