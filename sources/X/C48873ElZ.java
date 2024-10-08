package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.ElZ  reason: case insensitive filesystem */
public abstract class C48873ElZ {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View inflate = DbT.A0B(context).inflate(R.layout.direct_user_mention_row_view, viewGroup, false);
        inflate.setTag(new C49541Exc(AnonymousClass7TG.A0R(inflate, R.id.row_user_primary_name), AnonymousClass7TG.A0R(inflate, R.id.row_user_secondary_name), DbX.A0j(inflate, R.id.row_user_avatar)));
        return inflate;
    }
}
