package com.fasterxml.jackson.databind.ser.std;

import X.16L;
import X.17Z;
import X.C10798RyK;
import X.C13901TjO;
import X.C269504fE;
import X.C269714fZ;
import X.SPK;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;

public abstract class ArraySerializerBase extends ContainerSerializer implements C269714fZ {
    public final C13901TjO A00;
    public final Boolean A01;

    public ArraySerializerBase(C13901TjO tjO, ArraySerializerBase arraySerializerBase, Boolean bool) {
        super(arraySerializerBase.A00, false);
        this.A00 = tjO;
        this.A01 = bool;
    }

    public final void A09(17Z r6, C269504fE r7, SPK spk, Object obj) {
        C10798RyK A002 = SPK.A00(r6, 16L.A0C, spk, obj);
        r6.A0F(obj);
        if (this instanceof StdArraySerializers$IntArraySerializer) {
            for (int A0g : (int[]) obj) {
                r6.A0g(A0g);
            }
        } else if (this instanceof StdArraySerializers$ShortArraySerializer) {
            for (short A0g2 : (short[]) obj) {
                r6.A0g(A0g2);
            }
        } else if (this instanceof StdArraySerializers$LongArraySerializer) {
            for (long A0h : (long[]) obj) {
                r6.A0h(A0h);
            }
        } else if (this instanceof StdArraySerializers$FloatArraySerializer) {
            for (float A0f : (float[]) obj) {
                r6.A0f(A0f);
            }
        } else if (this instanceof StdArraySerializers$DoubleArraySerializer) {
            for (double A0e : (double[]) obj) {
                r6.A0e(A0e);
            }
        } else if (this instanceof StdArraySerializers$BooleanArraySerializer) {
            for (boolean A0x : (boolean[]) obj) {
                r6.A0x(A0x);
            }
        } else if (this instanceof ObjectArraySerializer) {
            ((ObjectArraySerializer) this).A0E(r6, r7, (Object[]) obj);
        } else {
            ((StringArraySerializer) this).A0E(r6, r7, (String[]) obj);
        }
        spk.A04(r6, A002);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r11, X.C269504fE r12) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
            r5 = r11
            if (r0 == 0) goto L_0x006f
            r8 = r10
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r8 = (com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer) r8
            X.SPK r7 = r8.A03
            r3 = r7
            if (r7 == 0) goto L_0x0011
            X.SPK r7 = r7.A06(r11)
        L_0x0011:
            r9 = 0
            if (r11 == 0) goto L_0x0067
            X.QkH r1 = r11.BRS()
            X.4et r0 = r12.A05
            X.4eA r0 = r0.A01()
            if (r1 == 0) goto L_0x0067
            java.lang.Object r0 = r0.A0X(r1)
            if (r0 == 0) goto L_0x0067
            com.fasterxml.jackson.databind.JsonSerializer r2 = r12.A0M(r1, r0)
        L_0x002a:
            java.lang.Class r0 = r8.A00
            X.4ev r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r11, r12, r0)
            if (r1 == 0) goto L_0x0038
            X.RDC r0 = X.RDC.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r9 = r1.A01(r0)
        L_0x0038:
            if (r2 != 0) goto L_0x003c
            com.fasterxml.jackson.databind.JsonSerializer r2 = r8.A00
        L_0x003c:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r8.A0C(r11, r2, r12)
            if (r6 != 0) goto L_0x0054
            X.4eF r2 = r8.A02
            if (r2 == 0) goto L_0x0054
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0054
            java.lang.Class r1 = r2.A00
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L_0x0054
            com.fasterxml.jackson.databind.JsonSerializer r6 = r12.A0B(r11, r2)
        L_0x0054:
            X.TjO r0 = r8.A00
            if (r0 != r11) goto L_0x0069
            com.fasterxml.jackson.databind.JsonSerializer r0 = r8.A00
            if (r6 != r0) goto L_0x0069
            if (r3 != r7) goto L_0x0069
            java.lang.Boolean r0 = r8.A01
            boolean r0 = X.2Ob.A00(r0, r9)
            if (r0 == 0) goto L_0x0069
            return r8
        L_0x0067:
            r2 = r9
            goto L_0x002a
        L_0x0069:
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r4 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x006f:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
            if (r0 == 0) goto L_0x00cb
            r8 = r10
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r8 = (com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) r8
            r3 = 0
            if (r11 == 0) goto L_0x00c3
            X.4et r0 = r12.A05
            X.4eA r0 = r0.A01()
            X.QkH r1 = r11.BRS()
            if (r1 == 0) goto L_0x00c3
            java.lang.Object r0 = r0.A0X(r1)
            if (r0 == 0) goto L_0x00c3
            com.fasterxml.jackson.databind.JsonSerializer r4 = r12.A0M(r1, r0)
        L_0x008f:
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            X.RDC r1 = X.RDC.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            X.4ev r0 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r11, r12, r0)
            if (r0 == 0) goto L_0x00c1
            java.lang.Boolean r2 = r0.A01(r1)
        L_0x009d:
            if (r4 != 0) goto L_0x00a1
            com.fasterxml.jackson.databind.JsonSerializer r4 = r8.A00
        L_0x00a1:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.A0C(r11, r4, r12)
            if (r1 != 0) goto L_0x00ad
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.fasterxml.jackson.databind.JsonSerializer r1 = r12.A0G(r11, r0)
        L_0x00ad:
            boolean r0 = X.C269574fL.A0K(r1)
            if (r0 != 0) goto L_0x00b4
            r3 = r1
        L_0x00b4:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r8.A00
            if (r3 != r0) goto L_0x00c5
            java.lang.Boolean r0 = r8.A01
            boolean r0 = X.2Ob.A00(r2, r0)
            if (r0 == 0) goto L_0x00c5
            return r8
        L_0x00c1:
            r2 = 0
            goto L_0x009d
        L_0x00c3:
            r4 = r3
            goto L_0x008f
        L_0x00c5:
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r0 = new com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
            r0.<init>(r11, r3, r8, r2)
            return r0
        L_0x00cb:
            if (r11 == 0) goto L_0x012a
            java.lang.Class r1 = r10.A00
            X.4et r0 = r12.A05
            X.4ev r1 = r11.AVO(r0, r1)
            X.RDC r0 = X.RDC.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r1.A01(r0)
            java.lang.Boolean r0 = r10.A01
            boolean r0 = X.2Ob.A00(r2, r0)
            if (r0 != 0) goto L_0x012a
            r1 = r10
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer
            if (r0 == 0) goto L_0x00ee
            com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer r8 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer
            r8.<init>(r11, r10, r2)
            return r8
        L_0x00ee:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer
            if (r0 == 0) goto L_0x00f8
            com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer r8 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer
            r8.<init>(r11, r10, r2)
            return r8
        L_0x00f8:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer
            if (r0 == 0) goto L_0x0102
            com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer r8 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer
            r8.<init>(r11, r10, r2)
            return r8
        L_0x0102:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer
            if (r0 == 0) goto L_0x010c
            com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer r8 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer
            r8.<init>(r11, r10, r2)
            return r8
        L_0x010c:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer
            if (r0 == 0) goto L_0x0116
            com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer r8 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer
            r8.<init>(r11, r10, r2)
            return r8
        L_0x0116:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer
            if (r0 == 0) goto L_0x0120
            com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer r8 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer
            r8.<init>(r11, r10, r2)
            return r8
        L_0x0120:
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r1 = (com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) r1
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A00
            com.fasterxml.jackson.databind.ser.impl.StringArraySerializer r8 = new com.fasterxml.jackson.databind.ser.impl.StringArraySerializer
            r8.<init>(r11, r0, r1, r2)
            return r8
        L_0x012a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public ArraySerializerBase(Class cls) {
        super(cls);
        this.A00 = null;
        this.A01 = null;
    }
}
