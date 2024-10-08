package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.T9a  reason: case insensitive filesystem */
public final class C12829T9a implements Serializable {
    public JsonDeserializer A00;
    public final C13901TjO A01;
    public final C268894eF A02;
    public final C10889Rzp A03;
    public final C8208QkH A04;
    public final C11287SJg A05;
    public final boolean A06;

    public final void A01(16F r8, C269674fV r9, Object obj, String str) {
        Object obj2;
        Object obj3 = obj;
        String str2 = str;
        try {
            C10889Rzp rzp = this.A03;
            if (rzp == null) {
                obj2 = str;
            } else {
                obj2 = rzp.A00(r9, str);
            }
            A02(obj, obj2, A00(r8, r9));
        } catch (C8158Qi1 e) {
            if (this.A00.A0F() != null) {
                e.A00.A00(new C8188Qit(this, e, this.A02.A00, obj3, str2));
                return;
            }
            throw new AnonymousClass4iD(r8, "Unresolved forward reference but no identity info.", e);
        }
    }

    public final Object A00(16F r3, C269674fV r4) {
        if (r3.A19(16L.A0G)) {
            return this.A00.BWm(r4);
        }
        C11287SJg sJg = this.A05;
        JsonDeserializer jsonDeserializer = this.A00;
        if (sJg != null) {
            return jsonDeserializer.A0J(r3, r4, sJg);
        }
        return jsonDeserializer.A0D(r3, r4);
    }

    public final void A02(Object obj, Object obj2, Object obj3) {
        try {
            if (this.A06) {
                Map map = (Map) ((C8203QkC) this.A04).A0A(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                    return;
                }
                return;
            }
            ((C8206QkF) this.A04).A01.invoke(obj, new Object[]{obj2, obj3});
        } catch (Exception e) {
            e = e;
            if (e instanceof IllegalArgumentException) {
                String A07 = C269574fL.A07(obj3);
                StringBuilder A16 = Pxe.A16("Problem deserializing \"any\" property '");
                A16.append(obj2);
                A16.append(002.A0g("' of class ", this.A04.A09().getName(), " (expected type: "));
                A16.append(this.A02);
                A16.append("; actual type: ");
                A16.append(A07);
                A16.append(")");
                String A09 = C269574fL.A09(e);
                if (A09 != null) {
                    A16.append(", problem: ");
                } else {
                    A09 = " (no error message provided)";
                }
                throw new AnonymousClass4iD((Closeable) null, AnonymousClass7TF.A0l(A09, A16), e);
            }
            Iterator it = C269574fL.A00;
            if (!(e instanceof IOException)) {
                C269574fL.A0F(e);
                while (e.getCause() != null) {
                    e = e.getCause();
                }
                throw new AnonymousClass4iD((Closeable) null, C269574fL.A09(e), e);
            }
            throw e;
        }
    }

    public final String toString() {
        return 002.A0g("[any property on class ", this.A04.A09().getName(), "]");
    }

    public C12829T9a(C13901TjO tjO, C268894eF r3, JsonDeserializer jsonDeserializer, C10889Rzp rzp, C8208QkH qkH, C11287SJg sJg) {
        this.A01 = tjO;
        this.A04 = qkH;
        this.A02 = r3;
        this.A00 = jsonDeserializer;
        this.A05 = sJg;
        this.A03 = rzp;
        this.A06 = qkH instanceof C8203QkC;
    }
}
