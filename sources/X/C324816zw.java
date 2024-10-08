package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;

/* renamed from: X.6zw  reason: invalid class name and case insensitive filesystem */
public abstract class C324816zw {
    public static final C324826zy A00(ViewGroup viewGroup, String str, int i) {
        int i2;
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            i2 = R.layout.profile_icon_tab_view_layout;
        } else if (str.equals("text")) {
            i2 = R.layout.profile_text_tab_view_layout;
        } else {
            throw new IllegalArgumentException(002.A0R("Could not create tab view for tab view type ", str));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.profile.intf.tabs.ProfileTabView");
        C324826zy r1 = (C324826zy) inflate;
        r1.setActiveColor(i);
        return r1;
    }
}
