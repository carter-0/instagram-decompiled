package X;

import android.content.Context;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;

public final class EFU extends C228042kh {
    public final Context A00;
    public final UpdateProfilePicturePagerAdapter$UpdateProfileTabType A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public EFU(Context context, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = updateProfilePicturePagerAdapter$UpdateProfileTabType;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A06 = z2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        return new C46794DlT(context, new ONT(userSession), this.A01, userSession, this.A04, this.A03, this.A05, this.A06);
    }
}
