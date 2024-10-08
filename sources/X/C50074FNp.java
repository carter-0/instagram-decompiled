package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FNp  reason: case insensitive filesystem */
public final class C50074FNp implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ODN A02;
    public final /* synthetic */ String A03;

    public C50074FNp(FragmentActivity fragmentActivity, UserSession userSession, ODN odn, String str) {
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = odn;
        this.A00 = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-8115406);
        UserSession userSession = this.A01;
        AnonymousClass7I3.A01((C69503Nml) null, XSV.A05, new AnonymousClass7I3(userSession), this.A03, 9);
        ODN odn = this.A02;
        odn.A01.markerStart(814288692, odn.A00);
        FragmentActivity fragmentActivity = this.A00;
        J6W j6w = new J6W(39, fragmentActivity, userSession, odn);
        AnonymousClass9B9.A00();
        AnonymousClass9BA.A00(userSession).A01(fragmentActivity, new C50369FaU(fragmentActivity, j6w));
        AnonymousClass0fD.A0C(-816843785, A05);
    }
}
