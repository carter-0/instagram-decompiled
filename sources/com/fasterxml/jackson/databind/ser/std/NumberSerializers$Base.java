package com.fasterxml.jackson.databind.ser.std;

import X.C13901TjO;
import X.C269314ev;
import X.C269504fE;
import X.C269714fZ;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import java.math.BigDecimal;

public abstract class NumberSerializers$Base extends StdScalarSerializer implements C269714fZ {
    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r5) {
        Class<BigDecimal> cls = this.A00;
        C269314ev A00 = StdSerializer.A00(tjO, r5, cls);
        if (A00 == null || A00.A00.ordinal() != 8) {
            return this;
        }
        if (cls == BigDecimal.class) {
            return NumberSerializer.BigDecimalAsStringSerializer.A00;
        }
        return ToStringSerializer.A00;
    }

    public NumberSerializers$Base(Class cls) {
        super(cls);
    }
}
