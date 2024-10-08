package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class LvS implements C322826wT {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final User A04;

    public final String AbV() {
        return "ar_effects";
    }

    public final String BMO() {
        return "internal_tab";
    }

    public final C294255m9 BhJ() {
        return null;
    }

    public final String C3j() {
        return C273654mx.A00(90);
    }

    public final String C3l() {
        return "tap_ar_effects_tab";
    }

    public final void DqE(boolean z) {
    }

    public final void DqF() {
    }

    public final void DqL(boolean z) {
    }

    public final AnonymousClass723 AMg(boolean z) {
        K71 k71 = new K71();
        Bundle A0a = AnonymousClass7TE.A0a();
        DbU.A1D(A0a, this.A03);
        A0a.putString("profile_effect_previews_target_effect_id_count_key", this.A04.getId());
        k71.setArguments(A0a);
        return k71;
    }

    public LvS(Context context, UserSession userSession, User user) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = user;
        this.A00 = C306096Kt.A00(userSession).booleanValue() ? R.drawable.instagram_effects_pano_outline_24 : R.drawable.instagram_sparkles_pano_outline_24;
        this.A01 = C306096Kt.A00(userSession).booleanValue() ? R.drawable.instagram_effects_pano_filled_24 : R.drawable.instagram_sparkles_pano_outline_24;
    }

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        AnonymousClass7TG.A1N(viewGroup, str);
        C324826zy A002 = C324816zw.A00(viewGroup, str, i);
        Context context = this.A02;
        Drawable drawable = context.getDrawable(this.A00);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        A002.setActiveIcon(context.getDrawable(this.A01));
        String A16 = AnonymousClass7TE.A16(context, 2131953138);
        A002.setTitle(A16);
        View view = A002.getView();
        view.setContentDescription(A16);
        return view;
    }
}
