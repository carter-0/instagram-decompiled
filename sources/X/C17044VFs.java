package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.VFs  reason: case insensitive filesystem */
public abstract class C17044VFs {
    public static void A00(UserSession userSession, C15353Ub4 ub4, C17801VgE vgE, Us7 us7, Us7 us72, Us7 us73, AnonymousClass3WR r28, String str) {
        Us7 us74 = us7;
        View view = us74.A00;
        view.setVisibility(0);
        String str2 = str;
        int A02 = DbW.A02(1, view.getContext(), str2);
        C17801VgE vgE2 = vgE;
        C15353Ub4 ub42 = ub4;
        VI8.A00(us74, new C17685VcG((Drawable) null, (Drawable) null, vgE2.A00.A04.Bh3(), new C15845UjV(4, ub42, vgE2), DbY.A0b(us74.A02.getContext(), vgE2.A00.A04, 2131971036), str2, 1.0f, false, true, false));
        Us7 us75 = us72;
        Context context = us75.A00.getContext();
        0qQ.A0B(context, 1);
        UserSession userSession2 = userSession;
        ImageUrl A0X = DbX.A0X(userSession2);
        VI8.A00(us75, new C17685VcG(context.getDrawable(R.drawable.empty_story_badge_elevated), (Drawable) null, A0X, new C61684KHs(A02, vgE2, us75, ub42, userSession2, r28), context.getString(2131971039), str2, 1.0f, false, true, false));
        Us7 us76 = us73;
        Context context2 = us76.A00.getContext();
        0qQ.A0B(context2, 1);
        VI8.A00(us76, new C17685VcG((Drawable) null, context2.getDrawable(R.drawable.instagram_delete_pano_outline_24), (ImageUrl) null, new C15845UjV(5, ub42, vgE2), context2.getString(2131971035), str2, 1.0f, true, true, false));
    }
}
