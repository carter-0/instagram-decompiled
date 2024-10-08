package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.3mB  reason: invalid class name and case insensitive filesystem */
public abstract class C250863mB {
    public static final C250873mC A03 = new C250873mC();
    public final AnonymousClass40P A00;
    public final AnonymousClass40S A01 = new AnonymousClass40S();
    public final AnonymousClass40R A02;

    public final Object A00(String str, C255483uC r8) {
        AnonymousClass40V r3;
        0qQ.A0B(r8, 0);
        0qQ.A0B(str, 1);
        if (!this.A00.A03) {
            r3 = new AnonymousClass40V(str);
        } else {
            r3 = new AnonymousClass40V(str);
        }
        Object AO6 = new AnonymousClass40Z(r8.getDescriptor(), this, r3, (AnonymousClass5H5) null, AnonymousClass40Y.OBJ).AO6(r8);
        if (r3.A03() == 10) {
            return AO6;
        }
        r3.A0F(002.A0T("Expected EOF after parsing, but had ", " instead", r3.A00.charAt(r3.A00 - 1)), "", r3.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object A01(C255483uC r3, JsonElement jsonElement) {
        C20442Wrk wzN;
        0qQ.A0B(jsonElement, 1);
        if (jsonElement instanceof JsonObject) {
            wzN = new C20815WzT((String) null, (SerialDescriptor) null, this, (JsonObject) jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            wzN = new C20811WzO(this, (JsonArray) jsonElement);
        } else if ((jsonElement instanceof JsonLiteral) || jsonElement.equals(JsonNull.A00)) {
            wzN = new C20810WzN((String) null, this, jsonElement);
        } else {
            throw new RuntimeException();
        }
        return wzN.AO6(r3);
    }

    public final String A02(Object obj, C255473uB r7) {
        AnonymousClass486 r1;
        0qQ.A0B(r7, 0);
        AnonymousClass480 r4 = new AnonymousClass480();
        try {
            AnonymousClass40Y r3 = AnonymousClass40Y.OBJ;
            AnonymousClass483[] r2 = new AnonymousClass483[AnonymousClass40Y.A02.size()];
            if (this.A00.A0D) {
                r1 = new AnonymousClass489(this, r4);
            } else {
                r1 = new AnonymousClass486(r4);
            }
            new AnonymousClass487(this, r1, r3, r2).AS9(obj, r7);
            return r4.toString();
        } finally {
            r4.A01();
        }
    }

    public C250863mB(AnonymousClass40P r2, AnonymousClass40R r3) {
        this.A00 = r2;
        this.A02 = r3;
    }
}
