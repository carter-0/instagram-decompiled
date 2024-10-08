package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Eok  reason: case insensitive filesystem */
public abstract class C49066Eok {
    public static final void A00(Activity activity, Context context, UserSession userSession, IgTextView igTextView, C234502xy r8, User user, List list, int i) {
        String A0e = AnonymousClass7TF.A0e(context.getResources(), Integer.valueOf(i), 2131953610);
        0qQ.A07(A0e);
        igTextView.setText(A0e);
        igTextView.setVisibility(0);
        AnonymousClass0fU.A00(new C50106FOw(6, activity, userSession, r8, user, list), igTextView);
    }
}
