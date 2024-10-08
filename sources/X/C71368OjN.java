package X;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.OjN  reason: case insensitive filesystem */
public final class C71368OjN implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public C71368OjN(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj2;
        this.A03 = obj;
        this.A02 = obj4;
        this.A05 = str;
        this.A06 = z;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A05(-102015967);
                UserSession userSession = (UserSession) this.A04;
                Activity activity = (Activity) this.A01;
                boolean z = this.A06;
                Object obj = this.A02;
                Object obj2 = this.A03;
                User A0j = DbV.A0j(userSession, this.A05);
                if (A0j != null) {
                    C358248ab A0X = DbS.A0X(activity);
                    A0X.A05 = DbY.A0b(activity, A0j, 2131968596);
                    A0X.A08(2131968593);
                    A0X.A0r(true);
                    A0X.A0s(true);
                    A0X.A0K(new I8R(0, activity, A0j, userSession, obj2, obj, z), 2131968594);
                    A0X.A0H(C71230Ofv.A00, 2131968595);
                    DbT.A1V(A0X);
                }
                C3018660j.A01(userSession).A0B(C69506Nmo.A0I);
                i = 351335757;
                break;
            case 1:
                i2 = AnonymousClass0fD.A05(-1501391471);
                OFB ofb = (OFB) this.A04;
                UserSession userSession2 = ofb.A02;
                N8G n8g = (N8G) this.A02;
                new P8J(ofb.A00, (AnonymousClass0iw) this.A01, userSession2).A00((Uri) this.A03, n8g.A01, this.A05, n8g.A02, this.A06);
                i = 1206123602;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0C(i, i2);
    }
}
