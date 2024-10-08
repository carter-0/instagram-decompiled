package com.fasterxml.jackson.databind.deser.std;

import X.002;
import X.16F;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C269674fV;
import X.Pxf;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class NumberDeserializers$CharacterDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$CharacterDeserializer A00;
    public static final NumberDeserializers$CharacterDeserializer A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer] */
    static {
        Class cls = Character.TYPE;
        Integer num = AnonymousClass05K.A0j;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, 0, 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Character.class, num, (Object) null, 0);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
        char c;
        int A0x = r6.A0x();
        if (A0x == 1) {
            r7.A0T(r6, this.A00);
        } else if (A0x == 3) {
            return A0h(r6, r7);
        } else {
            if (A0x != 11) {
                if (A0x == 6) {
                    String A1P = r6.A1P();
                    if (A1P.length() == 1) {
                        c = A1P.charAt(0);
                    } else {
                        Integer A0f = A0f(r7, A1P);
                        if (A0f != AnonymousClass05K.A0C) {
                            if (A0f != AnonymousClass05K.A0N) {
                                String trim = A1P.trim();
                                if (!A0x(r7, trim)) {
                                    r7.A0e(A0H(), trim, "Expected either Integer value code or 1-character String", new Object[0]);
                                }
                            }
                            return this.A01;
                        }
                    }
                } else if (A0x != 7) {
                    Pxf.A1G(r6, r7, this);
                } else {
                    Integer A0N = r7.A0N(this.A00, AnonymousClass05K.A0C);
                    int intValue = A0N.intValue();
                    if (intValue == 0) {
                        A0u(r7, A0N, r6.A0p(), 002.A0g("Integer value (", r6.A1P(), ")"));
                    } else if (intValue != 2) {
                        if (intValue != 3) {
                            int A0i = r6.A0i();
                            if (A0i < 0 || A0i > 65535) {
                                r7.A0c(A0H(), Integer.valueOf(A0i), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                            } else {
                                c = (char) A0i;
                            }
                        }
                        return this.A01;
                    }
                }
                return Character.valueOf(c);
            } else if (this.A03) {
                A0s(r7);
            }
            return BWm(r7);
        }
        throw AnonymousClass00P.createAndThrow();
    }
}
