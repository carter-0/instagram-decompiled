package X;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public abstract class W2O {
    public String A00;
    public String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        A04();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A05(X.V4K r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.HashMap r3 = A01(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x001d }
            java.lang.String r0 = r5.A03     // Catch:{ IllegalArgumentException | JSONException -> 0x001d }
            java.lang.Object r2 = r3.get(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x001d }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IllegalArgumentException | JSONException -> 0x001d }
            if (r2 == 0) goto L_0x0020
            byte[] r1 = r5.A04     // Catch:{ IllegalArgumentException | JSONException -> 0x001d }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x001d }
            r2.remove(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x001d }
            r4.A03(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001d }
            goto L_0x0020
        L_0x001d:
            r4.A04()     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r4)
            return
        L_0x0022:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2O.A05(X.V4K):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        A04();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A06(java.util.List r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x003f }
            java.util.HashMap r5 = A01(r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            java.util.Iterator r4 = r7.iterator()     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
        L_0x000d:
            boolean r0 = r4.hasNext()     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            if (r0 == 0) goto L_0x0036
            java.lang.Object r3 = r4.next()     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            X.V4K r3 = (X.V4K) r3     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            java.lang.String r0 = r3.A03     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            java.lang.Object r2 = r5.get(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            if (r2 != 0) goto L_0x002b
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            r2.<init>()     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            r5.put(r0, r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
        L_0x002b:
            byte[] r1 = r3.A04     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            r2.put(r0, r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            goto L_0x000d
        L_0x0036:
            r6.A03(r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x003a }
            goto L_0x003d
        L_0x003a:
            r6.A04()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r6)
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2O.A06(java.util.List):void");
    }

    public W2O() {
        StringBuilder A0n;
        if (AnonymousClass7TF.A1Q("".length())) {
            this.A00 = 002.A0R("acs_storage_manager_cached_token:", "LS_IgdReceiverFetch");
            A0n = AnonymousClass7TF.A0n("acs_storage_manager_server_config:");
            A0n.append("LS_IgdReceiverFetch");
        } else {
            this.A00 = 002.A0i("acs_storage_manager_cached_token:", "LS_IgdReceiverFetch", "", ':');
            A0n = AnonymousClass7TF.A0n("acs_storage_manager_server_config:");
            A0n.append("LS_IgdReceiverFetch");
            A0n.append(':');
            A0n.append("");
        }
        this.A01 = A0n.toString();
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.V41, java.lang.Object] */
    public static final HashMap A00(W2O w2o) {
        String A11;
        HashMap hashMap = new HashMap();
        String str = w2o.A01;
        if (w2o instanceof C15147URz) {
            A11 = ((C15147URz) w2o).A00.getString(str, "");
        } else {
            A11 = DbT.A11(str, ((C15146URy) w2o).A00);
        }
        if (!(A11 == null || A11.length() == 0)) {
            JSONObject jSONObject = new JSONObject(A11);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(AnonymousClass7TE.A18(keys));
                String string = jSONObject2.getString("server_config_id");
                int i = jSONObject2.getInt("cipher_suite");
                byte[] decode = Base64.decode(jSONObject2.getString("public_key"), 2);
                int i2 = jSONObject2.getInt("max_evals");
                int i3 = jSONObject2.getInt("max_redemptions");
                long j = jSONObject2.getLong("config_expires_on");
                long j2 = jSONObject2.getLong("token_ttl");
                ? obj = new Object();
                obj.A05 = string;
                obj.A00 = i;
                obj.A06 = decode;
                obj.A01 = i2;
                obj.A02 = i3;
                obj.A03 = j;
                obj.A04 = j2;
                hashMap.put(string, obj);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.V4K, java.lang.Object] */
    public static final HashMap A01(W2O w2o) {
        String A11;
        HashMap hashMap = new HashMap();
        String str = w2o.A00;
        if (w2o instanceof C15147URz) {
            A11 = ((C15147URz) w2o).A00.getString(str, "");
        } else {
            A11 = DbT.A11(str, ((C15146URy) w2o).A00);
        }
        if (!(A11 == null || A11.length() == 0)) {
            JSONObject jSONObject = new JSONObject(A11);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String A18 = AnonymousClass7TE.A18(keys);
                JSONObject jSONObject2 = jSONObject.getJSONObject(A18);
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(keys2);
                    Object obj = jSONObject2.get(A182);
                    0qQ.A0C(obj, AnonymousClass000.A00(722));
                    JSONObject jSONObject3 = (JSONObject) obj;
                    String string = jSONObject3.getString("server_config_id");
                    byte[] decode = Base64.decode(jSONObject3.getString("nonce"), 2);
                    byte[] decode2 = Base64.decode(jSONObject3.getString(C66579MXk.A00(167)), 2);
                    long j = jSONObject3.getLong("token_expires_on");
                    int i = jSONObject3.getInt("max_redemptions");
                    int i2 = jSONObject3.getInt("number_redemptions");
                    ? obj2 = new Object();
                    obj2.A03 = string;
                    obj2.A04 = decode;
                    obj2.A05 = decode2;
                    obj2.A02 = j;
                    obj2.A00 = i;
                    obj2.A01 = i2;
                    hashMap2.put(A182, obj2);
                }
                hashMap.put(A18, hashMap2);
            }
        }
        return hashMap;
    }

    public static final void A02(W2O w2o, Map map) {
        JSONObject jSONObject = new JSONObject();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            V41 v41 = (V41) A1J.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("server_config_id", v41.A05);
            jSONObject2.put("cipher_suite", v41.A00);
            jSONObject2.put("public_key", Base64.encodeToString(v41.A06, 2));
            jSONObject2.put("max_evals", v41.A01);
            jSONObject2.put("max_redemptions", v41.A02);
            jSONObject2.put("config_expires_on", v41.A03);
            jSONObject2.put("token_ttl", v41.A04);
            jSONObject.put(A13, jSONObject2);
        }
        String str = w2o.A01;
        String A10 = DbT.A10(jSONObject);
        if (w2o instanceof C15147URz) {
            1W3 AR0 = ((C15147URz) w2o).A00.AR0();
            AR0.A09(str, A10);
            AR0.A0C(1);
            return;
        }
        ((C15146URy) w2o).A00.put(str, A10);
    }

    private final void A03(Map map) {
        JSONObject jSONObject = new JSONObject();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        int i = 0;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            JSONObject jSONObject2 = new JSONObject();
            Iterator A0v = AnonymousClass7TF.A0v((Map) A1J.getValue());
            while (A0v.hasNext()) {
                V4K v4k = (V4K) A0v.next();
                if (v4k.A00()) {
                    if (i >= 50) {
                        break;
                    }
                    i++;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("server_config_id", v4k.A03);
                    byte[] bArr = v4k.A04;
                    jSONObject3.put("nonce", Base64.encodeToString(bArr, 2));
                    jSONObject3.put(C66579MXk.A00(167), Base64.encodeToString(v4k.A05, 2));
                    jSONObject3.put("token_expires_on", v4k.A02);
                    jSONObject3.put("max_redemptions", v4k.A00);
                    jSONObject3.put("number_redemptions", v4k.A01);
                    jSONObject2.put(Base64.encodeToString(bArr, 2), jSONObject3);
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put(A13, jSONObject2);
            }
        }
        String str = this.A00;
        String A10 = DbT.A10(jSONObject);
        if (this instanceof C15147URz) {
            1W3 AR0 = ((C15147URz) this).A00.AR0();
            AR0.A09(str, A10);
            AR0.A0C(1);
            return;
        }
        ((C15146URy) this).A00.put(str, A10);
    }

    public final void A04() {
        if (this instanceof C15147URz) {
            C15147URz uRz = (C15147URz) this;
            1W3 AR0 = uRz.A00.AR0();
            AR0.A06(uRz.A00);
            AR0.A06(uRz.A01);
            AR0.A0C(1);
            return;
        }
        ((C15146URy) this).A00 = new HashMap();
    }
}
