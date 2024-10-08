package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Adapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.O0o  reason: case insensitive filesystem */
public abstract class C70284O0o {
    public static final void A00(Context context, Fragment fragment, UserSession userSession, C229992ok r17, OEG oeg, C231722sA r19, C266934aa r20, AnonymousClass3UH r21, Integer num) {
        int i;
        Context context2 = context;
        Fragment fragment2 = fragment;
        AnonymousClass7TF.A1H(context, fragment);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        C229992ok r1 = r17;
        OEG oeg2 = oeg;
        C266934aa r3 = r20;
        AnonymousClass3UH r6 = r21;
        C51974G9v.A0d(3, oeg2, r1, r6, r3);
        0qQ.A0B(r19, 7);
        Integer num2 = num;
        0qQ.A0B(num2, 8);
        if (r6.A0K.length() <= 0 || C266964ad.A00(r6) != SuggestedUsersStyle.EMBEDDED_WITH_CONTENT_THUMBNAIL) {
            oeg2.A01.setVisibility(8);
            oeg2.A00.setVisibility(8);
        } else {
            TextView textView = oeg2.A01;
            textView.setText(r6.A0K);
            textView.setVisibility(0);
            if (r6.B5J() == 1UQ.A0v) {
                oeg2.A00.setVisibility(0);
            }
        }
        ReboundViewPager reboundViewPager = oeg2.A02;
        C67687MsP msP = (C67687MsP) reboundViewPager.getAdapter();
        if (msP == null) {
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.card_width_redesign);
            SuggestedUsersStyle A00 = C266964ad.A00(r6);
            SuggestedUsersStyle suggestedUsersStyle = SuggestedUsersStyle.EMBEDDED_WITH_CONTENT_THUMBNAIL;
            Resources resources = context2.getResources();
            int i2 = R.dimen.card_height_redesign;
            if (A00 == suggestedUsersStyle) {
                i2 = R.dimen.card_height_redesign_embedded;
            }
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
            int A02 = AnonymousClass7TG.A02(context2);
            C67687MsP msP2 = new C67687MsP(context2, userSession2, r1, new PWZ(oeg2), dimensionPixelSize, dimensionPixelSize2);
            msP2.A01 = r6;
            0fE.A00(msP2, 361751265);
            reboundViewPager.setAdapter((Adapter) msP2);
            reboundViewPager.A0C = dimensionPixelSize;
            reboundViewPager.setPageSpacing((float) A02);
            String str = null;
            reboundViewPager.A0M(2, false);
            reboundViewPager.A0J = new AnonymousClass4HC(dimensionPixelSize, A02, 0.86f);
            reboundViewPager.setAccessibilityDelegateCompat(new C342287oL(reboundViewPager));
            OFS ofs = r3.A05;
            if (ofs != null) {
                ofs.A01.A02(ofs.A00, C57071INl.class);
                ofs.A02.onDestroy();
            }
            if (r6.A04() != null) {
                str = "preview";
            } else if (r6.A0M != null) {
                str = "profile";
            }
            AnonymousClass0iw AbT = r1.AbT();
            int i3 = r6.A01;
            Fragment fragment3 = fragment2;
            UserSession userSession3 = userSession2;
            ReboundViewPager reboundViewPager2 = reboundViewPager;
            OFS ofs2 = new OFS(fragment3, userSession3, reboundViewPager2, new NMW(AbT, userSession2, num2, r6.A0C, str, r6.A0I, i3), msP2);
            msP2.A00 = ofs2;
            reboundViewPager.A0P(new C15854Uje(1, r3, ofs2));
            r3.A05 = ofs2;
            reboundViewPager.A0K(r3.A04);
            return;
        }
        if (r3.A08 || msP.A01 != r6) {
            r3.A08 = false;
            msP.A01 = r6;
            i = 361751265;
        } else {
            i = 273832890;
        }
        0fE.A00(msP, i);
    }
}
