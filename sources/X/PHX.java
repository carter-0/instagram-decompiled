package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class PHX implements C66491MTu {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public PHX(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void D1x(Context context) {
        FragmentActivity A06;
        if (this.A00 != 0) {
            0qQ.A0B(context, 0);
            O36.A00(context, DbS.A0O(this.A03), (UserSession) this.A02, "reply_modal", (String) null, AnonymousClass7TE.A1I(this.A01));
            return;
        }
        String str = this.A03;
        if (str == null) {
            C69997Nvb.A00().A00((Context) this.A01, OYQ.A00, "all");
        } else if (1pE.A18 != null && (A06 = 2MD.A01().A06()) != null) {
            1pE A012 = 1pE.A01(A06, OYQ.A00, (UserSession) this.A02, "banner");
            A012.A0A(str);
            A012.A06();
        }
    }

    public final void onDismiss() {
    }
}
