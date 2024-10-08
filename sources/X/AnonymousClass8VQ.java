package X;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.8VQ  reason: invalid class name */
public abstract class AnonymousClass8VQ {
    public static 0xa A00;
    public static HashMap A01;
    public static JSONArray A02;
    public static final int A03 = "eId:".length();

    static {
        Pattern pattern = 0mp.A00;
    }

    public static AnonymousClass9U5 A00(String str) {
        String str2;
        if (A00 == null) {
            return null;
        }
        A03();
        AnonymousClass9U5 r2 = (AnonymousClass9U5) A01.get(str);
        if (r2 == null) {
            return r2;
        }
        try {
            C227922kK r3 = new C227922kK(str);
            String A0N = r3.A0N("FNumber");
            String A0N2 = r3.A0N("ExposureTime");
            String A0N3 = r3.A0N("WhiteBalance");
            String A0N4 = r3.A0N("ISOSpeedRatings");
            String A0N5 = r3.A0N("FocalLength");
            String A0N6 = r3.A0N("UserComment");
            if (A0N != null && r2.A01 == null) {
                r2.A01 = Float.valueOf(Float.parseFloat(A0N));
            }
            if (A0N4 != null && r2.A04 == null) {
                r2.A04 = Integer.valueOf(Integer.parseInt(A0N4));
            }
            if (A0N2 != null && r2.A05 == null) {
                r2.A05 = Long.valueOf((long) Math.round(Float.parseFloat(A0N2) * 1.0E9f));
            }
            if (A0N5 != null && r2.A02 == null) {
                r2.A02 = Float.valueOf(Float.parseFloat(A0N5));
            }
            if (A0N3 != null && r2.A03 == null) {
                r2.A03 = Integer.valueOf(Integer.parseInt(A0N3));
            }
            if (A0N6 == null) {
                return r2;
            }
            Pattern pattern = 0mp.A00;
            int length = A0N6.length();
            int i = A03;
            if (length <= i || !r2.A00().isEmpty()) {
                return r2;
            }
            List singletonList = Collections.singletonList(A0N6.substring(i));
            0qQ.A0B(singletonList, 0);
            r2.A0A = singletonList;
            return r2;
        } catch (IOException e) {
            if (e.getLocalizedMessage() != null) {
                str2 = e.getLocalizedMessage();
            } else {
                str2 = "";
            }
            0kD.A01("GalleryMetadataUtil", str2);
            return r2;
        }
    }

