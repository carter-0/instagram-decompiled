package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Gj  reason: invalid class name and case insensitive filesystem */
public final class C376059Gj implements C376069Gk {
    public final C376119Gp FHh(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("profile");
            return new C376119Gp(jSONObject.getString("access_token"), new C376109Go(jSONObject2.getString("uid"), jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject2.getString("pic_square")));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.9Gp, java.lang.Object] */
    public final C376119Gp FHk(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            String optString = jSONObject.optString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String optString3 = jSONObject.optString("profilePicUrl");
            String optString4 = jSONObject.optString("accessToken");
            String optString5 = jSONObject.optString("sso_settings_v2");
            C376109Go r1 = new C376109Go(optString, optString2, optString3);
            C376129Gq A00 = C39607A1x.A00(optString5);
            ? obj = new Object();
            obj.A01 = r1;
            obj.A00 = optString4;
            obj.A02 = A00;
            return obj;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

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
            return new F3S(jSONObject2.getString("uid"), jSONObject.getString("access_token"), "FACEBOOK", new C41533Avb(jSONObject2), C368108s5.A03, r8);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.0rm, java.lang.Object] */
    public final F3S FHj(Cursor cursor, C368108s5 r15, C368238sI r16) {
        String str;
        String str2 = "";
        C368108s5 r11 = r15;
        0qQ.A0B(r15, 1);
        C368238sI r12 = r16;
        0qQ.A0B(r12, 2);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            ? obj = new Object();
            obj.A00 = str2;
            ? obj2 = new Object();
            obj2.A00 = str2;
            if (jSONObject.has("userId")) {
                str = jSONObject.getString("userId");
            } else {
                str = str2;
            }
            if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                obj.A00 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            }
            if (jSONObject.has("profilePicUrl")) {
                obj2.A00 = jSONObject.getString("profilePicUrl");
            }
            if (jSONObject.has("accessToken")) {
                str2 = jSONObject.getString("accessToken");
            }
            return new F3S(str, str2, r15.name(), new C20576Wut(obj, obj2), r11, r12);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final FXDeviceItem FHm(Cursor cursor, C62447Kfx kfx, C368098s4 r7) {
        String string;
        C368108s5 r1;
        String string2;
        int columnIndex = cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        Long l = null;
        if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null || string.equals("")) {
            return null;
        }
        int columnIndex2 = cursor.getColumnIndex("timestamp");
        if (!(columnIndex2 == -1 || (string2 = cursor.getString(columnIndex2)) == null)) {
            l = Long.valueOf(Long.parseLong(string2));
        }
        if (r7 == C368098s4.MESSENGER) {
            r1 = C368108s5.A08;
        } else {
            r1 = C368108s5.A03;
        }
        return new FXDeviceItem(l, string, r1, kfx);
    }
}
