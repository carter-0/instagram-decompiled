package com.instagram.contentprovider;

import X.002;
import X.00l;
import X.03t;
import X.0BQ;
import X.0KC;
import X.0Pj;
import X.0Tu;
import X.0bY;
import X.0lg;
import X.0qQ;
import X.0qv;
import X.0tX;
import X.0xY;
import X.0xn;
import X.1CU;
import X.1Uk;
import X.A29;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0BO;
import X.AnonymousClass0cT;
import X.AnonymousClass1CT;
import X.AnonymousClass1UZ;
import X.AnonymousClass2VO;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C319606qt;
import X.C319646qx;
import X.C368108s5;
import X.C368188sD;
import X.C368208sF;
import X.C368238sI;
import X.C368248sJ;
import X.C368258sK;
import X.C48237EbI;
import X.C49265Es8;
import X.C49277EsK;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbY;
import X.F3S;
import X.FEV;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class FamilyAppsUserValuesProvider extends ContentProvider {
    public 0lg A00;
    public UserSession A01;
    public User A02;
    public String A03;
    public C48237EbI A04;

    public final boolean onCreate() {
        return true;
    }

    private final MatrixCursor A00() {
        String string;
        String str;
        User user = this.A02;
        if (user != null) {
            String username = user.getUsername();
            User user2 = this.A02;
            if (user2 != null) {
                String id = user2.getId();
                User user3 = this.A02;
                if (user3 != null) {
                    String fullName = user3.getFullName();
                    User user4 = this.A02;
                    if (user4 != null) {
                        String valueOf = String.valueOf(user4.CPm());
                        User user5 = this.A02;
                        if (user5 != null) {
                            ImageUrl Bh3 = user5.Bh3();
                            UserSession userSession = this.A01;
                            if (userSession != null) {
                                String str2 = AnonymousClass1CT.A00(userSession).A04;
                                UserSession userSession2 = this.A01;
                                if (userSession2 != null) {
                                    boolean A1Y = DbY.A1Y(0Tu.A05, userSession2, 36322654386399576L);
                                    if (str2 != null) {
                                        String url = Bh3.getUrl();
                                        Context context = getContext();
                                        if (context == null) {
                                            string = "";
                                        } else {
                                            1Uk A002 = AnonymousClass1UZ.A00(context).A00("XE_ACCESS_LIBRARY_DATA");
                                            0qQ.A07(A002);
                                            string = A002.getString("sso_settings_v2", (String) null);
                                        }
                                        if (A1Y) {
                                            str = "2";
                                        } else {
                                            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                                        }
                                        MatrixCursor matrixCursor = new MatrixCursor(A29.A00);
                                        matrixCursor.addRow(new String[]{username, fullName, str2, url, valueOf, null, null, string, str, id});
                                        UserSession userSession3 = this.A01;
                                        if (userSession3 != null) {
                                            C368208sF r4 = new C368208sF(userSession3);
                                            String obj = C368108s5.A06.toString();
                                            String obj2 = C368238sI.ACTIVE_ACCOUNT.toString();
                                            String str3 = this.A03;
                                            if (str3 != null) {
                                                HashMap A0m = DbY.A0m("waterfall_id", str3);
                                                A0m.put("target_app_fetch_result", "SUCCESS");
                                                C368188sD.A00(C368248sJ.TARGET_APP_FETCH_SUCCESS, obj, obj2, (String) null, (String) A0m.get("instance_key"), A0m, r4);
                                                if (r4.A02() != null) {
                                                    C368258sK.A01(A0m, r4.A02(), C368258sK.A00(A0m));
                                                }
                                                return matrixCursor;
                                            }
                                        }
                                    } else {
                                        UserSession userSession4 = this.A01;
                                        if (userSession4 != null) {
                                            C368208sF r8 = new C368208sF(userSession4);
                                            String obj3 = C368108s5.A06.toString();
                                            String obj4 = C368238sI.ACTIVE_ACCOUNT.toString();
                                            String str4 = this.A03;
                                            if (str4 != null) {
                                                HashMap A0m2 = DbY.A0m("waterfall_id", str4);
                                                A0m2.put("target_app_fetch_result", "FAILURE");
                                                C368188sD.A00(C368248sJ.TARGET_APP_FETCH_FAILURE, obj3, obj4, AnonymousClass000.A00(986), (String) A0m2.get("instance_key"), A0m2, r8);
                                                if (r8.A02() != null) {
                                                    C368258sK.A01(A0m2, r8.A02(), C368258sK.A00(A0m2));
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                    0qQ.A0F("waterfallId");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                            0qQ.A0F("userSession");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
            }
        }
        0qQ.A0F("currentUser");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        AnonymousClass2VO.A01.A01();
        return AnonymousClass7TE.A0a();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Emy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.EbI, java.lang.Object] */
    public final int delete(Uri uri, String str, String[] strArr) {
        C368188sD r7;
        Integer num;
        String[] strArr2;
        if (getContext() != null) {
            try {
                Context context = getContext();
                if (context != null) {
                    ((AnonymousClass0cT) AnonymousClass7TE.A14(C49277EsK.A00)).A02(context, (Intent) null, (0bY) null);
                    return 0;
                }
                throw AnonymousClass7TE.A0y();
            } catch (SecurityException e) {
                throw new SecurityException(AnonymousClass000.A00(102), e);
            }
        } else {
            String str2 = str;
            if (str == null) {
                return 0;
            }
            ? obj = new Object();
            UserSession userSession = this.A01;
            String str3 = null;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            C368208sF r0 = new C368208sF(userSession);
            ? obj2 = new Object();
            obj2.A00 = obj;
            obj2.A01 = r0;
            this.A04 = obj2;
            String[] strArr3 = strArr;
            if (strArr != null && 0 < strArr3.length) {
                str3 = strArr[0];
            }
            if (str3 == null) {
                str3 = "null";
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            try {
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                JSONArray jSONArray = new JSONArray(str2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    FEV.A00(A1C3, jSONArray, i);
                }
                ArrayList<FEV> A1C4 = AnonymousClass7TE.A1C();
                A1C4.addAll(A1C3);
                for (FEV fev : A1C4) {
                    DbU.A1X(fev.A01, A1C);
                    DbU.A1X(fev.A02, A1C2);
                }
                C368188sD r02 = obj2.A01;
                HashMap A012 = r02.A01("waterfall_id", str3);
                if (!A1C2.isEmpty() && !A1C.isEmpty()) {
                    Iterator it = A1C.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        Iterator it2 = A1C2.iterator();
                        while (it2.hasNext()) {
                            String str4 = (String) A012.get("waterfall_id");
                            C368188sD.A00(C368248sJ.REPLICATED_STORAGE_TARGET_APP_REMOVE_RECEIVED, A18, (String) it2.next(), (String) null, str4, A012, r02);
                        }
                    }
                }
                if (obj2.A00 == null) {
                    return 0;
                }
                ArrayList A1C5 = AnonymousClass7TE.A1C();
                JSONArray jSONArray2 = new JSONArray(str2);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    FEV.A00(A1C5, jSONArray2, i2);
                }
                ArrayList<FEV> A1C6 = AnonymousClass7TE.A1C();
                A1C6.addAll(A1C5);
                ArrayList A1C7 = AnonymousClass7TE.A1C();
                for (FEV fev2 : A1C6) {
                    A1C7.add(002.A0g(fev2.A01.A01, fev2.A02.A00, fev2.A00));
                }
                0tX A013 = 0xn.A01("access_library_shared_storage");
                Iterator it3 = A1C7.iterator();
                while (it3.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it3);
                    Iterator A16 = DbV.A16(A013.getAll());
                    while (A16.hasNext()) {
                        String A183 = AnonymousClass7TE.A18(A16);
                        0qQ.A0A(A183);
                        if (00l.A0d(A183, A182, false)) {
                            0xY AR4 = A013.AR4();
                            AR4.ED3(A183);
                            AR4.apply();
                        }
                    }
                }
                HashMap A014 = r02.A01("waterfall_id", str3);
                if (A1C2.isEmpty() || A1C.isEmpty()) {
                    return 1;
                }
                Iterator it4 = A1C.iterator();
                while (it4.hasNext()) {
                    String A184 = AnonymousClass7TE.A18(it4);
                    Iterator it5 = A1C2.iterator();
                    while (it5.hasNext()) {
                        C368188sD.A00(C368248sJ.REPLICATED_STORAGE_TARGET_APP_REMOVE_SUCCESS, A184, (String) it5.next(), (String) null, (String) A014.get("waterfall_id"), A014, r02);
                    }
                }
                return 1;
            } catch (JSONException unused) {
                r7 = obj2.A01;
                num = AnonymousClass05K.A0C;
                strArr2 = new String[]{"waterfall_id", str3};
                r7.A06(num, A1C, A1C2, r7.A01(strArr2));
                return 0;
            } catch (Exception e2) {
                r7 = obj2.A01;
                num = AnonymousClass05K.A05;
                strArr2 = new String[]{"errors", e2.getMessage(), "waterfall_id", str3};
                r7.A06(num, A1C, A1C2, r7.A01(strArr2));
                return 0;
            }
        }
    }

    public final String getType(Uri uri) {
        0KC.A02(FamilyAppsUserValuesProvider.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        0KC.A02(FamilyAppsUserValuesProvider.class, "Unsupported Operation");
        throw new UnsupportedOperationException();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String str4;
        String str5;
        MatrixCursor matrixCursor;
        char c;
        String[] strArr3;
        String str6;
        AnonymousClass2VO.A01.A01();
        if (!0Pj.A01(getContext())) {
            if (!((AnonymousClass0cT) AnonymousClass7TE.A14(C49277EsK.A00)).A03(getContext(), (Intent) null, (0bY) null)) {
                String A002 = AnonymousClass000.A00(102);
                0KC.A02(FamilyAppsUserValuesProvider.class, A002);
                throw new SecurityException(A002);
            }
        }
        this.A00 = DbS.A0S(this);
        String[] strArr4 = strArr2;
        if (strArr2 == null) {
            str3 = null;
        } else if (0 < strArr4.length) {
            str3 = strArr2[0];
        } else {
            str3 = null;
        }
        this.A03 = String.valueOf(str3);
        if (strArr2 == null) {
            str4 = null;
        } else if (1 < strArr4.length) {
            str4 = strArr2[1];
        } else {
            str4 = null;
        }
        if (String.valueOf(str4) == null) {
            str5 = "instanceKey";
        } else {
            String str7 = str;
            if (str != null) {
                int hashCode = str7.hashCode();
                if (hashCode != -875409851) {
                    if (hashCode != 928732438) {
                        if (hashCode == 1063606563 && str7.equals("name='saved_session_info'")) {
                            C319606qt.A00();
                            List<C319646qx> A032 = C319606qt.A03();
                            if (A032 != null && !A032.isEmpty()) {
                                matrixCursor = new MatrixCursor(A29.A00);
                                for (C319646qx r1 : A032) {
                                    matrixCursor.addRow(new Object[]{r1.A07, "", r1.A05, r1.A02, null, null, null, null, r1.A06});
                                }
                                return matrixCursor;
                            }
                            return null;
                        }
                    } else if (str7.equals("device_id_value")) {
                        c = 0;
                        matrixCursor = new MatrixCursor(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
                        strArr3 = new String[1];
                        str6 = 0qv.A00(getContext());
                    }
                } else if (str7.equals("machine_id_value")) {
                    c = 0;
                    matrixCursor = new MatrixCursor(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
                    strArr3 = new String[1];
                    0lg r0 = this.A00;
                    if (r0 != null) {
                        str6 = AnonymousClass1CT.A00(r0).A01.A00;
                    }
                    str5 = "session";
                }
                strArr3[c] = str6;
                matrixCursor.addRow(strArr3);
                return matrixCursor;
            }
            UserSession userSession = this.A00;
            if (userSession != null) {
                if (!(userSession instanceof UserSession)) {
                    0KC.A03(FamilyAppsUserValuesProvider.class, "No logged-in user");
                    return null;
                }
                UserSession userSession2 = userSession;
                this.A01 = userSession2;
                if (userSession2 == null) {
                    str5 = "userSession";
                } else {
                    this.A02 = AnonymousClass7TF.A0Q(userSession2);
                    if (!0qQ.A0K(str7, "all_session_info")) {
                        return A00();
                    }
                    UserSession userSession3 = this.A01;
                    str5 = "userSession";
                    if (userSession3 != null) {
                        0BQ A003 = AnonymousClass0BO.A00(userSession3);
                        User user = this.A02;
                        if (user == null) {
                            str5 = "currentUser";
                        } else {
                            List BO1 = A003.BO1(user);
                            if (BO1 == null || !AnonymousClass7TE.A1b(BO1)) {
                                return null;
                            }
                            matrixCursor = A00();
                            UserSession userSession4 = this.A01;
                            if (userSession4 != null) {
                                1CU A004 = AnonymousClass1CT.A00(userSession4);
                                ArrayList A0r = AnonymousClass7TG.A0r(BO1);
                                Iterator it = BO1.iterator();
                                while (it.hasNext()) {
                                    DbY.A1W(A0r, it);
                                }
                                List A012 = A004.A01(A0r);
                                if (matrixCursor != null) {
                                    int size = BO1.size();
                                    for (int i = 0; i < size; i++) {
                                        User A0g = DbS.A0g(BO1, i);
                                        String username = A0g.getUsername();
                                        String id = A0g.getId();
                                        String fullName = A0g.getFullName();
                                        String valueOf = String.valueOf(A0g.CPm());
                                        ImageUrl Bh3 = A0g.Bh3();
                                        String A19 = AnonymousClass7TE.A19(A012, i);
                                        if (!(A19 == null || A19.length() == 0)) {
                                            matrixCursor.addRow(new String[]{username, fullName, A19, Bh3.getUrl(), valueOf, null, null, null, null, id});
                                        }
                                    }
                                }
                                return matrixCursor;
                            }
                        }
                    }
                }
            }
            str5 = "session";
        }
        0qQ.A0F(str5);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Emy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.EbI, java.lang.Object] */
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        String str3;
        if (getContext() != null) {
            try {
                Context context = getContext();
                if (context != null) {
                    ((AnonymousClass0cT) AnonymousClass7TE.A14(C49277EsK.A00)).A02(context, (Intent) null, (0bY) null);
                    return 0;
                }
                throw AnonymousClass7TE.A0y();
            } catch (SecurityException e) {
                throw new SecurityException(AnonymousClass000.A00(102), e);
            }
        } else {
            ContentValues contentValues2 = contentValues;
            if (contentValues == null) {
                return 0;
            }
            ? obj = new Object();
            UserSession userSession = this.A01;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            C368208sF r0 = new C368208sF(userSession);
            ? obj2 = new Object();
            obj2.A00 = obj;
            obj2.A01 = r0;
            this.A04 = obj2;
            String[] strArr2 = strArr;
            if (strArr == null || 0 >= strArr2.length || (str2 = strArr[0]) == null) {
                str2 = "null";
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            try {
                Set<String> keySet = contentValues2.keySet();
                if (keySet != null) {
                    Iterator<String> it = keySet.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        if (contentValues2.getAsString(A18) != null) {
                            F3S A002 = C49265Es8.A00(contentValues2.getAsString(A18));
                            A1C.add(C49265Es8.A00(contentValues2.getAsString(A18)));
                            DbU.A1X(A002.A04, A1C2);
                            DbU.A1X(A002.A05, A1C3);
                        }
                    }
                }
                F3S[] f3sArr = new F3S[A1C.size()];
                C368188sD r1 = obj2.A01;
                HashMap A012 = r1.A01("waterfall_id", str2);
                if (!A1C3.isEmpty() && !A1C2.isEmpty()) {
                    Iterator it2 = A1C2.iterator();
                    while (it2.hasNext()) {
                        String A182 = AnonymousClass7TE.A18(it2);
                        Iterator it3 = A1C3.iterator();
                        while (it3.hasNext()) {
                            C368188sD.A00(C368248sJ.REPLICATED_STORAGE_TARGET_APP_SAVE_RECEIVED, A182, (String) it3.next(), (String) null, (String) A012.get("waterfall_id"), A012, r1);
                        }
                    }
                }
                if (obj2.A00 == null) {
                    return 0;
                }
                F3S[] f3sArr2 = (F3S[]) A1C.toArray(f3sArr);
                0qQ.A0B(f3sArr2, 0);
                for (F3S f3s : 03t.A0I(f3sArr2)) {
                    0qQ.A0B(f3s, 0);
                    0xY AR4 = 0xn.A01("access_library_shared_storage").AR4();
                    C368108s5 r14 = f3s.A04;
                    C368238sI r9 = f3s.A05;
                    String str4 = f3s.A02;
                    if (r14 == null || r9 == null || str4 == null) {
                        str3 = "";
                    } else {
                        str3 = 002.A0g(r14.A01, r9.A00, str4);
                    }
                    JSONObject A11 = DbS.A11();
                    A11.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
                    A11.put("auth_token", f3s.A01);
                    A11.put("account_type", f3s.A00);
                    A11.put("app_source", r14);
                    A11.put("credential_source", r9);
                    JSONObject A112 = DbS.A11();
                    Map map = f3s.A03;
                    Iterator A16 = DbV.A16(map);
                    while (A16.hasNext()) {
                        String A183 = AnonymousClass7TE.A18(A16);
                        A112.put(A183, map.get(A183));
                    }
                    A11.put("generic_data", A112);
                    AR4.E5g(str3, A11.toString());
                    AR4.apply();
                }
                if (f3sArr2.length == 0) {
                    r1.A07(AnonymousClass05K.A06, A1C2, A1C3, r1.A01("waterfall_id", str2));
                    return 0;
                }
                HashMap A013 = r1.A01("waterfall_id", str2);
                if (A1C3.isEmpty() || A1C2.isEmpty()) {
                    return 1;
                }
                Iterator it4 = A1C2.iterator();
                while (it4.hasNext()) {
                    String A184 = AnonymousClass7TE.A18(it4);
                    Iterator it5 = A1C3.iterator();
                    while (it5.hasNext()) {
                        C368188sD.A00(C368248sJ.REPLICATED_STORAGE_TARGET_APP_SAVE_SUCCESS, A184, (String) it5.next(), (String) null, (String) A013.get("waterfall_id"), A013, r1);
                    }
                }
                return 1;
            } catch (JSONException unused) {
                C368188sD r2 = obj2.A01;
                r2.A07(AnonymousClass05K.A0C, A1C2, A1C3, r2.A01("waterfall_id", str2));
                return -1;
            } catch (Exception e2) {
                C368188sD r7 = obj2.A01;
                r7.A07(AnonymousClass05K.A05, A1C2, A1C3, r7.A01("errors", e2.getMessage(), "waterfall_id", str2));
                return 0;
            }
        }
    }
}
