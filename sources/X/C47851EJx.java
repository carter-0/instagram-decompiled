package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EJx  reason: case insensitive filesystem */
public final class C47851EJx extends C49890FBq {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final User A04;
    public final Context A05;

    public C47851EJx(Activity activity, Context context, Fragment fragment, UserSession userSession, AnonymousClass4DU r11, 2FW r12, User user) {
        super(r12, user, "direct_message", R.drawable.instagram_app_messenger_pano_outline_24, 2131960316);
        this.A04 = user;
        this.A02 = userSession;
        this.A05 = context;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = r11;
    }
}
