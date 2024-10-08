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

public final class IXT implements JQK {
    public final Context A00;
    public final UserSession A01;
    public final HMH A02;
    public final SavedCollection A03;
    public final C55525Hj7 A04;
    public final String A05;
    public final boolean A06;

    public IXT(Context context, UserSession userSession, HMH hmh, SavedCollection savedCollection, C55525Hj7 hj7, String str, boolean z) {
        0qQ.A0B(userSession, 2);
        AnonymousClass7TG.A1S(hmh, str);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = savedCollection;
        this.A04 = hj7;
        this.A02 = hmh;
        this.A05 = str;
        this.A06 = z;
    }

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        C324826zy A002 = C324816zw.A00(viewGroup, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_photo_grid_pano_outline_24);
        if (drawable != null) {
            A002.setIcon(drawable);
        }
        A002.setTitle(AnonymousClass7TE.A16(context, 2131972598));
        View view = A002.getView();
        view.setContentDescription(context.getResources().getString(2131972599));
        return view;
    }

    public final C55525Hj7 C3i() {
        return this.A04;
    }

    public final C59622JQq AN6() {
        C55115HcO.A00();
        String str = this.A01.A05;
        HMH hmh = this.A02;
        SavedCollection savedCollection = this.A03;
        String str2 = this.A05;
        boolean z = this.A06;
        0qQ.A0B(str, 0);
        C52770GcN gcN = new C52770GcN();
        Bundle A0C = DbX.A0C(str);
        A0C.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", hmh);
        A0C.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
        A0C.putString("prior_module", str2);
        A0C.putBoolean("SaveFragment.ARGUMENT_IS_IN_TAB", true);
        A0C.putBoolean("SaveFragment.ARGUMENT_HAS_ADDITIONAL_PADDING", z);
        gcN.setArguments(A0C);
        return gcN;
    }
}
