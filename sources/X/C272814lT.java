package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4lT  reason: invalid class name and case insensitive filesystem */
public final class C272814lT implements AnonymousClass28l {
    public final UserSession A00;

    public final String getContentInBackground(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            UserSession userSession = this.A00;
            0qQ.A0B(userSession, 0);
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, userSession, 36319050909096833L)) {
                int[] A03 = 2MJ.A01.A03(0);
                0qQ.A07(A03);
                jSONObject.put("aggregated_screen_time", 03t.A09(",", A03));
            }
            if (182.A06(r4, userSession, 36319050909031296L)) {
                ImmutableList A002 = 2MJ.A01.A00(Long.MIN_VALUE);
                0qQ.A07(A002);
                JSONArray jSONArray = new JSONArray();
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C283695Iw) it.next()).A00());
                }
                jSONObject.put("screen_time_raw_intervals", jSONArray.toString());
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to build flytrap report:");
            sb.append(th);
            0wb.A03("Instagram.ScreenTime.FlyTrapReport", sb.toString());
        }
        return jSONObject.toString();
    }

    public final String getFilenamePrefix() {
        return "screen_time_extras";
    }

    public final String getFilenameSuffix() {
        return ".json";
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public final String getTag() {
        return "ScreenTimeFlyTrapExtrasProvider";
    }

    public C272814lT(UserSession userSession) {
        this.A00 = userSession;
    }
}
