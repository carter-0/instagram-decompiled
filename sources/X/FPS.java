package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;

public final class FPS implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass354 A00;

    public FPS(AnonymousClass354 r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass354 r1 = this.A00;
        C227802jw A002 = AnonymousClass354.A00(r1);
        if (A002 == null || EndToEnd.A05()) {
            return false;
        }
        UserSession userSession = r1.A01;
        if (!182.A06(0Tu.A05, userSession, 36318101721061241L)) {
            return false;
        }
        Context context = A002.getContext();
        if (context != null) {
            FragmentActivity activity = A002.getActivity();
            if (activity != null) {
                FC7.A00(activity, context, userSession);
                return true;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
