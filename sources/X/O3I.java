package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

public abstract class O3I {
    public static NKU A00(UserSession userSession, C331157Pu r6, User user, C16666Uz2 uz2, C14068TpH tpH, C16677UzD uzD, C74488Pvi pvi, NHU nhu, String str, String str2, String str3, String str4, HashMap hashMap, float f, boolean z, boolean z2, boolean z3) {
        String str5 = str4;
        C66581MXm.A1R(userSession, str, str5);
        C66581MXm.A1R(uz2, tpH, uzD);
        HashMap hashMap2 = hashMap;
        C66581MXm.A1R(pvi, r6, hashMap2);
        Fragment r1 = new AnonymousClass32G();
        r1.A01 = 0;
        r1.A0K = false;
        r1.A05 = r6;
        r1.A0D = pvi;
        r1.A07 = user;
        r1.A0E = nhu;
        Bundle A0a = AnonymousClass7TE.A0a();
        String str6 = userSession.A05;
        str6.getClass();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str6);
        A0a.putString("StartFRXReportV2BottomSheetFragment.analytics_module", str5);
        A0a.putString("StartFRXReportV2BottomSheetFragment.content_id", str);
        A0a.putSerializable("StartFRXReportV2BottomSheetFragment.entry_point", uz2);
        A0a.putSerializable("StartFRXReportV2BottomSheetFragment.location", tpH);
        A0a.putSerializable("StartFRXReportV2BottomSheetFragment.object_type", uzD);
        A0a.putString("StartFRXReportV2BottomSheetFragment.object", str3);
        A0a.putBoolean("StartFRXReportV2BottomSheetFragment.is_interop_thread", z3);
        A0a.putBoolean("StartFRXReportV2BottomSheetFragment.is_encrypted_thread", z);
        A0a.putString("StartFRXReportV2BottomSheetFragment.direct_thread_id", str2);
        A0a.putBoolean("StartFRXReportV2BottomSheetFragment.is_fullscreen_enabled", z2);
        A0a.putFloat("StartFRXReportV2BottomSheetFragment.initial_opening_height_ratio", f);
        A0a.putSerializable("StartFRXReportBottomSheetFragment.ARG_EXTRAS", hashMap2);
        A0a.putInt("StartFRXReportBottomSheetFragment.ARG_THEME_OVERRIDE", 0);
        r1.setArguments(A0a);
        return r1;
    }
}
