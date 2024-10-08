package X;

import java.lang.reflect.Method;

/* renamed from: X.Qkm  reason: case insensitive filesystem */
public final class C8239Qkm extends C8244Qkx {
    public final void A02(17Z r3, C269504fE r4, Object obj) {
        Object invoke;
        if (this.A01 == null) {
            Method method = this.A0E;
            if (method == null) {
                invoke = this.A0D.get(obj);
            } else {
                invoke = method.invoke(obj, (Object[]) null);
            }
            if (invoke == null || C2612848z.A00.equals(invoke)) {
                return;
            }
        }
        super.A02(r3, r4, obj);
    }
}
