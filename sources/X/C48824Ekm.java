package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.Ekm  reason: case insensitive filesystem */
public abstract class C48824Ekm {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, C390899s1 r5, String str, String str2, String str3, String str4, boolean z) {
        Bundle A09 = DbY.A09(userSession);
        A09.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A09.putString("thread_v2_id", str2);
        A09.putString("creator_id", str4);
        A09.putString("entrypoint", str3);
        A09.putSerializable("nux_type", r5);
        A09.putBoolean("is_followed_by_user", z);
        Dba.A0w(A09, new C47464E3m(), DbS.A0M(fragmentActivity, userSession));
    }
}
