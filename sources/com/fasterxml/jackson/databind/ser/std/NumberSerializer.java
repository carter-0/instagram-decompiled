package com.fasterxml.jackson.databind.ser.std;

import X.15u;
import X.17Z;
import X.AnonymousClass4iD;
import X.C13901TjO;
import X.C269314ev;
import X.C269494fD;
import X.C269504fE;
import X.C269714fZ;
import X.Pxe;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;

@JacksonStdImpl
public class NumberSerializer extends StdScalarSerializer implements C269714fZ {
    public static final NumberSerializer A00 = new StdSerializer(Number.class);

    public final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        public static final BigDecimalAsStringSerializer A00 = new BigDecimalAsStringSerializer();

        public final boolean A0B(C269504fE r2, Object obj) {
            return false;
        }

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class, false);
        }

        public final void A0A(17Z r5, C269504fE r6, Object obj) {
            String obj2;
            if (r5.A0W(15u.A0A)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                int scale = bigDecimal.scale();
                if (scale < -9999 || scale > 9999) {
                    throw new AnonymousClass4iD(((C269494fD) r6).A00, String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(bigDecimal.scale()), 9999, 9999}), (Throwable) null);
                }
                obj2 = bigDecimal.toPlainString();
            } else {
                obj2 = obj.toString();
            }
            r5.A0t(obj2);
        }

        public final String A0E(Object obj) {
            throw Pxe.A0i();
        }
    }

    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r5) {
        Class<BigDecimal> cls = this.A00;
        C269314ev A002 = StdSerializer.A00(tjO, r5, cls);
        if (A002 == null || A002.A00.ordinal() != 8) {
            return this;
        }
        if (cls == BigDecimal.class) {
            return BigDecimalAsStringSerializer.A00;
        }
        return ToStringSerializer.A00;
    }

    public NumberSerializer(Class cls) {
        super(cls);
    }
}
