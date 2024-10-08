package X;

import org.json.JSONObject;

public final class BA7 extends AnonymousClass3FZ implements DaK {
    public final int getInlineStyle() {
        return this.A00.optInt("inline_style");
    }

    public final int getLength() {
        return this.A00.optInt("length");
    }

    public final int getOffset() {
        return this.A00.optInt("offset");
    }

    public final boolean hasInlineStyle() {
        return !this.A00.isNull("inline_style");
    }

    public final boolean hasLength() {
        return !this.A00.isNull("length");
    }

    public final boolean hasOffset() {
        return !this.A00.isNull("offset");
    }

    public BA7(JSONObject jSONObject) {
        super(jSONObject);
    }
}
