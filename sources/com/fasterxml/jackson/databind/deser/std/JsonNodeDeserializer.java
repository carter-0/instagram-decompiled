package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass5E9;
import X.AnonymousClass7TE;
import X.C252503pD;
import X.C268194cw;
import X.C268204cx;
import X.C269474fB;
import X.C269674fV;

public class JsonNodeDeserializer extends BaseNodeDeserializer {
    public static final JsonNodeDeserializer A00 = new JsonNodeDeserializer();

    public final class ArrayDeserializer extends BaseNodeDeserializer {
        public static final ArrayDeserializer A00 = new ArrayDeserializer();

        /* JADX WARNING: type inference failed for: r3v0, types: [X.S1z, java.lang.Object] */
        public final /* bridge */ /* synthetic */ Object A0C(16F r7, C269674fV r8, Object obj) {
            C268204cx r4 = (C268204cx) obj;
            16F r1 = r7;
            C269674fV r2 = r8;
            if (r7.A16()) {
                A12(r1, r2, new Object(), r4, r8.A02.A07);
                return r4;
            }
            r8.A0T(r7, AnonymousClass5E9.class);
            throw AnonymousClass00P.createAndThrow();
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [X.S1z, java.lang.Object] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r7, C269674fV r8) {
            16F r1 = r7;
            C269674fV r2 = r8;
            if (r7.A16()) {
                C269474fB r5 = r8.A02.A07;
                AnonymousClass5E9 r4 = new AnonymousClass5E9(r5);
                A12(r1, r2, new Object(), r4, r5);
                return r4;
            }
            r8.A0T(r7, AnonymousClass5E9.class);
            throw AnonymousClass00P.createAndThrow();
        }

        public ArrayDeserializer() {
            super(AnonymousClass7TE.A0v(), AnonymousClass5E9.class);
        }
    }

    public final class ObjectDeserializer extends BaseNodeDeserializer {
        public static final ObjectDeserializer A00 = new ObjectDeserializer();

        /* JADX WARNING: type inference failed for: r0v8, types: [X.S1z, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r4v0, types: [X.S1z, java.lang.Object] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r8, C269674fV r9) {
            C269674fV r3 = r9;
            C269474fB r6 = r9.A02.A07;
            16F r2 = r8;
            if (r8.A17()) {
                C268194cw r5 = new C268194cw(r6);
                A12(r2, r3, new Object(), r5, r6);
                return r5;
            } else if (r8.A19(16L.A0A)) {
                return A11(r8, r9, new Object(), r6);
            } else {
                if (r8.A19(16L.A09)) {
                    return new C268194cw(r6);
                }
                r9.A0T(r8, C268194cw.class);
                throw AnonymousClass00P.createAndThrow();
            }
        }

        public ObjectDeserializer() {
            super(AnonymousClass7TE.A0v(), C268194cw.class);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [X.S1z, java.lang.Object] */
        public final /* bridge */ /* synthetic */ Object A0C(16F r2, C269674fV r3, Object obj) {
            C268194cw r4 = (C268194cw) obj;
            if (r2.A17() || r2.A19(16L.A0A)) {
                return A10(r2, r3, new Object(), r4);
            }
            r3.A0T(r2, C268194cw.class);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public JsonNodeDeserializer() {
        super((Boolean) null, C252503pD.class);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.S1z, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A0D(16F r9, C269674fV r10) {
        C268204cx r6;
        ? obj = new Object();
        C269674fV r4 = r10;
        C269474fB r7 = r10.A02.A07;
        16F r3 = r9;
        int A0x = r9.A0x();
        if (A0x == 1) {
            r6 = new C268194cw(r7);
        } else if (A0x == 2) {
            return new C268194cw(r7);
        } else {
            if (A0x == 3) {
                r6 = new AnonymousClass5E9(r7);
            } else if (A0x != 5) {
                return A0y(r9, r10);
            } else {
                return A11(r9, r10, obj, r7);
            }
        }
        A12(r3, r4, obj, r6, r7);
        return r6;
    }
}
