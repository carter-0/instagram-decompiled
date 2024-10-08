package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class V6P {
    /* JADX WARNING: type inference failed for: r5v0, types: [X.V6O, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.V6N, java.lang.Object] */
    public static final ArrayList A00(String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(str).getJSONObject("trackCompositions").getJSONArray("4");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i).getJSONObject("dataTrack");
            jSONObject.getString("trackName");
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("trackDataJson"));
            jSONObject2.getString("stickerType");
            jSONObject2.getString("stickerAssetId");
            ? obj = new Object();
            JSONArray jSONArray2 = jSONObject.getJSONArray("dataSegments");
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                jSONObject3.getJSONObject("timeRange").getJSONObject("startTime").getLong("timeValue");
                jSONObject3.getJSONObject("timeRange").getJSONObject("endTime").getLong("timeValue");
                JSONObject jSONObject4 = new JSONObject(jSONObject3.getString("segmentDataJson"));
                jSONObject4.getDouble("relativeX");
                jSONObject4.getDouble("relativeY");
                jSONObject4.getDouble("relativeWidth");
                jSONObject4.getDouble("relativeHeight");
                jSONObject4.getDouble("rotationDegrees");
                arrayList.add(new VR0(new Object(), obj));
            }
        }
        return arrayList;
    }
}
