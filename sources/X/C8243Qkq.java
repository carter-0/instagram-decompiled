package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import java.io.Serializable;
import java.lang.reflect.Method;

/* renamed from: X.Qkq  reason: case insensitive filesystem */
public final class C8243Qkq extends C8244Qkx implements Serializable {
    public final SGT A00;

    public final void A02(17Z r4, C269504fE r5, Object obj) {
        Object invoke;
        Method method = this.A0E;
        if (method == null) {
            invoke = this.A0D.get(obj);
        } else {
            invoke = method.invoke(obj, (Object[]) null);
        }
        if (invoke != null) {
            JsonSerializer A02 = SuT.A02(r5, this, invoke);
            Object obj2 = this.A09;
            if (obj2 != null && SuT.A03(A02, r5, obj2, invoke)) {
                return;
            }
            if (invoke != obj || !A05(r4, A02, r5)) {
                if (!A02.A08()) {
                    r4.A0k(this.A04);
                }
                Pxi.A1D(r4, A02, r5, this.A03, invoke);
            }
        }
    }

    public final void A04(JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            SGT sgt = this.A00;
            if (jsonSerializer.A08() && (jsonSerializer instanceof UnwrappingBeanSerializer)) {
                sgt = new C8254Qm3(sgt, ((UnwrappingBeanSerializer) jsonSerializer).A00);
            }
            jsonSerializer = jsonSerializer.A07(sgt);
        }
        super.A04(jsonSerializer);
    }

    public C8243Qkq(15y r1, C8243Qkq qkq, SGT sgt) {
        super(r1, (C8244Qkx) qkq);
        this.A00 = sgt;
    }

    public C8243Qkq(C8244Qkx qkx, SGT sgt) {
        super(qkx.A04, qkx);
        this.A00 = sgt;
    }
}
