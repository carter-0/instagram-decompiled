package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.user.model.User;

/* renamed from: X.FIm  reason: case insensitive filesystem */
public final class C50001FIm implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass70G A01;
    public final /* synthetic */ C319896rP A02;
    public final /* synthetic */ C323276xE A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ CharSequence[] A05;

    public C50001FIm(Context context, AnonymousClass70G r2, C319896rP r3, C323276xE r4, User user, CharSequence[] charSequenceArr) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = user;
        this.A02 = r3;
        this.A05 = charSequenceArr;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CharSequence[] charSequenceArr = this.A05;
        CharSequence charSequence = charSequenceArr[i];
        Context context = this.A00;
        if (0qQ.A0K(charSequence, context.getString(2131952341))) {
            C323276xE.A01(UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_PROFILE_PICTURE_TAB, this.A03);
        } else if (0qQ.A0K(charSequenceArr[i], context.getString(2131952405))) {
            C323276xE r3 = this.A03;
            C323276xE.A02(this.A01, this.A02, r3, this.A04);
        } else {
            throw AnonymousClass7TE.A1B("Dialog option not supported");
        }
    }
}
