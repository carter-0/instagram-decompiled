package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

public final class BA9 extends AnonymousClass3FZ implements G9U {
    public final ImmutableList BjC() {
        return A02("ranges", BA8.class);
    }

    public final ImmutableList getInlineStyleRanges() {
        return A02("inline_style_ranges", BA7.class);
    }

    public final String getText() {
        return A05("text");
    }

    public BA9(JSONObject jSONObject) {
        super(jSONObject);
    }
}
