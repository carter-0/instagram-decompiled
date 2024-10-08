package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JTy  reason: case insensitive filesystem */
public abstract class C59691JTy {
    public static final Drawable A00(Context context, UserSession userSession, ImageUrl imageUrl) {
        if (imageUrl == null) {
            return null;
        }
        int A03 = DbS.A03(context.getResources(), R.dimen.account_group_management_clickable_width);
        return C320996tP.A01(context, userSession, (C320986tO) null, JTP.A0o(imageUrl), (String) null, (String) null, (String) null, A03, A03, false, true, C63282KuR.A00(userSession), false, false);
    }
}
