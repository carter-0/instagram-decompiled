package X;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.4fS  reason: invalid class name and case insensitive filesystem */
public final class C269644fS implements C269654fT, Serializable {
    public static C8164QiP A00(C269454f9 r2, C8208QkH qkH) {
        if (qkH instanceof C8205QkE) {
            Constructor constructor = ((C8205QkE) qkH).A00;
            if (r2.A06()) {
                C269574fL.A0H(constructor, r2.A08());
            }
            return new C8191Qjn(constructor);
        }
        Method method = ((C8206QkF) qkH).A01;
        if (r2.A06()) {
            C269574fL.A0H(method, r2.A08());
        }
        return new C8192Qjo(method);
    }
}
