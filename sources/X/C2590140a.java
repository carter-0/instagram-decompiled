package X;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.40a  reason: invalid class name and case insensitive filesystem */
public abstract class C2590140a implements C2590240b, Decoder {
    public byte ANj() {
        AnonymousClass40W r6 = ((AnonymousClass40Z) this).A04;
        long A07 = r6.A07();
        byte b = (byte) ((int) A07);
        if (A07 == ((long) b)) {
            return b;
        }
        r6.A0F(002.A0K("Failed to parse byte for input '", '\'', A07), "", r6.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Decoder ANx(SerialDescriptor serialDescriptor, int i) {
        0qQ.A0B(serialDescriptor, 0);
        return ANw(serialDescriptor.B0R(i));
    }

    public int ANy() {
        AnonymousClass40W r6 = ((AnonymousClass40Z) this).A04;
        long A07 = r6.A07();
        int i = (int) A07;
        if (A07 == ((long) i)) {
            return i;
        }
        r6.A0F(002.A0K("Failed to parse int for input '", '\'', A07), "", r6.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public long AO1() {
        return ((AnonymousClass40Z) this).A04.A07();
    }

    public final Object AO4(Object obj, C255483uC r3, SerialDescriptor serialDescriptor, int i) {
        0qQ.A0B(r3, 2);
        if (r3.getDescriptor().CYM() || AO3()) {
            return AO6(r3);
        }
        return null;
    }

    public short AO7() {
        AnonymousClass40W r6 = ((AnonymousClass40Z) this).A04;
        long A07 = r6.A07();
        short s = (short) ((int) A07);
        if (A07 == ((long) s)) {
            return s;
        }
        r6.A0F(002.A0K("Failed to parse short for input '", '\'', A07), "", r6.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        StringBuilder sb = new StringBuilder();
        sb.append(new 0Yh(getClass()));
        sb.append(" can't retrieve untyped values");
        throw new IllegalArgumentException(sb.toString());
    }

    public final C2590240b ADI(SerialDescriptor serialDescriptor) {
        if (!(this instanceof AnonymousClass40Z)) {
            return this;
        }
        AnonymousClass40Z r5 = (AnonymousClass40Z) this;
        SerialDescriptor serialDescriptor2 = serialDescriptor;
        0qQ.A0B(serialDescriptor, 0);
        C250863mB r7 = r5.A02;
        AnonymousClass40Y A01 = C2590640g.A01(serialDescriptor, r7);
        AnonymousClass40W r8 = r5.A04;
        AnonymousClass40X r4 = r8.A03;
        int i = r4.A00 + 1;
        r4.A00 = i;
        Object[] objArr = r4.A02;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i2);
            0qQ.A07(copyOf);
            r4.A02 = copyOf;
            int[] copyOf2 = Arrays.copyOf(r4.A01, i2);
            0qQ.A07(copyOf2);
            r4.A01 = copyOf2;
        }
        r4.A02[i] = serialDescriptor;
        r8.A0E(A01.A00);
        if (r8.A04() != 4) {
            int ordinal = A01.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3 || r5.A06 != A01 || !r7.A00.A0A) {
                return new AnonymousClass40Z(serialDescriptor2, r7, r8, r5.A01, A01);
            }
            return r5;
        }
        r8.A0F(AnonymousClass000.A00(234), "", r8.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean ANh() {
        String str;
        boolean z;
        if (this instanceof AnonymousClass40Z) {
            AnonymousClass40W r3 = ((AnonymousClass40Z) this).A04;
            int A06 = r3.A06();
            String str2 = ((AnonymousClass40V) r3).A00;
            int length = str2.length();
            if (A06 != length) {
                boolean z2 = false;
                if (str2.charAt(A06) == '\"') {
                    A06++;
                    z2 = true;
                }
                if (A06 >= length) {
                    A06 = -1;
                }
                if (A06 < length && A06 != -1) {
                    int i = A06 + 1;
                    char charAt = str2.charAt(A06) | ' ';
                    if (charAt == 'f') {
                        AnonymousClass40W.A02("alse", r3, i);
                        z = false;
                    } else if (charAt == 't') {
                        AnonymousClass40W.A02("rue", r3, i);
                        z = true;
                    } else {
                        str = 002.A0S("Expected valid boolean literal prefix, but had '", r3.A0A(), '\'');
                        r3.A0F(str, "", r3.A00);
                    }
                    if (z2) {
                        int i2 = r3.A00;
                        if (i2 != length) {
                            if (str2.charAt(i2) == '\"') {
                                r3.A00++;
                            } else {
                                str = "Expected closing quotation mark";
                                r3.A0F(str, "", r3.A00);
                            }
                        }
                    }
                    return z;
                }
            }
            str = "EOF";
            r3.A0F(str, "", r3.A00);
        } else {
            A01();
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final char ANl() {
        if (this instanceof AnonymousClass40Z) {
            AnonymousClass40W r3 = ((AnonymousClass40Z) this).A04;
            String A0A = r3.A0A();
            if (A0A.length() == 1) {
                return A0A.charAt(0);
            }
            r3.A0F(002.A0S("Expected single char, but got '", A0A, '\''), "", r3.A00);
        } else {
            A01();
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final double ANn() {
        if (this instanceof AnonymousClass40Z) {
            AnonymousClass40Z r0 = (AnonymousClass40Z) this;
            AnonymousClass40W r4 = r0.A04;
            String A0A = r4.A0A();
            try {
                double parseDouble = Double.parseDouble(A0A);
                if (r0.A02.A00.A04 || (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    return parseDouble;
                }
                C18804W2u.A05(Double.valueOf(parseDouble), r4);
            } catch (IllegalArgumentException unused) {
                r4.A0F(002.A0v(AnonymousClass000.A00(947), "double", AnonymousClass000.A00(838), A0A, '\''), "", r4.A00);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            A01();
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final int ANq(SerialDescriptor serialDescriptor) {
        if (this instanceof AnonymousClass40Z) {
            AnonymousClass40Z r4 = (AnonymousClass40Z) this;
            0qQ.A0B(serialDescriptor, 0);
            return C2591440o.A00(r4.AO9(), 002.A0R(" at path ", r4.A04.A03.A00()), serialDescriptor, r4.A02);
        }
        A01();
        throw AnonymousClass00P.createAndThrow();
    }

    public final float ANr() {
        if (this instanceof AnonymousClass40Z) {
            AnonymousClass40Z r0 = (AnonymousClass40Z) this;
            AnonymousClass40W r4 = r0.A04;
            String A0A = r4.A0A();
            try {
                float parseFloat = Float.parseFloat(A0A);
                if (r0.A02.A00.A04 || (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    return parseFloat;
                }
                C18804W2u.A05(Float.valueOf(parseFloat), r4);
            } catch (IllegalArgumentException unused) {
                r4.A0F(002.A0v(AnonymousClass000.A00(947), "float", AnonymousClass000.A00(838), A0A, '\''), "", r4.A00);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            A01();
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final Decoder ANw(SerialDescriptor serialDescriptor) {
        if (!(this instanceof AnonymousClass40Z)) {
            return this;
        }
        AnonymousClass40Z r2 = (AnonymousClass40Z) this;
        0qQ.A0B(serialDescriptor, 0);
        Set set = C39611A2b.A00;
        if (!serialDescriptor.isInline() || !C39611A2b.A00.contains(serialDescriptor)) {
            return r2;
        }
        return new C20802WzE(r2.A02, r2.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = (X.AnonymousClass40Z) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AO3() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass40Z
            if (r0 == 0) goto L_0x0019
            r1 = r3
            X.40Z r1 = (X.AnonymousClass40Z) r1
            X.5H6 r0 = r1.A05
            r2 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x001a
        L_0x0010:
            X.40W r1 = r1.A04
            r0 = 1
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r2 = 1
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2590140a.AO3():boolean");
    }

    public final Object AO5(Object obj, C255483uC r9, SerialDescriptor serialDescriptor, int i) {
        boolean z;
        if (this instanceof AnonymousClass40Z) {
            AnonymousClass40Z r5 = (AnonymousClass40Z) this;
            0qQ.A0B(serialDescriptor, 0);
            0qQ.A0B(r9, 2);
            if (r5.A06 == AnonymousClass40Y.MAP && (i & 1) == 0) {
                z = true;
                AnonymousClass40X r3 = r5.A04.A03;
                int[] iArr = r3.A01;
                int i2 = r3.A00;
                if (iArr[i2] == -2) {
                    r3.A02[i2] = C2591740r.A00;
                }
            } else {
                z = false;
            }
            Object AO6 = r5.AO6(r9);
            if (z) {
                AnonymousClass40X r52 = r5.A04.A03;
                int[] iArr2 = r52.A01;
                int i3 = r52.A00;
                if (iArr2[i3] != -2) {
                    int i4 = i3 + 1;
                    r52.A00 = i4;
                    Object[] objArr = r52.A02;
                    if (i4 == objArr.length) {
                        int i5 = i4 * 2;
                        Object[] copyOf = Arrays.copyOf(objArr, i5);
                        0qQ.A07(copyOf);
                        r52.A02 = copyOf;
                        iArr2 = Arrays.copyOf(r52.A01, i5);
                        0qQ.A07(iArr2);
                        r52.A01 = iArr2;
                    }
                }
                Object[] objArr2 = r52.A02;
                int i6 = r52.A00;
                objArr2[i6] = AO6;
                iArr2[i6] = -2;
            }
            return AO6;
        }
        0qQ.A0B(r9, 2);
        return AO6(r9);
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [X.5H5, java.lang.Object] */
    public final Object AO6(C255483uC r17) {
        JsonObject jsonObject;
        C255483uC r9 = r17;
        if (!(this instanceof AnonymousClass40Z)) {
            return r9.deserialize(this);
        }
        AnonymousClass40Z r4 = (AnonymousClass40Z) this;
        String str = null;
        if (r9 instanceof C2590540f) {
            C250863mB r8 = r4.A02;
            if (!r8.A00.A0F) {
                C2590540f r92 = (C2590540f) r9;
                String A00 = VJ9.A00(r92.getDescriptor(), r8);
                AnonymousClass40W r3 = r4.A04;
                boolean z = r4.A03.A0C;
                0qQ.A0B(A00, 0);
                int i = r3.A00;
                try {
                    String str2 = null;
                    if (r3.A03() == 6 && 0qQ.A0K(r3.A0C(z), A00)) {
                        r3.A01 = null;
                        if (r3.A03() == 5) {
                            str2 = r3.A0C(z);
                        }
                    }
                    r3.A00 = i;
                    r3.A01 = null;
                    if (str2 == null) {
                        String A002 = VJ9.A00(r92.getDescriptor(), r8);
                        JsonElement AO0 = r4.AO0();
                        String BsV = r92.getDescriptor().BsV();
                        if (AO0 instanceof JsonObject) {
                            jsonObject = (JsonObject) AO0;
                            JsonElement jsonElement = (JsonElement) jsonObject.get(A002);
                            if (jsonElement != null) {
                                JsonPrimitive A06 = C271114hv.A06(jsonElement);
                                if (A06 instanceof JsonNull) {
                                    str = null;
                                } else {
                                    str = A06.A00();
                                }
                            }
                            C255483uC A003 = C18282Vp2.A00(str, r4, r92);
                            0qQ.A0C(A003, AnonymousClass000.A00(3677));
                            0qQ.A0B(A002, 1);
                            return new C20815WzT(A002, A003.getDescriptor(), r8, jsonObject).AO6(A003);
                        }
                        Map map = 0Yh.A03;
                        String A01 = 0q1.A01(JsonObject.class);
                        Class<?> cls = AO0.getClass();
                        0qQ.A0B(cls, 1);
                        throw C18804W2u.A01(AO0.toString(), 002.A16("Expected ", A01, ", but had ", 0q1.A01(cls), AnonymousClass000.A00(4290), BsV, AnonymousClass000.A00(4291), r3.A03.A00()), -1);
                    }
                    C255483uC A004 = C18282Vp2.A00(str2, r4, r92);
                    0qQ.A0C(A004, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    ? obj = new Object();
                    obj.A00 = A00;
                    r4.A01 = obj;
                    return A004.deserialize(r4);
                } catch (C66601pa e) {
                    String message = e.getMessage();
                    0qQ.A0A(message);
                    String A0G = 00l.A0G(".", 00l.A0J(message, message, 10));
                    String message2 = e.getMessage();
                    0qQ.A0A(message2);
                    String str3 = "";
                    0qQ.A0B(message2, 0);
                    0qQ.A0B(str3, 2);
                    int A04 = 00l.A04(message2, 10, 0);
                    if (A04 != -1) {
                        str3 = message2.substring(A04 + 1, message2.length());
                        0qQ.A07(str3);
                    }
                    r3.A0F(A0G, str3, r3.A00);
                    throw AnonymousClass00P.createAndThrow();
                } catch (C66601pa e2) {
                    String message3 = e2.getMessage();
                    0qQ.A0A(message3);
                    throw C18804W2u.A01(jsonObject.toString(), message3, -1);
                } catch (C2590440e e3) {
                    String message4 = e3.getMessage();
                    0qQ.A0A(message4);
                    if (00l.A0d(message4, "at path", false)) {
                        throw e3;
                    }
                    throw new C2590440e(002.A0g(e3.getMessage(), " at path: ", r4.A04.A03.A00()), e3, e3.A00);
                } catch (Throwable th) {
                    r3.A00 = i;
                    r3.A01 = null;
                    throw th;
                }
            }
        }
        return r9.deserialize(r4);
    }

    public final String AO9() {
        if (this instanceof AnonymousClass40Z) {
            AnonymousClass40Z r2 = (AnonymousClass40Z) this;
            boolean z = r2.A03.A0C;
            AnonymousClass40W r0 = r2.A04;
            if (z) {
                return r0.A0B();
            }
            return r0.A09();
        }
        A01();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AST(kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass40Z
            if (r0 == 0) goto L_0x0055
            r3 = r6
            X.40Z r3 = (X.AnonymousClass40Z) r3
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.3mB r0 = r3.A02
            X.40P r2 = r0.A00
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0020
            int r0 = r7.B0a()
            if (r0 != 0) goto L_0x0020
        L_0x0019:
            int r1 = r3.ANp(r7)
            r0 = -1
            if (r1 != r0) goto L_0x0019
        L_0x0020:
            X.40W r1 = r3.A04
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = ""
            X.C18804W2u.A06(r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0036:
            X.40Y r0 = r3.A06
            char r0 = r0.A01
            r1.A0E(r0)
            X.40X r5 = r1.A03
            int r4 = r5.A00
            int[] r3 = r5.A01
            r2 = r3[r4]
            r1 = -1
            r0 = -2
            if (r2 != r0) goto L_0x004f
            r3[r4] = r1
            int r4 = r4 + -1
            r5.A00 = r4
        L_0x004f:
            if (r4 == r1) goto L_0x0055
            int r0 = r4 + -1
            r5.A00 = r0
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2590140a.AST(kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final boolean ANi(SerialDescriptor serialDescriptor, int i) {
        return ANh();
    }

    public final byte ANk(SerialDescriptor serialDescriptor, int i) {
        return ANj();
    }

    public final char ANm(SerialDescriptor serialDescriptor, int i) {
        return ANl();
    }

    public final double ANo(SerialDescriptor serialDescriptor, int i) {
        return ANn();
    }

    public final float ANs(SerialDescriptor serialDescriptor, int i) {
        return ANr();
    }

    public final int ANz(SerialDescriptor serialDescriptor, int i) {
        return ANy();
    }

    public final long AO2(SerialDescriptor serialDescriptor, int i) {
        return AO1();
    }

    public final short AO8(SerialDescriptor serialDescriptor, int i) {
        return AO7();
    }

    public final String AOA(SerialDescriptor serialDescriptor, int i) {
        return AO9();
    }
}
