package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.Rhx  reason: case insensitive filesystem */
public abstract class C9835Rhx {
    public static final int A00(ImmutableList immutableList) {
        0qQ.A0B(immutableList, 0);
        C249803kO A0J = C66580MXl.A0J(immutableList);
        while (A0J.hasNext()) {
            JSONObject jSONObject = ((AnonymousClass3FZ) A0J.next()).A00;
            if (jSONObject.optInt("qrt_experiment_id") == 8) {
                return jSONObject.optInt("qrt_version_id");
            }
        }
        return -1;
    }
}
