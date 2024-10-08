package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

public final class AK2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C359318cb A00;

    public AK2(C359318cb r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C49906FEe fEe = SimpleWebViewActivity.A02;
        C359318cb r0 = this.A00;
        Context context = r0.A0S;
        UserSession userSession = r0.A0b;
        C11225SFz sFz = new C11225SFz(AnonymousClass000.A00(16));
        sFz.A02 = context.getString(2131964884);
        fEe.A02(context, userSession, new SimpleWebViewConfig(sFz));
    }
}
