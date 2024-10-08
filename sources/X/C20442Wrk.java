package X;

import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.Wrk  reason: case insensitive filesystem */
public abstract class C20442Wrk implements C2590240b, Decoder {
    public boolean A00;
    public final ArrayList A01 = new ArrayList();

    public static String A00(SerialDescriptor serialDescriptor, C20442Wrk wrk, int i) {
        0qQ.A0B(serialDescriptor, 0);
        C20812WzP wzP = (C20812WzP) wrk;
        String A0H = wzP.A0H(serialDescriptor, i);
        0qQ.A0B(A0H, 0);
        00k.A0L(wzP.A01);
        return A0H;
    }

    public static C276354t6 A01(Object obj, String str, String str2, C20812WzP wzP) {
        Map map = 0Yh.A03;
        String A012 = 0q1.A01(JsonPrimitive.class);
        Class<?> cls = obj.getClass();
        0qQ.A0B(cls, 1);
        return C18804W2u.A01(obj.toString(), 002.A16("Expected ", A012, ", but had ", 0q1.A01(cls), " as the serialized body of ", str, " at element: ", 002.A0T(wzP.A0G(), str2, '.')), -1);
    }

    public static C276354t6 A02(Object obj, String str, String str2, C20812WzP wzP, int i) {
        Map map = 0Yh.A03;
        String A012 = 0q1.A01(JsonPrimitive.class);
        Class<?> cls = obj.getClass();
        0qQ.A0B(cls, i);
        return C18804W2u.A01(obj.toString(), 002.A16("Expected ", A012, ", but had ", 0q1.A01(cls), " as the serialized body of ", str, " at element: ", 002.A0T(wzP.A0G(), str2, '.')), -1);
    }

    public static C276354t6 A03(Object obj, String str, C20812WzP wzP) {
        Map map = 0Yh.A03;
        String A012 = 0q1.A01(JsonObject.class);
        Class<?> cls = obj.getClass();
        0qQ.A0B(cls, 1);
        return C18804W2u.A01(obj.toString(), 002.A16("Expected ", A012, ", but had ", 0q1.A01(cls), " as the serialized body of ", str, " at element: ", wzP.A0G()), -1);
    }

