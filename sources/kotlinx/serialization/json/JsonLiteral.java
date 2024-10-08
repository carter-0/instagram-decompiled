package kotlinx.serialization.json;

import X.0qQ;
import X.C255563uL;

public final class JsonLiteral extends JsonPrimitive {
    public final String A00;
    public final boolean A01;

    public JsonLiteral(Object obj, boolean z) {
        0qQ.A0B(obj, 1);
        this.A01 = z;
        this.A00 = obj.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                JsonLiteral jsonLiteral = (JsonLiteral) obj;
                if (this.A01 != jsonLiteral.A01 || !0qQ.A0K(this.A00, jsonLiteral.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        return this.A00;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00.hashCode();
    }

    public final String toString() {
        if (!this.A01) {
            return this.A00;
        }
        StringBuilder sb = new StringBuilder();
        C255563uL.A00(sb, this.A00);
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }
}
