package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C12831T9d;
import X.C269294et;
import X.C269424f6;
import X.C269504fE;

public class StdKeySerializers$EnumKeySerializer extends StdSerializer {
    public final C12831T9d A00;

    public StdKeySerializers$EnumKeySerializer(C12831T9d t9d, Class cls) {
        super(cls, false);
        this.A00 = t9d;
    }

    public final void A0A(17Z r3, C269504fE r4, Object obj) {
        String valueOf;
        C269424f6 r0 = C269424f6.WRITE_ENUMS_USING_TO_STRING;
        C269294et r1 = r4.A05;
        if (r1.A0D(r0)) {
            valueOf = obj.toString();
        } else {
            Enum enumR = (Enum) obj;
            if (r1.A0D(C269424f6.WRITE_ENUM_KEYS_USING_INDEX)) {
                valueOf = String.valueOf(enumR.ordinal());
            } else {
                r3.A0k(this.A00.A01[enumR.ordinal()]);
                return;
            }
        }
        r3.A0q(valueOf);
    }
}
