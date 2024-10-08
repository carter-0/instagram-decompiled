package com.meta.cal;

import X.AnonymousClass7TE;
import X.JTQ;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AudioSessionUtils {

    public final class CppProxy extends AudioSessionUtils {
        public final AtomicBoolean destroyed = JTQ.A0k();
        public final long nativeRef;

        public static native int getModelVersion();

        private native void nativeDestroy(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw AnonymousClass7TE.A15("nativeRef is zero");
        }

        public void finalize() {
            _djinni_private_destroy();
        }
    }

    public static int getModelVersion() {
        return CppProxy.getModelVersion();
    }
}
