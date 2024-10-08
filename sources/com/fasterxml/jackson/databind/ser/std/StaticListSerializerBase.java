package com.fasterxml.jackson.databind.ser.std;

import X.C269504fE;
import X.C269714fZ;
import java.util.Collection;

public abstract class StaticListSerializerBase extends StdSerializer implements C269714fZ {
    public final Boolean A00;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r7, X.C269504fE r8) {
        /*
            r6 = this;
            r3 = 0
            if (r7 == 0) goto L_0x0044
            X.4et r0 = r8.A05
            X.4eA r0 = r0.A01()
            X.QkH r1 = r7.BRS()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r0 = r0.A0X(r1)
            if (r0 == 0) goto L_0x0044
            com.fasterxml.jackson.databind.JsonSerializer r2 = r8.A0M(r1, r0)
        L_0x0019:
            java.lang.Class r0 = r6.A00
            X.4ev r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r7, r8, r0)
            if (r1 == 0) goto L_0x0042
            X.RDC r0 = X.RDC.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r1.A01(r0)
        L_0x0027:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.A0C(r7, r2, r8)
            if (r2 != 0) goto L_0x0033
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.fasterxml.jackson.databind.JsonSerializer r2 = r8.A0G(r7, r0)
        L_0x0033:
            boolean r0 = X.C269574fL.A0K(r2)
            if (r0 == 0) goto L_0x0056
            java.lang.Boolean r0 = r6.A00
            boolean r0 = X.2Ob.A00(r1, r0)
            if (r0 == 0) goto L_0x0046
            return r6
        L_0x0042:
            r1 = r3
            goto L_0x0027
        L_0x0044:
            r2 = r3
            goto L_0x0019
        L_0x0046:
            boolean r0 = r6 instanceof com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer
            if (r0 == 0) goto L_0x0050
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer
            r0.<init>(r6, r1)
            return r0
        L_0x0050:
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer
            r0.<init>(r6, r1)
            return r0
        L_0x0056:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.4eE r0 = r8.A05()
            X.4eF r1 = r0.A09(r1)
            r5 = 1
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r0 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            r0.<init>((X.C268894eF) r1, (com.fasterxml.jackson.databind.JsonSerializer) r2, (X.SPK) r3, (java.lang.Class) r4, (boolean) r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r3, Object obj) {
        Collection collection = (Collection) obj;
        if (collection == null || collection.size() == 0) {
            return true;
        }
        return false;
    }

    public StaticListSerializerBase(StaticListSerializerBase staticListSerializerBase, Boolean bool) {
        super((StdSerializer) staticListSerializerBase);
        this.A00 = bool;
    }

    public StaticListSerializerBase(Class cls) {
        super(cls, false);
        this.A00 = null;
    }
}
