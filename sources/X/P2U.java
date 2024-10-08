package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

public final class P2U implements C74394PuA {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final N4P A02;
    public final Context A03;

    public P2U(Context context, FragmentActivity fragmentActivity, UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = n4p;
    }

    public final List getItems() {
        Context context = this.A03;
        C46448DfA dfA = new C46448DfA((CharSequence) context.getString(2131958916));
        if (!C51965G9l.A1a(0Tu.A06, this.A01, 36318389483870314L)) {
            dfA = null;
        }
        Object[] objArr = {dfA, new C50989Fmc(context, (View.OnClickListener) new FP8((Object) this, 33), 2131958974)};
        0qQ.A0B(objArr, 0);
        return 03t.A0I(objArr);
    }

    public final boolean isEnabled() {
        N4P n4p = this.A02;
        C254793t3 r0 = n4p.A0L;
        0qQ.A0B(r0, 0);
        if ((r0 instanceof MsysThreadId) || n4p.A0m) {
            return true;
        }
        return false;
    }
}
