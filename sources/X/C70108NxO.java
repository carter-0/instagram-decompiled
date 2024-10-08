package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NxO  reason: case insensitive filesystem */
public abstract class C70108NxO {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.N1b, X.3FZ] */
    public static final C68113N1b A00(C69422Nl4 nl4, ImmutableList immutableList) {
        AnonymousClass7TG.A1N(nl4, immutableList);
        JSONObject A11 = DbS.A11();
        JSONObject A112 = DbS.A11();
        try {
            A112.put("product_type", nl4.toString());
        } catch (JSONException unused) {
        }
        try {
            A11.put("product_params", A112);
        } catch (JSONException unused2) {
        }
        JSONObject A113 = DbS.A11();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
            A113.put("feature_tags", jSONArray);
        } catch (JSONException unused3) {
        }
        try {
            A11.put(Pxd.A00(799), A113);
        } catch (JSONException unused4) {
        }
        return new AnonymousClass3FZ(A11);
    }
}
