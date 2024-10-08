package X;

import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ol3  reason: case insensitive filesystem */
public final class C71462Ol3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C72343P2i A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C71462Ol3(C72343P2i p2i, String str, boolean z) {
        this.A02 = z;
        this.A00 = p2i;
        this.A01 = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A02) {
            UserSession userSession = this.A00.A01;
            String str = this.A01;
            0qQ.A0B(str, 1);
            1Ou A012 = 1Ou.A01(userSession);
            C66665MaY A08 = C66669Mac.A08(userSession, AnonymousClass1hy.class);
            0qQ.A0B(A08, 1);
            1OS r0 = new 1OS(A08);
            r0.A00 = str;
            r0.A01 = z;
            A012.A0A(r0);
        } else if (z) {
            C72343P2i p2i = this.A00;
            0qQ.A0A(compoundButton);
            C358248ab A0X = DbS.A0X(p2i.A00);
            A0X.A09(2131959047);
            A0X.A08(2131959046);
            A0X.A0J(C71249OgE.A00(p2i, 43), 2131959044);
            A0X.A0H(C71216Ofh.A00, 2131959045);
            A0X.A0r(true);
            A0X.A0s(true);
            C71252OgJ.A00(A0X, compoundButton, 8);
            DbT.A1V(A0X);
        }
    }
}
