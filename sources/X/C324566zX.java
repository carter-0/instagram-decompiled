package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.6zX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C324566zX implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C323366xN A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C324566zX(Context context, C323366xN r2, User user, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A00 = context;
        this.A02 = user;
    }

    public final void onClick(View view) {
        C323366xN r1 = this.A01;
        boolean z = this.A03;
        Context context = this.A00;
        User user = this.A02;
        if (z) {
            FFO.A02(context, r1.A0E, "other_profile_notification");
            return;
        }
        FragmentActivity activity = r1.A0D.getActivity();
        if (activity != null) {
            C46447Df9.A03().A01(activity, r1.A0E, (C273414mX) null, user, (String) null);
            r1.A0I.A10("user_profile_header", "notifications_entry_point_tapped");
        }
    }
}
