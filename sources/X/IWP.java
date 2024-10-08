package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class IWP implements C322826wT {
    public final Context A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final String AbV() {
        return "products";
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
        String str = this.A04;
        String str2 = this.A02;
        String str3 = this.A05;
        boolean z2 = this.A06;
        String str4 = this.A03;
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, userSession);
        A0a.putString("source_media_id", str);
        A0a.putString("ad_retrieval_key", str2);
        A0a.putString("tracking_token", str3);
        A0a.putBoolean("should_show_floating_cta", z2);
        A0a.putString(AnonymousClass000.A00(1080), str4);
        H1L h1l = new H1L();
        h1l.setArguments(A0a);
        return h1l;
    }

    public final String C3j() {
        return "profile_products";
    }

    public final String C3l() {
        return "tap_ads_products_tab";
    }

    public IWP(Context context, UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A06 = z;
        this.A03 = str4;
    }

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        AnonymousClass7TG.A1N(viewGroup, str);
        C324826zy A002 = C324816zw.A00(viewGroup, str, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_shopping_bag_pano_outline_24);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        A002.setActiveIcon(context.getDrawable(R.drawable.instagram_shopping_bag_pano_filled_24));
        A002.setTitle(AnonymousClass7TE.A16(context, 2131970061));
        View view = A002.getView();
        view.setContentDescription(AnonymousClass7TE.A16(context, 2131970061));
        return view;
    }
}
