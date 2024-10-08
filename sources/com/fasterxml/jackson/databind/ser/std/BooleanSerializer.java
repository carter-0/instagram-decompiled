package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C13901TjO;
import X.C269314ev;
import X.C269324ew;
import X.C269504fE;
import X.C269714fZ;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class BooleanSerializer extends StdScalarSerializer implements C269714fZ {
    public final boolean A00;

    public final class AsNumber extends StdScalarSerializer implements C269714fZ {
        public final boolean A00;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AsNumber(boolean r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x000a
                java.lang.Class r0 = java.lang.Boolean.TYPE
            L_0x0004:
                r1.<init>((java.lang.Class) r0)
                r1.A00 = r2
                return
            L_0x000a:
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BooleanSerializer.AsNumber.<init>(boolean):void");
        }

        public final void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
            r2.A0x(Boolean.TRUE.equals(obj));
        }

        public final void A0A(17Z r2, C269504fE r3, Object obj) {
            r2.A0g(Boolean.FALSE.equals(obj) ^ true ? 1 : 0);
        }

        public final JsonSerializer ALi(C13901TjO tjO, C269504fE r4) {
            C269314ev A002 = StdSerializer.A00(tjO, r4, Boolean.class);
            if (A002 == null || A002.A00.A00()) {
                return this;
            }
            return new BooleanSerializer(this.A00);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BooleanSerializer(boolean r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            java.lang.Class r0 = java.lang.Boolean.TYPE
        L_0x0004:
            r1.<init>((java.lang.Class) r0)
            r1.A00 = r2
            return
        L_0x000a:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BooleanSerializer.<init>(boolean):void");
    }

    public final void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        r2.A0x(Boolean.TRUE.equals(obj));
    }

    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r5) {
        Class cls = this.A00;
        C269314ev A002 = StdSerializer.A00(tjO, r5, cls);
        if (A002 != null) {
            C269324ew r1 = A002.A00;
            if (r1.A00()) {
                return new AsNumber(this.A00);
            }
            if (r1 == C269324ew.STRING) {
                return new StdSerializer(cls, false);
            }
        }
        return this;
    }
}