    public static JSONArray A01(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        if (!z || jSONArray.length() > 1) {
            int i = z;
            while (i < jSONArray.length()) {
                try {
                    jSONArray2.put(jSONArray.get(i));
                    i++;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return jSONArray2;
    }

    public static void A02() {
        0xa r1 = A00;
        if (r1 != null && A02 != null) {
            0xY AR4 = r1.AR4();
            AR4.E5g("GalleryMetadataList", A02.toString());
            AR4.apply();
        }
    }

    public static void A03() {
        int i;
        String str;
        String string;
        if (A01 == null) {
            JSONArray jSONArray = A02;
            if (jSONArray != null) {
                i = jSONArray.length();
            } else {
                i = 16;
            }
            A01 = new HashMap(i);
            JSONArray jSONArray2 = A02;
            if (jSONArray2 == null) {
                0xa r2 = A00;
                if (r2 == null || (string = r2.getString("GalleryMetadataList", (String) null)) == null) {
                    jSONArray2 = new JSONArray();
                } else {
                    try {
                        jSONArray2 = new JSONArray(string);
                    } catch (JSONException unused) {
                        jSONArray2 = new JSONArray();
                    }
                }
                A02 = jSONArray2;
            }
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    AnonymousClass9U5 parseFromJson = AnonymousClass9UH.parseFromJson(16P.A00(A02.getString(i2)));
                    if (!(parseFromJson == null || (str = parseFromJson.A08) == null || str.isEmpty())) {
                        A01.put(str, parseFromJson);
                    }
                } catch (IOException | JSONException e) {
                    0KC.A0G("GalleryMetadataUtil", e.getLocalizedMessage() != null ? e.getLocalizedMessage() : "", e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r1 = new org.json.JSONArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        if (r1.getLocalizedMessage() != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        r3 = r1.getLocalizedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        X.0KC.A0G("GalleryMetadataUtil", r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4 A[ExcHandler: IOException | JSONException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.instagram.common.session.UserSession r7, X.AnonymousClass9U5 r8) {
        /*
            java.lang.String r3 = ""
            java.lang.String r2 = "GalleryMetadataUtil"
            java.lang.String r0 = r8.A08
            if (r0 == 0) goto L_0x00c2
            org.json.JSONArray r0 = A02     // Catch:{ IOException | JSONException -> 0x00b4 }
            if (r0 != 0) goto L_0x002c
            X.0xa r4 = A00     // Catch:{ IOException | JSONException -> 0x00b4 }
            if (r4 == 0) goto L_0x001f
            r1 = 0
            java.lang.String r0 = "GalleryMetadataList"
            java.lang.String r0 = r4.getString(r0, r1)     // Catch:{ IOException | JSONException -> 0x00b4 }
            if (r0 == 0) goto L_0x001f
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0025, IOException | JSONException -> 0x00b4 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0025, IOException | JSONException -> 0x00b4 }
            goto L_0x002a
        L_0x001f:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ IOException | JSONException -> 0x00b4 }
            r1.<init>()     // Catch:{ IOException | JSONException -> 0x00b4 }
            goto L_0x002a
        L_0x0025:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ IOException | JSONException -> 0x00b4 }
            r1.<init>()     // Catch:{ IOException | JSONException -> 0x00b4 }
        L_0x002a:
            A02 = r1     // Catch:{ IOException | JSONException -> 0x00b4 }
        L_0x002c:
            A03()     // Catch:{ IOException | JSONException -> 0x00b4 }
            r6 = 0
            X.0qQ.A0B(r7, r6)     // Catch:{ IOException | JSONException -> 0x00b4 }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ IOException | JSONException -> 0x00b4 }
            r0 = 36330836299629350(0x8112b400084326, double:3.039105396196568E-306)
            boolean r4 = X.182.A06(r4, r7, r0)     // Catch:{ IOException | JSONException -> 0x00b4 }
            org.json.JSONArray r0 = A02     // Catch:{ IOException | JSONException -> 0x00b4 }
            int r1 = r0.length()     // Catch:{ IOException | JSONException -> 0x00b4 }
            r0 = 100
            r5 = 0
            if (r1 <= r0) goto L_0x0074
            org.json.JSONArray r0 = A02     // Catch:{ IOException | JSONException -> 0x00b4 }
            java.lang.String r0 = r0.getString(r6)     // Catch:{ IOException | JSONException -> 0x00b4 }
            if (r0 == 0) goto L_0x0074
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException | JSONException -> 0x00b4 }
            X.9U5 r0 = X.AnonymousClass9UH.parseFromJson(r0)     // Catch:{ IOException | JSONException -> 0x00b4 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = r0.A08     // Catch:{ IOException | JSONException -> 0x00b4 }
            if (r1 == 0) goto L_0x006a
            boolean r0 = r1.isEmpty()     // Catch:{ IOException | JSONException -> 0x00b4 }
            if (r0 != 0) goto L_0x006a
            java.util.HashMap r0 = A01     // Catch:{ IOException | JSONException -> 0x00b4 }
            r0.remove(r1)     // Catch:{ IOException | JSONException -> 0x00b4 }
        L_0x006a:
            r1 = 1
            if (r4 == 0) goto L_0x0077
            org.json.JSONArray r0 = A02     // Catch:{ IOException | JSONException -> 0x00b4 }
            org.json.JSONArray r4 = A01(r0, r1)     // Catch:{ IOException | JSONException -> 0x00b4 }
            goto L_0x008f
        L_0x0074:
            if (r4 == 0) goto L_0x007f
            goto L_0x0089
        L_0x0077:
            org.json.JSONArray r0 = A02     // Catch:{ IOException | JSONException -> 0x00b4 }
            org.json.JSONArray r0 = A01(r0, r1)     // Catch:{ IOException | JSONException -> 0x00b4 }
            A02 = r0     // Catch:{ IOException | JSONException -> 0x00b4 }
        L_0x007f:
            org.json.JSONArray r1 = A02     // Catch:{ IOException | JSONException -> 0x00b4 }
            java.lang.String r0 = X.AnonymousClass9UH.A00(r8)     // Catch:{ IOException | JSONException -> 0x00b4 }
            r1.put(r0)     // Catch:{ IOException | JSONException -> 0x00b4 }
            goto L_0x00ac
        L_0x0089:
            org.json.JSONArray r0 = A02     // Catch:{ IOException | JSONException -> 0x00b4 }
            org.json.JSONArray r4 = A01(r0, r6)     // Catch:{ IOException | JSONException -> 0x00b4 }
        L_0x008f:
            java.lang.String r0 = X.AnonymousClass9UH.A00(r8)     // Catch:{ IOException | JSONException -> 0x00b4 }
            r4.put(r0)     // Catch:{ IOException | JSONException -> 0x00b4 }
            java.lang.String r1 = "length of savedMediaMetadataJsonArrayCopy "
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x00b4 }
            java.lang.String r1 = X.002.A0O(r1, r0)     // Catch:{ IOException | JSONException -> 0x00b4 }
            r0 = 1
            X.0qQ.A0B(r1, r0)     // Catch:{ IOException | JSONException -> 0x00b4 }
            r0 = 817895804(0x30c0197c, float:1.3977082E-9)
            X.0kD.A04(r2, r1, r0, r5)     // Catch:{ IOException | JSONException -> 0x00b4 }
            A02 = r4     // Catch:{ IOException | JSONException -> 0x00b4 }
        L_0x00ac:
            java.util.HashMap r1 = A01     // Catch:{ IOException | JSONException -> 0x00b4 }
            java.lang.String r0 = r8.A08     // Catch:{ IOException | JSONException -> 0x00b4 }
            r1.put(r0, r8)     // Catch:{ IOException | JSONException -> 0x00b4 }
            return
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = r1.getLocalizedMessage()
            if (r0 == 0) goto L_0x00bf
            java.lang.String r3 = r1.getLocalizedMessage()
        L_0x00bf:
            X.0KC.A0G(r2, r3, r1)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VQ.A04(com.instagram.common.session.UserSession, X.9U5):void");
    }

    public static void A05(AnonymousClass3Q2 r3, String str) {
        AnonymousClass9U5 A002 = A00(str);
        if (A002 != null) {
            if (!A002.A00().isEmpty()) {
                r3.A2o = (String) A002.A00().get(0);
            }
            String str2 = A002.A06;
            if (str2 != null) {
                r3.A2V = str2;
            }
            String str3 = A002.A07;
            if (str3 != null) {
                r3.A2n = str3;
            }
        }
    }
}
