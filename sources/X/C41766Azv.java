package X;

import android.graphics.Color;

/* renamed from: X.Azv  reason: case insensitive filesystem */
public final class C41766Azv extends 0Yg implements 0sL {
    public static final C41766Azv A00 = new C41766Azv();

    public C41766Azv() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        Number number2 = (Number) obj2;
        0qQ.A0A(number);
        float luminance = Color.luminance(number.intValue());
        0qQ.A0A(number2);
        return Integer.valueOf(Float.compare(luminance, Color.luminance(number2.intValue())));
    }
}
