package X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.3c3  reason: invalid class name and case insensitive filesystem */
public final class C244973c3 extends C244983c4 {
    public long A00;

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            this.A00 = 0;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }

    public C244973c3() {
        long jni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jni_YGConfigNewJNI != 0) {
            this.A00 = jni_YGConfigNewJNI;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }
}