    public final byte A05(Object obj) {
        C20816WzU wzU = (C20816WzU) this;
        String A1E = C41847B3o.A1E(obj);
        JsonElement A0K = wzU.A0K(A1E);
        if (A0K instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            try {
                int A002 = C271114hv.A00(jsonPrimitive);
                if (-128 <= A002 && A002 <= 127) {
                    byte b = (byte) A002;
                    if (Byte.valueOf(b) != null) {
                        return b;
                    }
                }
                C20816WzU.A04("byte", A1E, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            } catch (IllegalArgumentException unused) {
                C20816WzU.A04("byte", A1E, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw A01(A0K, "byte", A1E, wzU);
        }
    }

    public final char A06(Object obj) {
        C20816WzU wzU = (C20816WzU) this;
        String A1E = C41847B3o.A1E(obj);
        JsonElement A0K = wzU.A0K(A1E);
        if (A0K instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            try {
                return 00R.A01(jsonPrimitive.A00());
            } catch (IllegalArgumentException unused) {
                C20816WzU.A04("char", A1E, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw A01(A0K, "char", A1E, wzU);
        }
    }

    public final double A07(Object obj) {
        C20816WzU wzU = (C20816WzU) this;
        String str = (String) obj;
        0qQ.A0B(str, 0);
        JsonElement A0K = wzU.A0K(str);
        if (A0K instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            try {
                SerialDescriptor serialDescriptor = C271114hv.A00;
                0qQ.A0B(jsonPrimitive, 0);
                double parseDouble = Double.parseDouble(jsonPrimitive.A00());
                if (wzU.A01.A00.A04 || (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    return parseDouble;
                }
                throw C18804W2u.A02(Double.valueOf(parseDouble), str, wzU.A0J().toString());
            } catch (IllegalArgumentException unused) {
                C20816WzU.A04("double", str, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw A01(A0K, "double", str, wzU);
        }
    }

    public final float A08(Object obj) {
        C20816WzU wzU = (C20816WzU) this;
        String str = (String) obj;
        0qQ.A0B(str, 0);
        JsonElement A0K = wzU.A0K(str);
        if (A0K instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            try {
                SerialDescriptor serialDescriptor = C271114hv.A00;
                0qQ.A0B(jsonPrimitive, 0);
                float parseFloat = Float.parseFloat(jsonPrimitive.A00());
                if (wzU.A01.A00.A04 || (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    return parseFloat;
                }
                throw C18804W2u.A02(Float.valueOf(parseFloat), str, wzU.A0J().toString());
            } catch (IllegalArgumentException unused) {
                C20816WzU.A04("float", str, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw A01(A0K, "float", str, wzU);
        }
    }

    public final int A09(Object obj) {
        C20816WzU wzU = (C20816WzU) this;
        String A1E = C41847B3o.A1E(obj);
        JsonElement A0K = wzU.A0K(A1E);
        if (A0K instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            try {
                return C271114hv.A00(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                C20816WzU.A04("int", A1E, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw A01(A0K, "int", A1E, wzU);
        }
    }

    public final long A0A(Object obj) {
        C20816WzU wzU = (C20816WzU) this;
        String str = (String) obj;
        0qQ.A0B(str, 0);
        JsonElement A0K = wzU.A0K(str);
        if (A0K instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            try {
                SerialDescriptor serialDescriptor = C271114hv.A00;
                0qQ.A0B(jsonPrimitive, 0);
                return new AnonymousClass40V(jsonPrimitive.A00()).A07();
            } catch (C276354t6 e) {
                throw new NumberFormatException(e.getMessage());
            } catch (IllegalArgumentException unused) {
                C20816WzU.A04("long", str, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw A01(A0K, "long", str, wzU);
        }
    }

    public final String A0C(Object obj) {
        String A16;
        StringBuilder sb;
        String A0T;
        C20816WzU wzU = (C20816WzU) this;
        String A1E = C41847B3o.A1E(obj);
        JsonElement A0K = wzU.A0K(A1E);
        if (A0K instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            if (jsonPrimitive instanceof JsonLiteral) {
                JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
                if (jsonLiteral.A01 || wzU.A01.A00.A0C) {
                    return jsonLiteral.A00;
                }
                sb = new StringBuilder();
                sb.append("String literal for key '");
                sb.append(A1E);
                sb.append("' should be quoted at element: ");
                sb.append(002.A0T(wzU.A0G(), A1E, '.'));
                A0T = ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";
            } else {
                sb = new StringBuilder();
                sb.append("Expected string value for a non-null key '");
                sb.append(A1E);
                sb.append("', got null literal instead at element: ");
                A0T = 002.A0T(wzU.A0G(), A1E, '.');
            }
            A16 = AnonymousClass7TF.A0l(A0T, sb);
            A0K = wzU.A0J();
        } else {
            Map map = 0Yh.A03;
            String A012 = 0q1.A01(JsonPrimitive.class);
            Class<?> cls = A0K.getClass();
            0qQ.A0B(cls, 1);
            A16 = 002.A16("Expected ", A012, ", but had ", 0q1.A01(cls), " as the serialized body of ", IgNetworkingModule.REQUEST_BODY_KEY_STRING, " at element: ", 002.A0T(wzU.A0G(), A1E, '.'));
        }
        throw C18804W2u.A01(A0K.toString(), A16, -1);
    }

    public final Decoder A0D(Object obj, SerialDescriptor serialDescriptor) {
        AnonymousClass40V r0;
        C20816WzU wzU = (C20816WzU) this;
        String str = (String) obj;
        boolean A1Z = AnonymousClass7TG.A1Z(str, serialDescriptor);
        Set set = C39611A2b.A00;
        if (!serialDescriptor.isInline() || !C39611A2b.A00.contains(serialDescriptor)) {
            wzU.A01.add(str);
            return wzU;
        }
        C250863mB r3 = wzU.A01;
        JsonElement A0K = wzU.A0K(str);
        String BsV = serialDescriptor.BsV();
        if (A0K instanceof JsonPrimitive) {
            String A002 = ((JsonPrimitive) A0K).A00();
            0qQ.A0B(A002, A1Z);
            if (!r3.A00.A03) {
                r0 = new AnonymousClass40V(A002);
            } else {
                r0 = new AnonymousClass40V(A002);
            }
            return new C20802WzE(r3, r0);
        }
        throw A02(A0K, BsV, str, wzU, A1Z ? 1 : 0);
    }

    public final short A0E(Object obj) {
        C20816WzU wzU = (C20816WzU) this;
        String A1E = C41847B3o.A1E(obj);
        JsonElement A0K = wzU.A0K(A1E);
        boolean z = A0K instanceof JsonPrimitive;
        String A002 = AnonymousClass000.A00(369);
        if (z) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            try {
                int A003 = C271114hv.A00(jsonPrimitive);
                if (-32768 <= A003 && A003 <= 32767) {
                    short s = (short) A003;
                    if (Short.valueOf(s) != null) {
                        return s;
                    }
                }
                C20816WzU.A04(A002, A1E, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            } catch (IllegalArgumentException unused) {
                C20816WzU.A04(A002, A1E, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw A01(A0K, A002, A1E, wzU);
        }
    }

    public final boolean A0F(Object obj) {
        C20816WzU wzU = (C20816WzU) this;
        String A1E = C41847B3o.A1E(obj);
        JsonElement A0K = wzU.A0K(A1E);
        if (A0K instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) A0K;
            try {
                Boolean A012 = C271114hv.A01(jsonPrimitive);
                if (A012 != null) {
                    return A012.booleanValue();
                }
                C20816WzU.A04("boolean", A1E, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            } catch (IllegalArgumentException unused) {
                C20816WzU.A04("boolean", A1E, jsonPrimitive, wzU);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw A01(A0K, "boolean", A1E, wzU);
        }
    }

    public final int ANq(SerialDescriptor serialDescriptor) {
        0qQ.A0B(serialDescriptor, 0);
        C20816WzU wzU = (C20816WzU) this;
        String str = (String) A0B();
        0qQ.A0B(str, 0);
        C250863mB r3 = wzU.A01;
        JsonElement A0K = wzU.A0K(str);
        String BsV = serialDescriptor.BsV();
        if (A0K instanceof JsonPrimitive) {
            return C2591440o.A00(((JsonPrimitive) A0K).A00(), "", serialDescriptor, r3);
        }
        throw A02(A0K, BsV, str, wzU, 1);
    }

    public final Decoder ANw(SerialDescriptor serialDescriptor) {
        C20816WzU wzU = (C20816WzU) this;
        if (00k.A0L(wzU.A01) != null) {
            return wzU.A0D(wzU.A0B(), serialDescriptor);
        }
        return new C20810WzN(wzU.A00, wzU.A01, wzU.A0I()).ANw(serialDescriptor);
    }

    public final Object AO6(C255483uC r8) {
        String str;
        C20816WzU wzU = (C20816WzU) this;
        if (r8 instanceof C2590540f) {
            C250863mB r5 = wzU.A01;
            if (!r5.A00.A0F) {
                C2590540f r82 = (C2590540f) r8;
                String A002 = VJ9.A00(r82.getDescriptor(), r5);
                JsonElement A0J = wzU.A0J();
                String BsV = r82.getDescriptor().BsV();
                if (A0J instanceof JsonObject) {
                    JsonObject jsonObject = (JsonObject) A0J;
                    JsonElement jsonElement = (JsonElement) jsonObject.get(A002);
                    if (jsonElement != null) {
                        JsonPrimitive A06 = C271114hv.A06(jsonElement);
                        if (!(A06 instanceof JsonNull)) {
                            str = A06.A00();
                            C255483uC A003 = C18282Vp2.A00(str, wzU, r82);
                            0qQ.A0C(A003, AnonymousClass000.A00(3677));
                            0qQ.A0B(A002, 1);
                            return new C20815WzT(A002, A003.getDescriptor(), r5, jsonObject).AO6(A003);
                        }
                    }
                    str = null;
                    try {
                        C255483uC A0032 = C18282Vp2.A00(str, wzU, r82);
                        0qQ.A0C(A0032, AnonymousClass000.A00(3677));
                        0qQ.A0B(A002, 1);
                        return new C20815WzT(A002, A0032.getDescriptor(), r5, jsonObject).AO6(A0032);
                    } catch (C66601pa e) {
                        String message = e.getMessage();
                        0qQ.A0A(message);
                        throw C18804W2u.A01(jsonObject.toString(), message, -1);
                    }
                } else {
                    throw A03(A0J, BsV, wzU);
                }
            }
        }
        return r8.deserialize(wzU);
    }

    public final Object A0B() {
        ArrayList arrayList = this.A01;
        0qQ.A0B(arrayList, 0);
        Object remove = arrayList.remove(C51966G9m.A06(arrayList));
        this.A00 = true;
        return remove;
    }

    public final boolean ANh() {
        return A0F(A0B());
    }

    public final boolean ANi(SerialDescriptor serialDescriptor, int i) {
        return A0F(A00(serialDescriptor, this, i));
    }

    public final byte ANj() {
        return A05(A0B());
    }

    public final byte ANk(SerialDescriptor serialDescriptor, int i) {
        return A05(A00(serialDescriptor, this, i));
    }

    public final char ANl() {
        return A06(A0B());
    }

    public final char ANm(SerialDescriptor serialDescriptor, int i) {
        return A06(A00(serialDescriptor, this, i));
    }

    public final double ANn() {
        return A07(A0B());
    }

    public final double ANo(SerialDescriptor serialDescriptor, int i) {
        return A07(A00(serialDescriptor, this, i));
    }

    public final float ANr() {
        return A08(A0B());
    }

    public final float ANs(SerialDescriptor serialDescriptor, int i) {
        return A08(A00(serialDescriptor, this, i));
    }

    public final Decoder ANx(SerialDescriptor serialDescriptor, int i) {
        return A0D(A00(serialDescriptor, this, i), serialDescriptor.B0R(i));
    }

    public final int ANy() {
        return A09(A0B());
    }

    public final int ANz(SerialDescriptor serialDescriptor, int i) {
        return A09(A00(serialDescriptor, this, i));
    }

    public final long AO1() {
        return A0A(A0B());
    }

    public final long AO2(SerialDescriptor serialDescriptor, int i) {
        return A0A(A00(serialDescriptor, this, i));
    }

    public final Object AO4(Object obj, C255483uC r5, SerialDescriptor serialDescriptor, int i) {
        Object AO6;
        DbY.A1S(serialDescriptor, r5);
        C20812WzP wzP = (C20812WzP) this;
        String A0H = wzP.A0H(serialDescriptor, i);
        0qQ.A0B(A0H, 0);
        00k.A0L(wzP.A01);
        this.A01.add(A0H);
        if (r5.getDescriptor().CYM() || AO3()) {
            AO6 = AO6(r5);
        } else {
            AO6 = null;
        }
        if (!this.A00) {
            A0B();
        }
        this.A00 = false;
        return AO6;
    }

    public final Object AO5(Object obj, C255483uC r5, SerialDescriptor serialDescriptor, int i) {
        DbY.A1S(serialDescriptor, r5);
        C20812WzP wzP = (C20812WzP) this;
        String A0H = wzP.A0H(serialDescriptor, i);
        0qQ.A0B(A0H, 0);
        00k.A0L(wzP.A01);
        this.A01.add(A0H);
        Object AO6 = AO6(r5);
        if (!this.A00) {
            A0B();
        }
        this.A00 = false;
        return AO6;
    }

    public final short AO7() {
        return A0E(A0B());
    }

    public final short AO8(SerialDescriptor serialDescriptor, int i) {
        return A0E(A00(serialDescriptor, this, i));
    }

    public final String AO9() {
        return A0C(A0B());
    }

    public final String AOA(SerialDescriptor serialDescriptor, int i) {
        return A0C(A00(serialDescriptor, this, i));
    }
}
