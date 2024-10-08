package X;

import com.facebook.yoga.YogaNative;

public final class TUJ extends 0Yg implements C62320sa {
    public static final TUJ A00 = new TUJ();

    public TUJ() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C244973c3 r3 = new C244973c3();
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(r3.A00, 0.0f);
        YogaNative.jni_YGConfigSetErrataJNI(r3.A00, Integer.MAX_VALUE);
        return r3;
    }
}
