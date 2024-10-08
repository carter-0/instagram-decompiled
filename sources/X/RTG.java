package X;

import java.util.Arrays;
import java.util.Locale;

public abstract class RTG {
    public static final String A00(AnonymousClass6Tm r8) {
        Object[] copyOf;
        String str;
        Object A03 = r8.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.bloks.stdlib.animation.BloksDimensionValueAnimator");
        C7498QGp qGp = (C7498QGp) A03;
        Object animatedValue = qGp.getAnimatedValue();
        0qQ.A0C(animatedValue, AnonymousClass000.A00(338));
        Number number = (Number) animatedValue;
        float floatValue = number.floatValue();
        Integer num = qGp.A00;
        Integer num2 = AnonymousClass05K.A00;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (num == num2) {
            objArr[0] = number;
            copyOf = Arrays.copyOf(objArr, 1);
            str = "%.2f%%";
        } else {
            objArr[0] = Integer.valueOf(AnonymousClass1GB.A01(floatValue));
            copyOf = Arrays.copyOf(objArr, 1);
            str = "%dpx";
        }
        return Pxe.A12(locale, str, copyOf);
    }
}
