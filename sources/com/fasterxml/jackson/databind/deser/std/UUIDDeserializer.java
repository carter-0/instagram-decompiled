package com.fasterxml.jackson.databind.deser.std;

import X.002;
import X.AnonymousClass00P;
import X.AnonymousClass16A;
import X.C268964eM;
import X.C268974eN;
import X.C269674fV;
import X.C8194Qk1;
import X.Pxe;
import X.Pxf;
import X.RD3;
import java.util.Arrays;
import java.util.UUID;

public class UUIDDeserializer extends FromStringDeserializer {
    public static final int[] A00;

    private UUID A01(C269674fV r6, byte[] bArr) {
        int length = bArr.length;
        if (length == 16) {
            return new UUID(A00(bArr, 0), A00(bArr, 8));
        }
        throw new C8194Qk1(r6.A07, bArr, 002.A0c("Can only construct UUIDs from byte[16]; got ", " bytes", length));
    }

    static {
        int[] iArr;
        int[] iArr2 = new int[127];
        A00 = iArr2;
        Arrays.fill(iArr2, -1);
        int i = 0;
        int i2 = 0;
        do {
            iArr = A00;
            iArr[i2 + 48] = i2;
            i2++;
        } while (i2 < 10);
        do {
            int i3 = i + 10;
            iArr[i + 97] = i3;
            iArr[i + 65] = i3;
            i++;
        } while (i < 6);
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    public static long A00(byte[] bArr, int i) {
        int A0D = Pxf.A0D(bArr, i + 2, (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16));
        int i2 = i + 4;
        return ((((long) ((bArr[i2 + 3] & 255) | Pxf.A0D(bArr, i2 + 2, (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16)))) << 32) >>> 32) | (((long) ((bArr[i + 3] & 255) | A0D)) << 32);
    }

    public final Object A0K(C269674fV r4) {
        return new UUID(0, 0);
    }

    public final /* bridge */ /* synthetic */ Object A0z(C269674fV r2, Object obj) {
        if (obj instanceof byte[]) {
            return A01(r2, (byte[]) obj);
        }
        super.A0z(r2, obj);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Object A10(C269674fV r10, String str) {
        int length = str.length();
        if (length != 36) {
            if (length == 24) {
                C268974eN r2 = C268964eM.A01;
                RD3 rd3 = new RD3((AnonymousClass16A) null);
                r2.A06(rd3, str);
                return A01(r10, rd3.A05());
            }
        } else if (str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-') {
            int A14 = A14(r10, str, 24);
            return new UUID((((long) A13(r10, str, 0)) << 32) + ((((long) A14(r10, str, 9)) << 16) | ((long) A14(r10, str, 14))), ((((long) A13(r10, str, 28)) << 32) >>> 32) | (((long) (A14 | (A14(r10, str, 19) << 16))) << 32));
        }
        r10.A0e(A0H(), str, "UUID has to be represented by standard 36-char representation", Pxe.A1b());
        throw AnonymousClass00P.createAndThrow();
    }

    public final int A12(C269674fV r7, String str, int i) {
        Class cls;
        Object[] objArr;
        String str2;
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        if (charAt <= 127) {
            if (charAt2 <= 127) {
                int[] iArr = A00;
                int i2 = iArr[charAt2] | (iArr[charAt] << 4);
                if (i2 >= 0) {
                    return i2;
                }
            }
            if (A00[charAt] >= 0) {
                cls = A0H();
                objArr = new Object[2];
                objArr[0] = Character.valueOf(charAt2);
                str2 = Integer.toHexString(charAt2);
                objArr[1] = str2;
                throw r7.A0J(cls, str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", objArr));
            }
        }
        cls = A0H();
        objArr = new Object[2];
        objArr[0] = Character.valueOf(charAt);
        str2 = Integer.toHexString(charAt);
        objArr[1] = str2;
        throw r7.A0J(cls, str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", objArr));
    }

    public final int A13(C269674fV r3, String str, int i) {
        return (A12(r3, str, i) << 24) + (A12(r3, str, i + 2) << 16) + (A12(r3, str, i + 4) << 8) + A12(r3, str, i + 6);
    }

    public final int A14(C269674fV r3, String str, int i) {
        return (A12(r3, str, i) << 8) + A12(r3, str, i + 2);
    }
}
