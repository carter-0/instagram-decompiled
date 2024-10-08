package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Gl  reason: invalid class name and case insensitive filesystem */
public final class C376079Gl implements C376069Gk {
    public final F3S FHl(Cursor cursor, C368238sI r11) {
        C368238sI r8 = r11;
        0qQ.A0B(r11, 1);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("profile");
            return new F3S(jSONObject2.getString("uid"), jSONObject.getString("access_token"), "FACEBOOK", new C20575Wus(jSONObject2), C368108s5.A05, r8);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final C376119Gp FHh(Cursor cursor) {
        String str;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("profile");
            String string2 = jSONObject2.getString("uid");
            String string3 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (jSONObject2.has("profile_pic_url")) {
                str = jSONObject2.getString("profile_pic_url");
            } else {
                str = "";
            }
            return new C376119Gp(jSONObject.getString("access_token"), new C376109Go(string2, string3, str));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final F3S FHj(Cursor cursor, C368108s5 r4, C368238sI r5) {
        throw new RuntimeException("LiteProvider not used in Facebook Lite.");
    }

    public final C376119Gp FHk(Cursor cursor) {
        throw new RuntimeException("LiteProvider not used in Facebook Lite.");
    }

    public final FXDeviceItem FHm(Cursor cursor, C62447Kfx kfx, C368098s4 r8) {
        Long l;
        String string = cursor.getString(cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        String string2 = cursor.getString(cursor.getColumnIndex("timestamp"));
        if (string2 != null) {
            l = Long.valueOf(Long.parseLong(string2));
        } else {
            l = null;
        }
        return new FXDeviceItem(l, string, C368108s5.A05, C62447Kfx.DEVICE_ID);
    }
}
