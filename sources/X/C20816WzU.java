package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.WzU  reason: case insensitive filesystem */
public abstract class C20816WzU extends C20812WzP implements C2590340d {
    public final String A00;
    public final C250863mB A01;
    public final AnonymousClass40P A02;
    public final JsonElement A03;

    public C2590240b ADI(SerialDescriptor serialDescriptor) {
        String str;
        StringBuilder sb;
        Class cls;
        0qQ.A0B(serialDescriptor, 0);
        JsonElement A0J = A0J();
        C255513uF BKK = serialDescriptor.BKK();
        if (!0qQ.A0K(BKK, C2591140l.A00) && !(BKK instanceof C2591040k)) {
            boolean A0K = 0qQ.A0K(BKK, C2591240m.A00);
            C250863mB r4 = this.A01;
            if (A0K) {
                SerialDescriptor A002 = C2590640g.A00(serialDescriptor.B0R(0), r4.A02);
                C255513uF BKK2 = A002.BKK();
                if ((BKK2 instanceof C255503uE) || 0qQ.A0K(BKK2, AnonymousClass48A.A00)) {
                    str = serialDescriptor.BsV();
                    if (A0J instanceof JsonObject) {
                        return new C20814WzS(r4, (JsonObject) A0J);
                    }
                } else if (!r4.A00.A05) {
                    throw C18804W2u.A04(A002);
                }
            } else {
                str = serialDescriptor.BsV();
                if (A0J instanceof JsonObject) {
                    return new C20815WzT(this.A00, (SerialDescriptor) null, r4, (JsonObject) A0J);
                }
            }
            sb = AnonymousClass7TF.A0n("Expected ");
            cls = JsonObject.class;
            Map map = 0Yh.A03;
            sb.append(0q1.A01(cls));
            sb.append(", but had ");
            Class<?> cls2 = A0J.getClass();
            0qQ.A0B(cls2, 1);
            Pxg.A1P(0q1.A01(cls2), " as the serialized body of ", str, sb);
            sb.append(" at element: ");
            throw C18804W2u.A01(A0J.toString(), AnonymousClass7TF.A0l(A0G(), sb), -1);
        }
        C250863mB r1 = this.A01;
        str = serialDescriptor.BsV();
        if (A0J instanceof JsonArray) {
            return new C20811WzO(r1, (JsonArray) A0J);
        }
        sb = AnonymousClass7TF.A0n("Expected ");
        cls = JsonArray.class;
        Map map2 = 0Yh.A03;
        sb.append(0q1.A01(cls));
        sb.append(", but had ");
        Class<?> cls22 = A0J.getClass();
        0qQ.A0B(cls22, 1);
        Pxg.A1P(0q1.A01(cls22), " as the serialized body of ", str, sb);
        sb.append(" at element: ");
        throw C18804W2u.A01(A0J.toString(), AnonymousClass7TF.A0l(A0G(), sb), -1);
    }

