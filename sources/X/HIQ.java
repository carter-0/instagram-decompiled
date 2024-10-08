package X;

import org.json.JSONObject;

public final class HIQ extends HQ4 {
    public final JSONObject A00;

    public HIQ(JSONObject jSONObject) {
        0qQ.A0B(jSONObject, 1);
        this.A00 = jSONObject;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HIQ) && 0qQ.A0K(this.A00, ((HIQ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProcessPlatformEvent(jsonObject=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
