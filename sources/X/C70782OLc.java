package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.OLc  reason: case insensitive filesystem */
public final class C70782OLc {
    public CircularImageView A00;
    public final Activity A01;
    public final Context A02;
    public final C267624bv A03;
    public final UserSession A04;
    public final String A05;

    public C70782OLc(Activity activity, Context context, C267624bv r4, UserSession userSession, String str) {
        DbW.A1N(userSession, 2, r4);
        this.A02 = context;
        this.A04 = userSession;
        this.A01 = activity;
        this.A05 = str;
        this.A03 = r4;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void A00(String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        ? r1 = this.A00;
        if (r1 != 0) {
            Context context = this.A02;
            r1.setImageDrawable(new C59921Jbk(context, new ColorDrawable(AnonymousClass7TF.A03(context, R.attr.igds_color_elevated_highlight_background)), (Drawable) null, str2, R.dimen.action_bar_item_spacing_left, 0, 0, 0, 1896, false));
        }
        ? r2 = this.A00;
        if (r2 != 0) {
            DbU.A12(this.A02, r2, 2131961430);
        }
    }
}
