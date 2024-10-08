package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6s8  reason: invalid class name and case insensitive filesystem */
public final class C320286s8 implements C322826wT {
    public boolean A00 = true;
    public C324826zy A01;
    public final Context A02;
    public final UserSession A03;
    public final User A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C320286s8(Context context, UserSession userSession, User user, String str, String str2, String str3, String str4) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = user;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = str4;
    }

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(str, 1);
        C324826zy A002 = C324816zw.A00(viewGroup, str, i);
        Context context = this.A02;
        Drawable drawable = context.getDrawable(R.drawable.instagram_reels_pano_outline_24);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        A002.setActiveIcon(context.getDrawable(R.drawable.instagram_reels_pano_filled_24));
        String string = context.getString(2131955627);
        0qQ.A07(string);
        A002.setTitle(string);
        View view = A002.getView();
        String string2 = context.getString(2131955627);
        0qQ.A07(string2);
        view.setContentDescription(string2);
        this.A01 = A002;
        return view;
    }

    public final String AbV() {
        return "clips";
    }

    public final String BMO() {
        return null;
    }

    public final C294255m9 BhJ() {
        return null;
    }

    public final String C3j() {
        return "profile_clips";
    }

    public final String C3l() {
        return "tap_clips_tab";
    }

    public final AnonymousClass723 AMg(boolean z) {
        UserSession userSession = this.A03;
        User user = this.A04;
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A08;
        String str4 = this.A05;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("ClipsProfileTabFragment.ARGS_PROFILE_USER_ID", user.getId());
        bundle.putString("source_media_id", str);
        bundle.putString("source_ranking_info_token", str2);
        bundle.putBoolean("is_profile_side_panel", z);
        bundle.putString("profile_starting_tab", str3);
        bundle.putBoolean("is_group_profile", false);
        bundle.putString("from_module", str4);
        C320296s9 r0 = new C320296s9();
        r0.setArguments(bundle);
        return r0;
    }

    public final void DqE(boolean z) {
        C324826zy r2;
        if (z) {
            UserSession userSession = this.A03;
            if (182.A06(0Tu.A05, userSession, 36331008097796977L) && (r2 = this.A01) != null) {
                Context context = this.A02;
                r2.setEndIcon(context.getDrawable(R.drawable.instagram_chevron_up_pano_filled_12));
                String string = context.getString(2131955622);
                0qQ.A07(string);
                C367618rI r6 = new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new C65349Lrp(this), (Integer) null, string, 0, 0, 0, false, false, this.A00, true, false, false, false);
                String string2 = context.getString(2131955623);
                0qQ.A07(string2);
                C367618rI r20 = new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new C65350Lrq(this), (Integer) null, string2, 0, 0, 0, false, false, !this.A00, true, false, false, false);
                C355148Ov r1 = new C355148Ov(context, userSession, (Integer) null, false);
                r1.A02(0sr.A1P(new C367618rI[]{r6, r20}));
                r1.setOnDismissListener(new LZM(r2, this));
                r1.A01(r2.getView());
            }
        }
    }

    public final void DqF() {
        C324826zy r1 = this.A01;
        if (r1 != null) {
            r1.setEndIcon((Drawable) null);
        }
    }

    public final void DqL(boolean z) {
        C324826zy r2;
        if (182.A06(0Tu.A05, this.A03, 36331008097796977L) && (r2 = this.A01) != null) {
            r2.setEndIcon(this.A02.getDrawable(R.drawable.instagram_chevron_down_pano_filled_12));
        }
    }
}
