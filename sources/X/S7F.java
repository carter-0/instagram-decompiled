package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class S7F {
    public List A00 = AnonymousClass7TE.A1C();
    public final AnonymousClass45J A01;
    public final TreeSet A02 = new TreeSet(new C13114TLx((Object) this, 1));

    public final synchronized SJY A00(SJY sjy) {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            SJY sjy2 = (SJY) it.next();
            if (sjy2.equals(sjy)) {
                return sjy2;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r4.A00().isEmpty() != false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.TreeSet A01() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.TreeSet r3 = r8.A02     // Catch:{ all -> 0x00b0 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00ae
            X.45J r2 = r8.A01     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00ae
            java.lang.String r1 = "/settings_mqtt_address"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x00b0 }
            org.json.JSONObject r1 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x00a6 }
            java.lang.String r0 = "address_entries"
            org.json.JSONArray r6 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x00a6 }
            if (r6 == 0) goto L_0x00ae
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00a6 }
            if (r0 <= 0) goto L_0x00ae
            r5 = 0
        L_0x0028:
            int r0 = r6.length()     // Catch:{ JSONException -> 0x00a6 }
            if (r5 >= r0) goto L_0x00ae
            java.lang.String r1 = r6.getString(r5)     // Catch:{ JSONException -> 0x00a6 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00a6 }
            if (r0 == 0) goto L_0x003a
            r4 = 0
            goto L_0x0085
        L_0x003a:
            org.json.JSONObject r1 = X.C66580MXl.A17(r1)     // Catch:{ JSONException -> 0x00a6 }
            X.SJY r4 = new X.SJY     // Catch:{ JSONException -> 0x00a6 }
            r4.<init>()     // Catch:{ JSONException -> 0x00a6 }
            java.lang.String r0 = "host_name"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x00a6 }
            r4.A02 = r0     // Catch:{ JSONException -> 0x00a6 }
            java.lang.String r0 = "priority"
            int r0 = r1.optInt(r0)     // Catch:{ JSONException -> 0x00a6 }
            r4.A01 = r0     // Catch:{ JSONException -> 0x00a6 }
            java.lang.String r0 = "fail_count"
            int r0 = r1.optInt(r0)     // Catch:{ JSONException -> 0x00a6 }
            r4.A00 = r0     // Catch:{ JSONException -> 0x00a6 }
            java.lang.String r0 = "address_list_data"
            org.json.JSONArray r7 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x00a6 }
            if (r7 == 0) goto L_0x0085
            int r0 = r7.length()     // Catch:{ JSONException -> 0x00a6 }
            java.util.ArrayList r2 = X.DbS.A0v(r0)     // Catch:{ JSONException -> 0x00a6 }
            r1 = 0
        L_0x006d:
            int r0 = r7.length()     // Catch:{ JSONException -> 0x00a6 }
            if (r1 >= r0) goto L_0x0083
            boolean r0 = r7.isNull(r1)     // Catch:{ JSONException -> 0x00a6 }
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = r7.getString(r1)     // Catch:{ JSONException -> 0x00a6 }
            r2.add(r0)     // Catch:{ JSONException -> 0x00a6 }
        L_0x0080:
            int r1 = r1 + 1
            goto L_0x006d
        L_0x0083:
            r4.A04 = r2     // Catch:{ JSONException -> 0x00a6 }
        L_0x0085:
            r4.getClass()     // Catch:{ JSONException -> 0x00a6 }
            java.util.List r0 = r4.A04     // Catch:{ JSONException -> 0x00a6 }
            if (r0 == 0) goto L_0x009d
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x00a6 }
            if (r0 != 0) goto L_0x009d
            java.util.List r0 = r4.A00()     // Catch:{ JSONException -> 0x00a6 }
            boolean r1 = r0.isEmpty()     // Catch:{ JSONException -> 0x00a6 }
            r0 = 1
            if (r1 == 0) goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            r8.A03(r4)     // Catch:{ JSONException -> 0x00a6 }
        L_0x00a3:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x00a6:
            r2 = move-exception
            java.lang.String r1 = "AddressEntries"
            java.lang.String r0 = "Cannot create JSONObject from rawJson"
            X.0KC.A0G(r1, r0, r2)     // Catch:{ all -> 0x00b0 }
        L_0x00ae:
            monitor-exit(r8)
            return r3
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7F.A01():java.util.TreeSet");
    }

    public final synchronized void A02() {
        synchronized (this) {
            List<SJY> list = this.A00;
            list.clear();
            Iterator it = A01().iterator();
            while (it.hasNext()) {
                list.add((SJY) it.next());
            }
            AnonymousClass45J r0 = this.A01;
            if (r0 != null) {
                try {
                    C13849TiS AR1 = r0.AR1();
                    JSONObject A11 = DbS.A11();
                    JSONArray A1E = Pxe.A1E();
                    for (SJY sjy : list) {
                        JSONObject A112 = DbS.A11();
                        A112.putOpt(TraceFieldType.HostName, sjy.A02);
                        A112.put("priority", sjy.A01);
                        A112.put("fail_count", sjy.A00);
                        if (sjy.A04 != null) {
                            JSONArray A1E2 = Pxe.A1E();
                            for (Object put : sjy.A04) {
                                A1E2.put(put);
                            }
                            A112.put("address_list_data", A1E2);
                        }
                        A1E.put(A112.toString());
                    }
                    A11.put("address_entries", A1E);
                    AR1.E5e("/settings_mqtt_address", A11.toString());
                    AR1.AIR("AddressEntries", "Failed to save addressEntries");
                } catch (JSONException e) {
                    0KC.A0G("AddressEntries", "Could not serialize addressEntries", e);
                }
            }
        }
        return;
    }

    public final synchronized void A03(SJY sjy) {
        TreeSet treeSet = this.A02;
        if (treeSet.size() >= 10) {
            treeSet.pollLast();
        }
        treeSet.add(sjy);
    }

    public final synchronized void A04(SJY sjy, SJY sjy2) {
        this.A02.remove(sjy);
        A03(sjy2);
    }

    public S7F(AnonymousClass45J r3) {
        this.A01 = r3;
    }
}
