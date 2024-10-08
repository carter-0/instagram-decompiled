package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FOI implements View.OnClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass70J A04;
    public final /* synthetic */ User A05;

    public FOI(TextView textView, AnonymousClass0iw r2, UserSession userSession, 1Xj r4, AnonymousClass70J r5, User user) {
        this.A04 = r5;
        this.A00 = textView;
        this.A05 = user;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int i;
        int A052 = AnonymousClass0fD.A05(-1848831294);
        AnonymousClass70J r5 = this.A04;
        if (r5 != null) {
            String A0y = DbV.A0y(this.A00);
            if (A0y.length() == 0) {
                i = 803871634;
                AnonymousClass0fD.A0C(i, A052);
            }
            User user = this.A05;
            long parseLong = Long.parseLong(user.getId());
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A01, this.A02), C273654mx.A00(2877));
            A0e.A9F("authorid", Long.valueOf(parseLong));
            A0e.AAJ(C273654mx.A00(2981), A0y);
            A0e.AAJ("link_type", "profile");
            A0e.Cgf();
            r5.A02().A0C(this.A03, user, "user_profile_header");
        }
        i = 651647782;
        AnonymousClass0fD.A0C(i, A052);
    }
}
