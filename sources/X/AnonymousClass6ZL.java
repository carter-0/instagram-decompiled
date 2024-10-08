package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.user.model.User;

/* renamed from: X.6ZL  reason: invalid class name */
public final class AnonymousClass6ZL implements AnonymousClass6ZM {
    public final /* synthetic */ AnonymousClass6Z5 A00;

    public final void CuM(User user) {
        Context context;
        0qQ.A0B(user, 0);
        AnonymousClass6Z5 r5 = this.A00;
        Fragment fragment = (Fragment) r5.A1A.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            C2355930l r3 = r5.A07;
            if (r3 == null) {
                0qQ.A0F("closeFriendsController");
                throw AnonymousClass00P.createAndThrow();
            }
            r3.A03(r5.A15, new C228602lw(context, AnonymousClass07i.A00(fragment), (Integer) null), user, AnonymousClass05K.A00);
        }
    }

    public AnonymousClass6ZL(AnonymousClass6Z5 r1) {
        this.A00 = r1;
    }
}
