package X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.3c6  reason: invalid class name and case insensitive filesystem */
public final class C244993c6 extends YogaNodeJNIBase {
    public C244993c6(C244983c4 r3) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(((C244973c3) r3).A00));
        this.mConfig = r3;
    }

    public final void finalize() {
        long j = this.mNativePointer;
        if (j != 0) {
            this.mNativePointer = 0;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }

    public C244993c6() {
    }
}
