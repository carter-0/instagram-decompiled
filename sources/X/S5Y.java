package X;

import android.util.Log;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class S5Y {
    public final C13886Tj9 A00;
    public final String A01;

    public final void A00(QOy qOy, Integer num, String str, String str2, Throwable th, Map map) {
        Long l;
        String str3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (qOy != null) {
            Map map2 = map;
            if (map != null) {
                A1H.putAll(map2);
            }
            A1H.put("snapshot_type", C9605Rdj.A00(qOy.A01));
            str3 = qOy.A04;
            l = Long.valueOf(qOy.A00);
        } else {
            l = null;
            str3 = null;
        }
        A01(num, (Integer) null, l, str3, str, str2, th, (Map) null, A1H);
    }

    public final void A02(Integer num, Integer num2, Long l, String str, Throwable th, Map map) {
        A01(num, num2, l, str, (String) null, (String) null, th, (Map) null, map);
    }

    public final void A01(Integer num, Integer num2, Long l, String str, String str2, String str3, Throwable th, Map map, Map map2) {
        JSONObject jSONObject;
        String str4;
        C13886Tj9 tj9 = this.A00;
        if (tj9 != null) {
            try {
                HashMap A1E = AnonymousClass7TE.A1E();
                String str5 = this.A01;
                if (str5 != null) {
                    A1E.put("waterfall_id", str5);
                }
                if (str2 != null) {
                    A1E.put("uploaded_media_id", str2);
                }
                if (str != null) {
                    A1E.put(AnonymousClass000.A00(738), str);
                }
                Map map3 = map2;
                if (map2 == null) {
                    jSONObject = DbS.A11();
                } else {
                    jSONObject = new JSONObject(map3);
                }
                if (l != null) {
                    jSONObject.put("timestamp_us", String.valueOf(l.longValue()));
                }
                if (num2 != null) {
                    jSONObject.put("snapshot_type", C9605Rdj.A00(num2));
                }
                if (jSONObject.length() > 0) {
                    A1E.put("snapshot_reference", jSONObject.toString());
                }
                if (th != null) {
                    String message = th.getMessage();
                    if (message != null) {
                        A1E.put("error_message", message);
                    }
                    A1E.put("error_stack_trace", Log.getStackTraceString(th));
                }
                if (str3 != null) {
                    String A0r = DbS.A0r("error_message", A1E);
                    if (A0r != null) {
                        str3 = 002.A0g(str3, ": ", A0r);
                    }
                    A1E.put("error_message", str3);
                }
                if (map != null) {
                    A1E.put("error_params", new JSONObject(map).toString());
                }
                switch (num.intValue()) {
                    case 0:
                        str4 = "media_accuracy_client_generic_error";
                        break;
                    case 1:
                        str4 = "media_accuracy_capturer_intermediate";
                        break;
                    case 2:
                        str4 = "media_accuracy_capturer_completed";
                        break;
                    case 3:
                        str4 = "media_accuracy_capturer_failed";
                        break;
                    case 4:
                        str4 = "media_accuracy_effects_burner_completed";
                        break;
                    case 5:
                        str4 = "media_accuracy_effects_burner_failed";
                        break;
                    case 6:
                        str4 = "media_accuracy_uploader_started";
                        break;
                    case 7:
                        str4 = "media_accuracy_uploader_completed";
                        break;
                    case 8:
                        str4 = "media_accuracy_uploader_failed";
                        break;
                    case 9:
                        str4 = "media_accuracy_uploader_cancelled";
                        break;
                    case 10:
                        str4 = "media_accuracy_uploader_skipped";
                        break;
                    case 11:
                        str4 = "media_accuracy_audio_recorder_started";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str4 = "media_accuracy_audio_recorder_completed";
                        break;
                    case 13:
                        str4 = "media_accuracy_audio_recorder_failed";
                        break;
                    default:
                        str4 = "media_accuracy_audio_file_created";
                        break;
                }
                tj9.logEvent(str4, A1E);
            } catch (Throwable unused) {
            }
        }
    }

    public S5Y(C13886Tj9 tj9, String str) {
        this.A00 = tj9;
        this.A01 = str;
    }
}
