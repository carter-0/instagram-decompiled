package com.fasterxml.jackson.databind.ser.std;

import X.C269714fZ;
import java.util.UUID;

public class UUIDSerializer extends StdScalarSerializer implements C269714fZ {
    public static final char[] A01 = "0123456789abcdef".toCharArray();
    public final Boolean A00;

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this.A00 = bool;
    }

    public static final void A03(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void A04(char[] cArr, int i, int i2) {
        char[] cArr2 = A01;
        cArr[i2] = cArr2[(i >> 12) & 15];
        int i3 = i2 + 1;
        cArr[i3] = cArr2[(i >> 8) & 15];
        int i4 = i3 + 1;
        cArr[i4] = cArr2[(i >> 4) & 15];
        cArr[i4 + 1] = cArr2[i & 15];
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r3, X.C269504fE r4) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.A00
            X.4ev r0 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r3, r4, r0)
            if (r0 == 0) goto L_0x0027
            X.4ew r1 = r0.A00
            X.4ew r0 = X.C269324ew.BINARY
            if (r1 != r0) goto L_0x0021
            r0 = 1
        L_0x000f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0013:
            java.lang.Boolean r0 = r2.A00
            boolean r0 = X.2Ob.A00(r1, r0)
            if (r0 != 0) goto L_0x0029
            com.fasterxml.jackson.databind.ser.std.UUIDSerializer r0 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer
            r0.<init>(r1)
            return r0
        L_0x0021:
            X.4ew r0 = X.C269324ew.STRING
            if (r1 != r0) goto L_0x0027
            r0 = 0
            goto L_0x000f
        L_0x0027:
            r1 = 0
            goto L_0x0013
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.UUIDSerializer.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public UUIDSerializer() {
        this((Boolean) null);
    }
}
