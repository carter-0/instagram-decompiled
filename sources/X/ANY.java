package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

public final class ANY implements View.OnClickListener {
    public final /* synthetic */ A7C A00;
    public final /* synthetic */ String A01;

    public ANY(A7C a7c, String str) {
        this.A00 = a7c;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.OKm, java.lang.Object] */
    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1825230254);
        A7C a7c = this.A00;
        a7c.A01 = null;
        ViewGroup viewGroup = a7c.A00;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        A5Q a5q = a7c.A04;
        String str = this.A01;
        C329067Hl r4 = a5q.A00;
        String str2 = a5q.A01;
        C331697Sa r3 = r4.A1i;
        EnumEntries enumEntries = AnonymousClass5FV.A07;
        ? obj = new Object();
        obj.A00 = 3;
        obj.A01 = null;
        obj.A02 = null;
        r3.A06(obj, str, (String) null);
        UserSession userSession = r4.A1Z;
        C3726091o r5 = new C3726091o(r4.A1X, userSession);
        String A0E = C329067Hl.A0E(r4);
        if (A0E != null) {
            r5.A02("dm", "power_up_bubble", str2, Long.parseLong(A0E), Long.parseLong(userSession.A06));
        }
        AnonymousClass0fD.A0C(625228336, A05);
    }
}
