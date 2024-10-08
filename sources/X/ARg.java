package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ARg implements B2P, B38 {
    public AnonymousClass82U A00;
    public final List A01 = AnonymousClass7TE.A1C();

    public final void FKT(Bundle bundle) {
        String string;
        0qQ.A0B(bundle, 0);
        if (this.A00 != null && bundle.containsKey("commandType") && bundle.getInt("commandType") == 0 && bundle.containsKey("jsonObject") && (string = bundle.getString("jsonObject")) != null) {
            try {
                AnonymousClass82U r1 = this.A00;
                if (r1 != null) {
                    r1.AP6(new JSONObject(string));
                }
            } catch (JSONException e) {
                0KC.A0C("PlatformEventsDataProvider", AnonymousClass7TG.A0m(e, "Invalid json events from platform events client: ", AnonymousClass7TE.A1A()));
            }
        }
    }

    public final void enqueueEvent(JSONObject jSONObject) {
        0qQ.A0B(jSONObject, 0);
        AnonymousClass7TH.A0c("jsonObject", jSONObject.toString(), this.A01, AnonymousClass7TF.A0x("serviceType", 67), AnonymousClass7TH.A0J(AnonymousClass05K.A01));
    }

    public final boolean isAlive() {
        return true;
    }

    public final Bundle BH4() {
        return AnonymousClass7TH.A05(67);
    }

    public final void CMw(C371698yt r3) {
        AnonymousClass82S r0;
        if (r3 != null) {
            C371628yi r1 = C371838zD.A02;
            if (C371698yt.A01(r3, r1)) {
                C371838zD r12 = (C371838zD) r3.A02(r1);
                AnonymousClass82U r02 = null;
                if (r12 != null) {
                    r02 = r12.A01;
                }
                this.A00 = r02;
                if (r12 != null && (r0 = r12.A00) != null) {
                    r0.A00 = this;
                }
            }
        }
    }

    public final List EzR() {
        List list = this.A01;
        if (list.isEmpty()) {
            return AnonymousClass7TE.A1I(AnonymousClass7TH.A05(67));
        }
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        list.clear();
        return A1D;
    }

    public final void stop() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A0C, this.A01, AnonymousClass7TF.A0x("serviceType", 67));
    }
}
