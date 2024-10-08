package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Gm  reason: invalid class name and case insensitive filesystem */
public final class C376089Gm implements C376069Gk {
    /* JADX WARNING: type inference failed for: r3v2, types: [X.9Gp, java.lang.Object] */
    public final C376119Gp FHk(Cursor cursor) {
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            String optString = jSONObject.optString("userId");
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

    public final F3S FHl(Cursor cursor, C368238sI r13) {
        C368238sI r10 = r13;
        0qQ.A0B(r13, 1);
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_USER_ID");
        int columnIndex3 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex4 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex5 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex6 = cursor.getColumnIndex("COL_UPSELL_HOLDOUT_STATUS");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1) {
            throw new RuntimeException("Column not found.");
        }
        String string = cursor.getString(columnIndex2);
        String string2 = cursor.getString(columnIndex5);
        if (string == null || string2 == null) {
            throw null;
        }
        return new F3S(string, string2, "INSTAGRAM", new C20579Wuw(cursor, columnIndex3, columnIndex4, columnIndex6), C368108s5.A06, r10);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.9Gp, java.lang.Object] */
    public final C376119Gp FHh(Cursor cursor) {
        String string;
        String str;
        int columnIndex = cursor.getColumnIndex("COL_USER_ID");
        int columnIndex2 = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex3 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex4 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex5 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex6 = cursor.getColumnIndex("COL_UPSELL_HOLDOUT_STATUS");
        int columnIndex7 = cursor.getColumnIndex("COL_SSO_SETTINGS_CACHE");
        if (columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1) {
            throw new RuntimeException("Column not found.");
        }
        if (columnIndex != -1) {
            string = cursor.getString(columnIndex);
        } else {
            string = cursor.getString(columnIndex2);
        }
        cursor.getString(columnIndex2);
        String string2 = cursor.getString(columnIndex5);
        if (string == null || string2 == null) {
            throw null;
        }
        if (columnIndex7 != -1) {
            str = cursor.getString(columnIndex7);
        } else {
            str = "";
        }
        C376129Gq A00 = C39607A1x.A00(str);
        C376109Go r1 = new C376109Go(string, cursor.getString(columnIndex3), cursor.getString(columnIndex4));
        if (columnIndex6 != -1) {
            cursor.getString(columnIndex6);
        }
        ? obj = new Object();
        obj.A01 = r1;
        obj.A00 = string2;
        obj.A02 = A00;
        return obj;
    }

    public final F3S FHj(Cursor cursor, C368108s5 r12, C368238sI r13) {
        String str;
        C368108s5 r8 = r12;
        0qQ.A0B(r12, 1);
        C368238sI r9 = r13;
        0qQ.A0B(r13, 2);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(string);
            String str2 = "";
            if (jSONObject.has("userId")) {
                str = jSONObject.getString("userId");
            } else {
                str = str2;
            }
            if (jSONObject.has("accessToken")) {
                str2 = jSONObject.getString("accessToken");
            }
            return new F3S(str, str2, r12.name(), new C20578Wuv(jSONObject), r8, r9);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final FXDeviceItem FHm(Cursor cursor, C62447Kfx kfx, C368098s4 r7) {
        int columnIndex = cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (columnIndex != -1) {
            return new FXDeviceItem((Long) null, cursor.getString(columnIndex), C368108s5.A06, kfx);
        }
        throw new RuntimeException("Column not found.");
    }
}
