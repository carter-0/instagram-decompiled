package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Qq  reason: invalid class name and case insensitive filesystem */
public final class C307576Qq {
    public final Map A00;
    public final Map A01;

    public C307576Qq(String str) {
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("assembled_bundles");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("localized_information");
            int length2 = jSONArray2.length();
            int i2 = 0;
            while (i2 < length2) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                JSONArray jSONArray3 = jSONObject.getJSONObject("meta").getJSONArray("included_bloks_apps_ids");
                jSONArray3.length();
                String string = jSONArray3.getJSONObject(0).getString("app_id");
                String string2 = jSONObject.getString("bundle_type");
                0qQ.A07(string2);
                Integer[] A002 = AnonymousClass05K.A00(2);
                int length3 = A002.length;
                int i3 = 0;
                while (i3 < length3) {
                    Integer num = A002[i3];
                    if (1 - num.intValue() != 0) {
                        str2 = "prepackaged";
                    } else {
                        str2 = "prebundled";
                    }
                    if (str2.equals(string2)) {
                        int intValue = num.intValue();
                        if (intValue == 0) {
                            String string3 = jSONObject.getString("locale");
                            String string4 = jSONObject.getJSONObject("public_cdn_url").getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                            String string5 = jSONObject.getString("content_security_type");
                            0qQ.A07(string5);
                            Integer[] A003 = AnonymousClass05K.A00(2);
                            int length4 = A003.length;
                            int i4 = 0;
                            while (i4 < length4) {
                                Integer num2 = A003[i4];
                                if (1 - num2.intValue() != 0) {
                                    str3 = "normal";
                                } else {
                                    str3 = "secure";
                                }
                                if (str3.equals(string5)) {
                                    String string6 = jSONArray3.getJSONObject(0).getString("checksum");
                                    0qQ.A0A(string6);
                                    0qQ.A0A(string4);
                                    C307586Qr r1 = new C307586Qr(string6, num2, string4);
                                    0qQ.A0A(string);
                                    0qQ.A0A(string3);
                                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s:%s", string, string3);
                                    0qQ.A07(formatStrLocaleSafe);
                                    linkedHashMap.put(formatStrLocaleSafe, r1);
                                } else {
                                    i4++;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        } else if (intValue == 1) {
                            String string7 = jSONObject.getJSONObject("prebundled_data").getString("payload_output_file");
                            0qQ.A0A(string7);
                            linkedHashMap2.put(string, new C307606Qt(string7));
                        } else {
                            throw new RuntimeException();
                        }
                        i2++;
                    } else {
                        i3++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        this.A01 = linkedHashMap;
        this.A00 = linkedHashMap2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r0 != null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C307586Qr A00(java.lang.String r9) {
        /*
            r8 = this;
            X.0eM r2 = X.Q3R.A00
            java.lang.Object r0 = r2.getValue()
            X.13t r0 = (X.13t) r0
            if (r0 == 0) goto L_0x0060
            java.util.Locale r1 = r0.AcD()
        L_0x000e:
            java.lang.String r7 = "en_US"
            if (r1 == 0) goto L_0x0062
            java.lang.Object r0 = r2.getValue()
            X.13t r0 = (X.13t) r0
            if (r0 == 0) goto L_0x0062
            java.util.Locale r0 = r0.C39(r1)
            if (r0 == 0) goto L_0x0062
            java.lang.String r6 = X.1UR.A01(r0)
            X.0qQ.A07(r6)
            java.util.Map r5 = r8.A01
            java.lang.String r4 = "%s:%s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r4, r9, r6)
            X.0qQ.A07(r0)
            java.lang.Object r0 = r5.get(r0)
            X.6Qr r0 = (X.C307586Qr) r0
            if (r0 != 0) goto L_0x005f
            r3 = 1
            char[] r1 = new char[r3]
            r0 = 95
            r2 = 0
            r1[r2] = r0
            java.util.List r1 = X.00l.A0Q(r6, r1, r2)
            int r0 = r1.size()
            if (r0 <= r3) goto L_0x0062
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r4, r9, r0)
            X.0qQ.A07(r0)
            java.lang.Object r0 = r5.get(r0)
            X.6Qr r0 = (X.C307586Qr) r0
            if (r0 == 0) goto L_0x0062
        L_0x005f:
            return r0
        L_0x0060:
            r1 = 0
            goto L_0x000e
        L_0x0062:
            java.util.Map r1 = r8.A01
            java.lang.String r0 = "%s:%s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r9, r7)
            X.0qQ.A07(r0)
            java.lang.Object r0 = r1.get(r0)
            X.6Qr r0 = (X.C307586Qr) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C307576Qq.A00(java.lang.String):X.6Qr");
    }
}
