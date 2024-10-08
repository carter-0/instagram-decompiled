package X;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.List;
import org.json.JSONObject;

public final class GML implements C246853fL {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final JR9 A03;

    public final void CzB(SocialContextType socialContextType, int i, long j) {
        0qQ.A0B(socialContextType, 0);
        this.A03.CzC(socialContextType, this.A00, this.A01, i, j);
    }

    public final void D1C(String str, String str2, boolean z, String str3) {
        1Xj r4 = this.A00.A02;
        if (r4 != null) {
            UserSession userSession = this.A02;
            AnonymousClass1Nd.A00(userSession).A00(new C240343Kn(userSession, r4, this.A01.A0E, str3, str, str2, true));
        }
    }

    public final void D4e(String str, String str2, boolean z) {
    }

    public final void DG5(SocialContextType socialContextType, String str, int i, long j) {
        0qQ.A0B(socialContextType, 2);
        this.A03.DG6(socialContextType, this.A00, this.A01, str, i, j);
    }

    public final void DIf(String str) {
        1Xj r4 = this.A00.A02;
        if (r4 != null) {
            1Ng A002 = AnonymousClass1Nd.A00(this.A02);
            String lowerCase = str.toLowerCase();
            0qQ.A07(lowerCase);
            A002.A00(new C240323Kl((ClickableSpan) null, (View) null, r4, lowerCase, false));
        }
    }

    public final void DPG(FragmentActivity fragmentActivity, AnonymousClass0iw r15, UserSession userSession, C54693HOy hOy, long j) {
        C54693HOy hOy2 = hOy;
        0qQ.A0B(hOy2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        0qQ.A0B(r15, 3);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity, 4);
        int ordinal = hOy2.ordinal();
        if (ordinal == 2) {
            DbU.A0w(fragmentActivity, C51973G9u.A0A(userSession2, C46548Dgp.A01(userSession2, String.valueOf(j), "clips_social_context_bubble_long_press", r15.getModuleName())), userSession2, ModalActivity.class, "profile");
        } else if (ordinal == 3) {
            User A022 = 17h.A00(userSession2).A02(String.valueOf(j));
            if (A022 != null) {
                1Z4.A00.A00(fragmentActivity2, fragmentActivity, userSession2, A022, (G8B) null, r15.getModuleName(), (String) null, A022.getUsername());
            }
        } else if (ordinal == 4) {
            User A023 = 17h.A00(userSession2).A02(String.valueOf(j));
            if (A023 != null) {
                FragmentActivity fragmentActivity3 = fragmentActivity;
                C49960FGs.A04(fragmentActivity3, userSession2, new C16365Uti(1), A023, AnonymousClass000.A00(4018), r15.getModuleName(), (JSONObject) null, false);
            }
        } else if (ordinal == 0) {
            C52114GFi.A00();
            FC7.A02(fragmentActivity, userSession2, (String) null, "383582548001955", false);
        } else if (ordinal == 1) {
            FragmentActivity fragmentActivity4 = fragmentActivity;
            C327927Ct.A01(fragmentActivity4, userSession2, "Friendly Viewer Launchers", AnonymousClass000.A00(2114), C52114GFi.A00(), C58315Ipw.A00);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final void Ddz(SocialContextType socialContextType, int i, long j) {
        0qQ.A0B(socialContextType, 2);
        this.A03.De0(socialContextType, this.A00, this.A01, i, j);
    }

    public final void Dlf(SocialContextType socialContextType, List list) {
        0qQ.A0B(socialContextType, 1);
        this.A03.Dlg(socialContextType, this.A00, this.A01, list);
    }

    public final void Dqx() {
    }

    public final void DwK(String str) {
        1Xj r4 = this.A00.A02;
        if (r4 != null) {
            AnonymousClass1Nd.A00(this.A02).A00(new C240303Kj((ClickableSpan) null, (View) null, r4, AnonymousClass7TF.A0j(str), false));
        }
    }

    public final 2WX B57() {
        return 2WX.A02;
    }

    public final void D4v(long j, int i, String str) {
        String str2 = str;
        this.A03.D4w(this.A00, this.A01, str2, i, j);
    }

    public final void DNa(long j, int i, boolean z) {
        this.A03.DNb(this.A00, this.A01, i, j, z);
    }

    public final void DwQ(long j, int i) {
        this.A03.DwR(this.A00, this.A01, i, j);
    }

    public GML(C267324bN r1, C52058GDe gDe, UserSession userSession, JR9 jr9) {
        this.A03 = jr9;
        this.A00 = r1;
        this.A01 = gDe;
        this.A02 = userSession;
    }

    public final 2WX ApP(String str) {
        return 2WX.A02;
    }
}
