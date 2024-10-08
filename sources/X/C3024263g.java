package X;

import android.util.Base64;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.63g  reason: invalid class name and case insensitive filesystem */
public final class C3024263g {
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.Npx] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.Npy] */
    public static final ONA A00(byte[] bArr) {
        byte[] bArr2;
        try {
            JSONArray jSONArray = new JSONObject(new String(bArr, AnonymousClass15Q.A05)).getJSONArray("entries");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                0qQ.A0A(jSONObject);
                0qQ.A0B(jSONObject, 0);
                String string = jSONObject.getString("userId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("features");
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    0qQ.A07(jSONObject2);
                    String string2 = jSONObject2.getString("feature");
                    if (jSONObject2.has("backupData")) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("backupData");
                        bArr2 = new byte[jSONArray3.length()];
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            Object obj = jSONArray3.get(i3);
                            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Int");
                            bArr2[i3] = (byte) ((Integer) obj).intValue();
                        }
                    } else {
                        bArr2 = Base64.decode(jSONObject2.getString("bd"), 0);
                    }
                    0qQ.A0A(string2);
                    0qQ.A0B(string2, 1);
                    0qQ.A0B(bArr2, 2);
                    ? obj2 = new Object();
                    obj2.A00 = string2;
                    obj2.A01 = bArr2;
                    arrayList2.add(obj2);
                }
                0qQ.A0A(string);
                0qQ.A0B(string, 1);
                ? obj3 = new Object();
                obj3.A00 = string;
                obj3.A01 = arrayList2;
                arrayList.add(obj3);
            }
            return new ONA(arrayList);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final byte[] A01(ONA ona) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (C69675Npx npx : ona.A00) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                for (C69676Npy npy : npx.A01) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("feature", npy.A00);
                    jSONObject3.put("bd", Base64.encodeToString(npy.A01, 2));
                    jSONArray2.put(jSONObject3);
                }
                jSONObject2.put("userId", npx.A00);
                jSONObject2.put("features", jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("entries", jSONArray);
            String obj = jSONObject.toString();
            0qQ.A07(obj);
            byte[] bytes = obj.getBytes(AnonymousClass15Q.A05);
            0qQ.A07(bytes);
            return bytes;
        } catch (Exception unused) {
            return null;
        }
    }
}
