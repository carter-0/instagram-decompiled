package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class FIO implements DialogInterface.OnClickListener {
    public final /* synthetic */ C2365134a A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ CharSequence[] A02;

    public FIO(C2365134a r1, Reel reel, CharSequence[] charSequenceArr) {
        this.A00 = r1;
        this.A01 = reel;
        this.A02 = charSequenceArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CharSequence[] charSequenceArr = this.A02;
        CharSequence charSequence = charSequenceArr[i];
        C2365134a r3 = this.A00;
        Context context = r3.A0C;
        if (0qQ.A0K(charSequence, context.getString(2131952420))) {
            UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB;
            UserSession userSession = r3.A0F;
            DbU.A1I(r3.A0D, C48367EdO.A00(updateProfilePicturePagerAdapter$UpdateProfileTabType, userSession, "ig_self_profile", false, true, false), DbW.A0T(userSession));
        } else if (0qQ.A0K(charSequenceArr[i], context.getString(2131952421))) {
            C2365134a.A04(r3, this.A01.A0a());
        } else {
            throw AnonymousClass7TE.A1B("Dialog option not supported");
        }
    }
}
