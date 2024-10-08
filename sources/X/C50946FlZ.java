package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FlZ  reason: case insensitive filesystem */
public final class C50946FlZ implements G6O {
    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass9BP r0;
        AnonymousClass7TG.A1O(userSession, fragmentActivity);
        AccountFamily A09 = Dba.A09(AnonymousClass9BG.A01(userSession), userSession);
        if (A09 == null) {
            0wb.A03(AnonymousClass000.A00(417), AnonymousClass000.A00(2513));
            r0 = AnonymousClass9BP.UNKNOWN;
        } else {
            r0 = A09.A00;
            r0.getClass();
        }
        C49138Eq1.A00(fragmentActivity, r0, DbS.A0O(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE), userSession);
    }
}
