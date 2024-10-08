package com.instagram.direct.msys.plugins.mcidberrorhandlerplugin;

import X.0qQ;
import com.facebook.msys.mcf.MsysError;
import com.instagram.direct.msys.plugins.mcidberrorhandlerplugin.IGDirectAndroidMCIDBErrorPluginCallbacks;

public abstract class Sessionless {
    private void IGDirectAndroidMCIDBErrorSessionlessImpl_MCIDBErrorHandlerHandleDBOpenFailureJNI(int i, MsysError msysError, IGDirectAndroidMCIDBErrorPluginCallbacks.MCIDBErrorHandlerCompletionCallback mCIDBErrorHandlerCompletionCallback) {
        0qQ.A0B(mCIDBErrorHandlerCompletionCallback, 2);
        mCIDBErrorHandlerCompletionCallback.run(true);
    }

    public abstract void IGDirectAndroidMCIDBErrorSessionlessImpl_MCIDBErrorHandlerHandleDBOpenFailure(int i, MsysError msysError, IGDirectAndroidMCIDBErrorPluginCallbacks.MCIDBErrorHandlerCompletionCallback mCIDBErrorHandlerCompletionCallback);
}
