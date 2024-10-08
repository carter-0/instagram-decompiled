package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.W2u  reason: case insensitive filesystem */
public abstract class C18804W2u {
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.IllegalArgumentException, X.4t6] */
    public static final C276354t6 A02(Number number, String str, String str2) {
        0qQ.A0B(str2, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(" with key ");
        sb.append(str);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        String A0i = AnonymousClass7TF.A0i(A00(-1, str2), sb);
        0qQ.A0B(A0i, 1);
        return new IllegalArgumentException(A0i);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.WzR, java.lang.IllegalArgumentException] */
    public static final C20813WzR A03(Number number, String str) {
        0qQ.A0B(str, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        String A0i = AnonymousClass7TF.A0i(A00(-1, str), sb);
        0qQ.A0B(A0i, 1);
        return new IllegalArgumentException(A0i);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.WzR, java.lang.IllegalArgumentException] */
    public static final C20813WzR A04(SerialDescriptor serialDescriptor) {
        StringBuilder sb = new StringBuilder();
        sb.append("Value of type '");
        sb.append(serialDescriptor.BsV());
        sb.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        sb.append(serialDescriptor.BKK());
        String A0l = AnonymousClass7TF.A0l("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", sb);
        0qQ.A0B(A0l, 1);
        return new IllegalArgumentException(A0l);
    }

    public static final void A05(Number number, AnonymousClass40W r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(number);
        r3.A0F(AnonymousClass7TF.A0l(". By default, non-finite floating point values are prohibited because they do not conform JSON specification", sb), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", r3.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(String str, AnonymousClass40W r3) {
        r3.A0F(002.A0R("Trailing comma before the end of JSON ", str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.", r3.A00 - 1);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final CharSequence A00(int i, CharSequence charSequence) {
        StringBuilder A0n;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str = ".....";
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            A0n = AnonymousClass7TF.A0n(str);
            str = C13988Tno.A0c(charSequence, length, charSequence.length());
        } else {
            int i2 = i - 30;
            int i3 = i + 30;
            String str2 = str;
            if (i2 <= 0) {
                str2 = "";
            }
            if (i3 >= charSequence.length()) {
                str = "";
            }
            A0n = AnonymousClass7TF.A0n(str2);
            if (i2 < 0) {
                i2 = 0;
            }
            int length2 = charSequence.length();
            if (i3 > length2) {
                i3 = length2;
            }
            Pxf.A1O(A0n, charSequence.subSequence(i2, i3));
        }
        return AnonymousClass7TF.A0l(str, A0n);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.IllegalArgumentException, X.4t6] */
    public static final C276354t6 A01(CharSequence charSequence, String str, int i) {
        AnonymousClass7TG.A1O(str, charSequence);
        StringBuilder A0n = AnonymousClass7TF.A0n(str);
        A0n.append("\nJSON input: ");
        String A0i = AnonymousClass7TF.A0i(A00(i, charSequence), A0n);
        0qQ.A0B(A0i, 1);
        if (i >= 0) {
            A0i = 002.A05(i, "Unexpected JSON token at offset ", ": ", A0i);
        }
        0qQ.A0B(A0i, 1);
        return new IllegalArgumentException(A0i);
    }
}
