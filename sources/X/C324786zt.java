package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6zt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C324786zt implements C324796zu {
    public final /* synthetic */ UserDetailTabController A00;

    public /* synthetic */ C324786zt(UserDetailTabController userDetailTabController) {
        this.A00 = userDetailTabController;
    }

    public final View AN8(int i) {
        UserDetailTabController userDetailTabController = this.A00;
        C322826wT r3 = (C322826wT) 00k.A0O(userDetailTabController.A0S.A09, i);
        r3.getClass();
        C323756y3 r0 = userDetailTabController.mViewHolder;
        r0.getClass();
        View AN7 = r3.AN7(r0.A0C, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, userDetailTabController.A00);
        AnonymousClass0fU.A00(new AnonymousClass702(userDetailTabController, r3, i), AN7);
        return AN7;
    }
}
