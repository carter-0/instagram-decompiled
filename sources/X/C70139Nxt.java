package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.List;

/* renamed from: X.Nxt  reason: case insensitive filesystem */
public abstract class C70139Nxt {
    public static final NKM A00(UserSession userSession, String str, String str2, List list, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        AnonymousClass7TF.A1G(userSession, 0, list);
        NKM nkm = new NKM();
        Bundle A0A = DbV.A0A(userSession);
        A0A.putInt("fragment_max_height", i);
        A0A.putInt("fragment_theme_override", i2);
        A0A.putInt("fragment_thread_subtype", i3);
        A0A.putBoolean("should_disable_reaction_edit_ability", z);
        A0A.putBoolean("can_user_change_hidden_emoji", z2);
        A0A.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A0A.putString("thread_v2_id", str2);
        A0A.putInt("audience_type", i4);
        A0A.putStringArrayList("blocked_emojis_from_server", AnonymousClass7TE.A1D(list));
        nkm.setArguments(A0A);
        return nkm;
    }
}
