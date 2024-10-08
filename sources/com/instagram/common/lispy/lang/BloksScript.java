package com.instagram.common.lispy.lang;

import X.AnonymousClass6Tr;
import X.C276634te;
import X.C277004uH;
import X.C277014uI;
import X.C277024uJ;
import X.C277044uL;
import X.C308306Tt;
import java.util.List;

public final class BloksScript implements C277004uH {
    public final int A00;
    public final C277044uL A01;
    public final C277024uJ A02;

    public final /* bridge */ /* synthetic */ C277014uI AKh(C276634te r2, List list) {
        return A00(r2, (List) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r3 == r4) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.common.lispy.lang.BloksScript A00(X.C276634te r6, java.util.List r7) {
        /*
            r5 = this;
            X.4uL r4 = r5.A01
            r0 = 0
            if (r4 == 0) goto L_0x0020
            X.4te r2 = r4.A00
            r1 = r2
            if (r6 == 0) goto L_0x0010
            if (r2 == 0) goto L_0x0010
            X.4te r2 = r2.ClQ(r6)
        L_0x0010:
            java.util.List r0 = r4.A01
            if (r7 != r0) goto L_0x001a
            if (r2 != r1) goto L_0x001a
            r3 = r4
        L_0x0017:
            if (r3 != r4) goto L_0x0027
        L_0x0019:
            return r5
        L_0x001a:
            X.4uL r3 = new X.4uL
            r3.<init>(r2, r7)
            goto L_0x0017
        L_0x0020:
            if (r7 == 0) goto L_0x0019
            X.4uL r3 = new X.4uL
            r3.<init>(r0, r7)
        L_0x0027:
            X.4uJ r2 = r5.A02
            int r1 = r5.A00
            com.instagram.common.lispy.lang.BloksScript r0 = new com.instagram.common.lispy.lang.BloksScript
            r0.<init>(r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.lispy.lang.BloksScript.A00(X.4te, java.util.List):com.instagram.common.lispy.lang.BloksScript");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.6Tq[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.6Tq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: X.6Tq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.6Tq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.6Tq} */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.6Tq, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ASe(X.C307906Ry r19) {
        /*
            r18 = this;
            r0 = r18
            X.4uJ r5 = r0.A02
            X.4uK r4 = r5.A00
            X.6Tr r1 = r4.A00
            r0 = 0
            if (r1 == 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01b4
            if (r1 != 0) goto L_0x01b2
            java.lang.String r1 = r4.A01
            r9 = 0
            java.lang.String r0 = "lispx"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 15
            java.lang.String r1 = r1.substring(r0)
        L_0x0029:
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x019a }
            com.facebook.minscript.compiler.interfaces.MinsCompilerResult r2 = com.facebook.minscript.compiler.MinsCompilerImpl$Helper.doCompileWithLispyOffsets(r0, r9, r9)     // Catch:{ UnsupportedEncodingException -> 0x019a }
            java.nio.ByteBuffer r1 = r2.byteBuffer
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r1.order(r0)
            java.nio.ByteBuffer r3 = r2.byteBuffer
            java.util.HashMap r14 = r2.lispyOffsetMap
            java.nio.ByteBuffer r13 = r3.slice()
            java.nio.ByteOrder r0 = r3.order()
            r13.order(r0)
            int r6 = r3.capacity()
            int r2 = r13.getInt()
            short r7 = r13.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r1
            short r0 = r13.getShort()
            r1 = r1 & r0
            r0 = -1397639502(0xffffffffacb1b6b2, float:-5.050926E-12)
            if (r2 != r0) goto L_0x0192
            r2 = 1
            if (r7 != r2) goto L_0x0192
            if (r1 != 0) goto L_0x0192
            int r10 = r13.getInt()
            int r8 = r13.getInt()
            int r12 = r3.position()
            if (r10 > r6) goto L_0x015b
            if (r10 < r12) goto L_0x0153
            int r0 = r8 * 16
            int r12 = r12 + r0
            if (r12 > r10) goto L_0x014b
            X.6Tq[] r7 = new X.C308286Tq[r8]
            r11 = 0
        L_0x0082:
            r6 = 4
            if (r11 >= r8) goto L_0x00e5
            X.6Tq r3 = new X.6Tq
            r3.<init>()
            int r0 = r13.getInt()
            r3.A00 = r0
            int r0 = r13.getInt()
            r3.A02 = r0
            int r0 = r13.getInt()
            r3.A01 = r0
            r13.getInt()
            int r1 = r3.A02
            int r0 = r1 % r6
            if (r0 != 0) goto L_0x00cb
            int r0 = r3.A01
            if (r12 > r1) goto L_0x00b1
            int r1 = r1 + r0
            if (r1 > r10) goto L_0x00b1
            r7[r11] = r3
            int r11 = r11 + 1
            goto L_0x0082
        L_0x00b1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "section index %d kind %d invalid offset/size"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.6U0 r0 = new X.6U0
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00cb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "section index %d kind %d invalid alignment"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.6U0 r0 = new X.6U0
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00e5:
            if (r8 < r6) goto L_0x0143
            r1 = 0
        L_0x00e8:
            r0 = r7[r1]
            int r0 = r0.A00
            if (r0 != r1) goto L_0x0137
            int r1 = r1 + 1
            if (r1 < r6) goto L_0x00e8
            r0 = r7[r9]
            int r0 = r0.A01
            int r0 = r0 / 16
            java.util.concurrent.atomic.AtomicReferenceArray r15 = new java.util.concurrent.atomic.AtomicReferenceArray
            r15.<init>(r0)
            r0 = r7[r2]
            int r0 = r0.A01
            int r0 = r0 / 16
            java.util.concurrent.atomic.AtomicReferenceArray r3 = new java.util.concurrent.atomic.AtomicReferenceArray
            r3.<init>(r0)
            java.lang.String r12 = ""
            r2 = 4
        L_0x010b:
            if (r2 >= r8) goto L_0x01a1
            r10 = r7[r2]
            int r0 = r10.A00
            if (r0 != r6) goto L_0x0134
            java.nio.ByteBuffer r9 = r13.duplicate()
            int r0 = r10.A02
            r9.position(r0)
            int r1 = r10.A02
            int r0 = r10.A01
            int r1 = r1 + r0
            r9.limit(r1)
            int r0 = r9.remaining()
            byte[] r1 = new byte[r0]
            r9.get(r1)
            java.nio.charset.Charset r0 = X.AnonymousClass6Tr.A06
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1, r0)
        L_0x0134:
            int r2 = r2 + 1
            goto L_0x010b
        L_0x0137:
            java.lang.String r0 = "missing required section "
            java.lang.String r1 = X.002.A0O(r0, r1)
            X.6U0 r0 = new X.6U0
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0143:
            java.lang.String r1 = "less than required number of sections"
            X.6U0 r0 = new X.6U0
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x014b:
            java.lang.String r1 = "encoded size not enough for section headers"
            X.6U0 r0 = new X.6U0
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0153:
            java.lang.String r1 = "encoded size is too small"
            X.6U0 r0 = new X.6U0
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x015b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "buffer is smaller than encoded size "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " byteBuffer.order:"
            r1.append(r0)
            java.nio.ByteOrder r0 = r3.order()
            r1.append(r0)
            java.lang.String r0 = " native order:"
            r1.append(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.6U0 r0 = new X.6U0
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0192:
            java.lang.String r1 = "invalid magic or version"
            X.6U0 r0 = new X.6U0
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x019a:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01a1:
            X.6Tr r11 = new X.6Tr
            r17 = r7
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.4uJ r1 = r4.A02
            r0 = 0
            X.4uK r4 = new X.4uK
            r4.<init>(r1, r11, r0)
        L_0x01b2:
            r5.A00 = r4
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.lispy.lang.BloksScript.ASe(X.6Ry):void");
    }

    public final String Bq3() {
        AnonymousClass6Tr r0 = this.A02.A00.A00;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final C276634te Bxl() {
        C277044uL r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public final C308306Tt FJJ() {
        C277024uJ r0 = this.A02;
        C277044uL r3 = this.A01;
        AnonymousClass6Tr r1 = r0.A00.A00;
        if (r1 != null) {
            return new C308306Tt(r1.A00(0), r3, (Object[]) null, (Object[]) null);
        }
        throw new IllegalStateException("getMinsClosure() was called while minsClosure is null. This normally happens when getMinsClosure() is called before calling \"ensurePrepared()\" method");
    }

    public BloksScript(C277024uJ r1, C277044uL r2, int i) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.4uJ] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BloksScript(X.C276634te r4, java.lang.String r5, java.util.List r6, int r7) {
        /*
            r3 = this;
            r2 = 0
            X.4uJ r1 = new X.4uJ
            r1.<init>()
            X.4uK r0 = new X.4uK
            r0.<init>(r1, r2, r5)
            r1.A00 = r0
            if (r6 != 0) goto L_0x0016
            if (r4 != 0) goto L_0x0016
            r0 = 0
        L_0x0012:
            r3.<init>(r1, r0, r7)
            return
        L_0x0016:
            X.4uL r0 = new X.4uL
            r0.<init>(r4, r6)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.lispy.lang.BloksScript.<init>(X.4te, java.lang.String, java.util.List, int):void");
    }
}
