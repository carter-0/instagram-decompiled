package X;

import android.content.DialogInterface;
import com.instagram.mainactivity.InstagramMainActivity;

public final class FI7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public FI7(1Xj r1, InstagramMainActivity instagramMainActivity) {
        this.A01 = instagramMainActivity;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        InstagramMainActivity.A0P(this.A00, this.A01, EZC.valueOf("USER_DISMISSED_POST_FRICTION_DIALOG").ordinal());
        dialogInterface.dismiss();
    }
}
