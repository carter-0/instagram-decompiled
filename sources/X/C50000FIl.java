package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;

/* renamed from: X.FIl  reason: case insensitive filesystem */
public final class C50000FIl implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C50000FIl(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C11225SFz sFz;
        switch (this.A00) {
            case 0:
                AnonymousClass73V.A0B((0wc) this.A01, (User) this.A02, "approval_page_cancel", this.A03, this.A05, this.A04);
                return;
            case 1:
                C3265677h.A0R((AnonymousClass0iw) this.A01, (UserSession) this.A02, "unsupported_dialog_ok_click", this.A03, this.A04, this.A05);
                return;
            case 2:
                String str = this.A03;
                boolean equalsIgnoreCase = "report_problem".equalsIgnoreCase(str);
                if ("open_challenge".equalsIgnoreCase(str) || equalsIgnoreCase) {
                    String str2 = this.A05;
                    1NY A0a = AnonymousClass7TG.A0a((0lg) this.A01);
                    A0a.A0A(str2);
                    A0a.A0O((15p) null, 1XP.class, 1XY.class, false);
                    1ES.A03(DbW.A0K(A0a));
                    if (equalsIgnoreCase) {
                        C59689JTv.A01(DbT.A07(this.A02), (String) null, 2131962389, 0);
                        return;
                    }
                    return;
                }
                boolean equalsIgnoreCase2 = "open_request_form".equalsIgnoreCase(str);
                C49906FEe fEe = SimpleWebViewActivity.A02;
                Context A07 = DbT.A07(this.A02);
                0qQ.A0A(A07);
                0lg r2 = (0lg) this.A01;
                String str3 = this.A05;
                if (!equalsIgnoreCase2) {
                    sFz = new C11225SFz(str3);
                    sFz.A02 = this.A04;
                }
                fEe.A02(A07, r2, new SimpleWebViewConfig(sFz));
                return;
            default:
                dialogInterface.dismiss();
                EEM eem = (EEM) this.A01;
                CallerContext callerContext = EEM.A0B;
                eem.A0A(C2612848z.A00, C257443xP.A01("login_continue_button"), eem.A08, this.A04, this.A03, this.A05, ((Ez0) this.A02).A01);
                return;
        }
    }
}
