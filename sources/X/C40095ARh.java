package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ARh  reason: case insensitive filesystem */
public final class C40095ARh implements AnonymousClass82U, C41801B1g {
    public final AnonymousClass82S A00 = new AnonymousClass82S();
    public final List A01 = AnonymousClass7TE.A1C();

    public final List EzQ(Bundle bundle) {
        B2P b2p;
        String string;
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 1) {
                if (bundle.containsKey("jsonObject") && (string = bundle.getString("jsonObject")) != null) {
                    try {
                        this.A00.A00(new JSONObject(string));
                    } catch (JSONException e) {
                        0KC.A0C("PlatformEventsDataProvider", AnonymousClass7TG.A0m(e, "Invalid json events from platform events host: ", AnonymousClass7TE.A1A()));
                    }
                }
            } else if (i == 2 && (b2p = this.A00.A00) != null) {
                b2p.stop();
            }
        }
        List list = this.A01;
        ArrayList A0U = 00k.A0U(list);
        list.clear();
        return A0U;
    }

    public final void AP6(JSONObject jSONObject) {
        AnonymousClass7TH.A0c("jsonObject", jSONObject.toString(), this.A01, AnonymousClass7TF.A0x("serviceType", 67), AnonymousClass7TH.A0J(AnonymousClass05K.A00));
    }
}
