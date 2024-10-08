package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16G;
import X.AnonymousClass00P;
import X.AnonymousClass4iD;
import X.AnonymousClass5E9;
import X.C12438SuU;
import X.C252503pD;
import X.C268194cw;
import X.C269464fA;
import X.C269474fB;
import X.C269674fV;
import X.C282585Dv;
import X.C361498gK;
import X.C383839gL;
import X.C8236Qkj;
import X.C8237Qkk;
import com.instagram.react.modules.base.IgReactQEModule;

public abstract class BaseNodeDeserializer extends StdDeserializer {
    public final Boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r1 == X.AnonymousClass05K.A01) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return new X.C282605Dx(r2.A0j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if ((r3 & X.C269464fA.USE_BIG_INTEGER_FOR_INTS.A00) != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C282595Dw A01(X.16F r2, int r3) {
        /*
            if (r3 == 0) goto L_0x0012
            X.4fA r0 = X.C269464fA.USE_BIG_INTEGER_FOR_INTS
            int r0 = r0.A00
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0027
        L_0x0009:
            java.math.BigInteger r0 = r2.A0s()
            if (r0 != 0) goto L_0x0031
            X.9gL r2 = X.C383839gL.A00
            return r2
        L_0x0012:
            java.lang.Integer r1 = r2.A0n()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0023
            int r0 = r2.A0i()
            X.5E0 r2 = X.AnonymousClass5E0.A00(r0)
            return r2
        L_0x0023:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0009
        L_0x0027:
            long r0 = r2.A0j()
            X.5Dx r2 = new X.5Dx
            r2.<init>(r0)
            return r2
        L_0x0031:
            X.9gJ r2 = new X.9gJ
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A01(X.16F, int):X.5Dw");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C282595Dw A03(X.16F r2, X.C269674fV r3) {
        /*
            int r1 = r3.A01
            int r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A02
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0027
            X.4fA r0 = X.C269464fA.USE_BIG_INTEGER_FOR_INTS
            int r0 = r0.A00
            r0 = r0 & r1
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0010:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x002c
            int r0 = r2.A0i()
            X.5E0 r2 = X.AnonymousClass5E0.A00(r0)
            return r2
        L_0x001d:
            X.4fA r0 = X.C269464fA.USE_LONG_FOR_INTS
            int r0 = r0.A00
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0027
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0010
        L_0x0027:
            java.lang.Integer r1 = r2.A0n()
            goto L_0x0010
        L_0x002c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x003a
            long r0 = r2.A0j()
            X.5Dx r2 = new X.5Dx
            r2.<init>(r0)
            return r2
        L_0x003a:
            java.math.BigInteger r0 = r2.A0s()
            if (r0 != 0) goto L_0x0043
            X.9gL r2 = X.C383839gL.A00
            return r2
        L_0x0043:
            X.9gJ r2 = new X.9gJ
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A03(X.16F, X.4fV):X.5Dw");
    }

    public static final void A04(C269674fV r3, C252503pD r4, C252503pD r5, C269474fB r6, C268194cw r7, String str) {
        if (r3.A0j(C269464fA.FAIL_ON_READING_DUP_TREE_KEY)) {
            throw new AnonymousClass4iD(r3.A07, String.format("Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", new Object[]{str}));
        } else if (!r3.A0i(16G.A02)) {
        } else {
            if (r4.A0A()) {
                ((AnonymousClass5E9) r4).A0B(r5);
                r7.A00.put(str, r4);
                return;
            }
            AnonymousClass5E9 r1 = new AnonymousClass5E9(r6);
            r1.A0B(r4);
            r1.A0B(r5);
            r7.A00.put(str, r1);
        }
    }

    public final C252503pD A0y(16F r4, C269674fV r5) {
        C269474fB r2 = r5.A02.A07;
        int A0x = r4.A0x();
        if (A0x == 2) {
            return new C268194cw(r2);
        }
        switch (A0x) {
            case 6:
                return C282585Dv.A00(r4.A1P());
            case 7:
                return A03(r4, r5);
            case 8:
                return A02(r4, r5);
            case 9:
                return C361498gK.A02;
            case 10:
                return C361498gK.A01;
            case 11:
                return C383839gL.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return A00(r4);
            default:
                r5.A0T(r4, A0H());
                throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: X.4cw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: X.4cw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: X.4cw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: X.5Dv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: X.5Dw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: X.9gL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: X.8gK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: X.8gK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: X.9gL} */
    /* JADX WARNING: type inference failed for: r14v1, types: [X.5E9, X.4cx] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C252503pD A10(X.16F r17, X.C269674fV r18, X.C10942S1z r19, X.C268194cw r20) {
        /*
            r16 = this;
            r5 = r17
            boolean r0 = r5.A17()
            r4 = r16
            r6 = r18
            if (r0 == 0) goto L_0x009e
            java.lang.String r2 = r5.A1N()
        L_0x0010:
            X.4f9 r0 = r6.A02
            X.4fB r9 = r0.A07
        L_0x0014:
            r3 = r20
            if (r2 == 0) goto L_0x00b3
            X.16L r1 = r5.A1J()
            X.3pD r8 = r3.A04(r2)
            r7 = r19
            if (r8 == 0) goto L_0x0051
            boolean r0 = r8 instanceof X.C268194cw
            if (r0 == 0) goto L_0x0043
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x0051
            r0 = r8
            X.4cw r0 = (X.C268194cw) r0
            X.3pD r14 = r4.A10(r5, r6, r7, r0)
            if (r14 == r8) goto L_0x003e
        L_0x0035:
            if (r14 != 0) goto L_0x0039
            X.9gL r14 = X.C383839gL.A00
        L_0x0039:
            java.util.Map r0 = r3.A00
            r0.put(r2, r14)
        L_0x003e:
            java.lang.String r2 = r5.A1N()
            goto L_0x0014
        L_0x0043:
            boolean r0 = r8 instanceof X.AnonymousClass5E9
            if (r0 == 0) goto L_0x0051
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0051
            X.4cx r8 = (X.C268204cx) r8
            r4.A12(r5, r6, r7, r8, r9)
            goto L_0x003e
        L_0x0051:
            if (r1 != 0) goto L_0x0055
            X.16L r1 = X.16L.A0B
        L_0x0055:
            int r1 = r1.A00
            r0 = 1
            if (r1 == r0) goto L_0x0090
            r0 = 3
            if (r1 == r0) goto L_0x0082
            r0 = 6
            if (r1 == r0) goto L_0x0079
            r0 = 7
            if (r1 == r0) goto L_0x0074
            switch(r1) {
                case 9: goto L_0x006e;
                case 10: goto L_0x006b;
                case 11: goto L_0x0071;
                default: goto L_0x0066;
            }
        L_0x0066:
            X.3pD r14 = r4.A0z(r5, r6)
            goto L_0x0035
        L_0x006b:
            X.8gK r14 = X.C361498gK.A01
            goto L_0x0035
        L_0x006e:
            X.8gK r14 = X.C361498gK.A02
            goto L_0x0035
        L_0x0071:
            X.9gL r14 = X.C383839gL.A00
            goto L_0x0035
        L_0x0074:
            X.5Dw r14 = A03(r5, r6)
            goto L_0x0035
        L_0x0079:
            java.lang.String r0 = r5.A1P()
            X.5Dv r14 = X.C282585Dv.A00(r0)
            goto L_0x0035
        L_0x0082:
            X.5E9 r14 = new X.5E9
            r14.<init>(r9)
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r15 = r9
            r10.A12(r11, r12, r13, r14, r15)
            goto L_0x0035
        L_0x0090:
            X.4cw r14 = new X.4cw
            r14.<init>(r9)
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r15 = r9
            r10.A12(r11, r12, r13, r14, r15)
            goto L_0x0035
        L_0x009e:
            X.16L r0 = X.16L.A0A
            boolean r0 = r5.A19(r0)
            if (r0 != 0) goto L_0x00ad
            java.lang.Object r0 = r4.A0D(r5, r6)
            X.3pD r0 = (X.C252503pD) r0
            return r0
        L_0x00ad:
            java.lang.String r2 = r5.A0Y()
            goto L_0x0010
        L_0x00b3:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A10(X.16F, X.4fV, X.S1z, X.4cw):X.3pD");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.4cx] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268194cw A11(X.16F r15, X.C269674fV r16, X.C10942S1z r17, X.C269474fB r18) {
        /*
            r14 = this;
            X.4cw r6 = new X.4cw
            r5 = r18
            r6.<init>(r5)
            r9 = r15
            java.lang.String r7 = r15.A0Y()
        L_0x000c:
            if (r7 == 0) goto L_0x0050
            X.16L r0 = r15.A1J()
            if (r0 != 0) goto L_0x0016
            X.16L r0 = X.16L.A0B
        L_0x0016:
            int r1 = r0.A00
            r0 = 1
            r8 = r14
            r2 = r16
            if (r1 == r0) goto L_0x003c
            r0 = 3
            if (r1 == r0) goto L_0x0042
            X.3pD r4 = r14.A0y(r15, r2)
        L_0x0025:
            r1 = r4
            if (r4 != 0) goto L_0x002a
            X.9gL r1 = X.C383839gL.A00
        L_0x002a:
            java.util.Map r0 = r6.A00
            java.lang.Object r3 = r0.put(r7, r1)
            X.3pD r3 = (X.C252503pD) r3
            if (r3 == 0) goto L_0x0037
            A04(r2, r3, r4, r5, r6, r7)
        L_0x0037:
            java.lang.String r7 = r15.A1N()
            goto L_0x000c
        L_0x003c:
            X.4cw r4 = new X.4cw
            r4.<init>(r5)
            goto L_0x0047
        L_0x0042:
            X.5E9 r4 = new X.5E9
            r4.<init>(r5)
        L_0x0047:
            r11 = r17
            r10 = r2
            r12 = r4
            r13 = r5
            r8.A12(r9, r10, r11, r12, r13)
            goto L_0x0025
        L_0x0050:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A11(X.16F, X.4fV, X.S1z, X.4fB):X.4cw");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        r5.A0B(r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A12(X.16F r21, X.C269674fV r22, X.C10942S1z r23, X.C268204cx r24, X.C269474fB r25) {
        /*
            r20 = this;
            r8 = r22
            r10 = r24
            int r2 = r8.A01
            int r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A02
            r2 = r2 & r0
        L_0x0009:
            boolean r0 = r10 instanceof X.C268194cw
            r7 = 1
            r4 = r20
            r1 = r21
            r3 = r23
            r11 = r25
            if (r0 == 0) goto L_0x00a0
            r12 = r10
            X.4cw r12 = (X.C268194cw) r12
            java.lang.String r13 = r1.A1N()
            r6 = r10
        L_0x001e:
            if (r13 == 0) goto L_0x00fc
            X.16L r0 = r1.A1J()
            if (r0 != 0) goto L_0x0028
            X.16L r0 = X.16L.A0B
        L_0x0028:
            int r5 = r0.A00
            if (r5 == r7) goto L_0x007f
            r0 = 3
            if (r5 == r0) goto L_0x0069
            switch(r5) {
                case 6: goto L_0x004d;
                case 7: goto L_0x0056;
                case 8: goto L_0x005b;
                case 9: goto L_0x0060;
                case 10: goto L_0x0063;
                case 11: goto L_0x0066;
                default: goto L_0x0032;
            }
        L_0x0032:
            X.3pD r10 = r4.A0z(r1, r8)
        L_0x0036:
            r5 = r10
            if (r10 != 0) goto L_0x003b
            X.9gL r5 = X.C383839gL.A00
        L_0x003b:
            java.util.Map r0 = r12.A00
            java.lang.Object r9 = r0.put(r13, r5)
            X.3pD r9 = (X.C252503pD) r9
            if (r9 == 0) goto L_0x0048
            A04(r8, r9, r10, r11, r12, r13)
        L_0x0048:
            java.lang.String r13 = r1.A1N()
            goto L_0x001e
        L_0x004d:
            java.lang.String r0 = r1.A1P()
            X.5Dv r10 = X.C282585Dv.A00(r0)
            goto L_0x0036
        L_0x0056:
            X.5Dw r10 = A01(r1, r2)
            goto L_0x0036
        L_0x005b:
            X.5Dw r10 = A02(r1, r8)
            goto L_0x0036
        L_0x0060:
            X.8gK r10 = X.C361498gK.A02
            goto L_0x0036
        L_0x0063:
            X.8gK r10 = X.C361498gK.A01
            goto L_0x0036
        L_0x0066:
            X.9gL r10 = X.C383839gL.A00
            goto L_0x0036
        L_0x0069:
            X.5E9 r10 = new X.5E9
            r10.<init>(r11)
            java.util.Map r0 = r12.A00
            java.lang.Object r9 = r0.put(r13, r10)
            X.3pD r9 = (X.C252503pD) r9
            if (r9 == 0) goto L_0x007b
            A04(r8, r9, r10, r11, r12, r13)
        L_0x007b:
            r3.A00(r6)
            goto L_0x0009
        L_0x007f:
            r5 = r12
            X.4cw r12 = new X.4cw
            r12.<init>(r11)
            java.util.Map r0 = r5.A00
            java.lang.Object r15 = r0.put(r13, r12)
            X.3pD r15 = (X.C252503pD) r15
            if (r15 == 0) goto L_0x009b
            r14 = r8
            r16 = r12
            r17 = r11
            r19 = r13
            r18 = r5
            A04(r14, r15, r16, r17, r18, r19)
        L_0x009b:
            r3.A00(r6)
            r6 = r12
            goto L_0x0048
        L_0x00a0:
            r5 = r10
            X.5E9 r5 = (X.AnonymousClass5E9) r5
        L_0x00a3:
            X.16L r0 = r1.A1J()
            if (r0 != 0) goto L_0x00ab
            X.16L r0 = X.16L.A0B
        L_0x00ab:
            int r0 = r0.A00
            switch(r0) {
                case 1: goto L_0x00e6;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00ef;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00c4;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00d4;
                case 10: goto L_0x00da;
                case 11: goto L_0x00e0;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            X.3pD r0 = r4.A0z(r1, r8)
            r5.A0B(r0)
            goto L_0x00a3
        L_0x00b8:
            java.lang.String r0 = r1.A1P()
            X.5Dv r0 = X.C282585Dv.A00(r0)
            r5.A0B(r0)
            goto L_0x00a3
        L_0x00c4:
            X.5Dw r0 = A01(r1, r2)
            r5.A0B(r0)
            goto L_0x00a3
        L_0x00cc:
            X.5Dw r0 = A02(r1, r8)
            r5.A0B(r0)
            goto L_0x00a3
        L_0x00d4:
            X.8gK r0 = X.C361498gK.A02
            r5.A0B(r0)
            goto L_0x00a3
        L_0x00da:
            X.8gK r0 = X.C361498gK.A01
            r5.A0B(r0)
            goto L_0x00a3
        L_0x00e0:
            X.9gL r0 = X.C383839gL.A00
            r5.A0B(r0)
            goto L_0x00a3
        L_0x00e6:
            r3.A00(r10)
            X.4cw r10 = new X.4cw
            r10.<init>(r11)
            goto L_0x00f7
        L_0x00ef:
            r3.A00(r10)
            X.5E9 r10 = new X.5E9
            r10.<init>(r11)
        L_0x00f7:
            r5.A0B(r10)
            goto L_0x0009
        L_0x00fc:
            int r0 = r3.A00
            if (r0 == 0) goto L_0x010a
            X.4cx[] r1 = r3.A01
            int r0 = r0 + -1
            r3.A00 = r0
            r10 = r1[r0]
            if (r10 != 0) goto L_0x0009
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A12(X.16F, X.4fV, X.S1z, X.4cx, X.4fB):void");
    }

    public BaseNodeDeserializer(Boolean bool, Class cls) {
        super(cls);
        this.A00 = bool;
    }

    public static final C252503pD A00(16F r2) {
        Object A0V = r2.A0V();
        if (A0V == null) {
            return C383839gL.A00;
        }
        if (A0V.getClass() == byte[].class) {
            byte[] bArr = (byte[]) A0V;
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return C8237Qkk.A01;
            }
            return new C8237Qkk(bArr);
        } else if ((A0V instanceof C12438SuU) || !(A0V instanceof C252503pD)) {
            return new C8236Qkj(A0V);
        } else {
            return (C252503pD) A0V;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2.A0v() != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C282595Dw A02(X.16F r2, X.C269674fV r3) {
        /*
            java.lang.Integer r1 = r2.A0n()
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 == r0) goto L_0x002e
            X.4fA r0 = X.C269464fA.USE_BIG_DECIMAL_FOR_FLOATS
            boolean r0 = r3.A0j(r0)
            if (r0 == 0) goto L_0x0020
            boolean r0 = r2.A0v()
            if (r0 == 0) goto L_0x002e
        L_0x0016:
            double r0 = r2.A0g()
            X.9gG r2 = new X.9gG
            r2.<init>(r0)
            return r2
        L_0x0020:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0016
            float r0 = r2.A0h()
            X.9gH r2 = new X.9gH
            r2.<init>(r0)
            return r2
        L_0x002e:
            java.math.BigDecimal r1 = r2.A0r()
            if (r1 != 0) goto L_0x0037
            X.9gL r2 = X.C383839gL.A00
            return r2
        L_0x0037:
            int r0 = r1.signum()
            if (r0 != 0) goto L_0x0040
            X.9gK r2 = X.C383829gK.A01
            return r2
        L_0x0040:
            java.math.BigDecimal r1 = r1.stripTrailingZeros()     // Catch:{ ArithmeticException -> 0x0044 }
        L_0x0044:
            X.9gK r2 = new X.9gK
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A02(X.16F, X.4fV):X.5Dw");
    }

    public final C252503pD A0z(16F r3, C269674fV r4) {
        int A0x = r3.A0x();
        if (A0x == 2) {
            return new C268194cw(r4.A02.A07);
        }
        if (A0x == 8) {
            return A02(r3, r4);
        }
        if (A0x == 12) {
            return A00(r3);
        }
        r4.A0T(r3, A0H());
        throw AnonymousClass00P.createAndThrow();
    }
}
