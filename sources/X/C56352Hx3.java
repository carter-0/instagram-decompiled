package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Hx3  reason: case insensitive filesystem */
public abstract class C56352Hx3 {
    public static final C54166H1l A00(String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(MYP.A00(), str);
        A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A0a.putBoolean("saved_state", true);
        A0a.putBoolean("is_enabled", z);
        A0a.putBoolean("non_followers", z2);
        A0a.putBoolean("new_followers", z3);
        A0a.putBoolean("non_close_friends", z4);
        A0a.putLong("reminder_date", j);
        A0a.putLong("start_date", j2);
        A0a.putBoolean("some_interactions", z5);
        A0a.putBoolean("most_interactions", z6);
        A0a.putBoolean("feature_customization_enabled", z7);
        C54166H1l h1l = new C54166H1l();
        h1l.setArguments(A0a);
        return h1l;
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, fragmentActivity);
        String A0j = AnonymousClass7TG.A0j();
        1NY A0b = AnonymousClass7TG.A0b(userSession2);
        A0b.A0A("users/get_limited_interactions_settings/");
        1OC A0S = DbU.A0S(A0b, C54051Gya.class, C56212Huf.class);
        A0S.A00 = new H4P(fragmentActivity2, userSession2, str, A0j, A1Z ? 1 : 0);
        1ES.A03(A0S);
    }
}
