package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.user.model.User;

public final class LvR implements C322826wT {
    public final Context A00;
    public final UserSession A01;
    public final AutoLaunchReelParams A02;
    public final User A03;

    public final String AbV() {
        return "highlights";
    }

    public final String BMO() {
        return null;
    }

    public final C294255m9 BhJ() {
        return null;
    }

    public final void DqE(boolean z) {
    }

    public final void DqF() {
    }

    public final void DqL(boolean z) {
    }

    public final AnonymousClass723 AMg(boolean z) {
        UserSession userSession = this.A01;
        User user = this.A03;
        AutoLaunchReelParams autoLaunchReelParams = this.A02;
        Bundle A0F = JTP.A0F(userSession);
        A0F.putString(AnonymousClass000.A00(4207), user.getId());
        A0F.putBoolean(AnonymousClass000.A00(3219), user.A1q());
        A0F.putParcelable(AnonymousClass000.A00(2077), autoLaunchReelParams);
        C15343Uat uat = new C15343Uat();
        uat.setArguments(A0F);
        return uat;
    }

    public final String C3j() {
        return C273654mx.A00(367);
    }

    public final String C3l() {
        return "tap_highlights_tab";
    }

    public LvR(Context context, UserSession userSession, AutoLaunchReelParams autoLaunchReelParams, User user) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = user;
        this.A02 = autoLaunchReelParams;
    }

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        AnonymousClass7TG.A1N(viewGroup, str);
        C324826zy A002 = C324816zw.A00(viewGroup, str, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_story_highlight_pano_outline_24);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        A002.setActiveIcon(context.getDrawable(R.drawable.instagram_story_highlight_pano_filled_24));
        A002.setTitle(AnonymousClass7TE.A16(context, 2131969989));
        View view = A002.getView();
        view.setContentDescription(AnonymousClass7TE.A16(context, 2131969989));
        return view;
    }
}
