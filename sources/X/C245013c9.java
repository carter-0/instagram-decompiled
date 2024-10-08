package X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.3c9  reason: invalid class name and case insensitive filesystem */
public class C245013c9 implements AnonymousClass2TE {
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public boolean A02;
    public final C245003c8 A03;

    public void A04(int i) {
        float f = (float) i;
        this.A00 = f;
        YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A05(int i) {
        float f = (float) i;
        this.A00 = f;
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A06(int i) {
        float f = (float) i;
        this.A01 = f;
        YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A08(C244143ai r4) {
        0qQ.A0B(r4, 0);
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) this.A03).mNativePointer, r4.A00);
    }

    public void E1a(C244143ai r5, int i) {
        0qQ.A0B(r5, 0);
        this.A02 = true;
        YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) this.A03).mNativePointer, r5.A00, (float) i);
    }

    public void A00(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A01(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A02(float f) {
        this.A00 = f;
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A03(float f) {
        this.A01 = f;
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A07(C243573Zh r4) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(((YogaNodeJNIBase) this.A03).mNativePointer, r4.A00);
    }

    public void A09(C244143ai r4, float f) {
        if (!(this instanceof C247443gL)) {
            0qQ.A0B(r4, 0);
            this.A02 = true;
            YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) this.A03).mNativePointer, r4.A00, f);
        }
    }

    public void A0A(C244143ai r4, float f) {
        if (!(this instanceof C247443gL)) {
            0qQ.A0B(r4, 0);
            YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.A03).mNativePointer, r4.A00, f);
        }
    }

    public void A0B(C244413b9 r4) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(((YogaNodeJNIBase) this.A03).mNativePointer, r4.A00);
    }

    public C245013c9(C245003c8 r2) {
        this.A03 = r2;
    }
}
