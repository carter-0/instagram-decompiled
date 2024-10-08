package com.fasterxml.jackson.databind.jsontype.impl;

import X.C13733Tg5;
import X.C13805ThU;
import X.REQ;
import X.RFD;

public class StdTypeResolverBuilder implements C13733Tg5 {
    public C13805ThU _customIdResolver;
    public Class _defaultImpl;
    public RFD _idType;
    public REQ _includeAs;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.4eQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.4eQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.4eQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.4eQ} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009f, code lost:
        if (r4 == r15._defaultImpl) goto L_0x00a1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8225QkY AEd(X.C269454f9 r16, X.C268894eF r17, java.util.Collection r18) {
        /*
            r15 = this;
            r8 = r15
            X.RFD r1 = r15._idType
            X.RFD r0 = X.RFD.NONE
            r2 = 0
            if (r1 == r0) goto L_0x00fb
            r9 = r17
            java.lang.Class r4 = r9.A00
            boolean r0 = r4.isPrimitive()
            if (r0 != 0) goto L_0x00fb
            r10 = r16
            X.4eS r5 = r10.A01
            X.4eQ r11 = r5.A05
            X.4eO r0 = X.C268984eO.A00
            if (r11 != r0) goto L_0x002e
            X.4ez r0 = X.C269354ez.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES
            long r2 = r10.A00
            long r0 = r0.A00
            long r2 = r2 & r0
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            X.QkS r11 = new X.QkS
            r11.<init>()
        L_0x002e:
            X.RFD r1 = r15._idType
            X.RFD r0 = X.RFD.CLASS
            if (r1 == r0) goto L_0x0038
            X.RFD r0 = X.RFD.MINIMAL_CLASS
            if (r1 != r0) goto L_0x0053
        L_0x0038:
            java.lang.Integer r1 = r11.A01(r9, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0053
            java.lang.String r1 = X.C269574fL.A07(r11)
            java.lang.String r0 = X.C269574fL.A07(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s"
            java.lang.IllegalArgumentException r0 = X.Pxf.A0X(r0, r1)
            throw r0
        L_0x0053:
            r13 = 0
            r14 = 1
            r2 = 2
            r12 = r18
            X.ThU r6 = r8.A00(r9, r10, r11, r12, r13, r14)
            java.lang.Class r1 = r15._defaultImpl
            if (r1 == 0) goto L_0x008e
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r1 == r0) goto L_0x0087
            java.lang.Class<X.Ref> r0 = X.C9661Ref.class
            if (r1 == r0) goto L_0x0087
            if (r4 == r1) goto L_0x00a1
            boolean r0 = r4.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x009d
            X.4eE r1 = r5.A07
            java.lang.Class r0 = r15._defaultImpl
            X.4eF r5 = r1.A05(r9, r0, r13)
        L_0x0078:
            X.RFD r1 = r15._idType
            X.RFD r0 = X.RFD.DEDUCTION
            if (r1 != r0) goto L_0x00a5
            X.QkU r2 = new X.QkU
            r3 = r10
            r4 = r9
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x0087:
            X.4eE r0 = r5.A07
            X.4eF r5 = r0.A09(r1)
            goto L_0x0078
        L_0x008e:
            X.4ez r0 = X.C269354ez.USE_BASE_TYPE_AS_DEFAULT_IMPL
            boolean r0 = r10.A09(r0)
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r9.A0L()
            if (r0 != 0) goto L_0x00a3
            goto L_0x00a1
        L_0x009d:
            java.lang.Class r0 = r15._defaultImpl
            if (r4 != r0) goto L_0x008e
        L_0x00a1:
            r5 = r9
            goto L_0x0078
        L_0x00a3:
            r5 = 0
            goto L_0x0078
        L_0x00a5:
            X.REQ r3 = r15._includeAs
            int r1 = r3.ordinal()
            if (r1 == r2) goto L_0x00ed
            if (r1 == r13) goto L_0x00e0
            if (r1 == r14) goto L_0x00d1
            r0 = 3
            if (r1 == r0) goto L_0x00c2
            r0 = 4
            if (r1 == r0) goto L_0x00e0
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Do not know how to construct standard type serializer for inclusion type: "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r3, r0, r1)
            throw r0
        L_0x00c2:
            java.lang.String r1 = r15._typeProperty
            boolean r0 = r15._typeIdVisible
            X.QkT r2 = new X.QkT
            r3 = r9
            r4 = r5
            r5 = r6
            r6 = r1
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x00d1:
            java.lang.String r1 = r15._typeProperty
            boolean r0 = r15._typeIdVisible
            X.QkX r2 = new X.QkX
            r3 = r9
            r4 = r5
            r5 = r6
            r6 = r1
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x00e0:
            java.lang.String r1 = r15._typeProperty
            boolean r0 = r15._typeIdVisible
            X.QkV r2 = new X.QkV
            r4 = r9
            r7 = r1
            r8 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L_0x00ed:
            java.lang.String r1 = r15._typeProperty
            boolean r0 = r15._typeIdVisible
            X.QkW r2 = new X.QkW
            r3 = r9
            r4 = r5
            r5 = r6
            r6 = r1
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x00fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.AEd(X.4f9, X.4eF, java.util.Collection):X.QkY");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.4eQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.4eQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.4eQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.4eQ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8233Qkg AEe(X.C268894eF r15, X.C269294et r16, java.util.Collection r17) {
        /*
            r14 = this;
            r7 = r14
            X.RFD r1 = r14._idType
            X.RFD r0 = X.RFD.NONE
            r4 = 0
            if (r1 == r0) goto L_0x007d
            r8 = r15
            java.lang.Class r0 = r15.A00
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L_0x007d
            r9 = r16
            X.4eS r0 = r9.A01
            X.4eQ r10 = r0.A05
            X.4eO r0 = X.C268984eO.A00
            if (r10 != r0) goto L_0x002d
            X.4ez r0 = X.C269354ez.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES
            long r2 = r9.A00
            long r0 = r0.A00
            long r2 = r2 & r0
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
            X.QkS r10 = new X.QkS
            r10.<init>()
        L_0x002d:
            r12 = 1
            r5 = 2
            r13 = 0
            r11 = r17
            X.ThU r3 = r7.A00(r8, r9, r10, r11, r12, r13)
            X.RFD r1 = r14._idType
            X.RFD r0 = X.RFD.DEDUCTION
            if (r1 == r0) goto L_0x0075
            X.REQ r2 = r14._includeAs
            int r1 = r2.ordinal()
            if (r1 == r5) goto L_0x006f
            if (r1 == r13) goto L_0x0067
            if (r1 == r12) goto L_0x0061
            r0 = 3
            if (r1 == r0) goto L_0x0059
            r0 = 4
            if (r1 == r0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Do not know how to construct standard type serializer for inclusion type: "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r2, r0, r1)
            throw r0
        L_0x0059:
            java.lang.String r0 = r14._typeProperty
            X.Qkf r1 = new X.Qkf
            r1.<init>(r4, r3, r0)
            return r1
        L_0x0061:
            X.Qke r1 = new X.Qke
            r1.<init>(r4, r3)
            return r1
        L_0x0067:
            java.lang.String r0 = r14._typeProperty
            X.Qki r1 = new X.Qki
            r1.<init>(r4, r3, r0)
            return r1
        L_0x006f:
            X.Qkd r1 = new X.Qkd
            r1.<init>(r4, r3)
            return r1
        L_0x0075:
            java.lang.String r0 = r14._typeProperty
            X.QkZ r1 = new X.QkZ
            r1.<init>(r4, r3, r0)
            return r1
        L_0x007d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.AEe(X.4eF, X.4et, java.util.Collection):X.Qkg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r1 = r4.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C13805ThU A00(X.C268894eF r8, X.C269144ee r9, X.C269004eQ r10, java.util.Collection r11, boolean r12, boolean r13) {
        /*
            r7 = this;
            X.ThU r0 = r7._customIdResolver
            if (r0 != 0) goto L_0x001c
            X.RFD r2 = r7._idType
            if (r2 == 0) goto L_0x00b4
            int r1 = r2.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x00aa
            r0 = 1
            if (r1 == r0) goto L_0x00aa
            r0 = 2
            if (r1 == r0) goto L_0x00a0
            r0 = 3
            if (r1 == r0) goto L_0x0028
            r0 = 0
            if (r1 != r0) goto L_0x001d
            r0 = 0
        L_0x001c:
            return r0
        L_0x001d:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Do not know how to construct standard type id resolver for idType: "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r2, r0, r1)
            throw r0
        L_0x0028:
            if (r12 == r13) goto L_0x009b
            if (r12 == 0) goto L_0x008a
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r2 = 0
        L_0x0032:
            X.4ez r0 = X.C269354ez.ACCEPT_CASE_INSENSITIVE_VALUES
            boolean r6 = r9.A09(r0)
            if (r11 == 0) goto L_0x0095
            java.util.Iterator r5 = r11.iterator()
        L_0x003e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r5.next()
            X.T9Y r0 = (X.T9Y) r0
            java.lang.Class r4 = r0.A01
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x0060
            java.lang.String r1 = r4.getName()
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L_0x0060
            java.lang.String r1 = X.Pxe.A0v(r0, r1)
        L_0x0060:
            if (r12 == 0) goto L_0x0065
            X.Pxe.A1V(r4, r1, r3)
        L_0x0065:
            if (r13 == 0) goto L_0x003e
            if (r6 == 0) goto L_0x006d
            java.lang.String r1 = r1.toLowerCase()
        L_0x006d:
            java.lang.Object r0 = r2.get(r1)
            X.4eF r0 = (X.C268894eF) r0
            if (r0 == 0) goto L_0x007e
            java.lang.Class r0 = r0.A00
            boolean r0 = r4.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x007e
            goto L_0x003e
        L_0x007e:
            X.4eS r0 = r9.A01
            X.4eE r0 = r0.A07
            X.4eF r0 = r0.A09(r4)
            r2.put(r1, r0)
            goto L_0x003e
        L_0x008a:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            r0 = 4
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>(r0)
            goto L_0x0032
        L_0x0095:
            X.Qkc r1 = new X.Qkc
            r1.<init>(r8, r9, r2, r3)
            return r1
        L_0x009b:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()
            throw r0
        L_0x00a0:
            X.4eS r0 = r9.A01
            X.4eE r0 = r0.A07
            X.Qka r1 = new X.Qka
            r1.<init>(r8, r10, r0)
            return r1
        L_0x00aa:
            X.4eS r0 = r9.A01
            X.4eE r0 = r0.A07
            X.Qkb r1 = new X.Qkb
            r1.<init>(r8, r10, r0)
            return r1
        L_0x00b4:
            java.lang.String r0 = "Cannot build, 'init()' not yet called"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.A00(X.4eF, X.4ee, X.4eQ, java.util.Collection, boolean, boolean):X.ThU");
    }
}
