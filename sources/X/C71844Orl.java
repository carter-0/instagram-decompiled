package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Orl  reason: case insensitive filesystem */
public final class C71844Orl implements AnonymousClass28l, AnonymousClass0lh {
    public final UserSession A00;
    public final Map A01 = AnonymousClass7TE.A1H();

    public C71844Orl(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final String getContentInBackground(Context context) {
        Long l;
        Long l2;
        String str;
        int i;
        String str2;
        String str3;
        2Dm A002 = 2L2.A00(this.A00);
        Iterator it = A002.Bk6().iterator();
        while (it.hasNext()) {
            DirectThreadKey directThreadKey = (DirectThreadKey) it.next();
            AnonymousClass3U9 B33 = A002.B33(directThreadKey);
            if (B33 != null) {
                this.A01.put(B33, A002.Bk4(directThreadKey, true));
            }
        }
        try {
            JSONObject A11 = DbS.A11();
            JSONArray jSONArray = new JSONArray();
            Iterator A0u = AnonymousClass7TF.A0u(this.A01);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                AnonymousClass2Ep r3 = (AnonymousClass2Ep) A1J.getKey();
                List list = (List) A1J.getValue();
                JSONObject A112 = DbS.A11();
                A112.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r3.C6C());
                A112.put("thread_title", r3.C6f());
                A112.put("is_in_shh_mode", r3.CVE());
                C272964li Axk = r3.Axk();
                if (Axk != null) {
                    A112.put("is_in_dm_mode", Axk.A08);
                    A112.put("last_set_timestamp_ms_for_dm", String.valueOf(Axk.A05));
                }
                A5N BHu = r3.BHu();
                if (BHu != null) {
                    l = BHu.A00;
                } else {
                    l = null;
                }
                A112.put("cutover_timestamp", l);
                A5N BHu2 = r3.BHu();
                if (BHu2 != null) {
                    l2 = BHu2.A01;
                } else {
                    l2 = null;
                }
                A112.put("undo_cutover_timestamp", l2);
                JSONArray jSONArray2 = new JSONArray();
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C254703su A0a = C66580MXl.A0a(it2);
                        JSONObject A113 = DbS.A11();
                        A113.put("offline_threading_id", A0a.A0f());
                        A113.put("message_id", A0a.A0g());
                        A113.put("timestamp", A0a.C7c());
                        String str4 = A0a.A1u;
                        0qQ.A07(str4);
                        A113.put("sender_id", AnonymousClass7TE.A10(str4));
                        2FW r0 = A0a.A10;
                        if (r0 != null) {
                            str = r0.A00;
                        } else {
                            str = null;
                        }
                        A113.put("direct_message_content_type", str);
                        if (A0a.A2P) {
                            i = 1;
                        } else {
                            i = 0;
                            if (A0a.A1K == null) {
                                i = 2;
                            }
                        }
                        A113.put("send_mode", i);
                        N4L n4l = A0a.A0D;
                        if (n4l != null) {
                            if (n4l.A05) {
                                str2 = "xplat reverb";
                            } else {
                                str2 = "eb server directly";
                            }
                            A113.put("is_restored_by_reverb_api", str2);
                            if (n4l.A04) {
                                str3 = "restored payload";
                            } else {
                                str3 = "realtime payload";
                            }
                            A113.put("is_from_eb_server", str3);
                        }
                        jSONArray2.put(A113);
                    }
                }
                A112.put("messages_in_the_thread", jSONArray2);
                jSONArray.put(A112);
                A11.put("thread_records_in_inbox", jSONArray);
            }
            return A11.toString();
        } catch (JSONException e) {
            0KC.A0F("ArmadilloExpressUiCacheReportLogCollectorV2", "Unable to create log due to JSONException", e);
            return AnonymousClass7TG.A0m(e, "Unable to create log due to JSONException: ", AnonymousClass7TE.A1A());
        }
    }

    public final String getFilenamePrefix() {
        return "direct_instamadillo_ui_cache_report";
    }

    public final String getFilenameSuffix() {
        return ".txt";
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public final String getTag() {
        return "ArmadilloExpressUiCacheReportLogCollectorV2";
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
    }
}
