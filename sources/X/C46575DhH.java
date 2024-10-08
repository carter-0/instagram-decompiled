package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.DhH  reason: case insensitive filesystem */
public final class C46575DhH {
    public static final void A02(Activity activity, AnonymousClass0iw r19, UserSession userSession, C46578DhK dhK, C51981GAe gAe, String str, List list, boolean z) {
        long j;
        int i;
        for (int i2 = 0; i2 < 4; i2++) {
            if (i2 == 0) {
                GBV.A05 = GBV.A04;
            }
            C46578DhK dhK2 = dhK;
            LinkedList linkedList = dhK2.A02;
            C46577DhJ dhJ = (C46577DhJ) linkedList.removeFirst();
            linkedList.add(dhJ);
            0qQ.A0A(dhJ);
            List list2 = list;
            if (i2 < list2.size()) {
                AnonymousClass3UK r0 = (AnonymousClass3UK) list2.get(GBV.A04);
                boolean z2 = z;
                if (z) {
                    j = 35;
                } else {
                    j = 0;
                }
                int i3 = GBV.A04;
                User CCd = r0.CCd();
                if (CCd != null) {
                    dhJ.A00.postDelayed(new C46576DhI(activity, r19, userSession, CCd, dhJ, dhK2, gAe, str, list2, i3, z2), ((long) i2) * j);
                }
                if (GBV.A04 >= list2.size() - 1) {
                    i = 0;
                } else {
                    i = GBV.A04 + 1;
                }
                GBV.A04 = i;
            } else {
                dhJ.A00.setVisibility(4);
            }
        }
    }

    public final void A03(Activity activity, AnonymousClass0iw r21, UserSession userSession, C46578DhK dhK, C51981GAe gAe, String str, String str2, String str3, List list) {
        Activity activity2 = activity;
        AnonymousClass0iw r6 = r21;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A0w(2, userSession2, r6, activity2);
        if (GBV.A08) {
            GBV.A04 = GBV.A05;
        } else {
            GBV.A07 = 00k.A0U(list);
            HashMap hashMap = GBV.A0A;
            hashMap.clear();
            int i = 0;
            for (AnonymousClass3UK CCd : GBV.A07) {
                int i2 = i + 1;
                User CCd2 = CCd.CCd();
                if (CCd2 != null) {
                    hashMap.put(CCd2.getId(), Integer.valueOf(i));
                }
                i = i2;
            }
        }
        if (GBV.A06 == null) {
            GBV.A06 = new C230012om(r6, userSession2);
        }
        C46578DhK dhK2 = dhK;
        C51981GAe gAe2 = gAe;
        String str4 = str;
        A02(activity2, r6, userSession2, dhK2, gAe2, str4, GBV.A07, !GBV.A08);
        GBV.A08 = false;
        AnonymousClass0fU.A00(new FOS(activity2, r6, userSession2, dhK2, gAe2, str4, 7), dhK2.A01);
        AnonymousClass0fU.A00(new C64257LXj(gAe2, userSession2, r6, str2, str4, str3, 1), dhK2.A00);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r7v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public static final void A01(Activity activity, AnonymousClass0iw r33, UserSession userSession, User user, C46577DhJ dhJ, C46578DhK dhK, C51981GAe gAe, String str, List list, int i, boolean z) {
        ? obj = new Object();
        obj.A00 = i;
        List list2 = list;
        C51981GAe gAe2 = gAe;
        if (!list2.isEmpty()) {
            if (obj.A00 >= list2.size()) {
                obj.A00 = 0;
                GBV.A04 = 0;
            }
            AnonymousClass3UK r1 = (AnonymousClass3UK) list2.get(obj.A00);
            C46577DhJ dhJ2 = dhJ;
            boolean z2 = z;
            if (z) {
                dhJ2.A00.setVisibility(4);
            }
            User user2 = user;
            DbU.A1H(dhJ2.A03, user2);
            AnonymousClass0iw r8 = r33;
            DbU.A1S(r8, dhJ2.A05, user2);
            ? r7 = dhJ2.A04;
            r7.A00 = true;
            r7.setText(r1.BxN());
            ImageView imageView = dhJ2.A02;
            Context context = imageView.getContext();
            Activity activity2 = activity;
            if (r1.BxQ() != null) {
                0qQ.A0A(context);
                String moduleName = r8.getModuleName();
                List BxQ = r1.BxQ();
                0qQ.A0A(BxQ);
                Context context2 = context;
                imageView.setImageDrawable(C244283aw.A06(context2, Float.valueOf(0.6f), Integer.valueOf(DbS.A02(context, 1)), Integer.valueOf(2Yu.A0H(activity2, R.attr.igds_color_highlight_media_background)), moduleName, BxQ, DbS.A02(context, 18)));
                r7.setGravity(0);
                imageView.setVisibility(0);
            } else {
                r7.setGravity(1);
                imageView.setVisibility(8);
            }
            View view = dhJ2.A00;
            UserSession userSession2 = userSession;
            String str2 = str;
            AnonymousClass0fU.A00(new C56780ICd(activity2, r8, userSession2, r1, user2, list2, str2, 2), view);
            FollowButton followButton = dhJ2.A06;
            DbU.A11(followButton.getContext(), followButton, R.drawable.clips_viewer_suggested_users_follow_button_background);
            followButton.A07 = true;
            DbY.A1O(user2);
            if (182.A06(0Tu.A05, userSession2, 36330913608516432L)) {
                Boolean B6t = r1.B6t();
                if (B6t != null) {
                    user2.A13(B6t.booleanValue());
                }
                followButton.A0A = true;
            }
            C267064at r6 = followButton.A0J;
            r6.A07(new C46579DhL(r8, r1, dhJ2, str2));
            r6.A03(r8, userSession2, user2);
            C46577DhJ dhJ3 = dhJ2;
            User user3 = user2;
            AnonymousClass3UK r18 = r1;
            UserSession userSession3 = userSession2;
            AnonymousClass0iw r16 = r8;
            AnonymousClass0fU.A00(new C46580DhM(activity2, r16, userSession3, r18, user3, dhJ3, dhK, gAe2, str2, list2, obj, z2), dhJ2.A01);
            if (z) {
                view.setVisibility(0);
                view.setAlpha(0.25f);
                DbY.A0G(view).setDuration(300).start();
                C230012om r2 = GBV.A06;
                if (r2 != null) {
                    DbV.A1T(A00(r8, r1, user2, (Integer) DbV.A0r(user2, GBV.A0A), str2), r2);
                }
            }
        } else if (gAe != null) {
            gAe2.A00();
        }
    }

    public static final AnonymousClass6KM A00(AnonymousClass0iw r4, AnonymousClass3UK r5, User user, Integer num, String str) {
        AnonymousClass6KM r1 = new AnonymousClass6KM("suggested_users_reels_netego", user.getId(), r4.getModuleName());
        String CDC = r5.CDC();
        if (CDC != null) {
            r1.A07 = CDC;
        }
        r1.A00 = DbX.A02(num);
        String algorithm = r5.getAlgorithm();
        if (algorithm != null) {
            r1.A04 = algorithm;
        }
        r1.A0B = r5.BxN();
        r1.A08 = str;
        return r1;
    }
}
