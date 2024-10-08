package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;

public final class FI0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public FI0(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, this.A01);
            A0Q.A0D(new DirectMessagesOptionsFragment());
            A0Q.A04();
        }
    }
}
