package com.facebook.react.devsupport;

import X.002;
import X.AnonymousClass7TE;
import X.C13436TaO;
import X.QZK;
import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;

@ReactModule(name = "JSCHeapCapture", needsEagerInit = true)
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
    public C13436TaO mCaptureInProgress = null;

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    public synchronized void captureComplete(String str, String str2) {
    }

    public synchronized void captureHeap(String str, C13436TaO taO) {
        File A0t = AnonymousClass7TE.A0t(002.A0R(str, "/capture.json"));
        A0t.delete();
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            HeapCapture heapCapture = (HeapCapture) reactApplicationContextIfActiveOrWarn.A02(HeapCapture.class);
            if (heapCapture == null) {
                new Exception("Heap capture js module not registered.");
                throw AnonymousClass7TE.A11("onFailure");
            } else {
                this.mCaptureInProgress = taO;
                heapCapture.captureHeap(A0t.getPath());
            }
        }
    }

    public JSCHeapCapture(QZK qzk) {
        super(qzk);
    }
}
