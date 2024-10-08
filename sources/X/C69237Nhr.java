package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.Nhr  reason: case insensitive filesystem */
public final class C69237Nhr extends C51086FoG {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C231002qi A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C69237Nhr(FragmentActivity fragmentActivity, UserSession userSession, C231002qi r3, String str, String str2, String str3, boolean z, boolean z2) {
        this.A06 = z;
        this.A01 = userSession;
        this.A05 = str;
        this.A07 = z2;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = fragmentActivity;
        this.A02 = r3;
    }

    public final void Do0(String str, String str2, String str3) {
        String str4;
        if (this.A06) {
            C313756gx A002 = C313746gw.A00(this.A01);
            User user = new User(this.A05, (String) null);
            boolean z = this.A07;
            String str5 = this.A03;
            String str6 = this.A04;
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                if (str2 == null) {
                    str2 = "";
                }
                A1E.put("error_message", str2);
                if (str3 == null) {
                    str3 = "";
                }
                A1E.put(TraceFieldType.ErrorCode, str3);
                if (z) {
                    str4 = "thread_details_people";
                } else {
                    str4 = "thread_details";
                }
                A0J.A0h(DbV.A0q(user.getId()));
                Dba.A1D(A0J, "report_thread_error");
                A0J.A0p("report_button");
                A0J.A0q(str4);
                JTQ.A1C(A0J, C66583MXo.A0e(A0J, "broadcast", str5, str6), A1E);
            }
        }
    }

    public final void Do1(String str) {
        String str2;
        String str3;
        if (this.A06) {
            C313756gx A002 = C313746gw.A00(this.A01);
            User user = new User(this.A05, (String) null);
            boolean z = this.A07;
            String str4 = this.A03;
            String str5 = this.A04;
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                if (z) {
                    str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                } else {
                    str2 = "report_icon";
                }
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("entrypoint", str2);
                if (z) {
                    str3 = "thread_details_people";
                } else {
                    str3 = "thread_details";
                }
                A0J.A0h(DbV.A0q(user.getId()));
                Dba.A1D(A0J, "report_thread_success");
                A0J.A0p("report_button");
                A0J.A0q(str3);
                JTQ.A1C(A0J, C66583MXo.A0e(A0J, "broadcast", str4, str5), A1E);
            }
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        String str6 = this.A03;
        if (1Wj.A00 != null) {
            DcL.A00().A00(fragmentActivity, userSession, "1033851281145597", C70342O2u.A00(str6));
        }
        C231002qi r1 = this.A02;
        if (r1 != null) {
            r1.AVg(JTP.A0y(Trigger.A17));
        }
    }
}
