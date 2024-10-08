package X;

import java.util.List;
import org.json.JSONObject;

public final class AXO implements B1E {
    public final /* synthetic */ List A00;

    public AXO(List list) {
        this.A00 = list;
    }

    public final void DD8(JSONObject jSONObject) {
        for (C41802B1h b1h : this.A00) {
            if (b1h.AFV(jSONObject)) {
                b1h.CI3(jSONObject);
            }
        }
    }
}
