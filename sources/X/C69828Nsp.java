package X;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Nsp  reason: case insensitive filesystem */
public abstract class C69828Nsp {
    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        if (bundle.getBoolean("open_in_direct")) {
            Intent putExtra = C66580MXl.A0A(fragmentActivity, ModalActivity.class).putExtra("fragment_name", "CLIPS_MEDIA_NOTES").putExtra(AnonymousClass000.A00(610), bundle);
            putExtra.setFlags(268435456);
            TaskStackBuilder.create(fragmentActivity).addNextIntentWithParentStack(F5W.A00(fragmentActivity, "all", "direct-inbox", (String) null, 268435456)).addNextIntent(putExtra).startActivities();
            return;
        }
        DbU.A0w(fragmentActivity, bundle, userSession, ModalActivity.class, "CLIPS_MEDIA_NOTES");
    }
}
