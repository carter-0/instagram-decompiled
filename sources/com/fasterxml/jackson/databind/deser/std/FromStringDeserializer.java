package com.fasterxml.jackson.databind.deser.std;

import X.002;
import X.0cp;
import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C269574fL;
import X.C269674fV;
import X.C8194Qk1;
import X.JTQ;
import X.Pxe;
import com.instagram.react.modules.base.IgReactQEModule;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class FromStringDeserializer extends StdScalarDeserializer {

    public class Std extends FromStringDeserializer {
        public final int A00;

        public final Object A0K(C269674fV r3) {
            int i = this.A00;
            if (i == 3) {
                return URI.create("");
            }
            if (i != 8) {
                return BWm(r3);
            }
            return Locale.ROOT;
        }

        public final Object A10(C269674fV r10, String str) {
            int indexOf;
            int parseInt;
            switch (this.A00) {
                case 1:
                    return AnonymousClass7TE.A0t(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return r10.A02.A01.A07.A0D(str);
                    } catch (Exception e) {
                        e = e;
                        Class cls = this.A00;
                        Iterator it = C269574fL.A00;
                        while (e.getCause() != null) {
                            e = e.getCause();
                        }
                        r10.A0f(cls, e);
                        throw AnonymousClass00P.createAndThrow();
                    }
                case 5:
                    return r10.A05().A08(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int length = str.length();
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                        } else {
                            char charAt = str.charAt(i);
                            if (!(charAt == '_' || charAt == '-')) {
                                i++;
                            }
                        }
                    }
                    if (i < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, i);
                    String A0v = Pxe.A0v(i, str);
                    int length2 = A0v.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            i2 = -1;
                        } else {
                            char charAt2 = A0v.charAt(i2);
                            if (!(charAt2 == '_' || charAt2 == '-')) {
                                i2++;
                            }
                        }
                    }
                    if (i2 < 0) {
                        return new Locale(substring, A0v);
                    }
                    String substring2 = A0v.substring(0, i2);
                    int indexOf2 = A0v.indexOf("_#");
                    if (indexOf2 < 0) {
                        return new Locale(substring, substring2, Pxe.A0v(i2, A0v));
                    }
                    String str2 = "";
                    if (indexOf2 > 0 && indexOf2 > i2) {
                        try {
                            str2 = A0v.substring(i2 + 1, indexOf2);
                        } catch (IllformedLocaleException unused) {
                            return new Locale(substring, substring2, str2);
                        }
                    }
                    String substring3 = A0v.substring(indexOf2 + 2);
                    int indexOf3 = substring3.indexOf(95);
                    if (indexOf3 < 0 && substring3.indexOf(45) < 0) {
                        return new Locale.Builder().setLanguage(substring).setRegion(substring2).setVariant(str2).setScript(substring3).build();
                    }
                    if (indexOf3 >= 0) {
                        return new Locale.Builder().setLanguage(substring).setRegion(substring2).setVariant(str2).setScript(substring3.substring(0, indexOf3)).setExtension(substring3.charAt(indexOf3 + 1), substring3.substring(indexOf3 + 3)).build();
                    }
                    return new Locale.Builder().setLanguage(substring).setRegion(substring2).setVariant(str2).setExtension(substring3.charAt(0), Pxe.A0v(substring3.indexOf(45), substring3)).build();
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf != -1) {
                            int indexOf4 = str.indexOf(58, lastIndexOf);
                            if (indexOf4 > -1) {
                                parseInt = Integer.parseInt(Pxe.A0v(indexOf4, str));
                            } else {
                                parseInt = 0;
                            }
                            indexOf = lastIndexOf + 1;
                        } else {
                            throw new C8194Qk1(r10.A07, str, "Bracketed IPv6 address must contain closing bracket");
                        }
                    } else {
                        indexOf = str.indexOf(58);
                        if (indexOf >= 0) {
                            int i3 = indexOf + 1;
                            if (str.indexOf(58, i3) < 0) {
                                parseInt = Integer.parseInt(str.substring(i3));
                            }
                        }
                        return new InetSocketAddress(str, 0);
                    }
                    return new InetSocketAddress(str.substring(0, indexOf), parseInt);
                default:
                    throw AnonymousClass7TE.A15("Internal error: this code path should never get executed");
            }
        }

        public final boolean A11() {
            return JTQ.A1O(this.A00, 7);
        }

        public Std(Class cls, int i) {
            super(cls);
            this.A00 = i;
        }

        public final Object A0y(C269674fV r2) {
            return A0K(r2);
        }
    }

    public class StringBufferDeserializer extends FromStringDeserializer {
        public StringBufferDeserializer() {
            super(StringBuffer.class);
        }

        public final Integer A0I() {
            return AnonymousClass05K.A1I;
        }

        public final Object A0K(C269674fV r2) {
            return new StringBuffer();
        }

        public final Object A10(C269674fV r2, String str) {
            return new StringBuffer(str);
        }

        public final Object A0D(16F r3, C269674fV r4) {
            String A1Q = r3.A1Q();
            if (A1Q != null) {
                return new StringBuffer(A1Q);
            }
            return FromStringDeserializer.super.A0D(r3, r4);
        }
    }

    public class StringBuilderDeserializer extends FromStringDeserializer {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }

        public final Integer A0I() {
            return AnonymousClass05K.A1I;
        }

        public final Object A0D(16F r2, C269674fV r3) {
            String A1Q = r2.A1Q();
            if (A1Q != null) {
                return Pxe.A16(A1Q);
            }
            return FromStringDeserializer.super.A0D(r2, r3);
        }

        public final Object A0K(C269674fV r2) {
            return AnonymousClass7TE.A1A();
        }

        public final Object A10(C269674fV r2, String str) {
            return Pxe.A16(str);
        }
    }

    public boolean A11() {
        return true;
    }

    public Object A0D(16F r6, C269674fV r7) {
        String A1Q = r6.A1Q();
        if (A1Q == null) {
            16L A10 = r6.A10();
            if (A10 != 16L.A0D) {
                if (A10 == 16L.A0C) {
                    return A0h(r6, r7);
                }
                if (A10 == 16L.A0E) {
                    Object A0V = r6.A0V();
                    if (A0V == null) {
                        return null;
                    }
                    if (!this.A00.isAssignableFrom(A0V.getClass())) {
                        return A0z(r7, A0V);
                    }
                    return A0V;
                }
            }
            r7.A0T(r6, this.A00);
        } else {
            if (!A1Q.isEmpty()) {
                if (A11()) {
                    String trim = A1Q.trim();
                    if (trim == A1Q || !trim.isEmpty()) {
                        A1Q = trim;
                    }
                }
                try {
                    return A10(r7, A1Q);
                } catch (IllegalArgumentException | MalformedURLException e) {
                    String str = "not a valid textual representation";
                    String message = e.getMessage();
                    if (message != null) {
                        str = 002.A0g(str, ", problem: ", message);
                    }
                    C8194Qk1 A0J = r7.A0J(this.A00, A1Q, str);
                    A0J.initCause(e);
                    throw A0J;
                }
            }
            Integer A0N = r7.A0N(A0I(), AnonymousClass05K.A1I);
            if (A0N == AnonymousClass05K.A00) {
                r7.A0h("Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", A0k());
            } else if (A0N == AnonymousClass05K.A0C) {
                return BWm(r7);
            } else {
                if (A0N == AnonymousClass05K.A0N) {
                    return A0K(r7);
                }
                return A0y(r7);
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A0y(C269674fV r2) {
        return BWm(r2);
    }

    public Object A0z(C269674fV r3, Object obj) {
        r3.A0h("Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.A00.getName());
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A10(C269674fV r2, String str) {
        return 0cp.A03(str);
    }
}
