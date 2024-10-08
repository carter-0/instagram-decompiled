package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4fD  reason: invalid class name and case insensitive filesystem */
public abstract class C269494fD extends C269504fE implements Serializable {
    public transient 17Z A00;
    public transient ArrayList A01;
    public transient Map A02;

    public static IOException A00(17Z r3, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String A09 = C269574fL.A09(exc);
        if (A09 == null) {
            A09 = 002.A0g("[no message for ", exc.getClass().getName(), "]");
        }
        return new AnonymousClass4iD(r3, A09, exc);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4fE, X.4fD] */
    public C269494fD A0W(C269294et r2, C269524fG r3) {
        return new C269504fE(r2, this, r3);
    }

    public final void A0X(17Z r6, Object obj) {
        this.A00 = r6;
        if (obj == null) {
            try {
                this.A01.A0A(r6, this, (Object) null);
            } catch (Exception e) {
                throw A00(r6, e);
            }
        } else {
            Class<?> cls = obj.getClass();
            JsonSerializer A0J = A0J((C13901TjO) null, cls, true);
            C269294et r2 = this.A05;
            C269434f7 r1 = r2.A00;
            if (r1 == null) {
                if (r2.A0D(C269424f6.WRAP_ROOT_VALUE)) {
                    A01(r6, A0J, r2.A04.A00(r2, cls), this, obj);
                    return;
                }
            } else if (!r1.A02()) {
                A01(r6, A0J, r1, this, obj);
                return;
            }
            A0J.A0A(r6, this, obj);
        }
    }

    public static final void A01(17Z r3, JsonSerializer jsonSerializer, C269434f7 r5, C269494fD r6, Object obj) {
        try {
            r3.A0c();
            C269294et r2 = r6.A05;
            15y r0 = r5.A00;
            if (r0 == null) {
                String str = r5.A02;
                if (r2 == null) {
                    r0 = new 15y(str);
                } else {
                    C269314ev r02 = C269144ee.A02;
                    r0 = new 15y(str);
                }
                r5.A00 = r0;
            }
            r3.A0k(r0);
            jsonSerializer.A0A(r3, r6, obj);
            r3.A0Z();
        } catch (Exception e) {
            throw A00(r3, e);
        }
    }
}
