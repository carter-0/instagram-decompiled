package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.F1y  reason: case insensitive filesystem */
public final class C49688F1y {
    public final /* synthetic */ AnonymousClass351 A00;
    public final /* synthetic */ List A01;

    public C49688F1y(AnonymousClass351 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void A00(Bitmap bitmap) {
        AnonymousClass3QO r1;
        boolean z;
        ImageUrl imageUrl;
        AnonymousClass351 r9 = this.A00;
        List list = this.A01;
        AnonymousClass351.A02(r9, list);
        Activity activity = r9.A01;
        UserSession userSession = r9.A03;
        String str = r9.A07;
        0eE r6 = AnonymousClass0t1.A01;
        if (DbS.A0h(userSession, r6).BkX() == ReelAutoArchiveSettingStr.A07 && !activity.isFinishing() && !activity.isDestroyed() && !182.A06(0Tu.A05, userSession, 36319098153474968L)) {
            C49613EzW ezW = new C49613EzW(activity, bitmap, userSession, str);
            AnonymousClass0fN.A00(ezW.A01);
            1ES.A03(AnonymousClass738.A02((1P0) null, ezW.A03, true, false));
        }
        ArrayList A03 = r9.A05.A0C.A03(list);
        C255773uh r0 = null;
        if (!A03.isEmpty()) {
            List A0O = ((Reel) A03.get(0)).A0O(userSession);
            if (!A0O.isEmpty()) {
                r0 = (C255773uh) A0O.get(A0O.size() - 1);
            }
        }
        C49629Ezm ezm = new C49629Ezm(userSession, activity, str);
        if (r0 != null) {
            r1 = r0.A0B();
        } else {
            r1 = null;
        }
        boolean A1W = AnonymousClass7TF.A1W(r1, AnonymousClass3QO.FAN_CLUB);
        boolean z2 = ezm.A03.A01.getBoolean("has_seen_auto_save_to_exclusive_highlight_dialog", false);
        UserSession userSession2 = ezm.A01;
        FanClubInfoDict B3v = DbS.A0h(userSession2, r6).B3v();
        if (B3v != null) {
            z = AnonymousClass7TF.A1Y(B3v.Ae7(), true);
        } else {
            z = false;
        }
        if (A1W && z && !z2) {
            C273004lm r02 = ezm.A02;
            String str2 = userSession2.A06;
            0Aj A0e = AnonymousClass7TE.A0e(r02.A00, "ig_fan_club_creator_auto_add_highlights_alert_seen");
            DbS.A1O(A0e, "profile");
            DbY.A1G(A0e, str2);
            A0e.Cgf();
            Activity activity2 = ezm.A00;
            C358248ab A0X = DbS.A0X(activity2);
            int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            if (bitmap == null) {
                imageUrl = AnonymousClass7TF.A0Q(userSession2).Bh3();
            } else {
                imageUrl = null;
            }
            C244303ay r4 = new C244303ay(imageUrl, ezm.A04, dimensionPixelSize, 0, 0, 0);
            if (bitmap != null) {
                r4.A01(bitmap);
            }
            A0X.A0j(r4);
            A0X.A09(2131962002);
            A0X.A08(2131962000);
            A0X.A0r(false);
            A0X.A0s(false);
            C50020FJf.A01(A0X, ezm, 32, 2131960992);
            A0X.A0H(C50020FJf.A00(ezm, 33), 2131962001);
            DbT.A1V(A0X);
        }
    }
}
