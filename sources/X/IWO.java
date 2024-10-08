package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class IWO implements C322826wT {
    public final Context A00;
    public final UserSession A01;
    public final String A02;

    public final String BMO() {
        return null;
    }

    public final C294255m9 BhJ() {
        return null;
    }

    public final String C3j() {
        return C273654mx.A00(370);
    }

    public final String C3l() {
        return C273654mx.A00(987);
    }

    public final void DqE(boolean z) {
    }

    public final void DqF() {
    }

    public final void DqL(boolean z) {
    }

    public final AnonymousClass723 AMg(boolean z) {
        H1S h1s = new H1S();
        Bundle A0a = AnonymousClass7TE.A0a();
        DbU.A1D(A0a, this.A01);
        A0a.putString("profile_user_id", this.A02);
        h1s.setArguments(A0a);
        return h1s;
    }

    public final String AbV() {
        return "saved";
    }

    public IWO(Context context, UserSession userSession, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        AnonymousClass7TG.A1N(viewGroup, str);
        C324826zy A002 = C324816zw.A00(viewGroup, str, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_save_pano_outline_24);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        A002.setActiveIcon(context.getDrawable(R.drawable.instagram_save_pano_filled_24));
        A002.setTitle(AnonymousClass7TE.A16(context, 2131972609));
        View view = A002.getView();
        view.setContentDescription(AnonymousClass7TE.A16(context, 2131972609));
        return view;
    }
}
