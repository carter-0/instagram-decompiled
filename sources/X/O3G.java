package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public abstract class O3G {
    public static final C69230Nhk A00(UserSession userSession, String str, String str2, String str3, int i, boolean z) {
        AnonymousClass7TG.A1Q(str2, str3);
        C69230Nhk nhk = new C69230Nhk();
        Bundle A09 = DbY.A09(userSession);
        A09.putString("SelfRemediationBottomSheetFragment.COMMENTER_USER_ID", str);
        A09.putString("SelfRemediationBottomSheetFragment.ARG_COMMENT_ID", str2);
        A09.putString("SelfRemediationBottomSheetFragment.COMMENT_MEDIA_ID", str3);
        A09.putInt("SelfRemediationBottomSheetFragment.AGR_COMMENT_HOST_SURFACE_TYPE", i);
        A09.putBoolean("SelfRemediationBottomSheetFragment.ARG_SHOW_RESTRICT_ACTIONS", z);
        A09.putBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED", true);
        A09.putBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD", false);
        A09.putFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO", 0.7f);
        A09.putBoolean("SelfRemediationBottomSheetFragment.ARG_KEEP_OPEN_AFTER_ACTION", false);
        nhk.setArguments(A09);
        return nhk;
    }
}
