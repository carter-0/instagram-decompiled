package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.W2k  reason: case insensitive filesystem */
public final class C18798W2k {
    public static final C18798W2k A00 = new Object();

    public static final void A02(1P0 r6, UserSession userSession, String str) {
        1ES.A05(C13989Tnp.A0T(r6, new C239133Fc(C18209VnZ.class, "StructuredSurveyQuery", 0mp.A06("{\"%s\":\"%s\"}", new Object[]{"0", str}), true), new C239123Fb(userSession)), 221, 3, false, false);
    }

    public static final void A00(Activity activity, UserSession userSession, C17442VVv vVv, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Bundle bundle;
        String str7;
        Activity activity2 = activity;
        if (vVv != null) {
            String str8 = str2;
            if (str2 != null) {
                String str9 = str3;
                if (str3 != null) {
                    try {
                        String A002 = C18207VnX.A00(vVv);
                        if (1Wj.A00 != null) {
                            String str10 = str6;
                            String str11 = str;
                            if (z) {
                                str7 = C273654mx.A00(3206);
                                0qQ.A0A(A002);
                                C51972G9s.A1D(str10, A002);
                                bundle = Q21.A00(new 0eP("ARG_INTEGRATION_POINT_ID", str11), new 0eP("ARG_SURVEY_ID", str8), new 0eP("ARG_SESSION_BLOB", str9), new 0eP("ARG_OUTRO_TOAST_TEXT", str10), new 0eP("ARG_SERIALIZED_MODEL_DATA", A002));
                            } else {
                                str7 = C273654mx.A00(3205);
                                0qQ.A0A(A002);
                                String str12 = str4;
                                String str13 = str5;
                                C51974G9v.A0d(3, str12, str13, str10, A002);
                                bundle = Q21.A00(new 0eP("ARG_SERIALIZED_MODEL_DATA", A002), new 0eP("ARG_TOAST_TEXT", str12), new 0eP("ARG_INTRO_TOAST_BUTTON", str13), new 0eP("ARG_OUTRO_TOAST_TEXT", str10), new 0eP("ARG_INTEGRATION_POINT_ID", str11), new 0eP("ARG_SURVEY_ID", str8), new 0eP("ARG_SESSION_BLOB", str9));
                            }
                            DbU.A0w(activity2, bundle, userSession, TransparentModalActivity.class, str7);
                            return;
                        }
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
        }
        C59689JTv.A0F(activity2.getApplicationContext(), "rapid_feedback_survey_error", 2131964387);
    }

    public static final void A01(Activity activity, UserSession userSession, C15631Ufx ufx, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        C17444VVx vVx = ufx.A00;
        if (vVx != null) {
            Activity activity2 = activity;
            String A16 = AnonymousClass7TE.A16(activity, 2131974580);
            C17445VVy vVy = vVx.A01;
            C17442VVv vVv = null;
            if (vVy == null || (str2 = vVy.A01) == null || str2.length() == 0) {
                str2 = AnonymousClass7TE.A16(activity, 2131974581);
            }
            C17445VVy vVy2 = vVx.A01;
            if (vVy2 == null || (str3 = vVy2.A02) == null || str3.length() == 0) {
                str3 = AnonymousClass7TE.A16(activity2, 2131974582);
            }
            C17352VSf vSf = vVx.A00;
            if (vSf != null) {
                str4 = vSf.A01;
                vVv = vSf.A00;
            } else {
                str4 = null;
            }
            A00(activity2, userSession, vVv, str, str4, vVx.A02, str2, A16, str3, z);
        }
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.VTx] */
    public static final void A03(1P0 r11, UserSession userSession, String str, Map map) {
        ArrayList arrayList;
        String str2;
        try {
            if (Systrace.A0E(1)) {
                0fS.A01("fetchSurvey", -4234951);
            }
            if (map == null) {
                map = new HashMap();
            }
            if (map.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    String A13 = DbT.A13(A1J);
                    ? obj = new Object();
                    obj.A00 = A13;
                    obj.A01 = (String) A1J.getValue();
                    arrayList.add(obj);
                }
            }
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            A0K.A0R("0", str);
            if (arrayList != null) {
                16P.A03(A0K, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C17396VTx vTx = (C17396VTx) it.next();
                    if (vTx != null) {
                        A0K.A0c();
                        String str3 = vTx.A00;
                        if (str3 != null) {
                            A0K.A0R(AnonymousClass000.A00(1228), str3);
                        }
                        String str4 = vTx.A01;
                        if (str4 != null) {
                            A0K.A0R(AnonymousClass000.A00(1229), str4);
                        }
                        A0K.A0Z();
                    }
                }
                A0K.A0Y();
            }
            str2 = AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException e) {
            0KC.A0G("RapidFeedbackApiUtil", "Error serializing to JSON; use simple integration id as input", e);
            str2 = 0mp.A06("{\"%s\":\"%s\"}", new Object[]{"0", str});
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(2127855927);
            }
            throw th;
        }
        1ES.A05(C13989Tnp.A0T(r11, new C239133Fc(C18210Vna.class, "SurveyIntegrationPointQuery", str2, true), new C239123Fb(userSession)), 220, 3, false, false);
        if (Systrace.A0E(1)) {
            0fS.A00(-1934863485);
        }
    }

    public final void A04(Activity activity, UserSession userSession, C15630Ufw ufw, String str, boolean z) {
        A00(activity, userSession, ufw.A00, C273654mx.A00(1171), str, "", activity.getString(2131974581), activity.getString(2131974580), activity.getString(2131974582), z);
    }
}
