package com.facebook.jni;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public class HybridData {
    public static final HybridData $redex_init_class = null;
    public final Destructor mDestructor;

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    public boolean isValid() {
        if (this.mDestructor.mNativePointer != 0) {
            return true;
        }
        return false;
    }
}
