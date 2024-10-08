package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.save.api.SaveApiUtil;

/* renamed from: X.8Ns  reason: invalid class name and case insensitive filesystem */
public final class C354878Ns extends 2YL {
    public final void A00(Activity activity, Context context, 293 r18, UserSession userSession, IgSimpleImageView igSimpleImageView, 1Xj r21, AnonymousClass4DU r22, IgdsMediaButton igdsMediaButton, C243373Ym r24) {
        String str;
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 7);
        293 r4 = r18;
        0qQ.A0B(r4, 8);
        1Xj r11 = r21;
        if (r21 != null) {
            C243373Ym r13 = r24;
            r11.EjB(r13);
            Activity activity2 = activity;
            Context context2 = context;
            SaveApiUtil.A05(activity2, context2, userSession2, r11, r22, r13, 0);
            27r A01 = 27p.A01(userSession2);
            String A2n = r11.A2n();
            if (A2n != null) {
                C243373Ym r6 = C243373Ym.SAVED;
                if (r13 == r6) {
                    str = "TEMPLATE_LANDING_PAGE_SAVE_TAP";
                } else {
                    str = "TEMPLATE_LANDING_PAGE_UNSAVE_TAP";
                }
                A01.A1W(r4, A2n, str);
                boolean z = false;
                IgSimpleImageView igSimpleImageView2 = igSimpleImageView;
                if (igSimpleImageView != null) {
                    int i = R.drawable.instagram_save_pano_outline_24;
                    if (r13 == r6) {
                        i = R.drawable.instagram_save_pano_filled_24;
                    }
                    igSimpleImageView2.setImageDrawable(context2.getDrawable(i));
                } else {
                    IgdsMediaButton igdsMediaButton2 = igdsMediaButton;
                    if (igdsMediaButton != null) {
                        if (r13 == r6) {
                            z = true;
                        }
                        Resources resources = context2.getResources();
                        int i2 = 2131955498;
                        if (z) {
                            i2 = 2131972593;
                        }
                        igdsMediaButton2.setLabel(resources.getString(i2));
                    }
                }
                if (r13 == r6) {
                    str2 = "Added to saved";
                } else {
                    str2 = "Removed from saved";
                }
                C59689JTv.A00(context2, str2, (String) null, 0);
                Intent intent = new Intent();
                intent.putExtra(AnonymousClass000.A00(2145), true);
                activity2.setResult(-1, intent);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