    public static final void A04(String str, String str2, JsonPrimitive jsonPrimitive, C20816WzU wzU) {
        StringBuilder sb;
        String str3;
        if (00p.A0k(str, "i", false)) {
            str3 = "an ";
        } else {
            sb = new StringBuilder();
            str3 = "a ";
        }
        String A0s = Pxg.A0s(str3, str, sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to parse literal '");
        sb2.append(jsonPrimitive);
        sb2.append("' as ");
        sb2.append(A0s);
        sb2.append(" value at element: ");
        throw C18804W2u.A01(wzU.A0J().toString(), AnonymousClass7TF.A0l(002.A0T(wzU.A0G(), str2, '.'), sb2), -1);
    }

    public final JsonElement A0I() {
        if (this instanceof C20811WzO) {
            return ((C20811WzO) this).A01;
        }
        if (!(this instanceof C20815WzT)) {
            return ((C20810WzN) this).A00;
        }
        C20815WzT wzT = (C20815WzT) this;
        if (wzT instanceof C20814WzS) {
            return ((C20814WzS) wzT).A03;
        }
        return wzT.A02;
    }

    public final JsonElement A0J() {
        JsonElement A0K;
        String str = (String) 00k.A0L(this.A01);
        if (str == null || (A0K = A0K(str)) == null) {
            return A0I();
        }
        return A0K;
    }

    public final JsonElement A0K(String str) {
        JsonObject jsonObject;
        Object A012;
        if (this instanceof C20811WzO) {
            JsonArray jsonArray = ((C20811WzO) this).A01;
            A012 = jsonArray.A00.get(Integer.parseInt(str));
        } else if (this instanceof C20815WzT) {
            C20815WzT wzT = (C20815WzT) this;
            if (wzT instanceof C20814WzS) {
                C20814WzS wzS = (C20814WzS) wzT;
                if (wzS.A00 % 2 == 0) {
                    A012 = C271114hv.A05(str);
                } else {
                    jsonObject = wzS.A03;
                }
            } else {
                jsonObject = wzT.A02;
            }
            A012 = 0Yt.A01(str, jsonObject);
        } else {
            C20810WzN wzN = (C20810WzN) this;
            if (str == "primitive") {
                return wzN.A00;
            }
            throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
        }
        return (JsonElement) A012;
    }

    public final boolean AO3() {
        if (!(this instanceof C20815WzT)) {
            return !(A0J() instanceof JsonNull);
        }
        C20815WzT wzT = (C20815WzT) this;
        if (wzT.A00 || !(!(wzT.A0J() instanceof JsonNull))) {
            return false;
        }
        return true;
    }

    public final void AST(SerialDescriptor serialDescriptor) {
        Set set;
        Object obj;
        if (this instanceof C20815WzT) {
            C20815WzT wzT = (C20815WzT) this;
            if (!(wzT instanceof C20814WzS)) {
                0qQ.A0B(serialDescriptor, 0);
                AnonymousClass40P r3 = wzT.A02;
                if (!r3.A0B && !(serialDescriptor.BKK() instanceof C2591040k)) {
                    C250863mB r2 = wzT.A01;
                    0qQ.A0K(serialDescriptor.BKK(), C2590840i.A00);
                    boolean z = r3.A0E;
                    Set A002 = C360608er.A00(serialDescriptor);
                    if (z) {
                        AnonymousClass40S r1 = r2.A01;
                        C2591540p r22 = C2591440o.A00;
                        0qQ.A0B(r22, 1);
                        Map map = (Map) r1.A00.get(serialDescriptor);
                        Object obj2 = null;
                        if (!(map == null || (obj = map.get(r22)) == null)) {
                            obj2 = obj;
                        }
                        Map map2 = (Map) obj2;
                        if (map2 == null || (set = map2.keySet()) == null) {
                            set = 0sl.A00;
                        }
                        A002 = 094.A00(set, A002);
                    }
                    JsonObject jsonObject = wzT.A02;
                    Iterator it = jsonObject.keySet().iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        if (!A002.contains(A18) && !0qQ.A0K(A18, wzT.A00)) {
                            String obj3 = jsonObject.toString();
                            0qQ.A0B(A18, 0);
                            StringBuilder sb = new StringBuilder();
                            sb.append(AnonymousClass000.A00(2253));
                            sb.append(A18);
                            sb.append("'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                            String A0i = AnonymousClass7TF.A0i(C18804W2u.A00(-1, obj3), sb);
                            0qQ.A0B(A0i, 1);
                            throw new IllegalArgumentException(A0i);
                        }
                    }
                }
            }
        }
    }

    public final AnonymousClass40R Bsb() {
        return this.A01.A02;
    }

    public C20816WzU(String str, C250863mB r3, JsonElement jsonElement) {
        this.A01 = r3;
        this.A03 = jsonElement;
        this.A00 = str;
        this.A02 = r3.A00;
    }

    public final JsonElement AO0() {
        return A0J();
    }
}
