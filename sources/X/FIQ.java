package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.profile.fragment.UserDetailFragment;

public final /* synthetic */ class FIQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserDetailFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ FIQ(Context context, UserDetailFragment userDetailFragment, String str) {
        this.A01 = userDetailFragment;
        this.A00 = context;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserDetailFragment userDetailFragment = this.A01;
        Context context = this.A00;
        Dba.A0q(context, userDetailFragment.A0I, new C11225SFz(SQU.A01(context, "https://help.instagram.com/1338860172903668")), this.A02);
    }
}
