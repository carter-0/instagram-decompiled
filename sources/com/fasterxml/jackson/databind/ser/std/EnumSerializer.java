package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.2Ob;
import X.C12831T9d;
import X.C13901TjO;
import X.C269314ev;
import X.C269324ew;
import X.C269424f6;
import X.C269504fE;
import X.C269714fZ;
import X.Pxf;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class EnumSerializer extends StdScalarSerializer implements C269714fZ {
    public final C12831T9d A00;
    public final Boolean A01;

    public EnumSerializer(C12831T9d t9d, Boolean bool) {
        super(t9d.A00);
        this.A00 = t9d;
        this.A01 = bool;
    }

    public static Boolean A03(C269314ev r2, Boolean bool, Class cls, boolean z) {
        String str;
        C269324ew r22 = r2.A00;
        if (r22 == C269324ew.ANY || r22 == C269324ew.SCALAR) {
            return bool;
        }
        if (r22 == C269324ew.STRING || r22 == C269324ew.NATURAL) {
            return Boolean.FALSE;
        }
        if (r22.A00() || r22 == C269324ew.ARRAY) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        if (z) {
            str = "class";
        } else {
            str = "property";
        }
        throw Pxf.A0X("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", new Object[]{r22, name, str});
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        boolean A0D;
        Enum enumR = (Enum) obj;
        Boolean bool = this.A01;
        if (bool != null) {
            A0D = bool.booleanValue();
        } else {
            A0D = r4.A05.A0D(C269424f6.WRITE_ENUMS_USING_INDEX);
        }
        if (A0D) {
            r3.A0g(enumR.ordinal());
            return;
        }
        if (r4.A05.A0D(C269424f6.WRITE_ENUMS_USING_TO_STRING)) {
            r3.A0t(enumR.toString());
        } else {
            r3.A0m(this.A00.A01[enumR.ordinal()]);
        }
    }

    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r6) {
        Class cls = this.A00;
        C269314ev A002 = StdSerializer.A00(tjO, r6, cls);
        if (A002 != null) {
            Boolean bool = this.A01;
            Boolean A03 = A03(A002, bool, cls, false);
            if (!2Ob.A00(A03, bool)) {
                return new EnumSerializer(this.A00, A03);
            }
        }
        return this;
    }
}
