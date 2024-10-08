package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class FIL implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ FIL(Fragment fragment, UserSession userSession, Integer num) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = num;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        F5v.A01(this.A00, this.A01, this.A02);
    }
}
