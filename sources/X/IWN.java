package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class IWN implements C322826wT {
    public final Context A00;
    public final UserSession A01;
    public final String A02;

    public final String AbV() {
        return "potato";
    }

    public final String BMO() {
        return null;
    }

    public final C294255m9 BhJ() {
        return null;
    }

    public final String C3j() {
        return C273654mx.A00(369);
    }

    public final String C3l() {
        return "tap_potato_tab";
    }

    public final void DqE(boolean z) {
    }

    public final void DqF() {
    }

    public final void DqL(boolean z) {
    }

    public final AnonymousClass723 AMg(boolean z) {
        UserSession userSession = this.A01;
        String str = this.A02;
        H1R h1r = new H1R();
        h1r.setArguments(AnonymousClass7TG.A0P(AnonymousClass000.A00(1101), str, AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05)));
        return h1r;
    }

    public IWN(Context context, UserSession userSession, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        AnonymousClass7TG.A1N(viewGroup, str);
        C324826zy A002 = C324816zw.A00(viewGroup, str, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_templates_pano_outline_24);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        A002.setActiveIcon(context.getDrawable(R.drawable.instagram_templates_pano_filled_24));
        A002.setTitle(AnonymousClass7TE.A16(context, 2131969707));
        View view = A002.getView();
        view.setContentDescription(AnonymousClass7TE.A16(context, 2131969707));
        return view;
    }
}
