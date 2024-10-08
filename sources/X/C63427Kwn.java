package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kwn  reason: case insensitive filesystem */
public abstract class C63427Kwn {
    public static final boolean A00(Activity activity, Context context, Fragment fragment, AnonymousClass818 r17, UserSession userSession, C66461MSp mSp) {
        C66461MSp mSp2 = mSp;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        if (mSp == null) {
            mSp2 = C65649LxQ.A00;
        }
        LRS lrs = C62052KYa.A03;
        AnonymousClass819 r3 = LRS.A00(userSession2).A00;
        AnonymousClass818 r9 = r17;
        if (!C64839Lj1.A0F.A00(r9, userSession2) || context == null || !0oI.A0B(context)) {
            return false;
        }
        if ((r9 == AnonymousClass818.IG_STORY_AFTER_SHARE_SHEET && !DbY.A1Z(0Tu.A05, userSession2, 36314103107291542L)) || !C367998ru.A03(r9, r3, userSession2)) {
            return false;
        }
        Activity activity2 = activity;
        Fragment fragment2 = fragment;
        if (182.A06(0Tu.A05, userSession2, 36321791097972500L)) {
            C363388je.A00(userSession2).A01(C62052KYa.A02, new C65241Lpl(2, new L9I(activity2, fragment, r17, userSession, mSp2), userSession2), "after_new_fbc");
        } else {
            lrs.A02(activity2, fragment2, r9, (AnonymousClass819) null, userSession2, (LA0) null, mSp2, (C66462MSq) null, (LBI) null, "", "", true);
        }
        return true;
    }
}
