package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

public final class IXS implements JQK {
    public final Context A00;
    public final UserSession A01;
    public final SavedCollection A02;
    public final C55525Hj7 A03;
    public final String A04;

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        C324826zy A002 = C324816zw.A00(viewGroup, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_reels_pano_outline_24);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        A002.setTitle(AnonymousClass7TE.A16(context, 2131972596));
        View view = A002.getView();
        view.setContentDescription(context.getResources().getString(2131972597));
        return view;
    }

    public final C55525Hj7 C3i() {
        return this.A03;
    }

    public IXS(Context context, UserSession userSession, SavedCollection savedCollection, C55525Hj7 hj7, String str) {
        AnonymousClass7TG.A1Q(userSession, savedCollection);
        0qQ.A0B(str, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = savedCollection;
        this.A03 = hj7;
        this.A04 = str;
    }

    public final C59622JQq AN6() {
        C55115HcO.A00();
        String str = this.A01.A05;
        SavedCollection savedCollection = this.A02;
        String str2 = this.A04;
        0qQ.A0B(str, 0);
        HMH hmh = HMH.COLLECTION_FEED;
        H1N h1n = new H1N();
        Bundle A0C = DbX.A0C(str);
        A0C.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
        A0C.putString("prior_module", str2);
        A0C.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", hmh);
        h1n.setArguments(A0C);
        return h1n;
    }
}
