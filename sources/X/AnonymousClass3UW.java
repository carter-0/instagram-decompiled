package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3UW  reason: invalid class name */
public abstract class AnonymousClass3UW {
    public static final View A00(Context context, ViewGroup viewGroup, FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(fragmentActivity, 4);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_collection_top_main_bottom_three_media_group, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.main_media);
        0qQ.A07(requireViewById);
        inflate.setTag(new AnonymousClass3V2(inflate, r6, userSession, new AnonymousClass3Ux(fragmentActivity, context, (ViewGroup) requireViewById, userSession)));
        return inflate;
    }
}
