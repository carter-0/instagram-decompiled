package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.C269464fA;
import X.C269674fV;

public class StackTraceElementDeserializer extends StdScalarDeserializer {
    public StackTraceElementDeserializer() {
        super(StackTraceElement.class);
    }

    /* renamed from: A0y */
    public final StackTraceElement A0D(16F r8, C269674fV r9) {
        16L A10 = r8.A10();
        if (A10 == 16L.A0D) {
            String str = "";
            String str2 = str;
            String str3 = str;
            int i = -1;
            while (true) {
                16L A12 = r8.A12();
                if (A12 == 16L.A09) {
                    return new StackTraceElement(str, str2, str3, i);
                }
                String A0Y = r8.A0Y();
                if ("className".equals(A0Y)) {
                    str = r8.A1P();
                } else {
                    if (!"classLoaderName".equals(A0Y)) {
                        if ("fileName".equals(A0Y)) {
                            str3 = r8.A1P();
                        } else if ("lineNumber".equals(A0Y)) {
                            if (A12.A02) {
                                i = r8.A0i();
                            } else {
                                i = A0Q(r8, r9);
                            }
                        } else if ("methodName".equals(A0Y)) {
                            str2 = r8.A1P();
                        } else if (!"nativeMethod".equals(A0Y)) {
                            if (!"moduleName".equals(A0Y) && !"moduleVersion".equals(A0Y)) {
                                if (!AnonymousClass000.A00(2976).equals(A0Y) && !"format".equals(A0Y)) {
                                    A0r(r8, r9, this.A00, A0Y);
                                }
                            }
                        }
                    }
                    r8.A1P();
                }
                r8.A0z();
            }
        } else {
            if (A10 != 16L.A0C || !r9.A0j(C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                r9.A0T(r8, this.A00);
            } else {
                r8.A1J();
                StackTraceElement A0y = A0D(r8, r9);
                if (r8.A1J() == 16L.A08) {
                    return A0y;
                }
                A0t(r9);
            }
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
