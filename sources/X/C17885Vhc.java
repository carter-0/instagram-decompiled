package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Vhc  reason: case insensitive filesystem */
public final class C17885Vhc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Activity A04;

    public final void A00(Reel reel, X1W x1w, User user, String str) {
        Activity activity;
        int i;
        String str2 = str;
        boolean A1Z = DbW.A1Z(str2);
        if (user.A1w()) {
            boolean A0d = reel.A0d();
            activity = this.A04;
            i = 2131975887;
            if (A0d) {
                i = 2131975883;
            }
        } else {
            activity = this.A04;
            i = 2131963391;
        }
        String A0b = DbY.A0b(activity, user, i);
        C358248ab r2 = new C358248ab(activity);
        r2.A0i(new C244303ay(user.Bh3(), str2, this.A01, this.A03, this.A02, this.A00));
        r2.A05 = user.getUsername();
        r2.A0r(A1Z);
        r2.A0s(A1Z);
        r2.A0I(new C18833W4v(17, x1w, user), 2131976660);
        r2.A0a(new C18833W4v(18, x1w, user), A0b);
        r2.A0C(new C18833W4v(19, x1w, user));
        r2.A0B(new C64209LTz(4, user, x1w));
        DbT.A1V(r2);
    }

    public C17885Vhc(Activity activity) {
        this.A04 = activity;
        Resources resources = activity.getResources();
        this.A02 = AnonymousClass7TF.A03(activity, R.attr.avatarInnerStroke);
        this.A00 = activity.getColor(2Yu.A04(activity));
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
    }
}
